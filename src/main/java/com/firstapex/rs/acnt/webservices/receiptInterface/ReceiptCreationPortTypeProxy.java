package com.firstapex.rs.acnt.webservices.receiptInterface;

public class ReceiptCreationPortTypeProxy implements com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType {
  private String _endpoint = null;
  private com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType receiptCreationPortType = null;
  
  public ReceiptCreationPortTypeProxy() {
    _initReceiptCreationPortTypeProxy();
  }
  
  public ReceiptCreationPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initReceiptCreationPortTypeProxy();
  }
  
  private void _initReceiptCreationPortTypeProxy() {
    try {
      receiptCreationPortType = (new com.firstapex.rs.acnt.webservices.receiptInterface.FirstGenReceiptCreationServiceLocator()).getReceiptCreationSoapBinding();
      if (receiptCreationPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)receiptCreationPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)receiptCreationPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (receiptCreationPortType != null)
      ((javax.xml.rpc.Stub)receiptCreationPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.firstapex.rs.acnt.webservices.receiptInterface.ReceiptCreationPortType getReceiptCreationPortType() {
    if (receiptCreationPortType == null)
      _initReceiptCreationPortTypeProxy();
    return receiptCreationPortType;
  }
  
  public com.firstapex.rs.acnt.webservices.receiptInterface.FgResponseVO performReceiptCreation(com.firstapex.rs.acnt.webservices.receiptInterface.FgReceiptVO fgReceiptVO) throws java.rmi.RemoteException{
    if (receiptCreationPortType == null)
      _initReceiptCreationPortTypeProxy();
    return receiptCreationPortType.performReceiptCreation(fgReceiptVO);
  }
  
  
}