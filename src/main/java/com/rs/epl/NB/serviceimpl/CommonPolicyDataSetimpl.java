package com.rs.epl.NB.serviceimpl;
/*package com.fa.component.policy.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.io.File;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

//import com.sun.java.util.jar.pack.Package.File;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.component.OEM.entity.TtrnDriver;
import com.fa.component.OEM.entity.TtrnInscovered;
import com.fa.component.OEM.entity.TtrnInsured;
import com.fa.component.OEM.entity.TtrnPolicy;
import com.fa.component.policy.entity.Clientnominee;
import com.fa.component.policy.entity.Iicoverage;
import com.fa.component.policy.entity.ItemDriver;
import com.fa.component.policy.entity.Payment;
import com.fa.component.policy.entity.Policy;
import com.fa.component.policy.entity.Policyclient;
import com.fa.component.policy.entity.Policycoverage;
import com.fa.component.policy.entity.Policyitem;
import com.fa.component.policy.entity.Privatecaritem;
//import com.fa.component.policy.repository.ClientNomineeRepo;
import com.fa.component.policy.repository.DriverTestRepo;
import com.fa.component.policy.repository.PolicyRepository;
//import com.fa.component.policy.repository.PrivateCarRepo;
import com.fa.component.policy.service.CommonPolicyDataSet;
//import com.sun.java.util.jar.pack.Package.Class.Field;

@Service
public class CommonPolicyDataSetimpl implements CommonPolicyDataSet {
	public CommonPolicyDataSetimpl() {

	}
	@Resource
	  PolicyRepository polrepo;
//	@Resource
//	ClientNomineeRepo ClientNomrepo;
//	@Resource
//	PrivateCarRepo pcarrepo;
	@Override
	public void CommonPolicyDataSet(List<TtrnInscovered> OmeInsCovs, List<TtrnInsured> OmeInsuredinfo,
			List<TtrnPolicy> PolicyDeatails, List<TtrnDriver> Omedrivers) throws IllegalArgumentException, IllegalAccessException, ParseException {
	
	for(TtrnPolicy omepol:PolicyDeatails)
	{
//		System.out.println("----CommonPolicyDataSet----PolicyNo=----"+omepol.getXgenPolicyno());
		 Policy pol=new Policy();		
		 pol.setPolno(omepol.getPolicyno());
		 pol.setEndtno(omepol.getEndorsementNo());
		 pol.setProductcode(omepol.getProductcode());
		 pol.setAgentcode(omepol.getAccountcode());
		 pol.setBranchcode(omepol.getBranch());
		 pol.setPolicysuminsuredamount(omepol.getIncrementalsi());
		 pol.setPolstartdate(omepol.getInceptiondate(),omepol.getInceptiontime());
		 
		 String polExpireDate=omepol.getExpirydate()+omepol.getExpirytime();
		 pol.setPolexpirydate(polExpireDate);
		 pol.setProposalDate(omepol.getProposaldate());
		 pol.setCreationdate(omepol.getIssuedate());
	
		 pol.setAccountDate(omepol.getAccountdate());
		 pol.setUwyr(omepol.getUnderwritingyear());
		 pol.setAgentcode(omepol.getOtherparty1());
		 pol.setBdocode(omepol.getOtherparty2());
		 pol.setOacode(omepol.getOragent());
//		 CommonPolicyDataSetimpl CommonPolicyDataSetimpl=new CommonPolicyDataSetimpl();
		  Policyclient polclient= CommonpolicyclientSet(OmeInsuredinfo,omepol);
//		  System.out.println("-----polclient--name----"+polclient.getFirstname());
		 pol.setPolicyclient(polclient);
		 Payment pay=paymentDataSet(omepol);
//		 System.out.println("----Payment--CBC--"+pay.getCBC());
		 Set<Payment> paymentset=new HashSet<>();
		 paymentset.add(pay);
		 pol.setPayments(paymentset);
		 Set<Policyitem> polItem=commonPolicyItemSet(omepol, Omedrivers,OmeInsCovs);
		 pol.setPolicyitems(polItem);		
//		 System.out.println("----Completed policy item-----");
		 Policycoverage polcoverage1=new Policycoverage();
		 polcoverage1.setCode("ZDILCM");
		 polcoverage1.setName("ZDILCM");
		 polcoverage1.setPremium(omepol.getZdilcm());		 
		 Policycoverage polcoverage2=new Policycoverage();
		 polcoverage2.setCode("ZCLD");
		 polcoverage2.setName("ZCLD");
		 polcoverage2.setPremium(omepol.getZcld());		 
		 Policycoverage polcoverage3=new Policycoverage();
		 polcoverage3.setCode("ZSTAX");
		 polcoverage3.setName("ZSTAX");
		 polcoverage3.setPremium(omepol.getZstax());	 
		 Policycoverage polcoverage4=new Policycoverage();
		 polcoverage4.setCode("ZEDCS");
		 polcoverage4.setName("ZEDCS");
		 polcoverage4.setPremium(omepol.getZedcs()); 		 
		 Policycoverage polcoverage5=new Policycoverage();
		 polcoverage5.setCode("ZCM");
		 polcoverage5.setName("ZCM");
		 polcoverage5.setPremium(omepol.getZcm()); 
		 Policycoverage polcoverage6=new Policycoverage();
		 polcoverage6.setCode("Zcmtx");
		 polcoverage6.setName("Zcmtx");
		 polcoverage6.setPremium(omepol.getZcmtx()); 
     	 Policycoverage polcoverage7=new Policycoverage();
     	 polcoverage7.setCode("ZOVCM");
     	 polcoverage7.setName("ZOVCM");
     	 polcoverage7.setPremium(omepol.getZovcm()); 
		 Policycoverage polcoverage8=new Policycoverage();
		 polcoverage8.setCode("ZWROFF");
		 polcoverage8.setName("ZWROFF");
		 polcoverage8.setPremium(omepol.getZwroff()); 		 
		 Policycoverage polcoverage9=new Policycoverage();
		 polcoverage9.setCode("ZOCMTX");
		 polcoverage9.setName("ZOCMTX");
		 polcoverage9.setPremium(omepol.getZocmtx());		 
		 Policycoverage polcoverage10=new Policycoverage();
		 polcoverage10.setCode("ZSTDTY");
		 polcoverage10.setName("ZSTDTY");
		 polcoverage10.setPremium(omepol.getZstdty());		 
		 Policycoverage polcoverage11=new Policycoverage();
		 polcoverage11.setCode("ZSDEXP");
		 polcoverage11.setName("ZSDEXP");
		 polcoverage11.setPremium(omepol.getZsdexp());				 
		 Policycoverage polcoverage12=new Policycoverage();
		 polcoverage12.setCode("ZKCESS");
		 polcoverage12.setName("ZKCESS");
		 polcoverage12.setPremium(omepol.getZkcess());
		 Set<Policycoverage> polset=new HashSet<>();
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
		 pol.setPolicycoverages(polset);
		 System.out.println("--Completed policy coverages----");
		 polrepo.save(pol);		
		 System.out.println("--policy persisted successfully----");
		 
	}
}
   
	private Payment paymentDataSet(TtrnPolicy omepol) {
		Payment pay=new Payment();
		pay.setReceiptnumber(omepol.getRecieptNumber());
		pay.setPaymenttype(omepol.getPaymentmethod());
		if(pay.getPaymenttype()=="CARD"){
		  pay.setInstrumentnumber(omepol.getCardnum());
		}
		else{
			pay.setInstrumentnumber(omepol.getChqNo());
		}		
		pay.setInstrumentexpdt(omepol.getCardexp());
	    pay.setCBC(omepol.getCbc());
		pay.setPaymentamount(omepol.getChqAmt());
		pay.setPaymentdate(omepol.getChqIssueDt());
	    pay.setInstrumentbank(omepol.getBankName());
		pay.setBankCity(omepol.getBankCit());
	    pay.setReceipt_amount(omepol.getReceiptAmount());
	    pay.setDepositingBankCode(omepol.getBankCode());
	    pay.setInstrumenttype(omepol.getCardType());
		return pay;
	}


	   private Policyclient CommonpolicyclientSet(List<TtrnInsured> omeInsuredinfo, TtrnPolicy omepol) {
			Policyclient polclient=new Policyclient();
	         for(TtrnInsured omeclient:omeInsuredinfo){
	        	 Clientnominee clientNom=new Clientnominee();
	          if(omepol.getNewclient().equals("Y")){
	        		 polclient.setIsexistingclient(true); 
	        	 }
	        	 else{
	        		 polclient.setIsexistingclient(false);
	        	 }
	        	 polclient.setCode(omepol.getClientcode());
	        	 polclient.setAadharNumber(omepol.getAadhaarcardnumber());
	        	 polclient.setPannumber(omepol.getPsppannumber());
	        	 polclient.setAddress1(omeclient.getClientaddr1());
	        	 polclient.setAddress2(omeclient.getClientaddr2());
	        	 polclient.setAddress3(omeclient.getClientaddr3());
	        	 polclient.setAddress4(omeclient.getClientaddr4());
	        	 polclient.setPincode(omeclient.getClientpincode());
	        	 polclient.setPrimarymobile(omeclient.getPhone());
	        	 polclient.setMiddlename(omeclient.getClientmiddlename());
	        	 polclient.setLastname(omeclient.getClientlastname());
	        	 if(omeclient.getClienttype()=="I"){
	        		 polclient.setIscorporateclient(false); 
	        	 }
	        	 else{
	        		 polclient.setIscorporateclient(true);
	        	 }
	        	 polclient.setAlternatemobile(omeclient.getHandphone());
	        	 polclient.setFirstname(omeclient.getCorporatename());
	        	 polclient.setOccupation(omeclient.getOccupation());
	        	 polclient.setEmail(omeclient.getClientemailid());
	        	 clientNom.setGurdianName(omeclient.getGuardianname());
	        	 polclient.setClientnominee(clientNom);
	        	 
		}
	         return polclient;
	   }
 private Set<Policyitem> commonPolicyItemSet(TtrnPolicy omepol, List<TtrnDriver> omedrivers,
			List<TtrnInscovered> omeInsCovs) throws IllegalArgumentException, IllegalAccessException, ParseException {
	 Policyitem polItem=new Policyitem();
	   ItemDriver iDriver=DriverDateSet(omedrivers,polItem);
	   polItem.setDriverdetail(iDriver);
	   Privatecaritem pcar=CarSet(omepol,omeInsCovs);
	   polItem.setPrivatecaritem(pcar);
	    Set<Iicoverage> icoverage=coverageSet(omeInsCovs);
	   polItem.setIicoverages(icoverage);
	   Set<Policyitem> spolitem=new HashSet<>();
	   spolitem.add(polItem);
	 return spolitem;
	}

private Privatecaritem CarSet(TtrnPolicy omepol, List<TtrnInscovered> omeInsCovs) {
	Privatecaritem pcar=new Privatecaritem();
	for(TtrnInscovered omeInscov:omeInsCovs){
		pcar.setDomicile(omepol.getDomicile());
		pcar.setRegstatecode(omepol.getTerritory());
		pcar.setAAIMembershipNumber(omepol.getAaimembership());
		pcar.setRto(omeInscov.getRegistringauthority());
		pcar.setNcbpercentage(omeInscov.getNcdgrade());
		pcar.setHypothecatedto(omeInscov.getHypothecatedto());
		pcar.setIdv(omeInscov.getItemsi());
		pcar.setFgCoverCode(omeInscov.getCover());
		pcar.setRegstatecode(omeInscov.getTerritorystate());
		pcar.setPincode(omeInscov.getZip());
		pcar.setZone(omeInscov.getTerritory2());
		pcar.setTypeofusage(omeInscov.getUsagecode());
		pcar.setModelcode(omeInscov.getModel());
		pcar.setMakecode(omeInscov.getMake());
		pcar.setColorofvehicle(omeInscov.getColor());
		pcar.setYom(omeInscov.getMfgyr());
		pcar.setRegdate(omeInscov.getVehicleregistrationdate());
		pcar.setRegnum(omeInscov.getRegno());
		pcar.setChassisnumber(omeInscov.getChassisno());
		pcar.setEnginenumber(omeInscov.getEngineno());
		pcar.setEnginecapacity(omeInscov.getCapacity());
		pcar.setSeatingcapacity(omeInscov.getSeatingcapacity());
		pcar.setImtNumbers(omeInscov.getLogbooknumber());		
	}	
	return pcar;
}

private ItemDriver DriverDateSet(List<TtrnDriver> omedrivers,Policyitem polItem) {
	ItemDriver iDriver=new ItemDriver();
   for(TtrnDriver omedriver:omedrivers){
	   iDriver.setDRIVERNO(omedriver.getDriverno());
     }
	return iDriver;
}
private Set<Iicoverage> coverageSet(List<TtrnInscovered> omeInsCovs) throws IllegalArgumentException, IllegalAccessException, ParseException {
	Set<Iicoverage> iicoverageSet=new HashSet<>();
	List<Iicoverage> iicovList=new ArrayList<Iicoverage>();
     for(TtrnInscovered omeInsCov:omeInsCovs)
     {
//    	 Field[] fields = TtrnInscovered.class.getDeclaredFields();
    	 Field[] fields = omeInsCov.getClass().getDeclaredFields();
//    	 System.out.println("-----------fields size-------"+fields.length);
//    	 Iicoverage sicoverage=new Iicoverage();
	    for(Field fld:fields)
	    {
	    	if(fld.getName().toLowerCase().startsWith("sivpc")){
	    		Iicoverage sicoverage=new Iicoverage();
				  sicoverage.setCode(fld.getName().toUpperCase());
				  sicoverage.setName(fld.getName().toUpperCase());
				  fld.setAccessible(true);
				  System.out.println(omeInsCov);
				  Object obj=fld.get(omeInsCov);
				  if(obj!=null){
					  String sistr=obj.toString();
					  sicoverage.setSuminsuredamount(sistr);
				  }
				  iicovList.add(sicoverage);
	    	}	  
				  else if(fld.getName().toLowerCase().startsWith("vpc")){
			    		Iicoverage vpccoverage=new Iicoverage();
			    		   vpccoverage.setCode(fld.getName());
			    		   vpccoverage.setName(fld.getName());
			    		   fld.setAccessible(true);
			    		   System.out.println(omeInsCov);
			    		   Object obj=fld.get(omeInsCov);
			    		   if(obj!=null){
			    		   String vpcstr=obj.toString();
			    		   vpccoverage.setPremium(vpcstr);
			    		   }
			    		   iicovList.add(vpccoverage);
			    		   }
	    	 
				  else if(fld.getName().toLowerCase().startsWith("deductiblesvpc")){
		    		Iicoverage deductcoverage=new Iicoverage();
		    		deductcoverage.setCode(fld.getName());
		    		deductcoverage.setName(fld.getName());
		    		fld.setAccessible(true);
		    		Object obj=fld.get(omeInsCov);
		    		if(obj!=null){
		    		   String deductstr=obj.toString();
		    		   deductcoverage.setDeductibleamount(deductstr);
		    		}
		    		   iicovList.add(deductcoverage);
		    	}
	    	
	    }
			
}
	     	
     for (Iicoverage iiCoverage:iicovList) {
		iicoverageSet.add(iiCoverage);
	  }	
     return iicoverageSet;
    }

}


*/