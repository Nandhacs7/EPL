package com.rs.epl.NB.serviceimpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.firstapex.rs.epl.NB.common.ENEplProperties;
import com.rs.epl.NB.oemrepository.Policyinfo;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.service.ScheduleDataSet;

@Service
public class TaskSchedular {


	protected final Logger logger = Logger.getLogger(getClass());

	@Resource
    Policyinfo  Omepolicyrepo;
	
	@Resource
	ScheduleDataSet DataSet;

	@Resource
	PolicyRepository polre;
	
	   static boolean flag2=true;
	   
		public boolean isFlag2() {
			return flag2;
		}
		public void setFlag2(boolean flag2) {
			TaskSchedular.flag2 = flag2;
		}   
	   
   public void FGPushSchduler() throws Exception
	{
	  
	   ENEplProperties prop = ENEplProperties.getEnEplProperties();
	   boolean flag=prop.isFlag();
	   
	   if(flag){
             boolean flag3;
	        Calendar cal = Calendar.getInstance();
				cal.setTime(new Date());               
				int hour = cal.get(Calendar.HOUR_OF_DAY); 
				if(hour <= 23 && hour >= 1)           
				{
					flag3=true; 
				}else{
					flag3=false;
				}
		   
       if(polre.readupdateflag().equalsIgnoreCase("true")){
    	   polre.changeupdateflag("false");
    	   double totalcount;
    	   double modcount;
    	   int inm284 = 0;
    	   int inm118 = 0;
    	    totalcount=Omepolicyrepo.readfreshpolicy();
    	    modcount=totalcount/2;
    	   if ((modcount == Math.floor(modcount)) && !Double.isInfinite(modcount)) {
               	 inm284=Omepolicyrepo.Updateinmchn284((int) modcount);  
               	 inm118=Omepolicyrepo.Updateinmchn118((int) modcount);
            }else{
            	inm284=Omepolicyrepo.Updateinmchn284((int) Math.ceil(modcount));  
              	 inm118=Omepolicyrepo.Updateinmchn118((int) Math.floor(modcount));
            }
    	    int total=inm284+inm118;
    	   logger.info("No Of Policies Updated==>"+total);
    	   polre.changeupdateflag("true");
       }
	 logger.info("Scheduler Start Time : "+new Date());
	   List<String> retrypolicies=Omepolicyrepo.FindRetryPolicyno();
	   List<String> freshpolicies=Omepolicyrepo.FindFreshpolicy();
	   outloop:
	   if(retrypolicies.size()>0 && flag2 && flag3){
		   for(String Polno:retrypolicies){
			   try {
				   if(flag2){
					   logger.info("Start of processing Policy - "+Polno);
					   
					   DataSet.OemToPolicyDataSet(Polno);
					   
//					   ReciptPush.ReciptpushToFg(Polno);
					   
//					   FirstgenPush.NewBussinessPushToFg(Polno);
					   
					   logger.info("End of processing Policy - "+Polno);	
					   Runtime r = Runtime.getRuntime();
					   System.out.println("Free Memory Before calling gc  "+r.freeMemory());
					   r.gc();
					   System.out.println("Free Memory After calling gc  "+r.freeMemory());
				   }else{
					   break outloop;
				   }
				
			} catch (Exception e) {
				logger.info("processing Policy of completed with error   "+e.getMessage() );
				   Runtime r = Runtime.getRuntime();
				   System.out.println("Free Memory Before calling gc  "+r.freeMemory());
				   r.gc();
				   System.out.println("Free Memory After calling gc  "+r.freeMemory());
			}
		  }
	   }else if(freshpolicies.size()>0 && flag2 && flag3){
		   for(String Polno:freshpolicies){
			   try {
				   if(flag2){
					   logger.info("Start of processing Policy - "+Polno);
					   
					   DataSet.OemToPolicyDataSet(Polno);
					   
//					   ReciptPush.ReciptpushToFg(Polno);
					   
//					   FirstgenPush.NewBussinessPushToFg(Polno);
					   
					   logger.info("End of processing Policy - "+Polno);	
					   Runtime r = Runtime.getRuntime();
					   System.out.println("Free Memory Before calling gc  "+r.freeMemory());
					   r.gc();
					   System.out.println("Free Memory After calling gc  "+r.freeMemory());
				   }else{
					   break outloop;
				   }
				
			} catch (Exception e) {
				logger.info("processing Policy of completed with error   "+e.getMessage() );
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









//List<Object> MfgDetails=Omepolicyrepo.GrpupByMfg();
//List<MfgDto> lstMfgs=new ArrayList<MfgDto>();
//for(Object Mfg:MfgDetails){
//	   Object[] a = (Object[]) Mfg;
//	   MfgDto onemfg=new MfgDto();
//	   onemfg.setProductid(String.valueOf(a[0])); 
//	   onemfg.setMfgCode(String.valueOf(a[1]));
//	   onemfg.setMfgname(String.valueOf(a[2]));
//	   lstMfgs.add(onemfg);
//}

//ENEplProperties prop = ENEplProperties.getEnEplProperties();
//long time=prop.getScheduletime();
//@Scheduled(fixedDelay=3600000)
//@Scheduled(fixedDelay= time)// runs for 30 minutes
//@Scheduled(fixedDelayString = "${prop.getScheduletime()}")
//@Scheduled(cron = "0 0/15 * * * *")

//@Resource
//SchedulPushToFG FirstgenPush;

//@Resource
//ReciptPushToFg ReciptPush;
