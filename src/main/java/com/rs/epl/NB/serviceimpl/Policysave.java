package com.rs.epl.NB.serviceimpl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fa.component.policy.Policy;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.service.PolicyStore;

@Service
@Transactional()
public class Policysave implements PolicyStore {
	
	@Resource
	private PolicyRepository polrepo2;
	
	
	@Resource
	@PersistenceContext(unitName="appPU")
	@Qualifier(value = "entityManagerFactory1")
	EntityManager entityManager1;
	
	@Override
	public void savepol(Policy pol,PolicyRepository polrepo) throws InterruptedException {
		
		Session session = entityManager1.unwrap(Session.class);
	
		 
		String flgvalue=polrepo2.readflag();
		
		if(flgvalue.equalsIgnoreCase("false")){
			while(!flgvalue.equalsIgnoreCase("true")){
				Thread.sleep(10000);
				flgvalue=polrepo2.readflag();
			}			
			polrepo2.Updateflag("false");
			try {
				session.save(pol);
				
			} catch (Exception e) {
				Thread.sleep(3000);	
				session.save(pol);
			}
			
			polrepo2.Updateflag("true");
			
		}else{
			polrepo2.Updateflag("false");
			try {
				session.save(pol);
			} catch (Exception e) {
				
				Thread.sleep(3000);
				session.save(pol);
			}
			polrepo2.Updateflag("true");
					
		}	
		
	}
}
