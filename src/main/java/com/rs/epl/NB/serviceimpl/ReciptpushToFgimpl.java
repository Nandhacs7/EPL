package com.rs.epl.NB.serviceimpl;

//import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
//import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
//import java.util.List;
//import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;
//import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fa.component.policy.EPL_STATUS;
import com.fa.component.policy.Payment;
import com.fa.component.policy.Policy;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO;
//import com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO;
//import com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgReceiptVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgResponseVO;
//import com.firstapex.rs.acnt.webservices.receiptInterface.FirstGenReceiptCreationService;
import com.firstapex.rs.acnt.webservices.receiptInterface.FirstGenReceiptCreationServiceLocator;
//import com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType;
import com.firstapex.rs.epl.NB.common.ENEplProperties;
import com.rs.epl.NB.oementity.FristgenErrors;
//import com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO;
import com.rs.epl.NB.oemrepository.Policyinfo;
import com.rs.epl.NB.policyrepository.FgError;
import com.rs.epl.NB.policyrepository.Status;
import com.rs.epl.NB.service.ReciptPushToFg;

@Service
public class ReciptpushToFgimpl implements ReciptPushToFg {
//	@Resource
//	PolicyRepository polrepo;
	
	@Resource
	public  Policyinfo  Omepolicyrepo2;
	
//    @Resource
//    ReceiptFaStatusRepository receiptFaStatusRepo;
    
    @Resource
    FgError FGErrorDetails;
    
    FgResponseVO fgResponseVo=null;
    
    String str2=null;
    String str4=null;

    protected final Logger logger = Logger.getLogger(getClass());
	@Override
	public String ReciptpushToFg(Policy pol,Status sts) throws JAXBException, FileNotFoundException, IOException {
		
//		TtrnPolicy OmePolicy2=Omepolicyrepo2.findOne(polno);
//		try{
//			if(OmePolicy2.getWebserviceStatus().equalsIgnoreCase("Retry With Valid Data")){
//				return;
//			}
//		}
//		catch (Exception e) {
//			
//		}
//		Policy pol=polrepo.findBypolno(polno);
		String status=null;
		EPL_STATUS recstatus=new EPL_STATUS();
		Set<Payment> paymentSet=pol.getPayments();
		Iterator<Payment> paymentIterator = paymentSet.iterator();
		Payment payment = paymentIterator.next();
		Long pid=payment.getId();
		Long polid=pol.getPolid();
		String Str5=null;
//		ReceiptFaStatus recstat=receiptFaStatusRepo.findBypolicyNo(polno);
		  try {		 
			if(!pol.getSETTLEMENT_TYPE().equalsIgnoreCase("CD")){
				FgReceiptVO fgReceiptVO = createFgReceiptVo(payment, pol.getAgentcode(),
						pol.getProductcode(), pol.getBranchcode(),pol);
				ReciptObjToXml recObjxml=new ReciptObjToXml();
				StringWriter Reciptxml=recObjxml.policyobjtoXML(fgReceiptVO);
				 Str5=Reciptxml.toString();
				logger.info(Str5);
				 fgResponseVo = pushToFG(fgReceiptVO,Str5,pid,polid,pol);
                ReciptToXml outputxml=new ReciptToXml();
                StringWriter responseXML1=null;
                String responseXML=null;
                if(fgResponseVo!=null){               	
                 responseXML1=outputxml.Recipttoxml(fgResponseVo);
                 responseXML=responseXML1.toString();      
                 logger.info(responseXML);
                
               String   state=commonstatus(recstatus,Str5,fgResponseVo,pol,status);
                  status=state;
		              
		              if(null!=fgResponseVo.getStatus() && fgResponseVo.getStatus().equalsIgnoreCase("FAIL")){
		            	  failstatus(recstatus,fgResponseVo,pol,responseXML);
		              }else if(null == fgResponseVo.getStatus()){
		            	  recstatus.setReceipt_responsexml("N/A");
		              }
		              
		              sts.save(recstatus);                 
                }
             } else{
            	 Omepolicyrepo2.Upatestatus("CD Mode Payment", "N/A", "N/A","N/A","N/A", pol.getPolno());
             }
	  }
			catch (Exception e) {				
				commonstatus(recstatus,Str5,fgResponseVo,pol,status);
				recstatus.setReceipt_errordetails(e.toString()+" From OEM Receipt Module");
                
                StringWriter errors = new StringWriter();
                
               e.printStackTrace(new PrintWriter(errors));
                
               String err =errors.toString();
               
					recstatus.setReceipt_requestxml(err);
				     recstatus.setReceipt_responsexml("N/A");
				     sts.save(recstatus);
            	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            	Date today = Calendar.getInstance().getTime();        
            	String reportDate = df.format(today);
                Omepolicyrepo2.Upatestatus("Retry Receipt With Valid Data", e.getMessage(), reportDate,"Receipt Fail","N", pol.getPolno());
			}
		  return status;
	}
	private String commonstatus(EPL_STATUS recstatus, String str5, FgResponseVO fgResponseVo2, Policy pol, String status) {
 
		recstatus.setPolicyno(pol.getPolno());
		
		recstatus.setReceiptno(pol.getPayments().iterator().next().getCBC());
		
		recstatus.setPolicyid(String.valueOf(pol.getPolid()));
		
		recstatus.setReceiptid(String.valueOf(pol.getPayments().iterator().next().getId()));
				
		recstatus.setReceipt_requestxml(str5);
				
		recstatus.setReceipt_responsexml("N/A");
				
		recstatus.setReceipt_errordetails("N/A");
				
		recstatus.setReceipt_attempt_time(new Date());
		
		recstatus.setProductcode(pol.getProductcode());
		
		recstatus.setProductid(pol.getProductid());
		
		recstatus.setMfgcode(pol.getMfgcode());
		
		recstatus.setMfgname(pol.getMfgname());
		
		recstatus.setTransctiontype(pol.getTransactiontype());
		
		recstatus.setFromsysystem("OEM");
		
		if(null!=fgResponseVo2 && null!=fgResponseVo2.getStatus() &&
				fgResponseVo2.getStatus().equalsIgnoreCase("SUCCESS")){
        	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
          	Date today = Calendar.getInstance().getTime();        
          	String reportDate = df.format(today);
          	status="SUCCESS";
	  Omepolicyrepo2.Upatestatus("SUCCESS", "N/A", reportDate,"N/A","N/A", pol.getPolno());
		recstatus.setReceipt_status("SUCCESS");
	}else{		
		status="FAIL";
		recstatus.setReceipt_status("FAIL");
		recstatus.setPolicy_status("Receipt Fail");
	}
		return status;	
  }
	private void failstatus(EPL_STATUS recstatus, FgResponseVO fgResponseVo2, Policy pol, String responseXML) {		
		recstatus.setReceipt_responsexml(responseXML);
        if(responseXML.toLowerCase().contains("<errorDetailVOList>".toLowerCase())){
         	 str2= responseXML.substring(responseXML.lastIndexOf("<errorCode>") , responseXML.lastIndexOf("</errorCode>"));            
         	str2=str2.replaceAll("<errorCode>", "");                	
         }else if(responseXML.toLowerCase().contains("<XSD_AUX_NC>".toLowerCase())){
         	 str2= responseXML.substring(responseXML.lastIndexOf("<XSD_AUX_NC>") , responseXML.lastIndexOf("</XSD_AUX_NC>"));
         	 str4=str2.replaceAll("<XSD_AUX_NC>", "");
         }
		String errordesc=null;
      	
        if(responseXML.toLowerCase().contains("<errorDetailVOList>".toLowerCase())){
        	String str3= responseXML.substring(responseXML.lastIndexOf("<errorDesc>") , responseXML.lastIndexOf("</errorDesc>"));            
        	errordesc=(str3.replaceAll("<errorDesc>", ""));     
        	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        	Date today = Calendar.getInstance().getTime();        
        	String reportDate = df.format(today);
        	recstatus.setReceipt_errordetails(errordesc);
        	Omepolicyrepo2.Upatestatus("FAIL", errordesc, reportDate,"Receipt Fail","N",pol.getPolno());
        }else if(responseXML.toLowerCase().contains("<XSD_AUX_NC>".toLowerCase())){
            if(str2.contains(" | ")){
            String [] erercodes=str2.split(" | ");
            List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
            list.removeAll(Collections.singleton("|"));
            erercodes=list.toArray(new String[0]);
            StringBuilder completeError = new StringBuilder();
            for(String error:erercodes){
            	FristgenErrors errdetails=FGErrorDetails.findOne(error);
            	String details=null;
            	String code=null;                        		
            	if(null!=errdetails){
                   	 details=errdetails.getErrorDetails();
                	 code=errdetails.getErrorcode();  
            	}else{
                  	 details="N/A";
               	     code="N/A";
            	}
            	completeError.append(code+"========>"+details+"\r\n ");
            }
            errordesc=completeError.toString();
        	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        	Date today = Calendar.getInstance().getTime();        
        	String reportDate = df.format(today); 
        	recstatus.setReceipt_errordetails(errordesc);
        	Omepolicyrepo2.Upatestatus("FAIL", errordesc, reportDate,"Receipt Fail","N",pol.getPolno());
            }else{ 
            	FristgenErrors errdetails=FGErrorDetails.findOne(str4);
            	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            	Date today = Calendar.getInstance().getTime();        
            	String reportDate = df.format(today);
            	String erdetails=null;
            	if(null!=errdetails){
            		erdetails= errdetails.getErrorDetails();
            	}else{
            		erdetails="N/A";
            		
            	}
            	recstatus.setReceipt_errordetails(erdetails);
            	Omepolicyrepo2.Upatestatus("FAIL", erdetails, reportDate,"Receipt Fail","N",pol.getPolno());
            }  
        }
		
      }
     
	private FgReceiptVO createFgReceiptVo(Payment payment, String agentcode, String productcode, String branchcode, Policy pol) throws FileNotFoundException, IOException {
		ENEplProperties prop = ENEplProperties.getEnEplProperties();
        FgReceiptVO fgReceiptVo = new FgReceiptVO();
        fgReceiptVo.setOperatorId(prop.getOperatorid());
        fgReceiptVo.setVoucherAccountCode(agentcode);
        fgReceiptVo.setVoucherProductCode(productcode);
        fgReceiptVo.setVoucherReference(payment.getCBC());
        fgReceiptVo.setVoucherTheirReferenceNumber(pol.getPolno());
        fgReceiptVo.setVoucherParticulars(pol.getPolicyclient().getFirstname());
        fgReceiptVo.setVoucherReason("RECT");
        fgReceiptVo.setVoucherSource("RECT");
        fgReceiptVo.setVoucherSuspenseBranch(branchcode);
        if (payment.getPaymenttype().equalsIgnoreCase("CHQ")) {
            FgChequeVO fgChequeVo = new FgChequeVO();
            fgChequeVo.setDepositBank(payment.getDepositingBankCode());
            fgChequeVo.setChequeCurrency("INR");
            fgChequeVo.setChequeAmount(new BigDecimal(payment.getPaymentamount()));
            fgChequeVo.setChequeCharges(new BigDecimal(0));
            fgChequeVo.setChequeNumber(payment.getInstrumentnumber());
            fgChequeVo.setChequeDraweeBank(payment.getInstrumentbank());
            fgChequeVo.setChequeDraweeBankName(payment.getInstrumentbank());
            // fgChequeVo.setChequeDraweeBankName(payment.getInstrumentbank());
            fgChequeVo.setChequeDate(payment.getPaymentdate());
            fgChequeVo.setChequeOverseas("N");
            FgChequeVO[] fgchq={fgChequeVo};
            fgReceiptVo.setChequeVOList(fgchq);
        }
        else if (payment.getPaymenttype().equalsIgnoreCase("Card")){
            FgCreditCardVO fgCreditVo = new FgCreditCardVO();
            fgCreditVo.setDepositBank(payment.getDepositingBankCode());
            fgCreditVo.setCardCurrency("INR");
            fgCreditVo.setCardAmount(new BigDecimal(payment.getPaymentamount()));
            fgCreditVo.setCardNumber(payment.getInstrumentnumber());
            fgCreditVo.setCardCompany(payment.getInstrumentbank());
            String str=payment.getInstrumentexpdt();
            String ramn=str.substring(3).replaceAll("/", "");
            ramn.replaceAll("-", "");
            fgCreditVo.setCardExpiryDate(ramn);//"042018"
            fgCreditVo.setCardType(payment.getInstrumenttype());
            fgCreditVo.setTransactionNumber(payment.getTRANSCATION_NO());
            FgCreditCardVO[] fgcredit={fgCreditVo};
            fgReceiptVo.setCreditCardVOList(fgcredit);
        }else {
        	try {
        		FgBankDebitVO bankdebit=new FgBankDebitVO();
        		bankdebit.setAccountHolderName(payment.getPayeename());
        		bankdebit.setBankDebitAmount(new BigDecimal(payment.getPaymentamount()));
        		bankdebit.setBankDebitCharges(new BigDecimal(0));
        		bankdebit.setBankDebitCurrency("INR");
        		bankdebit.setDepositBank(payment.getDepositingBankCode());
        		bankdebit.setIFSCCode(payment.getIfsccode());        			
        		bankdebit.setMICRCode(payment.getMicrcode());        			
        		bankdebit.setTransactionNumber(payment.getTRANSCATION_NO());
        		FgBankDebitVO[] fgdebitVos={bankdebit};
        		fgReceiptVo.setBankDebitVOList(fgdebitVos);
			} catch (Exception e) {
				
			}
        }
		return fgReceiptVo;
	}

    public FgResponseVO pushToFG(FgReceiptVO fgReceiptVO, String str5, Long pid, Long polid, Policy pol) {
    	FgResponseVO fgResponseVo1 = null;
    	FirstGenReceiptCreationServiceLocator loc = new FirstGenReceiptCreationServiceLocator();
    	try {
			fgResponseVo1= loc.getReceiptCreationSoapBinding().performReceiptCreation(fgReceiptVO);
		} catch (RemoteException | ServiceException e) {
			logger.info(e.getMessage()+" From Recipt Module");
			e.printStackTrace();
		}
		return fgResponseVo1;
    }
   }

//public StringWriter responseToXML(FgResponseVO respVo) throws JAXBException {
//	JAXBContext jcontext=JAXBContext.newInstance(FgReceiptVO.class);
//	 Marshaller marshaller = jcontext.createMarshaller();
//	 StringWriter Writer=new StringWriter();
//	 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//	 marshaller.marshal(respVo,Writer);
//	 System.out.println(Writer.toString());
   
//  StringBuffer responseBuffer = new StringBuffer();
//  String errorCodes="";
//  responseBuffer.append("<PolicyReceiptVo>");
//  responseBuffer.append("<status>" + respVo.getStatus() + "</status>");
//  responseBuffer.append("<voucherNumber>" + respVo.getVoucherNumber() + "</voucherNumber>");
//  responseBuffer
//          .append("<openingBalance>" + respVo.getOpeningBalance() + "</openingBalance>");
//  responseBuffer
//          .append("<closingBalance>" + respVo.getClosingBalance() + "</closingBalance>");
//
//  List<ErrorDetailVO> errDtlsList = respVo.getErrorDetailVOList();
//  responseBuffer.append("<errorList>"
//          + ((errDtlsList != null) ? respVo.getErrorDetailVOList().size() : "NULL")
//          + "</errorList>");
//  if (errDtlsList != null && errDtlsList.size() > 0) {
//      responseBuffer.append("<ErrorDetails>");
//      for (ErrorDetailVO errDtl : errDtlsList) {
//          responseBuffer.append("<ErrorDetail>");
//          responseBuffer.append("<ErrorCode>" + errDtl.getErrorCode() + "</ErrorCode>");
//          errorCodes+=errDtl.getErrorCode()+"|";
//          responseBuffer.append("<ErrorDesc>" + errDtl.getErrorDesc() + "</ErrorDesc>");
//          responseBuffer.append("</ErrorDetail>");
//      }
//  }
//  responseBuffer.append("</ErrorDetails>");
//  if(respVo.getXSDAUXNC()!=null){
//  	responseBuffer.append("<XSDAUXNC>"+respVo.getXSDAUXNC()+"</XSDAUXNC>");
//  	errorCodes+=respVo.getXSDAUXNC();
//  }
//  if("SUCCESS".equalsIgnoreCase(respVo.getStatus())){
//  	errorCodes+=respVo.getStatus();
//  }
//  responseBuffer.append("<errors>"+errorCodes+"</errors>");
//  responseBuffer.append("</PolicyReceiptVo>");
//  System.out.println("Response Buffer : " + responseBuffer);
//  logger.info("responseBuffer.toString() : " + responseBuffer.toString());
//  return responseBuffer.toString();
//	 return Writer;

//		  ReceiptFaStatus recFAstatus = new ReceiptFaStatus();
//          recFAstatus.setAttemptTime(new Date());
//          recFAstatus.setPaymentId(Long.toString(pid));
//          recFAstatus.setPolicyId(Long.toString(polid));
//          recFAstatus.setPolicyNo(pol.getPolno());
//          recFAstatus.setNoofattempts(1);
//          recFAstatus.setProductCode(pol.getProductcode());
//          recFAstatus.setINPUTRECIPT(Str5);
//          recFAstatus.setProductId(pol.getProductid());
//          recFAstatus.setMfgcode(pol.getMfgcode());
//          recFAstatus.setMfgname(pol.getMfgname());
//          recFAstatus.setReceiptNo(payment.getCBC());
//          recFAstatus.setFromsystem("OEM");
//          
//           status=fgResponseVo.getStatus();
//           
//          recFAstatus.setStatus(status);
//          if(responseXML.toLowerCase().contains("<errorDetailVOList>".toLowerCase())){
//          	 str2= responseXML.substring(responseXML.lastIndexOf("<errorCode>") , responseXML.lastIndexOf("</errorCode>"));            
//          	recFAstatus.setErrorcode(str2.replaceAll("<errorCode>", ""));                	
//          }else if(responseXML.toLowerCase().contains("<XSD_AUX_NC>".toLowerCase())){
//          	 str2= responseXML.substring(responseXML.lastIndexOf("<XSD_AUX_NC>") , responseXML.lastIndexOf("</XSD_AUX_NC>"));
//          	 str4=str2.replaceAll("<XSD_AUX_NC>", "");
//          	recFAstatus.setErrorcode(str4);
//          }else if(responseXML.toLowerCase().contains("SUCCESS".toLowerCase())){
//          	recFAstatus.setErrorcode("N/A");
//          }
//          recFAstatus.setResponse(responseXML);
//          try {
//          	receiptFaStatusRepo.save(recFAstatus);
//				
//			} catch (Exception e) {
//				try {						
//					receiptFaStatusRepo.save(recFAstatus);
//				} catch (Exception e2) {
//					receiptFaStatusRepo.save(recFAstatus);
//				}
//				
//			}
//          if(status.equalsIgnoreCase("FAIL")){
//          	String errordesc=null;
//          	
//              if(responseXML.toLowerCase().contains("<errorDetailVOList>".toLowerCase())){
//              	String str3= responseXML.substring(responseXML.lastIndexOf("<errorDesc>") , responseXML.lastIndexOf("</errorDesc>"));            
//              	errordesc=(str3.replaceAll("<errorDesc>", ""));                	
//              }else if(responseXML.toLowerCase().contains("<XSD_AUX_NC>".toLowerCase())){
//                  if(str2.contains(" | ")){
//                  String [] erercodes=str2.split(" | ");
//                  List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
//                  list.removeAll(Collections.singleton("|"));
//                  erercodes=list.toArray(new String[0]);
//                  StringBuilder completeError = new StringBuilder();
//                  for(String error:erercodes){
//                  	FristgenErrors errdetails=FGErrorDetails.findOne(error);
//                  	String details=null;
//                  	String code=null;                        		
//                  	if(null!=errdetails){
//                         	 details=errdetails.getErrorDetails();
//                      	 code=errdetails.getErrorcode();  
//                  	}else{
//                        	 details="N/A";
//                     	     code="N/A";
//                  	}
//                  	completeError.append(code+"========>"+details+"\r\n ");
//                  }
//                  errordesc=completeError.toString();
//              	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//              	Date today = Calendar.getInstance().getTime();        
//              	String reportDate = df.format(today);  
//              	Omepolicyrepo2.Upatestatus("FAIL", errordesc, reportDate,"N/A" ,pol.getPolno());
//                  }else{ 
//                  	FristgenErrors errdetails=FGErrorDetails.findOne(str4);
//                  	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                  	Date today = Calendar.getInstance().getTime();        
//                  	String reportDate = df.format(today);
//                  	String erdetails=null;
//                  	if(null!=errdetails){
//                  		erdetails= errdetails.getErrorDetails();
//                  	}else{
//                  		erdetails="N/A";
//                  		
//                  	}
//                  	
//                   Omepolicyrepo2.Upatestatus("FAIL", erdetails, reportDate,"Receipt Fail",pol.getPolno());
//                  
//                  }
//                 Omepolicyrepo2.UpateForFail("RECEIPT FAIL", "N/A","N", pol.getPolno());                  	
//              }
//          }else{
//          	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//          	Date today = Calendar.getInstance().getTime();        
//          	String reportDate = df.format(today);
//          	Omepolicyrepo2.Upatestatus(status, "N/A", reportDate,"N/A", pol.getPolno());
//          }
//		  }
//		}
//		else{
//		Omepolicyrepo2.Upatestatus("CD Mode Payment", "N/A", "N/A","N/A", pol.getPolno());				
//		}


//try {
//} catch (RemoteException | ServiceException e) {
//	try{				
//		ReceiptFaStatus recFAstatus = new ReceiptFaStatus();
//		recFAstatus.setAttemptTime(new Date());
//		recFAstatus.setPaymentId(Long.toString(pid));
//		recFAstatus.setPolicyId(Long.toString(polid));
//		recFAstatus.setPolicyNo(pol.getPolno());
//		recFAstatus.setNoofattempts(1);
//		recFAstatus.setINPUTRECIPT(str5);
//		recFAstatus.setProductId(pol.getProductid());
//		recFAstatus.setMfgcode(pol.getMfgcode());
//		recFAstatus.setProductCode(pol.getProductcode());
//		recFAstatus.setMfgname(pol.getMfgname());
//		recFAstatus.setReceiptNo(fgReceiptVO.getVoucherReference());
//		recFAstatus.setStatus("FAIL");            
//		recFAstatus.setErrorcode(e.getCause().toString());
//		recFAstatus.setFromsystem("OEM");
//		recFAstatus.setResponse("Receipt did not push to FG Due to exception see Errcode For Details ");
//		receiptFaStatusRepo.save(recFAstatus);
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		Date today = Calendar.getInstance().getTime();        
//		String reportDate = df.format(today);
//		Omepolicyrepo2.Upatestatus("RETRY", e.getMessage(), reportDate,"Receipt Fail", pol.getPolno());
//	}
//	catch (Exception e1) {
//		logger.info(e1.toString()+" From Recipt Module");
//	}
//    
//}
		  