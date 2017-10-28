/**
 * UwPaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class UwPaVO  implements java.io.Serializable {
    /* MaxLength=30::ErrorLength=E_FICUW_WS_088 */
    private java.lang.String firstName;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_089 */
    private java.lang.String lastName;

    /* MaxLength=255::ErrorLength=E_FICUW_WS_090 */
    private java.lang.String addrLine1;

    /* MaxLength=255::ErrorLength=E_FICUW_WS_091 */
    private java.lang.String addrLine2;

    /* MaxLength=255::ErrorLength=E_FICUW_WS_092 */
    private java.lang.String addrLine3;

    private java.lang.String DOB;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_093 */
    private java.lang.String sex;

    public UwPaVO() {
    }

    public UwPaVO(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String addrLine1,
           java.lang.String addrLine2,
           java.lang.String addrLine3,
           java.lang.String DOB,
           java.lang.String sex) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.addrLine1 = addrLine1;
           this.addrLine2 = addrLine2;
           this.addrLine3 = addrLine3;
           this.DOB = DOB;
           this.sex = sex;
    }


    /**
     * Gets the firstName value for this UwPaVO.
     * 
     * @return firstName   * MaxLength=30::ErrorLength=E_FICUW_WS_088
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UwPaVO.
     * 
     * @param firstName   * MaxLength=30::ErrorLength=E_FICUW_WS_088
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this UwPaVO.
     * 
     * @return lastName   * MaxLength=30::ErrorLength=E_FICUW_WS_089
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UwPaVO.
     * 
     * @param lastName   * MaxLength=30::ErrorLength=E_FICUW_WS_089
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the addrLine1 value for this UwPaVO.
     * 
     * @return addrLine1   * MaxLength=255::ErrorLength=E_FICUW_WS_090
     */
    public java.lang.String getAddrLine1() {
        return addrLine1;
    }


    /**
     * Sets the addrLine1 value for this UwPaVO.
     * 
     * @param addrLine1   * MaxLength=255::ErrorLength=E_FICUW_WS_090
     */
    public void setAddrLine1(java.lang.String addrLine1) {
        this.addrLine1 = addrLine1;
    }


    /**
     * Gets the addrLine2 value for this UwPaVO.
     * 
     * @return addrLine2   * MaxLength=255::ErrorLength=E_FICUW_WS_091
     */
    public java.lang.String getAddrLine2() {
        return addrLine2;
    }


    /**
     * Sets the addrLine2 value for this UwPaVO.
     * 
     * @param addrLine2   * MaxLength=255::ErrorLength=E_FICUW_WS_091
     */
    public void setAddrLine2(java.lang.String addrLine2) {
        this.addrLine2 = addrLine2;
    }


    /**
     * Gets the addrLine3 value for this UwPaVO.
     * 
     * @return addrLine3   * MaxLength=255::ErrorLength=E_FICUW_WS_092
     */
    public java.lang.String getAddrLine3() {
        return addrLine3;
    }


    /**
     * Sets the addrLine3 value for this UwPaVO.
     * 
     * @param addrLine3   * MaxLength=255::ErrorLength=E_FICUW_WS_092
     */
    public void setAddrLine3(java.lang.String addrLine3) {
        this.addrLine3 = addrLine3;
    }


    /**
     * Gets the DOB value for this UwPaVO.
     * 
     * @return DOB
     */
    public java.lang.String getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this UwPaVO.
     * 
     * @param DOB
     */
    public void setDOB(java.lang.String DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the sex value for this UwPaVO.
     * 
     * @return sex   * MaxLength=1::ErrorLength=E_FICUW_WS_093
     */
    public java.lang.String getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this UwPaVO.
     * 
     * @param sex   * MaxLength=1::ErrorLength=E_FICUW_WS_093
     */
    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UwPaVO)) return false;
        UwPaVO other = (UwPaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.addrLine1==null && other.getAddrLine1()==null) || 
             (this.addrLine1!=null &&
              this.addrLine1.equals(other.getAddrLine1()))) &&
            ((this.addrLine2==null && other.getAddrLine2()==null) || 
             (this.addrLine2!=null &&
              this.addrLine2.equals(other.getAddrLine2()))) &&
            ((this.addrLine3==null && other.getAddrLine3()==null) || 
             (this.addrLine3!=null &&
              this.addrLine3.equals(other.getAddrLine3()))) &&
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex())));
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getAddrLine1() != null) {
            _hashCode += getAddrLine1().hashCode();
        }
        if (getAddrLine2() != null) {
            _hashCode += getAddrLine2().hashCode();
        }
        if (getAddrLine3() != null) {
            _hashCode += getAddrLine3().hashCode();
        }
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UwPaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "uwPaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sex"));
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
