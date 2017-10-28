/**
 * DoMotorEndorsementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

//import com.firstapex.rs.epl.cn.common.ENEplProperties;



public class DoMotorEndorsementLocator extends org.apache.axis.client.Service implements com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsement {

    public DoMotorEndorsementLocator() {
    }
//    ENEplProperties enEplProperties=ENEplProperties.getEnEplProperties();
    
    public DoMotorEndorsementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DoMotorEndorsementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }
//    EplConstants eplConstants=new EplConstants();
    // Use to get a proxy class for doMotorEndorsementSoapBinding
    private java.lang.String doMotorEndorsementSoapBinding_address = "";

    public java.lang.String getdoMotorEndorsementSoapBindingAddress() {
        return doMotorEndorsementSoapBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String doMotorEndorsementSoapBindingWSDDServiceName = "doMotorEndorsementSoapBinding";

    public java.lang.String getdoMotorEndorsementSoapBindingWSDDServiceName() {
        return doMotorEndorsementSoapBindingWSDDServiceName;
    }

    public void setdoMotorEndorsementSoapBindingWSDDServiceName(java.lang.String name) {
        doMotorEndorsementSoapBindingWSDDServiceName = name;
    }

    public com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementPortType getdoMotorEndorsementSoapBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(doMotorEndorsementSoapBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdoMotorEndorsementSoapBinding(endpoint);
    }

    public com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementPortType getdoMotorEndorsementSoapBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementSoapBindingStub _stub = new com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementSoapBindingStub(portAddress, this);
            _stub.setPortName(getdoMotorEndorsementSoapBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdoMotorEndorsementSoapBindingEndpointAddress(java.lang.String address) {
        doMotorEndorsementSoapBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementSoapBindingStub _stub = new com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementSoapBindingStub(new java.net.URL(doMotorEndorsementSoapBinding_address), this);
                _stub.setPortName(getdoMotorEndorsementSoapBindingWSDDServiceName());
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
        if ("doMotorEndorsementSoapBinding".equals(inputPortName)) {
            return getdoMotorEndorsementSoapBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "doMotorEndorsement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "doMotorEndorsementSoapBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("doMotorEndorsementSoapBinding".equals(portName)) {
            setdoMotorEndorsementSoapBindingEndpointAddress(address);
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
