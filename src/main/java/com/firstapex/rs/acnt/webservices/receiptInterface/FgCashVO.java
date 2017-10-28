/**
 * FgCashVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

public class FgCashVO  implements java.io.Serializable {
    private java.lang.String depositBank;

    private java.lang.String cashCurrency;

    private java.math.BigDecimal cashAmount;

    private java.math.BigDecimal cashCharges;

    public FgCashVO() {
    }

    public FgCashVO(
           java.lang.String depositBank,
           java.lang.String cashCurrency,
           java.math.BigDecimal cashAmount,
           java.math.BigDecimal cashCharges) {
           this.depositBank = depositBank;
           this.cashCurrency = cashCurrency;
           this.cashAmount = cashAmount;
           this.cashCharges = cashCharges;
    }


    /**
     * Gets the depositBank value for this FgCashVO.
     * 
     * @return depositBank
     */
    public java.lang.String getDepositBank() {
        return depositBank;
    }


    /**
     * Sets the depositBank value for this FgCashVO.
     * 
     * @param depositBank
     */
    public void setDepositBank(java.lang.String depositBank) {
        this.depositBank = depositBank;
    }


    /**
     * Gets the cashCurrency value for this FgCashVO.
     * 
     * @return cashCurrency
     */
    public java.lang.String getCashCurrency() {
        return cashCurrency;
    }


    /**
     * Sets the cashCurrency value for this FgCashVO.
     * 
     * @param cashCurrency
     */
    public void setCashCurrency(java.lang.String cashCurrency) {
        this.cashCurrency = cashCurrency;
    }


    /**
     * Gets the cashAmount value for this FgCashVO.
     * 
     * @return cashAmount
     */
    public java.math.BigDecimal getCashAmount() {
        return cashAmount;
    }


    /**
     * Sets the cashAmount value for this FgCashVO.
     * 
     * @param cashAmount
     */
    public void setCashAmount(java.math.BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }


    /**
     * Gets the cashCharges value for this FgCashVO.
     * 
     * @return cashCharges
     */
    public java.math.BigDecimal getCashCharges() {
        return cashCharges;
    }


    /**
     * Sets the cashCharges value for this FgCashVO.
     * 
     * @param cashCharges
     */
    public void setCashCharges(java.math.BigDecimal cashCharges) {
        this.cashCharges = cashCharges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FgCashVO)) return false;
        FgCashVO other = (FgCashVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositBank==null && other.getDepositBank()==null) || 
             (this.depositBank!=null &&
              this.depositBank.equals(other.getDepositBank()))) &&
            ((this.cashCurrency==null && other.getCashCurrency()==null) || 
             (this.cashCurrency!=null &&
              this.cashCurrency.equals(other.getCashCurrency()))) &&
            ((this.cashAmount==null && other.getCashAmount()==null) || 
             (this.cashAmount!=null &&
              this.cashAmount.equals(other.getCashAmount()))) &&
            ((this.cashCharges==null && other.getCashCharges()==null) || 
             (this.cashCharges!=null &&
              this.cashCharges.equals(other.getCashCharges())));
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
        if (getDepositBank() != null) {
            _hashCode += getDepositBank().hashCode();
        }
        if (getCashCurrency() != null) {
            _hashCode += getCashCurrency().hashCode();
        }
        if (getCashAmount() != null) {
            _hashCode += getCashAmount().hashCode();
        }
        if (getCashCharges() != null) {
            _hashCode += getCashCharges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FgCashVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgCashVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "depositBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cashCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cashAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cashCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
