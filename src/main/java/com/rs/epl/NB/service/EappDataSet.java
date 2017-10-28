/**
 * 
 */
package com.rs.epl.NB.service;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

/**
 * @author fasupport
 *
 */
public interface EappDataSet {
	
	void EappsConversion(Long k, String policyno, String product, List<String> receiptnos) throws RemoteException, ServiceException, JAXBException, InterruptedException;

}
