package com.rs.epl.NB.service;

import com.fa.component.policy.Policy;
import com.rs.epl.NB.policyrepository.Status;

public interface SchedulPushToFG {
	void NewBussinessPushToFg(Policy poltst, Status oemstatus) throws Exception; 
}
