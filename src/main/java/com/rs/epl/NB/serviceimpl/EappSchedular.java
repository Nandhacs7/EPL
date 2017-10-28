package com.rs.epl.NB.serviceimpl;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
//import java.util.List;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.firstapex.rs.epl.NB.common.ENEplProperties;
import com.rs.epl.NB.eappsrepo.EappPolicy;
import com.rs.epl.NB.service.EappDataSet;

@Service
public class EappSchedular {
	
	@Resource
	EappDataSet eappsconv;
	
	
	@Resource
	EappPolicy EapppolRepo;

	   static boolean flag2=true;
	   
		public boolean isFlag2() {
			return flag2;
		}
		public void setFlag2(boolean flag2) {
			EappSchedular.flag2 = flag2;
		}  
		protected final Logger logger = Logger.getLogger(getClass());
	
	public void EappTask() throws RemoteException, ServiceException, JAXBException{
			
		ENEplProperties prop = ENEplProperties.getEnEplProperties();
		
		 boolean flag=prop.isEappflag();

	   if(flag){	    	 
		 boolean flag3;
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());               
		int hour = cal.get(Calendar.HOUR_OF_DAY); 
		if(hour <= 23 && hour >= 1)           
		{
			flag3=true; 
		}else{
			flag3=true;
		}	       
	  logger.info("Scheduler Start Time : "+new Date());
	  
		List<BigDecimal> ids = EapppolRepo.Idsofdate();
		 
		outloop:		
		if(!ids.isEmpty() && flag2 && flag3) {
			
//			EapppolRepo.refreshhusingfunction();
			
			for(BigDecimal id : ids) {
				try {
					if(flag2){					
						     long idss=id.longValue();
						     List<String> receiptnos=EapppolRepo.recnos(idss);
						     boolean status=false;
						     innerloop:
						for (String receipt : receiptnos) {
							        String recno=EapppolRepo.findinfirstgen(receipt); 
							          if(null!=recno && !recno.equalsIgnoreCase("")){
								          status=true;
							          }else{
								        status=false;
								        break innerloop;
							           }
						  }
						                if(status){
						                	long idx=EapppolRepo.id(idss);
						                	
							               String Policyno=EapppolRepo.PolicyCode(idx);
							
							                String Product=EapppolRepo.Productcode(idx);
							
							                logger.info("Start of processing Policy - "+Policyno);
							
							                 eappsconv.EappsConversion(idx,Policyno,Product,receiptnos);
							
							                logger.info("End of processing Policy - "+Policyno);	
							                 Runtime r = Runtime.getRuntime();
							                System.out.println("Free Memory Before calling gc  "+r.freeMemory());
							                r.gc();
							                System.out.println("Free Memory After calling gc  "+r.freeMemory());							
						                 }
						
						
					}else{break outloop;}				   
                   } catch (Exception e) {
					   logger.info("processing Policy of completed with error   "+e.getMessage());
					   Runtime r = Runtime.getRuntime();
					   System.out.println("Free Memory Before calling gc  "+r.freeMemory());
					   r.gc();
					   System.out.println("Free Memory After calling gc  "+r.freeMemory());					
				}					
			}			
		}     
	     logger.info("Scheduler End Time : "+new Date());	
	}
	   
	   	   
 }
}





//DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//
//boolean flag3;
//Date date = new Date();
//String ram=sdf.format(date).toString();
//String sam=ram.substring(ram.indexOf(" ")).trim();
//String sts=sam.substring(0,2);
//if(Integer.valueOf(sts)>=23  || Integer.valueOf(sts)<=03){
//	   flag3=false;       	
//}
//else {
//	   flag3=true;
//}	