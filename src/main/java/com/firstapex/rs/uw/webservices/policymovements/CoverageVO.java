/**
 * CoverageVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

public class CoverageVO  implements java.io.Serializable {
    /* MaxLength=6::ErrorLength=E_FICUW_WS_098 */
    private java.lang.String IUWP3_COVG_CD;

    /* preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_099 */
    private java.math.BigDecimal primeIUWP3_INCR_SI;

    /* preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_100 */
    private java.math.BigDecimal primeIUWP3_INCR_PREM;

    /* preDecimalPrecision=2::postDecimalPrecision=1::ErrorPrecision=E_FICUW_WS_101 */
    private java.math.BigDecimal IUWP3_DEDUCTIBLE_AMT;
    
    private java.lang.String IUWP3_RT_U;
    
    

	public CoverageVO() {
    }

    public CoverageVO(
           java.lang.String IUWP3_COVG_CD,
           java.math.BigDecimal primeIUWP3_INCR_SI,
           java.math.BigDecimal primeIUWP3_INCR_PREM,
           java.math.BigDecimal IUWP3_DEDUCTIBLE_AMT) {
           this.IUWP3_COVG_CD = IUWP3_COVG_CD;
           this.primeIUWP3_INCR_SI = primeIUWP3_INCR_SI;
           this.primeIUWP3_INCR_PREM = primeIUWP3_INCR_PREM;
           this.IUWP3_DEDUCTIBLE_AMT = IUWP3_DEDUCTIBLE_AMT;
    }


    /**
     * Gets the IUWP3_COVG_CD value for this CoverageVO.
     * 
     * @return IUWP3_COVG_CD   * MaxLength=6::ErrorLength=E_FICUW_WS_098
     */
    public java.lang.String getIUWP3_COVG_CD() {
        return IUWP3_COVG_CD;
    }


    /**
     * Sets the IUWP3_COVG_CD value for this CoverageVO.
     * 
     * @param IUWP3_COVG_CD   * MaxLength=6::ErrorLength=E_FICUW_WS_098
     */
    public void setIUWP3_COVG_CD(java.lang.String IUWP3_COVG_CD) {
        this.IUWP3_COVG_CD = IUWP3_COVG_CD;
    }


    /**
     * Gets the primeIUWP3_INCR_SI value for this CoverageVO.
     * 
     * @return primeIUWP3_INCR_SI   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_099
     */
    public java.math.BigDecimal getPrimeIUWP3_INCR_SI() {
        return primeIUWP3_INCR_SI;
    }


    /**
     * Sets the primeIUWP3_INCR_SI value for this CoverageVO.
     * 
     * @param primeIUWP3_INCR_SI   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_099
     */
    public void setPrimeIUWP3_INCR_SI(java.math.BigDecimal primeIUWP3_INCR_SI) {
        this.primeIUWP3_INCR_SI = primeIUWP3_INCR_SI;
    }


    /**
     * Gets the primeIUWP3_INCR_PREM value for this CoverageVO.
     * 
     * @return primeIUWP3_INCR_PREM   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_100
     */
    public java.math.BigDecimal getPrimeIUWP3_INCR_PREM() {
        return primeIUWP3_INCR_PREM;
    }


    /**
     * Sets the primeIUWP3_INCR_PREM value for this CoverageVO.
     * 
     * @param primeIUWP3_INCR_PREM   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_100
     */
    public void setPrimeIUWP3_INCR_PREM(java.math.BigDecimal primeIUWP3_INCR_PREM) {
        this.primeIUWP3_INCR_PREM = primeIUWP3_INCR_PREM;
    }


    /**
     * Gets the IUWP3_DEDUCTIBLE_AMT value for this CoverageVO.
     * 
     * @return IUWP3_DEDUCTIBLE_AMT   * preDecimalPrecision=2::postDecimalPrecision=1::ErrorPrecision=E_FICUW_WS_101
     */
    public java.math.BigDecimal getIUWP3_DEDUCTIBLE_AMT() {
        return IUWP3_DEDUCTIBLE_AMT;
    }

    
    public java.lang.String getIUWP3_RT_U() {
		return IUWP3_RT_U;
	}

	public void setIUWP3_RT_U(java.lang.String iUWP3_RT_U) {
		IUWP3_RT_U = iUWP3_RT_U;
	} 
    

    /**
     * Sets the IUWP3_DEDUCTIBLE_AMT value for this CoverageVO.
     * 
     * @param IUWP3_DEDUCTIBLE_AMT   * preDecimalPrecision=2::postDecimalPrecision=1::ErrorPrecision=E_FICUW_WS_101
     */
    public void setIUWP3_DEDUCTIBLE_AMT(java.math.BigDecimal IUWP3_DEDUCTIBLE_AMT) {
        this.IUWP3_DEDUCTIBLE_AMT = IUWP3_DEDUCTIBLE_AMT;
    }
    
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoverageVO)) return false;
        CoverageVO other = (CoverageVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP3_COVG_CD==null && other.getIUWP3_COVG_CD()==null) || 
             (this.IUWP3_COVG_CD!=null &&
              this.IUWP3_COVG_CD.equals(other.getIUWP3_COVG_CD()))) &&
            ((this.primeIUWP3_INCR_SI==null && other.getPrimeIUWP3_INCR_SI()==null) || 
             (this.primeIUWP3_INCR_SI!=null &&
              this.primeIUWP3_INCR_SI.equals(other.getPrimeIUWP3_INCR_SI()))) &&
            ((this.primeIUWP3_INCR_PREM==null && other.getPrimeIUWP3_INCR_PREM()==null) || 
             (this.primeIUWP3_INCR_PREM!=null &&
              this.primeIUWP3_INCR_PREM.equals(other.getPrimeIUWP3_INCR_PREM()))) &&
            ((this.IUWP3_DEDUCTIBLE_AMT==null && other.getIUWP3_DEDUCTIBLE_AMT()==null) || 
             (this.IUWP3_DEDUCTIBLE_AMT!=null &&
              this.IUWP3_DEDUCTIBLE_AMT.equals(other.getIUWP3_DEDUCTIBLE_AMT())));
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
        if (getIUWP3_COVG_CD() != null) {
            _hashCode += getIUWP3_COVG_CD().hashCode();
        }
        if (getPrimeIUWP3_INCR_SI() != null) {
            _hashCode += getPrimeIUWP3_INCR_SI().hashCode();
        }
        if (getPrimeIUWP3_INCR_PREM() != null) {
            _hashCode += getPrimeIUWP3_INCR_PREM().hashCode();
        }
        if (getIUWP3_DEDUCTIBLE_AMT() != null) {
            _hashCode += getIUWP3_DEDUCTIBLE_AMT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoverageVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "coverageVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP3_COVG_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP3_COVG_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeIUWP3_INCR_SI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeIUWP3_INCR_SI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeIUWP3_INCR_PREM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeIUWP3_INCR_PREM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP3_DEDUCTIBLE_AMT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP3_DEDUCTIBLE_AMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
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
