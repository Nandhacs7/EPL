package com.firstapex.rs.uw.webservices.policymovements;

public class DoMotorEndorsementPortTypeProxy implements com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementPortType {
  private String _endpoint = null;
  private com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementPortType doMotorEndorsementPortType = null;
  
  public DoMotorEndorsementPortTypeProxy() {
    _initDoMotorEndorsementPortTypeProxy();
  }
  
  public DoMotorEndorsementPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDoMotorEndorsementPortTypeProxy();
  }
  
  private void _initDoMotorEndorsementPortTypeProxy() {
    try {
      doMotorEndorsementPortType = (new com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementLocator()).getdoMotorEndorsementSoapBinding();
      if (doMotorEndorsementPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)doMotorEndorsementPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)doMotorEndorsementPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (doMotorEndorsementPortType != null)
      ((javax.xml.rpc.Stub)doMotorEndorsementPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.DoMotorEndorsementPortType getDoMotorEndorsementPortType() {
    if (doMotorEndorsementPortType == null)
      _initDoMotorEndorsementPortTypeProxy();
    return doMotorEndorsementPortType;
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO performMotorEndorsement(com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO FGUWPolicyVO) throws java.rmi.RemoteException{
    if (doMotorEndorsementPortType == null)
      _initDoMotorEndorsementPortTypeProxy();
    return doMotorEndorsementPortType.performMotorEndorsement(FGUWPolicyVO);
  }
  
  
}