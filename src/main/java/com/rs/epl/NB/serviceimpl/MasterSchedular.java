package com.rs.epl.NB.serviceimpl;

/*import java.util.List;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;

import com.fa.component.policy.Policy;
import com.rs.epl.NB.oementity.TtrnPolicy;
import com.rs.epl.NB.oemrepository.Aiblmaster;
import com.rs.epl.NB.oemrepository.Fordmaster;
import com.rs.epl.NB.oemrepository.Hondamaster;
import com.rs.epl.NB.oemrepository.Marutimaster;
import com.rs.epl.NB.oemrepository.Miblmaster;
import com.rs.epl.NB.oemrepository.Policyinfo;
import com.rs.epl.NB.oemrepository.Tatamaster;
import com.rs.epl.NB.policyrepository.PolicyRepository;

public class MasterSchedular {
	@Resource
    Policyinfo  ttrn_policy;
	@Resource
	Fordmaster ford;
	@Resource
	Aiblmaster abibl;
	@Resource
	Hondamaster Honda;
	@Resource
	Marutimaster Maruti;
	@Resource
	Miblmaster  Mibl;
	@Resource
	Tatamaster Tata;
	@Resource
	PolicyRepository pol;
	
	
//	@Scheduled(cron = "0 0/30 * * * *")
	public void masterupdate(){
		try {
		List<String> SuccessRecipts=ttrn_policy.UpdateForMasters();
		if(null!=SuccessRecipts){
			for(String str: SuccessRecipts){
				TtrnPolicy omepol=ttrn_policy.findOne(str);
				Policy policy=pol.findBypolno(str);
				String Mfg=policy.getMfgcode().toUpperCase();
			if("SUCCESS".equalsIgnoreCase(omepol.getWebserviceStatus())  && "SUCCESS".equalsIgnoreCase(omepol.getRECEIPT_WEB_SERVICE())){
				switch (Mfg) {
				case "ADITHYA":
					break;
				case "FORD":
					break;
				case "HON":
					break;
				case "MAHINDRA":
					break;
				case "MARUTI":
					break;
				case "TATA":
					break;
				default:
				}		   
				 
				
				
				
				
				
				
				
				
				
				
				
				
					
	        }
         else if("FAIL".equalsIgnoreCase(omepol.getWebserviceStatus())  && "SUCCESS".equalsIgnoreCase(omepol.getRECEIPT_WEB_SERVICE())){
        	 
        	 
					
				}
				
			}			
			
		}
	  }
	
	 catch (Exception e) {
		}

 }
}*/
