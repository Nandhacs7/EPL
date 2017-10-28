/*package com.rs.epl.NB.serviceimpl;

import java.lang.reflect.Field;
//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import com.fa.component.policy.Clientnominee;
import com.fa.component.policy.Iicoverage;
import com.fa.component.policy.ItemDriver;
import com.fa.component.policy.Payment;
import com.fa.component.policy.Policy;
import com.fa.component.policy.Policyclient;
import com.fa.component.policy.Policycoverage;
import com.fa.component.policy.Policyitem;
import com.fa.component.policy.Privatecaritem;
import com.rs.epl.NB.oementity.TtrnDriver;
import com.rs.epl.NB.oementity.TtrnInscovered;
import com.rs.epl.NB.oementity.TtrnInsured;
import com.rs.epl.NB.oementity.TtrnPolicy;
import com.rs.epl.NB.policyrepository.PolicyRepository;

//import antlr.collections.List;

public class OneRowInsertTest {
	
	@Resource
	PolicyRepository polrepo;
	public OneRowInsertTest(PolicyRepository polReposetory) {
		this.polrepo=polReposetory;
	}
	public void policyset(TtrnDriver omeDriver, TtrnInscovered omeInscover, TtrnInsured omeInsured,
			TtrnPolicy omePolicy) throws IllegalArgumentException, IllegalAccessException {
		 Policy pol=new Policy();		
		 pol.setPolno(omePolicy.getPolicyno());
		 pol.setEndtno(omePolicy.getEndorsementNo());
		 pol.setProductcode(omePolicy.getProductcode());
		 pol.setAgentcode(omePolicy.getAccountcode());
		 pol.setBranchcode(omePolicy.getBranch());
		 pol.setPolicysuminsuredamount(omePolicy.getIncrementalsi());
		 pol.setPolstartdate(omePolicy.getInceptiondate(),omePolicy.getInceptiontime());		 
		 String polExpireDate=omePolicy.getExpirydate()+omePolicy.getExpirytime();
		 pol.setPolexpirydate(polExpireDate);
		 pol.setProposalDate(omePolicy.getProposaldate());
		 pol.setCreationdate(omePolicy.getIssuedate());	
		 pol.setAccountDate(omePolicy.getAccountdate());
		 pol.setUwyr(omePolicy.getUnderwritingyear());
		 pol.setAgentcode(omePolicy.getOtherparty1());
		 pol.setBdocode(omePolicy.getOtherparty2());
		 pol.setOacode(omePolicy.getOragent());
		 Policyclient polclient= CommonpolicyclientSet(omeInsured,omePolicy);
		 pol.setPolicyclient(polclient);
		 Payment pay=paymentDataSet(omePolicy);
		 Set<Payment> paymentset=new HashSet<Payment>();
		 paymentset.add(pay);
		 pol.setPayments(paymentset);
		 Set<Policyitem> polItem=commonPolicyItemSet(omePolicy, omeDriver,omeInscover);
		 pol.setPolicyitems(polItem);
		 Policycoverage polcoverage1=new Policycoverage();
		 polcoverage1.setCode("ZDILCM");
		 polcoverage1.setName("ZDILCM");
		 polcoverage1.setPremium(omePolicy.getZdilcm());		 
		 Policycoverage polcoverage2=new Policycoverage();
		 polcoverage2.setCode("ZCLD");
		 polcoverage2.setName("ZCLD");
		 polcoverage2.setPremium(omePolicy.getZcld());		 
		 Policycoverage polcoverage3=new Policycoverage();
		 polcoverage3.setCode("ZSTAX");
		 polcoverage3.setName("ZSTAX");
		 polcoverage3.setPremium(omePolicy.getZstax());	 
		 Policycoverage polcoverage4=new Policycoverage();
		 polcoverage4.setCode("ZEDCS");
		 polcoverage4.setName("ZEDCS");
		 polcoverage4.setPremium(omePolicy.getZedcs()); 		 
		 Policycoverage polcoverage5=new Policycoverage();
		 polcoverage5.setCode("ZCM");
		 polcoverage5.setName("ZCM");
		 polcoverage5.setPremium(omePolicy.getZcm()); 
		 Policycoverage polcoverage6=new Policycoverage();
		 polcoverage6.setCode("Zcmtx");
		 polcoverage6.setName("Zcmtx");
		 polcoverage6.setPremium(omePolicy.getZcmtx()); 
     	 Policycoverage polcoverage7=new Policycoverage();
     	 polcoverage7.setCode("ZOVCM");
     	 polcoverage7.setName("ZOVCM");
     	 polcoverage7.setPremium(omePolicy.getZovcm()); 
		 Policycoverage polcoverage8=new Policycoverage();
		 polcoverage8.setCode("ZWROFF");
		 polcoverage8.setName("ZWROFF");
//		 polcoverage8.setPremium(omePolicy.getZwroff()); 		 
		 Policycoverage polcoverage9=new Policycoverage();
		 polcoverage9.setCode("ZOCMTX");
		 polcoverage9.setName("ZOCMTX");
		 polcoverage9.setPremium(omePolicy.getZocmtx());		 
		 Policycoverage polcoverage10=new Policycoverage();
		 polcoverage10.setCode("ZSTDTY");
		 polcoverage10.setName("ZSTDTY");
		 polcoverage10.setPremium(omePolicy.getZstdty());		 
		 Policycoverage polcoverage11=new Policycoverage();
		 polcoverage11.setCode("ZSDEXP");
		 polcoverage11.setName("ZSDEXP");
		 polcoverage11.setPremium(omePolicy.getZsdexp());				 
		 Policycoverage polcoverage12=new Policycoverage();
		 polcoverage12.setCode("ZKCESS");
		 polcoverage12.setName("ZKCESS");
		 polcoverage12.setPremium(omePolicy.getZkcess());
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
		 pol.setPolicycoverages(polset);
		 System.out.println("--Completed policy coverages----");
//		 Set<Policycoverage> scover=pol.getPolicycoverages();
//		 Iterator<Policycoverage> covitr=scover.iterator();
//		  while(covitr.hasNext())
//		  {
//			  Policycoverage testcov=covitr.next();
//			  System.out.println("*************"+testcov.getCode()+"*************"+testcov.getName()+"*************"+testcov.getPremium());
//		  }
		 		 
//		 Policyclient pclient=pol.getPolicyclient();
//		 System.out.println("------------------------"+pclient.getFirstname());
//		 Set<Payment> spay=pol.getPayments();
//		 Iterator<Payment> itr=spay.iterator();
//		 while(itr.hasNext()){
//			 Payment opay =(Payment) itr.next();
//		 System.out.println("------------------"+opay.getCBC());
//		 }
//		 Set<Policyitem> itemset=pol.getPolicyitems();
//		 Iterator<Policyitem> itemitr=itemset.iterator();
//		 while(itemitr.hasNext()){
//			 Policyitem oneitem=itemitr.next();
//			 Privatecaritem prcar=oneitem.getPrivatecaritem();
//			 System.out.println("-------privatecar------------"+prcar.getRto());
//			 ItemDriver itemdriver=oneitem.getDriverdetail();
//			 System.out.println("***************"+itemdriver.getDRIVERNO());
//			Set<Iicoverage> siicov=oneitem.getIicoverages();
//			Iterator<Iicoverage> iitr=siicov.iterator();
//			 while(iitr.hasNext())
//			 {
//				 Iicoverage IIcovdata=iitr.next();
//		System.out.println("************"+IIcovdata.getCode()+"**********"+IIcovdata.getName()+"************"
//				+IIcovdata.getPremium()+"**********"+IIcovdata.getSuminsuredamount()+"**********"+IIcovdata.getDeductibleamount());
//			 }
//		 }
		 polrepo.save(pol);		
		 System.out.println("--policy persisted successfully----");
		
	}
	private Payment paymentDataSet(TtrnPolicy omePolicy) {
		Payment pay=new Payment();
		pay.setReceiptnumber(omePolicy.getRecieptNumber());
		pay.setPaymenttype(omePolicy.getPaymentmethod());
		if(pay.getPaymenttype()=="CARD"){
		  pay.setInstrumentnumber(omePolicy.getCardnum());
		}
		else{
			pay.setInstrumentnumber(omePolicy.getChqNo());
		}		
		pay.setInstrumentexpdt(omePolicy.getCardexp());
	    pay.setCBC(omePolicy.getCbc());
		pay.setPaymentamount(omePolicy.getChqAmt());
		pay.setPaymentdate(omePolicy.getChqIssueDt());
	    pay.setInstrumentbank(omePolicy.getBankName());
		pay.setBankCity(omePolicy.getBankCit());
	    pay.setReceipt_amount(omePolicy.getReceiptAmount());
	    pay.setDepositingBankCode(omePolicy.getBankCode());
	    pay.setInstrumenttype(omePolicy.getCardType());
		return pay;
	}
	private Policyclient CommonpolicyclientSet(TtrnInsured omeInsured, TtrnPolicy omePolicy) {
		Policyclient polclient=new Policyclient();
       	 Clientnominee clientNom=new Clientnominee();
         if(omePolicy.getNewclient().equals("Y")){
       		 polclient.setIsexistingclient(true); 
       	 }
       	 else{
       		 polclient.setIsexistingclient(false);
       	 }
       	 polclient.setCode(omePolicy.getClientcode());
       	 polclient.setAadharNumber(omePolicy.getAadhaarcardnumber());
       	 polclient.setPannumber(omePolicy.getPsppannumber());
       	 polclient.setAddress1(omeInsured.getClientaddr1());
       	 polclient.setAddress2(omeInsured.getClientaddr2());
       	 polclient.setAddress3(omeInsured.getClientaddr3());
       	 polclient.setAddress4(omeInsured.getClientaddr4());
       	 polclient.setPincode(omeInsured.getClientpincode());
       	 polclient.setPrimarymobile(omeInsured.getPhone());
       	 polclient.setMiddlename(omeInsured.getClientmiddlename());
       	 polclient.setLastname(omeInsured.getClientlastname());
       	 if(omeInsured.getClienttype()=="I"){
       		 polclient.setIscorporateclient(false); 
       	 }
       	 else{
       		 polclient.setIscorporateclient(true);
       	 }
       	 polclient.setAlternatemobile(omeInsured.getHandphone());
       	 polclient.setFirstname(omeInsured.getCorporatename());
       	 polclient.setOccupation(omeInsured.getOccupation());
       	 polclient.setEmail(omeInsured.getClientemailid());
       	 clientNom.setGurdianName(omeInsured.getGuardianname());
       	 polclient.setClientnominee(clientNom);
		return polclient;
       }
	private Set<Policyitem> commonPolicyItemSet(TtrnPolicy omePolicy, TtrnDriver omeDriver,
			TtrnInscovered omeInscover) throws IllegalArgumentException, IllegalAccessException {
		 Policyitem polItem=new Policyitem();
		   ItemDriver iDriver=new ItemDriver();
		   iDriver.setDRIVERNO(omeDriver.getDriverno());
		   polItem.setDriverdetail(iDriver);
		   Privatecaritem pcar=CarSet(omePolicy,omeInscover);
		   polItem.setPrivatecaritem(pcar);
		    Set<Iicoverage> icoverage=coverageSet(omeInscover);
		   polItem.setIicoverages(icoverage);
		   Set<Policyitem> spolitem=new HashSet<Policyitem>();
		   spolitem.add(polItem);
		 return spolitem;

	}
	private Set<Iicoverage> coverageSet(TtrnInscovered omeInscover) throws IllegalArgumentException, IllegalAccessException {
		Set<Iicoverage> iicoverageSet=new HashSet<Iicoverage>();
		Field[] fields = omeInscover.getClass().getDeclaredFields();
	    for(Field fld:fields)
	    {
	    	if(fld.getName().toLowerCase().startsWith("sivpc")){
	    		Iicoverage sicoverage=new Iicoverage();
				  sicoverage.setCode(fld.getName().toUpperCase());
				  sicoverage.setName(fld.getName().toUpperCase());
				  fld.setAccessible(true);
				  Object obj=fld.get(omeInscover);
				  if(obj!=null){
					  String sistr=obj.toString();
					  sicoverage.setSuminsuredamount(sistr);
				  }
//    System.out.println("insite iicoverage========"+sicoverage.getCode()+"========="+sicoverage.getName()+"========="+sicoverage.getSuminsuredamount());
				  iicoverageSet.add(sicoverage);
	    	}	  
				  else if(fld.getName().toLowerCase().startsWith("vpc")){
			    		Iicoverage vpccoverage=new Iicoverage();
			    		   vpccoverage.setCode(fld.getName().toUpperCase());
			    		   vpccoverage.setName(fld.getName().toUpperCase());
			    		   fld.setAccessible(true);
			    		   Object obj=fld.get(omeInscover);
			    		   if(obj!=null){
			    		   String vpcstr=obj.toString();
			    		   vpccoverage.setPremium(vpcstr);
			    		   }
//   System.out.println("insite iicoverage========"+vpccoverage.getCode()+"========="+vpccoverage.getName()+"========="+vpccoverage.getPremium());
			    		   iicoverageSet.add(vpccoverage);
			    }
	    	 
				  else if(fld.getName().toLowerCase().startsWith("deductiblesvpc")){
		    		Iicoverage deductcoverage=new Iicoverage();
		    		deductcoverage.setCode(fld.getName().toUpperCase());
		    		deductcoverage.setName(fld.getName().toUpperCase());
		    		fld.setAccessible(true);
		    		Object obj=fld.get(omeInscover);
		    		if(obj!=null){
		    		   String deductstr=obj.toString();
		    		   deductcoverage.setDeductibleamount(deductstr);
		    		}
//		    		 System.out.println("insite iicoverage========"+deductcoverage.getCode()+"========="+deductcoverage.getName()+"========="+deductcoverage.getDeductibleamount());
		    		iicoverageSet.add(deductcoverage);
		    	}
	    	
	    }
		return iicoverageSet;
	}
	private Privatecaritem CarSet(TtrnPolicy omePolicy, TtrnInscovered omeInscover) {
		Privatecaritem pcar=new Privatecaritem();
		pcar.setDomicile(omePolicy.getDomicile());
		pcar.setRegstatecode(omePolicy.getTerritory());
		pcar.setAAIMembershipNumber(omePolicy.getAaimembership());
		pcar.setRto(omeInscover.getRegistringauthority());
		pcar.setNcbpercentage(omeInscover.getNcdgrade());
		pcar.setHypothecatedto(omeInscover.getHypothecatedto());
		pcar.setIdv(omeInscover.getItemsi());
		pcar.setFgCoverCode(omeInscover.getCover());
		pcar.setRegstatecode(omeInscover.getTerritorystate());
		pcar.setPincode(omeInscover.getZip());
		pcar.setZone(omeInscover.getTerritory2());
		pcar.setTypeofusage(omeInscover.getUsagecode());
		pcar.setModelcode(omeInscover.getModel());
		pcar.setMakecode(omeInscover.getMake());
		pcar.setColorofvehicle(omeInscover.getColor());
		pcar.setYom(omeInscover.getMfgyr());
		pcar.setRegdate(omeInscover.getVehicleregistrationdate());
		pcar.setRegnum(omeInscover.getRegno());
		pcar.setChassisnumber(omeInscover.getChassisno());
		pcar.setEnginenumber(omeInscover.getEngineno());
		pcar.setEnginecapacity(omeInscover.getCapacity());
		pcar.setSeatingcapacity(omeInscover.getSeatingcapacity());
		pcar.setImtNumbers(omeInscover.getLogbooknumber());	
		return pcar;
	}
}
*/