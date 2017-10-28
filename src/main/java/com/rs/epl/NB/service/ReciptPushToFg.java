package com.rs.epl.NB.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import com.fa.component.policy.Policy;
import com.rs.epl.NB.policyrepository.Status;

public interface ReciptPushToFg {
	public String ReciptpushToFg(Policy poltst, Status oemstatus) throws JAXBException, FileNotFoundException, IOException;
}
