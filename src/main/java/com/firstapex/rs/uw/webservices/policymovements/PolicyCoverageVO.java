/**
 * PolicyCoverageVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.math.BigDecimal;

public class PolicyCoverageVO  implements java.io.Serializable {
    /* MaxLength=6::ErrorLength=E_FICUW_WS_061 */
    private java.lang.String IUWP4_COVG_CD;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_062 */
    private java.lang.String IUWP4_PREM_CURR;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_062 */
    private java.math.BigDecimal IUWP4_PREM_CURR_RATE=new BigDecimal(0);

    /* preDecimalPrecision=21::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_063 */
    private java.math.BigDecimal primeIUWP4_NEW_INCR_PREM=new BigDecimal(0);

    public PolicyCoverageVO() {
    }

    public PolicyCoverageVO(
           java.lang.String IUWP4_COVG_CD,
           java.lang.String IUWP4_PREM_CURR,
           java.math.BigDecimal IUWP4_PREM_CURR_RATE,
           java.math.BigDecimal primeIUWP4_NEW_INCR_PREM) {
           this.IUWP4_COVG_CD = IUWP4_COVG_CD;
           this.IUWP4_PREM_CURR = IUWP4_PREM_CURR;
           this.IUWP4_PREM_CURR_RATE = IUWP4_PREM_CURR_RATE;
           this.primeIUWP4_NEW_INCR_PREM = primeIUWP4_NEW_INCR_PREM;
    }


    /**
     * Gets the IUWP4_COVG_CD value for this PolicyCoverageVO.
     * 
     * @return IUWP4_COVG_CD   * MaxLength=6::ErrorLength=E_FICUW_WS_061
     */
    public java.lang.String getIUWP4_COVG_CD() {
        return IUWP4_COVG_CD;
    }


    /**
     * Sets the IUWP4_COVG_CD value for this PolicyCoverageVO.
     * 
     * @param IUWP4_COVG_CD   * MaxLength=6::ErrorLength=E_FICUW_WS_061
     */
    public void setIUWP4_COVG_CD(java.lang.String IUWP4_COVG_CD) {
        this.IUWP4_COVG_CD = IUWP4_COVG_CD;
    }


    /**
     * Gets the IUWP4_PREM_CURR value for this PolicyCoverageVO.
     * 
     * @return IUWP4_PREM_CURR   * MaxLength=4::ErrorLength=E_FICUW_WS_062
     */
    public java.lang.String getIUWP4_PREM_CURR() {
        return IUWP4_PREM_CURR;
    }


    /**
     * Sets the IUWP4_PREM_CURR value for this PolicyCoverageVO.
     * 
     * @param IUWP4_PREM_CURR   * MaxLength=4::ErrorLength=E_FICUW_WS_062
     */
    public void setIUWP4_PREM_CURR(java.lang.String IUWP4_PREM_CURR) {
        this.IUWP4_PREM_CURR = IUWP4_PREM_CURR;
    }


    /**
     * Gets the IUWP4_PREM_CURR_RATE value for this PolicyCoverageVO.
     * 
     * @return IUWP4_PREM_CURR_RATE   * MaxLength=4::ErrorLength=E_FICUW_WS_062
     */
    public java.math.BigDecimal getIUWP4_PREM_CURR_RATE() {
        return IUWP4_PREM_CURR_RATE;
    }


    /**
     * Sets the IUWP4_PREM_CURR_RATE value for this PolicyCoverageVO.
     * 
     * @param IUWP4_PREM_CURR_RATE   * MaxLength=4::ErrorLength=E_FICUW_WS_062
     */
    public void setIUWP4_PREM_CURR_RATE(java.math.BigDecimal IUWP4_PREM_CURR_RATE) {
        this.IUWP4_PREM_CURR_RATE = IUWP4_PREM_CURR_RATE;
    }


    /**
     * Gets the IUWP4_NEW_INCR_PREM value for this PolicyCoverageVO.
     * 
     * @return IUWP4_NEW_INCR_PREM   * preDecimalPrecision=21::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_063
     */
    public java.math.BigDecimal getPrimeIUWP4_NEW_INCR_PREM() {
        return primeIUWP4_NEW_INCR_PREM;
    }


    /**
     * Sets the IUWP4_NEW_INCR_PREM value for this PolicyCoverageVO.
     * 
     * @param IUWP4_NEW_INCR_PREM   * preDecimalPrecision=21::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_063
     */
    public void setPrimeIUWP4_NEW_INCR_PREM(java.math.BigDecimal primeIUWP4_NEW_INCR_PREM) {
        this.primeIUWP4_NEW_INCR_PREM = primeIUWP4_NEW_INCR_PREM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyCoverageVO)) return false;
        PolicyCoverageVO other = (PolicyCoverageVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP4_COVG_CD==null && other.getIUWP4_COVG_CD()==null) || 
             (this.IUWP4_COVG_CD!=null &&
              this.IUWP4_COVG_CD.equals(other.getIUWP4_COVG_CD()))) &&
            ((this.IUWP4_PREM_CURR==null && other.getIUWP4_PREM_CURR()==null) || 
             (this.IUWP4_PREM_CURR!=null &&
              this.IUWP4_PREM_CURR.equals(other.getIUWP4_PREM_CURR()))) &&
            ((this.IUWP4_PREM_CURR_RATE==null && other.getIUWP4_PREM_CURR_RATE()==null) || 
             (this.IUWP4_PREM_CURR_RATE!=null &&
              this.IUWP4_PREM_CURR_RATE.equals(other.getIUWP4_PREM_CURR_RATE()))) &&
            ((this.primeIUWP4_NEW_INCR_PREM==null && other.getPrimeIUWP4_NEW_INCR_PREM()==null) || 
             (this.primeIUWP4_NEW_INCR_PREM!=null &&
              this.primeIUWP4_NEW_INCR_PREM.equals(other.getPrimeIUWP4_NEW_INCR_PREM())));
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
        if (getIUWP4_COVG_CD() != null) {
            _hashCode += getIUWP4_COVG_CD().hashCode();
        }
        if (getIUWP4_PREM_CURR() != null) {
            _hashCode += getIUWP4_PREM_CURR().hashCode();
        }
        if (getIUWP4_PREM_CURR_RATE() != null) {
            _hashCode += getIUWP4_PREM_CURR_RATE().hashCode();
        }
        if (getPrimeIUWP4_NEW_INCR_PREM() != null) {
            _hashCode += getPrimeIUWP4_NEW_INCR_PREM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyCoverageVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "policyCoverageVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP4_COVG_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP4_COVG_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP4_PREM_CURR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP4_PREM_CURR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP4_PREM_CURR_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP4_PREM_CURR_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeIUWP4_NEW_INCR_PREM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeIUWP4_NEW_INCR_PREM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
