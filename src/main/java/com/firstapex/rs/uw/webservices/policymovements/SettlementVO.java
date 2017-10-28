/**
 * SettlementVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class SettlementVO  implements java.io.Serializable {
    /* MaxLength=12::ErrorLength=E_FICUW_WS_102 */
    private java.lang.String IUWP1_STL_TYPE;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_103 */
    private java.lang.String IUWP1_ACC_CD;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_104 */
    private java.lang.String IUWP1_STL_SRC;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_105 */
    private java.lang.String IUWP1_STL_REF;

    public SettlementVO() {
    }

    public SettlementVO(
           java.lang.String IUWP1_STL_TYPE,
           java.lang.String IUWP1_ACC_CD,
           java.lang.String IUWP1_STL_SRC,
           java.lang.String IUWP1_STL_REF) {
           this.IUWP1_STL_TYPE = IUWP1_STL_TYPE;
           this.IUWP1_ACC_CD = IUWP1_ACC_CD;
           this.IUWP1_STL_SRC = IUWP1_STL_SRC;
           this.IUWP1_STL_REF = IUWP1_STL_REF;
    }


    /**
     * Gets the IUWP1_STL_TYPE value for this SettlementVO.
     * 
     * @return IUWP1_STL_TYPE   * MaxLength=12::ErrorLength=E_FICUW_WS_102
     */
    public java.lang.String getIUWP1_STL_TYPE() {
        return IUWP1_STL_TYPE;
    }


    /**
     * Sets the IUWP1_STL_TYPE value for this SettlementVO.
     * 
     * @param IUWP1_STL_TYPE   * MaxLength=12::ErrorLength=E_FICUW_WS_102
     */
    public void setIUWP1_STL_TYPE(java.lang.String IUWP1_STL_TYPE) {
        this.IUWP1_STL_TYPE = IUWP1_STL_TYPE;
    }


    /**
     * Gets the IUWP1_ACC_CD value for this SettlementVO.
     * 
     * @return IUWP1_ACC_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_103
     */
    public java.lang.String getIUWP1_ACC_CD() {
        return IUWP1_ACC_CD;
    }


    /**
     * Sets the IUWP1_ACC_CD value for this SettlementVO.
     * 
     * @param IUWP1_ACC_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_103
     */
    public void setIUWP1_ACC_CD(java.lang.String IUWP1_ACC_CD) {
        this.IUWP1_ACC_CD = IUWP1_ACC_CD;
    }


    /**
     * Gets the IUWP1_STL_SRC value for this SettlementVO.
     * 
     * @return IUWP1_STL_SRC   * MaxLength=4::ErrorLength=E_FICUW_WS_104
     */
    public java.lang.String getIUWP1_STL_SRC() {
        return IUWP1_STL_SRC;
    }


    /**
     * Sets the IUWP1_STL_SRC value for this SettlementVO.
     * 
     * @param IUWP1_STL_SRC   * MaxLength=4::ErrorLength=E_FICUW_WS_104
     */
    public void setIUWP1_STL_SRC(java.lang.String IUWP1_STL_SRC) {
        this.IUWP1_STL_SRC = IUWP1_STL_SRC;
    }


    /**
     * Gets the IUWP1_STL_REF value for this SettlementVO.
     * 
     * @return IUWP1_STL_REF   * MaxLength=30::ErrorLength=E_FICUW_WS_105
     */
    public java.lang.String getIUWP1_STL_REF() {
        return IUWP1_STL_REF;
    }


    /**
     * Sets the IUWP1_STL_REF value for this SettlementVO.
     * 
     * @param IUWP1_STL_REF   * MaxLength=30::ErrorLength=E_FICUW_WS_105
     */
    public void setIUWP1_STL_REF(java.lang.String IUWP1_STL_REF) {
        this.IUWP1_STL_REF = IUWP1_STL_REF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SettlementVO)) return false;
        SettlementVO other = (SettlementVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP1_STL_TYPE==null && other.getIUWP1_STL_TYPE()==null) || 
             (this.IUWP1_STL_TYPE!=null &&
              this.IUWP1_STL_TYPE.equals(other.getIUWP1_STL_TYPE()))) &&
            ((this.IUWP1_ACC_CD==null && other.getIUWP1_ACC_CD()==null) || 
             (this.IUWP1_ACC_CD!=null &&
              this.IUWP1_ACC_CD.equals(other.getIUWP1_ACC_CD()))) &&
            ((this.IUWP1_STL_SRC==null && other.getIUWP1_STL_SRC()==null) || 
             (this.IUWP1_STL_SRC!=null &&
              this.IUWP1_STL_SRC.equals(other.getIUWP1_STL_SRC()))) &&
            ((this.IUWP1_STL_REF==null && other.getIUWP1_STL_REF()==null) || 
             (this.IUWP1_STL_REF!=null &&
              this.IUWP1_STL_REF.equals(other.getIUWP1_STL_REF())));
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
        if (getIUWP1_STL_TYPE() != null) {
            _hashCode += getIUWP1_STL_TYPE().hashCode();
        }
        if (getIUWP1_ACC_CD() != null) {
            _hashCode += getIUWP1_ACC_CD().hashCode();
        }
        if (getIUWP1_STL_SRC() != null) {
            _hashCode += getIUWP1_STL_SRC().hashCode();
        }
        if (getIUWP1_STL_REF() != null) {
            _hashCode += getIUWP1_STL_REF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SettlementVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "settlementVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_STL_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_STL_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ACC_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ACC_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_STL_SRC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_STL_SRC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_STL_REF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_STL_REF"));
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
