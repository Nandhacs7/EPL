/**
 * OldPolicyVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class OldPolicyVO  implements java.io.Serializable {
    /* MaxLength=8::ErrorLength=E_FICUW_WS_161 */
    private java.lang.String IUWP2_OLD_INS_CD;

    private java.lang.String IUWP2_OLD_EXP_DT;

    public OldPolicyVO() {
    }

    public OldPolicyVO(
           java.lang.String IUWP2_OLD_INS_CD,
           java.lang.String IUWP2_OLD_EXP_DT) {
           this.IUWP2_OLD_INS_CD = IUWP2_OLD_INS_CD;
           this.IUWP2_OLD_EXP_DT = IUWP2_OLD_EXP_DT;
    }


    /**
     * Gets the IUWP2_OLD_INS_CD value for this OldPolicyVO.
     * 
     * @return IUWP2_OLD_INS_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_161
     */
    public java.lang.String getIUWP2_OLD_INS_CD() {
        return IUWP2_OLD_INS_CD;
    }


    /**
     * Sets the IUWP2_OLD_INS_CD value for this OldPolicyVO.
     * 
     * @param IUWP2_OLD_INS_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_161
     */
    public void setIUWP2_OLD_INS_CD(java.lang.String IUWP2_OLD_INS_CD) {
        this.IUWP2_OLD_INS_CD = IUWP2_OLD_INS_CD;
    }


    /**
     * Gets the IUWP2_OLD_EXP_DT value for this OldPolicyVO.
     * 
     * @return IUWP2_OLD_EXP_DT
     */
    public java.lang.String getIUWP2_OLD_EXP_DT() {
        return IUWP2_OLD_EXP_DT;
    }


    /**
     * Sets the IUWP2_OLD_EXP_DT value for this OldPolicyVO.
     * 
     * @param IUWP2_OLD_EXP_DT
     */
    public void setIUWP2_OLD_EXP_DT(java.lang.String IUWP2_OLD_EXP_DT) {
        this.IUWP2_OLD_EXP_DT = IUWP2_OLD_EXP_DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OldPolicyVO)) return false;
        OldPolicyVO other = (OldPolicyVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP2_OLD_INS_CD==null && other.getIUWP2_OLD_INS_CD()==null) || 
             (this.IUWP2_OLD_INS_CD!=null &&
              this.IUWP2_OLD_INS_CD.equals(other.getIUWP2_OLD_INS_CD()))) &&
            ((this.IUWP2_OLD_EXP_DT==null && other.getIUWP2_OLD_EXP_DT()==null) || 
             (this.IUWP2_OLD_EXP_DT!=null &&
              this.IUWP2_OLD_EXP_DT.equals(other.getIUWP2_OLD_EXP_DT())));
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
        if (getIUWP2_OLD_INS_CD() != null) {
            _hashCode += getIUWP2_OLD_INS_CD().hashCode();
        }
        if (getIUWP2_OLD_EXP_DT() != null) {
            _hashCode += getIUWP2_OLD_EXP_DT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OldPolicyVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "oldPolicyVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_OLD_INS_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_OLD_INS_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_OLD_EXP_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_OLD_EXP_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
