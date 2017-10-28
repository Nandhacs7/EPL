/**
 * FirstGenReceiptCreationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

import com.firstapex.rs.epl.NB.common.ENEplProperties;

public class FirstGenReceiptCreationServiceLocator extends org.apache.axis.client.Service implements com.firstapex.rs.acnt.webservices.receiptInterface.FirstGenReceiptCreationService {

    public FirstGenReceiptCreationServiceLocator() {
    }
    ENEplProperties prop = ENEplProperties.getEnEplProperties();


    public FirstGenReceiptCreationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FirstGenReceiptCreationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReceiptCreationSoapBinding
    private java.lang.String ReceiptCreationSoapBinding_address = "http://"+prop.getFgserverhost()+":"+prop.getFgserverport()+"/FirstGen/services/FirstGenReceiptCreationService/";

    public java.lang.String getReceiptCreationSoapBindingAddress() {
        return ReceiptCreationSoapBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReceiptCreationSoapBindingWSDDServiceName = "ReceiptCreationSoapBinding";

    public java.lang.String getReceiptCreationSoapBindingWSDDServiceName() {
        return ReceiptCreationSoapBindingWSDDServiceName;
    }

    public void setReceiptCreationSoapBindingWSDDServiceName(java.lang.String name) {
        ReceiptCreationSoapBindingWSDDServiceName = name;
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType getReceiptCreationSoapBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReceiptCreationSoapBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReceiptCreationSoapBinding(endpoint);
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType getReceiptCreationSoapBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationSoapBindingStub _stub = new com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationSoapBindingStub(portAddress, this);
            _stub.setPortName(getReceiptCreationSoapBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReceiptCreationSoapBindingEndpointAddress(java.lang.String address) {
        ReceiptCreationSoapBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationSoapBindingStub _stub = new com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationSoapBindingStub(new java.net.URL(ReceiptCreationSoapBinding_address), this);
                _stub.setPortName(getReceiptCreationSoapBindingWSDDServiceName());
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
        if ("ReceiptCreationSoapBinding".equals(inputPortName)) {
            return getReceiptCreationSoapBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FirstGenReceiptCreationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "ReceiptCreationSoapBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReceiptCreationSoapBinding".equals(portName)) {
            setReceiptCreationSoapBindingEndpointAddress(address);
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
