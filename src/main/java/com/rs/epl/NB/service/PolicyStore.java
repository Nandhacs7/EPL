package com.rs.epl.NB.service;


import com.fa.component.policy.Policy;
import com.rs.epl.NB.policyrepository.PolicyRepository;

public interface PolicyStore {
  
	public void savepol(Policy pol, PolicyRepository polrepo) throws InterruptedException;
	
}
