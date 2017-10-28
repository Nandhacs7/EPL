/**
 * UwBenfVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class UwBenfVO  implements java.io.Serializable {
    /* MaxLength=255::ErrorLength=E_FICUW_WS_094 */
    private java.lang.String addrLine1;

    /* MaxLength=255::ErrorLength=E_FICUW_WS_095 */
    private java.lang.String addrLine2;

    /* MaxLength=255::ErrorLength=E_FICUW_WS_096 */
    private java.lang.String addrLine3;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_097 */
    private java.lang.String firstName;

    public UwBenfVO() {
    }

    public UwBenfVO(
           java.lang.String addrLine1,
           java.lang.String addrLine2,
           java.lang.String addrLine3,
           java.lang.String firstName) {
           this.addrLine1 = addrLine1;
           this.addrLine2 = addrLine2;
           this.addrLine3 = addrLine3;
           this.firstName = firstName;
    }


    /**
     * Gets the addrLine1 value for this UwBenfVO.
     * 
     * @return addrLine1   * MaxLength=255::ErrorLength=E_FICUW_WS_094
     */
    public java.lang.String getAddrLine1() {
        return addrLine1;
    }


    /**
     * Sets the addrLine1 value for this UwBenfVO.
     * 
     * @param addrLine1   * MaxLength=255::ErrorLength=E_FICUW_WS_094
     */
    public void setAddrLine1(java.lang.String addrLine1) {
        this.addrLine1 = addrLine1;
    }


    /**
     * Gets the addrLine2 value for this UwBenfVO.
     * 
     * @return addrLine2   * MaxLength=255::ErrorLength=E_FICUW_WS_095
     */
    public java.lang.String getAddrLine2() {
        return addrLine2;
    }


    /**
     * Sets the addrLine2 value for this UwBenfVO.
     * 
     * @param addrLine2   * MaxLength=255::ErrorLength=E_FICUW_WS_095
     */
    public void setAddrLine2(java.lang.String addrLine2) {
        this.addrLine2 = addrLine2;
    }


    /**
     * Gets the addrLine3 value for this UwBenfVO.
     * 
     * @return addrLine3   * MaxLength=255::ErrorLength=E_FICUW_WS_096
     */
    public java.lang.String getAddrLine3() {
        return addrLine3;
    }


    /**
     * Sets the addrLine3 value for this UwBenfVO.
     * 
     * @param addrLine3   * MaxLength=255::ErrorLength=E_FICUW_WS_096
     */
    public void setAddrLine3(java.lang.String addrLine3) {
        this.addrLine3 = addrLine3;
    }


    /**
     * Gets the firstName value for this UwBenfVO.
     * 
     * @return firstName   * MaxLength=30::ErrorLength=E_FICUW_WS_097
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UwBenfVO.
     * 
     * @param firstName   * MaxLength=30::ErrorLength=E_FICUW_WS_097
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UwBenfVO)) return false;
        UwBenfVO other = (UwBenfVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addrLine1==null && other.getAddrLine1()==null) || 
             (this.addrLine1!=null &&
              this.addrLine1.equals(other.getAddrLine1()))) &&
            ((this.addrLine2==null && other.getAddrLine2()==null) || 
             (this.addrLine2!=null &&
              this.addrLine2.equals(other.getAddrLine2()))) &&
            ((this.addrLine3==null && other.getAddrLine3()==null) || 
             (this.addrLine3!=null &&
              this.addrLine3.equals(other.getAddrLine3()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName())));
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
        if (getAddrLine1() != null) {
            _hashCode += getAddrLine1().hashCode();
        }
        if (getAddrLine2() != null) {
            _hashCode += getAddrLine2().hashCode();
        }
        if (getAddrLine3() != null) {
            _hashCode += getAddrLine3().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UwBenfVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "uwBenfVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addrLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addrLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addrLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
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
