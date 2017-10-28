/**
 * 
 */
package com.rs.epl.NB.service;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

import com.fa.component.policy.Policy;

/**
 * @author fasupport
 *
 */
public interface EappPolicyService {
	
	public void EappPolicyMov(Policy poltst, String policyno, String receiptnos, Long id, List<String> receiptnos2) throws RemoteException, ServiceException, JAXBException;

}
