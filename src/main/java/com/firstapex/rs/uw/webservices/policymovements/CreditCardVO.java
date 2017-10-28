/**
 * CreditCardVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class CreditCardVO  implements java.io.Serializable {
    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_163::MaxLength=30::ErrorLength=E_FICUW_WS_116 */
    private java.lang.String IUWCR_CARD_NUM;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_164::MaxLength=8::ErrorLength=E_FICUW_WS_117::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_018 */
    private java.lang.String IUWCR_CARD_ISSUER;

    /* MaxLength=20::ErrorLength=E_FICUW_WS_118 */
    private java.lang.String IUWCR_AUTH_NUM;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_165 */
    private java.lang.String IUWCR_CARD_EXP_DT;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_129 */
    private java.lang.String IUWCR_CARD_VER_TEXT;

    public CreditCardVO() {
    }

    public CreditCardVO(
           java.lang.String IUWCR_CARD_NUM,
           java.lang.String IUWCR_CARD_ISSUER,
           java.lang.String IUWCR_AUTH_NUM,
           java.lang.String IUWCR_CARD_EXP_DT,
           java.lang.String IUWCR_CARD_VER_TEXT) {
           this.IUWCR_CARD_NUM = IUWCR_CARD_NUM;
           this.IUWCR_CARD_ISSUER = IUWCR_CARD_ISSUER;
           this.IUWCR_AUTH_NUM = IUWCR_AUTH_NUM;
           this.IUWCR_CARD_EXP_DT = IUWCR_CARD_EXP_DT;
           this.IUWCR_CARD_VER_TEXT = IUWCR_CARD_VER_TEXT;
    }


    /**
     * Gets the IUWCR_CARD_NUM value for this CreditCardVO.
     * 
     * @return IUWCR_CARD_NUM   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_163::MaxLength=30::ErrorLength=E_FICUW_WS_116
     */
    public java.lang.String getIUWCR_CARD_NUM() {
        return IUWCR_CARD_NUM;
    }


    /**
     * Sets the IUWCR_CARD_NUM value for this CreditCardVO.
     * 
     * @param IUWCR_CARD_NUM   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_163::MaxLength=30::ErrorLength=E_FICUW_WS_116
     */
    public void setIUWCR_CARD_NUM(java.lang.String IUWCR_CARD_NUM) {
        this.IUWCR_CARD_NUM = IUWCR_CARD_NUM;
    }


    /**
     * Gets the IUWCR_CARD_ISSUER value for this CreditCardVO.
     * 
     * @return IUWCR_CARD_ISSUER   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_164::MaxLength=8::ErrorLength=E_FICUW_WS_117::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_018
     */
    public java.lang.String getIUWCR_CARD_ISSUER() {
        return IUWCR_CARD_ISSUER;
    }


    /**
     * Sets the IUWCR_CARD_ISSUER value for this CreditCardVO.
     * 
     * @param IUWCR_CARD_ISSUER   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_164::MaxLength=8::ErrorLength=E_FICUW_WS_117::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_018
     */
    public void setIUWCR_CARD_ISSUER(java.lang.String IUWCR_CARD_ISSUER) {
        this.IUWCR_CARD_ISSUER = IUWCR_CARD_ISSUER;
    }


    /**
     * Gets the IUWCR_AUTH_NUM value for this CreditCardVO.
     * 
     * @return IUWCR_AUTH_NUM   * MaxLength=20::ErrorLength=E_FICUW_WS_118
     */
    public java.lang.String getIUWCR_AUTH_NUM() {
        return IUWCR_AUTH_NUM;
    }


    /**
     * Sets the IUWCR_AUTH_NUM value for this CreditCardVO.
     * 
     * @param IUWCR_AUTH_NUM   * MaxLength=20::ErrorLength=E_FICUW_WS_118
     */
    public void setIUWCR_AUTH_NUM(java.lang.String IUWCR_AUTH_NUM) {
        this.IUWCR_AUTH_NUM = IUWCR_AUTH_NUM;
    }


    /**
     * Gets the IUWCR_CARD_EXP_DT value for this CreditCardVO.
     * 
     * @return IUWCR_CARD_EXP_DT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_165
     */
    public java.lang.String getIUWCR_CARD_EXP_DT() {
        return IUWCR_CARD_EXP_DT;
    }


    /**
     * Sets the IUWCR_CARD_EXP_DT value for this CreditCardVO.
     * 
     * @param IUWCR_CARD_EXP_DT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_165
     */
    public void setIUWCR_CARD_EXP_DT(java.lang.String IUWCR_CARD_EXP_DT) {
        this.IUWCR_CARD_EXP_DT = IUWCR_CARD_EXP_DT;
    }


    /**
     * Gets the IUWCR_CARD_VER_TEXT value for this CreditCardVO.
     * 
     * @return IUWCR_CARD_VER_TEXT   * MaxLength=30::ErrorLength=E_FICUW_WS_129
     */
    public java.lang.String getIUWCR_CARD_VER_TEXT() {
        return IUWCR_CARD_VER_TEXT;
    }


    /**
     * Sets the IUWCR_CARD_VER_TEXT value for this CreditCardVO.
     * 
     * @param IUWCR_CARD_VER_TEXT   * MaxLength=30::ErrorLength=E_FICUW_WS_129
     */
    public void setIUWCR_CARD_VER_TEXT(java.lang.String IUWCR_CARD_VER_TEXT) {
        this.IUWCR_CARD_VER_TEXT = IUWCR_CARD_VER_TEXT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditCardVO)) return false;
        CreditCardVO other = (CreditCardVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWCR_CARD_NUM==null && other.getIUWCR_CARD_NUM()==null) || 
             (this.IUWCR_CARD_NUM!=null &&
              this.IUWCR_CARD_NUM.equals(other.getIUWCR_CARD_NUM()))) &&
            ((this.IUWCR_CARD_ISSUER==null && other.getIUWCR_CARD_ISSUER()==null) || 
             (this.IUWCR_CARD_ISSUER!=null &&
              this.IUWCR_CARD_ISSUER.equals(other.getIUWCR_CARD_ISSUER()))) &&
            ((this.IUWCR_AUTH_NUM==null && other.getIUWCR_AUTH_NUM()==null) || 
             (this.IUWCR_AUTH_NUM!=null &&
              this.IUWCR_AUTH_NUM.equals(other.getIUWCR_AUTH_NUM()))) &&
            ((this.IUWCR_CARD_EXP_DT==null && other.getIUWCR_CARD_EXP_DT()==null) || 
             (this.IUWCR_CARD_EXP_DT!=null &&
              this.IUWCR_CARD_EXP_DT.equals(other.getIUWCR_CARD_EXP_DT()))) &&
            ((this.IUWCR_CARD_VER_TEXT==null && other.getIUWCR_CARD_VER_TEXT()==null) || 
             (this.IUWCR_CARD_VER_TEXT!=null &&
              this.IUWCR_CARD_VER_TEXT.equals(other.getIUWCR_CARD_VER_TEXT())));
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
        if (getIUWCR_CARD_NUM() != null) {
            _hashCode += getIUWCR_CARD_NUM().hashCode();
        }
        if (getIUWCR_CARD_ISSUER() != null) {
            _hashCode += getIUWCR_CARD_ISSUER().hashCode();
        }
        if (getIUWCR_AUTH_NUM() != null) {
            _hashCode += getIUWCR_AUTH_NUM().hashCode();
        }
        if (getIUWCR_CARD_EXP_DT() != null) {
            _hashCode += getIUWCR_CARD_EXP_DT().hashCode();
        }
        if (getIUWCR_CARD_VER_TEXT() != null) {
            _hashCode += getIUWCR_CARD_VER_TEXT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditCardVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "creditCardVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCR_CARD_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCR_CARD_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCR_CARD_ISSUER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCR_CARD_ISSUER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCR_AUTH_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCR_AUTH_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCR_CARD_EXP_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCR_CARD_EXP_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWCR_CARD_VER_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWCR_CARD_VER_TEXT"));
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
