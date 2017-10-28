/**
 * FgResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
//@XmlSeeAlso()
public class FgResponseVO  implements java.io.Serializable {
    private java.lang.String voucherNumber;

    private java.lang.String status;

    private java.lang.String XSD_AUX_NC;

    private java.lang.String openingBalance;

    private java.lang.String closingBalance;

    private com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO[] errorDetailVOList;

    public FgResponseVO() {
    }

    public FgResponseVO(
           java.lang.String voucherNumber,
           java.lang.String status,
           java.lang.String XSD_AUX_NC,
           java.lang.String openingBalance,
           java.lang.String closingBalance,
           com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO[] errorDetailVOList) {
           this.voucherNumber = voucherNumber;
           this.status = status;
           this.XSD_AUX_NC = XSD_AUX_NC;
           this.openingBalance = openingBalance;
           this.closingBalance = closingBalance;
           this.errorDetailVOList = errorDetailVOList;
    }


    /**
     * Gets the voucherNumber value for this FgResponseVO.
     * 
     * @return voucherNumber
     */
    public java.lang.String getVoucherNumber() {
        return voucherNumber;
    }


    /**
     * Sets the voucherNumber value for this FgResponseVO.
     * 
     * @param voucherNumber
     */
    public void setVoucherNumber(java.lang.String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }


    /**
     * Gets the status value for this FgResponseVO.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FgResponseVO.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the XSD_AUX_NC value for this FgResponseVO.
     * 
     * @return XSD_AUX_NC
     */
    public java.lang.String getXSD_AUX_NC() {
        return XSD_AUX_NC;
    }


    /**
     * Sets the XSD_AUX_NC value for this FgResponseVO.
     * 
     * @param XSD_AUX_NC
     */
    public void setXSD_AUX_NC(java.lang.String XSD_AUX_NC) {
        this.XSD_AUX_NC = XSD_AUX_NC;
    }


    /**
     * Gets the openingBalance value for this FgResponseVO.
     * 
     * @return openingBalance
     */
    public java.lang.String getOpeningBalance() {
        return openingBalance;
    }


    /**
     * Sets the openingBalance value for this FgResponseVO.
     * 
     * @param openingBalance
     */
    public void setOpeningBalance(java.lang.String openingBalance) {
        this.openingBalance = openingBalance;
    }


    /**
     * Gets the closingBalance value for this FgResponseVO.
     * 
     * @return closingBalance
     */
    public java.lang.String getClosingBalance() {
        return closingBalance;
    }


    /**
     * Sets the closingBalance value for this FgResponseVO.
     * 
     * @param closingBalance
     */
    public void setClosingBalance(java.lang.String closingBalance) {
        this.closingBalance = closingBalance;
    }


    /**
     * Gets the errorDetailVOList value for this FgResponseVO.
     * 
     * @return errorDetailVOList
     */
    public com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO[] getErrorDetailVOList() {
        return errorDetailVOList;
    }


    /**
     * Sets the errorDetailVOList value for this FgResponseVO.
     * 
     * @param errorDetailVOList
     */
    public void setErrorDetailVOList(com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO[] errorDetailVOList) {
        this.errorDetailVOList = errorDetailVOList;
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO getErrorDetailVOList(int i) {
        return this.errorDetailVOList[i];
    }

    public void setErrorDetailVOList(int i, com.firstapex.rs.acnt.webservices.receiptInterface.ErrorDetailVO _value) {
        this.errorDetailVOList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FgResponseVO)) return false;
        FgResponseVO other = (FgResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voucherNumber==null && other.getVoucherNumber()==null) || 
             (this.voucherNumber!=null &&
              this.voucherNumber.equals(other.getVoucherNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.XSD_AUX_NC==null && other.getXSD_AUX_NC()==null) || 
             (this.XSD_AUX_NC!=null &&
              this.XSD_AUX_NC.equals(other.getXSD_AUX_NC()))) &&
            ((this.openingBalance==null && other.getOpeningBalance()==null) || 
             (this.openingBalance!=null &&
              this.openingBalance.equals(other.getOpeningBalance()))) &&
            ((this.closingBalance==null && other.getClosingBalance()==null) || 
             (this.closingBalance!=null &&
              this.closingBalance.equals(other.getClosingBalance()))) &&
            ((this.errorDetailVOList==null && other.getErrorDetailVOList()==null) || 
             (this.errorDetailVOList!=null &&
              java.util.Arrays.equals(this.errorDetailVOList, other.getErrorDetailVOList())));
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
        if (getVoucherNumber() != null) {
            _hashCode += getVoucherNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getXSD_AUX_NC() != null) {
            _hashCode += getXSD_AUX_NC().hashCode();
        }
        if (getOpeningBalance() != null) {
            _hashCode += getOpeningBalance().hashCode();
        }
        if (getClosingBalance() != null) {
            _hashCode += getClosingBalance().hashCode();
        }
        if (getErrorDetailVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorDetailVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorDetailVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FgResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XSD_AUX_NC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "XSD_AUX_NC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "openingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "closingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDetailVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "errorDetailVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "errorDetailVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
