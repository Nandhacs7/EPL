package com.rs.epl.NB.service;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

public interface EappReceiptService {
	
	public void EappReceiptMov(Long k, String policyno) throws RemoteException, ServiceException, JAXBException;

}
