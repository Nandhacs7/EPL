package com.rs.epl.NB.serviceimpl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.fa.component.policy.EPL_STATUS;
import com.fa.component.policy.EPL_UISTATUS;
import com.fa.component.policy.Iicoverage;
import com.fa.component.policy.Payment;
import com.fa.component.policy.Policy;
import com.fa.component.policy.Policyclient;
import com.fa.component.policy.Policycoverage;
import com.fa.component.policy.Policyitem;
import com.fa.component.policy.Privatecaritem;
import com.rs.epl.NB.oementity.Manufacturermaster;
import com.rs.epl.NB.oementity.TtrnInscovered;
import com.rs.epl.NB.oementity.TtrnInscoveredFordVpc;
import com.rs.epl.NB.oementity.TtrnInscoveredInfoVgc;
import com.rs.epl.NB.oementity.TtrnInscoveredInfoVoc;
import com.rs.epl.NB.oementity.TtrnInsured;
import com.rs.epl.NB.oementity.TtrnPolicy;
import com.rs.epl.NB.oementity.Vfacover;
import com.rs.epl.NB.oemrepository.FordInscover;
import com.rs.epl.NB.oemrepository.InsCovered;
import com.rs.epl.NB.oemrepository.InscoverVGC;
import com.rs.epl.NB.oemrepository.InscoverVOC;
import com.rs.epl.NB.oemrepository.Insuredinfo;
import com.rs.epl.NB.oemrepository.Manufacturer;
import com.rs.epl.NB.oemrepository.Policyinfo;
import com.rs.epl.NB.oemrepository.Vfacov;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.policyrepository.Status;
import com.rs.epl.NB.policyrepository.UIStatus;
import com.rs.epl.NB.service.PolicyStore;
import com.rs.epl.NB.service.ReciptPushToFg;
import com.rs.epl.NB.service.SchedulPushToFG;
import com.rs.epl.NB.service.ScheduleDataSet;

@Service
//@Transactional(readOnly = true)
public class SchedulDataSetimpl implements ScheduleDataSet {	
	@Resource
	private  InsCovered InsCoveredRepo; 
	@Resource
	private Insuredinfo InsuredRepo;
	
	@Resource
	private Policyinfo  Omepolicyrepo;
	
	@Resource
	private PolicyRepository polrepo;
	
//	@Resource
//	private Policyerrorsrepo polerror6;
//	@Resource
//	private ReceiptFaStatusRepository reciptrepo;

	@Resource
	PolicyStore savepolicy;
	
	@Resource
	SchedulPushToFG FirstgenPush;
	
	@Resource
	ReciptPushToFg ReciptPush;
	
		
	@Resource
	private FordInscover Fordcover;

	@Resource
	private InscoverVOC VOCcover;
	@Resource
	private InscoverVGC VGCcover;
	
	@Resource
	private Vfacov VFA;
	
	@Resource
	private Manufacturer mfgs;
	
	@Resource
	UIStatus  oemuistatus;
	
	@Resource
	Status  oemstatus;
	
	@Override
	public void OemToPolicyDataSet(String Polno) throws IllegalArgumentException, IllegalAccessException {
		TtrnInscovered OmeInscover=null;
		Vfacover vfacoverage=null;
		TtrnInscoveredFordVpc fordinscover=null;
		TtrnInscoveredInfoVoc VocCover=null;
		TtrnInscoveredInfoVgc VgcCover=null;
		TtrnPolicy OmePolicy=Omepolicyrepo.findOne(Polno);
		TtrnInsured OmeInsured=InsuredRepo.findOne(Polno);
		Policy poltst=polrepo.findBypolno(Polno); //@ToDo can be direct query 
		EPL_UISTATUS stats=oemuistatus.findOne(Polno);
//		PolicyerrorData poll=polerror6.findBypolicyno(Polno);
		int productid=OmePolicy.getXgenProductid();
		Manufacturermaster mfgmaster=mfgs.findOne(productid);
		String Receiptstatus = "FAS";
		try {
			if(OmePolicy.getRECEIPT_WEB_SERVICE().equalsIgnoreCase("RETRY")
					&& (stats.getReceipt_status().equalsIgnoreCase("FAIL")
				|| stats.getReceipt_status().equalsIgnoreCase("Retry Receipt With Valid Data")
				|| stats.getReceipt_status().equalsIgnoreCase("Invalid Request"))){
				if(null!=poltst){
					polrepo.UpdateGarbage(Polno);													
				}
				int h=oemuistatus.UpdatePolicyGarbage(Polno);
				if(h>=1){
					poltst=null;
					stats=null;
				}
			}			
			 if(OmePolicy.getWebserviceStatus().equalsIgnoreCase("RETRY") && (stats.getPolicy_status().equalsIgnoreCase("FAIL") 
					|| stats.getPolicy_status().equalsIgnoreCase("Retry Policy With Valid Data")
					|| stats.getPolicy_status().equalsIgnoreCase("Invalid Request"))){
				 if(null!=poltst){
				    polrepo.UpdateGarbage(Polno);	
				}
				int h=oemuistatus.UpdateOemPolicyGarbage(Polno);
				if(h>=1){
					poltst=null;	
					stats.setPolicy_status(null);
				}
		   }
						
		} catch (Exception e) {
			
		}
		String productcode=OmePolicy.getProductcode().toUpperCase();
		switch (productcode) {
		case "VPC":
			if(mfgmaster.getMfrcode().toLowerCase().contains("ford") || mfgmaster.getMfrname().toLowerCase().contains("ford"))
			{
				fordinscover=Fordcover.findOne(Polno);
			}		
			else{
				OmeInscover=InsCoveredRepo.findOne(Polno);
			}			
			break;
		case "VPCV":
			OmeInscover=InsCoveredRepo.findOne(Polno);
			break;
		case "VGC":
			VgcCover=VGCcover.findOne(Polno);
			break;
		case "VOC":
			VocCover=VOCcover.findOne(Polno);
			break;
		case "VFA":
			vfacoverage=VFA.findOne(Polno);
		default:
		}	
		
			try{
				if(null==poltst){			
					poltst=policyset(OmeInscover,OmeInsured,OmePolicy,fordinscover,VocCover,VgcCover,mfgmaster,vfacoverage);					
				}				
				else if((null==OmePolicy.getRECEIPT_WEB_SERVICE() || OmePolicy.getRECEIPT_WEB_SERVICE().equalsIgnoreCase("RETRY"))  
						&& null!=stats){
					try {
//						ReceiptFaStatus reciptstaus=reciptrepo.findBypolicyNo(Polno);
						String str3=stats.getReceipt_status();
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Date today = Calendar.getInstance().getTime();        
						String reportDate = df.format(today);
						OmePolicy.setRECEIPT_REQUEST_TIME(reportDate);
						if(str3.equalsIgnoreCase("Invalid Request")){
							OmePolicy.setRECEIPT_WEB_SERVICE("Invalid Data");
						}else{
							OmePolicy.setRECEIPT_WEB_SERVICE(str3);
						}
						
						Omepolicyrepo.saveAndFlush(OmePolicy);	
					}
					catch (Exception e){
						
						System.out.println(e.toString());
						
					}
					
				}				
				else if((null==OmePolicy.getWebserviceStatus() 
						|| OmePolicy.getWebserviceStatus().equalsIgnoreCase("RETRY")) 
						       && null!=stats){
					try {
//						PolicyerrorData polerror=polerror6.findBypolicyno(Polno);
						String str4=stats.getPolicy_status();
						if(str4.equalsIgnoreCase("Invalid Request")){
							OmePolicy.setWebserviceStatus("Invalid Data");
						}else{
							OmePolicy.setWebserviceStatus(str4);
						}
						
						Omepolicyrepo.save(OmePolicy);  
						
					} catch (Exception e) {
						
					}
				}
				else if("SUCCESS".equalsIgnoreCase(OmePolicy.getWebserviceStatus()) && 
		  					("SUCCESS".equalsIgnoreCase(OmePolicy.getRECEIPT_WEB_SERVICE()) || "CD Mode Payment".equalsIgnoreCase(OmePolicy.getRECEIPT_WEB_SERVICE())) 
		  					  && (null==OmePolicy.getMASTERUPDATE() || "RETRY".equalsIgnoreCase(OmePolicy.getMASTERUPDATE())))
                       {
			  try {
					String Mfgcode=poltst.getMfgcode().toUpperCase();
					switch (Mfgcode) {
					case "ADITHYA":
						Omepolicyrepo.MasterAbibl(Polno);
						Omepolicyrepo.OnlyMasterUpdate(Polno);
						break;
					case "FORD":						
						Omepolicyrepo.MasterFord(Polno);
						Omepolicyrepo.OnlyMasterUpdate(Polno);
						break;
					case "HON":
						Omepolicyrepo.MasterHonda(Polno);
						Omepolicyrepo.OnlyMasterUpdate(Polno);	
						break;
					case "MAHINDRA":
						Omepolicyrepo.MasterMahindra(Polno);
						Omepolicyrepo.OnlyMasterUpdate(Polno);	
						break;
					case "MARUTI":
						Omepolicyrepo.MasterMaruti(Polno);
						Omepolicyrepo.OnlyMasterUpdate(Polno);	
						break;
					case "TATA":
						Omepolicyrepo.MasterTata(Polno);
						Omepolicyrepo.OnlyMasterUpdate(Polno);
						break;
					default:
					}		 		  	
				
			} catch (Exception e) {
				
			}
		 }
				else if(("FAIL".equalsIgnoreCase(OmePolicy.getWebserviceStatus()) 
						|| "Receipt Fail".equalsIgnoreCase(OmePolicy.getWebserviceStatus()))&& 
	  		    ("SUCCESS".equalsIgnoreCase(OmePolicy.getRECEIPT_WEB_SERVICE()) || "CD Mode Payment".equalsIgnoreCase(OmePolicy.getRECEIPT_WEB_SERVICE())
	  		    		|| "FAIL".equalsIgnoreCase(OmePolicy.getRECEIPT_WEB_SERVICE())) && 
	  		      (null==OmePolicy.getMASTERUPDATE() || "RETRY".equalsIgnoreCase(OmePolicy.getMASTERUPDATE()))){
					
					try {
						String Mfgcode=poltst.getMfgcode().toUpperCase();
						switch (Mfgcode) {
						case "ADITHYA":
							Omepolicyrepo.MasterAbiblFail(Polno);
							String err=Omepolicyrepo.selecterr(Polno);
							if(null!=err){
								Omepolicyrepo.UpateForFailedPolicy("FAIL",err,"Y",Polno);									
							}else{
								Omepolicyrepo.UpateForFailedPolicy("FAIL","N/A","Y",Polno);
							}
							break;
						case "FORD":
							Omepolicyrepo.MasterFordFail(Polno);
							String err2=Omepolicyrepo.selecterr(Polno);
							if(null!=err2){
								Omepolicyrepo.UpateForFailedPolicy("FAIL",err2,"Y",Polno);									
							}else{
								Omepolicyrepo.UpateForFailedPolicy("FAIL","N/A","Y",Polno);
							}
							
							break;
						case "HON":
							Omepolicyrepo.MasterHondaFail(Polno);
							String err3=Omepolicyrepo.selecterr(Polno);
							if(null!=err3){
								Omepolicyrepo.UpateForFailedPolicy("FAIL",err3,"Y",Polno);									
							}else{
								Omepolicyrepo.UpateForFailedPolicy("FAIL","N/A","Y",Polno);
							}
							break;
						case "MAHINDRA":
							Omepolicyrepo.MasterMahindraFail(Polno);
							String err4=Omepolicyrepo.selecterr(Polno);
							if(null!=err4){
								Omepolicyrepo.UpateForFailedPolicy("FAIL",err4,"Y",Polno);									
							}else{
								Omepolicyrepo.UpateForFailedPolicy("FAIL","N/A","Y",Polno);
							}
							break;
						case "MARUTI":
							Omepolicyrepo.MasterMarutiFail(Polno);
							String err5=Omepolicyrepo.selecterr(Polno);
							if(null!=err5){
								Omepolicyrepo.UpateForFailedPolicy("FAIL",err5,"Y",Polno);									
							}else{
								Omepolicyrepo.UpateForFailedPolicy("FAIL","N/A","Y",Polno);
							}
							break;
						case "TATA":
							Omepolicyrepo.MasterTataFail(Polno);
							String err6=Omepolicyrepo.selecterr(Polno);
							if(null!=err6){
								Omepolicyrepo.UpateForFailedPolicy("FAIL",err6,"Y",Polno);									
							}else{
								Omepolicyrepo.UpateForFailedPolicy("FAIL","N/A","Y",Polno);
							}
							break;
						default:
						}		 		  					
						
					} catch (Exception e) {
					}
				} 
				
			if(null!=stats && null!=stats.getReceipt_status()){
				Receiptstatus=stats.getReceipt_status();
			}
				
		    if(null!=poltst && (stats == null || stats.getReceipt_status().equals("RETRY"))){
					Receiptstatus= ReciptPush.ReciptpushToFg(poltst,oemstatus);						
			}
		    if(null!=stats){
		    	if(null!=poltst && stats.getPolicy_status() == null  && (Receiptstatus.equalsIgnoreCase("SUCCESS") || 
		    			stats.getReceipt_status().equalsIgnoreCase("SUCCESS") || poltst.getSETTLEMENT_TYPE().equalsIgnoreCase("CD"))){
		    		FirstgenPush.NewBussinessPushToFg(poltst,oemstatus);
		    	}			    	
		    }else{
		    	if(null!=poltst && (Receiptstatus.equalsIgnoreCase("SUCCESS") 
		    			|| poltst.getSETTLEMENT_TYPE().equalsIgnoreCase("CD"))){
		    		FirstgenPush.NewBussinessPushToFg(poltst,oemstatus);
		    }				
	   }
}    
			catch (Exception e) {	
				
				int upno=polrepo.Updateflag("true");
				
		         while(upno==0){
		        	 upno=polrepo.Updateflag("true");
		         }
				

            EPL_STATUS sta= new EPL_STATUS();
                 
                 sta.setPolicyno(Polno);
                 
                 sta.setReceiptno(OmePolicy.getCbc());
                 
                 sta.setReceipt_status("Invalid Request");
                 
                 sta.setPolicy_status("Invalid Request");
                 
                 StringWriter errors = new StringWriter();
                 
                e.printStackTrace(new PrintWriter(errors));
                 
                String err =errors.toString();
                 
                 sta.setPolicy_requestxml(err);
                 
                 sta.setReceipt_requestxml("N/A");
                 
                 sta.setReceipt_responsexml("N/A");
                 
                 sta.setPolicy_responsexml("N/A");
                                 
                 sta.setPolicy_errordeatils(e.toString());
                 
                 sta.setReceipt_errordetails(e.getMessage());
                 
                sta.setPolicy_attempt_time(new Date());
                
                sta.setReceipt_attempt_time(new Date());
                 
                 sta.setFromsysystem("OEM");
                 
                 sta.setProductcode(OmePolicy.getProductcode());
                 
                 sta.setProductid(String.valueOf(OmePolicy.getXgenProductid()));
                 
                 sta.setMfgcode(mfgmaster.getMfrcode());
                 
                 sta.setMfgname(mfgmaster.getMfrname());
               
               sta.setTransctiontype("NB");
               
               oemstatus.save(sta);   
         
	Omepolicyrepo.UpdateForException("Retry With Valid Data", e.getMessage(), "N/A", "Retry With Valid Data", "N",Polno);
			}

		
		} 
	private Policy policyset(TtrnInscovered omeInscover, TtrnInsured omeInsured,
			TtrnPolicy omePolicy, TtrnInscoveredFordVpc fordinscover, 
			TtrnInscoveredInfoVoc vocCover2, TtrnInscoveredInfoVgc vgcCover2, Manufacturermaster mfgmaster, Vfacover vfacoverage) throws Exception {		
		    
		        Policy pol=new Policy();			 
				 pol.setProductid(String.valueOf(mfgmaster.getProductid()));
				 pol.setMfgcode(mfgmaster.getMfrcode());
				 pol.setMfgname(mfgmaster.getMfrname());
				 pol.setTransactiontype("NB");
		 
		 pol.setPreviouspolno(omePolicy.getOldPolNum());
		 if(omeInscover!=null){
			 pol.setPolicystatus(omeInscover.getDeductible());	
			 if(null!=omeInscover.getOldinsured() && omeInscover.getOldinsured().length()>8){
				 pol.setModeofbusiness(omeInscover.getOldinsured().substring(0,8));
			 }else{
				 pol.setModeofbusiness(omeInscover.getOldinsured());				 
			 }
			 pol.setLineofbusiness(omeInscover.getOldpolexp());
		 }
		 else if(fordinscover!=null){
			 pol.setPolicystatus(fordinscover.getDeductible());
			 if(null!=fordinscover.getOldinsured() && fordinscover.getOldinsured().length()>8){
				 pol.setModeofbusiness(fordinscover.getOldinsured().substring(0,8));
			 }else{
				 pol.setModeofbusiness(fordinscover.getOldinsured());				 
			 }
			 pol.setLineofbusiness(fordinscover.getOldpolexp());
		 }else if(vocCover2!=null){
			 pol.setPolicystatus(vocCover2.getDeductible());
			 if(null!=vocCover2.getOldinsured() && vocCover2.getOldinsured().length()>8){
				 pol.setModeofbusiness(vocCover2.getOldinsured().substring(0,8));
			 }else{
				 pol.setModeofbusiness(vocCover2.getOldinsured());				 
			 }
			 pol.setLineofbusiness(vocCover2.getOldpolexp());			 
		 }else if(vgcCover2!=null){
			 pol.setPolicystatus(vgcCover2.getDeductible());
			 if(null!=vgcCover2.getOldinsured() && vgcCover2.getOldinsured().length()>8){
				 pol.setModeofbusiness(vgcCover2.getOldinsured().substring(0,8));
			 }else{
				 pol.setModeofbusiness(vgcCover2.getOldinsured());				 
			 }
			 pol.setLineofbusiness(vgcCover2.getOldpolexp());
		 }else if(vfacoverage!=null){
			 pol.setPolicystatus(vfacoverage.getDeductible());
			 if(null!=vfacoverage.getOldinsured() && vfacoverage.getOldinsured().length()>8){
				 pol.setModeofbusiness(vfacoverage.getOldinsured().substring(0,8));
			 }else{
				 pol.setModeofbusiness(vfacoverage.getOldinsured());				 
			 }
			 pol.setLineofbusiness(vfacoverage.getOldpolexp());
		 }
		 if(null==pol.getProductid() && null==pol.getMfgname()){
			 pol.setProductid(String.valueOf(omePolicy.getXgenProductid()));
			 pol.setMfgcode("Mfg Code Not Avalible In Masters");
			 pol.setMfgname("Mfg Name Not Avalible In Masters");
		 }
		 if(null!=omePolicy.getEffectivedate()){
			 pol.setEffectivedate(omePolicy.getEffectivedate());
			 
		 }else{
			 throw new Exception("EffectiveDate is mendatory");
		 }
		 if(null!=omePolicy.getProductcode() && null!=omePolicy.getAccountcode() && null!=omePolicy.getPolicyno()){
			 pol.setProductcode(omePolicy.getProductcode());			 
			 pol.setAgentcode(omePolicy.getAccountcode());
			 pol.setPolno(omePolicy.getPolicyno());
			 pol.setProposalno(omePolicy.getInvoiceNUmber());
		 }
		 else{
			 throw new Exception("Productcode,AccountCode,Policyno Should not be null");  
		 }
		 if(null!=omePolicy.getBranch() && null!=omePolicy.getIncrementalsi() && null!=omePolicy.getExpirydate()){
			 pol.setBranchcode(omePolicy.getBranch());			 
			 pol.setPolicysuminsuredamount(omePolicy.getIncrementalsi());
			 String polExpireDate=omePolicy.getExpirydate();
			 pol.setPolExpTime(omePolicy.getExpirytime());
			 pol.setPolexpirydate(polExpireDate);
		 }
		 else{
			 throw new Exception("Branch,Incrementalsi,Expirydate Should not be null");  
		 }
		 if(null!=omePolicy.getInceptiondate() && null!=omePolicy.getInceptiontime() && null!=omePolicy.getProposaldate()){
			 pol.setPolstartdate(omePolicy.getInceptiondate(),omePolicy.getInceptiontime());		 
			 pol.setProposalDate(omePolicy.getProposaldate());			 
		 }
		 else{
			 
			 throw new Exception("Inceptiondate,Inceptiontime,Proposaldate Should not be null");  
		 }
		 if(null!=omePolicy.getIssuedate() && null!=omePolicy.getAccountdate() && null!=omePolicy.getUnderwritingyear()){
			 pol.setCreationdate(omePolicy.getIssuedate());	
			 pol.setAccountDate(omePolicy.getAccountdate());
			 pol.setUwyr(omePolicy.getUnderwritingyear());			 
		 }
		 else{
			 throw new Exception("IssueDate,AccountDate,UnderWritingYear Should not be null");  
		 }
		 pol.setSETTLEMENT_TYPE(omePolicy.getSettlementType());
		 pol.setBdocode(omePolicy.getOtherparty2());
		 pol.setOacode(omePolicy.getOragent());
		 pol.setTransactiontype("NB");
		 Policyclient polclient= CommonpolicyclientSet(omeInsured,omePolicy);
		 polclient.setPolicies(pol);
		 pol.setPolicyclient(polclient);
		 Payment pay=paymentDataSet(omePolicy);
		 Set<Payment> paymentset=new HashSet<Payment>();
		 paymentset.add(pay);
		 pol.setPayments(paymentset);
		 Set<Policyitem> polItem=commonPolicyItemSet(omePolicy,/* omeDriver,*/omeInscover,fordinscover,vocCover2,vgcCover2,vfacoverage);
		 pol.setPolicyitems(polItem);
		 Policycoverage polcoverage1=new Policycoverage();
		 polcoverage1.setCode("ZDILCM");
		 polcoverage1.setPremium(omePolicy.getZdilcm());		 
		 Policycoverage polcoverage2=new Policycoverage();
		 polcoverage2.setCode("ZCLD");
		 polcoverage2.setPremium(omePolicy.getZcld());		 
		 Policycoverage polcoverage3=new Policycoverage();
		 polcoverage3.setCode("ZSTAX");
		 polcoverage3.setPremium(omePolicy.getZstax());	 
		 Policycoverage polcoverage4=new Policycoverage();
		 polcoverage4.setCode("ZEDCS");
		 polcoverage4.setPremium(omePolicy.getZedcs()); 		 
		 Policycoverage polcoverage5=new Policycoverage();
		 polcoverage5.setCode("ZCM");
		 polcoverage5.setPremium(omePolicy.getZcm()); 
		 Policycoverage polcoverage6=new Policycoverage();
		 polcoverage6.setCode("Zcmtx");
		 polcoverage6.setPremium(omePolicy.getZcmtx()); 
     	 Policycoverage polcoverage7=new Policycoverage();
     	 polcoverage7.setCode("ZOVCM");
     	 polcoverage7.setPremium(omePolicy.getZovcm()); 
		 Policycoverage polcoverage8=new Policycoverage();
		 polcoverage8.setCode("ZWROFF");
		 polcoverage8.setPremium(omePolicy.getZwroff()); 		 
		 Policycoverage polcoverage9=new Policycoverage();
		 polcoverage9.setCode("ZOCMTX");
		 polcoverage9.setPremium(omePolicy.getZocmtx());		 
		 Policycoverage polcoverage10=new Policycoverage();
		 polcoverage10.setCode("ZSTDTY");
		 polcoverage10.setPremium(omePolicy.getZstdty());		 
		 Policycoverage polcoverage11=new Policycoverage();
		 polcoverage11.setCode("ZSDEXP");
		 polcoverage11.setPremium(omePolicy.getZsdexp());				 
		 Policycoverage polcoverage12=new Policycoverage();
		 polcoverage12.setCode("ZKCESS");
		 polcoverage12.setPremium(omePolicy.getZkcess());
		 
		 Policycoverage polcoverage13=new Policycoverage();
		 polcoverage13.setCode("ZSGST");
		 polcoverage13.setPremium(omePolicy.getZSGST());

		 Policycoverage polcoverage14=new Policycoverage();
		 polcoverage14.setCode("ZCGST");
		 polcoverage14.setPremium(omePolicy.getZCGST());

		 Policycoverage polcoverage15=new Policycoverage();
		 polcoverage15.setCode("ZIGST");
		 polcoverage15.setPremium(omePolicy.getZIGST());
		 
		 
		 Policycoverage polcoverage16=new Policycoverage();
		 polcoverage16.setCode("ZUTGST");
		 polcoverage16.setPremium(omePolicy.getZUGST());

		 
		 Set<Policycoverage> polset=new HashSet<Policycoverage>();
		 polset.add(polcoverage1);
		 polset.add(polcoverage2);
		 polset.add(polcoverage3);
		 polset.add(polcoverage4);
		 polset.add(polcoverage5);
		 polset.add(polcoverage6);
		 polset.add(polcoverage7);
		 polset.add(polcoverage8);
		 polset.add(polcoverage9);
		 polset.add(polcoverage10);
		 polset.add(polcoverage11);
		 polset.add(polcoverage12);
		 polset.add(polcoverage13);
		 polset.add(polcoverage14);
		 polset.add(polcoverage15);
		 polset.add(polcoverage16);
		 pol.setPolicycoverages(polset);

		 savepolicy.savepol(pol,polrepo);
	
//		   polsave.savepol(pol,entityManager1);
		   
//		   polsave=null;
		 System.out.println("----policy persisted successfully----");	
		 
		return pol; 
	}
	
	private Payment paymentDataSet(TtrnPolicy omePolicy) throws Exception {
		Payment pay=new Payment();
		if(omePolicy.getSettlementType().equalsIgnoreCase("CD")){
			try {
				if(null!=omePolicy.getRecieptNumber()){
					pay.setReceiptnumber(omePolicy.getRecieptNumber());			
				}
				else{
					pay.setReceiptnumber(omePolicy.getCbc());
				}
			} catch (Exception e) {
				
			}

			
			if(null!=omePolicy.getPaymentmethod()){
				pay.setPaymenttype(omePolicy.getPaymentmethod());			
			}
			else{
				throw new Exception("payment method Should not be null");
			}
			
			if(null!=omePolicy.getCbc() && null!=omePolicy.getBankCode()){
				pay.setCBC(omePolicy.getCbc());							
				pay.setDepositingBankCode(omePolicy.getBankCode());
			}else{
				throw new Exception("Cbc value and Deposit Bank Code Should not be null in CD Mode payment");
			}
			
			pay.setPaymenttype(omePolicy.getPaymentmethod());	
			if(omePolicy.getCardnum().length()<16){
				int nos=16-omePolicy.getCardnum().length();
				
				StringBuilder st=new StringBuilder(omePolicy.getCardnum());
				for(int l=0;l<=nos;l++){
					st.append("0");
				}

				pay.setInstrumentnumber(st.toString());
				
			}else{
				pay.setInstrumentnumber(omePolicy.getCardnum());				
			}
			pay.setInstrumentexpdt(omePolicy.getCardexp());
			pay.setPaymentdate(omePolicy.getChqIssueDt());
			pay.setPaymentamount(omePolicy.getChqAmt());
		    pay.setInstrumentbank(omePolicy.getBankName());
			pay.setReceipt_amount(omePolicy.getReceiptAmount());
			pay.setInstrumenttype(omePolicy.getCardType());
			pay.setTRANSCATION_NO(omePolicy.getAuthNumber());	

			
		}else{

			try {
				if(null!=omePolicy.getRecieptNumber()){
					pay.setReceiptnumber(omePolicy.getRecieptNumber());			
				}
				else{
					pay.setReceiptnumber(omePolicy.getCbc());
				}
			} catch (Exception e) {
				
			}
	         
			if(null!=omePolicy.getPaymentmethod()){
				pay.setPaymenttype(omePolicy.getPaymentmethod());			
			}
			else{
				throw new Exception("payment method Should not be null");
			}
//			=="CARD"
			if(omePolicy.getPaymentmethod().equalsIgnoreCase("CARD")){
				if(null!=omePolicy.getCardnum() && null!=omePolicy.getCardexp() && null!=omePolicy.getCbc()){
					pay.setPaymenttype(omePolicy.getPaymentmethod());
					if(omePolicy.getCardnum().length()<16){
						String cardnum=StringUtils.rightPad(omePolicy.getCardnum(),16,"0"); 
						pay.setInstrumentnumber(cardnum);
						
					}else{
						pay.setInstrumentnumber(omePolicy.getCardnum());				
					}
					pay.setInstrumentexpdt(omePolicy.getCardexp());
					pay.setCBC(omePolicy.getCbc());
				}else{
					throw new Exception("Cardnum,CardExpdate,Cbc value Should not be null");
				}
				pay.setPaymentdate(omePolicy.getChqIssueDt());
			  if(null!=omePolicy.getChqAmt() && null!=omePolicy.getBankName()){
				  pay.setPaymentamount(omePolicy.getChqAmt());
				  pay.setInstrumentbank(omePolicy.getBankName());			  
			  }else{
				  throw new Exception("ChqAmt and BankName Should Not Be null ");
			  }
			  pay.setBankCity(omePolicy.getBankCit());
			  if(null!=omePolicy.getBankCode() && null!=omePolicy.getCardType() && null!=omePolicy.getAuthNumber()){
				  pay.setReceipt_amount(omePolicy.getReceiptAmount());
				  pay.setDepositingBankCode(omePolicy.getBankCode());
				  pay.setInstrumenttype(omePolicy.getCardType());
				  pay.setTRANSCATION_NO(omePolicy.getAuthNumber());			  
			  }else{
				  throw new Exception("BankCode,CardType,AuthNumber Should Not Be Null");
			  }
			}
			else if(omePolicy.getPaymentmethod().equalsIgnoreCase("BD")) {
				try {
					pay.setIfsccode(omePolicy.getBdIfscCode());
					pay.setMicrcode(omePolicy.getBdMicrCode());
					if(null!=omePolicy.getBdDepositBank()  && null!=omePolicy.getBdAmount()  && null!=omePolicy.getBdTransactionNumber() &&  null!=omePolicy.getCbc()){
						pay.setDepositingBankCode(omePolicy.getBdDepositBank());
						pay.setPaymentamount(omePolicy.getBdAmount());
						pay.setTRANSCATION_NO(omePolicy.getBdTransactionNumber());
						pay.setCBC(omePolicy.getCbc());					
					}
					else{
						  throw new Exception("BdDepositBank,BdAmount,BdTransactionNumber,Cbc Should Not Be Null");
					  }
					pay.setBankCity(omePolicy.getBankCit());				
					if(null!=omePolicy.getBankdebitReceivedDate() && null!=omePolicy.getBankName() && null!=omePolicy.getBdAccountName()){
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Date BDdate = omePolicy.getBankdebitReceivedDate();
						pay.setPaymentdate(df.format(BDdate));
						pay.setPayeename(omePolicy.getBdAccountName());
						pay.setInstrumentbank(omePolicy.getBankName());
						
					}
					else{
						throw new Exception("BankdebitReceivedDate,BankName,BdAccountName Should not be null");
					}
				} catch (Exception e) {
					
				}
			}
			else{
				if(null!=omePolicy.getChqNo() && null!=omePolicy.getCbc() && null!=omePolicy.getChqIssueDt() && null!=omePolicy.getChqAmt()){
					pay.setInstrumentnumber(omePolicy.getChqNo());			
					pay.setCBC(omePolicy.getCbc());
					pay.setPaymentdate(omePolicy.getChqIssueDt());
					pay.setPaymentamount(omePolicy.getChqAmt());				
				}
				else{
					throw new Exception("ChqNo,Cbc,ChqIssueDt,ChqAmt Should Not Be Null");
				}
//				pay.setInstrumentexpdt(omePolicy.getCardexp());
				pay.setTRANSCATION_NO(omePolicy.getAuthNumber());				
				if(null!=omePolicy.getBankName() && null!=omePolicy.getBankCode()){
					pay.setInstrumentbank(omePolicy.getBankName());
					pay.setDepositingBankCode(omePolicy.getBankCode());
				}else{
					throw new Exception("BankName,BankCode,AuthNumber Should Not Be null");
				}
				pay.setBankCity(omePolicy.getBankCit());
			    pay.setReceipt_amount(omePolicy.getReceiptAmount());
//			    pay.setInstrumenttype(omePolicy.getCardType());
			}			
		}		
		return pay;
	}
	private Policyclient CommonpolicyclientSet(TtrnInsured omeInsured, TtrnPolicy omePolicy) throws Exception {
		Policyclient polclient=new Policyclient();
//       	 Clientnominee clientNom=new Clientnominee();
       	 if(null!=omePolicy.getNewclient() && null!=omePolicy.getClientcode() && null!=omeInsured.getClienttype()){
         if(omePolicy.getNewclient().equalsIgnoreCase("Y")){
       		 polclient.setIsexistingclient(true); 
       	 }
       	 else{
       		 polclient.setIsexistingclient(false);
       	 }
         polclient.setCode(omePolicy.getClientcode());
       	 if(omeInsured.getClienttype().equalsIgnoreCase("I")){
       		 polclient.setIscorporateclient(false); 
       	 }else{
       		 polclient.setIscorporateclient(true);
       	 }
       }
       	 else{
       		throw new Exception("NewClient,clientcode,clienttype should not be null");
       	 }
       	if(null!=omeInsured.getStatecode()){
       		polclient.setStatecode(omeInsured.getStatecode());       		
       	}else{
       		throw new Exception("Client State code should not blank");
       	}
//       	 polclient.setAadharNumber(omePolicy.getAadhaarcardnumber());
//       	 polclient.setPannumber(omePolicy.getPsppannumber());
       	 polclient.setAddress1(omeInsured.getClientaddr1());
       	 polclient.setAddress2(omeInsured.getClientaddr2());
       	 polclient.setAddress3(omeInsured.getClientaddr3());
       	 polclient.setAddress4(omeInsured.getClientaddr4());
       	 polclient.setPincode(omeInsured.getClientpincode());
//       	 polclient.setPrimarymobile(omeInsured.getPhone());
       	if(omeInsured.getClienttype().equalsIgnoreCase("I")){
       		polclient.setFirstname(omeInsured.getClientfirstname());
      	 }
      	 else{
      		polclient.setFirstname(omeInsured.getCorporatename());
      	 }
       	if(polclient.getFirstname()!= null && polclient.getFirstname().length()>30){
       		polclient.setFirstname(polclient.getFirstname().substring(0,30));
       	}
       	 polclient.setMiddlename(omeInsured.getClientmiddlename());
       	 polclient.setLastname(omeInsured.getClientlastname());
//       	 polclient.setAlternatemobile(omeInsured.getHandphone());       	 
//       	 polclient.setOccupation(omeInsured.getOccupation());
//       	 polclient.setEmail(omeInsured.getClientemailid());
//       	 clientNom.setGurdianName(omeInsured.getGuardianname());
//       	 polclient.setClientnominee(clientNom);
		return polclient;
       }
	private Set<Policyitem> commonPolicyItemSet(TtrnPolicy omePolicy,/* TtrnDriver omeDriver ,*/
			TtrnInscovered omeInscover, TtrnInscoveredFordVpc fordinscover, TtrnInscoveredInfoVoc vocCover2, TtrnInscoveredInfoVgc vgcCover2, Vfacover vfacoverage) throws Exception {
		Privatecaritem pcar=null;
		Set<Iicoverage> icoverage=null;
		Policyitem polItem=new Policyitem();
//		   ItemDriver iDriver=new ItemDriver();
//		   try {
//			   if(null!=omeDriver.getDriverno()){
//				   iDriver.setDRIVERNO(omeDriver.getDriverno());
//				   polItem.setDriverdetail(iDriver);		   							   
//			   }
//			   else{
//				   iDriver.setDRIVERNO("01");
//				   polItem.setDriverdetail(iDriver);	
//			   }
//		} catch (Exception e) {
//			
//		}
		   String productcode=omePolicy.getProductcode().toUpperCase();
			switch (productcode) {
			case "VPC":
				 if(omeInscover!=null){
			           pcar=CarSet(omePolicy,omeInscover);
			           pcar.setPolitem(polItem);
		               icoverage=coverageSet(omeInscover,productcode);
				   }
				    else if(fordinscover!=null){
					   pcar=FordCarset(fordinscover,omePolicy);
					   pcar.setPolitem(polItem);
					   icoverage=FordcoverageSet(fordinscover);
				   }
				break;
			case "VPCV":
		           pcar=CarSet(omePolicy,omeInscover);
		           pcar.setPolitem(polItem);
	               icoverage=coverageSet(omeInscover,productcode);
				break;
			case "VGC":
				pcar=VGCCarset(vgcCover2,omePolicy);
				pcar.setPolitem(polItem);
				icoverage=VGCcoverageSet(vgcCover2);
				break;
			case "VOC":
				pcar=VOCCarset(vocCover2,omePolicy);
				pcar.setPolitem(polItem);
			    icoverage=VOCcoverageSet(vocCover2);
				break;
			case "VFA":
				pcar=VFACarset(vfacoverage,omePolicy);
				pcar.setPolitem(polItem);
			    icoverage=VFAcoverageSet(vfacoverage);
				
			default:
			}		  
		   polItem.setPrivatecaritem(pcar);
		   polItem.setIicoverages(icoverage);
		   Set<Policyitem> spolitem=new HashSet<Policyitem>();
		   spolitem.add(polItem);
		 return spolitem;

	}
private Set<Iicoverage> coverageSet(TtrnInscovered omeInscover, String productcode) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
//		HashMap<String,String> coverageValueMap = new HashMap<String,String>();
//		Field[] fields = omeInscover.getClass().getDeclaredFields();	
		 Set<Iicoverage> iicoverageSet=new HashSet<Iicoverage>();
		if(productcode.equalsIgnoreCase("VPC")){
			ArrayList<String> vpcvoverages= new ArrayList<String>();
			vpcvoverages.add("vpcdep");		
			vpcvoverages.add("vpcprm");
			vpcvoverages.add("vpctpl");			
			vpcvoverages.add("vpcund");
			vpcvoverages.add("vpctdd");
			vpcvoverages.add("vpcexg");
			vpcvoverages.add("vpcnea");
			vpcvoverages.add("vpclle");
			vpcvoverages.add("vpceas");
			vpcvoverages.add("vpcfor");
			vpcvoverages.add("vpcpnd");
			vpcvoverages.add("vpcwsg");
			vpcvoverages.add("round2");
			vpcvoverages.add("vpcnmd");
			vpcvoverages.add("vpcaad");
			vpcvoverages.add("vpctow");
			vpcvoverages.add("vpcke2");
			vpcvoverages.add("vpcatd");
			vpcvoverages.add("vpcfbg");
			vpcvoverages.add("VPCCM1");
			vpcvoverages.add("round1");
			vpcvoverages.add("vpcncd");
			vpcvoverages.add("vpcves");
			vpcvoverages.add("vpcncb");
			vpcvoverages.add("vpcphd");
			vpcvoverages.add("vpcke1");
			vpcvoverages.add("vpcpod");
			vpcvoverages.add("vpcexl");
			vpcvoverages.add("vpceng");
			vpcvoverages.add("vpclrt");
			vpcvoverages.add("vpctrl");
			vpcvoverages.add("vpcinv");
			vpcvoverages.add("vpccm2");
			vpcvoverages.add("vpclsc");
			vpcvoverages.add("vpcbag");
			vpcvoverages.add("vpclld");
			vpcvoverages.add("vpccng");
			vpcvoverages.add("vpccvd");
			vpcvoverages.add("vpcdte");
			vpcvoverages.add("vpcgas");
       for(String cov:vpcvoverages){
    	   Iicoverage icov=new Iicoverage();
    	   Object value=null;
    	   Object sivalue=null;
    	   Object dedvalue=null;
    	   try {
    		   value = PropertyUtils.getProperty(omeInscover, cov);
    		   sivalue = PropertyUtils.getProperty(omeInscover, "si"+cov);
    		   dedvalue=PropertyUtils.getProperty(omeInscover, "deductibles"+cov);
			
		} catch (Exception e) {
			
		}
    	   icov.setCode(cov.toUpperCase());
    	   if(null!=value){
    		   icov.setPremium(value.toString());    		   
    	   }
    	   icov.setSuminsuredname("SI"+cov.toUpperCase());
    	   if(null!=sivalue){
    		   icov.setSuminsuredamount(sivalue.toString());    		   
    	   }
    	   icov.setDeductiblename("DEDUCTIBLES"+cov);
    	   if(null!=dedvalue){
    		   icov.setDeductibleamount(dedvalue.toString());
    	   }
    	   iicoverageSet.add(icov);
    	   
       }
			
		}else{			
			ArrayList<String> vpcvcoverages= new ArrayList<String>();
			vpcvcoverages.add("vpcvgs");
			vpcvcoverages.add("vpcvfo");
			vpcvcoverages.add("vpcvea");
			vpcvcoverages.add("vpcvtm");
			vpcvcoverages.add("vpcvnp");
			vpcvcoverages.add("vpcvne");
			vpcvcoverages.add("vpcvlp");
			vpcvcoverages.add("vpcvfg");
			vpcvcoverages.add("vpcvfd");
			vpcvcoverages.add("vpcvop");
			vpcvcoverages.add("vpcvxg");
			vpcvcoverages.add("vpcvpr");
			vpcvcoverages.add("vpcvnc");
			vpcvcoverages.add("vpcvm1");
			vpcvcoverages.add("vpcvxl");
			vpcvcoverages.add("vpcvpn");
			vpcvcoverages.add("vpcvve");
			vpcvcoverages.add("vpcvat");
			vpcvcoverages.add("vpcvll");
			vpcvcoverages.add("vpcvnf");
			vpcvcoverages.add("vpcvde");
			vpcvcoverages.add("vpcvtp");
			vpcvcoverages.add("vpcvws");
			vpcvcoverages.add("vpcvlw");
			vpcvcoverages.add("vpcvld");
			vpcvcoverages.add("vpcvcn");
			vpcvcoverages.add("vpvtow");
			vpcvcoverages.add("round1");
			vpcvcoverages.add("round2");
    
		       for(String cov:vpcvcoverages){
		    	   Iicoverage icov=new Iicoverage();
		    	   Object dedvalue=null;
		    	   Object value=null;
		    	   Object sivalue=null;
		    	   try {
			    	   value= PropertyUtils.getProperty(omeInscover, cov);
			    	   sivalue= PropertyUtils.getProperty(omeInscover, "si"+cov);
		    		   dedvalue = PropertyUtils.getProperty(omeInscover, "deductibles"+cov);			
				    } catch (Exception e) {
				    	
				   }
		    	   icov.setCode(cov.toUpperCase());
		    	   if(null!=value){
		    		   icov.setPremium(value.toString());    		   
		    	   }
		    	   icov.setSuminsuredname("SI"+cov.toUpperCase());
		    	   if(null!=sivalue){
		    		   icov.setSuminsuredamount(sivalue.toString());    		   
		    	   }
		    	   icov.setDeductiblename("DEDUCTIBLES"+cov);
		    	   if(null!=dedvalue){
		    		   icov.setDeductibleamount(dedvalue.toString());
		    	   }
		    	   iicoverageSet.add(icov);
		    	   
		       }
			
			
		}
		return iicoverageSet;
	}
	private Privatecaritem CarSet(TtrnPolicy omePolicy, TtrnInscovered omeInscover) throws Exception {
		Privatecaritem pcar=new Privatecaritem();
		pcar.setPRODUCTCODE(omePolicy.getProductcode());
		
		pcar.setDomicile(omePolicy.getDomicile());
		pcar.setMostlydrivenarea(omeInscover.getGstnumber());
		if(null!=omeInscover.getItemsi()){
			pcar.setRto(omeInscover.getRegistringauthority());
			pcar.setNcbpercentage(omeInscover.getNcdgrade());
			pcar.setIdv(omeInscover.getItemsi());			
		}else{
			
			throw new Exception("Itemsi Should Not Be null");
		}
		pcar.setHypothecatedto(omeInscover.getHypothecatedto());
		if(null!=omeInscover.getTerritory2() && null!=omeInscover.getTerritorystate() && null!=omeInscover.getZip()){
			pcar.setZone(omeInscover.getTerritory2());
			pcar.setRegstatecode(omeInscover.getTerritorystate());
			pcar.setPincode(omeInscover.getZip());			
		}else{
			throw new Exception("Territory2,Territorystate,Zip Should Not be null");
		}
		if(null!=omeInscover.getModel()){
			pcar.setModelcode(omeInscover.getModel());
			pcar.setColorofvehicle(omeInscover.getColor());
			pcar.setRegdate(omeInscover.getVehicleregistrationdate());			
		}else{
			throw new Exception("Model Should Not Be null");
		}
		pcar.setMakecode(omeInscover.getMake());
		pcar.setYom(omeInscover.getMfgyr());
		if(null!=omeInscover.getEngineno() && null!=omeInscover.getChassisno()){
			pcar.setRegnum(omeInscover.getRegno());
			pcar.setChassisnumber(omeInscover.getChassisno());			
			pcar.setEnginenumber(omeInscover.getEngineno());
		}else{
			throw new Exception("Engineno,Regno,Chassisno Should Not Be null");
		}
		if(null!=omeInscover.getCapacity() && null!=omeInscover.getSeatingcapacity() && null!=omeInscover.getLogbooknumber()){
			pcar.setEnginecapacity(omeInscover.getCapacity());
			pcar.setSeatingcapacity(omeInscover.getSeatingcapacity());
			pcar.setImtNumbers(omeInscover.getLogbooknumber());				
		}else{
			throw new Exception("Capacity,Seatingcapacity,Logbooknumber Should Not Be null");
		}
		pcar.setRegcitycode(omePolicy.getNumberadditioninfo1());
		return pcar;
	}	
	   
      
   private Set<Iicoverage> FordcoverageSet(TtrnInscoveredFordVpc fordinscover) throws IllegalArgumentException, IllegalAccessException {
	   Set<Iicoverage> iicoverageSet=new HashSet<Iicoverage>();
		ArrayList<String> vpcvcoverages= new ArrayList<String>();
		vpcvcoverages.add("vpcvgs");
		vpcvcoverages.add("vpcvfo");
		vpcvcoverages.add("vpcvea");
		vpcvcoverages.add("vpcvtm");
		vpcvcoverages.add("vpcvnp");
		vpcvcoverages.add("vpcvne");
		vpcvcoverages.add("vpcvlp");
		vpcvcoverages.add("vpcvfg");
		vpcvcoverages.add("vpcvfd");
		vpcvcoverages.add("vpcvop");
		vpcvcoverages.add("vpcvxg");
		vpcvcoverages.add("vpcvpr");
		vpcvcoverages.add("vpcvnc");
		vpcvcoverages.add("vpcvm1");
		vpcvcoverages.add("vpcvxl");
		vpcvcoverages.add("vpcvpn");
		vpcvcoverages.add("vpcvve");
		vpcvcoverages.add("vpcvat");
		vpcvcoverages.add("vpcvll");
		vpcvcoverages.add("vpcvnf");
		vpcvcoverages.add("vpcvde");
		vpcvcoverages.add("vpcvtp");
		vpcvcoverages.add("vpcvws");
		vpcvcoverages.add("vpcvlw");
		vpcvcoverages.add("vpcvld");
		vpcvcoverages.add("vpcvcn");
		vpcvcoverages.add("vpvtow");
		vpcvcoverages.add("round1");
		vpcvcoverages.add("round2");

	       for(String cov:vpcvcoverages){
	    	   Iicoverage icov=new Iicoverage();
	    	   Object dedvalue=null;
	    	   Object value=null;
	    	   Object sivalue=null;
	    	   try {
		    	   value= PropertyUtils.getProperty(fordinscover, cov);
		    	   sivalue= PropertyUtils.getProperty(fordinscover, "si"+cov);
	    		   dedvalue = PropertyUtils.getProperty(fordinscover, "deductibles"+cov);			
			    } catch (Exception e) {
			    	
			   }
	    	   icov.setCode(cov.toUpperCase());
	    	   if(null!=value){
	    		   icov.setPremium(value.toString());    		   
	    	   }
	    	   icov.setSuminsuredname("SI"+cov.toUpperCase());
	    	   if(null!=sivalue){
	    		   icov.setSuminsuredamount(sivalue.toString());    		   
	    	   }
	    	   icov.setDeductiblename("DEDUCTIBLES"+cov);
	    	   if(null!=dedvalue){
	    		   icov.setDeductibleamount(dedvalue.toString());
	    	   }
	    	   iicoverageSet.add(icov);
	    	   
	       }

  		return iicoverageSet;
  	}
  private Privatecaritem FordCarset(TtrnInscoveredFordVpc fordinscover, TtrnPolicy omePolicy) throws Exception {
		Privatecaritem pcar=new Privatecaritem();
		pcar.setPRODUCTCODE(omePolicy.getProductcode());
		pcar.setDomicile(omePolicy.getDomicile());
		pcar.setMostlydrivenarea(fordinscover.getGstnumber());
//		pcar.setRegstatecode(omePolicy.getTerritory());
//		pcar.setAAIMembershipNumber(omePolicy.getAaimembership());
		if(null!=fordinscover.getItemsi() && null!=fordinscover.getRegistringauthority() && null!=fordinscover.getNcdgrade()){
			pcar.setRto(fordinscover.getRegistringauthority());
			pcar.setNcbpercentage(fordinscover.getNcdgrade());
			pcar.setIdv(fordinscover.getItemsi());			
		}else{
			throw new Exception("Itemsi,Registringauthority,Ncdgrade Should Not Be null");
		}
		pcar.setHypothecatedto(fordinscover.getHypothecatedto());
		if(null!=fordinscover.getTerritory2() && null!=fordinscover.getTerritorystate() && null!=fordinscover.getZip()){
			pcar.setZone(fordinscover.getTerritory2());
			pcar.setRegstatecode(fordinscover.getTerritorystate());
			pcar.setPincode(fordinscover.getZip());			
		}else{
			throw new Exception("Territory2,Territorystate,Zip Should Not be null");
		}
		if(null!=fordinscover.getModel()){
			pcar.setModelcode(fordinscover.getModel());
			pcar.setColorofvehicle(fordinscover.getColor());
			pcar.setRegdate(fordinscover.getVehicleregistrationdate());			
		}else{
			throw new Exception("Model Should Not Be null");
		}
//		pcar.setFgCoverCode(fordinscover.getCover());
//		pcar.setTypeofusage(fordinscover.getUsagecode());
		pcar.setMakecode(fordinscover.getMake());
		pcar.setYom(fordinscover.getMfgyr());
		if(null!=fordinscover.getEngineno() && null!=fordinscover.getChassisno()){
			pcar.setRegnum(fordinscover.getRegno());
			pcar.setChassisnumber(fordinscover.getChassisno());			
			pcar.setEnginenumber(fordinscover.getEngineno());
		}else{
			throw new Exception("Engineno,Regno,Chassisno Should Not Be null");
		}
		if(null!=fordinscover.getCapacity() && null!=fordinscover.getSeatingcapacity() && null!=fordinscover.getLogbooknumber()){
			pcar.setEnginecapacity(fordinscover.getCapacity());
			pcar.setSeatingcapacity(fordinscover.getSeatingcapacity());
			pcar.setImtNumbers(fordinscover.getLogbooknumber());				
		}else{
			throw new Exception("Capacity,Seatingcapacity,Logbooknumber Should Not Be null");
		}
		pcar.setRegcitycode(omePolicy.getNumberadditioninfo1());
		return pcar;	
  	}
  
  private Set<Iicoverage> VGCcoverageSet(TtrnInscoveredInfoVgc vgcCover2) throws IllegalArgumentException, IllegalAccessException {
	  Set<Iicoverage> iicoverageSet=new HashSet<Iicoverage>();
		ArrayList<String> vgcoverages= new ArrayList<String>();
		vgcoverages.add("vgctdd");
		vgcoverages.add("vgcttl");
		vgcoverages.add("vgcgas");
		vgcoverages.add("vgcfgp");
		vgcoverages.add("vgcpod");
		vgcoverages.add("vgcwsg");
		vgcoverages.add("round1");
		vgcoverages.add("vgcxgl");
		vgcoverages.add("vgcatd");
		vgcoverages.add("vgctpr");
		vgcoverages.add("vgctpl");
		vgcoverages.add("vgcdep");
		vgcoverages.add("vgcipd");
		vgcoverages.add("vgcbpr");
		vgcoverages.add("vgcpnd");
		vgcoverages.add("vgcnea");
		vgcoverages.add("vgcapg");
		vgcoverages.add("vgclle");
		vgcoverages.add("vgceas");
		vgcoverages.add("vgccm1");
		vgcoverages.add("vgcncd");
		vgcoverages.add("vgccng");
		vgcoverages.add("vgcnfn");
		vgcoverages.add("vgcnfe");
		vgcoverages.add("round2");
		vgcoverages.add("vgcllw");
		vgcoverages.add("vgctow");
		vgcoverages.add("vgcxge");
		vgcoverages.add("vgcves");
		vgcoverages.add("vgcptm");
		vgcoverages.add("vgcdte");
	       for(String cov:vgcoverages){
	    	   Iicoverage icov=new Iicoverage();
	    	   Object dedvalue=null;
	    	   Object value=null;
	    	   Object sivalue=null;
	    	   try {
		    	   value= PropertyUtils.getProperty(vgcCover2, cov);
		    	   sivalue= PropertyUtils.getProperty(vgcCover2, "si"+cov);
	    		   dedvalue = PropertyUtils.getProperty(vgcCover2, "deductibles"+cov);			
			    } catch (Exception e) {
			    	
			   }
	    	   icov.setCode(cov.toUpperCase());
	    	   if(null!=value){
	    		   icov.setPremium(value.toString());    		   
	    	   }
	    	   icov.setSuminsuredname("SI"+cov.toUpperCase());
	    	   if(null!=sivalue){
	    		   icov.setSuminsuredamount(sivalue.toString());    		   
	    	   }
	    	   icov.setDeductiblename("DEDUCTIBLES"+cov);
	    	   if(null!=dedvalue){
	    		   icov.setDeductibleamount(dedvalue.toString());
	    	   }
	    	   iicoverageSet.add(icov);
	    	   
	       }
		return iicoverageSet;
 	}
 private Privatecaritem VGCCarset(TtrnInscoveredInfoVgc vgcCover2, TtrnPolicy omePolicy) throws Exception {
	 Privatecaritem pcar=new Privatecaritem();
		pcar.setPRODUCTCODE(omePolicy.getProductcode());
		pcar.setDomicile(omePolicy.getDomicile());
		pcar.setMostlydrivenarea(vgcCover2.getGstnumber());
//		pcar.setRegstatecode(omePolicy.getTerritory());
//		pcar.setAAIMembershipNumber(omePolicy.getAaimembership());
		if(null!=vgcCover2.getItemsi() && null!=vgcCover2.getRegistringauthority() && null!=vgcCover2.getNcdgrade()){
			pcar.setRto(vgcCover2.getRegistringauthority());
			pcar.setNcbpercentage(vgcCover2.getNcdgrade());
			pcar.setIdv(vgcCover2.getItemsi());			
		}else{
			throw new Exception("Itemsi,Registringauthority,Ncdgrade Should Not Be null");
		}
		pcar.setHypothecatedto(vgcCover2.getHypothecatedto());
		if(null!=vgcCover2.getTerritory2() && null!=vgcCover2.getTerritorystate() && null!=vgcCover2.getZip()){
			pcar.setZone(vgcCover2.getTerritory2());
			pcar.setRegstatecode(vgcCover2.getTerritorystate());
			pcar.setPincode(vgcCover2.getZip());			
		}else{
			throw new Exception("Territory2,Territorystate,Zip Should Not be null");
		}
		if(null!=vgcCover2.getModel()){
			pcar.setModelcode(vgcCover2.getModel());
			pcar.setColorofvehicle(vgcCover2.getColor());
			pcar.setRegdate(vgcCover2.getVehicleregistrationdate());			
		}else{
			throw new Exception("Model Should Not Be null");
		}
//		pcar.setFgCoverCode(vgcCover2.getCover());
//		pcar.setTypeofusage(vgcCover2.getUsagecode());
		pcar.setMakecode(vgcCover2.getMake());
		pcar.setYom(vgcCover2.getMfgyr());
		if(null!=vgcCover2.getEngineno() && null!=vgcCover2.getChassisno()){
			pcar.setRegnum(vgcCover2.getRegno());
			pcar.setChassisnumber(vgcCover2.getChassisno());			
			pcar.setEnginenumber(vgcCover2.getEngineno());
		}else{
			throw new Exception("Engineno,Regno,Chassisno Should Not Be null");
		}
		if(null!=vgcCover2.getCapacity() && null!=vgcCover2.getSeatingcapacity() && null!=vgcCover2.getLogbooknumber()){
			pcar.setEnginecapacity(vgcCover2.getCapacity());
			pcar.setSeatingcapacity(vgcCover2.getSeatingcapacity());
			pcar.setImtNumbers(vgcCover2.getLogbooknumber());				
		}else{
			throw new Exception("Capacity,Seatingcapacity,Logbooknumber Should Not Be null");
		}
		pcar.setRegcitycode(omePolicy.getNumberadditioninfo1());
		return pcar;	
 	}
  
 private Set<Iicoverage> VOCcoverageSet(TtrnInscoveredInfoVoc vocCover2) throws IllegalArgumentException, IllegalAccessException {
	 Set<Iicoverage> iicoverageSet=new HashSet<Iicoverage>();
		ArrayList<String> vocoverages= new ArrayList<String>();
		vocoverages.add("vocdep");
		vocoverages.add("vocbpr");
		vocoverages.add("voccng");
		vocoverages.add("vocgas");
		vocoverages.add("round1");
		vocoverages.add("vocotr");
		vocoverages.add("vocexg");
		vocoverages.add("round2");
		vocoverages.add("vocatd");
		vocoverages.add("voclle");
		vocoverages.add("voceas");
		vocoverages.add("vocwsg");
		vocoverages.add("vocnfe");
		vocoverages.add("voctdd");
		vocoverages.add("voctpl");
		vocoverages.add("vocncd");
		vocoverages.add("voccm1");
		vocoverages.add("vocih");
		vocoverages.add("vocllm");
		vocoverages.add("vocptm");
		vocoverages.add("vocllw");
		vocoverages.add("vocpnd");
		vocoverages.add("vocves");
		vocoverages.add("vocexl");
		vocoverages.add("vocipd");
		vocoverages.add("vocnfn");
		vocoverages.add("voctow");
		vocoverages.add("vocpod");
		vocoverages.add("vocnea");
	       for(String cov:vocoverages){
	    	   Iicoverage icov=new Iicoverage();
	    	   Object dedvalue=null;
	    	   Object value=null;
	    	   Object sivalue=null;
	    	   try {
		    	   value= PropertyUtils.getProperty(vocCover2, cov);
		    	   sivalue= PropertyUtils.getProperty(vocCover2, "si"+cov);
	    		   dedvalue = PropertyUtils.getProperty(vocCover2, "deductibles"+cov);			
			    } catch (Exception e) {
			    	
			   }
	    	   icov.setCode(cov.toUpperCase());
	    	   if(null!=value){
	    		   icov.setPremium(value.toString());    		   
	    	   }
	    	   icov.setSuminsuredname("SI"+cov.toUpperCase());
	    	   if(null!=sivalue){
	    		   icov.setSuminsuredamount(sivalue.toString());    		   
	    	   }
	    	   icov.setDeductiblename("DEDUCTIBLES"+cov);
	    	   if(null!=dedvalue){
	    		   icov.setDeductibleamount(dedvalue.toString());
	    	   }
	    	   iicoverageSet.add(icov);  	   
	       }
		return iicoverageSet;
	}
private Privatecaritem VOCCarset(TtrnInscoveredInfoVoc vocCover2, TtrnPolicy omePolicy) throws Exception {
	 Privatecaritem pcar=new Privatecaritem();
		pcar.setPRODUCTCODE(omePolicy.getProductcode());
		pcar.setDomicile(omePolicy.getDomicile());
		pcar.setMostlydrivenarea(vocCover2.getGstnumber());
//		pcar.setAAIMembershipNumber(omePolicy.getAaimembership());
		if(null!=vocCover2.getItemsi() && null!=vocCover2.getRegistringauthority() && null!=vocCover2.getNcdgrade()){
			pcar.setRto(vocCover2.getRegistringauthority());
			pcar.setNcbpercentage(vocCover2.getNcdgrade());
			pcar.setIdv(vocCover2.getItemsi());			
		}else{
			throw new Exception("Itemsi,Registringauthority,Ncdgrade Should Not Be null");
		}
		pcar.setHypothecatedto(vocCover2.getHypothecatedto());
		if(null!=vocCover2.getTerritory2() && null!=vocCover2.getTerritorystate() && null!=vocCover2.getZip()){
			pcar.setZone(vocCover2.getTerritory2());
			pcar.setRegstatecode(vocCover2.getTerritorystate());
			pcar.setPincode(vocCover2.getZip());			
		}else{
			throw new Exception("Territory2,Territorystate,Zip Should Not be null");
		}
		if(null!=vocCover2.getModel()){
			pcar.setModelcode(vocCover2.getModel());
			pcar.setColorofvehicle(vocCover2.getColor());
			pcar.setRegdate(vocCover2.getVehicleregistrationdate());			
		}else{
			throw new Exception("Model Should Not Be null");
		}
		pcar.setMakecode(vocCover2.getMake());
		pcar.setYom(vocCover2.getMfgyr());
		if(null!=vocCover2.getEngineno() && null!=vocCover2.getChassisno()){
			pcar.setRegnum(vocCover2.getRegno());
			pcar.setChassisnumber(vocCover2.getChassisno());			
			pcar.setEnginenumber(vocCover2.getEngineno());
		}else{
			throw new Exception("Engineno,Regno,Chassisno Should Not Be null");
		}
		if(null!=vocCover2.getCapacity() && null!=vocCover2.getSeatingcapacity() && null!=vocCover2.getLogbooknumber()){
			pcar.setEnginecapacity(vocCover2.getCapacity());
			pcar.setSeatingcapacity(vocCover2.getSeatingcapacity());
			pcar.setImtNumbers(vocCover2.getLogbooknumber());				
		}else{
			throw new Exception("Capacity,Seatingcapacity,Logbooknumber Should Not Be null");
		}
		pcar.setRegcitycode(omePolicy.getNumberadditioninfo1());
		return pcar;
	}
private Set<Iicoverage> VFAcoverageSet(Vfacover vfacoverage) {
	
	Set<Iicoverage> iicoverageSet=new HashSet<Iicoverage>();
	ArrayList<String> vfacoverages= new ArrayList<String>();
	vfacoverages.add("VFAVPR");
	vfacoverages.add("VFATPR");
	vfacoverages.add("VFAACC");
	vfacoverages.add("VFAVHR");
	vfacoverages.add("VFAVTM");
	vfacoverages.add("VFAVTL");
	vfacoverages.add("VFAVPO");
	vfacoverages.add("VFATTL");
	vfacoverages.add("VFAVLE");
	vfacoverages.add("VFAVPD");
	vfacoverages.add("VFAATD");
	vfacoverages.add("VFAVNC");
	vfacoverages.add("VFALLD");
	vfacoverages.add("VFATHR");
	vfacoverages.add("ROUND1");
	vfacoverages.add("ROUND2");
	vfacoverages.add("VFAIPD");
	vfacoverages.add("RIPDPR");
	vfacoverages.add("RIPHPS");
	vfacoverages.add("VFADIS");
       for(String cov:vfacoverages){
    	   Iicoverage icov=new Iicoverage();
    	   Object dedvalue=null;
    	   Object value=null;
    	   Object sivalue=null;
    	   try {
	    	   value= PropertyUtils.getProperty(vfacoverage, cov);
	    	   sivalue= PropertyUtils.getProperty(vfacoverage, "si"+cov);
    		   dedvalue = PropertyUtils.getProperty(vfacoverage, "deductibles"+cov);			
		    } catch (Exception e) {
		    	
		   }
    	   icov.setCode(cov.toUpperCase());
    	   if(null!=value){
    		   icov.setPremium(value.toString());    		   
    	   }
    	   icov.setSuminsuredname("SI"+cov.toUpperCase());
    	   if(null!=sivalue){
    		   icov.setSuminsuredamount(sivalue.toString());    		   
    	   }
    	   icov.setDeductiblename("DEDUCTIBLES"+cov);
    	   if(null!=dedvalue){
    		   icov.setDeductibleamount(dedvalue.toString());
    	   }
    	   iicoverageSet.add(icov);  	   
       }
	return iicoverageSet;
	
	
}
private Privatecaritem VFACarset(Vfacover vfacoverage, TtrnPolicy omePolicy) throws Exception {
	 Privatecaritem pcar=new Privatecaritem();
		pcar.setPRODUCTCODE(omePolicy.getProductcode());
		pcar.setDomicile(omePolicy.getDomicile());
		pcar.setMostlydrivenarea(vfacoverage.getGstnumber());
		if(null!=vfacoverage.getItemsi() && null!=vfacoverage.getRegistringauthority() && null!=vfacoverage.getNcdgrade()){
			pcar.setRto(vfacoverage.getRegistringauthority());
			pcar.setNcbpercentage(vfacoverage.getNcdgrade());
			pcar.setIdv(vfacoverage.getItemsi());			
		}else{
			throw new Exception("Itemsi,Registringauthority,Ncdgrade Should Not Be null");
		}
		pcar.setHypothecatedto(vfacoverage.getHypothecatedto());
		if(null!=vfacoverage.getTerritory2() && null!=vfacoverage.getTerritorystate() && null!=vfacoverage.getZip()){
			pcar.setZone(vfacoverage.getTerritory2());
			pcar.setRegstatecode(vfacoverage.getTerritorystate());
			pcar.setPincode(vfacoverage.getZip());			
		}else{
			throw new Exception("Territory2,Territorystate,Zip Should Not be null");
		}
		if(null!=vfacoverage.getModel()){
			pcar.setModelcode(vfacoverage.getModel());
			pcar.setColorofvehicle(vfacoverage.getColor());
			pcar.setRegdate(vfacoverage.getVehicleregistrationdate());			
		}else{
			throw new Exception("Model Should Not Be null");
		}
		pcar.setMakecode(vfacoverage.getMake());
		pcar.setYom(vfacoverage.getMfgyr());
		if(null!=vfacoverage.getEngineno() && null!=vfacoverage.getChassisno()){
			pcar.setRegnum(vfacoverage.getRegno());
			pcar.setChassisnumber(vfacoverage.getChassisno());			
			pcar.setEnginenumber(vfacoverage.getEngineno());
		}else{
			throw new Exception("Engineno,Regno,Chassisno Should Not Be null");
		}
		if(null!=vfacoverage.getCapacity() && null!=vfacoverage.getSeatingcapacity() && null!=vfacoverage.getLogbooknumber()){
			pcar.setEnginecapacity(vfacoverage.getCapacity());
			pcar.setSeatingcapacity(vfacoverage.getSeatingcapacity());
			pcar.setImtNumbers(vfacoverage.getLogbooknumber());				
		}else{
			throw new Exception("Capacity,Seatingcapacity,Logbooknumber Should Not Be null");
		}
		pcar.setRegcitycode(omePolicy.getNumberadditioninfo1());
		return pcar;
}

}

//recs=null;
//poll=null;
//reciptrepo.flush();	
//polerror6.flush();
//polrepo.delete(6134L);

//polrepo.delete(8993L);
//polrepo.delete(9059L);

//polrepo.delete(polrepo.findAll(new ArrayList<Long>(){
//	 
//
//	private static final long serialVersionUID = 1L;
//
//{
//add(69638L);
//add(76239L);
//add(74693L);
//add(72653L);
//add(76208L);
//add(77222L);
//add(74181L);
//add(74781L);
//add(78696L);
//add(77909L);
//add(77701L);
//add(77702L);
//add(77703L);
//add(77704L);
//
//add(82111L);
//add(81885L);
//add(81886L);
//add(81887L);
//add(82289L);
//add(82278L);
//add(82279L);
//add(82280L);
//add(82134L);
//add(83306L);
//add(82281L);
//add(82282L);
//add(82283L);
//add(82284L);
//add(82285L);
//add(82286L);
//add(82287L);
//add(82288L);
//add(82290L);
//add(85067L);
//add(86340L);
//add(85285L);
//add(86652L);


//}}));























//for(Field fld:fields)
//{
//	
//	if(fld.getName().toLowerCase().startsWith("sivpc") || fld.getName().toLowerCase().startsWith("siround")){
//		  fld.setAccessible(true);
//		  Object obj=fld.get(omeInscover);
//		  String sistr=null;
//		  if(obj!=null){
//			  sistr=obj.toString();
//		  }
//		  coverageValueMap.put(fld.getName().toUpperCase(), sistr);
//		  
//	}
//	if(fld.getName().toLowerCase().startsWith("vpc") || fld.getName().toLowerCase().startsWith("round")){
//		fld.setAccessible(true);
//		  Object obj=fld.get(omeInscover);
//		  String sistr=null;
//		  if(obj!=null){
//			  sistr=obj.toString();
//		  }
//		  coverageValueMap.put(fld.getName().toUpperCase(), sistr);
//    }
//	if(fld.getName().toLowerCase().startsWith("deductiblesvpc") || fld.getName().toLowerCase().startsWith("deductiblesround")){
//		fld.setAccessible(true);
//		  Object obj=fld.get(omeInscover);
//		  String sistr=null;
//		  if(obj!=null){
//			  sistr=obj.toString();
//		  }
//		  coverageValueMap.put(fld.getName().toUpperCase(), sistr);
//    	}
//	
//}















//for(Field fld:fields)
//{
//	if(fld.getName().toLowerCase().startsWith("sivpc") || fld.getName().toLowerCase().startsWith("siround")){
//		  fld.setAccessible(true);
//		  Object obj=fld.get(omeInscover);
//		  String sistr=null;
//		  if(obj!=null){
//			  sistr=obj.toString();
//		  }
//		  coverageValueMap.put(fld.getName().toUpperCase(), sistr);
//	}
//	if(fld.getName().toLowerCase().startsWith("vpc") || fld.getName().toLowerCase().startsWith("round")){
//		fld.setAccessible(true);
//		  Object obj=fld.get(omeInscover);
//		  String sistr=null;
//		  if(obj!=null){
//			  sistr=obj.toString();
//		  }
//		  coverageValueMap.put(fld.getName().toUpperCase(), sistr);
//    }
//	if(fld.getName().toLowerCase().startsWith("deductiblesvpc") || fld.getName().toLowerCase().startsWith("deductiblesround")){
//		fld.setAccessible(true);
//		  Object obj=fld.get(omeInscover);
//		  String sistr=null;
//		  if(obj!=null){
//			  sistr=obj.toString();
//		  }
//		  coverageValueMap.put(fld.getName().toUpperCase(), sistr);
//    	}
//	
//}














//for (Iterator<String> iterator = coverageValueMap.keySet().iterator(); iterator.hasNext();) {
//	String key = (String) iterator.next();
//	String value = coverageValueMap.get(key);
//	Iicoverage coverage=new Iicoverage();
//	if(key.startsWith("VPC") || key.startsWith("ROUND")){
//		if(key.equals("VPCCNG1")){
//			continue;
//		}
//		else if(key.equals("VPCCM1RATE")){
//			coverage.setCode("VPCCM1");
//			coverage.setPremium(value);
//		}
//		else if(key.equals("VPCVM1RATE")){
//			coverage.setCode("VPCVM1");
//			coverage.setPremium(value);
//		}else{
//			coverage.setCode(key);
//			coverage.setPremium(value);					
//		}
//		if(coverageValueMap.containsKey("SI"+key)){
//			coverage.setSuminsuredname("SI"+key);
//			coverage.setSuminsuredamount(coverageValueMap.get("SI"+key));
//		}
//		if(coverageValueMap.containsKey("DEDUCTIBLES"+key)){
//			coverage.setDeductiblename("DEDUCTIBLES"+key);
//			coverage.setDeductibleamount(coverageValueMap.get("DEDUCTIBLES"+key));
//		}
//		
//		
//		iicoverageSet.add(coverage);
//	}
//}