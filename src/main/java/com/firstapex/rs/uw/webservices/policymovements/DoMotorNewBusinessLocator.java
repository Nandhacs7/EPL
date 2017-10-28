/**
 * DoMotorNewBusinessLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import com.firstapex.rs.epl.NB.common.ENEplProperties;

public class DoMotorNewBusinessLocator extends org.apache.axis.client.Service implements com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusiness {
	String doMotorNewBusinessSoapBinding_address;

    public DoMotorNewBusinessLocator(String Transcation) {
    	if(Transcation.equalsIgnoreCase("NB")){
    		 doMotorNewBusinessSoapBinding_address="http://"+prop.getFgserverhost()+":"+prop.getFgserverport()+"/FirstGen/services/doMotorNewBusiness/";
    	}else{
    		 doMotorNewBusinessSoapBinding_address="http://"+prop.getFgserverhost()+":"+prop.getFgserverport()+"/FirstGen/services/doMotorRenewal/";
    	}
    }
    ENEplProperties prop = ENEplProperties.getEnEplProperties();

    public DoMotorNewBusinessLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DoMotorNewBusinessLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for doMotorNewBusinessSoapBinding
//    private java.lang.String doMotorNewBusinessSoapBinding_address = null;

  
    public java.lang.String getdoMotorNewBusinessSoapBindingAddress() {
//    	System.out.println("wsdl call=>"+doMotorNewBusinessSoapBinding_address);

    	return doMotorNewBusinessSoapBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String doMotorNewBusinessSoapBindingWSDDServiceName = "doMotorNewBusinessSoapBinding";

    public java.lang.String getdoMotorNewBusinessSoapBindingWSDDServiceName() {
        return doMotorNewBusinessSoapBindingWSDDServiceName;
    }

    public void setdoMotorNewBusinessSoapBindingWSDDServiceName(java.lang.String name) {
        doMotorNewBusinessSoapBindingWSDDServiceName = name;
    }

    public com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType getdoMotorNewBusinessSoapBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(doMotorNewBusinessSoapBinding_address);
            System.out.println("endpoint=="+endpoint);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdoMotorNewBusinessSoapBinding(endpoint);
    }

    public com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType getdoMotorNewBusinessSoapBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessSoapBindingStub _stub = new com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessSoapBindingStub(portAddress, this);
            _stub.setPortName(getdoMotorNewBusinessSoapBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdoMotorNewBusinessSoapBindingEndpointAddress(java.lang.String address) {
        doMotorNewBusinessSoapBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessSoapBindingStub _stub = new com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessSoapBindingStub(new java.net.URL(doMotorNewBusinessSoapBinding_address), this);
                _stub.setPortName(getdoMotorNewBusinessSoapBindingWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("doMotorNewBusinessSoapBinding".equals(inputPortName)) {
            return getdoMotorNewBusinessSoapBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "doMotorNewBusiness");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "doMotorNewBusinessSoapBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("doMotorNewBusinessSoapBinding".equals(portName)) {
            setdoMotorNewBusinessSoapBindingEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
