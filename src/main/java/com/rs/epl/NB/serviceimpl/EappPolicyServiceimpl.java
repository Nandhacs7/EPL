package com.rs.epl.NB.serviceimpl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fa.component.policy.EPL_STATUS;
import com.fa.component.policy.Iicoverage;
import com.fa.component.policy.Payment;
import com.fa.component.policy.Policy;
import com.fa.component.policy.Policyclient;
import com.fa.component.policy.Policycoverage;
import com.fa.component.policy.Policyitem;
import com.firstapex.rs.uw.webservices.policymovements.ChequeVO;
import com.firstapex.rs.uw.webservices.policymovements.ClientVO;
import com.firstapex.rs.uw.webservices.policymovements.CoverageVO;
import com.firstapex.rs.uw.webservices.policymovements.CreditCardVO;
import com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortTypeProxy;
import com.firstapex.rs.uw.webservices.policymovements.DriverVO;
import com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO;
import com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO;
import com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO;
import com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO;
import com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO;
import com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO;
import com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO;
import com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO;
import com.firstapex.rs.uw.webservices.policymovements.SettlementVO;
import com.rs.epl.NB.eappsrepo.EappPolicy;
import com.rs.epl.NB.oementity.FristgenErrors;
import com.rs.epl.NB.policyrepository.FgError;
import com.rs.epl.NB.policyrepository.Status;
import com.rs.epl.NB.service.EappPolicyService;

@Service
public class EappPolicyServiceimpl implements EappPolicyService {
	
	protected final Logger logger = Logger.getLogger(getClass());
	
	@Resource
	EappPolicy Eapppol;
	
//	@Resource
//	Policyerrorsrepo Policy_Status;
	
	@Resource
	Status  policystatus5;

    @Resource
    FgError FGErrorDetails;
	
	
	FguwResponseVO respVo=null;
	

	
	@Override
	public void EappPolicyMov(Policy eapppol, String policyno,String receiptnos,Long id,List<String> listrecno) throws RemoteException, ServiceException, JAXBException {

		
//		long Paymentids=Setpayments.iterator().next().getId();
	

		EPL_STATUS status=new EPL_STATUS();		
		 String stx5=null;
		 
			Set<Payment> Setpayments=eapppol.getPayments();
			
			List<Long> payid=new ArrayList<Long>();
	        for(Payment pay:Setpayments){
	        	payid.add(pay.getId());
	        }
		
			try {
      			      FguwPolicyVO policyVo3 = new FguwPolicyVO();						
						policyVo3=loadpolicydata(eapppol,Setpayments);						
						respVo = pushToFG(policyVo3,eapppol,policyno,receiptnos,status,id);
						FGObjToXML convertxml=new FGObjToXML();
			            StringWriter inputxml=convertxml.policyobjtoXML(policyVo3);
			             stx5=inputxml.toString();
			            logger.info(stx5);
			            if(respVo!=null){			            	
				             commonstatus(status,policyno,receiptnos,stx5,respVo,eapppol,id);				              
				              if(null!=respVo.getStatus() && respVo.getStatus().equalsIgnoreCase("FAIL")){
				            	  failstatus(status,respVo);
				              }else{
				          		String respXML = responseToXML(respVo);
				          		status.setPolicy_responsexml(respXML);
				              }
		
				           policystatus5.save(status);				            	  

			           }
			
			}catch (Exception e) {
				try {
					commonstatus(status,policyno,receiptnos,stx5,respVo,eapppol, id);
										
	                 StringWriter errors = new StringWriter();
	                 
	                 e.printStackTrace(new PrintWriter(errors));
	                  
	                 String err =errors.toString();
	                 
	                 status.setPolicy_errordeatils(e.toString());
	                 
	                 status.setPolicy_status("Invalid Request");

					status.setPolicy_requestxml(err);
					status.setPolicy_responsexml("N/A");
					policystatus5.save(status);
					
				} catch (Exception e2) {
	
					
					String Paymentids=StringUtils.join(payid, ',');
			        
					status.setPolicyno(policyno);
					
					status.setReceiptno(receiptnos);
					
					status.setPolicyid(String.valueOf(eapppol.getPolid()));
					
					status.setPolicy_attempt_time(new Date());
					
					status.setProductcode(eapppol.getProductcode());
					
					status.setFromsysystem("EAPPS");
					
					status.setReceiptid(Paymentids);
					status.setPolicy_errordeatils(e.toString());
					status.setPolicy_responsexml(respVo.toString());
					try {
						status.setPolicy_status(respVo.getStatus());
					} catch (Exception e3) {
						status.setPolicy_status("Invalid Request");
					}
					
	                 StringWriter errors2 = new StringWriter();
	                 
	                 e2.printStackTrace(new PrintWriter(errors2));
	                  
	                 String err2 =errors2.toString();
					
					status.setPolicy_requestxml(err2);
					status.setPolicy_responsexml("N/A");
					policystatus5.save(status);
					Eapppol.UpdateInsurancepolicyforfail(2,policyno);
					
				}

			}							
 }

	private void commonstatus(EPL_STATUS status, String policyno, String receiptnos, String stx5,
			FguwResponseVO respVo2, Policy eapppol2, Long id) {
		  
		Set<Payment> Setpayments=eapppol2.getPayments();
		
		List<Long> payid=new ArrayList<Long>();
        for(Payment pay:Setpayments){
        	payid.add(pay.getId());
        }	
        
        String Paymentids=StringUtils.join(payid, ',');
        
		status.setPolicyno(policyno);
		
		status.setReceiptno(receiptnos);
		
		status.setPolicyid(String.valueOf(eapppol2.getPolid()));
		
		status.setReceiptid(Paymentids);
		
		status.setReceipt_status("N/A");
		
		status.setReceipt_requestxml("N/A");
		
		status.setPolicy_requestxml(stx5);
		
		status.setReceipt_responsexml("N/A");
		
		status.setPolicy_responsexml("N/A");
		
		status.setReceipt_errordetails("N/A");
		
		status.setPolicy_errordeatils("N/A");
		
		status.setPolicy_attempt_time(new Date());
		
		status.setProductcode(eapppol2.getProductcode());
		
		status.setProductid("N/A");
		
		status.setMfgcode("N/A");
		
		status.setMfgname("N/A");
		
		status.setTransctiontype(eapppol2.getTransactiontype());
		
		status.setFromsysystem("EAPPS");
		
		if(null!=respVo2 && null!=respVo2.getStatus() &&
				respVo2.getStatus().equalsIgnoreCase("SUCCESS")){
	
	  String time = new SimpleDateFormat("hh:mm a").format(new Date());
		Eapppol.UpdateInsurancepolicy(1,time,policyno);
		status.setPolicy_status("SUCCESS");
	}else{
		Eapppol.UpdateInsurancepolicyforfail(2,policyno);
		status.setPolicy_status("FAIL");
		if(null!=respVo2 && null!=respVo2.getStatus() &&
				respVo2.getStatus().equalsIgnoreCase("FAIL")){
			Eapppol.UpdatePartiesinpolicyforfail(id);			
		}
	}
}
	
	private void failstatus(EPL_STATUS status, FguwResponseVO respVo2) {
		String respXML = responseToXML(respVo2);
		List<ErrorDetailVO> errorcodelist = geterrorcode(respVo2);
    	Iterator<ErrorDetailVO> it=errorcodelist.iterator();
        StringBuilder listerrorcode = new StringBuilder();
    	
        while(it.hasNext()){
        	ErrorDetailVO errobj=it.next();
        	listerrorcode.append("   "+errobj.getErrorCode()+"   ");	            	
       }
    	
        String errorcode=listerrorcode.toString();
        
        StringBuilder completeError = new StringBuilder();
		 try {
			  int g=respXML.indexOf("<errorMsg>");
			  int h=respXML.indexOf("</errorMsg>");
			  String erroemessage=respXML.substring(g,h).replaceAll("<errorMsg>", "");	
			
			   if(!erroemessage.equalsIgnoreCase("null")){
                    if(erroemessage.contains(" | ")){
                       String [] erercodes=erroemessage.split(" | ");			                            
                       List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
                       list.removeAll(Collections.singleton("|"));
                       erercodes=list.toArray(new String[0]);			                          
                       for(String error:erercodes){						                            	
                       	FristgenErrors errdetails=FGErrorDetails.findOne(error);
                       	String details=errdetails.getErrorDetails();
                       	String code=errdetails.getErrorcode();
                       	completeError.append(code+"========>"+details+"\r\n ");
                       }

                 }else{
                   	FristgenErrors errdetails=FGErrorDetails.findOne(erroemessage);
                   	String details=errdetails.getErrorDetails();
                   	String code=errdetails.getErrorcode();
                   	completeError.append(code+"========>"+details+"\r\n ");														
						} 	
                 }
         else if(respXML.contains("<ErrorDetail>")){							        	  
				int i=respXML.indexOf("<ErrorDetail>");
				int j=respXML.lastIndexOf("</ErrorDetail>");
				String stx2=respXML.substring(i, j);
				String ram=stx2.replaceAll("<.*?>", "  ").trim().replace("  " , "=>").replaceAll("=>=>=>=>null=>=>null", "");		
				completeError.append(ram);
				} 	
		 }catch (Exception e) {}
		 
		 
		 status.setPolicy_responsexml(respXML);
		 
		 logger.info(respXML);
		 
			if(null!=completeError.toString()){
			 status.setPolicy_errordeatils(completeError.toString());
		     }else{	
			status.setPolicy_errordeatils(errorcode);}
		
	}

	private FguwPolicyVO loadpolicydata(Policy policies, Set<Payment> setpayments) {
		DecimalFormat dff = new DecimalFormat("############.####");
		FguwPolicyVO Fgpolicy = new FguwPolicyVO();
		ClientVO FGclient = new ClientVO();
		Fgpolicy.setOprId("T02");
			 if(policies.getTransactiontype().equalsIgnoreCase("RN")){
				 Fgpolicy.setPolNo(policies.getPreviouspolno());
			 }else{
				 Fgpolicy.setPolNo(policies.getPolno());				 
			 }
		
		
		Fgpolicy.setEndtNo("000");
		if(policies.getTransactiontype().equals("RN")){
			Fgpolicy.setIUWP1_ENDT_REAS("12");	
		}else{
			Fgpolicy.setIUWP1_ENDT_REAS("00");			
		}
		Fgpolicy.setIUWP1_PRD_CD(policies.getProductcode());
		Fgpolicy.setIUWP1_ACC_CD(policies.getAgentcode());
		
//		String pol=policies.getPolno().substring(0,10)+"00000";
		
		Fgpolicy.setIUWP1_POL_WARR(policies.getPolno());
		
		Fgpolicy.setIUWP1_CAT_CD("D");
		Fgpolicy.setIUWP1_BR_CD(policies.getBranchcode());
		Fgpolicy.setIsNewAgent("N");
		if(null!=policies.getPreviouspolno()){
			if(policies.getPreviouspolno().length()>20){
				Fgpolicy.setIUWP1_OLD_POL_NO(policies.getPreviouspolno().substring(0, 20));	
			}else{
				Fgpolicy.setIUWP1_OLD_POL_NO(policies.getPreviouspolno());
			}
					
		}
		if(policies.getPolicyclient().getIsexistingclient()){
		Fgpolicy.setIsNewClient("Y");
		Fgpolicy.setClientUpdateFlag("N");
		}else{
			Fgpolicy.setIsNewClient("N");
			Fgpolicy.setClientUpdateFlag("Y");
		}
		
		Fgpolicy.setIUWP1_CLI_CD(policies.getPolicyclient().getCode());
		Fgpolicy.setIUWP1_POL_NO_GEN_ID("S");
		
		Fgpolicy.setIUWP1_UWYR(policies.getUwyr());
		Fgpolicy.setIUWP1_BUS_TP("DR");
		if(null!=policies.getOacode()){
			if(policies.getOacode().length()>8){
				Fgpolicy.setIUWP1_ORACC_CD(policies.getOacode().substring(0, 8));
				Fgpolicy.setIUWP1_OTH_INT_PTY_CD4(policies.getOacode().substring(0, 8));
			}else{
				Fgpolicy.setIUWP1_ORACC_CD(policies.getOacode());
				Fgpolicy.setIUWP1_OTH_INT_PTY_CD4(policies.getOacode());
			}
		}
		
		Fgpolicy.setIUWP1_TERM("01");
		
		Fgpolicy.setIUWP1_OTH_INT_PTY_CD1(policies.getAgentcode());
		
		Fgpolicy.setIUWP1_OTH_INT_PTY_CD2(policies.getBdocode());	
		  
	
		
		Fgpolicy.setIUWP1_INSTL_MODE("A");
		
		Fgpolicy.setIUWP1_RN_CD("Y");
		
		Fgpolicy.setIUWP1_PRM_CUR("INR");
		
		
		
		Fgpolicy.setIUWP1_ICP_DT(policies.getPolstartdate());
		Fgpolicy.setIUWP1_EXP_DT(policies.getPolexpirydate());
		Fgpolicy.setIUWP1_ISS_DT(policies.getCreationdate());
		Fgpolicy.setIUWP1_ACC_DT(policies.getAccountDate());
		Fgpolicy.setIUWP1_EFF_DT(policies.getEffectivedate());
		Fgpolicy.setIUWP1_PROPOSAL_DT(policies.getProposalDate());
		Fgpolicy.setStrIUWP1_ICP_TM(policies.getPolStartTime());
		Fgpolicy.setStrIUWP1_EXP_TM(policies.getPolExpTime());
		
		
		if(policies.getPolicyclient().getAddress1() != null && policies.getPolicyclient().getAddress1().length()>40){
			Fgpolicy.setIUWP1_CLI_ADDR_1(policies.getPolicyclient().getAddress1().substring(0, 40));				
		}
		else if(policies.getPolicyclient().getAddress1() != null && policies.getPolicyclient().getAddress1().length()>0){
			Fgpolicy.setIUWP1_CLI_ADDR_1(policies.getPolicyclient().getAddress1());
		}
		if(policies.getPolicyclient().getAddress2()!=null && policies.getPolicyclient().getAddress2().length()>40){
			Fgpolicy.setIUWP1_CLI_ADDR_2(policies.getPolicyclient().getAddress2().substring(0, 40));
		}
		else if(policies.getPolicyclient().getAddress2()!=null && policies.getPolicyclient().getAddress2().length()>0){
			Fgpolicy.setIUWP1_CLI_ADDR_2(policies.getPolicyclient().getAddress2());
		}
		if(policies.getPolicyclient().getAddress3()!=null && policies.getPolicyclient().getAddress3().length()>40){
			Fgpolicy.setIUWP1_CLI_ADDR_3(policies.getPolicyclient().getAddress3().substring(0, 40));				
		}
		else if(policies.getPolicyclient().getAddress3()!=null && policies.getPolicyclient().getAddress3().length()>0){
			Fgpolicy.setIUWP1_CLI_ADDR_3(policies.getPolicyclient().getAddress3());
		}
		if(policies.getPolicyclient().getAddress4()!=null && policies.getPolicyclient().getAddress4().length()>40){
			Fgpolicy.setIUWP1_CLI_ADDR_4(policies.getPolicyclient().getAddress4().substring(0, 40));				
		}
		else if(policies.getPolicyclient().getAddress4()!=null && policies.getPolicyclient().getAddress4().length()>0){
			Fgpolicy.setIUWP1_CLI_ADDR_4(policies.getPolicyclient().getAddress4());
		}
		
		Fgpolicy.setPanNo(policies.getPolicyclient().getPannumber());
		Fgpolicy.setIsNewNominee("N");
		Fgpolicy.setIUWP1_SI_CUR("INR");	
		
		
//		if(null!=policies.getPolicyclient().getFirstname()){
//			if(policies.getPolicyclient().getFirstname().length()>30){
//				FGclient.setIUWPC_FIRSTNAME2(policies.getPolicyclient().getFirstname().substring(0, 30));
//			}else{
//				
//			}
//		}
		
		FGclient.setIUWPC_FIRSTNAME2(policies.getPolicyclient().getFirstname());
		
		if (policies.getPolicyclient().getIscorporateclient()) {
			FGclient.setIUWPC_CLI_TP("O");
		} else {
			FGclient.setIUWPC_CLI_TP("I");
			if(policies.getPolicyclient().getMiddlename()!=null && policies.getPolicyclient().getMiddlename().length()>0){
				String middle=policies.getPolicyclient().getMiddlename()+" "+policies.getPolicyclient().getLastname();
				if(middle.length()>30){
					FGclient.setIUWPC_SURNAME2(middle.substring(0, 30));
				}else{						
					FGclient.setIUWPC_SURNAME2(middle);
				}
			}else{
				FGclient.setIUWPC_SURNAME2(policies.getPolicyclient().getLastname());
			}
		}
		
		FGclient.setIUWPC_2ND_ZIP(policies.getPolicyclient().getPincode().toString());
		FGclient.setIUWPC_CON_CD("IND"); //LOKESH
		FGclient.setIUWPC_STATE_CD(policies.getPolicyclient().getStatecode());
		FGclient.setCityCode(policies.getPolicyclient().getCitycode());
		FGclient.setIUWPC_HAND_PHONE(policies.getPolicyclient().getPrimarymobile());
		Fgpolicy.setClientVO(FGclient);
		Set<Policycoverage> spolCovera = policies.getPolicycoverages();
		PolicyCoverageVO[] arrpolcov;
		List<PolicyCoverageVO> listpolcovVO = new ArrayList<PolicyCoverageVO>();
//		List<String> polcoverexeclusions= new ArrayList<>();
//		polcoverexeclusions.add("Zcmtx");
//		polcoverexeclusions.add("ZCMTX");
//		polcoverexeclusions.add("ZCM");
		
		for (Policycoverage polcov : spolCovera) {
//			if(polcoverexeclusions.contains(polcov.getCode())){
//				continue;				
//			}				
			PolicyCoverageVO polcovVO = new PolicyCoverageVO();
			if(polcov.getCode().startsWith("ZOVCM")){
				polcovVO.setIUWP4_COVG_CD("ZOVCM");
				polcovVO.setPrimeIUWP4_NEW_INCR_PREM(new BigDecimal(polcov.getPremium()==null?"0":polcov.getPremium()));
				polcovVO.setIUWP4_PREM_CURR_RATE(new BigDecimal(polcov.getName()));
				polcovVO.setIUWP4_PREM_CURR("INR");
			}else{
				polcovVO.setIUWP4_COVG_CD(polcov.getCode());
				polcovVO.setPrimeIUWP4_NEW_INCR_PREM(new BigDecimal(polcov.getPremium()==null?"0":polcov.getPremium()));
				polcovVO.setIUWP4_PREM_CURR_RATE(new BigDecimal(1));
				polcovVO.setIUWP4_PREM_CURR("INR");				
			}
			listpolcovVO.add(polcovVO);
		}
		
		PolicyCoverageVO polcovVO1 = new PolicyCoverageVO();
		
		polcovVO1.setIUWP4_COVG_CD("ZSDEXP");
		polcovVO1.setPrimeIUWP4_NEW_INCR_PREM(new BigDecimal(-1));
		polcovVO1.setIUWP4_PREM_CURR_RATE(new BigDecimal(1));
		polcovVO1.setIUWP4_PREM_CURR("INR");
		
		
		PolicyCoverageVO polcovVO2 = new PolicyCoverageVO();
		
		polcovVO2.setIUWP4_COVG_CD("ZSTDTY");
		polcovVO2.setPrimeIUWP4_NEW_INCR_PREM(new BigDecimal(1));
		polcovVO2.setIUWP4_PREM_CURR_RATE(new BigDecimal(1));
		polcovVO2.setIUWP4_PREM_CURR("INR");
		
		listpolcovVO.add(polcovVO1);
		listpolcovVO.add(polcovVO2);
		
		
		arrpolcov = listpolcovVO.toArray(new PolicyCoverageVO[listpolcovVO.size()]);
		Fgpolicy.setPolicyCoverageVOList(arrpolcov);
		
//		Fgpolicy.setIUWP1_DOM(politem.getPrivatecaritem().getDomicile());
		
		Set<Policyitem> politems = policies.getPolicyitems();
		Policyitem oneit = politems.iterator().next();
		
		Fgpolicy.setIUWP1_TERR(oneit.getPrivatecaritem().getRegstatecode());
		
//		List<String> Itemcoverexeclusions= new ArrayList<>();
//		Itemcoverexeclusions.add("VPCVPR");
//		Itemcoverexeclusions.add("VPCVTP");
//		Itemcoverexeclusions.add("VPCVVE");
//		Itemcoverexeclusions.add("VPCVLL");
//		Itemcoverexeclusions.add("VPCVTM");
//		Itemcoverexeclusions.add("VPCVEA");
//		Itemcoverexeclusions.add("VPCVFG");
//		Itemcoverexeclusions.add("VPCVWS");
//		Itemcoverexeclusions.add("VPCVOP");
//		Itemcoverexeclusions.add("VPCVGS");
//		Itemcoverexeclusions.add("VPCVDE");
//		Itemcoverexeclusions.add("VPCVNP");
//		Itemcoverexeclusions.add("VPCVNE");
//		Itemcoverexeclusions.add("VPCVPN");
//		Itemcoverexeclusions.add("VPCVLW");
//		Itemcoverexeclusions.add("VPCVAT");
//		Itemcoverexeclusions.add("VPCVLP");
//		Itemcoverexeclusions.add("VPCVCN");
//		Itemcoverexeclusions.add("VPCVXG");
//		Itemcoverexeclusions.add("VPCVNC");
//		Itemcoverexeclusions.add("VPCVNF");
//		Itemcoverexeclusions.add("VPCVLD");
//		Itemcoverexeclusions.add("VPCVFD");
//		Itemcoverexeclusions.add("VPCVXL");
//		Itemcoverexeclusions.add("VPCVFO");
//		Itemcoverexeclusions.add("VPCVM1");
//		Itemcoverexeclusions.add("VPCVDT");
	
	List<RsItemSectionVO> listrsitems = new ArrayList<RsItemSectionVO>();
	    int i=1;
	    Double Suminsuredvalues=0000000000000000000000000.000000000000000000000;
		for(Policyitem item:politems){
			
			RsItemSectionVO onersitem = new RsItemSectionVO();

			if((null!=policies.getLineofbusiness() && policies.getLineofbusiness().length()>1) || 
				(null!=policies.getModeofbusiness() && policies.getModeofbusiness().length()>1)){
				
				OldPolicyVO old = new OldPolicyVO();
				
				old.setIUWP2_OLD_EXP_DT(policies.getLineofbusiness());	

				old.setIUWP2_OLD_INS_CD(policies.getModeofbusiness());
				
				onersitem.setOldPolicyVO(old);			
			}
			
		Set<Iicoverage> setiicoverage = item.getIicoverages();
		String itemno="0000"+i;
		++i;
				
	    onersitem.setIUWP2_ITEM_NO(itemno);
		onersitem.setIUWP2_SECT_NO("01");
		onersitem.setIUWP2_DESC1(item.getPrivatecaritem().getHypothecatedto());
		onersitem.setIUWP2_COVER_CD(item.getPrivatecaritem().getFgCoverCode());
		onersitem.setIUWP2_EMLX(new BigDecimal(item.getPrivatecaritem().getEML()));
		onersitem.setIUWP2_ZIP_CD(String.valueOf(item.getPrivatecaritem().getPincode()));
		onersitem.setIUWP2_TERR_CD(item.getPrivatecaritem().getRegstatecode());
		onersitem.setIUWP2_DED_CODE(policies.getPolicystatus());//"V05"
		onersitem.setIUWP2_DESC12(policies.getPolicyclient().getAlternatemobile());
//		onersitem.setIUWP2_DESC12(Gstnnumber);
		
		RsVehicleVO rsvehicle = new RsVehicleVO();
		
		if(policies.getProductcode().equalsIgnoreCase("VPC")){
			DriverVO driver=new DriverVO();
			Policyclient client=policies.getPolicyclient();
			driver.setIUWP2_DRV_NO("01");
			driver.setIUWP2_DRV_DOB(client.getDob());
			if(null!=client.getMaritalstatus()){
				driver.setIUWP2_DRV_YR_EXP(new BigDecimal(client.getMaritalstatus()));				
			}
			driver.setIUWP2_DRV_LICN_EXPIRY_DT(client.getEmail());
			if(null!=client.getEianNumber()){
				driver.setIUWP2_DRV_AGE(Integer.parseInt(client.getEianNumber()));				
			}
			driver.setIUWP2_DRV_GENDER_CD(client.getGender());
			driver.setIUWP2_DRV_NM(client.getFirstname());
			driver.setIUWP2_DRV_LICN_ISS_DT(client.getIdrefnumber());
			DriverVO[] arrdriver={driver};
			rsvehicle.setDriverVOList(arrdriver);
			
		}
		
		
		
		rsvehicle.setIUWP2_MR_TERR(item.getPrivatecaritem().getZone());
		rsvehicle.setIUWP2_MR_USG_CD(item.getPrivatecaritem().getTypeofusage());
		
		if(item.getPrivatecaritem().getColorofvehicle()!=null){
		rsvehicle.setIUWP2_MR_COLOR(item.getPrivatecaritem().getColorofvehicle());
		}else{
			rsvehicle.setIUWP2_MR_COLOR("0001");
		}
		
		rsvehicle.setIUWP2_MR_CAP_CC(Integer.valueOf(String.valueOf((item.getPrivatecaritem().getEnginecapacity()))));
		rsvehicle.setIUWP2_MR_MODEL(item.getPrivatecaritem().getModelcode());
		rsvehicle.setIUWP2_MR_YR_MFR(item.getPrivatecaritem().getYom());
		rsvehicle.setStrIUWP2_MR_1ST_REG_DT(item.getPrivatecaritem().getRegdate());
		rsvehicle.setIUWP2_MR_REGN_NUM(item.getPrivatecaritem().getRegnum());
		rsvehicle.setIUWP2_MR_CHAS_NUM(item.getPrivatecaritem().getChassisnumber());
		rsvehicle.setIUWP2_MR_ENG_NUM(item.getPrivatecaritem().getEnginenumber());
//		rsvehicle.setIUWP2V_MR_DAY_PARKING(item.getPrivatecaritem().getRegion());
//		rsvehicle.setIUWP2V_MR_ROADS_TYPE(item.getPrivatecaritem().getHypothecationtype());
//		rsvehicle.setIUWP2V_MR_FUEL_TYPE(item.getPrivatecaritem().getFueltype());
		try {
			if(item.getPrivatecaritem().getImtNumbers().length()>30){
				String logno=item.getPrivatecaritem().getImtNumbers().substring(0,30);
				rsvehicle.setIUWP2_MR_LOG_BOOK(logno);
				
			}else{
				rsvehicle.setIUWP2_MR_LOG_BOOK(item.getPrivatecaritem().getImtNumbers());			
			}			
		} catch (Exception e) {
			
		}
		rsvehicle.setIUWP2_MR_SEAT_CAP(
				Integer.valueOf(String.valueOf(item.getPrivatecaritem().getSeatingcapacity())));
		////////// Set one vehicle to rsitem////////////
		onersitem.setRsVehicleVO(rsvehicle);
		

		
		List<CoverageVO> listCoverageVo = new ArrayList<CoverageVO>();
		
	
		if(policies.getProductcode().equalsIgnoreCase("VPC")){
			
		 onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(dff.format(policies.getPolicysuminsuredamount())));
			 
//			if(0==policies.getPolicysuminsuredamount()){
//				onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(policies.getPolicysuminsuredamount()));				
//			}else{
//	           if(String.valueOf(policies.getPolicysuminsuredamount()).contains(".")){
//	        	   BigDecimal bd=new BigDecimal(policies.getPolicysuminsuredamount());
//	        	   String suninsuredamt=bd.toPlainString();
//	        	   String[] covs=suninsuredamt.split("\\.");
//	        	   if(covs[1].length()>6){
//	        		   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(suninsuredamt.substring(0, suninsuredamt.indexOf(".")+7)));
//	        	   }else{
//	        		   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(policies.getPolicysuminsuredamount()));
//	        	   }
//	        	   
//	           }else{
//	        	   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(policies.getPolicysuminsuredamount()));
//	           }
//			}
			 
			for (Iicoverage iicov : setiicoverage) {
				//////// Set one array of itemcoverages to one rs item////////
//				if(Itemcoverexeclusions.contains(iicov.getCode())){
//					continue;				
//				}
				CoverageVO covvo = new CoverageVO();
				covvo.setIUWP3_COVG_CD(iicov.getCode());
				if(iicov.getCode().equalsIgnoreCase("VPCBPR")){
					
				}
				if(iicov.getPremium().contains(".")){				
					String pre=iicov.getPremium();
					String[] covs=pre.split("\\.");
					if(covs[1].length()>6){
						String Premium = pre.substring(0, pre.indexOf(".")+7);
						covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(Premium));						
					}else{
						if(iicov.getCode().startsWith("VPCCM1")){
							covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(0));
						}else{
							covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
						}
												
					}
					
				}else{
				  covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));					
				}
//				if(iicov.getCode().equalsIgnoreCase("VPCPRM")){
//					onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
//				}
				covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
				if(iicov.getCode().equalsIgnoreCase("VPCNCD")){
					covvo.setIUWP3_RT_U(String.valueOf(item.getPrivatecaritem().getNcbpercentage()));
					
				}else if(iicov.getCode().equalsIgnoreCase("VPCCM1")){
					covvo.setIUWP3_RT_U(String.valueOf(iicov.getPremium()==null?"0":iicov.getPremium()));
										
				}else{
					covvo.setIUWP3_RT_U("0");	
				}
				listCoverageVo.add(covvo);
			}				
		}
		
		
		else if(policies.getProductcode().equalsIgnoreCase("VPCV")){
		 onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(dff.format(policies.getPolicysuminsuredamount())));
			
			
//			if(0==policies.getPolicysuminsuredamount()){
//				onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(policies.getPolicysuminsuredamount()));				
//			}else{
//	           if(String.valueOf(policies.getPolicysuminsuredamount()).contains(".")){
//	        	   BigDecimal bd=new BigDecimal(policies.getPolicysuminsuredamount());
//	        	   String suninsuredamt=bd.toPlainString();       	   
//	        	   String[] covs=suninsuredamt.split("\\.");
//	        	   if(covs[1].length()>6){
//	        		   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(suninsuredamt.substring(0, suninsuredamt.indexOf(".")+7)));
//	        	   }else{
//	        		   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(policies.getPolicysuminsuredamount()));
//	        	   }
//	        	   
//	           }else{
//	        	   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(policies.getPolicysuminsuredamount()));
//	           }
//			}
			
			
			for (Iicoverage iicov : setiicoverage) {
//				if(iicov.getCode().equalsIgnoreCase("VPCEXL") || iicov.getCode().equalsIgnoreCase("VPCNCB") || iicov.getCode().equalsIgnoreCase("VPCCM1")
//						
//						|| iicov.getCode().equalsIgnoreCase("VPCVXL")){
//					continue;
//				}
				CoverageVO covvo = new CoverageVO();
					if(iicov.getCode().equalsIgnoreCase("VPCVNC")){
						covvo.setIUWP3_COVG_CD(iicov.getCode());
						covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
						covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
						covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
						covvo.setIUWP3_RT_U(String.valueOf(item.getPrivatecaritem().getNcbpercentage()));
					}else{
//						if(iicov.getCode().equalsIgnoreCase("VPCVPR")){
//							onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
//						}
						if(iicov.getCode().startsWith("VPCVM1")){
							covvo.setIUWP3_COVG_CD(iicov.getCode());
							covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(0));
							covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
							covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
							covvo.setIUWP3_RT_U(iicov.getPremium()==null?"0":iicov.getPremium());							
							
						}else{
							covvo.setIUWP3_COVG_CD(iicov.getCode());
							covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
							covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
							covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
							covvo.setIUWP3_RT_U("0");							

						   }
						}
					listCoverageVo.add(covvo);
				
			}
			
		}
		
		
		else if(policies.getProductcode().equalsIgnoreCase("VGC") || policies.getProductcode().equalsIgnoreCase("VFA")){
			Double Suminsuredvaluesitem=00000000000000.0000000000000000000000000;
			for (Iicoverage iicov : setiicoverage) {
//				if(iicov.getCode().equalsIgnoreCase("VGCXGL") || iicov.getCode().equalsIgnoreCase("VGCWSG")){
//					continue;
//				}
				    CoverageVO covvo = new CoverageVO();
				    if(iicov.getCode().equalsIgnoreCase("VGCNCD") || iicov.getCode().equalsIgnoreCase("VFAVNC")){
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
				    	Suminsuredvaluesitem+=Double.valueOf(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount());
				    	covvo.setIUWP3_RT_U(String.valueOf(item.getPrivatecaritem().getNcbpercentage()));
				    }else if(iicov.getCode().startsWith("VGCCM1") || iicov.getCode().startsWith("VFADIS")){
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(0));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
				    	Suminsuredvaluesitem+=Double.valueOf(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount());
				    	covvo.setIUWP3_RT_U(iicov.getPremium()==null?"0":iicov.getPremium());
				    }
				    
				    else{
				    	covvo.setIUWP3_COVG_CD(iicov.getCode().substring(0,6));
				    	
				    	
						if(iicov.getPremium().contains(".")){
							
							String pre=iicov.getPremium();
							String[] covs=pre.split("\\.");
							if(covs[1].length()>6){
								String Premium = pre.substring(0, pre.indexOf(".")+7);
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(Premium));						
							}else{
							    covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));						
							}
							
						}else{

								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
							
							
						}
				    	
				    	
				    	
				    	
//				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(dff.format(iicov.getPremium()==null?"0":iicov.getPremium())));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
				    	Suminsuredvaluesitem+=Double.valueOf(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount());
				    	covvo.setIUWP3_RT_U("0");	
				    }
					listCoverageVo.add(covvo);					
			}	
			onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(dff.format(Suminsuredvaluesitem)));
			
//			if(0==Suminsuredvaluesitem){
//				onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(Suminsuredvaluesitem));				
//			}else{
//	           if(String.valueOf(Suminsuredvaluesitem).contains(".")){
//	        	   
//	        	   BigDecimal bd=new BigDecimal(Suminsuredvaluesitem);
//	        	   String suninsuredamt=bd.toPlainString();	        	   
//	        	   String[] covs=suninsuredamt.split("\\.");
//	        	   if(covs[1].length()>6){
//	        		   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(suninsuredamt.substring(0, suninsuredamt.indexOf(".")+7)));
//	        		   Suminsuredvalues+=Double.valueOf(suninsuredamt.substring(0, suninsuredamt.indexOf(".")+7));
//	        	   }else{
//	        		   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(Suminsuredvaluesitem));
//	        		   Suminsuredvalues+=Suminsuredvaluesitem;
//	        	   }
//	        	   
//	           }else{
//	        	   onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(Suminsuredvaluesitem));
//	        	   Suminsuredvalues+=Suminsuredvaluesitem;
//	           }
//			}
			
			
			
			Suminsuredvalues+=Double.parseDouble(dff.format(Suminsuredvaluesitem));
			
		     Suminsuredvaluesitem=00000000000000.0000000000000000000000000;
		     
		}
		
		
		else if(policies.getProductcode().equalsIgnoreCase("VOC")){
			onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(dff.format(policies.getPolicysuminsuredamount())));


			for (Iicoverage iicov : setiicoverage) {
//				if(iicov.getCode().equalsIgnoreCase("VOCEXL")){
//					continue;
//				}
				    CoverageVO covvo = new CoverageVO();
				    if(iicov.getCode().equalsIgnoreCase("VOCNCD")){
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
				    	covvo.setIUWP3_RT_U(String.valueOf(item.getPrivatecaritem().getNcbpercentage()));
				    }else if(iicov.getCode().startsWith("VOCCM1")){
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(0));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
				    	covvo.setIUWP3_RT_U(iicov.getPremium()==null?"0":iicov.getPremium());
				    }			    
				    else{
//						if(iicov.getCode().equalsIgnoreCase("VOCBPR")){
//							onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
//						}
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
				    	covvo.setIUWP3_RT_U("0");     	                      
				    }
					listCoverageVo.add(covvo);					
			}
		}
		
		else if(policies.getProductcode().equalsIgnoreCase("VMC")){
			onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(dff.format(policies.getPolicysuminsuredamount())));


			for (Iicoverage iicov : setiicoverage) {
//				if(iicov.getCode().equalsIgnoreCase("VOCEXL")){
//					continue;
//				}
				    CoverageVO covvo = new CoverageVO();
				    if(iicov.getCode().equalsIgnoreCase("VMCNCD")){
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
				    	covvo.setIUWP3_RT_U(String.valueOf(item.getPrivatecaritem().getNcbpercentage()));
				    }else if(iicov.getCode().startsWith("VMCCM1")){
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(0));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
				    	covvo.setIUWP3_RT_U(iicov.getPremium()==null?"0":iicov.getPremium());
				    }			    
				    else{
//						if(iicov.getCode().equalsIgnoreCase("VOCBPR")){
//							onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
//						}
				    	covvo.setIUWP3_COVG_CD(iicov.getCode());
				    	covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
				    	covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
				    	covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
				    	covvo.setIUWP3_RT_U("0");     	                      
				    }
					listCoverageVo.add(covvo);					
			}
		}
		
		CoverageVO [] arrpolcov1 = listCoverageVo.toArray(new CoverageVO[listCoverageVo.size()]);
		
		onersitem.setCoverageVOList(arrpolcov1);
		
		listrsitems.add(onersitem);
   }	
		
		RsItemSectionVO[] Rsiitems = listrsitems.toArray(new RsItemSectionVO[(listrsitems.size())]);
		Fgpolicy.setItemSectionVOList(Rsiitems);
		
		List<SettlementVO> listSettelVo = new ArrayList<SettlementVO>();
		
		if(policies.getProductcode().equalsIgnoreCase("VGC") || policies.getProductcode().equalsIgnoreCase("VFA")){
			Fgpolicy.setPrimeIUWP1_INCR_SI(new BigDecimal(Suminsuredvalues));			
		}else{
			Fgpolicy.setPrimeIUWP1_INCR_SI(new BigDecimal(dff.format(policies.getPolicysuminsuredamount())));
		}
		//new BigDecimal(policies.getPolicysuminsuredamount())
		
		Payment pay=setpayments.iterator().next();

		pay=setpayments.iterator().next();
      
//           String chqno;
           
           if(pay.getPaymenttype().equalsIgnoreCase("CHQ") 
        		   ){  	
        	   
				ChequeVO chequevo = new ChequeVO();//LOKESH
/*				if(null!=pay.getInstrumentnumber() && pay.getInstrumentnumber().length()>0){
					 chqno=pay.getInstrumentnumber();					
				}else{
					chqno=pay.getReceiptnumber().replaceAll("[^\\d.]", "");
				}
				if(chqno == null || chqno.equalsIgnoreCase("")){
					chequevo.setIUWCHQ_CHQ_NO(new BigDecimal(12345));
				}else{
									
				}*/
				chequevo.setIUWCHQ_CHQ_NO(new BigDecimal(pay.getInstrumentnumber()));	
				if(!pay.getPaymentamount().equalsIgnoreCase("null")){
					chequevo.setIUWCHQ_CHQ_AMT(new BigDecimal(pay.getPaymentamount()));					
				}
				if(!pay.getPaymentdate().equalsIgnoreCase("null")){
					chequevo.setIUWCHQ_CHQ_ISSUE_DT(pay.getPaymentdate());					
				}else{
					chequevo.setIUWCHQ_CHQ_ISSUE_DT(policies.getPolstartdate());
				}
				chequevo.setIUWCHQ_BANK_AC_NO("0");
				if(!pay.getInstrumentbank().equalsIgnoreCase("null")){
					chequevo.setIUWCHQ_ISSUING_BANK(pay.getInstrumentbank());					
				}
				if(!policies.getBranchcode().equalsIgnoreCase("null")){
					chequevo.setIUWCHQ_BANK_BR_CD(policies.getBranchcode());					
				}
				chequevo.setIUWCHQ_PAY_TO("RSAIC Limited");
				Fgpolicy.setIUWP1_METH_PAY("CHQ");//LOKESH
				Fgpolicy.setChequeVO(chequevo);
               	   
           }else if(pay.getPaymenttype().equalsIgnoreCase("CARD")){     	   
				CreditCardVO creditcard=new CreditCardVO();
				if(!pay.getInstrumentnumber().equalsIgnoreCase("null")){
					creditcard.setIUWCR_CARD_NUM(pay.getInstrumentnumber());					
				}if(!pay.getInstrumentbank().equalsIgnoreCase("null")){
					creditcard.setIUWCR_CARD_ISSUER(pay.getInstrumentbank());					
				}
				if(!pay.getTRANSCATION_NO().equalsIgnoreCase("null")){
					creditcard.setIUWCR_AUTH_NUM(pay.getTRANSCATION_NO());					
				}if(!pay.getInstrumentexpdt().equalsIgnoreCase("null")){
					creditcard.setIUWCR_CARD_EXP_DT(pay.getInstrumentexpdt());//TO be change on UAT					
				}
				creditcard.setIUWCR_CARD_VER_TEXT("CARD MODE PAYMENT");
				Fgpolicy.setIUWP1_METH_PAY("CARD");
				Fgpolicy.setCreditCardVO(creditcard);
           }else if(pay.getPaymenttype().equalsIgnoreCase("CASH")){
        	   Fgpolicy.setIUWP1_METH_PAY("CASH");
        	   Fgpolicy.setVoucherAmount(new BigDecimal(pay.getPaymentamount()));
           }
           
  /*         else{
				MandateVO bankdebit=new MandateVO();
				if(!pay.getPayeename().equalsIgnoreCase("null")){
					bankdebit.setIUWMD_AC_HOLD_NM1(pay.getPayeename());					
				}
//				bankdebit.setIUWMD_BANK_CD(pay.getDepositingBankCode());
				if(!pay.getPaymentamount().equalsIgnoreCase("null")){
					bankdebit.setIUWMD_BD_AMOUNT(new BigDecimal(pay.getPaymentamount()));					
				}
				bankdebit.setIUWMD_BD_CHARGES(new BigDecimal(0) );
				bankdebit.setIUWMD_BD_CURRENCY("INR");
				if(!pay.getPaymentdate().equalsIgnoreCase("null")){
					bankdebit.setIUWMD_BD_DT(pay.getPaymentdate());					
				}if(!pay.getIfsccode().equalsIgnoreCase("null")){
					bankdebit.setIUWMD_BD_IFSC_CD(pay.getIfsccode());					
				}if(!pay.getMicrcode().equalsIgnoreCase("null")){
					bankdebit.setIUWMD_BD_MICRO_CD(pay.getMicrcode());					
				}if(!pay.getReceiptnumber().equalsIgnoreCase("null")){
					bankdebit.setIUWMD_MANDT_NO(pay.getReceiptnumber());					
				}
				bankdebit.setIUWMD_BD_TRANS_NO(pay.getTRANSCATION_NO());
				Fgpolicy.setIUWP1_METH_PAY("BD");
				Fgpolicy.setMandateVO(bankdebit);
           }*/
	
	for(Payment paym: setpayments){		
		SettlementVO onesettelvo = new SettlementVO();
		onesettelvo.setIUWP1_ACC_CD(policies.getAgentcode());
		onesettelvo.setIUWP1_STL_TYPE("EXISTINGRECT");
//		onesettelvo.setIUWP1_STL_TYPE("NEWRECT");
		onesettelvo.setIUWP1_STL_SRC("RECT");
		onesettelvo.setIUWP1_STL_REF(paym.getReceiptnumber());
		listSettelVo.add(onesettelvo);		
	}
	
	SettlementVO[] arrsettelVo = listSettelVo.toArray(new SettlementVO[listSettelVo.size()]);
		
	Fgpolicy.setSettlementVOList(arrsettelVo);
		

//	usrTxt.setIUWP1_ATEXT2(polic.getPolno()+"000100");//Lokesh polocy No
//	usrTxt.setIUWP1_ATEXT3(politem.getPrivatecaritem().getChassisnumber());
//	usrTxt.setIUWP1_ATEXT4(politem.getPrivatecaritem().getRegcitycode());

	if(!policies.getQuoteno().equalsIgnoreCase("null")){
		
		RsUserTextVO usrTxt = new RsUserTextVO();
		if(oneit.getPrivatecaritem().getRto().toUpperCase().contains("BALRAMPUR (CHATTISGARH)")){
			
		}else{		
			usrTxt.setIUWP1_ATEXT1(oneit.getPrivatecaritem().getRto());//Lokesh Car.RTO   BALRAMPUR (CHATTISGARH)
		}
		
		usrTxt.setIUWP1_ATEXT2(policies.getQuoteno());
		usrTxt.setIUWP1_ATEXT12(policies.getBatchname());
		Fgpolicy.setUserTextVO(usrTxt);
	}
		
	return Fgpolicy;
  }
	
	public FguwResponseVO pushToFG(FguwPolicyVO policyVo,Policy pol, String policyno, String paymentids, EPL_STATUS status, Long id) {
		FguwResponseVO respVo = null;
//		DoMotorNewBusinessLocator loc = new DoMotorNewBusinessLocator(pol.getTransactiontype());
		DoMotorNewBusinessPortTypeProxy prox =new DoMotorNewBusinessPortTypeProxy(pol.getTransactiontype());
		try {
//			respVo = loc.getdoMotorNewBusinessSoapBinding().performMotorNewBusiness(policyVo);
			respVo=prox.performMotorNewBusiness(policyVo);
		} catch (RemoteException /*| ServiceException*/ e) {
			Eapppol.UpdateInsurancepolicyforfail(2,policyno);
			
			commonstatus(status,policyno,paymentids,"N/A",respVo,pol, id);
			
            StringWriter errors = new StringWriter();
            
            e.printStackTrace(new PrintWriter(errors));
             
            String err =errors.toString();
            
            status.setPolicy_errordeatils(e.toString());

			status.setPolicy_requestxml(err);
			status.setPolicy_responsexml("N/A");
			policystatus5.save(status);
			
			
			logger.info(e.toString()+" From Emotor Policy Module");	
		}
		return respVo;
	}


	public String responseToXML(FguwResponseVO respVo) {
		StringBuffer responseBuffer = new StringBuffer();
		responseBuffer.append("<PolicyResponseVO>");
		responseBuffer.append("<status>" + respVo.getStatus() + "</status>");
		responseBuffer.append("<oprId>" + respVo.getOprId() + "</oprId>");
		responseBuffer.append("<polNo>" + respVo.getPolNo() + "</polNo>");
		responseBuffer.append("<endtNo>" + respVo.getEndtNo() + "</endtNo>");
		responseBuffer.append("<prdCd>" + respVo.getPrdCd() + "</prdCd>");
		responseBuffer.append("<errorMsg>" + respVo.getErrorMsg() + "</errorMsg>");
		responseBuffer.append("<successMsg>" + respVo.getSuccessMsg() + "</successMsg>");

		ErrorDetailVO[] errDtlsList = respVo.getErrorDetailVOList();
		if (errDtlsList != null && errDtlsList.length > 0) {
			responseBuffer.append("<ErrorDetails>");
			for (ErrorDetailVO errDtl : errDtlsList) {
				responseBuffer.append("<ErrorDetail>");
				responseBuffer.append("<ErrorCode>" + errDtl.getErrorCode() + "</ErrorCode>");
				responseBuffer.append("<ErrorDesc>" + errDtl.getErrorDesc() + "</ErrorDesc>");
				responseBuffer.append("</ErrorDetail>");
			}
		}
		responseBuffer.append("</ErrorDetails>");
		responseBuffer.append("</PolicyResponseVO>");

		logger.info("Response:: " + responseBuffer.toString());
		return responseBuffer.toString();
	}
	
	
	
	private List<ErrorDetailVO> geterrorcode(FguwResponseVO respVo) {
		List<ErrorDetailVO> errorvodes = new ArrayList<ErrorDetailVO>();
		if(respVo != null){
			ErrorDetailVO[] errDtlsList1 = respVo.getErrorDetailVOList();
			if (null != errDtlsList1 && errDtlsList1.length > 0) {
				for (ErrorDetailVO errDtl1 : errDtlsList1) {
					errDtl1.getErrorCode();
					errorvodes.add(errDtl1);
				}
			}else{
				if(respVo.getErrorMsg()!=null){
					ErrorDetailVO errvo=new ErrorDetailVO();
					errvo.setErrorCode(respVo.getErrorMsg());
					errorvodes.add(errvo);
				}else{
					ErrorDetailVO errvo=new ErrorDetailVO();
					if(respVo.getStatus()!=null && respVo.getStatus().equalsIgnoreCase("SUCCESS")){
						errvo.setErrorCode("SUCCESS");
					}else{
						errvo.setErrorCode("No Error From FG Response VO");
					}
					errorvodes.add(errvo);
				}
			}
		}
		return errorvodes;
	}	
}











//if(respVo.getStatus().equalsIgnoreCase("SUCCESS")){				            	
//	try {
//		
//		PolicyerrorData errset2 = new PolicyerrorData();
//		errset2.setPolicyno(policyno);
//		errset2.setReciptno(receiptnos);
//		errset2.setPolicyid(polid);
//		errset2.setInputXml(stx5);
//		errset2.setProductCode(eapppol.getProductcode());
//		errset2.setAttempttime(new Date());
//		errset2.setReciptid(Paymentids);
//		errset2.setStatus("SUCCESS");
//		errset2.setAttempt(1);
//		errset2.setErrorcode("N/A");
//		errset2.setResponsexml(respXML);
//		errset2.setFromsystem("EAPPS");
//		
//		try {
//			Policy_Status.save(errset2);
//		} catch (Exception e) {
//			try {
//				Policy_Status.save(errset2);
//			} catch (Exception e2) {
//				Policy_Status.save(errset2);
//			}
//		}
//		Eapppol.UpdateInsurancepolicy(1,policyno);
//
//	} catch (Exception e) {}	            	
//}			            
//	
//	else if(respVo.getStatus().equalsIgnoreCase("FAIL")){
//		
//			PolicyerrorData errset3 = new PolicyerrorData();
//			errset3.setPolicyno(policyno);
//			errset3.setReciptno(receiptnos);
//			errset3.setProductCode(eapppol.getProductcode());
//			errset3.setInputXml(stx5);
//			errset3.setPolicyid(polid);
//			errset3.setReciptid(Paymentids);
//			errset3.setAttempttime(new Date());
//			errset3.setAttempt(1);
//			errset3.setStatus("FAIL");
//			errset3.setFromsystem("EAPPS");
//  	if(respXML.contains("E_AC_STLUPLD_0002")){
//				errset3.setStatus("SUCCESS");
//			}
//			else{
//				errset3.setStatus("FAIL");						
//			}
//			if(null!=completeError.toString()){
//				errset3.setErrorcode(completeError.toString());											
//			}else{
//				errset3.setErrorcode(errorcode);
//			}
//			errset3.setResponsexml(respXML);
//			try {
//				Policy_Status.save(errset3);
//			} catch (Exception e) {
//				try {
//					Policy_Status.save(errset3);
//				} catch (Exception e2) {
//					Policy_Status.save(errset3);
//				}
//				
//			}
//
//		}


//Catch Block

//PolicyerrorData errset3 = new PolicyerrorData();
//errset3.setPolicyno(policyno);
//errset3.setReciptno(receiptnos);
//errset3.setProductCode(eapppol.getProductcode());
//errset3.setStatus("Retry Policy With Valid Data");
//errset3.setInputXml("Before Push To FirstGen Handled By Invalid Data Exception");
//errset3.setPolicyid(polid);
//errset3.setReciptid(Paymentids);
//errset3.setAttempttime(new Date());
//errset3.setAttempt(1);
//errset3.setErrorcode("Invalid Request For Policy Creation");
//errset3.setResponsexml(e.getMessage());
//errset3.setFromsystem("EAPPS");
//Policy_Status.save(errset3);	
//Eapppol.UpdateInsurancepolicy(2,policyno);




//PolicyerrorData errset3 = new PolicyerrorData();
//errset3.setPolicyno(policyno);
//errset3.setReciptno(receiptnos);
//errset3.setPolicyid(k);
//errset3.setReciptid(paymentids);
//errset3.setProductCode(pol.getProductcode());
//errset3.setInputXml("N/A");
//errset3.setMfgcode(pol.getMfgcode());
//errset3.setMfgname(pol.getMfgname());
//errset3.setProductId(pol.getProductid());
//errset3.setAttempttime(new Date());
//errset3.setStatus("Retry Policy With Valid Data");
//errset3.setAttempt(1);
//errset3.setErrorcode(e.getMessage().toString());
//errset3.setResponsexml("Policy Did not push to FG Refer errorcode");	
//Policy_Status.save(errset3);
//Eapppol.UpdateInsurancepolicy(2,policyno);
