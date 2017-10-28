/**
 * DoHealthNewBusinessLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class DoHealthNewBusinessLocator extends org.apache.axis.client.Service implements com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusiness {

    public DoHealthNewBusinessLocator() {
    }


    public DoHealthNewBusinessLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DoHealthNewBusinessLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for doHealthNewBusinessSoapBinding
    private java.lang.String doHealthNewBusinessSoapBinding_address = "http://10.46.222.182:5050/FirstGen/services/doHealthNewBusiness/";

    public java.lang.String getdoHealthNewBusinessSoapBindingAddress() {
        return doHealthNewBusinessSoapBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String doHealthNewBusinessSoapBindingWSDDServiceName = "doHealthNewBusinessSoapBinding";

    public java.lang.String getdoHealthNewBusinessSoapBindingWSDDServiceName() {
        return doHealthNewBusinessSoapBindingWSDDServiceName;
    }

    public void setdoHealthNewBusinessSoapBindingWSDDServiceName(java.lang.String name) {
        doHealthNewBusinessSoapBindingWSDDServiceName = name;
    }

    public com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessPortType getdoHealthNewBusinessSoapBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(doHealthNewBusinessSoapBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdoHealthNewBusinessSoapBinding(endpoint);
    }

    public com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessPortType getdoHealthNewBusinessSoapBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessSoapBindingStub _stub = new com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessSoapBindingStub(portAddress, this);
            _stub.setPortName(getdoHealthNewBusinessSoapBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdoHealthNewBusinessSoapBindingEndpointAddress(java.lang.String address) {
        doHealthNewBusinessSoapBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessSoapBindingStub _stub = new com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessSoapBindingStub(new java.net.URL(doHealthNewBusinessSoapBinding_address), this);
                _stub.setPortName(getdoHealthNewBusinessSoapBindingWSDDServiceName());
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
        if ("doHealthNewBusinessSoapBinding".equals(inputPortName)) {
            return getdoHealthNewBusinessSoapBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "doHealthNewBusiness");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "doHealthNewBusinessSoapBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("doHealthNewBusinessSoapBinding".equals(portName)) {
            setdoHealthNewBusinessSoapBindingEndpointAddress(address);
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
