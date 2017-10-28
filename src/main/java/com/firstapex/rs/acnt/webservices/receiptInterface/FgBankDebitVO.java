/**
 * FgBankDebitVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

public class FgBankDebitVO  implements java.io.Serializable {
    private java.lang.String bankDebitCurrency;

    private java.lang.String depositBank;

    private java.math.BigDecimal bankDebitAmount;

    private java.math.BigDecimal bankDebitCharges;

    private java.lang.String accountHolderName;

    private java.lang.String MICRCode;

    private java.lang.String IFSCCode;

    private java.lang.String transactionNumber;

    public FgBankDebitVO() {
    }

    public FgBankDebitVO(
           java.lang.String bankDebitCurrency,
           java.lang.String depositBank,
           java.math.BigDecimal bankDebitAmount,
           java.math.BigDecimal bankDebitCharges,
           java.lang.String accountHolderName,
           java.lang.String MICRCode,
           java.lang.String IFSCCode,
           java.lang.String transactionNumber) {
           this.bankDebitCurrency = bankDebitCurrency;
           this.depositBank = depositBank;
           this.bankDebitAmount = bankDebitAmount;
           this.bankDebitCharges = bankDebitCharges;
           this.accountHolderName = accountHolderName;
           this.MICRCode = MICRCode;
           this.IFSCCode = IFSCCode;
           this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the bankDebitCurrency value for this FgBankDebitVO.
     * 
     * @return bankDebitCurrency
     */
    public java.lang.String getBankDebitCurrency() {
        return bankDebitCurrency;
    }


    /**
     * Sets the bankDebitCurrency value for this FgBankDebitVO.
     * 
     * @param bankDebitCurrency
     */
    public void setBankDebitCurrency(java.lang.String bankDebitCurrency) {
        this.bankDebitCurrency = bankDebitCurrency;
    }


    /**
     * Gets the depositBank value for this FgBankDebitVO.
     * 
     * @return depositBank
     */
    public java.lang.String getDepositBank() {
        return depositBank;
    }


    /**
     * Sets the depositBank value for this FgBankDebitVO.
     * 
     * @param depositBank
     */
    public void setDepositBank(java.lang.String depositBank) {
        this.depositBank = depositBank;
    }


    /**
     * Gets the bankDebitAmount value for this FgBankDebitVO.
     * 
     * @return bankDebitAmount
     */
    public java.math.BigDecimal getBankDebitAmount() {
        return bankDebitAmount;
    }


    /**
     * Sets the bankDebitAmount value for this FgBankDebitVO.
     * 
     * @param bankDebitAmount
     */
    public void setBankDebitAmount(java.math.BigDecimal bankDebitAmount) {
        this.bankDebitAmount = bankDebitAmount;
    }


    /**
     * Gets the bankDebitCharges value for this FgBankDebitVO.
     * 
     * @return bankDebitCharges
     */
    public java.math.BigDecimal getBankDebitCharges() {
        return bankDebitCharges;
    }


    /**
     * Sets the bankDebitCharges value for this FgBankDebitVO.
     * 
     * @param bankDebitCharges
     */
    public void setBankDebitCharges(java.math.BigDecimal bankDebitCharges) {
        this.bankDebitCharges = bankDebitCharges;
    }


    /**
     * Gets the accountHolderName value for this FgBankDebitVO.
     * 
     * @return accountHolderName
     */
    public java.lang.String getAccountHolderName() {
        return accountHolderName;
    }


    /**
     * Sets the accountHolderName value for this FgBankDebitVO.
     * 
     * @param accountHolderName
     */
    public void setAccountHolderName(java.lang.String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    /**
     * Gets the MICRCode value for this FgBankDebitVO.
     * 
     * @return MICRCode
     */
    public java.lang.String getMICRCode() {
        return MICRCode;
    }


    /**
     * Sets the MICRCode value for this FgBankDebitVO.
     * 
     * @param MICRCode
     */
    public void setMICRCode(java.lang.String MICRCode) {
        this.MICRCode = MICRCode;
    }


    /**
     * Gets the IFSCCode value for this FgBankDebitVO.
     * 
     * @return IFSCCode
     */
    public java.lang.String getIFSCCode() {
        return IFSCCode;
    }


    /**
     * Sets the IFSCCode value for this FgBankDebitVO.
     * 
     * @param IFSCCode
     */
    public void setIFSCCode(java.lang.String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }


    /**
     * Gets the transactionNumber value for this FgBankDebitVO.
     * 
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this FgBankDebitVO.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FgBankDebitVO)) return false;
        FgBankDebitVO other = (FgBankDebitVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankDebitCurrency==null && other.getBankDebitCurrency()==null) || 
             (this.bankDebitCurrency!=null &&
              this.bankDebitCurrency.equals(other.getBankDebitCurrency()))) &&
            ((this.depositBank==null && other.getDepositBank()==null) || 
             (this.depositBank!=null &&
              this.depositBank.equals(other.getDepositBank()))) &&
            ((this.bankDebitAmount==null && other.getBankDebitAmount()==null) || 
             (this.bankDebitAmount!=null &&
              this.bankDebitAmount.equals(other.getBankDebitAmount()))) &&
            ((this.bankDebitCharges==null && other.getBankDebitCharges()==null) || 
             (this.bankDebitCharges!=null &&
              this.bankDebitCharges.equals(other.getBankDebitCharges()))) &&
            ((this.accountHolderName==null && other.getAccountHolderName()==null) || 
             (this.accountHolderName!=null &&
              this.accountHolderName.equals(other.getAccountHolderName()))) &&
            ((this.MICRCode==null && other.getMICRCode()==null) || 
             (this.MICRCode!=null &&
              this.MICRCode.equals(other.getMICRCode()))) &&
            ((this.IFSCCode==null && other.getIFSCCode()==null) || 
             (this.IFSCCode!=null &&
              this.IFSCCode.equals(other.getIFSCCode()))) &&
            ((this.transactionNumber==null && other.getTransactionNumber()==null) || 
             (this.transactionNumber!=null &&
              this.transactionNumber.equals(other.getTransactionNumber())));
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
        if (getBankDebitCurrency() != null) {
            _hashCode += getBankDebitCurrency().hashCode();
        }
        if (getDepositBank() != null) {
            _hashCode += getDepositBank().hashCode();
        }
        if (getBankDebitAmount() != null) {
            _hashCode += getBankDebitAmount().hashCode();
        }
        if (getBankDebitCharges() != null) {
            _hashCode += getBankDebitCharges().hashCode();
        }
        if (getAccountHolderName() != null) {
            _hashCode += getAccountHolderName().hashCode();
        }
        if (getMICRCode() != null) {
            _hashCode += getMICRCode().hashCode();
        }
        if (getIFSCCode() != null) {
            _hashCode += getIFSCCode().hashCode();
        }
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FgBankDebitVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgBankDebitVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDebitCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "bankDebitCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "depositBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDebitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "bankDebitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDebitCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "bankDebitCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "accountHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MICRCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "MICRCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IFSCCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "IFSCCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
