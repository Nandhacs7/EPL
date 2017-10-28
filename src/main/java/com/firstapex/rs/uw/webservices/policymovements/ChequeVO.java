/**
 * ChequeVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.math.BigDecimal;

public class ChequeVO  implements java.io.Serializable {
	/* Mandatory=Y::ErrorMandatory=E_FICUW_WS_119::preDecimalPrecision=15::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_120 */
//    private java.math.BigDecimal IUWCHQ_CHQ_NO=new BigDecimal(0);

	private java.math.BigDecimal IUWCHQ_CHQ_NO;
    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_121::preDecimalPrecision=14::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_122 */
    private java.math.BigDecimal IUWCHQ_CHQ_AMT=new BigDecimal(0);

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_123 */
    private java.lang.String IUWCHQ_CHQ_ISSUE_DT;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_124::MaxLength=15::ErrorLength=E_FICUW_WS_125 */
    private java.lang.String IUWCHQ_BANK_AC_NO;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_126::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_018 */
    private java.lang.String IUWCHQ_ISSUING_BANK;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_127 */
    private java.lang.String IUWCHQ_BANK_BR_CD;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_128 */
    private java.lang.String IUWCHQ_PAY_TO;

    public ChequeVO() {
    }

    public ChequeVO(
    		java.math.BigDecimal IUWCHQ_CHQ_NO,
           java.math.BigDecimal IUWCHQ_CHQ_AMT,
           java.lang.String IUWCHQ_CHQ_ISSUE_DT,
           java.lang.String IUWCHQ_BANK_AC_NO,
           java.lang.String IUWCHQ_ISSUING_BANK,
           java.lang.String IUWCHQ_BANK_BR_CD,
           java.lang.String IUWCHQ_PAY_TO) {
           this.IUWCHQ_CHQ_NO = IUWCHQ_CHQ_NO;
           this.IUWCHQ_CHQ_AMT = IUWCHQ_CHQ_AMT;
           this.IUWCHQ_CHQ_ISSUE_DT = IUWCHQ_CHQ_ISSUE_DT;
           this.IUWCHQ_BANK_AC_NO = IUWCHQ_BANK_AC_NO;
           this.IUWCHQ_ISSUING_BANK = IUWCHQ_ISSUING_BANK;
           this.IUWCHQ_BANK_BR_CD = IUWCHQ_BANK_BR_CD;
           this.IUWCHQ_PAY_TO = IUWCHQ_PAY_TO;
    }


    /**
     * Gets the IUWCHQ_CHQ_NO value for this ChequeVO.
     * 
     * @return IUWCHQ_CHQ_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_119::preDecimalPrecision=15::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_120
     */
    public java.math.BigDecimal getIUWCHQ_CHQ_NO() {
        return IUWCHQ_CHQ_NO;
    }


    /**
     * Sets the IUWCHQ_CHQ_NO value for this ChequeVO.
     * 
     * @param IUWCHQ_CHQ_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_119::preDecimalPrecision=15::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_120
     */
    public void setIUWCHQ_CHQ_NO(java.math.BigDecimal IUWCHQ_CHQ_NO) {
        this.IUWCHQ_CHQ_NO = IUWCHQ_CHQ_NO;
    }


    /**
     * Gets the IUWCHQ_CHQ_AMT value for this ChequeVO.
     * 
     * @return IUWCHQ_CHQ_AMT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_121::preDecimalPrecision=14::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_122
     */
    public java.math.BigDecimal getIUWCHQ_CHQ_AMT() {
        return IUWCHQ_CHQ_AMT;
    }


    /**
     * Sets the IUWCHQ_CHQ_AMT value for this ChequeVO.
     * 
     * @param IUWCHQ_CHQ_AMT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_121::preDecimalPrecision=14::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_122
     */
    public void setIUWCHQ_CHQ_AMT(java.math.BigDecimal IUWCHQ_CHQ_AMT) {
        this.IUWCHQ_CHQ_AMT = IUWCHQ_CHQ_AMT;
    }


    /**
     * Gets the IUWCHQ_CHQ_ISSUE_DT value for this ChequeVO.
     * 
     * @return IUWCHQ_CHQ_ISSUE_DT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_123
     */
    public java.lang.String getIUWCHQ_CHQ_ISSUE_DT() {
        return IUWCHQ_CHQ_ISSUE_DT;
    }


    /**
     * Sets the IUWCHQ_CHQ_ISSUE_DT value for this ChequeVO.
     * 
     * @param IUWCHQ_CHQ_ISSUE_DT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_123
     */
    public void setIUWCHQ_CHQ_ISSUE_DT(java.lang.String IUWCHQ_CHQ_ISSUE_DT) {
        this.IUWCHQ_CHQ_ISSUE_DT = IUWCHQ_CHQ_ISSUE_DT;
    }


    /**
     * Gets the IUWCHQ_BANK_AC_NO value for this ChequeVO.
     * 
     * @return IUWCHQ_BANK_AC_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_124::MaxLength=15::ErrorLength=E_FICUW_WS_125
     */
    public java.lang.String getIUWCHQ_BANK_AC_NO() {
        return IUWCHQ_BANK_AC_NO;
    }


    /**
     * Sets the IUWCHQ_BANK_AC_NO value for this ChequeVO.
     * 
     * @param IUWCHQ_BANK_AC_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_124::MaxLength=15::ErrorLength=E_FICUW_WS_125
     */
    public void setIUWCHQ_BANK_AC_NO(java.lang.String IUWCHQ_BANK_AC_NO) {
        this.IUWCHQ_BANK_AC_NO = IUWCHQ_BANK_AC_NO;
    }


    /**
     * Gets the IUWCHQ_ISSUING_BANK value for this ChequeVO.
     * 
     * @return IUWCHQ_ISSUING_BANK   * MaxLength=8::ErrorLength=E_FICUW_WS_126::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_018
     */
    public java.lang.String getIUWCHQ_ISSUING_BANK() {
        return IUWCHQ_ISSUING_BANK;
    }


    /**
     * Sets the IUWCHQ_ISSUING_BANK value for this ChequeVO.
     * 
     * @param IUWCHQ_ISSUING_BANK   * MaxLength=8::ErrorLength=E_FICUW_WS_126::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_018
     */
    public void setIUWCHQ_ISSUING_BANK(java.lang.String IUWCHQ_ISSUING_BANK) {
        this.IUWCHQ_ISSUING_BANK = IUWCHQ_ISSUING_BANK;
    }


    /**
     * Gets the IUWCHQ_BANK_BR_CD value for this ChequeVO.
     * 
     * @return IUWCHQ_BANK_BR_CD   * MaxLength=30::ErrorLength=E_FICUW_WS_127
     */
    public java.lang.String getIUWCHQ_BANK_BR_CD() {
        return IUWCHQ_BANK_BR_CD;
    }


    /**
     * Sets the IUWCHQ_BANK_BR_CD value for this ChequeVO.
     * 
     * @param IUWCHQ_BANK_BR_CD   * MaxLength=30::ErrorLength=E_FICUW_WS_127
     */
    public void setIUWCHQ_BANK_BR_CD(java.lang.String IUWCHQ_BANK_BR_CD) {
        this.IUWCHQ_BANK_BR_CD = IUWCHQ_BANK_BR_CD;
    }


    /**
     * Gets the IUWCHQ_PAY_TO value for this ChequeVO.
     * 
     * @return IUWCHQ_PAY_TO   * MaxLength=30::ErrorLength=E_FICUW_WS_128
     */
    public java.lang.String getIUWCHQ_PAY_TO() {
        return IUWCHQ_PAY_TO;
    }


    /**
     * Sets the IUWCHQ_PAY_TO value for this ChequeVO.
     * 
     * @param IUWCHQ_PAY_TO   * MaxLength=30::ErrorLength=E_FICUW_WS_128
     */
    public void setIUWCHQ_PAY_TO(java.lang.String IUWCHQ_PAY_TO) {
        this.IUWCHQ_PAY_TO = IUWCHQ_PAY_TO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChequeVO)) return false;
        ChequeVO other = (ChequeVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWCHQ_CHQ_NO==null && other.getIUWCHQ_CHQ_NO()==null) || 
             (this.IUWCHQ_CHQ_NO!=null &&
              this.IUWCHQ_CHQ_NO.equals(other.getIUWCHQ_CHQ_NO()))) &&
            ((this.IUWCHQ_CHQ_AMT==null && other.getIUWCHQ_CHQ_AMT()==null) || 
             (this.IUWCHQ_CHQ_AMT!=null &&
              this.IUWCHQ_CHQ_AMT.equals(other.getIUWCHQ_CHQ_AMT()))) &&
            ((this.IUWCHQ_CHQ_ISSUE_DT==null && other.getIUWCHQ_CHQ_ISSUE_DT()==null) || 
             (this.IUWCHQ_CHQ_ISSUE_DT!=null &&
              this.IUWCHQ_CHQ_ISSUE_DT.equals(other.getIUWCHQ_CHQ_ISSUE_DT()))) &&
            ((this.IUWCHQ_BANK_AC_NO==null && other.getIUWCHQ_BANK_AC_NO()==null) || 
             (this.IUWCHQ_BANK_AC_NO!=null &&
              this.IUWCHQ_BANK_AC_NO.equals(other.getIUWCHQ_BANK_AC_NO()))) &&
            ((this.IUWCHQ_ISSUING_BANK==null && other.getIUWCHQ_ISSUING_BANK()==null) || 
             (this.IUWCHQ_ISSUING_BANK!=null &&
              this.IUWCHQ_ISSUING_BANK.equals(other.getIUWCHQ_ISSUING_BANK()))) &&
            ((this.IUWCHQ_BANK_BR_CD==null && other.getIUWCHQ_BANK_BR_CD()==null) || 
             (this.IUWCHQ_BANK_BR_CD!=null &&
              this.IUWCHQ_BANK_BR_CD.equals(other.getIUWCHQ_BANK_BR_CD()))) &&
            ((this.IUWCHQ_PAY_TO==null && other.getIUWCHQ_PAY_TO()==null) || 
             (this.IUWCHQ_PAY_TO!=null &&
              this.IUWCHQ_PAY_TO.equals(other.getIUWCHQ_PAY_TO())));
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
        if (getIUWCHQ_CHQ_NO() != null) {
            _hashCode += getIUWCHQ_CHQ_NO().hashCode();
        }
        if (getIUWCHQ_CHQ_AMT() != null) {
            _hashCode += getIUWCHQ_CHQ_AMT().hashCode();
        }
        if (getIUWCHQ_CHQ_ISSUE_DT() != null) {
            _hashCode += getIUWCHQ_CHQ_ISSUE_DT().hashCode();
        }
        if (getIUWCHQ_BANK_AC_NO() != null) {
            _hashCode += getIUWCHQ_BANK_AC_NO().hashCode();
        }
        if (getIUWCHQ_ISSUING_BANK() != null) {
            _hashCode += getIUWCHQ_ISSUING_BANK().hashCode();
        }
        if (getIUWCHQ_BANK_BR_CD() != null) {
            _hashCode += getIUWCHQ_BANK_BR_CD().hashCode();
        }
        if (getIUWCHQ_PAY_TO() != null) {
            _hashCode += getIUWCHQ_PAY_TO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChequeVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "chequeVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_CHQ_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_CHQ_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_CHQ_AMT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_CHQ_AMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_CHQ_ISSUE_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_CHQ_ISSUE_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_BANK_AC_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_BANK_AC_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_ISSUING_BANK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_ISSUING_BANK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_BANK_BR_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_BANK_BR_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCHQ_PAY_TO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCHQ_PAY_TO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
