/**
 * RsPaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class RsPaVO  implements java.io.Serializable {
    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_077::MaxLength=8::ErrorLength=E_FICUW_WS_078 */
    private java.lang.String IUWP2_PA_CD;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_079 */
    private java.lang.String isNewInsured;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_080 */
    private java.lang.String isInsuredClient;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_197 */
    private java.lang.String isInsuredNominee;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_081 */
    private java.lang.String IUWP2_PA_BENFY_CD;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_082 */
    private java.lang.String isNewBenf;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_083 */
    private java.lang.String isBenfClient;

    /* MaxLength=5::ErrorLength=E_FICUW_WS_084 */
    private java.lang.String IUWP2_PA_ID_DTY;

    /* MaxLength=15::ErrorLength=E_FICUW_WS_085 */
    private java.lang.String IUWP2_PA_ID_DOCN;

    private java.lang.String IUWP2_PA_ID_CON;

    /* MaxLength=15::ErrorLength=E_FICUW_WS_086 */
    private java.lang.String IUWP2_PA_OCCUP_INS;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_087 */
    private java.lang.String IUWP2_PA_RELT_INS;

    private com.firstapex.rs.uw.webservices.policymovements.UwBenfVO uwBenfVO;

    private com.firstapex.rs.uw.webservices.policymovements.UwPaVO uwPaVO;

    public RsPaVO() {
    }

    public RsPaVO(
           java.lang.String IUWP2_PA_CD,
           java.lang.String isNewInsured,
           java.lang.String isInsuredClient,
           java.lang.String isInsuredNominee,
           java.lang.String IUWP2_PA_BENFY_CD,
           java.lang.String isNewBenf,
           java.lang.String isBenfClient,
           java.lang.String IUWP2_PA_ID_DTY,
           java.lang.String IUWP2_PA_ID_DOCN,
           java.lang.String IUWP2_PA_ID_CON,
           java.lang.String IUWP2_PA_OCCUP_INS,
           java.lang.String IUWP2_PA_RELT_INS,
           com.firstapex.rs.uw.webservices.policymovements.UwBenfVO uwBenfVO,
           com.firstapex.rs.uw.webservices.policymovements.UwPaVO uwPaVO) {
           this.IUWP2_PA_CD = IUWP2_PA_CD;
           this.isNewInsured = isNewInsured;
           this.isInsuredClient = isInsuredClient;
           this.isInsuredNominee = isInsuredNominee;
           this.IUWP2_PA_BENFY_CD = IUWP2_PA_BENFY_CD;
           this.isNewBenf = isNewBenf;
           this.isBenfClient = isBenfClient;
           this.IUWP2_PA_ID_DTY = IUWP2_PA_ID_DTY;
           this.IUWP2_PA_ID_DOCN = IUWP2_PA_ID_DOCN;
           this.IUWP2_PA_ID_CON = IUWP2_PA_ID_CON;
           this.IUWP2_PA_OCCUP_INS = IUWP2_PA_OCCUP_INS;
           this.IUWP2_PA_RELT_INS = IUWP2_PA_RELT_INS;
           this.uwBenfVO = uwBenfVO;
           this.uwPaVO = uwPaVO;
    }

    public UwBenfVO adduwBenfVO(){
    	UwBenfVO uwBenfVO = new UwBenfVO();
    	this.uwBenfVO = uwBenfVO;
    	return uwBenfVO;
    }
    public UwPaVO adduwPaVO(){
    	UwPaVO uwPaVO = new UwPaVO();
    	this.uwPaVO = uwPaVO;
    	return uwPaVO;
    }
    
    
    /**
     * Gets the IUWP2_PA_CD value for this RsPaVO.
     * 
     * @return IUWP2_PA_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_077::MaxLength=8::ErrorLength=E_FICUW_WS_078
     */
    public java.lang.String getIUWP2_PA_CD() {
        return IUWP2_PA_CD;
    }


    /**
     * Sets the IUWP2_PA_CD value for this RsPaVO.
     * 
     * @param IUWP2_PA_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_077::MaxLength=8::ErrorLength=E_FICUW_WS_078
     */
    public void setIUWP2_PA_CD(java.lang.String IUWP2_PA_CD) {
        this.IUWP2_PA_CD = IUWP2_PA_CD;
    }


    /**
     * Gets the isNewInsured value for this RsPaVO.
     * 
     * @return isNewInsured   * MaxLength=1::ErrorLength=E_FICUW_WS_079
     */
    public java.lang.String getIsNewInsured() {
        return isNewInsured;
    }


    /**
     * Sets the isNewInsured value for this RsPaVO.
     * 
     * @param isNewInsured   * MaxLength=1::ErrorLength=E_FICUW_WS_079
     */
    public void setIsNewInsured(java.lang.String isNewInsured) {
        this.isNewInsured = isNewInsured;
    }


    /**
     * Gets the isInsuredClient value for this RsPaVO.
     * 
     * @return isInsuredClient   * MaxLength=1::ErrorLength=E_FICUW_WS_080
     */
    public java.lang.String getIsInsuredClient() {
        return isInsuredClient;
    }


    /**
     * Sets the isInsuredClient value for this RsPaVO.
     * 
     * @param isInsuredClient   * MaxLength=1::ErrorLength=E_FICUW_WS_080
     */
    public void setIsInsuredClient(java.lang.String isInsuredClient) {
        this.isInsuredClient = isInsuredClient;
    }


    /**
     * Gets the isInsuredNominee value for this RsPaVO.
     * 
     * @return isInsuredNominee   * MaxLength=1::ErrorLength=E_FICUW_WS_197
     */
    public java.lang.String getIsInsuredNominee() {
        return isInsuredNominee;
    }


    /**
     * Sets the isInsuredNominee value for this RsPaVO.
     * 
     * @param isInsuredNominee   * MaxLength=1::ErrorLength=E_FICUW_WS_197
     */
    public void setIsInsuredNominee(java.lang.String isInsuredNominee) {
        this.isInsuredNominee = isInsuredNominee;
    }


    /**
     * Gets the IUWP2_PA_BENFY_CD value for this RsPaVO.
     * 
     * @return IUWP2_PA_BENFY_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_081
     */
    public java.lang.String getIUWP2_PA_BENFY_CD() {
        return IUWP2_PA_BENFY_CD;
    }


    /**
     * Sets the IUWP2_PA_BENFY_CD value for this RsPaVO.
     * 
     * @param IUWP2_PA_BENFY_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_081
     */
    public void setIUWP2_PA_BENFY_CD(java.lang.String IUWP2_PA_BENFY_CD) {
        this.IUWP2_PA_BENFY_CD = IUWP2_PA_BENFY_CD;
    }


    /**
     * Gets the isNewBenf value for this RsPaVO.
     * 
     * @return isNewBenf   * MaxLength=1::ErrorLength=E_FICUW_WS_082
     */
    public java.lang.String getIsNewBenf() {
        return isNewBenf;
    }


    /**
     * Sets the isNewBenf value for this RsPaVO.
     * 
     * @param isNewBenf   * MaxLength=1::ErrorLength=E_FICUW_WS_082
     */
    public void setIsNewBenf(java.lang.String isNewBenf) {
        this.isNewBenf = isNewBenf;
    }


    /**
     * Gets the isBenfClient value for this RsPaVO.
     * 
     * @return isBenfClient   * MaxLength=1::ErrorLength=E_FICUW_WS_083
     */
    public java.lang.String getIsBenfClient() {
        return isBenfClient;
    }


    /**
     * Sets the isBenfClient value for this RsPaVO.
     * 
     * @param isBenfClient   * MaxLength=1::ErrorLength=E_FICUW_WS_083
     */
    public void setIsBenfClient(java.lang.String isBenfClient) {
        this.isBenfClient = isBenfClient;
    }


    /**
     * Gets the IUWP2_PA_ID_DTY value for this RsPaVO.
     * 
     * @return IUWP2_PA_ID_DTY   * MaxLength=5::ErrorLength=E_FICUW_WS_084
     */
    public java.lang.String getIUWP2_PA_ID_DTY() {
        return IUWP2_PA_ID_DTY;
    }


    /**
     * Sets the IUWP2_PA_ID_DTY value for this RsPaVO.
     * 
     * @param IUWP2_PA_ID_DTY   * MaxLength=5::ErrorLength=E_FICUW_WS_084
     */
    public void setIUWP2_PA_ID_DTY(java.lang.String IUWP2_PA_ID_DTY) {
        this.IUWP2_PA_ID_DTY = IUWP2_PA_ID_DTY;
    }


    /**
     * Gets the IUWP2_PA_ID_DOCN value for this RsPaVO.
     * 
     * @return IUWP2_PA_ID_DOCN   * MaxLength=15::ErrorLength=E_FICUW_WS_085
     */
    public java.lang.String getIUWP2_PA_ID_DOCN() {
        return IUWP2_PA_ID_DOCN;
    }


    /**
     * Sets the IUWP2_PA_ID_DOCN value for this RsPaVO.
     * 
     * @param IUWP2_PA_ID_DOCN   * MaxLength=15::ErrorLength=E_FICUW_WS_085
     */
    public void setIUWP2_PA_ID_DOCN(java.lang.String IUWP2_PA_ID_DOCN) {
        this.IUWP2_PA_ID_DOCN = IUWP2_PA_ID_DOCN;
    }


    /**
     * Gets the IUWP2_PA_ID_CON value for this RsPaVO.
     * 
     * @return IUWP2_PA_ID_CON
     */
    public java.lang.String getIUWP2_PA_ID_CON() {
        return IUWP2_PA_ID_CON;
    }


    /**
     * Sets the IUWP2_PA_ID_CON value for this RsPaVO.
     * 
     * @param IUWP2_PA_ID_CON
     */
    public void setIUWP2_PA_ID_CON(java.lang.String IUWP2_PA_ID_CON) {
        this.IUWP2_PA_ID_CON = IUWP2_PA_ID_CON;
    }


    /**
     * Gets the IUWP2_PA_OCCUP_INS value for this RsPaVO.
     * 
     * @return IUWP2_PA_OCCUP_INS   * MaxLength=15::ErrorLength=E_FICUW_WS_086
     */
    public java.lang.String getIUWP2_PA_OCCUP_INS() {
        return IUWP2_PA_OCCUP_INS;
    }


    /**
     * Sets the IUWP2_PA_OCCUP_INS value for this RsPaVO.
     * 
     * @param IUWP2_PA_OCCUP_INS   * MaxLength=15::ErrorLength=E_FICUW_WS_086
     */
    public void setIUWP2_PA_OCCUP_INS(java.lang.String IUWP2_PA_OCCUP_INS) {
        this.IUWP2_PA_OCCUP_INS = IUWP2_PA_OCCUP_INS;
    }


    /**
     * Gets the IUWP2_PA_RELT_INS value for this RsPaVO.
     * 
     * @return IUWP2_PA_RELT_INS   * MaxLength=40::ErrorLength=E_FICUW_WS_087
     */
    public java.lang.String getIUWP2_PA_RELT_INS() {
        return IUWP2_PA_RELT_INS;
    }


    /**
     * Sets the IUWP2_PA_RELT_INS value for this RsPaVO.
     * 
     * @param IUWP2_PA_RELT_INS   * MaxLength=40::ErrorLength=E_FICUW_WS_087
     */
    public void setIUWP2_PA_RELT_INS(java.lang.String IUWP2_PA_RELT_INS) {
        this.IUWP2_PA_RELT_INS = IUWP2_PA_RELT_INS;
    }


    /**
     * Gets the uwBenfVO value for this RsPaVO.
     * 
     * @return uwBenfVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.UwBenfVO getUwBenfVO() {
        return uwBenfVO;
    }


    /**
     * Sets the uwBenfVO value for this RsPaVO.
     * 
     * @param uwBenfVO
     */
    public void setUwBenfVO(com.firstapex.rs.uw.webservices.policymovements.UwBenfVO uwBenfVO) {
        this.uwBenfVO = uwBenfVO;
    }


    /**
     * Gets the uwPaVO value for this RsPaVO.
     * 
     * @return uwPaVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.UwPaVO getUwPaVO() {
        return uwPaVO;
    }


    /**
     * Sets the uwPaVO value for this RsPaVO.
     * 
     * @param uwPaVO
     */
    public void setUwPaVO(com.firstapex.rs.uw.webservices.policymovements.UwPaVO uwPaVO) {
        this.uwPaVO = uwPaVO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RsPaVO)) return false;
        RsPaVO other = (RsPaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP2_PA_CD==null && other.getIUWP2_PA_CD()==null) || 
             (this.IUWP2_PA_CD!=null &&
              this.IUWP2_PA_CD.equals(other.getIUWP2_PA_CD()))) &&
            ((this.isNewInsured==null && other.getIsNewInsured()==null) || 
             (this.isNewInsured!=null &&
              this.isNewInsured.equals(other.getIsNewInsured()))) &&
            ((this.isInsuredClient==null && other.getIsInsuredClient()==null) || 
             (this.isInsuredClient!=null &&
              this.isInsuredClient.equals(other.getIsInsuredClient()))) &&
            ((this.isInsuredNominee==null && other.getIsInsuredNominee()==null) || 
             (this.isInsuredNominee!=null &&
              this.isInsuredNominee.equals(other.getIsInsuredNominee()))) &&
            ((this.IUWP2_PA_BENFY_CD==null && other.getIUWP2_PA_BENFY_CD()==null) || 
             (this.IUWP2_PA_BENFY_CD!=null &&
              this.IUWP2_PA_BENFY_CD.equals(other.getIUWP2_PA_BENFY_CD()))) &&
            ((this.isNewBenf==null && other.getIsNewBenf()==null) || 
             (this.isNewBenf!=null &&
              this.isNewBenf.equals(other.getIsNewBenf()))) &&
            ((this.isBenfClient==null && other.getIsBenfClient()==null) || 
             (this.isBenfClient!=null &&
              this.isBenfClient.equals(other.getIsBenfClient()))) &&
            ((this.IUWP2_PA_ID_DTY==null && other.getIUWP2_PA_ID_DTY()==null) || 
             (this.IUWP2_PA_ID_DTY!=null &&
              this.IUWP2_PA_ID_DTY.equals(other.getIUWP2_PA_ID_DTY()))) &&
            ((this.IUWP2_PA_ID_DOCN==null && other.getIUWP2_PA_ID_DOCN()==null) || 
             (this.IUWP2_PA_ID_DOCN!=null &&
              this.IUWP2_PA_ID_DOCN.equals(other.getIUWP2_PA_ID_DOCN()))) &&
            ((this.IUWP2_PA_ID_CON==null && other.getIUWP2_PA_ID_CON()==null) || 
             (this.IUWP2_PA_ID_CON!=null &&
              this.IUWP2_PA_ID_CON.equals(other.getIUWP2_PA_ID_CON()))) &&
            ((this.IUWP2_PA_OCCUP_INS==null && other.getIUWP2_PA_OCCUP_INS()==null) || 
             (this.IUWP2_PA_OCCUP_INS!=null &&
              this.IUWP2_PA_OCCUP_INS.equals(other.getIUWP2_PA_OCCUP_INS()))) &&
            ((this.IUWP2_PA_RELT_INS==null && other.getIUWP2_PA_RELT_INS()==null) || 
             (this.IUWP2_PA_RELT_INS!=null &&
              this.IUWP2_PA_RELT_INS.equals(other.getIUWP2_PA_RELT_INS()))) &&
            ((this.uwBenfVO==null && other.getUwBenfVO()==null) || 
             (this.uwBenfVO!=null &&
              this.uwBenfVO.equals(other.getUwBenfVO()))) &&
            ((this.uwPaVO==null && other.getUwPaVO()==null) || 
             (this.uwPaVO!=null &&
              this.uwPaVO.equals(other.getUwPaVO())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIUWP2_PA_CD() != null) {
            _hashCode += getIUWP2_PA_CD().hashCode();
        }
        if (getIsNewInsured() != null) {
            _hashCode += getIsNewInsured().hashCode();
        }
        if (getIsInsuredClient() != null) {
            _hashCode += getIsInsuredClient().hashCode();
        }
        if (getIsInsuredNominee() != null) {
            _hashCode += getIsInsuredNominee().hashCode();
        }
        if (getIUWP2_PA_BENFY_CD() != null) {
            _hashCode += getIUWP2_PA_BENFY_CD().hashCode();
        }
        if (getIsNewBenf() != null) {
            _hashCode += getIsNewBenf().hashCode();
        }
        if (getIsBenfClient() != null) {
            _hashCode += getIsBenfClient().hashCode();
        }
        if (getIUWP2_PA_ID_DTY() != null) {
            _hashCode += getIUWP2_PA_ID_DTY().hashCode();
        }
        if (getIUWP2_PA_ID_DOCN() != null) {
            _hashCode += getIUWP2_PA_ID_DOCN().hashCode();
        }
        if (getIUWP2_PA_ID_CON() != null) {
            _hashCode += getIUWP2_PA_ID_CON().hashCode();
        }
        if (getIUWP2_PA_OCCUP_INS() != null) {
            _hashCode += getIUWP2_PA_OCCUP_INS().hashCode();
        }
        if (getIUWP2_PA_RELT_INS() != null) {
            _hashCode += getIUWP2_PA_RELT_INS().hashCode();
        }
        if (getUwBenfVO() != null) {
            _hashCode += getUwBenfVO().hashCode();
        }
        if (getUwPaVO() != null) {
            _hashCode += getUwPaVO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RsPaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "rsPaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewInsured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNewInsured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInsuredClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isInsuredClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInsuredNominee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isInsuredNominee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_BENFY_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_BENFY_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewBenf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNewBenf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBenfClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBenfClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_ID_DTY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_ID_DTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_ID_DOCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_ID_DOCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_ID_CON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_ID_CON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_OCCUP_INS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_OCCUP_INS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_PA_RELT_INS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_PA_RELT_INS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uwBenfVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uwBenfVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "uwBenfVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uwPaVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uwPaVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "uwPaVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
