package com.firstapex.rs.uw.webservices.policymovements;

public class DoMotorRenewalPortTypeProxy implements com.firstapex.rs.uw.webservices.policymovements.DoMotorRenewalPortType {
  private String _endpoint = null;
  private com.firstapex.rs.uw.webservices.policymovements.DoMotorRenewalPortType doMotorRenewalPortType = null;
  
  public DoMotorRenewalPortTypeProxy() {
    _initDoMotorRenewalPortTypeProxy();
  }
  
  public DoMotorRenewalPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDoMotorRenewalPortTypeProxy();
  }
  
  private void _initDoMotorRenewalPortTypeProxy() {
    try {
      doMotorRenewalPortType = (new com.firstapex.rs.uw.webservices.policymovements.DoMotorRenewalLocator()).getdoMotorRenewalSoapBinding();
      if (doMotorRenewalPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)doMotorRenewalPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)doMotorRenewalPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (doMotorRenewalPortType != null)
      ((javax.xml.rpc.Stub)doMotorRenewalPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.DoMotorRenewalPortType getDoMotorRenewalPortType() {
    if (doMotorRenewalPortType == null)
      _initDoMotorRenewalPortTypeProxy();
    return doMotorRenewalPortType;
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO performMotorRenewal(com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO FGUWPolicyVO) throws java.rmi.RemoteException{
    if (doMotorRenewalPortType == null)
      _initDoMotorRenewalPortTypeProxy();
    return doMotorRenewalPortType.performMotorRenewal(FGUWPolicyVO);
  }
  
  
}