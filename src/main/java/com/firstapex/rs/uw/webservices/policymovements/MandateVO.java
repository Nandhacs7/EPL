/**
 * MandateVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.math.BigDecimal;

public class MandateVO  implements java.io.Serializable {
    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_166::MaxLength=16::ErrorLength=E_FICUW_WS_167 */
    private java.lang.String IUWMD_MANDT_NO;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_168::MaxLength=4::ErrorLength=E_FICUW_WS_169::Auxiliary=FIC_CURRENCY::ErrorAux=E_FICUW_AUX_028 */
    private java.lang.String IUWMD_BD_CURRENCY;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_170::MaxLength=4::ErrorLength=E_FICUW_WS_171 */
    private java.lang.String IUWMD_BANK_CD;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_172::MaxLength=30::ErrorLength=E_FICUW_WS_173 */
    private java.lang.String IUWMD_AC_HOLD_NM1;

    /* MaxLength=9::ErrorLength=E_FICUW_WS_174 */
    private java.lang.String IUWMD_BD_MICRO_CD;

    /* MaxLength=11::ErrorLength=E_FICUW_WS_175 */
    private java.lang.String IUWMD_BD_IFSC_CD;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_176::MaxLength=20::ErrorLength=E_FICUW_WS_177 */
    private java.lang.String IUWMD_BD_TRANS_NO;

    /* preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_178 */
    private java.math.BigDecimal IUWMD_BD_CHARGES=new BigDecimal(0);

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_179::preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_180 */
    private java.math.BigDecimal IUWMD_BD_AMOUNT=new BigDecimal(0);

    private java.lang.String IUWMD_BD_DT;

    public MandateVO() {
    }

    public MandateVO(
           java.lang.String IUWMD_MANDT_NO,
           java.lang.String IUWMD_BD_CURRENCY,
           java.lang.String IUWMD_BANK_CD,
           java.lang.String IUWMD_AC_HOLD_NM1,
           java.lang.String IUWMD_BD_MICRO_CD,
           java.lang.String IUWMD_BD_IFSC_CD,
           java.lang.String IUWMD_BD_TRANS_NO,
           java.math.BigDecimal IUWMD_BD_CHARGES,
           java.math.BigDecimal IUWMD_BD_AMOUNT,
           java.lang.String IUWMD_BD_DT) {
           this.IUWMD_MANDT_NO = IUWMD_MANDT_NO;
           this.IUWMD_BD_CURRENCY = IUWMD_BD_CURRENCY;
           this.IUWMD_BANK_CD = IUWMD_BANK_CD;
           this.IUWMD_AC_HOLD_NM1 = IUWMD_AC_HOLD_NM1;
           this.IUWMD_BD_MICRO_CD = IUWMD_BD_MICRO_CD;
           this.IUWMD_BD_IFSC_CD = IUWMD_BD_IFSC_CD;
           this.IUWMD_BD_TRANS_NO = IUWMD_BD_TRANS_NO;
           this.IUWMD_BD_CHARGES = IUWMD_BD_CHARGES;
           this.IUWMD_BD_AMOUNT = IUWMD_BD_AMOUNT;
           this.IUWMD_BD_DT = IUWMD_BD_DT;
    }


    /**
     * Gets the IUWMD_MANDT_NO value for this MandateVO.
     * 
     * @return IUWMD_MANDT_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_166::MaxLength=16::ErrorLength=E_FICUW_WS_167
     */
    public java.lang.String getIUWMD_MANDT_NO() {
        return IUWMD_MANDT_NO;
    }


    /**
     * Sets the IUWMD_MANDT_NO value for this MandateVO.
     * 
     * @param IUWMD_MANDT_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_166::MaxLength=16::ErrorLength=E_FICUW_WS_167
     */
    public void setIUWMD_MANDT_NO(java.lang.String IUWMD_MANDT_NO) {
        this.IUWMD_MANDT_NO = IUWMD_MANDT_NO;
    }


    /**
     * Gets the IUWMD_BD_CURRENCY value for this MandateVO.
     * 
     * @return IUWMD_BD_CURRENCY   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_168::MaxLength=4::ErrorLength=E_FICUW_WS_169::Auxiliary=FIC_CURRENCY::ErrorAux=E_FICUW_AUX_028
     */
    public java.lang.String getIUWMD_BD_CURRENCY() {
        return IUWMD_BD_CURRENCY;
    }


    /**
     * Sets the IUWMD_BD_CURRENCY value for this MandateVO.
     * 
     * @param IUWMD_BD_CURRENCY   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_168::MaxLength=4::ErrorLength=E_FICUW_WS_169::Auxiliary=FIC_CURRENCY::ErrorAux=E_FICUW_AUX_028
     */
    public void setIUWMD_BD_CURRENCY(java.lang.String IUWMD_BD_CURRENCY) {
        this.IUWMD_BD_CURRENCY = IUWMD_BD_CURRENCY;
    }


    /**
     * Gets the IUWMD_BANK_CD value for this MandateVO.
     * 
     * @return IUWMD_BANK_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_170::MaxLength=4::ErrorLength=E_FICUW_WS_171
     */
    public java.lang.String getIUWMD_BANK_CD() {
        return IUWMD_BANK_CD;
    }


    /**
     * Sets the IUWMD_BANK_CD value for this MandateVO.
     * 
     * @param IUWMD_BANK_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_170::MaxLength=4::ErrorLength=E_FICUW_WS_171
     */
    public void setIUWMD_BANK_CD(java.lang.String IUWMD_BANK_CD) {
        this.IUWMD_BANK_CD = IUWMD_BANK_CD;
    }


    /**
     * Gets the IUWMD_AC_HOLD_NM1 value for this MandateVO.
     * 
     * @return IUWMD_AC_HOLD_NM1   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_172::MaxLength=30::ErrorLength=E_FICUW_WS_173
     */
    public java.lang.String getIUWMD_AC_HOLD_NM1() {
        return IUWMD_AC_HOLD_NM1;
    }


    /**
     * Sets the IUWMD_AC_HOLD_NM1 value for this MandateVO.
     * 
     * @param IUWMD_AC_HOLD_NM1   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_172::MaxLength=30::ErrorLength=E_FICUW_WS_173
     */
    public void setIUWMD_AC_HOLD_NM1(java.lang.String IUWMD_AC_HOLD_NM1) {
        this.IUWMD_AC_HOLD_NM1 = IUWMD_AC_HOLD_NM1;
    }


    /**
     * Gets the IUWMD_BD_MICRO_CD value for this MandateVO.
     * 
     * @return IUWMD_BD_MICRO_CD   * MaxLength=9::ErrorLength=E_FICUW_WS_174
     */
    public java.lang.String getIUWMD_BD_MICRO_CD() {
        return IUWMD_BD_MICRO_CD;
    }


    /**
     * Sets the IUWMD_BD_MICRO_CD value for this MandateVO.
     * 
     * @param IUWMD_BD_MICRO_CD   * MaxLength=9::ErrorLength=E_FICUW_WS_174
     */
    public void setIUWMD_BD_MICRO_CD(java.lang.String IUWMD_BD_MICRO_CD) {
        this.IUWMD_BD_MICRO_CD = IUWMD_BD_MICRO_CD;
    }


    /**
     * Gets the IUWMD_BD_IFSC_CD value for this MandateVO.
     * 
     * @return IUWMD_BD_IFSC_CD   * MaxLength=11::ErrorLength=E_FICUW_WS_175
     */
    public java.lang.String getIUWMD_BD_IFSC_CD() {
        return IUWMD_BD_IFSC_CD;
    }


    /**
     * Sets the IUWMD_BD_IFSC_CD value for this MandateVO.
     * 
     * @param IUWMD_BD_IFSC_CD   * MaxLength=11::ErrorLength=E_FICUW_WS_175
     */
    public void setIUWMD_BD_IFSC_CD(java.lang.String IUWMD_BD_IFSC_CD) {
        this.IUWMD_BD_IFSC_CD = IUWMD_BD_IFSC_CD;
    }


    /**
     * Gets the IUWMD_BD_TRANS_NO value for this MandateVO.
     * 
     * @return IUWMD_BD_TRANS_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_176::MaxLength=20::ErrorLength=E_FICUW_WS_177
     */
    public java.lang.String getIUWMD_BD_TRANS_NO() {
        return IUWMD_BD_TRANS_NO;
    }


    /**
     * Sets the IUWMD_BD_TRANS_NO value for this MandateVO.
     * 
     * @param IUWMD_BD_TRANS_NO   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_176::MaxLength=20::ErrorLength=E_FICUW_WS_177
     */
    public void setIUWMD_BD_TRANS_NO(java.lang.String IUWMD_BD_TRANS_NO) {
        this.IUWMD_BD_TRANS_NO = IUWMD_BD_TRANS_NO;
    }


    /**
     * Gets the IUWMD_BD_CHARGES value for this MandateVO.
     * 
     * @return IUWMD_BD_CHARGES   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_178
     */
    public java.math.BigDecimal getIUWMD_BD_CHARGES() {
        return IUWMD_BD_CHARGES;
    }


    /**
     * Sets the IUWMD_BD_CHARGES value for this MandateVO.
     * 
     * @param IUWMD_BD_CHARGES   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_178
     */
    public void setIUWMD_BD_CHARGES(java.math.BigDecimal IUWMD_BD_CHARGES) {
        this.IUWMD_BD_CHARGES = IUWMD_BD_CHARGES;
    }


    /**
     * Gets the IUWMD_BD_AMOUNT value for this MandateVO.
     * 
     * @return IUWMD_BD_AMOUNT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_179::preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_180
     */
    public java.math.BigDecimal getIUWMD_BD_AMOUNT() {
        return IUWMD_BD_AMOUNT;
    }


    /**
     * Sets the IUWMD_BD_AMOUNT value for this MandateVO.
     * 
     * @param IUWMD_BD_AMOUNT   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_179::preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_180
     */
    public void setIUWMD_BD_AMOUNT(java.math.BigDecimal IUWMD_BD_AMOUNT) {
        this.IUWMD_BD_AMOUNT = IUWMD_BD_AMOUNT;
    }


    /**
     * Gets the IUWMD_BD_DT value for this MandateVO.
     * 
     * @return IUWMD_BD_DT
     */
    public java.lang.String getIUWMD_BD_DT() {
        return IUWMD_BD_DT;
    }


    /**
     * Sets the IUWMD_BD_DT value for this MandateVO.
     * 
     * @param IUWMD_BD_DT
     */
    public void setIUWMD_BD_DT(java.lang.String IUWMD_BD_DT) {
        this.IUWMD_BD_DT = IUWMD_BD_DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MandateVO)) return false;
        MandateVO other = (MandateVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWMD_MANDT_NO==null && other.getIUWMD_MANDT_NO()==null) || 
             (this.IUWMD_MANDT_NO!=null &&
              this.IUWMD_MANDT_NO.equals(other.getIUWMD_MANDT_NO()))) &&
            ((this.IUWMD_BD_CURRENCY==null && other.getIUWMD_BD_CURRENCY()==null) || 
             (this.IUWMD_BD_CURRENCY!=null &&
              this.IUWMD_BD_CURRENCY.equals(other.getIUWMD_BD_CURRENCY()))) &&
            ((this.IUWMD_BANK_CD==null && other.getIUWMD_BANK_CD()==null) || 
             (this.IUWMD_BANK_CD!=null &&
              this.IUWMD_BANK_CD.equals(other.getIUWMD_BANK_CD()))) &&
            ((this.IUWMD_AC_HOLD_NM1==null && other.getIUWMD_AC_HOLD_NM1()==null) || 
             (this.IUWMD_AC_HOLD_NM1!=null &&
              this.IUWMD_AC_HOLD_NM1.equals(other.getIUWMD_AC_HOLD_NM1()))) &&
            ((this.IUWMD_BD_MICRO_CD==null && other.getIUWMD_BD_MICRO_CD()==null) || 
             (this.IUWMD_BD_MICRO_CD!=null &&
              this.IUWMD_BD_MICRO_CD.equals(other.getIUWMD_BD_MICRO_CD()))) &&
            ((this.IUWMD_BD_IFSC_CD==null && other.getIUWMD_BD_IFSC_CD()==null) || 
             (this.IUWMD_BD_IFSC_CD!=null &&
              this.IUWMD_BD_IFSC_CD.equals(other.getIUWMD_BD_IFSC_CD()))) &&
            ((this.IUWMD_BD_TRANS_NO==null && other.getIUWMD_BD_TRANS_NO()==null) || 
             (this.IUWMD_BD_TRANS_NO!=null &&
              this.IUWMD_BD_TRANS_NO.equals(other.getIUWMD_BD_TRANS_NO()))) &&
            ((this.IUWMD_BD_CHARGES==null && other.getIUWMD_BD_CHARGES()==null) || 
             (this.IUWMD_BD_CHARGES!=null &&
              this.IUWMD_BD_CHARGES.equals(other.getIUWMD_BD_CHARGES()))) &&
            ((this.IUWMD_BD_AMOUNT==null && other.getIUWMD_BD_AMOUNT()==null) || 
             (this.IUWMD_BD_AMOUNT!=null &&
              this.IUWMD_BD_AMOUNT.equals(other.getIUWMD_BD_AMOUNT()))) &&
            ((this.IUWMD_BD_DT==null && other.getIUWMD_BD_DT()==null) || 
             (this.IUWMD_BD_DT!=null &&
              this.IUWMD_BD_DT.equals(other.getIUWMD_BD_DT())));
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
        if (getIUWMD_MANDT_NO() != null) {
            _hashCode += getIUWMD_MANDT_NO().hashCode();
        }
        if (getIUWMD_BD_CURRENCY() != null) {
            _hashCode += getIUWMD_BD_CURRENCY().hashCode();
        }
        if (getIUWMD_BANK_CD() != null) {
            _hashCode += getIUWMD_BANK_CD().hashCode();
        }
        if (getIUWMD_AC_HOLD_NM1() != null) {
            _hashCode += getIUWMD_AC_HOLD_NM1().hashCode();
        }
        if (getIUWMD_BD_MICRO_CD() != null) {
            _hashCode += getIUWMD_BD_MICRO_CD().hashCode();
        }
        if (getIUWMD_BD_IFSC_CD() != null) {
            _hashCode += getIUWMD_BD_IFSC_CD().hashCode();
        }
        if (getIUWMD_BD_TRANS_NO() != null) {
            _hashCode += getIUWMD_BD_TRANS_NO().hashCode();
        }
        if (getIUWMD_BD_CHARGES() != null) {
            _hashCode += getIUWMD_BD_CHARGES().hashCode();
        }
        if (getIUWMD_BD_AMOUNT() != null) {
            _hashCode += getIUWMD_BD_AMOUNT().hashCode();
        }
        if (getIUWMD_BD_DT() != null) {
            _hashCode += getIUWMD_BD_DT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MandateVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "mandateVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_MANDT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_MANDT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_CURRENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_CURRENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BANK_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BANK_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_AC_HOLD_NM1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_AC_HOLD_NM1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_MICRO_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_MICRO_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_IFSC_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_IFSC_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_TRANS_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_TRANS_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_CHARGES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_CHARGES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWMD_BD_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWMD_BD_DT"));
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
