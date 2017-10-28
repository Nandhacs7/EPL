/**
 * FgChequeVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

public class FgChequeVO  implements java.io.Serializable {
    private java.lang.String depositBank;

    private java.lang.String chequeCurrency;

    private java.math.BigDecimal chequeAmount;

    private java.math.BigDecimal chequeCharges;

    private java.lang.String chequeNumber;

    private java.lang.String chequeDraweeBank;

    private java.lang.String chequeDraweeBankName;

    private java.lang.String chequeDate;

    private java.lang.String chequeOverseas;

    public FgChequeVO() {
    }

    public FgChequeVO(
           java.lang.String depositBank,
           java.lang.String chequeCurrency,
           java.math.BigDecimal chequeAmount,
           java.math.BigDecimal chequeCharges,
           java.lang.String chequeNumber,
           java.lang.String chequeDraweeBank,
           java.lang.String chequeDraweeBankName,
           java.lang.String chequeDate,
           java.lang.String chequeOverseas) {
           this.depositBank = depositBank;
           this.chequeCurrency = chequeCurrency;
           this.chequeAmount = chequeAmount;
           this.chequeCharges = chequeCharges;
           this.chequeNumber = chequeNumber;
           this.chequeDraweeBank = chequeDraweeBank;
           this.chequeDraweeBankName = chequeDraweeBankName;
           this.chequeDate = chequeDate;
           this.chequeOverseas = chequeOverseas;
    }


    /**
     * Gets the depositBank value for this FgChequeVO.
     * 
     * @return depositBank
     */
    public java.lang.String getDepositBank() {
        return depositBank;
    }


    /**
     * Sets the depositBank value for this FgChequeVO.
     * 
     * @param depositBank
     */
    public void setDepositBank(java.lang.String depositBank) {
        this.depositBank = depositBank;
    }


    /**
     * Gets the chequeCurrency value for this FgChequeVO.
     * 
     * @return chequeCurrency
     */
    public java.lang.String getChequeCurrency() {
        return chequeCurrency;
    }


    /**
     * Sets the chequeCurrency value for this FgChequeVO.
     * 
     * @param chequeCurrency
     */
    public void setChequeCurrency(java.lang.String chequeCurrency) {
        this.chequeCurrency = chequeCurrency;
    }


    /**
     * Gets the chequeAmount value for this FgChequeVO.
     * 
     * @return chequeAmount
     */
    public java.math.BigDecimal getChequeAmount() {
        return chequeAmount;
    }


    /**
     * Sets the chequeAmount value for this FgChequeVO.
     * 
     * @param chequeAmount
     */
    public void setChequeAmount(java.math.BigDecimal chequeAmount) {
        this.chequeAmount = chequeAmount;
    }


    /**
     * Gets the chequeCharges value for this FgChequeVO.
     * 
     * @return chequeCharges
     */
    public java.math.BigDecimal getChequeCharges() {
        return chequeCharges;
    }


    /**
     * Sets the chequeCharges value for this FgChequeVO.
     * 
     * @param chequeCharges
     */
    public void setChequeCharges(java.math.BigDecimal chequeCharges) {
        this.chequeCharges = chequeCharges;
    }


    /**
     * Gets the chequeNumber value for this FgChequeVO.
     * 
     * @return chequeNumber
     */
    public java.lang.String getChequeNumber() {
        return chequeNumber;
    }


    /**
     * Sets the chequeNumber value for this FgChequeVO.
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(java.lang.String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }


    /**
     * Gets the chequeDraweeBank value for this FgChequeVO.
     * 
     * @return chequeDraweeBank
     */
    public java.lang.String getChequeDraweeBank() {
        return chequeDraweeBank;
    }


    /**
     * Sets the chequeDraweeBank value for this FgChequeVO.
     * 
     * @param chequeDraweeBank
     */
    public void setChequeDraweeBank(java.lang.String chequeDraweeBank) {
        this.chequeDraweeBank = chequeDraweeBank;
    }


    /**
     * Gets the chequeDraweeBankName value for this FgChequeVO.
     * 
     * @return chequeDraweeBankName
     */
    public java.lang.String getChequeDraweeBankName() {
        return chequeDraweeBankName;
    }


    /**
     * Sets the chequeDraweeBankName value for this FgChequeVO.
     * 
     * @param chequeDraweeBankName
     */
    public void setChequeDraweeBankName(java.lang.String chequeDraweeBankName) {
        this.chequeDraweeBankName = chequeDraweeBankName;
    }


    /**
     * Gets the chequeDate value for this FgChequeVO.
     * 
     * @return chequeDate
     */
    public java.lang.String getChequeDate() {
        return chequeDate;
    }


    /**
     * Sets the chequeDate value for this FgChequeVO.
     * 
     * @param chequeDate
     */
    public void setChequeDate(java.lang.String chequeDate) {
        this.chequeDate = chequeDate;
    }


    /**
     * Gets the chequeOverseas value for this FgChequeVO.
     * 
     * @return chequeOverseas
     */
    public java.lang.String getChequeOverseas() {
        return chequeOverseas;
    }


    /**
     * Sets the chequeOverseas value for this FgChequeVO.
     * 
     * @param chequeOverseas
     */
    public void setChequeOverseas(java.lang.String chequeOverseas) {
        this.chequeOverseas = chequeOverseas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FgChequeVO)) return false;
        FgChequeVO other = (FgChequeVO) obj;
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
            ((this.chequeCurrency==null && other.getChequeCurrency()==null) || 
             (this.chequeCurrency!=null &&
              this.chequeCurrency.equals(other.getChequeCurrency()))) &&
            ((this.chequeAmount==null && other.getChequeAmount()==null) || 
             (this.chequeAmount!=null &&
              this.chequeAmount.equals(other.getChequeAmount()))) &&
            ((this.chequeCharges==null && other.getChequeCharges()==null) || 
             (this.chequeCharges!=null &&
              this.chequeCharges.equals(other.getChequeCharges()))) &&
            ((this.chequeNumber==null && other.getChequeNumber()==null) || 
             (this.chequeNumber!=null &&
              this.chequeNumber.equals(other.getChequeNumber()))) &&
            ((this.chequeDraweeBank==null && other.getChequeDraweeBank()==null) || 
             (this.chequeDraweeBank!=null &&
              this.chequeDraweeBank.equals(other.getChequeDraweeBank()))) &&
            ((this.chequeDraweeBankName==null && other.getChequeDraweeBankName()==null) || 
             (this.chequeDraweeBankName!=null &&
              this.chequeDraweeBankName.equals(other.getChequeDraweeBankName()))) &&
            ((this.chequeDate==null && other.getChequeDate()==null) || 
             (this.chequeDate!=null &&
              this.chequeDate.equals(other.getChequeDate()))) &&
            ((this.chequeOverseas==null && other.getChequeOverseas()==null) || 
             (this.chequeOverseas!=null &&
              this.chequeOverseas.equals(other.getChequeOverseas())));
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
        if (getChequeCurrency() != null) {
            _hashCode += getChequeCurrency().hashCode();
        }
        if (getChequeAmount() != null) {
            _hashCode += getChequeAmount().hashCode();
        }
        if (getChequeCharges() != null) {
            _hashCode += getChequeCharges().hashCode();
        }
        if (getChequeNumber() != null) {
            _hashCode += getChequeNumber().hashCode();
        }
        if (getChequeDraweeBank() != null) {
            _hashCode += getChequeDraweeBank().hashCode();
        }
        if (getChequeDraweeBankName() != null) {
            _hashCode += getChequeDraweeBankName().hashCode();
        }
        if (getChequeDate() != null) {
            _hashCode += getChequeDate().hashCode();
        }
        if (getChequeOverseas() != null) {
            _hashCode += getChequeOverseas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FgChequeVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgChequeVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "depositBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeDraweeBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeDraweeBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeDraweeBankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeDraweeBankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeOverseas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeOverseas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
