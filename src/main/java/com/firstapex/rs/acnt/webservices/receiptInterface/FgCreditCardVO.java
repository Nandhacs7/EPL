/**
 * FgCreditCardVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

public class FgCreditCardVO  implements java.io.Serializable {
    private java.lang.String depositBank;

    private java.lang.String cardCurrency;

    private java.math.BigDecimal cardAmount;

    private java.lang.String cardNumber;

    private java.lang.String cardCompany;

    private java.lang.String cardExpiryDate;

    private java.lang.String cardType;

    private java.lang.String transactionNumber;

    public FgCreditCardVO() {
    }

    public FgCreditCardVO(
           java.lang.String depositBank,
           java.lang.String cardCurrency,
           java.math.BigDecimal cardAmount,
           java.lang.String cardNumber,
           java.lang.String cardCompany,
           java.lang.String cardExpiryDate,
           java.lang.String cardType,
           java.lang.String transactionNumber) {
           this.depositBank = depositBank;
           this.cardCurrency = cardCurrency;
           this.cardAmount = cardAmount;
           this.cardNumber = cardNumber;
           this.cardCompany = cardCompany;
           this.cardExpiryDate = cardExpiryDate;
           this.cardType = cardType;
           this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the depositBank value for this FgCreditCardVO.
     * 
     * @return depositBank
     */
    public java.lang.String getDepositBank() {
        return depositBank;
    }


    /**
     * Sets the depositBank value for this FgCreditCardVO.
     * 
     * @param depositBank
     */
    public void setDepositBank(java.lang.String depositBank) {
        this.depositBank = depositBank;
    }


    /**
     * Gets the cardCurrency value for this FgCreditCardVO.
     * 
     * @return cardCurrency
     */
    public java.lang.String getCardCurrency() {
        return cardCurrency;
    }


    /**
     * Sets the cardCurrency value for this FgCreditCardVO.
     * 
     * @param cardCurrency
     */
    public void setCardCurrency(java.lang.String cardCurrency) {
        this.cardCurrency = cardCurrency;
    }


    /**
     * Gets the cardAmount value for this FgCreditCardVO.
     * 
     * @return cardAmount
     */
    public java.math.BigDecimal getCardAmount() {
        return cardAmount;
    }


    /**
     * Sets the cardAmount value for this FgCreditCardVO.
     * 
     * @param cardAmount
     */
    public void setCardAmount(java.math.BigDecimal cardAmount) {
        this.cardAmount = cardAmount;
    }


    /**
     * Gets the cardNumber value for this FgCreditCardVO.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this FgCreditCardVO.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the cardCompany value for this FgCreditCardVO.
     * 
     * @return cardCompany
     */
    public java.lang.String getCardCompany() {
        return cardCompany;
    }


    /**
     * Sets the cardCompany value for this FgCreditCardVO.
     * 
     * @param cardCompany
     */
    public void setCardCompany(java.lang.String cardCompany) {
        this.cardCompany = cardCompany;
    }


    /**
     * Gets the cardExpiryDate value for this FgCreditCardVO.
     * 
     * @return cardExpiryDate
     */
    public java.lang.String getCardExpiryDate() {
        return cardExpiryDate;
    }


    /**
     * Sets the cardExpiryDate value for this FgCreditCardVO.
     * 
     * @param cardExpiryDate
     */
    public void setCardExpiryDate(java.lang.String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }


    /**
     * Gets the cardType value for this FgCreditCardVO.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this FgCreditCardVO.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the transactionNumber value for this FgCreditCardVO.
     * 
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this FgCreditCardVO.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FgCreditCardVO)) return false;
        FgCreditCardVO other = (FgCreditCardVO) obj;
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
            ((this.cardCurrency==null && other.getCardCurrency()==null) || 
             (this.cardCurrency!=null &&
              this.cardCurrency.equals(other.getCardCurrency()))) &&
            ((this.cardAmount==null && other.getCardAmount()==null) || 
             (this.cardAmount!=null &&
              this.cardAmount.equals(other.getCardAmount()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.cardCompany==null && other.getCardCompany()==null) || 
             (this.cardCompany!=null &&
              this.cardCompany.equals(other.getCardCompany()))) &&
            ((this.cardExpiryDate==null && other.getCardExpiryDate()==null) || 
             (this.cardExpiryDate!=null &&
              this.cardExpiryDate.equals(other.getCardExpiryDate()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
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
        if (getDepositBank() != null) {
            _hashCode += getDepositBank().hashCode();
        }
        if (getCardCurrency() != null) {
            _hashCode += getCardCurrency().hashCode();
        }
        if (getCardAmount() != null) {
            _hashCode += getCardAmount().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCardCompany() != null) {
            _hashCode += getCardCompany().hashCode();
        }
        if (getCardExpiryDate() != null) {
            _hashCode += getCardExpiryDate().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FgCreditCardVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgCreditCardVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "depositBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cardCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cardAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cardCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cardExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
