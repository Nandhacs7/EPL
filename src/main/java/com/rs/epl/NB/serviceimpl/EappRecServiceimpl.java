/*package com.rs.epl.NB.serviceimpl;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fa.component.policy.Payment;
import com.fa.component.policy.Policy;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgReceiptVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FgResponseVO;
import com.firstapex.rs.acnt.webservices.receiptInterface.FirstGenReceiptCreationServiceLocator;
import com.rs.epl.NB.eappsrepo.EappsStatusRepo;
import com.rs.epl.NB.oementity.EappReceipt;
import com.rs.epl.NB.oementity.FristgenErrors;
import com.rs.epl.NB.policyrepository.EappReceiptRepo;
import com.rs.epl.NB.policyrepository.FgError;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.service.EappReceiptService;
import com.rs.epl.eapps.receiptmaster.EappsStatus;

@Service
public class EappRecServiceimpl implements EappReceiptService {

    @Resource
    EappReceiptRepo recstatus;
	
    @Resource
    PolicyRepository Eplpolicy;
    
    @Resource
    EappsStatusRepo EappSts;
    
    @Resource
    FgError FGErrorDetails;

    FgResponseVO fgResponseVo=null;
    
    protected final Logger logger = Logger.getLogger(getClass());
    
	@Override
	public void EappReceiptMov(Long Id,String polno) throws RemoteException, ServiceException, JAXBException {
		

	List<EappsStatus> recstatusobj = EappSts.findByinsid(Id);
	
	
	String str2=null;
	String str4=null;
		
	try{
		for(EappsStatus Eappst:recstatusobj){
			
			if(Eappst.getReceipt_status().equalsIgnoreCase("Retry With Valid Data")){
				return;
			}			
		}
	}
	catch (Exception e) {
	
	}
		
		
		Policy eplpol=Eplpolicy.findBypolno(polno);
		
		Set<Payment> seteplpayment=eplpol.getPayments();

		for(Payment pay:seteplpayment){
			
			String recno=pay.getReceiptnumber();
			  
			EappReceipt recstat=recstatus.findByreceiptNo(recno);
		
		try {
			
			if(recstat==null){
				FgReceiptVO Fgrec=createFgReceiptVo(pay,eplpol);
				fgResponseVo=pushToFG(Fgrec,eplpol,seteplpayment,Id);
				EappReceipt rec=new EappReceipt();
				  
				ReciptObjToXml recObjxml=new ReciptObjToXml();
				StringWriter Reciptxml=recObjxml.policyobjtoXML(Fgrec);
				String Str5=Reciptxml.toString();
				logger.info(Str5); 
				ReciptToXml outputxml=new ReciptToXml();
				StringWriter responseXML1=null;
				String responseXML=null;
				if(fgResponseVo!=null){
		            responseXML1=outputxml.Recipttoxml(fgResponseVo);
		            responseXML=responseXML1.toString();
		            logger.info(responseXML); 
				rec.setAttemptTime(new Date());
				rec.setPolicyId(String.valueOf(eplpol.getPolid()));
				rec.setPolicyNo(polno);
				rec.setPaymentId(String.valueOf(pay.getId()));
				rec.setNoofattempts(1);
				rec.setProductCode(eplpol.getProductcode());
				rec.setINPUTRECIPT(Str5);
				rec.setReceiptNo(pay.getReceiptnumber());
				rec.setFromsystem("EAPPS");
		        String status=fgResponseVo.getStatus();
		        
		        rec.setStatus(status);
		        if(responseXML.toLowerCase().contains("<errorDetailVOList>".toLowerCase())){
		        	 str2= responseXML.substring(responseXML.lastIndexOf("<errorCode>") , responseXML.lastIndexOf("</errorCode>"));            
		        	rec.setErrorcode(str2.replaceAll("<errorCode>", ""));                	
		        }else if(responseXML.toLowerCase().contains("<XSD_AUX_NC>".toLowerCase())){
		        	 str2= responseXML.substring(responseXML.lastIndexOf("<XSD_AUX_NC>") , responseXML.lastIndexOf("</XSD_AUX_NC>"));   
		        	 str4=str2.replaceAll("<XSD_AUX_NC>", "");
		        	rec.setErrorcode(str4);
		        }else if(responseXML.toLowerCase().contains("SUCCESS".toLowerCase())){
		        	rec.setErrorcode("N/A");
		        }
		        rec.setResponse(responseXML);		 
		        recstatus.saveAndFlush(rec);
		        

		        
		        
		        if(status.equalsIgnoreCase("FAIL")){		        	
		        	try {
                    if(responseXML.toLowerCase().contains("<errorDetailVOList>".toLowerCase())){
                    	String str3= responseXML.substring(responseXML.lastIndexOf("<errorDesc>") , responseXML.lastIndexOf("</errorDesc>"));   
        		        EappsStatus Eappst=new EappsStatus();
        		        Eappst.setPolicycode(polno);
        		        Eappst.setReceiptno(pay.getReceiptnumber());
        		        Eappst.setInsid(Id);
        		        Eappst.setReceipt_status("FAIL");
                    	Eappst.setErrordeatils(str3.replaceAll("<errorDesc>", ""));                   	
                    	EappSts.save(Eappst);
                    	
                    }
                    
                    else if(responseXML.toLowerCase().contains("<XSD_AUX_NC>".toLowerCase())){
                        if(str2.contains(" | ")){
                        String [] erercodes=str2.split(" | ");
                        List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
                        list.removeAll(Collections.singleton("|"));
                        erercodes=list.toArray(new String[0]);
                        StringBuilder completeError = new StringBuilder();
                        for(String error:erercodes){
                        	//find the error details from db
                        	FristgenErrors errdetails=FGErrorDetails.findOne(error);
                        	String details=errdetails.getErrorDetails();
                        	String code=errdetails.getErrorcode();
                        	completeError.append(code+"========>"+details+"\r\n ");
                        }
                        
        		        EappsStatus Eappst=new EappsStatus();
        		        Eappst.setPolicycode(polno);
        		        Eappst.setReceiptno(pay.getReceiptnumber());
        		        Eappst.setInsid(Id);
        		        Eappst.setReceipt_status("FAIL");
        		        Eappst.setErrordeatils(completeError.toString());
                    	EappSts.save(Eappst);

                        }else{ 
                        	
                        
                        	FristgenErrors errdetails=FGErrorDetails.findOne(str4);                        	
            		        EappsStatus Eappst=new EappsStatus();
            		        Eappst.setPolicycode(polno);
            		        Eappst.setReceiptno(pay.getReceiptnumber());
            		        Eappst.setInsid(Id);
            		        Eappst.setReceipt_status("FAIL");
            		        Eappst.setErrordeatils(errdetails.getErrorDetails());
                        	EappSts.save(Eappst);                          	
                        }                    	
                   }
                    
                    
					} catch (Exception e) {
						
        		        EappsStatus Eappst=new EappsStatus();
        		        Eappst.setPolicycode(polno);
        		        Eappst.setReceiptno(pay.getReceiptnumber());
        		        Eappst.setInsid(Id);
        		        Eappst.setReceipt_status("FAIL");
        		        Eappst.setErrordeatils("Unable To capture The Error Details");
                    	EappSts.save(Eappst); 
						
					}
		        	  
                    
		       }else {		    	   
   		        EappsStatus Eappst=new EappsStatus();
   		        Eappst.setPolicycode(polno);
   		        Eappst.setReceiptno(pay.getReceiptnumber());
   		        Eappst.setInsid(Id);
   		        Eappst.setReceipt_status(status);
               	EappSts.save(Eappst);
		     }
		 }	
		   }
			else{
				    int attempt=recstat.getNoofattempts();
					attempt=attempt+1;
//					recstat.setNoofattempts(attempt);
					recstatus.Updaterec(attempt,recno);			
			   }
			
		} catch (Exception e) {			
			EappReceipt recFAstatus = new EappReceipt();
            recFAstatus.setAttemptTime(new Date());
            recFAstatus.setPaymentId(String.valueOf(pay.getId()));
            recFAstatus.setPolicyId(String.valueOf(eplpol.getPolid()));
            recFAstatus.setPolicyNo(polno);
            recFAstatus.setNoofattempts(1);
            recFAstatus.setINPUTRECIPT("Before Push To FirstGen Handled By Invalid Data Exception");
            recFAstatus.setProductId(eplpol.getProductid());
            recFAstatus.setProductCode(eplpol.getProductcode());
            recFAstatus.setMfgcode(eplpol.getMfgcode());
            recFAstatus.setMfgname(eplpol.getMfgname());
            recFAstatus.setReceiptNo(pay.getReceiptnumber());                
            recFAstatus.setStatus("Retry Receipt with Valid Data");
            recFAstatus.setErrorcode("Invalid Request For Receipt Creation");                	
            recFAstatus.setResponse(e.toString());
            recstatus.save(recFAstatus);
            
            EappsStatus Eappst=new EappsStatus();
            Eappst.setPolicycode(polno);
            Eappst.setReceiptno(pay.getReceiptnumber());
            Eappst.setInsid(Id);
            Eappst.setReceipt_status("FAIL");
	        EappSts.save(Eappst);

		}
   }
		
}


	private FgResponseVO pushToFG(FgReceiptVO fgrec, Policy eplpol, Set<Payment> seteplpayment, Long id) throws RemoteException, ServiceException {
		
		FgResponseVO fgResponseVo1 = null;
		
		FirstGenReceiptCreationServiceLocator loc = new FirstGenReceiptCreationServiceLocator();
		try {
			
			fgResponseVo1= loc.getReceiptCreationSoapBinding().performReceiptCreation(fgrec);		
			
		} catch (Exception e) {
			try {				
				EappReceipt recFAstatus = new EappReceipt();
				recFAstatus.setAttemptTime(new Date());
				recFAstatus.setPaymentId(String.valueOf(seteplpayment.iterator().next().getId()));
				recFAstatus.setPolicyId(String.valueOf(eplpol.getPolid()));
				recFAstatus.setPolicyNo(eplpol.getPolno());
				recFAstatus.setNoofattempts(1);
				recFAstatus.setINPUTRECIPT("Receipt Not Posted To FirstGen");
				recFAstatus.setProductId(eplpol.getProductid());
				recFAstatus.setMfgcode(eplpol.getMfgcode());
				recFAstatus.setProductCode(eplpol.getProductcode());
				recFAstatus.setMfgname(eplpol.getMfgname());
				recFAstatus.setReceiptNo(fgrec.getVoucherReference());
				recFAstatus.setStatus("FAIL");            
				recFAstatus.setErrorcode(e.getCause().toString());
				recFAstatus.setResponse("Receipt did not push to FG Due to Connection exception");
				recstatus.save(recFAstatus);
		        EappsStatus Eappstobj=new EappsStatus();
		        Eappstobj.setErrordeatils("Connection Exception");		        
		        Eappstobj.setInsid(id);
		        Eappstobj.setReceipt_status("FAIL");
		        Eappstobj.setPolicycode(eplpol.getPolno());
		        Eappstobj.setReceiptno(fgrec.getVoucherReference());
		        EappSts.save(Eappstobj);			
			} catch (Exception e2) {
								
			}
			
	}
		
	return fgResponseVo1;
		
}


	private FgReceiptVO createFgReceiptVo(Payment pay, Policy eplpol) {
		FgReceiptVO FgReceipt=new FgReceiptVO();
		FgReceipt.setOperatorId("T02");
		FgReceipt.setVoucherAccountCode(eplpol.getAgentcode());
		FgReceipt.setVoucherSource("RECT");
		FgReceipt.setVoucherReference(pay.getReceiptnumber());
		FgReceipt.setVoucherTheirReferenceNumber(eplpol.getPolno());
	    FgReceipt.setVoucherParticulars(eplpol.getPolicyclient().getFirstname());
		FgReceipt.setVoucherProductCode(eplpol.getProductcode());
		FgReceipt.setVoucherReason(eplpol.getPolno());
		FgReceipt.setVoucherSuspenseBranch(eplpol.getBranchcode());
		if(pay.getPaymenttype().equalsIgnoreCase("CHQ")){
            FgChequeVO fgChequeVo = new FgChequeVO();
            fgChequeVo.setDepositBank(pay.getDepositingBankCode());
            fgChequeVo.setChequeCurrency("INR");
            fgChequeVo.setChequeAmount(new BigDecimal(pay.getPaymentamount()));
            fgChequeVo.setChequeCharges(new BigDecimal(0));
            fgChequeVo.setChequeNumber(pay.getInstrumentnumber());
            fgChequeVo.setChequeDraweeBank(pay.getInstrumentbank());
            fgChequeVo.setChequeDraweeBankName(pay.getInstrumentbank());
            // fgChequeVo.setChequeDraweeBankName(payment.getInstrumentbank());
            fgChequeVo.setChequeDate(pay.getPaymentdate());
            fgChequeVo.setChequeOverseas("N");
            FgChequeVO[] fgchq={fgChequeVo};
            FgReceipt.setChequeVOList(fgchq);
		}
		else if(pay.getPaymenttype().equalsIgnoreCase("CARD")){
            FgCreditCardVO fgCreditVo = new FgCreditCardVO();
            fgCreditVo.setDepositBank(pay.getDepositingBankCode());
            fgCreditVo.setCardCurrency("INR");
            fgCreditVo.setCardAmount(new BigDecimal(pay.getPaymentamount()));
            fgCreditVo.setCardNumber(pay.getInstrumentnumber());
            fgCreditVo.setCardCompany(pay.getInstrumentbank());
            String str=pay.getInstrumentexpdt();
            String ramn=str.substring(3).replaceAll("/", "");
            fgCreditVo.setCardExpiryDate(ramn);//"042018"
            fgCreditVo.setCardType(pay.getInstrumenttype());
            fgCreditVo.setTransactionNumber(pay.getTRANSCATION_NO());
            FgCreditCardVO[] fgcredit={fgCreditVo};
            FgReceipt.setCreditCardVOList(fgcredit);

		}
		else if(pay.getPaymenttype().equalsIgnoreCase("CASH")){
			
			FgCashVO cash = new FgCashVO();
			
			cash.setCashAmount(new BigDecimal(pay.getPaymentamount()));
			
			cash.setCashCharges(new BigDecimal(0));
			
			cash.setCashCurrency("INR");
			
			cash.setDepositBank(pay.getDepositingBankCode());
			
			FgCashVO[] Fgcash={cash};
			
			FgReceipt.setCashVOList(Fgcash);

		}
	return FgReceipt;
	}

}
*/