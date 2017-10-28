package com.firstapex.rs.uw.webservices.policymovements;

public class DoHealthNewBusinessPortTypeProxy implements com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessPortType {
  private String _endpoint = null;
  private com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessPortType doHealthNewBusinessPortType = null;
  
  public DoHealthNewBusinessPortTypeProxy() {
    _initDoHealthNewBusinessPortTypeProxy();
  }
  
  public DoHealthNewBusinessPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDoHealthNewBusinessPortTypeProxy();
  }
  
  private void _initDoHealthNewBusinessPortTypeProxy() {
    try {
      doHealthNewBusinessPortType = (new com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessLocator()).getdoHealthNewBusinessSoapBinding();
      if (doHealthNewBusinessPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)doHealthNewBusinessPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)doHealthNewBusinessPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (doHealthNewBusinessPortType != null)
      ((javax.xml.rpc.Stub)doHealthNewBusinessPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.DoHealthNewBusinessPortType getDoHealthNewBusinessPortType() {
    if (doHealthNewBusinessPortType == null)
      _initDoHealthNewBusinessPortTypeProxy();
    return doHealthNewBusinessPortType;
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO performHealthNewBusiness(com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO FGUWPolicyVO) throws java.rmi.RemoteException{
    if (doHealthNewBusinessPortType == null)
      _initDoHealthNewBusinessPortTypeProxy();
    return doHealthNewBusinessPortType.performHealthNewBusiness(FGUWPolicyVO);
  }
  
  
}