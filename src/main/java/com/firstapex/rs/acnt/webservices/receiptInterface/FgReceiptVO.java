/**
 * FgReceiptVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.acnt.webservices.receiptInterface;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FgReceiptVO  implements java.io.Serializable {
    private java.lang.String operatorId;

    private java.lang.String voucherAccountCode;

    private java.lang.String voucherSource;

    private java.lang.String voucherReference;

    private java.lang.String voucherTheirReferenceNumber;

    private java.lang.String voucherParticulars;

    private java.lang.String voucherProductCode;

    private java.lang.String voucherReason;

    private java.lang.String voucherSuspenseBranch;

    private com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO[] cashVOList;

    private com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO[] chequeVOList;

    private com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO[] creditCardVOList;

    private com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO[] bankDebitVOList;

    public FgReceiptVO() {
    }

    public FgReceiptVO(
           java.lang.String operatorId,
           java.lang.String voucherAccountCode,
           java.lang.String voucherSource,
           java.lang.String voucherReference,
           java.lang.String voucherTheirReferenceNumber,
           java.lang.String voucherParticulars,
           java.lang.String voucherProductCode,
           java.lang.String voucherReason,
           java.lang.String voucherSuspenseBranch,
           com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO[] cashVOList,
           com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO[] chequeVOList,
           com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO[] creditCardVOList,
           com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO[] bankDebitVOList) {
           this.operatorId = operatorId;
           this.voucherAccountCode = voucherAccountCode;
           this.voucherSource = voucherSource;
           this.voucherReference = voucherReference;
           this.voucherTheirReferenceNumber = voucherTheirReferenceNumber;
           this.voucherParticulars = voucherParticulars;
           this.voucherProductCode = voucherProductCode;
           this.voucherReason = voucherReason;
           this.voucherSuspenseBranch = voucherSuspenseBranch;
           this.cashVOList = cashVOList;
           this.chequeVOList = chequeVOList;
           this.creditCardVOList = creditCardVOList;
           this.bankDebitVOList = bankDebitVOList;
    }


    /**
     * Gets the operatorId value for this FgReceiptVO.
     * 
     * @return operatorId
     */
    public java.lang.String getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this FgReceiptVO.
     * 
     * @param operatorId
     */
    public void setOperatorId(java.lang.String operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the voucherAccountCode value for this FgReceiptVO.
     * 
     * @return voucherAccountCode
     */
    public java.lang.String getVoucherAccountCode() {
        return voucherAccountCode;
    }


    /**
     * Sets the voucherAccountCode value for this FgReceiptVO.
     * 
     * @param voucherAccountCode
     */
    public void setVoucherAccountCode(java.lang.String voucherAccountCode) {
        this.voucherAccountCode = voucherAccountCode;
    }


    /**
     * Gets the voucherSource value for this FgReceiptVO.
     * 
     * @return voucherSource
     */
    public java.lang.String getVoucherSource() {
        return voucherSource;
    }


    /**
     * Sets the voucherSource value for this FgReceiptVO.
     * 
     * @param voucherSource
     */
    public void setVoucherSource(java.lang.String voucherSource) {
        this.voucherSource = voucherSource;
    }


    /**
     * Gets the voucherReference value for this FgReceiptVO.
     * 
     * @return voucherReference
     */
    public java.lang.String getVoucherReference() {
        return voucherReference;
    }


    /**
     * Sets the voucherReference value for this FgReceiptVO.
     * 
     * @param voucherReference
     */
    public void setVoucherReference(java.lang.String voucherReference) {
        this.voucherReference = voucherReference;
    }


    /**
     * Gets the voucherTheirReferenceNumber value for this FgReceiptVO.
     * 
     * @return voucherTheirReferenceNumber
     */
    public java.lang.String getVoucherTheirReferenceNumber() {
        return voucherTheirReferenceNumber;
    }


    /**
     * Sets the voucherTheirReferenceNumber value for this FgReceiptVO.
     * 
     * @param voucherTheirReferenceNumber
     */
    public void setVoucherTheirReferenceNumber(java.lang.String voucherTheirReferenceNumber) {
        this.voucherTheirReferenceNumber = voucherTheirReferenceNumber;
    }


    /**
     * Gets the voucherParticulars value for this FgReceiptVO.
     * 
     * @return voucherParticulars
     */
    public java.lang.String getVoucherParticulars() {
        return voucherParticulars;
    }


    /**
     * Sets the voucherParticulars value for this FgReceiptVO.
     * 
     * @param voucherParticulars
     */
    public void setVoucherParticulars(java.lang.String voucherParticulars) {
        this.voucherParticulars = voucherParticulars;
    }


    /**
     * Gets the voucherProductCode value for this FgReceiptVO.
     * 
     * @return voucherProductCode
     */
    public java.lang.String getVoucherProductCode() {
        return voucherProductCode;
    }


    /**
     * Sets the voucherProductCode value for this FgReceiptVO.
     * 
     * @param voucherProductCode
     */
    public void setVoucherProductCode(java.lang.String voucherProductCode) {
        this.voucherProductCode = voucherProductCode;
    }


    /**
     * Gets the voucherReason value for this FgReceiptVO.
     * 
     * @return voucherReason
     */
    public java.lang.String getVoucherReason() {
        return voucherReason;
    }


    /**
     * Sets the voucherReason value for this FgReceiptVO.
     * 
     * @param voucherReason
     */
    public void setVoucherReason(java.lang.String voucherReason) {
        this.voucherReason = voucherReason;
    }


    /**
     * Gets the voucherSuspenseBranch value for this FgReceiptVO.
     * 
     * @return voucherSuspenseBranch
     */
    public java.lang.String getVoucherSuspenseBranch() {
        return voucherSuspenseBranch;
    }


    /**
     * Sets the voucherSuspenseBranch value for this FgReceiptVO.
     * 
     * @param voucherSuspenseBranch
     */
    public void setVoucherSuspenseBranch(java.lang.String voucherSuspenseBranch) {
        this.voucherSuspenseBranch = voucherSuspenseBranch;
    }


    /**
     * Gets the cashVOList value for this FgReceiptVO.
     * 
     * @return cashVOList
     */
    public com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO[] getCashVOList() {
        return cashVOList;
    }


    /**
     * Sets the cashVOList value for this FgReceiptVO.
     * 
     * @param cashVOList
     */
    public void setCashVOList(com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO[] cashVOList) {
        this.cashVOList = cashVOList;
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO getCashVOList(int i) {
        return this.cashVOList[i];
    }

    public void setCashVOList(int i, com.firstapex.rs.acnt.webservices.receiptInterface.FgCashVO _value) {
        this.cashVOList[i] = _value;
    }


    /**
     * Gets the chequeVOList value for this FgReceiptVO.
     * 
     * @return chequeVOList
     */
    public com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO[] getChequeVOList() {
        return chequeVOList;
    }


    /**
     * Sets the chequeVOList value for this FgReceiptVO.
     * 
     * @param chequeVOList
     */
    public void setChequeVOList(com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO[] chequeVOList) {
        this.chequeVOList = chequeVOList;
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO getChequeVOList(int i) {
        return this.chequeVOList[i];
    }

    public void setChequeVOList(int i, com.firstapex.rs.acnt.webservices.receiptInterface.FgChequeVO _value) {
        this.chequeVOList[i] = _value;
    }


    /**
     * Gets the creditCardVOList value for this FgReceiptVO.
     * 
     * @return creditCardVOList
     */
    public com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO[] getCreditCardVOList() {
        return creditCardVOList;
    }


    /**
     * Sets the creditCardVOList value for this FgReceiptVO.
     * 
     * @param creditCardVOList
     */
    public void setCreditCardVOList(com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO[] creditCardVOList) {
        this.creditCardVOList = creditCardVOList;
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO getCreditCardVOList(int i) {
        return this.creditCardVOList[i];
    }

    public void setCreditCardVOList(int i, com.firstapex.rs.acnt.webservices.receiptInterface.FgCreditCardVO _value) {
        this.creditCardVOList[i] = _value;
    }


    /**
     * Gets the bankDebitVOList value for this FgReceiptVO.
     * 
     * @return bankDebitVOList
     */
    public com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO[] getBankDebitVOList() {
        return bankDebitVOList;
    }


    /**
     * Sets the bankDebitVOList value for this FgReceiptVO.
     * 
     * @param bankDebitVOList
     */
    public void setBankDebitVOList(com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO[] bankDebitVOList) {
        this.bankDebitVOList = bankDebitVOList;
    }

    public com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO getBankDebitVOList(int i) {
        return this.bankDebitVOList[i];
    }

    public void setBankDebitVOList(int i, com.firstapex.rs.acnt.webservices.receiptInterface.FgBankDebitVO _value) {
        this.bankDebitVOList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FgReceiptVO)) return false;
        FgReceiptVO other = (FgReceiptVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.voucherAccountCode==null && other.getVoucherAccountCode()==null) || 
             (this.voucherAccountCode!=null &&
              this.voucherAccountCode.equals(other.getVoucherAccountCode()))) &&
            ((this.voucherSource==null && other.getVoucherSource()==null) || 
             (this.voucherSource!=null &&
              this.voucherSource.equals(other.getVoucherSource()))) &&
            ((this.voucherReference==null && other.getVoucherReference()==null) || 
             (this.voucherReference!=null &&
              this.voucherReference.equals(other.getVoucherReference()))) &&
            ((this.voucherTheirReferenceNumber==null && other.getVoucherTheirReferenceNumber()==null) || 
             (this.voucherTheirReferenceNumber!=null &&
              this.voucherTheirReferenceNumber.equals(other.getVoucherTheirReferenceNumber()))) &&
            ((this.voucherParticulars==null && other.getVoucherParticulars()==null) || 
             (this.voucherParticulars!=null &&
              this.voucherParticulars.equals(other.getVoucherParticulars()))) &&
            ((this.voucherProductCode==null && other.getVoucherProductCode()==null) || 
             (this.voucherProductCode!=null &&
              this.voucherProductCode.equals(other.getVoucherProductCode()))) &&
            ((this.voucherReason==null && other.getVoucherReason()==null) || 
             (this.voucherReason!=null &&
              this.voucherReason.equals(other.getVoucherReason()))) &&
            ((this.voucherSuspenseBranch==null && other.getVoucherSuspenseBranch()==null) || 
             (this.voucherSuspenseBranch!=null &&
              this.voucherSuspenseBranch.equals(other.getVoucherSuspenseBranch()))) &&
            ((this.cashVOList==null && other.getCashVOList()==null) || 
             (this.cashVOList!=null &&
              java.util.Arrays.equals(this.cashVOList, other.getCashVOList()))) &&
            ((this.chequeVOList==null && other.getChequeVOList()==null) || 
             (this.chequeVOList!=null &&
              java.util.Arrays.equals(this.chequeVOList, other.getChequeVOList()))) &&
            ((this.creditCardVOList==null && other.getCreditCardVOList()==null) || 
             (this.creditCardVOList!=null &&
              java.util.Arrays.equals(this.creditCardVOList, other.getCreditCardVOList()))) &&
            ((this.bankDebitVOList==null && other.getBankDebitVOList()==null) || 
             (this.bankDebitVOList!=null &&
              java.util.Arrays.equals(this.bankDebitVOList, other.getBankDebitVOList())));
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
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getVoucherAccountCode() != null) {
            _hashCode += getVoucherAccountCode().hashCode();
        }
        if (getVoucherSource() != null) {
            _hashCode += getVoucherSource().hashCode();
        }
        if (getVoucherReference() != null) {
            _hashCode += getVoucherReference().hashCode();
        }
        if (getVoucherTheirReferenceNumber() != null) {
            _hashCode += getVoucherTheirReferenceNumber().hashCode();
        }
        if (getVoucherParticulars() != null) {
            _hashCode += getVoucherParticulars().hashCode();
        }
        if (getVoucherProductCode() != null) {
            _hashCode += getVoucherProductCode().hashCode();
        }
        if (getVoucherReason() != null) {
            _hashCode += getVoucherReason().hashCode();
        }
        if (getVoucherSuspenseBranch() != null) {
            _hashCode += getVoucherSuspenseBranch().hashCode();
        }
        if (getCashVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCashVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCashVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChequeVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChequeVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChequeVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditCardVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditCardVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditCardVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBankDebitVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankDebitVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankDebitVOList(), i);
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
        new org.apache.axis.description.TypeDesc(FgReceiptVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgReceiptVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "operatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherAccountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherAccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherTheirReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherTheirReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherParticulars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherParticulars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherSuspenseBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "voucherSuspenseBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "cashVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgCashVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "chequeVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgChequeVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "creditCardVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgCreditCardVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDebitVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "bankDebitVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://receiptInterface.webservices.acnt.rs.firstapex.com/", "FgBankDebitVO"));
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
