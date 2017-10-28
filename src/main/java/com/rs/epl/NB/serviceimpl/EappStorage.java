package com.rs.epl.NB.serviceimpl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

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
import com.rs.epl.NB.eappsrepo.EappInsured;
import com.rs.epl.NB.eappsrepo.EappPolicy;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.policyrepository.Status;
import com.rs.epl.NB.policyrepository.UIStatus;
import com.rs.epl.NB.service.EappDataSet;
import com.rs.epl.NB.service.EappPolicyService;
import com.rs.epl.NB.service.PolicyStore;
import com.rs.epl.eapps.receiptmaster.Partiesinpolicy;

@Service
public class EappStorage  implements EappDataSet{
	
	@Resource
	EappPolicyService EappPolicyService;
	
	@Resource
	EappPolicy Eapppol;	
	
	@Resource
	EappInsured EappClient;	
	

	@Resource
	PolicyRepository  policy;
	
	@Resource
	PolicyStore savepolicy;
	
	
//	@Resource
//	Policyerrorsrepo polstatus;
	
	
	@Resource
	UIStatus  policystatus2;
	
	@Resource
	Status  policystatus69;
	
	   double totalpremium = 0;
	
	   
		public double getTotalpremium() {
			return totalpremium;
		}

		public void setTotalpremium(double totalpremium) {
			this.totalpremium = totalpremium;
		}

	@Override
	public void EappsConversion(Long Id,String Polno,String Productcode,List<String> receiptnos) throws RemoteException, ServiceException, JAXBException, InterruptedException {
				
		Policy poltst=policy.findBypolno(Polno);		
		EPL_UISTATUS statusdetails=policystatus2.findOne(Polno);
		BigDecimal ids=Eapppol.findhasuploaded(Id);
		
	 
	     String  recnos;
	     if(receiptnos.size()>1){
	    	  recnos = String.join("| ", receiptnos); 
	     }else{
	    	 recnos=receiptnos.get(0);
	     }
		
		try {
			if(!ids.equals(new BigDecimal(2)) && (statusdetails.getPolicy_status().equalsIgnoreCase("FAIL") ||
					statusdetails.getPolicy_status().equalsIgnoreCase("Invalid Request") ||
					statusdetails.getPolicy_status().equalsIgnoreCase("Retry Policy With Valid Data"))){
				if(null!=poltst){
					policy.UpdateGarbage(Polno);
					poltst=null;				
				}	
				policystatus2.UpdatePolicyGarbage(Polno);
				statusdetails=null;
			}			
		} catch (Exception e) {}
		
		if(poltst==null){
			try {			
				if(receiptnos != null && !receiptnos.isEmpty()){
					poltst=EappToEPlConversion(Id,Polno,Productcode);						
				}else{
					throw new Exception("Receipt No Not Avalible for This Policy");
				}
				
				
				
			} catch (Exception e) {
				
				int upno=policy.Updateflag("true");
				
		         while(upno==0){
		        	 upno=policy.Updateflag("true");
		         }			
		         Eapppol.UpdateInsurancepolicyforfail(2,Polno);
                 
                 EPL_STATUS sta= new EPL_STATUS();
                 
                 sta.setPolicyno(Polno);
                 
                 sta.setReceiptno(recnos);
                 
                 sta.setReceipt_status("N/A");
                 
                 sta.setPolicy_status("Invalid Request");
                 
                 
                 
                 sta.setReceipt_requestxml("N/A");
                 
                 sta.setReceipt_responsexml("N/A");
                 
                 sta.setPolicy_responsexml("N/A");
                 
                 sta.setReceipt_errordetails("N/A");
                 
                 StringWriter errors = new StringWriter();
                 
                e.printStackTrace(new PrintWriter(errors));
                 
                String err =errors.toString();

                sta.setPolicy_errordeatils(e.toString());
                 
                 sta.setPolicy_requestxml(err);
                 
                sta.setPolicy_attempt_time(new Date());
                 
                 sta.setFromsysystem("EAPPS");
                 
                String Eplproductcode=Productcode.toUpperCase();
               
                String localproductcode=null;
                 
               if(Eplproductcode.startsWith("VPC")){
            	   localproductcode="VPC";
               }else if(Eplproductcode.contains("PASSENGER")){
            	   localproductcode="VPCV";
               }else if(Eplproductcode.contains("MISCELLANEOUS")){
            	   localproductcode="VOC";
               }else if(Eplproductcode.contains("GOODS")){
            	   localproductcode="VGC";
               }else{
            	   localproductcode="VFA";
               }
               sta.setProductcode(localproductcode);
               sta.setTransctiontype("NB");
               
               policystatus69.save(sta);
                 
//            Eapppol.UpdateError(e.getMessage(),Polno);
			}
			
		}
		else if((!ids.equals(new BigDecimal(2)) || !ids.equals(new BigDecimal(1))) && null!=statusdetails){			
			if(statusdetails.getPolicy_status().equalsIgnoreCase("SUCCESS")){
				 String time = new SimpleDateFormat("hh:mm a").format(new Date());
				  Eapppol.UpdateInsurancepolicy(1,time,Polno);
			}else{
				Eapppol.UpdateInsurancepolicyforfail(2,Polno);
			}
		}
		if(null!=poltst && statusdetails == null){			
			EappPolicyService.EappPolicyMov(poltst, Polno,recnos,Id,receiptnos);
		}
	}

	private Policy EappToEPlConversion(Long id, String polno, String productcode2) throws Exception {	
		Object eapppolicy=null;
		Object oldpol=null;
		
		if(productcode2.equalsIgnoreCase("VPC_Comprehensive") || productcode2.equalsIgnoreCase("VPC_LiabilityOnly")){
			
			eapppolicy=Eapppol.PolicyObj(id);
			
			oldpol=Eapppol.oldinsuerprivatecar(id);
						
		}else if(productcode2.equalsIgnoreCase("MotorCyclePackage")){
			
			eapppolicy=Eapppol.MotorCyclePolicy(id);
			oldpol=Eapppol.oldinsurerMotorcycle(id);
		}
		else{
			 eapppolicy=Eapppol.VPCVPolicy(id);	
			 
			 oldpol=Eapppol.oldinsurerothercar(id);
		}
       
		 boolean branchparty=false;
        	 Policy eplpolicy=new Policy();				
 			Object[] a = (Object[]) eapppolicy;
 			if(String.valueOf(a[1]).equalsIgnoreCase("null") || String.valueOf(a[2]).equalsIgnoreCase("null") || String.valueOf(a[9]).equalsIgnoreCase("null")){
 				
 				throw new Exception("AccountDate,Agentcode,BranchCode Should not be null");
 				
 			}else{
 				if(String.valueOf(a[9]).contains("X0")){
 					branchparty=true;
 				}
 			}
 				
 				eplpolicy.setAccountDate(String.valueOf(a[1]));				
 				eplpolicy.setAgentcode(String.valueOf(a[2]));
 				if(!branchparty){				
 					eplpolicy.setBranchcode(String.valueOf(a[9]));
 				}else{
 					eplpolicy.setBranchcode("X1"); 					
 				}
 			    
 				if(!String.valueOf(a[7]).equalsIgnoreCase("null")){
 					eplpolicy.setBdocode(String.valueOf(a[7]));
 				}
 				
 			
 					if(null!=oldpol){
 						Object[] b =(Object[]) oldpol;
 						
 						if(!String.valueOf(b[0]).equalsIgnoreCase("null")){
 							eplpolicy.setModeofbusiness(String.valueOf(b[0])); 				 							 							
 						}
 						if(!String.valueOf(b[1]).equalsIgnoreCase("null")){	
 							eplpolicy.setLineofbusiness(String.valueOf(b[1])); 	 					 							
 						}
 					}
 			
 			
 			if(String.valueOf(a[17]).equalsIgnoreCase("null") && String.valueOf(a[18]).equalsIgnoreCase("null")){
 				
 				throw new Exception("CreationDate and EffectiveDate Should not be null");
 				
 			}else{
 				
 				eplpolicy.setCreationdate(String.valueOf(a[17]));			
 				eplpolicy.setEffectivedate(String.valueOf(a[18])); 				
 			}
 			eplpolicy.setFromsystem("EAPPS");
 			eplpolicy.setNoofitem(Integer.parseInt(String.valueOf(a[39]))); 
 			if(String.valueOf(a[41]).equalsIgnoreCase("null")){
 				
 			}else{
 				eplpolicy.setOacode(String.valueOf(a[41])); 			 				
 			}
 			eplpolicy.setPolExpTime(String.valueOf(a[44]));
 			if(String.valueOf(a[45]).equalsIgnoreCase("null") || String.valueOf(a[48]).equalsIgnoreCase("null")){
 				
 				throw new Exception("Policy Start Time and Deductible Should not be null");
 				
 			}else{
 				
 				eplpolicy.setPolStartTime(String.valueOf(a[45])); 				
 				eplpolicy.setPolicystatus(String.valueOf(a[48])); 	
 			}
 			eplpolicy.setPolexpirydate(String.valueOf(a[46]));
 			
 			if(String.valueOf(a[49]).equalsIgnoreCase("null") || String.valueOf(a[50]).equalsIgnoreCase("null")){
 				
 				throw new Exception("PolicySuminsured amount and policyno Should not be null");
 				
 			}else{
 				eplpolicy.setPolicysuminsuredamount(Double.parseDouble(String.valueOf(a[49]))); 				
 				if(polno.length()<=16){
 					eplpolicy.setPolno(polno);				
 				}else{
 					throw new Exception("Policy Code Should not Exceed 16 digit");
 				}
 			}
 			String ProductCode=String.valueOf(a[53]);
 			if(String.valueOf(a[51]).equalsIgnoreCase("null") || ProductCode.equalsIgnoreCase("null")){
 				throw new Exception("Policy Start Date  and Product Code Should nott be null");		
 			}else{
 				eplpolicy.setPolstartdate(String.valueOf(a[51]));
 				eplpolicy.setProductcode(ProductCode);							
 			}if(String.valueOf(a[52]).equalsIgnoreCase("null")){
 				
 			}else{
 				eplpolicy.setPreviouspolno(String.valueOf(a[52])); 				
 			}
 			eplpolicy.setProductdisplayname(String.valueOf(a[54]));
// 			eplpolicy.setProductname(String.valueOf(a[55]));
 			if(String.valueOf(a[56]).equalsIgnoreCase("null") || String.valueOf(a[67]).equalsIgnoreCase("null")){
 				throw new Exception("ProposalDate and underwriting Year Should not be null");				
 				
 			}else{
 				
 				eplpolicy.setProposalDate(String.valueOf(a[56]));
 				eplpolicy.setUwyr(String.valueOf(a[67])); 				
 			}
 			eplpolicy.setQuoteno(String.valueOf(a[58]));
 			String Transction=String.valueOf(a[66]);
 			eplpolicy.setTransactiontype(Transction);
 			
 			if(!String.valueOf(a[72]).equalsIgnoreCase("null")){
 				eplpolicy.setBatchname(String.valueOf(a[72])); 				
 			}
          
 			//Client Conversion
 			
 			Policyclient eplclient=ClientSet(id,Transction,branchparty,productcode2);
 		
 			eplpolicy.setPolicyclient(eplclient);
 			
 			eplclient.setPolicies(eplpolicy);
 			
 			//Payment Set
 			
 			Set<Payment> Eplpayment=Eplpaymentset(id);
 			
 			eplpolicy.setPayments(Eplpayment);
 			
 			//ItemSet
 			
 			Set<Policyitem> setpolitem=new HashSet<Policyitem>();
 			
// 			Set<Policyitem>  Eplitemlist=EplPolicyItemSet(ProductCode,id);
 			
 			carSet(id,ProductCode,setpolitem);
 			
 			eplpolicy.setPolicyitems(setpolitem);
 			
 			eplpolicy.setPolicypremium(this.getTotalpremium());
 			
 			//PolicyCoverageSet
 			
 			Set<Policycoverage> EplPolicyCoverage=PolicyCoverageSet(id,Eplpayment);
 			
 			eplpolicy.setPolicycoverages(EplPolicyCoverage);
 			
// 			policy.save(eplpolicy);	 
 			
 			savepolicy.savepol(eplpolicy, policy);
 		
 			 System.out.println("----policy persisted successfully----");
 			 
 			 return eplpolicy;
	}


	private Policyclient ClientSet(Long clientid, String transction,
			boolean branchparty, String productcode2) throws Exception {
		
		Partiesinpolicy client=EappClient.findBypolicyid(clientid);
		Policyclient polclient=new Policyclient();
		StringBuilder Address2=new  StringBuilder();
		StringBuilder Address3=new  StringBuilder();
		StringBuilder Address4=new  StringBuilder();
		if(client.getAddress1()!=null && !client.getAddress1().equalsIgnoreCase("null")){
			if(client.getAddress1().length()<=40){
				polclient.setAddress1(client.getAddress1());							
			}
		else{
			polclient.setAddress1(client.getAddress1().substring(0, 40));
			Address2.append(client.getAddress1().substring(40)+" ");
		}
	}
            if(null!=client.getAddress2() && !client.getAddress2().equalsIgnoreCase("null")){
            	Address2.append(client.getAddress2());			            	
            }
		
		if(Address2!=null  && !Address2.toString().equalsIgnoreCase("null")){		
			if(Address2.length()<=40){
				polclient.setAddress2(Address2.toString());											
			}else{
			     polclient.setAddress2(Address2.toString().substring(0, 40));
			     Address3.append(Address2.substring(40)+" ");
			}
	      }
           
		   if(null!=client.getAddress3() && !client.getAddress3().equalsIgnoreCase("null")){
			   Address3.append(client.getAddress3());						   
		   }
		
		if(Address3!=null && !Address3.toString().equalsIgnoreCase("null")){
			if(Address3.length()<=40){
				polclient.setAddress3(Address3.toString());	
			}else{
				polclient.setAddress3(Address3.toString().substring(0, 40));
				Address4.append(Address3.substring(40)+" ");
			}					
		}
             
		   if(null!=client.getAddress4() && !client.getAddress4().equalsIgnoreCase("null")){
			   Address4.append(client.getAddress4());						   
		   }
		
		if(Address4!=null && !Address4.toString().equalsIgnoreCase("null")){	
			if(Address4.length()<=40){
				polclient.setAddress4(Address4.toString());							
			}else{
				polclient.setAddress4(Address4.toString().substring(0, 40));				
			}
		}
		polclient.setCity(client.getCity());
//		polclient.setCitycode(client.getCitycode());
		if(null!=client.getPartycode() && null!=client.getState() && null!=client.getCity()){
			String State=client.getState();
			String gstn=Eapppol.gstnNumber(State);
			if(gstn!=null){
				polclient.setAlternatemobile(gstn);
			}
			Object StateandCity=Eapppol.state_city_code(State,client.getCity());
			if(null!=StateandCity && !StateandCity.equals("") && !StateandCity.equals("null")){
				Object[] codes = (Object[]) StateandCity;
				polclient.setStatecode(String.valueOf(codes[0]));
				polclient.setCitycode(String.valueOf(codes[1]));
				polclient.setCode(client.getPartycode());				
			}else{
				throw new Exception("State Code and Citycode Shoiuld Not Blank");	
			}
		}else{
			
			throw new Exception("PartyCode and State Should not be null");	
			
		}
		polclient.setCountry(client.getCountry());
//		polclient.setDob(client.getDob());
//		polclient.setEianNumber(client.getEleInsAccNumber());
		
   StringBuilder MiddleName=new StringBuilder();
   StringBuilder LastName=new StringBuilder();
		
       if(client.getFirstname()!=null && !client.getFirstname().equalsIgnoreCase("null")){
    	   if(client.getFirstname().length()<=20){
    		   polclient.setFirstname(client.getFirstname());    		   
    	   }else{
    		   polclient.setFirstname(client.getFirstname().substring(0, 20));
    		   MiddleName.append(client.getFirstname().substring(20)+" ");    		   
    	   }   	   
       }
           if(null!=client.getMiddlename() && !client.getMiddlename().equalsIgnoreCase("null")){
        	   MiddleName.append(client.getMiddlename());    	           	   
           }
       
       if(MiddleName!=null &&  !MiddleName.toString().equalsIgnoreCase("null")){
    	   if(MiddleName.length()<=20){
    		   polclient.setMiddlename(MiddleName.toString());    		   
    	   }else{
    		   polclient.setMiddlename(MiddleName.substring(0,20));
    		   LastName.append(MiddleName.toString().substring(20)+" ");     		   
    	   }    	   
       }

       if(null!=client.getLastname() && !client.getLastname().equalsIgnoreCase("null")){
    	   LastName.append(client.getLastname());    	   
       }
       

       if(LastName!=null && !LastName.toString().equalsIgnoreCase("null")){
    	   if(LastName.length()<=20){
    		   polclient.setLastname(LastName.toString());    		   
    	   }else{
    		   polclient.setLastname(LastName.toString().substring(0,20));    		   
    	   }
       }
		
		
		if(null!=client.getPartytype()){
			if(client.getPartytype().equalsIgnoreCase("CorpoateCustomer") || client.getPartytype().equalsIgnoreCase("CorporateCustomer") ){		
				polclient.setIscorporateclient(true);
			}
			
			else if(client.getPartytype().equals("IndividualCustomer") || client.getPartytype().equals("IndividualCutomer")){
				polclient.setIscorporateclient(false);
			}			
			
		}else{
			
			throw new Exception("clienttype Should not be null");
		}
		
		if(null!=client.getIsnewparty()){
			if(branchparty){
				polclient.setIsexistingclient(true);
		}else{
			if(client.getIsnewparty().equalsIgnoreCase("Yes") && transction.equalsIgnoreCase("NB") ){
				polclient.setIsexistingclient(true);
			}else{polclient.setIsexistingclient(false);}
			
		}
		}else{
			throw new Exception("newClient Should not be null");
		}
		
	
		if((null!=client.getVip() && !client.getVip().equalsIgnoreCase(""))&&(client.getVip().equalsIgnoreCase("Yes")|| client.getVip().equalsIgnoreCase("Y"))){
			polclient.setIsvip(true);				
		}else{polclient.setIsvip(false);}
		
		
		
		
		
		polclient.setPannumber(client.getPannumber());
		
		polclient.setPincode(Integer.parseInt(client.getPincode()));
		
		polclient.setPrimarymobile(client.getMobile());
		
		
		polclient.setResidencerefnumber(client.getResidenceRefNumber());		
		
		Long Drid=client.getDriverId();
		
		if(null!=Drid && productcode2.equalsIgnoreCase("VPC_Comprehensive")){
			Object driver=Eapppol.Driverdetails(Drid);
			Object[] driverDetails = (Object[])driver;
			  if(!String.valueOf(driverDetails[0]).equalsIgnoreCase("null")){
				  polclient.setDob(String.valueOf(driverDetails[0]));				  
			  }
			if(!String.valueOf(driverDetails[1]).equalsIgnoreCase("0") && !String.valueOf(driverDetails[1]).contains("-") 
				&& Integer.parseInt(String.valueOf(driverDetails[1]))<=100){		  
				 polclient.setEianNumber(String.valueOf(driverDetails[1]));
		   }
			  
			  if(!String.valueOf(driverDetails[2]).equalsIgnoreCase("null")){
				  polclient.setEmail(String.valueOf(driverDetails[2]));				  				  
			  }
			  if(!String.valueOf(driverDetails[3]).equalsIgnoreCase("null")){
				  polclient.setIdrefnumber(String.valueOf(driverDetails[3]));				  
			  }
			  if(!String.valueOf(driverDetails[4]).equalsIgnoreCase("null")){
				  polclient.setGender(String.valueOf(driverDetails[4]));				  
			  }
			if(!String.valueOf(driverDetails[5]).equalsIgnoreCase("null")){
				polclient.setMaritalstatus(String.valueOf(driverDetails[5]));				  				
			}

	  }
		
		

		
		return polclient;
		
	}
	
	private Set<Payment> Eplpaymentset(Long payid) throws Exception {
		
		List<Object> obj=Eapppol.NewPayment(payid);
		
		if(obj.isEmpty()){
			throw new Exception("Receipts are not avalible For this policy");
		}
		
		Set<Payment> seteapppay=new HashSet<Payment>();
	     for( Object ob: obj) {
	    	 Payment Eapppayment=new Payment();
		 
		Object[] pay = (Object[]) ob;
		
		if(String.valueOf(pay[18]).equalsIgnoreCase("null")){
			
//			throw new Exception("Payment Method Should not be null");
			
		}else{
			
		}
		
		if(String.valueOf(pay[18]).equalsIgnoreCase("CARD")){
//			if(String.valueOf(pay[10]).equalsIgnoreCase("null") ||  String.valueOf(pay[9]).equalsIgnoreCase("null") ||  String.valueOf(pay[1]).equalsIgnoreCase("null")){
//			throw new Exception("Cardnumber,receiptno,CardExpadte Should not be null");
//			}else{
//			}
			if(String.valueOf(pay[10]).length()<16){
				String cardnum=StringUtils.rightPad(String.valueOf(pay[10]),16,"0"); 
				
				Eapppayment.setInstrumentnumber(cardnum);
				
			}else{
				Eapppayment.setInstrumentnumber(String.valueOf(pay[10]));					
			}
			Eapppayment.setReceiptnumber(String.valueOf(pay[22]));
			Eapppayment.setInstrumentexpdt(String.valueOf(pay[9]));
			
//		if(String.valueOf(pay[16]).equalsIgnoreCase("null") || String.valueOf(pay[6]).equalsIgnoreCase("null")){	
//			throw new Exception("Payment Amount,InstrumentBank Should not be null");			
//		}else{			
//		}		
		Eapppayment.setPaymentamount(String.valueOf(pay[16]));
		Eapppayment.setInstrumentbank(String.valueOf(pay[6]));
		//|| String.valueOf(pay[2]).equalsIgnoreCase("null")
//		if(String.valueOf(pay[4]).equalsIgnoreCase("null") || String.valueOf(pay[4]).equalsIgnoreCase("null") || String.valueOf(pay[2]).equalsIgnoreCase("null")){
//			throw new Exception("CardType,DepositBankcode,Transctionno Should not be null");
//		}else{
//		}
		Eapppayment.setInstrumenttype(String.valueOf(pay[11]));
		Eapppayment.setDepositingBankCode(String.valueOf(pay[4]));
		Eapppayment.setTRANSCATION_NO(String.valueOf(pay[2]));
		Eapppayment.setPaymenttype("CARD");
		Eapppayment.setCBC(String.valueOf(pay[1]));
		Eapppayment.setBankCity(String.valueOf(pay[3]));
		Eapppayment.setReceipt_amount(String.valueOf(pay[21]));
		Eapppayment.setIfsccode(String.valueOf(pay[5]));
		Eapppayment.setInstrumentbranch(String.valueOf(pay[7]));				
		Eapppayment.setMicrcode(String.valueOf(pay[14]));		
		Eapppayment.setPayeename(String.valueOf(pay[15]));
		Eapppayment.setPaymentdate(String.valueOf(pay[17]));
		Eapppayment.setPayto(String.valueOf(pay[19]));		
		Eapppayment.setPgserviceprovider(String.valueOf(pay[20]));
}
		
		else if(String.valueOf(pay[18]).equalsIgnoreCase("CHQ") || String.valueOf(pay[18]).equalsIgnoreCase("CHQPAY")){
			
//		if(String.valueOf(pay[10]).equalsIgnoreCase("null") || String.valueOf(pay[22]).equalsIgnoreCase("null") || String.valueOf(pay[17]).equalsIgnoreCase("null")){
//			
//			throw new Exception("Chequeno,Receipt No,Transctionno Should not be null");	
//			
//		}else{
//		}
		
//		Eapppayment.setInstrumentnumber(String.valueOf(pay[10]).replaceAll("[^\\d.]", ""));
//			if(!String.valueOf(pay[10]).equalsIgnoreCase("null")){
//
//			
//			}else{
//				Eapppayment.setInstrumentnumber(String.valueOf(pay[22]).replaceAll("[^\\d.]", ""));
//			}
			
			if(String.valueOf(pay[18]).equalsIgnoreCase("CHQPAY")){
				String chqno=String.valueOf(pay[10]);
				if(chqno.equalsIgnoreCase("null")){
					Eapppayment.setInstrumentnumber(String.valueOf(pay[22]).replaceAll("[^\\d.]", ""));
				}
				else{
					boolean hasUppercase = !chqno.equals(chqno.toLowerCase());
					boolean hasLowercase = !chqno.equals(chqno.toUpperCase());
					if(hasUppercase || hasLowercase){
						throw new Exception("Cheque_Number From Receiptmaster and DDNUMBER From Demanddraft  Table Should not contain character");
					}else{
						Eapppayment.setInstrumentnumber(String.valueOf(pay[10]));
					}
				}
				
			}else{
				Eapppayment.setInstrumentnumber(String.valueOf(pay[22]).replaceAll("[^\\d.]", ""));
			}
		
		Eapppayment.setPaymentdate(String.valueOf(pay[17]));
		Eapppayment.setReceiptnumber(String.valueOf(pay[22]));			
//	if(String.valueOf(pay[16]).equalsIgnoreCase("null") || String.valueOf(pay[6]).equalsIgnoreCase("null") || String.valueOf(pay[4]).equalsIgnoreCase("null")){
//		
//		throw new Exception("PaymentAmount,Instrumentbank,Depositing bank Should not be null");		
//		
//	}else{
//	}
	Eapppayment.setPaymentamount(String.valueOf(pay[16]));
	Eapppayment.setInstrumentbank(String.valueOf(pay[6]));
	Eapppayment.setDepositingBankCode(String.valueOf(pay[4]));
	
	Eapppayment.setPaymenttype("CHQ");
	Eapppayment.setCBC(String.valueOf(pay[1]));
	Eapppayment.setBankCity(String.valueOf(pay[3]));
	Eapppayment.setPayeename(String.valueOf(pay[15]));
	Eapppayment.setReceipt_amount(String.valueOf(pay[21]));
	Eapppayment.setTRANSCATION_NO(String.valueOf(pay[2]));
			
}
		else if(String.valueOf(pay[18]).equalsIgnoreCase("CASH")){
			
//			if(String.valueOf(pay[4]).equalsIgnoreCase("null") && String.valueOf(pay[16]).equalsIgnoreCase("null") && String.valueOf(pay[22]).equalsIgnoreCase("null")){
//				
//				throw new Exception("PaymentAmount,Depositing bank,Receipt No Should not be null");
//			}else{
//				
//			}
			Eapppayment.setInstrumentnumber(String.valueOf(pay[22]).replaceAll("[^\\d.]", ""));
			Eapppayment.setPaymentamount(String.valueOf(pay[16]));
			Eapppayment.setDepositingBankCode(String.valueOf(pay[4]));
			Eapppayment.setReceiptnumber(String.valueOf(pay[22]));	
			Eapppayment.setPaymenttype("CASH");
			Eapppayment.setCBC(String.valueOf(pay[1]));
			Eapppayment.setBankCity(String.valueOf(pay[3]));
			Eapppayment.setPayeename(String.valueOf(pay[15]));
			Eapppayment.setReceipt_amount(String.valueOf(pay[21]));
			Eapppayment.setTRANSCATION_NO(String.valueOf(pay[2]));
			Eapppayment.setInstrumentbank(String.valueOf(pay[6]));
			Eapppayment.setPaymentdate(String.valueOf(pay[17]));	
			
		}

		else{			
			Eapppayment.setIfsccode(String.valueOf(pay[5]));
			Eapppayment.setMicrcode(String.valueOf(pay[14]));
		
//			if(String.valueOf(pay[4]).equalsIgnoreCase("null") || String.valueOf(pay[16]).equalsIgnoreCase("null") 
//					||  String.valueOf(pay[2]).equalsIgnoreCase("null") || String.valueOf(pay[22]).equalsIgnoreCase("null")){
//				
//				throw new Exception("BDdepositbank,Bdamount,Bd Transcation No,Receipt No Should not be null");
//				
//			}else{
//				
//			}
			Eapppayment.setDepositingBankCode(String.valueOf(pay[4]));
			Eapppayment.setPaymentamount(String.valueOf(pay[16]));
			Eapppayment.setTRANSCATION_NO(String.valueOf(pay[2]));
			Eapppayment.setReceiptnumber(String.valueOf(pay[22]));			
	
//      if(String.valueOf(pay[17]).equalsIgnoreCase("null") || String.valueOf(pay[15]).equalsIgnoreCase("null") || String.valueOf(pay[6]).equalsIgnoreCase("null") ){
//			
//    	  throw new Exception("BDdepositbank,Bd amount,Bd Transcation No Should not be null");
//			
//		}else{
			
//		}
      Eapppayment.setPayeename(String.valueOf(pay[15]));
      Eapppayment.setPaymentdate(String.valueOf(pay[17]));
      Eapppayment.setInstrumentbank(String.valueOf(pay[6]));
      Eapppayment.setPaymenttype("BD");
      Eapppayment.setBankCity(String.valueOf(pay[3]));
		
}

		
		
		
//		Eapppayment.setInstrumentdate(String.valueOf(pay[8]));

//		Eapppayment.setIscustomerpayment(String.valueOf(pay[12]));
		
//		Eapppayment.setIslocalinstrument(String.valueOf(pay[13]));		
		
		seteapppay.add(Eapppayment);    	
  }
	     return seteapppay;
}	

//	private Set<Policyitem> EplPolicyItemSet(String productCode, Long Icovid) throws Exception {
//		
//		Set<Policyitem> setpolitem=new HashSet<Policyitem>(); 
//		
//		
//		
//		Privatecaritem Eplcar=carSet(Icovid,productCode);
//		
//	Set<Iicoverage>	EplItemCoverage=CoverageSet(productCode,Icovid);
//	
//	Policyitem Oneitem=new Policyitem();
//	
//	Oneitem.setIicoverages(EplItemCoverage);
//	
//	Oneitem.setPrivatecaritem(Eplcar);
//	
//	Eplcar.setPolitem(Oneitem);
//	
//	
//	setpolitem.add(Oneitem);
//	
//		
//	return setpolitem;
//	
//}


	private void carSet(Long carid, String productCode, Set<Policyitem> setpolitem) throws Exception {
		
		Object Objcar=null;
		
		if(productCode.equalsIgnoreCase("VPC")){
			
			Objcar=Eapppol.Car(carid);
			
			Policyitem politem=new Policyitem();
			
			Object[] obcar= (Object[])Objcar;
			
			Privatecaritem car=new Privatecaritem();
			
			car.setPolitem(politem);
			
			if(String.valueOf(obcar[21]).equalsIgnoreCase("null") || String.valueOf(obcar[12]).equalsIgnoreCase("null") 
					|| String.valueOf(obcar[22]).equalsIgnoreCase("null") && String.valueOf(obcar[9]).equalsIgnoreCase("null")){
				
				throw new Exception("Idv,Zone,Registartion State Code and Model code Should not be null");
				
			}else{
				car.setIdv(Double.valueOf(String.valueOf(obcar[21])));
				car.setZone(String.valueOf(obcar[12]));	
				car.setRegstatecode(String.valueOf(obcar[22]));
				car.setModelcode(String.valueOf(obcar[9]));
			}
			
	   if(String.valueOf(obcar[2]).equalsIgnoreCase("null") || String.valueOf(obcar[11]).equalsIgnoreCase("null") ){
		   //|| String.valueOf(obcar[7]).equalsIgnoreCase("null") Log Boook No
		   
		   throw new Exception("Engine Capacity,Seating Capacity Should not be null");
		   
	   }else{	   
		   car.setEnginecapacity(Long.parseLong(String.valueOf(obcar[2])));
		   car.setSeatingcapacity(Long.parseLong(String.valueOf(obcar[11])));
		   if(!String.valueOf(obcar[7]).equalsIgnoreCase("null")){
			  String logno= String.valueOf(obcar[7]).replaceFirst("^,", "");
			  logno= String.valueOf(obcar[7]).replaceAll(",$", "");
			   car.setImtNumbers(logno);	
		   }
	   }
			
	   if(String.valueOf(obcar[3]).equalsIgnoreCase("null") || String.valueOf(obcar[5]).equalsIgnoreCase("null")){
		   
		   throw new Exception("Engine No,Chasis No Should not be null");
		   
	   }else{
		   car.setChassisnumber(String.valueOf(obcar[3]));      
		   car.setEnginenumber(String.valueOf(obcar[5]));	   
	   }
	   if(String.valueOf(obcar[4]).equalsIgnoreCase("null") || String.valueOf(obcar[20]).equalsIgnoreCase("null")){
		   car.setColorofvehicle("0001");
		   car.setNcbpercentage((long) 0);	
	   }else{
		   car.setColorofvehicle(String.valueOf(obcar[4]));
		   car.setNcbpercentage(Long.parseLong(String.valueOf(obcar[20])));	   
	   }
	   
				
			if(String.valueOf(obcar[10]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegnum(String.valueOf(obcar[10]));
			}
				
			if(String.valueOf(obcar[13]).equalsIgnoreCase("null")){
				
			}else{
				car.setTypeofusage(String.valueOf(obcar[13]));			
			}
			
			if(String.valueOf(obcar[14]).equalsIgnoreCase("null")){
				
							
			}else{
				car.setYom(String.valueOf(obcar[14]));
			}
			if(String.valueOf(obcar[15]).equalsIgnoreCase("null")){
				
			}else{
				
				car.setRegdate(String.valueOf(obcar[15]));	
				
			}if(String.valueOf(obcar[16]).equalsIgnoreCase("null")){
				
				
			}else{
				
				car.setHypothecatedto(String.valueOf(obcar[16]));
				
			}
			
			if(String.valueOf(obcar[17]).equalsIgnoreCase("null")){
				
			}else{
				car.setRto(String.valueOf(obcar[17]));					
			}
			if(String.valueOf(obcar[18]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegcityname(String.valueOf(obcar[18]));					
			}
			if(String.valueOf(obcar[19]).equalsIgnoreCase("null")){
				
			}else{
				car.setMakecode(String.valueOf(obcar[19]));			
			}
			
			if(!String.valueOf(obcar[0]).equalsIgnoreCase("null")){
				car.setRegion(String.valueOf(obcar[0]));				
			}
			
			if(!String.valueOf(obcar[1]).equalsIgnoreCase("null")){
				car.setHypothecationtype(String.valueOf(obcar[1]));				
			}
			
			if(!String.valueOf(obcar[23]).equalsIgnoreCase("null")){
				car.setFueltype(String.valueOf(obcar[23]));				
			}
			
			politem.setPrivatecaritem(car);
			setpolitem.add(politem);
			
			
			CoverageSet(productCode,carid,setpolitem,politem);
			
		}
		else if(productCode.equalsIgnoreCase("VMC")){
			
			Objcar=Eapppol.Motorcycle(carid);
			
			Policyitem politem=new Policyitem();
			
			Object[] obcar= (Object[])Objcar;
			
			Privatecaritem car=new Privatecaritem();
			
			car.setPolitem(politem);
			
			if(String.valueOf(obcar[21]).equalsIgnoreCase("null") || String.valueOf(obcar[12]).equalsIgnoreCase("null") 
					|| String.valueOf(obcar[22]).equalsIgnoreCase("null") && String.valueOf(obcar[9]).equalsIgnoreCase("null")){
				
				throw new Exception("Idv,Zone,Registartion State Code and Model code Should not be null");
				
			}else{
				car.setIdv(Double.valueOf(String.valueOf(obcar[21])));
				car.setZone(String.valueOf(obcar[12]));	
				car.setRegstatecode(String.valueOf(obcar[22]));
				car.setModelcode(String.valueOf(obcar[9]));
			}
			
	   if(String.valueOf(obcar[2]).equalsIgnoreCase("null") || String.valueOf(obcar[11]).equalsIgnoreCase("null") ){
		   //|| String.valueOf(obcar[7]).equalsIgnoreCase("null") Log Boook No
		   
		   throw new Exception("Engine Capacity,Seating Capacity Should not be null");
		   
	   }else{	   
		   car.setEnginecapacity(Long.parseLong(String.valueOf(obcar[2])));
		   car.setSeatingcapacity(Long.parseLong(String.valueOf(obcar[11])));
		   if(String.valueOf(obcar[7]).equalsIgnoreCase("null")){
			   
		   }else{			   
			   car.setImtNumbers(String.valueOf(obcar[7]));	   
		   }
	   }
			
	   if(String.valueOf(obcar[3]).equalsIgnoreCase("null") || String.valueOf(obcar[5]).equalsIgnoreCase("null")){
		   
		   throw new Exception("Engine No,Chasis No Should not be null");
		   
	   }else{
		   car.setChassisnumber(String.valueOf(obcar[3]));      
		   car.setEnginenumber(String.valueOf(obcar[5]));	   
	   }
	   if(String.valueOf(obcar[4]).equalsIgnoreCase("null") || String.valueOf(obcar[20]).equalsIgnoreCase("null")){
		   car.setColorofvehicle("0001");
		   car.setNcbpercentage((long) 0);	
	   }else{
		   car.setColorofvehicle(String.valueOf(obcar[4]));
		   car.setNcbpercentage(Long.parseLong(String.valueOf(obcar[20])));	   
	   }
	   
				
			if(String.valueOf(obcar[10]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegnum(String.valueOf(obcar[10]));
			}
				
			if(String.valueOf(obcar[13]).equalsIgnoreCase("null")){
				
			}else{
				car.setTypeofusage(String.valueOf(obcar[13]));			
			}
			
			if(String.valueOf(obcar[14]).equalsIgnoreCase("null")){
				
							
			}else{
				car.setYom(String.valueOf(obcar[14]));
			}
			if(String.valueOf(obcar[15]).equalsIgnoreCase("null")){
				
			}else{
				
				car.setRegdate(String.valueOf(obcar[15]));	
				
			}if(String.valueOf(obcar[16]).equalsIgnoreCase("null")){
				
				
			}else{
				
				car.setHypothecatedto(String.valueOf(obcar[16]));
				
			}
			
			if(String.valueOf(obcar[17]).equalsIgnoreCase("null")){
				
			}else{
				car.setRto(String.valueOf(obcar[17]));					
			}
			if(String.valueOf(obcar[18]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegcityname(String.valueOf(obcar[18]));					
			}
			if(String.valueOf(obcar[19]).equalsIgnoreCase("null")){
				
			}else{
				car.setMakecode(String.valueOf(obcar[19]));			
			}
			
			if(!String.valueOf(obcar[0]).equalsIgnoreCase("null")){
				car.setRegion(String.valueOf(obcar[0]));				
			}
			
			if(!String.valueOf(obcar[1]).equalsIgnoreCase("null")){
				car.setHypothecationtype(String.valueOf(obcar[1]));				
			}
			
			if(!String.valueOf(obcar[23]).equalsIgnoreCase("null")){
				car.setFueltype(String.valueOf(obcar[23]));				
			}
			
			politem.setPrivatecaritem(car);
			setpolitem.add(politem);
			
			
			CoverageSet(productCode,carid,setpolitem,politem);
			
		}
		else if(productCode.equalsIgnoreCase("VPCV")){
			
			Objcar=Eapppol.VPCVCar(carid);
			
			Policyitem politem=new Policyitem();
			
			Object[] obcar= (Object[])Objcar;
			Privatecaritem car=new Privatecaritem();
			
			car.setPolitem(politem);
			
			if(String.valueOf(obcar[21]).equalsIgnoreCase("null") || String.valueOf(obcar[12]).equalsIgnoreCase("null") 
					|| String.valueOf(obcar[22]).equalsIgnoreCase("null") && String.valueOf(obcar[9]).equalsIgnoreCase("null")){
				
				throw new Exception("Idv,Zone,Registartion State Code and Model code Should not be null");
				
			}else{
				car.setIdv(Double.valueOf(String.valueOf(obcar[21])));
				car.setZone(String.valueOf(obcar[12]));	
				car.setRegstatecode(String.valueOf(obcar[22]));
				car.setModelcode(String.valueOf(obcar[9]));
			}
			
	   if(String.valueOf(obcar[2]).equalsIgnoreCase("null") || String.valueOf(obcar[11]).equalsIgnoreCase("null")){
		   
		   //|| String.valueOf(obcar[7]).equalsIgnoreCase("null") Log Book No
		   
		   throw new Exception("Engine Capacity,Seating Capacity Should not be null");
		   
	   }else{	   
		   car.setEnginecapacity(Long.parseLong(String.valueOf(obcar[2])));
		   car.setSeatingcapacity(Long.parseLong(String.valueOf(obcar[11])));
		   if(String.valueOf(obcar[7]).equalsIgnoreCase("null")){
			   
		   }else{			   
			   car.setImtNumbers(String.valueOf(obcar[7]));	   
		   }   
	   }
			
	   if(String.valueOf(obcar[3]).equalsIgnoreCase("null") || String.valueOf(obcar[5]).equalsIgnoreCase("null")){
		   
		   throw new Exception("Engine No,Chasis No Should not be null");
		   
	   }else{
		   car.setChassisnumber(String.valueOf(obcar[3]));      
		   car.setEnginenumber(String.valueOf(obcar[5]));	   
	   }
	   if(String.valueOf(obcar[4]).equalsIgnoreCase("null") || String.valueOf(obcar[20]).equalsIgnoreCase("null")){
		   car.setColorofvehicle("0001");
		   car.setNcbpercentage((long) 0);	
	   }else{
		   car.setColorofvehicle(String.valueOf(obcar[4]));
		   car.setNcbpercentage(Long.parseLong(String.valueOf(obcar[20])));	   
	   }
	   
			if(String.valueOf(obcar[10]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegnum(String.valueOf(obcar[10]));
			}
				
			if(String.valueOf(obcar[13]).equalsIgnoreCase("null")){
				
			}else{
				car.setTypeofusage(String.valueOf(obcar[13]));			
			}
			
			if(String.valueOf(obcar[14]).equalsIgnoreCase("null")){
				
							
			}else{
				car.setYom(String.valueOf(obcar[14]));
			}
			if(String.valueOf(obcar[15]).equalsIgnoreCase("null")){
				
			}else{
				
				car.setRegdate(String.valueOf(obcar[15]));	
				
			}if(String.valueOf(obcar[16]).equalsIgnoreCase("null")){
				
				
			}else{
				
				car.setHypothecatedto(String.valueOf(obcar[16]));
				
			}
			
			if(String.valueOf(obcar[17]).equalsIgnoreCase("null")){
				
			}else{
				car.setRto(String.valueOf(obcar[17]));					
			}
			if(String.valueOf(obcar[18]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegcityname(String.valueOf(obcar[18]));					
			}
			if(String.valueOf(obcar[19]).equalsIgnoreCase("null")){
				
			}else{
				car.setMakecode(String.valueOf(obcar[19]));			
			}			
			
			
			if(!String.valueOf(obcar[0]).equalsIgnoreCase("null")){
				car.setRegion(String.valueOf(obcar[0]));				
			}
			
			if(!String.valueOf(obcar[1]).equalsIgnoreCase("null")){
				car.setHypothecationtype(String.valueOf(obcar[1]));				
			}
			
			if(!String.valueOf(obcar[23]).equalsIgnoreCase("null")){
				car.setFueltype(String.valueOf(obcar[23]));				
			}
			
			
			
			politem.setPrivatecaritem(car);
			setpolitem.add(politem);
			
			CoverageSet(productCode,carid,setpolitem,politem);
			
		}
		else if(productCode.equalsIgnoreCase("VGC") || productCode.equalsIgnoreCase("VOC") ||  productCode.equalsIgnoreCase("VFA")){
			
			Objcar=Eapppol.OtherCar(carid);
			
			Policyitem politem=new Policyitem();
			
			Policyitem trailer1=new Policyitem();
			
			Policyitem trailer2=new Policyitem();
			
			Object[] obcar= (Object[])Objcar;
			
			Privatecaritem car=new Privatecaritem();
			
			car.setPolitem(politem);
			
			if(String.valueOf(obcar[21]).equalsIgnoreCase("null") || String.valueOf(obcar[12]).equalsIgnoreCase("null") 
					|| String.valueOf(obcar[22]).equalsIgnoreCase("null") && String.valueOf(obcar[9]).equalsIgnoreCase("null")){
				
				throw new Exception("Idv,Zone,Registartion State Code and Model code Should not be null");
				
			}else{
				car.setIdv(Double.valueOf(String.valueOf(obcar[21])));
				car.setZone(String.valueOf(obcar[12]));	
				car.setRegstatecode(String.valueOf(obcar[22]));
				car.setModelcode(String.valueOf(obcar[9]));
			}
			
	   if(String.valueOf(obcar[2]).equalsIgnoreCase("null") || String.valueOf(obcar[11]).equalsIgnoreCase("null")){
		   
		   //|| String.valueOf(obcar[7]).equalsIgnoreCase("null") Log Book No
		   
		   throw new Exception("Engine Capacity,Seating Capacity,and Log Book no Should not be null");
		   
	   }else{	   
		   car.setEnginecapacity(Long.parseLong(String.valueOf(obcar[2])));
		   car.setSeatingcapacity(Long.parseLong(String.valueOf(obcar[11])));
		   if(String.valueOf(obcar[7]).equalsIgnoreCase("null")){
			   
		   }else{			   
			   car.setImtNumbers(String.valueOf(obcar[7]));	   
		   }  
	   }
			
	   if(String.valueOf(obcar[3]).equalsIgnoreCase("null") || String.valueOf(obcar[5]).equalsIgnoreCase("null")){
		   
		   throw new Exception("Engine No,Chasis No Should not be null");
		   
	   }else{
		   car.setChassisnumber(String.valueOf(obcar[3]));      
		   car.setEnginenumber(String.valueOf(obcar[5]));	   
	   }
	   if(String.valueOf(obcar[4]).equalsIgnoreCase("null") || String.valueOf(obcar[20]).equalsIgnoreCase("null")){
		   car.setColorofvehicle("0001");
		   car.setNcbpercentage((long) 0);	
	   }else{
		   car.setColorofvehicle(String.valueOf(obcar[4]));
		   car.setNcbpercentage(Long.parseLong(String.valueOf(obcar[20])));	   
	   }
	   
				
			if(String.valueOf(obcar[10]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegnum(String.valueOf(obcar[10]));
			}
				
			if(String.valueOf(obcar[13]).equalsIgnoreCase("null")){
				
			}else{
				car.setTypeofusage(String.valueOf(obcar[13]));			
			}
			
			if(String.valueOf(obcar[14]).equalsIgnoreCase("null")){
				
							
			}else{
				car.setYom(String.valueOf(obcar[14]));
			}
			if(String.valueOf(obcar[15]).equalsIgnoreCase("null")){
				
			}else{
				
				car.setRegdate(String.valueOf(obcar[15]));	
				
			}if(String.valueOf(obcar[16]).equalsIgnoreCase("null")){
				
				
			}else{
				
				car.setHypothecatedto(String.valueOf(obcar[16]));
				
			}
			
			if(String.valueOf(obcar[17]).equalsIgnoreCase("null")){
				
			}else{
				car.setRto(String.valueOf(obcar[17]));					
			}
			if(String.valueOf(obcar[18]).equalsIgnoreCase("null")){
				
			}else{
				car.setRegcityname(String.valueOf(obcar[18]));					
			}
			if(String.valueOf(obcar[19]).equalsIgnoreCase("null")){
				
			}else{
				if(productCode.equalsIgnoreCase("VGC") && String.valueOf(obcar[19]).toLowerCase().startsWith("mk")){}
				else{car.setMakecode(String.valueOf(obcar[19]));			
				}
			}	
			
			
			if(!String.valueOf(obcar[0]).equalsIgnoreCase("null")){
				car.setRegion(String.valueOf(obcar[0]));				
			}
			
			if(!String.valueOf(obcar[1]).equalsIgnoreCase("null")){
				car.setHypothecationtype(String.valueOf(obcar[1]));				
			}
			
			if(!String.valueOf(obcar[33]).equalsIgnoreCase("null")){
				car.setFueltype(String.valueOf(obcar[33]));				
			}
			
			
			politem.setPrivatecaritem(car);
			setpolitem.add(politem);
			
			OtherCoverageSet(productCode,carid,setpolitem,politem,trailer1,trailer2);
			
			   if(!String.valueOf(obcar[24]).equalsIgnoreCase("null")){				   
				  Privatecaritem pcar2=new Privatecaritem();				  
				  pcar2.setPolitem(trailer1);
				  pcar2.setIdv(Double.valueOf(String.valueOf(obcar[23])));
				  pcar2.setModelcode(String.valueOf(obcar[24]));
				  pcar2.setMakecode(String.valueOf(obcar[25]));
				  pcar2.setYom(String.valueOf(obcar[26]));
				  pcar2.setChassisnumber(String.valueOf(obcar[27]));	
				  pcar2.setZone(String.valueOf(obcar[12]));	
				  pcar2.setRegstatecode(String.valueOf(obcar[22]));
				  pcar2.setEnginecapacity(Long.parseLong(String.valueOf(obcar[2])));
				  pcar2.setSeatingcapacity(Long.parseLong(String.valueOf(obcar[11])));
				   if(String.valueOf(obcar[7]).equalsIgnoreCase("null")){
					   
				   }else{			   
					   pcar2.setImtNumbers(String.valueOf(obcar[7]));	   
				   }
				  pcar2.setEnginenumber(String.valueOf(obcar[5]));	  
				 if(String.valueOf(obcar[4]).equalsIgnoreCase("null") || String.valueOf(obcar[20]).equalsIgnoreCase("null")){
					 pcar2.setColorofvehicle("0001");
					 pcar2.setNcbpercentage((long) 0);	
				 }else{
					 pcar2.setColorofvehicle(String.valueOf(obcar[4]));
					 pcar2.setNcbpercentage(Long.parseLong(String.valueOf(obcar[20])));	   
				 }
				  
				if(String.valueOf(obcar[10]).equalsIgnoreCase("null")){
						
			     }else{
			    	 pcar2.setRegnum(String.valueOf(obcar[10]));
				}
				
					
				if(String.valueOf(obcar[13]).equalsIgnoreCase("null")){
					
				}else{
					pcar2.setTypeofusage(String.valueOf(obcar[13]));			
				}

				if(String.valueOf(obcar[15]).equalsIgnoreCase("null")){
					
				}else{
					
					pcar2.setRegdate(String.valueOf(obcar[15]));	
					
				}if(String.valueOf(obcar[16]).equalsIgnoreCase("null")){
					
				}else{					
					pcar2.setHypothecatedto(String.valueOf(obcar[16]));					
				}
				
				if(String.valueOf(obcar[17]).equalsIgnoreCase("null")){
					
				}else{
					pcar2.setRto(String.valueOf(obcar[17]));					
				}
				if(String.valueOf(obcar[18]).equalsIgnoreCase("null")){
					
				}else{
					pcar2.setRegcityname(String.valueOf(obcar[18]));					
				}
				  trailer1.setPrivatecaritem(pcar2);				  
				  setpolitem.add(trailer1);		
//				  OtherCoverageSet(productCode,carid,setpolitem,politem,trailer1,trailer2);
			   }			   
			   if(!String.valueOf(obcar[29]).equalsIgnoreCase("null")){				   
				  Privatecaritem pcar3=new Privatecaritem();				  
				  pcar3.setPolitem(trailer2);
				  pcar3.setIdv(Double.valueOf(String.valueOf(obcar[28])));
				  pcar3.setModelcode(String.valueOf(obcar[29]));
				  pcar3.setMakecode(String.valueOf(obcar[30]));
				  pcar3.setYom(String.valueOf(obcar[31]));
				  pcar3.setChassisnumber(String.valueOf(obcar[32]));	
				  pcar3.setZone(String.valueOf(obcar[12]));	
				  pcar3.setRegstatecode(String.valueOf(obcar[22]));
				  pcar3.setEnginecapacity(Long.parseLong(String.valueOf(obcar[2])));
				  pcar3.setSeatingcapacity(Long.parseLong(String.valueOf(obcar[11])));
				   if(String.valueOf(obcar[7]).equalsIgnoreCase("null")){
					   
				   }else{			   
					   pcar3.setImtNumbers(String.valueOf(obcar[7]));	   
				   }				  
				  pcar3.setEnginenumber(String.valueOf(obcar[5]));	  
				 if(String.valueOf(obcar[4]).equalsIgnoreCase("null") || String.valueOf(obcar[20]).equalsIgnoreCase("null")){
					 pcar3.setColorofvehicle("0001");
					 pcar3.setNcbpercentage((long) 0);	
				 }else{
					 pcar3.setColorofvehicle(String.valueOf(obcar[4]));
					 pcar3.setNcbpercentage(Long.parseLong(String.valueOf(obcar[20])));	   
				 }
				  
				if(String.valueOf(obcar[10]).equalsIgnoreCase("null")){
						
			     }else{
			    	 pcar3.setRegnum(String.valueOf(obcar[10]));
				}
				
					
				if(String.valueOf(obcar[13]).equalsIgnoreCase("null")){
					
				}else{
					pcar3.setTypeofusage(String.valueOf(obcar[13]));			
				}

				if(String.valueOf(obcar[15]).equalsIgnoreCase("null")){
					
				}else{
					
					pcar3.setRegdate(String.valueOf(obcar[15]));	
					
				}if(String.valueOf(obcar[16]).equalsIgnoreCase("null")){
					
				}else{					
					pcar3.setHypothecatedto(String.valueOf(obcar[16]));					
				}
				
				if(String.valueOf(obcar[17]).equalsIgnoreCase("null")){
					
				}else{
					pcar3.setRto(String.valueOf(obcar[17]));					
				}
				if(String.valueOf(obcar[18]).equalsIgnoreCase("null")){
					
				}else{
					pcar3.setRegcityname(String.valueOf(obcar[18]));					
				}				  
				  trailer2.setPrivatecaritem(pcar3);				  
				  setpolitem.add(trailer2);	
			   }
			
		}		
 }	
	
	
	private Set<Policycoverage> PolicyCoverageSet(Long covid, Set<Payment> eplpayment) {
		Set<Policycoverage> Setcoverage=new HashSet<>();
		Object polob=Eapppol.PolicyCoverage(covid);
		
		Object[] polcov = (Object[]) polob;
		
		double policycov=0;
		
	    for (Object cov:polcov){
	    	String polcovs=cov.toString();
	    	
	    	Policycoverage polcoverage=new Policycoverage();
	    	
	    	Policycoverage zovcm=new Policycoverage();
	    	
	    	String[] covers=polcovs.split("-");
	    	
	    	
	    	if(String.valueOf(covers[0]).equalsIgnoreCase("ZOVCM_RATE") ){
	    		zovcm.setCode("ZOVCM");
	    		zovcm.setName(String.valueOf(covers[1]));
	    	}else if(String.valueOf(covers[0]).equalsIgnoreCase("ZOVCM")){
	    			zovcm.setCode("ZOVCM");
	    			zovcm.setPremium(String.valueOf(covers[1]));
	    	}else{
	    		polcoverage.setCode(String.valueOf(covers[0]));
	    		polcoverage.setPremium(String.valueOf(covers[1]));	    		
	    		policycov+=Double.parseDouble(String.valueOf(covers[1]));	    		
	    	}
	    	
//	    	if(polcovs.startsWith("ZWROFF")){
//		    	String[] covers=polcovs.split("=");
//		    	
//		    	polcoverage.setCode(String.valueOf(covers[0]));
//	    		
//		    	polcoverage.setPremium(String.valueOf(covers[1]));
//	    		
//	    	}else{
//	    	}
	    	
	    	
	    	Setcoverage.add(polcoverage);
	    	Setcoverage.add(zovcm);
		    		
	    }
	    
			Double NetReceiptAmount=0.00;
			String zwroff="-";
			for (Payment payDoun : eplpayment) {
				NetReceiptAmount+=Double.parseDouble(payDoun.getPaymentamount());
		}
			double total=this.getTotalpremium()+policycov;
			
			total=Math.round(total);
			
			if(total>NetReceiptAmount){
				
				zwroff= zwroff.concat(String.valueOf(total-NetReceiptAmount));
				
			}else{
				zwroff="0";
			}
	    
	    Policycoverage polcon=new Policycoverage();
	    
    	
	    polcon.setCode("ZWROFF");
    	
	    polcon.setPremium(zwroff);
	    
	    
	    Setcoverage.add(polcon);
		return Setcoverage;
	}
    
  private void CoverageSet(String productCode,Long ids, Set<Policyitem> setpolitem, Policyitem politem2) {
		
		Set<Iicoverage> setiicov=new HashSet<Iicoverage>();
		
		if(productCode.equalsIgnoreCase("VPC")){
			
		Object CoverageVPC = Eapppol.CoverageVPC(ids);
		ArrayList<String> vpcvoverages=new ArrayList<String>();
		vpcvoverages.add("VPCDEP");		
		vpcvoverages.add("VPCPRM");
		vpcvoverages.add("VPCTPL");			
		vpcvoverages.add("VPCUND");
		vpcvoverages.add("VPCTDD");
		vpcvoverages.add("VPCEXG");
		vpcvoverages.add("VPCNEA");
		vpcvoverages.add("VPCLLE");
		vpcvoverages.add("VPCEAS");
		vpcvoverages.add("VPCFOR");
		vpcvoverages.add("VPCPND");
		vpcvoverages.add("VPCWSG");
//		vpcvoverages.add("ROUND2");
		vpcvoverages.add("VPCNMD");
		vpcvoverages.add("VPCAAD");
		vpcvoverages.add("VPCTOW");
		vpcvoverages.add("VPCKE2");
		vpcvoverages.add("VPCATD");
		vpcvoverages.add("VPCFBG");
		vpcvoverages.add("VPCCM1");
//		vpcvoverages.add("ROUND1");
		vpcvoverages.add("VPCNCD");
		vpcvoverages.add("VPCVES");
		vpcvoverages.add("VPCNCB");
		vpcvoverages.add("VPCPHD");
		vpcvoverages.add("VPCKE1");
		vpcvoverages.add("VPCPOD");
		vpcvoverages.add("VPCEXL");
		vpcvoverages.add("VPCENG");
		vpcvoverages.add("VPCLRT");
		vpcvoverages.add("VPCTRL");
		vpcvoverages.add("VPCINV");
		vpcvoverages.add("VPCCM2");
		vpcvoverages.add("VPCLSC");
		vpcvoverages.add("VPCBAG");
		vpcvoverages.add("VPCLLD");
		vpcvoverages.add("VPCCNG");
		vpcvoverages.add("VPCCVD");
		vpcvoverages.add("VPCDTE");
		vpcvoverages.add("VPCGAS");
		
		ArrayList<String> bppass=new ArrayList<String>();
		bppass.add("VPCPRM");
        bppass.add("VPCCNG");
        bppass.add("VPCEAS");
        
        ArrayList<String> bpvaaddss=new ArrayList<String>();
        bpvaaddss.add("VPCEXG");
        bpvaaddss.add("VPCFOR");
        bpvaaddss.add("VPCFBG");
        bpvaaddss.add("VPCDTE");
        bpvaaddss.add("VPCDEP");
        bpvaaddss.add("VPCLRT");
        bpvaaddss.add("VPCWSG");
        bpvaaddss.add("VPCLSC");
        bpvaaddss.add("VPCINV");
        bpvaaddss.add("VPCBAG");
        bpvaaddss.add("VPCNCB");
        bpvaaddss.add("VPCENG");
        bpvaaddss.add("VPCKE1");
        
        ArrayList<String> bpvadeduss=new ArrayList<String>();
        bpvadeduss.add("VPCTDD");
        bpvadeduss.add("VPCVES");
        bpvadeduss.add("VPCAAD");
        bpvadeduss.add("VPCPHD");
		
//        ArrayList<String> tpass=new ArrayList<String>();
//        tpass.add("VPCTPL");
//        tpass.add("VPCGAS");
 
        
        ArrayList<String> tpaddss=new ArrayList<String>();   
        tpaddss.add("VPCPOD");
        tpaddss.add("VPCNMD");
        tpaddss.add("VPCUND");
        tpaddss.add("VPCPND");      
        tpaddss.add("VPCLLD");
        tpaddss.add("VPCLLE");
        tpaddss.add("VPCEXL");
        
//        ArrayList<String> tpaddss=new ArrayList<String>(); 
        
        DecimalFormat df = new DecimalFormat("############.##");
        double bppa = 0;
        double bpvaadd = 0;
        double bpvadedu = 0;
        double tppa = 0;
        double total_bpva_round=0;
        double round1=0;
        double tpadd = 0;
        double total_bpva=0;
        double vpcncd=0;
        double VPCATD=0;
        double totalprem=0;
        
		Object[] rawarr = (Object[])CoverageVPC;
		List<Object> arr2=Arrays.asList(rawarr);
		for (String string : vpcvoverages) {
			try {
				Iicoverage icovv=new Iicoverage();
				Optional<Object> tsr=arr2.stream()
						.filter(x -> ((String) x).startsWith(string)).findAny();
				Optional<Object> tsr1=arr2.stream()
						.filter(x -> ((String) x).startsWith("SI"+string)).findAny();	
				Optional<Object> tsr2=arr2.stream()
						.filter(x -> ((String) x).startsWith("DEDUCTIBLES"+string)).findAny();	
			
				
				String rak=(String) tsr.get();
				
				String[] sts=rak.split("=");
				
				if(rak.startsWith("VPCTDD") ||  rak.startsWith("VPCVES") ||  rak.startsWith("VPCPHD") 
						|| rak.startsWith("VPCNCD") || rak.startsWith("VPCAAD") || rak.startsWith("VPCATD")){
					icovv.setCode(string);
					
					icovv.setPremium("-"+(df.format(Double.parseDouble(sts[1]))));
				}else{
					icovv.setCode(string);
					icovv.setPremium(df.format(Double.parseDouble(sts[1])));
					totalprem+=Double.parseDouble(sts[1]);
				}

				
				String rak1=(String) tsr1.get();
				String[] sts1=rak1.split("-");
				icovv.setSuminsuredname("SI"+string);
				icovv.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
				
				String rak2=(String) tsr2.get();
				String[] sts2=rak2.split("-");
				icovv.setDeductiblename("DEDUCTIBLES"+string);
				icovv.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
				
				setiicov.add(icovv);
				
				if(bppass.contains(string)){
					bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(bpvaaddss.contains(string)){
					bpvaadd+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(bpvadeduss.contains(string)){
					bpvadedu+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(rak.startsWith("VPCTPL") || rak.startsWith("VPCGAS")){
					tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(rak.startsWith("VPCNCD")){
					vpcncd=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(rak.startsWith("VPCATD")){
					VPCATD=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}
					else if(tpaddss.contains(string)){
					tpadd+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}
				
				
			} catch (Exception e) {}
			
		}
             
		totalprem=totalprem-(bpvadedu+VPCATD+vpcncd);
		
		totalprem= Double.parseDouble(df.format(totalprem));
		
		this.setTotalpremium(totalprem);
		  
         total_bpva = (bppa+bpvaadd)-bpvadedu;
        total_bpva = total_bpva-vpcncd; 
             
             
         total_bpva_round = Math.round(total_bpva);
         round1 = Double.parseDouble(df.format((total_bpva - total_bpva_round)*(-1)));
         tppa=tppa-VPCATD;
         
        double  total_tp = tppa+tpadd;
        double  total_tp_round = Math.round(total_tp);
        
        double round2 = Double.parseDouble(df.format((total_tp - total_tp_round)*(-1)));  
		
        Iicoverage icovvround1=new Iicoverage();
        
        icovvround1.setCode("ROUND1");
        icovvround1.setPremium(String.valueOf(round1));
        icovvround1.setSuminsuredname("SIROUND1");
        icovvround1.setSuminsuredamount("0");
        icovvround1.setDeductiblename("DEDUCTIBLESROUND1");
        icovvround1.setDeductibleamount("0");
        
        setiicov.add(icovvround1);
        
        Iicoverage icovvround2=new Iicoverage();
        
        icovvround2.setCode("ROUND2");
        icovvround2.setPremium(String.valueOf(round2));
        icovvround2.setSuminsuredname("SIROUND2");
        icovvround2.setSuminsuredamount("0");
        icovvround2.setDeductiblename("DEDUCTIBLESROUND2");
        icovvround2.setDeductibleamount("0");
        
        setiicov.add(icovvround2);
		
		    politem2.setIicoverages(setiicov);
		    
		    setpolitem.add(politem2);
		    				   							
		}
		

		else if(productCode.equalsIgnoreCase("VMC")){
			
		Object CoverageVPC = Eapppol.Motorcyclecoverage(ids);
		ArrayList<String> vmccoverages=new ArrayList<String>();
		vmccoverages.add("VMCPRM");
		vmccoverages.add("VMCEAS");
		vmccoverages.add("VMCVES");
		vmccoverages.add("VMCNCD");
		vmccoverages.add("VMCTPL");
		vmccoverages.add("VMCATD");
		vmccoverages.add("VMCPOD");
		vmccoverages.add("VMCUND");
		vmccoverages.add("VMCLLD");
		vmccoverages.add("VMCLLE");
		vmccoverages.add("VMCTOW");
		vmccoverages.add("VMCPPD");
		vmccoverages.add("VMCAAD");
		vmccoverages.add("VMCXGL");
		vmccoverages.add("VMCXGE");
		vmccoverages.add("VMCNMD");
		vmccoverages.add("VMCTDD");
		vmccoverages.add("VMCNIL");
		vmccoverages.add("VMCBLK");
		vmccoverages.add("VMCLOA");
		vmccoverages.add("VMCFGT");
		vmccoverages.add("VMCDTE");
		vmccoverages.add("VMCSCD");
		vmccoverages.add("VMCPHD");

		
		ArrayList<String> bppass=new ArrayList<String>();
		bppass.add("VMCPRM");
        bppass.add("VMCEAS");      
        bppass.add("VMCLOA");
        bppass.add("VMCXGE");
        bppass.add("VMCDTE");
        bppass.add("VMCFGT");
        bppass.add("VMCRIT");

        
        
        ArrayList<String> bpvadeduss=new ArrayList<String>();
        bpvadeduss.add("VMCAAD");
        bpvadeduss.add("VMCVES");
        bpvadeduss.add("VMCNCD");
        bpvadeduss.add("VMCTDD"); 
        bpvadeduss.add("VMCSCD");
		
//        ArrayList<String> tpass=new ArrayList<String>();
//        tpass.add("VPCTPL");
//        tpass.add("VPCGAS");
 
        
        ArrayList<String> tpaddss=new ArrayList<String>();   
        tpaddss.add("VMCPOD");
        tpaddss.add("VMCTPL");
        tpaddss.add("VMCPPD");
        tpaddss.add("VMCLLE");      
        tpaddss.add("VMCLLD");
        tpaddss.add("VMCUND");
        tpaddss.add("VMCXGL");
        
//        ArrayList<String> tpaddss=new ArrayList<String>(); 
        
        DecimalFormat df = new DecimalFormat("############.##");
        double bppa = 0;
        double bpvadedu = 0;
        double total_bpva_round=0;
        double round1=0;
        double tpadd = 0;
        double total_bpva=0;
        double VMCATD=0;
		Object[] rawarr = (Object[])CoverageVPC;
		List<Object> arr2=Arrays.asList(rawarr);
		for (String string : vmccoverages) {
			try {
				Iicoverage icovv=new Iicoverage();
				Optional<Object> tsr=arr2.stream()
						.filter(x -> ((String) x).startsWith(string)).findAny();
				Optional<Object> tsr1=arr2.stream()
						.filter(x -> ((String) x).startsWith("SI"+string)).findAny();	
				Optional<Object> tsr2=arr2.stream()
						.filter(x -> ((String) x).startsWith("DEDUCTIBLES"+string)).findAny();	
			
				
				String rak=(String) tsr.get();
				String[] sts=rak.split("-");
				if(rak.startsWith("VMCSCD") || rak.startsWith("VMCTDD") || rak.startsWith("VMCPHD") ||
					 rak.startsWith("VMCVES") || rak.startsWith("VMCAAD") || rak.startsWith("VMCNCD") || rak.startsWith("VMCATD")){
					icovv.setCode(string);
					icovv.setPremium('-'+(df.format(Double.parseDouble(sts[1]))));
				}else{
					if(rak.startsWith("VMCCM1")){
						String[] sts3=rak.split("=");
						icovv.setCode(string);
						icovv.setPremium(df.format(Double.parseDouble(sts3[1])));							
					}else{
						icovv.setCode(string);
						icovv.setPremium(df.format(Double.parseDouble(sts[1])));
					
					}
				}
				
				
				
				
				
				
				

				
				String rak1=(String) tsr1.get();
				String[] sts1=rak1.split("-");
				icovv.setSuminsuredname("SI"+string);
				icovv.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
				
				String rak2=(String) tsr2.get();
				String[] sts2=rak2.split("-");
				icovv.setDeductiblename("DEDUCTIBLES"+string);
				icovv.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
				
				setiicov.add(icovv);
				
				if(bppass.contains(string)){
					bppa+= Double.valueOf(sts[1]);
				}
                  else if(bpvadeduss.contains(string)){
					bpvadedu+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(tpaddss.contains(string)){
					tpadd+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}else if(rak.startsWith("VMCATD")){
					VMCATD=Double.parseDouble(df.format(Double.valueOf(sts[1])));
				}
	
			} catch (Exception e) {}
			
		}
             
		  
         total_bpva = bppa-bpvadedu;

         total_bpva_round = Math.round(total_bpva);
         round1 = Double.parseDouble(df.format((total_bpva - total_bpva_round)*(-1) ));
         
         tpadd=tpadd-VMCATD;
         
         double total_tp= tpadd;
         
        double  total_tp_round = Math.round(tpadd);
        
        double round2 = Double.parseDouble(df.format((total_tp - total_tp_round)*(-1)));  
		
        Iicoverage icovvround1=new Iicoverage();
        
        icovvround1.setCode("ROUND1");
        icovvround1.setPremium(String.valueOf(round1));
        icovvround1.setSuminsuredname("SIROUND1");
        icovvround1.setSuminsuredamount("0");
        icovvround1.setDeductiblename("DEDUCTIBLESROUND1");
        icovvround1.setDeductibleamount("0");
        
        setiicov.add(icovvround1);
        
        Iicoverage icovvround2=new Iicoverage();
        
        icovvround2.setCode("ROUND2");
        icovvround2.setPremium(String.valueOf(round2));
        icovvround2.setSuminsuredname("SIROUND2");
        icovvround2.setSuminsuredamount("0");
        icovvround2.setDeductiblename("DEDUCTIBLESROUND2");
        icovvround2.setDeductibleamount("0");
        
        setiicov.add(icovvround2);
		
		    politem2.setIicoverages(setiicov);
		    
		    setpolitem.add(politem2);
		    				   							
		}
		
		
		else if(productCode.equalsIgnoreCase("VPCV")){
			Object CoverageVPCV = Eapppol.CoverageVPCV(ids);
			
			
			Object[] rawarr = (Object[])CoverageVPCV;
			List<Object> arr2=Arrays.asList(rawarr);

			DecimalFormat df = new DecimalFormat("############.##");
			ArrayList<String> vpcvcoverages= new ArrayList<String>();
			vpcvcoverages.add("VPCVGS");
			vpcvcoverages.add("VPCVFO");
			vpcvcoverages.add("VPCVEA");
			vpcvcoverages.add("VPCVTM");
			vpcvcoverages.add("VPCVNP");
			vpcvcoverages.add("VPCVNE");
			vpcvcoverages.add("VPCVLP");
			vpcvcoverages.add("VPCVFG");
			vpcvcoverages.add("VPCVFD");
			vpcvcoverages.add("VPCVOP");
			vpcvcoverages.add("VPCVXG");
			vpcvcoverages.add("VPCVPR");
			vpcvcoverages.add("VPCVNC");
			vpcvcoverages.add("VPCVM1");		
			vpcvcoverages.add("VPCVXL");
			vpcvcoverages.add("VPCVPN");
			vpcvcoverages.add("VPCVVE");
			vpcvcoverages.add("VPCVAT");
			vpcvcoverages.add("VPCVLL");
			vpcvcoverages.add("VPCVNF");
			vpcvcoverages.add("VPCVDE");
			vpcvcoverages.add("VPCVTP");
			vpcvcoverages.add("VPCVWS");
			vpcvcoverages.add("VPCVLW");
			vpcvcoverages.add("VPCVLD");
			vpcvcoverages.add("VPCVCN");
			vpcvcoverages.add("VPVTOW");
//			vpcvcoverages.add("ROUND1");
//			vpcvcoverages.add("ROUND2");
			List<String> bppass=new ArrayList<String>();
			bppass.add("VPCVPR");
			bppass.add("VPCVCN");
			bppass.add("VPCVEA");
			bppass.add("VPCVXG");
			double bppa=0;
			double bpvadedu =0;
			
			
			List<String> tppass=new ArrayList<String>();
			tppass.add("VPCVTP");
			tppass.add("VPCVGS");
			tppass.add("VPCVLP");
			
			
			List<String> tpaddss=new ArrayList<String>();
			tpaddss.add("VPCVOP");
			tpaddss.add("VPCVPN");
			tpaddss.add("VPCVLL");
			tpaddss.add("VPCVTM");
			tpaddss.add("VPCVXL");
			
			double tppa = 0;
			double tpadd = 0;
			double VPCVAT=0;
			double totalprem=0;
			
			for (String string : vpcvcoverages) {
				try {
					Iicoverage icovv=new Iicoverage();
					Optional<Object> tsr=arr2.stream()
							.filter(x -> ((String) x).startsWith(string)).findAny();
					Optional<Object> tsr1=arr2.stream()
							.filter(x -> ((String) x).startsWith("SI"+string)).findAny();	
					Optional<Object> tsr2=arr2.stream()
							.filter(x -> ((String) x).startsWith("DEDUCTIBLES"+string)).findAny();	
				    
					String rak=(String) tsr.get();
					String[] sts=rak.split("-");
					if(rak.startsWith("VPCVFD") || rak.startsWith("VPCVNC") || rak.startsWith("VPCVAT")){
						icovv.setCode(string);
						icovv.setPremium('-'+(df.format(Double.parseDouble(sts[1]))));
					}else{
						if(rak.startsWith("VPCVM1")){
							String[] sts3=rak.split("=");
							icovv.setCode(string);
							icovv.setPremium(df.format(Double.parseDouble(sts3[1])));							
						}else{
							icovv.setCode(string);
							icovv.setPremium(df.format(Double.parseDouble(sts[1])));
							totalprem+=Double.parseDouble(sts[1]);
						}
					}
					
					
					String rak1=(String) tsr1.get();
					String[] sts1=rak1.split("-");
					icovv.setSuminsuredname("SI"+string);
					icovv.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
					
					String rak2=(String) tsr2.get();
					String[] sts2=rak2.split("-");
					icovv.setDeductiblename("DEDUCTIBLES"+string);
					icovv.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
					setiicov.add(icovv);		
					
					
										
					if(bppass.contains(string)){
						bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}else if(string.startsWith("VPCVFD")||string.startsWith("VPCVNC")){
						bpvadedu+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}else if(tppass.contains(string)){
						tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}else if(rak.startsWith("VPCVAT")){
						VPCVAT=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}
						else if(tpaddss.contains(string)){
					
						tpadd+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}
					
					
				} catch (Exception e) {}
				
			}
			
			
			totalprem=totalprem-(bpvadedu+VPCVAT);
			
			totalprem= Double.parseDouble(df.format(totalprem));
			
			this.setTotalpremium(totalprem);
			
			
			double total_bpva = bppa-bpvadedu;
			
			double total_bpva_round = Math.round(total_bpva);
			
//			DecimalFormat df = new DecimalFormat("############.##");
			double round1 = Double.parseDouble(df.format((total_bpva - total_bpva_round)*(-1) ));
						
			tppa=tppa-VPCVAT;
			
			double total_tp = tppa+tpadd;
			
			double total_tp_round = Math.round(total_tp);
			
			 double round2=Double.parseDouble(df.format((total_tp - total_tp_round)*(-1)));
			 
			Iicoverage rnd1=new Iicoverage();
			rnd1.setCode("ROUND1");
			rnd1.setPremium(String.valueOf(round1));
			rnd1.setSuminsuredname("SIROUND1");
			rnd1.setSuminsuredamount("0");
			rnd1.setDeductibleamount("0");
		    rnd1.setDeductiblename("DEDUCTIBLESROUND1");
		    
		    
			Iicoverage rnd2=new Iicoverage();
			rnd2.setCode("ROUND2");
			rnd2.setPremium(String.valueOf(round2));
			rnd2.setSuminsuredname("SIROUND2");
			rnd2.setSuminsuredamount("0");
			rnd2.setDeductibleamount("0");
			rnd2.setDeductiblename("DEDUCTIBLESROUND2");
			
			setiicov.add(rnd1);
			
			setiicov.add(rnd2);
		    
		    politem2.setIicoverages(setiicov);	    
		    setpolitem.add(politem2);    
	   }	
   }  
  private void  OtherCoverageSet(String productCode, Long carid, Set<Policyitem> setpolitem, Policyitem politem4, Policyitem trailer1, Policyitem trailer2){
	  
	  Set<Iicoverage> setiicov=new HashSet<Iicoverage>();
	  
	  Set<Iicoverage> setiicov2=new HashSet<Iicoverage>();
	  
	  Set<Iicoverage> setiicov3=new HashSet<Iicoverage>();
			
	  if(productCode.equalsIgnoreCase("VGC")){
		 
		Object CoverageVGC = Eapppol.VGCCover(carid);

		Object[] cover = (Object[])CoverageVGC;
		
		List<Object> arr2=Arrays.asList(cover);
		
		DecimalFormat df = new DecimalFormat("############.##");
		ArrayList<String> vgcoverages= new ArrayList<String>();
		vgcoverages.add("VGCTDD");
		vgcoverages.add("VGCTTL");
		vgcoverages.add("VGCGAS");
		vgcoverages.add("VGCFGP");
		vgcoverages.add("VGCPOD");
		vgcoverages.add("VGCWSG");
//		vgcoverages.add("ROUND1");
		vgcoverages.add("VGCXGL");
		vgcoverages.add("VGCATD");
		vgcoverages.add("VGCTPR");
		vgcoverages.add("VGCTPL");
		vgcoverages.add("VGCDEP");
		vgcoverages.add("VGCIPD");
		vgcoverages.add("VGCBPR");
		vgcoverages.add("VGCPND");
		vgcoverages.add("VGCNEA");
		vgcoverages.add("VGCAPG");
		vgcoverages.add("VGCLLE");
		vgcoverages.add("VGCEAS");
		vgcoverages.add("VGCCM1");
		vgcoverages.add("VGCNCD");
		vgcoverages.add("VGCCNG");
		vgcoverages.add("VGCNFN");
		vgcoverages.add("VGCNFE");
//		vgcoverages.add("ROUND2");
		vgcoverages.add("VGCLLW");
		vgcoverages.add("VGCTOW");
		vgcoverages.add("VGCXGE");
		vgcoverages.add("VGCVES");
		vgcoverages.add("VGCPTM");
		vgcoverages.add("VGCDTE");		
		vgcoverages.add("VGCTTL2");
		vgcoverages.add("VGCTPR2");
		
		List<String> bppass=new ArrayList<String>();
		bppass.add("VGCBPR");
		bppass.add("VGCAPG");
		bppass.add("VGCCNG");
		bppass.add("VGCEAS");		
		bppass.add("VGCXGE");
		bppass.add("VGCPTM");
		bppass.add("VGCFGP");
		bppass.add("VGCDTE");
		
		double bppa=0;
		double bpvadedu =0;
		
		
		List<String> tpaddss=new ArrayList<String>();
		tpaddss.add("VGCPOD");
		tpaddss.add("VGCPND");
		tpaddss.add("VGCLLW");
		tpaddss.add("VGCLLE");
		tpaddss.add("VGCNFE");		
		tpaddss.add("VGCNFN");
		tpaddss.add("VGCXGL");
		
		double tppa = 0;
		double tpadd = 0;		
		
		double VGCATD =0;
    
		double totalprem=0;
		
		for (String string : vgcoverages) {
			try {
				Optional<Object> tsr=arr2.stream()
						.filter(x -> ((String) x).startsWith(string)).findAny();
				Optional<Object> tsr1=arr2.stream()
						.filter(x -> ((String) x).startsWith("SI"+string)).findAny();	
				Optional<Object> tsr2=arr2.stream()
						.filter(x -> ((String) x).startsWith("DEDUCTIBLES"+string)).findAny();	
			
				if(!(string.equals("VGCTTL") || string.equals("VGCTTL2") || string.equals("VGCTPR") || string.equals("VGCTPR2"))){
					Iicoverage icovv=new Iicoverage();
					String rak=(String) tsr.get();
					String[] sts=rak.split("-");
					if(rak.startsWith("VGCTDD") || rak.startsWith("VGCIPD") || rak.startsWith("VGCNCD") || rak.startsWith("VGCATD")){
						icovv.setCode(string);
						icovv.setPremium("-"+(df.format(Double.parseDouble(sts[1]))));						
					}else{
						if(rak.startsWith("VGCCM1")){
							String[] sts2=rak.split("=");
							icovv.setCode(string);
							icovv.setPremium(df.format(Double.parseDouble(sts2[1])));	
						}else{
							icovv.setCode(string);
							icovv.setPremium(df.format(Double.parseDouble(sts[1])));
							totalprem+=Double.parseDouble(sts[1]);
						}
					}
					
					String rak1=(String) tsr1.get();
					String[] sts1=rak1.split("-");
					icovv.setSuminsuredname("SI"+string);
					icovv.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
					
					String rak2=(String) tsr2.get();
					String[] sts2=rak2.split("-");
					icovv.setDeductiblename("DEDUCTIBLES"+string);
					icovv.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
					setiicov.add(icovv);
				    politem4.setIicoverages(setiicov);
				    setpolitem.add(politem4);
				    
				    
				    
					if(bppass.contains(string)){
						bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}else if(string.startsWith("VGCTDD")||string.startsWith("VGCNCD") || string.startsWith("VGCIPD")){
						bpvadedu+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}else if(string.startsWith("VGCTPL") || string.startsWith("VGCPOD")){
						tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}else if(string.startsWith("VGCATD")){
						VGCATD=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}
						else if(tpaddss.contains(string)){
					
						tpadd+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
					}
				    
				    
				    
				    
				}

							
				else if((string.equals("VGCTTL") || string.equals("VGCTPR")) && !(tsr.get().toString().contains("-0"))){
					Iicoverage icovvtr1=new Iicoverage();
					String rak=(String) tsr.get();
					String[] sts=rak.split("-");
					icovvtr1.setCode(string);
					icovvtr1.setPremium(df.format(Double.parseDouble(sts[1])));
					totalpremium+=Double.parseDouble(sts[1]);
					String rak1=(String) tsr1.get();
					String[] sts1=rak1.split("-");
					icovvtr1.setSuminsuredname("SI"+string);
					icovvtr1.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
					
					String rak2=(String) tsr2.get();
					String[] sts2=rak2.split("-");
					icovvtr1.setDeductiblename("DEDUCTIBLES"+string);
					icovvtr1.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
					
					setiicov2.add(icovvtr1);
					
				    trailer1.setIicoverages(setiicov2);		    	
			    	setpolitem.add(trailer1);
				}else if((string.equals("VGCTTL2") ||  string.equals("VGCTPR2")) && !(tsr.get().toString().contains("-0"))){
					Iicoverage icovvtr2=new Iicoverage();
					String rak=(String) tsr.get();
					String[] sts=rak.split("-");
					icovvtr2.setCode(string);
					icovvtr2.setPremium(df.format(Double.parseDouble(sts[1])));
					totalpremium+=Double.parseDouble(sts[1]);
					String rak1=(String) tsr1.get();
					String[] sts1=rak1.split("-");
					icovvtr2.setSuminsuredname("SI"+string);
					icovvtr2.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
					
					String rak2=(String) tsr2.get();
					String[] sts2=rak2.split("-");
					icovvtr2.setDeductiblename("DEDUCTIBLES"+string);
					icovvtr2.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
					
					setiicov3.add(icovvtr2);
				    trailer2.setIicoverages(setiicov3);	    	
			    	setpolitem.add(trailer2);	
				}
				
			} catch (Exception e) {}
			
		}	
		
		totalprem=totalprem-(bpvadedu+VGCATD);
		
		totalprem= Double.parseDouble(df.format(totalprem));
		
		this.setTotalpremium(totalprem);
		
		
		double total_bpva = bppa-bpvadedu;
		double total_bpva_round = Math.round(total_bpva);
		
//		double round1=(total_bpva - total_bpva_round)*(-1) ;
		
		
//		DecimalFormat df = new DecimalFormat("############.##");
		double round1 = Double.parseDouble(df.format((total_bpva - total_bpva_round)*(-1) ));
		
		
		
		tppa=tppa-VGCATD;
		
		
		double total_tp = tppa+tpadd;
		
		double total_tp_round = Math.round(total_tp);
		
		 double round2=Double.parseDouble(df.format((total_tp - total_tp_round)*(-1)));
		
		
		
		Iicoverage rnd1=new Iicoverage();
		rnd1.setCode("ROUND1");
		rnd1.setPremium(String.valueOf(round1));
		rnd1.setSuminsuredname("SIROUND1");
		rnd1.setSuminsuredamount("0");
		rnd1.setDeductibleamount("0");
	    rnd1.setDeductiblename("DEDUCTIBLESROUND1");
	    
	    
		Iicoverage rnd2=new Iicoverage();
		rnd2.setCode("ROUND2");
		rnd2.setPremium(String.valueOf(round2));
		rnd2.setSuminsuredname("SIROUND2");
		rnd2.setSuminsuredamount("0");
		rnd2.setDeductibleamount("0");
		rnd2.setDeductiblename("DEDUCTIBLESROUND2");
		
		setiicov.add(rnd1);
		
		setiicov.add(rnd2);	
		
		
	    politem4.setIicoverages(setiicov);
	    setpolitem.add(politem4);
		
}	    
		    else if(productCode.equalsIgnoreCase("VOC")){	

				Object CoverageVOC = Eapppol.VOCCoverage(carid);			
				ArrayList<String> vocoverages= new ArrayList<String>();
				vocoverages.add("VOCDEP");
				vocoverages.add("VOCBPR");
				vocoverages.add("VOCCNG");
				vocoverages.add("VOCGAS");
//				vocoverages.add("ROUND1");
				vocoverages.add("VOCOTR");
				vocoverages.add("VOCEXG");
//				vocoverages.add("ROUND2");
				vocoverages.add("VOCATD");
				vocoverages.add("VOCLLE");
				vocoverages.add("VOCEAS");
				vocoverages.add("VOCWSG");
				vocoverages.add("VOCNFE");
				vocoverages.add("VOCTDD");
				vocoverages.add("VOCTPL");
				vocoverages.add("VOCNCD");
				vocoverages.add("VOCCM1");
				vocoverages.add("VOCIH");
				vocoverages.add("VOCLLM");
				vocoverages.add("VOCPTM");
				vocoverages.add("VOCLLW");
				vocoverages.add("VOCPND");
				vocoverages.add("VOCVES");
				vocoverages.add("VOCEXL");
				vocoverages.add("VOCIPD");
				vocoverages.add("VOCNFN");
				vocoverages.add("VOCTOW");
				vocoverages.add("VOCPOD");
				vocoverages.add("VOCNEA");
				
				DecimalFormat df = new DecimalFormat("############.##");
				
				List<String> bppass=new ArrayList<String>();
				bppass.add("VOCBPR");
				bppass.add("VOCCNG");
				bppass.add("VOCEAS");
				bppass.add("VOCEXG");
				double bppa=0;
				double bpvadedu =0;
				
				List<String> tpaddss=new ArrayList<String>();
				tpaddss.add("VOCPOD");
				tpaddss.add("VOCPND");
				tpaddss.add("VOCLLW");
				tpaddss.add("VOCPTM");
				tpaddss.add("VOCEXL");
				
				double tppa = 0;
				double tpadd = 0;		
				
				double VOCATD =0;
				double totalprem=0;
								
				Object[] cover = (Object[])CoverageVOC;
				List<Object> arr2=Arrays.asList(cover);
				
				
				for (String string : vocoverages) {
					try {
						Iicoverage icovv=new Iicoverage();
						Optional<Object> tsr=arr2.stream()
								.filter(x -> ((String) x).startsWith(string)).findAny();
						Optional<Object> tsr1=arr2.stream()
								.filter(x -> ((String) x).startsWith("SI"+string)).findAny();	
						Optional<Object> tsr2=arr2.stream()
								.filter(x -> ((String) x).startsWith("DEDUCTIBLES"+string)).findAny();	
					
						String rak=(String) tsr.get();
						String[] sts=rak.split("-");
						if(rak.startsWith("VOCIPD") || rak.startsWith("VOCNCD") || rak.startsWith("VOCTDD") || rak.startsWith("VOCATD")){
							icovv.setCode(string);
							icovv.setPremium("-"+(df.format(Double.parseDouble(sts[1]))));
						}else{
							if(rak.startsWith("VOCCM1")){
								String[] sts2=rak.split("=");
								icovv.setCode(string);
								icovv.setPremium(df.format(Double.parseDouble(sts2[1])));
							}else{
								icovv.setCode(string);
								icovv.setPremium(df.format(Double.parseDouble(sts[1])));
								totalprem+=Double.parseDouble(sts[1]);
							}						
						}
						
						String rak1=(String) tsr1.get();
						String[] sts1=rak1.split("-");
						icovv.setSuminsuredname("SI"+string);
						icovv.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
						
						String rak2=(String) tsr2.get();
						String[] sts2=rak2.split("-");
						icovv.setDeductiblename("DEDUCTIBLES"+string);
						icovv.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
						
						setiicov.add(icovv);
						
						
						
						
						if(bppass.contains(string)){
							bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						}else if(string.startsWith("VOCTDD")|| string.startsWith("VOCNCD") || string.startsWith("VOCIPD")){
							bpvadedu+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						}else if(string.startsWith("VOCTPL") || string.startsWith("VOCGAS")){
							tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						}else if(string.startsWith("VOCATD")){
							VOCATD=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						}
							else if(tpaddss.contains(string)){
						
							tpadd+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						}		
						
					} catch (Exception e) {}

				}
				
				
				
				totalprem=totalprem-(bpvadedu+VOCATD);
				
				totalprem= Double.parseDouble(df.format(totalprem));
				
				this.setTotalpremium(totalprem);
				
				
				double total_bpva = bppa-bpvadedu;
				double total_bpva_round = Math.round(total_bpva);
				
				
//				DecimalFormat df = new DecimalFormat("############.##");
				double round1 = Double.parseDouble(df.format((total_bpva - total_bpva_round)*(-1) ));
				
				
//				double round1=(total_bpva - total_bpva_round)*(-1) ;
				
				tppa=tppa-VOCATD;
				
				
				double total_tp = tppa+tpadd;
				
				double total_tp_round = Math.round(total_tp);
				
				 double round2=Double.parseDouble(df.format((total_tp - total_tp_round)*(-1)));
				
				
				
				Iicoverage rnd1=new Iicoverage();
				rnd1.setCode("ROUND1");
				rnd1.setPremium(String.valueOf(round1));
				rnd1.setSuminsuredname("SIROUND1");
				rnd1.setSuminsuredamount("0");
				rnd1.setDeductibleamount("0");
			    rnd1.setDeductiblename("DEDUCTIBLESROUND1");
			    
			    
				Iicoverage rnd2=new Iicoverage();
				rnd2.setCode("ROUND2");
				rnd2.setPremium(String.valueOf(round2));
				rnd2.setSuminsuredname("SIROUND2");
				rnd2.setSuminsuredamount("0");
				rnd2.setDeductibleamount("0");
				rnd2.setDeductiblename("DEDUCTIBLESROUND2");
				
				setiicov.add(rnd1);
				
				setiicov.add(rnd2);
				
			    politem4.setIicoverages(setiicov);
			    setpolitem.add(politem4);

    }
		    else if(productCode.equalsIgnoreCase("VFA")){
		    	
				Object CoverageVFA = Eapppol.VFACoverage(carid);

				Object[] cover = (Object[])CoverageVFA;
				
				List<Object> arr2=Arrays.asList(cover);
				
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
//				vfacoverages.add("ROUND1");
//				vfacoverages.add("ROUND2");
				vfacoverages.add("VFAIPD");
				vfacoverages.add("RIPDPR");
				vfacoverages.add("RIPHPS");
				vfacoverages.add("VFADIS");
//				vfacoverages.add("VFADIS");
				vfacoverages.add("VFATTL2");
				vfacoverages.add("VFATPR2");
				
				
				DecimalFormat df = new DecimalFormat("############.##");
				
				List<String> bppass=new ArrayList<String>();
				bppass.add("VFAVPR");
				bppass.add("VFATPR");
				bppass.add("VFAACC");
				bppass.add("VFAVHR");
				bppass.add("VFATHR");
				

				
				double bppa=0;
				double bpvadedu =0;
				double totalprem=0;
				List<String> tpaddss=new ArrayList<String>();
				tpaddss.add("VFAVTL");
				tpaddss.add("VFAVPO");
				tpaddss.add("VFATTL");
				tpaddss.add("VFAVPD");
				
				double tppa = 0;
		
				
				double VFAATD =0;
	
				
				for (String string : vfacoverages) {
					try {
						Optional<Object> tsr=arr2.stream()
								.filter(x -> ((String) x).startsWith(string)).findAny();
						Optional<Object> tsr1=arr2.stream()
								.filter(x -> ((String) x).startsWith("SI"+string)).findAny();	
						Optional<Object> tsr2=arr2.stream()
								.filter(x -> ((String) x).startsWith("DEDUCTIBLES"+string)).findAny();	
					
						if(!(string.equals("VFATTL") || string.equals("VFATTL2") || string.equals("VFATPR") || string.equals("VFATPR2"))){
							Iicoverage icovv=new Iicoverage();
							String rak=(String) tsr.get();
							String[] sts=rak.split("-");
							if(string.startsWith("VFAVNC") || string.startsWith("VFAIPD") || string.startsWith("VFAATD")){
								icovv.setCode(string);
								icovv.setPremium("-"+df.format(Double.parseDouble(sts[1])));
							}else{
								if(string.startsWith("VFADIS")){
									String[] sts2=rak.split("=");
									icovv.setCode(string);
									icovv.setPremium(df.format(Double.parseDouble(sts2[1])));
								}else{
									icovv.setCode(string);
									icovv.setPremium(df.format(Double.parseDouble(sts[1])));	
									totalprem+=Double.parseDouble(sts[1]);
								}								
							}
							
							String rak1=(String) tsr1.get();
							String[] sts1=rak1.split("-");
							icovv.setSuminsuredname("SI"+string);
							icovv.setSuminsuredamount(df.format(Double.parseDouble(sts1[1])));
							
							String rak2=(String) tsr2.get();
							String[] sts2=rak2.split("-");
							icovv.setDeductiblename("DEDUCTIBLES"+string);
							icovv.setDeductibleamount(df.format(Double.parseDouble(sts2[1])));
							setiicov.add(icovv);

						    
						    
						    if(bppass.contains(string)){
						    	bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						    }else if(string.startsWith("VFAVNC") || string.startsWith("VFAIPD")){
						    	bpvadedu+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						    }else if(tpaddss.contains(string)){
						    	tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						    }else if(string.startsWith("VFAATD")){
						    	VFAATD+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
						    }
						    
						}

									
						else if((string.equals("VFATTL") || string.equals("VFATPR")) && !(tsr.get().toString().contains("-0"))){
							Iicoverage icovvtr1=new Iicoverage();
							String rak=(String) tsr.get();
							String[] sts=rak.split("-");
							icovvtr1.setCode(string);
							icovvtr1.setPremium(df.format(Double.valueOf(sts[1])));
							totalprem+=Double.parseDouble(sts[1]);
							
							String rak1=(String) tsr1.get();
							String[] sts1=rak1.split("-");
							icovvtr1.setSuminsuredname("SI"+string);
							icovvtr1.setSuminsuredamount(df.format(Double.valueOf(sts1[1])));
							
							String rak2=(String) tsr2.get();
							String[] sts2=rak2.split("-");
							icovvtr1.setDeductiblename("DEDUCTIBLES"+string);
							icovvtr1.setDeductibleamount(sts2[1]);
                           if(string.equals("VFATTL")){
                        	   tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
                           }else if(string.equals("VFATPR")){
                        	   bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
                           }

							setiicov2.add(icovvtr1);
							
						    trailer1.setIicoverages(setiicov2);		    	
					    	setpolitem.add(trailer1);
						}else if((string.equals("VFATTL2") ||  string.equals("VFATPR2")) && !(tsr.get().toString().contains("-0"))){
							Iicoverage icovvtr2=new Iicoverage();
							String rak=(String) tsr.get();
							String[] sts=rak.split("-");
							icovvtr2.setCode(string);
							icovvtr2.setPremium(df.format(Double.valueOf(sts[1])));
							totalprem+=Double.parseDouble(sts[1]);
							
							String rak1=(String) tsr1.get();
							String[] sts1=rak1.split("-");
							icovvtr2.setSuminsuredname("SI"+string);
							icovvtr2.setSuminsuredamount(df.format(Double.valueOf(sts1[1])));
							
							String rak2=(String) tsr2.get();
							String[] sts2=rak2.split("-");
							icovvtr2.setDeductiblename("DEDUCTIBLES"+string);
							icovvtr2.setDeductibleamount(df.format(Double.valueOf(sts2[1])));
							
			                  if(string.equals("VFATTL2")){
	                        	   tppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
	                           }else if(string.equals("VFATPR2")){
	                        	   bppa+=Double.parseDouble(df.format(Double.valueOf(sts[1])));
	                           }
							
							setiicov3.add(icovvtr2);
						    trailer2.setIicoverages(setiicov3);	    	
					    	setpolitem.add(trailer2);	
						}
						
					} catch (Exception e) {}
					
				}
				
				totalprem=totalprem-(bpvadedu+VFAATD);
				
				totalprem= Double.parseDouble(df.format(totalprem));
				
				this.setTotalpremium(totalprem);
				
				double total_bpva = bppa-bpvadedu;
				double total_bpva_round = Math.round(total_bpva);
				
				
//				DecimalFormat df = new DecimalFormat("############.##");
				double round1 = Double.parseDouble(df.format((total_bpva - total_bpva_round)*(-1)));
				
				
//				double round1=(total_bpva - total_bpva_round)*(-1) ;
				
				tppa=tppa-VFAATD;
				
				
				double total_tp = tppa;
				
				double total_tp_round = Math.round(total_tp);
				
				 double round2=Double.parseDouble(df.format((total_tp - total_tp_round)*(-1)));
				
				
				
				Iicoverage rnd1=new Iicoverage();
				rnd1.setCode("ROUND1");
				rnd1.setPremium(String.valueOf(round1));
				rnd1.setSuminsuredname("SIROUND1");
				rnd1.setSuminsuredamount("0");
				rnd1.setDeductibleamount("0");
			    rnd1.setDeductiblename("DEDUCTIBLESROUND1");
			    
			    
				Iicoverage rnd2=new Iicoverage();
				rnd2.setCode("ROUND2");
				rnd2.setPremium(String.valueOf(round2));
				rnd2.setSuminsuredname("SIROUND2");
				rnd2.setSuminsuredamount("0");
				rnd2.setDeductibleamount("0");
				rnd2.setDeductiblename("DEDUCTIBLESROUND2");
				
				setiicov.add(rnd1);
				
				setiicov.add(rnd2);
				
			    politem4.setIicoverages(setiicov);
			    setpolitem.add(politem4);
				
		 }	  
	  
  }

}

//policy.delete(policy.findAll(new ArrayList<Long>(){
//
//
//private static final long serialVersionUID = 1L;
//
//{
//add(8793L);
//add(8176L);
//add(8177L);
//add(8178L);
//add(8179L);
//}}));


//Receiptmaster eappreceipt=eapprepo.findOne(101171L);
//
//EplReceiptMaster EapprecMaster= new EplReceiptMaster();
//
//EapprecMaster.setAgentcode(eappreceipt.getAgentCode());
//EapprecMaster.setCbc(eappreceipt.getCbcnumber());
//EapprecMaster.setIfsccode(eappreceipt.getIfscCode());
//EapprecMaster.setReceiptnumber(eappreceipt.getReceiptNumber());
//EapprecMaster.setPolno(eappreceipt.getPolicyNumber());
//
//EapprecMaster.setPayeename(eappreceipt.getFirstname());  
//EapprecMaster.setCreatedcode(eappreceipt.getProductCode());
//EapprecMaster.setBranchcode(eappreceipt.getReceiptBranch());
//if(eappreceipt.getReceiptfor().equalsIgnoreCase("cheque")){
//	EapprecMaster.setPaymentamount(String.valueOf(eappreceipt.getChequeAmount()));
//	EapprecMaster.setInstrumentnumber(eappreceipt.getChequeNumber());
//	EapprecMaster.setInstrumentbank(eappreceipt.getChequeBank());
//	EapprecMaster.setPaymentdate(eappreceipt.getChequeDate());			
//}		
//EappRec.save(EapprecMaster);