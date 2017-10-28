package com.firstapex.rs.uw.webservices.policymovements;

public class DoMotorNewBusinessPortTypeProxy implements com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType {
  
	
	private String _endpoint = null;
	private String trans = null;
  private com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType doMotorNewBusinessPortType = null;
  
  public DoMotorNewBusinessPortTypeProxy(String Transcationtype) {
	  this.trans=Transcationtype;
    _initDoMotorNewBusinessPortTypeProxy();
  }
  
  public DoMotorNewBusinessPortTypeProxy(String endpoint,String name) {
    _endpoint = endpoint;
    _initDoMotorNewBusinessPortTypeProxy();
  }
  
  private void _initDoMotorNewBusinessPortTypeProxy() {
    try {
      doMotorNewBusinessPortType = (new com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessLocator(trans)).getdoMotorNewBusinessSoapBinding();
      if (doMotorNewBusinessPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)doMotorNewBusinessPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)doMotorNewBusinessPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (doMotorNewBusinessPortType != null)
      ((javax.xml.rpc.Stub)doMotorNewBusinessPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType getDoMotorNewBusinessPortType() {
    if (doMotorNewBusinessPortType == null)
      _initDoMotorNewBusinessPortTypeProxy();
    return doMotorNewBusinessPortType;
  }
  
  public com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO performMotorNewBusiness(com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO FGUWPolicyVO) throws java.rmi.RemoteException{
    if (doMotorNewBusinessPortType == null)
      _initDoMotorNewBusinessPortTypeProxy();
    return doMotorNewBusinessPortType.performMotorNewBusiness(FGUWPolicyVO);
  }
  
  
}