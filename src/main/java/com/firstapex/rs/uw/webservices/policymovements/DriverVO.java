/**
 * DriverVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.math.BigDecimal;

public class DriverVO  implements java.io.Serializable {
    /* MaxLength=2::ErrorLength=E_FICUW_WS_153 */
    private java.lang.String IUWP2_DRV_NO;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_154::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_027 */
    private java.lang.String IUWP2_DRV_CD;

    /* preDecimalPrecision=2::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_155 */
    private Integer IUWP2_DRV_AGE=new Integer(0);

    /* MaxLength=1::ErrorLength=E_FICUW_WS_156 */
    private java.lang.String IUWP2_DRV_GENDER_CD;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_157 */
    private java.lang.String IUWP2_DRV_NM;

    private java.lang.String IUWP2_DRV_LICN_ISS_DT;

    private java.lang.String IUWP2_DRV_DOB;

    /* MaxLength=20::ErrorLength=E_FICUW_WS_158 */
    private java.lang.String IUWP2_DRV_ADDR;

    /* MaxLength=20::ErrorLength=E_FICUW_WS_159 */
    private java.math.BigDecimal IUWP2_DRV_YR_EXP=new BigDecimal(0);

    /* MaxLength=20::ErrorLength=E_FICUW_WS_160 */
    private java.lang.String IUWP2_DRV_LICN_EXPIRY_DT;

    public DriverVO() {
    }

    public DriverVO(
           java.lang.String IUWP2_DRV_NO,
           java.lang.String IUWP2_DRV_CD,
           Integer IUWP2_DRV_AGE,
           java.lang.String IUWP2_DRV_GENDER_CD,
           java.lang.String IUWP2_DRV_NM,
           java.lang.String IUWP2_DRV_LICN_ISS_DT,
           java.lang.String IUWP2_DRV_DOB,
           java.lang.String IUWP2_DRV_ADDR,
           java.math.BigDecimal IUWP2_DRV_YR_EXP,
           java.lang.String IUWP2_DRV_LICN_EXPIRY_DT) {
           this.IUWP2_DRV_NO = IUWP2_DRV_NO;
           this.IUWP2_DRV_CD = IUWP2_DRV_CD;
           this.IUWP2_DRV_AGE = IUWP2_DRV_AGE;
           this.IUWP2_DRV_GENDER_CD = IUWP2_DRV_GENDER_CD;
           this.IUWP2_DRV_NM = IUWP2_DRV_NM;
           this.IUWP2_DRV_LICN_ISS_DT = IUWP2_DRV_LICN_ISS_DT;
           this.IUWP2_DRV_DOB = IUWP2_DRV_DOB;
           this.IUWP2_DRV_ADDR = IUWP2_DRV_ADDR;
           this.IUWP2_DRV_YR_EXP = IUWP2_DRV_YR_EXP;
           this.IUWP2_DRV_LICN_EXPIRY_DT = IUWP2_DRV_LICN_EXPIRY_DT;
    }


    /**
     * Gets the IUWP2_DRV_NO value for this DriverVO.
     * 
     * @return IUWP2_DRV_NO   * MaxLength=2::ErrorLength=E_FICUW_WS_153
     */
    public java.lang.String getIUWP2_DRV_NO() {
        return IUWP2_DRV_NO;
    }


    /**
     * Sets the IUWP2_DRV_NO value for this DriverVO.
     * 
     * @param IUWP2_DRV_NO   * MaxLength=2::ErrorLength=E_FICUW_WS_153
     */
    public void setIUWP2_DRV_NO(java.lang.String IUWP2_DRV_NO) {
        this.IUWP2_DRV_NO = IUWP2_DRV_NO;
    }


    /**
     * Gets the IUWP2_DRV_CD value for this DriverVO.
     * 
     * @return IUWP2_DRV_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_154::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_027
     */
    public java.lang.String getIUWP2_DRV_CD() {
        return IUWP2_DRV_CD;
    }


    /**
     * Sets the IUWP2_DRV_CD value for this DriverVO.
     * 
     * @param IUWP2_DRV_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_154::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_027
     */
    public void setIUWP2_DRV_CD(java.lang.String IUWP2_DRV_CD) {
        this.IUWP2_DRV_CD = IUWP2_DRV_CD;
    }


    /**
     * Gets the IUWP2_DRV_AGE value for this DriverVO.
     * 
     * @return IUWP2_DRV_AGE   * preDecimalPrecision=2::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_155
     */
    public Integer getIUWP2_DRV_AGE() {
        return IUWP2_DRV_AGE;
    }


    /**
     * Sets the IUWP2_DRV_AGE value for this DriverVO.
     * 
     * @param IUWP2_DRV_AGE   * preDecimalPrecision=2::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_155
     */
    public void setIUWP2_DRV_AGE(Integer IUWP2_DRV_AGE) {
        this.IUWP2_DRV_AGE = IUWP2_DRV_AGE;
    }


    /**
     * Gets the IUWP2_DRV_GENDER_CD value for this DriverVO.
     * 
     * @return IUWP2_DRV_GENDER_CD   * MaxLength=1::ErrorLength=E_FICUW_WS_156
     */
    public java.lang.String getIUWP2_DRV_GENDER_CD() {
        return IUWP2_DRV_GENDER_CD;
    }


    /**
     * Sets the IUWP2_DRV_GENDER_CD value for this DriverVO.
     * 
     * @param IUWP2_DRV_GENDER_CD   * MaxLength=1::ErrorLength=E_FICUW_WS_156
     */
    public void setIUWP2_DRV_GENDER_CD(java.lang.String IUWP2_DRV_GENDER_CD) {
        this.IUWP2_DRV_GENDER_CD = IUWP2_DRV_GENDER_CD;
    }


    /**
     * Gets the IUWP2_DRV_NM value for this DriverVO.
     * 
     * @return IUWP2_DRV_NM   * MaxLength=40::ErrorLength=E_FICUW_WS_157
     */
    public java.lang.String getIUWP2_DRV_NM() {
        return IUWP2_DRV_NM;
    }


    /**
     * Sets the IUWP2_DRV_NM value for this DriverVO.
     * 
     * @param IUWP2_DRV_NM   * MaxLength=40::ErrorLength=E_FICUW_WS_157
     */
    public void setIUWP2_DRV_NM(java.lang.String IUWP2_DRV_NM) {
        this.IUWP2_DRV_NM = IUWP2_DRV_NM;
    }


    /**
     * Gets the IUWP2_DRV_LICN_ISS_DT value for this DriverVO.
     * 
     * @return IUWP2_DRV_LICN_ISS_DT
     */
    public java.lang.String getIUWP2_DRV_LICN_ISS_DT() {
        return IUWP2_DRV_LICN_ISS_DT;
    }


    /**
     * Sets the IUWP2_DRV_LICN_ISS_DT value for this DriverVO.
     * 
     * @param IUWP2_DRV_LICN_ISS_DT
     */
    public void setIUWP2_DRV_LICN_ISS_DT(java.lang.String IUWP2_DRV_LICN_ISS_DT) {
        this.IUWP2_DRV_LICN_ISS_DT = IUWP2_DRV_LICN_ISS_DT;
    }


    /**
     * Gets the IUWP2_DRV_DOB value for this DriverVO.
     * 
     * @return IUWP2_DRV_DOB
     */
    public java.lang.String getIUWP2_DRV_DOB() {
        return IUWP2_DRV_DOB;
    }


    /**
     * Sets the IUWP2_DRV_DOB value for this DriverVO.
     * 
     * @param IUWP2_DRV_DOB
     */
    public void setIUWP2_DRV_DOB(java.lang.String IUWP2_DRV_DOB) {
        this.IUWP2_DRV_DOB = IUWP2_DRV_DOB;
    }


    /**
     * Gets the IUWP2_DRV_ADDR value for this DriverVO.
     * 
     * @return IUWP2_DRV_ADDR   * MaxLength=20::ErrorLength=E_FICUW_WS_158
     */
    public java.lang.String getIUWP2_DRV_ADDR() {
        return IUWP2_DRV_ADDR;
    }


    /**
     * Sets the IUWP2_DRV_ADDR value for this DriverVO.
     * 
     * @param IUWP2_DRV_ADDR   * MaxLength=20::ErrorLength=E_FICUW_WS_158
     */
    public void setIUWP2_DRV_ADDR(java.lang.String IUWP2_DRV_ADDR) {
        this.IUWP2_DRV_ADDR = IUWP2_DRV_ADDR;
    }


    /**
     * Gets the IUWP2_DRV_YR_EXP value for this DriverVO.
     * 
     * @return IUWP2_DRV_YR_EXP   * MaxLength=20::ErrorLength=E_FICUW_WS_159
     */
    public java.math.BigDecimal getIUWP2_DRV_YR_EXP() {
        return IUWP2_DRV_YR_EXP;
    }


    /**
     * Sets the IUWP2_DRV_YR_EXP value for this DriverVO.
     * 
     * @param IUWP2_DRV_YR_EXP   * MaxLength=20::ErrorLength=E_FICUW_WS_159
     */
    public void setIUWP2_DRV_YR_EXP(java.math.BigDecimal IUWP2_DRV_YR_EXP) {
        this.IUWP2_DRV_YR_EXP = IUWP2_DRV_YR_EXP;
    }


    /**
     * Gets the IUWP2_DRV_LICN_EXPIRY_DT value for this DriverVO.
     * 
     * @return IUWP2_DRV_LICN_EXPIRY_DT   * MaxLength=20::ErrorLength=E_FICUW_WS_160
     */
    public java.lang.String getIUWP2_DRV_LICN_EXPIRY_DT() {
        return IUWP2_DRV_LICN_EXPIRY_DT;
    }


    /**
     * Sets the IUWP2_DRV_LICN_EXPIRY_DT value for this DriverVO.
     * 
     * @param IUWP2_DRV_LICN_EXPIRY_DT   * MaxLength=20::ErrorLength=E_FICUW_WS_160
     */
    public void setIUWP2_DRV_LICN_EXPIRY_DT(java.lang.String IUWP2_DRV_LICN_EXPIRY_DT) {
        this.IUWP2_DRV_LICN_EXPIRY_DT = IUWP2_DRV_LICN_EXPIRY_DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DriverVO)) return false;
        DriverVO other = (DriverVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP2_DRV_NO==null && other.getIUWP2_DRV_NO()==null) || 
             (this.IUWP2_DRV_NO!=null &&
              this.IUWP2_DRV_NO.equals(other.getIUWP2_DRV_NO()))) &&
            ((this.IUWP2_DRV_CD==null && other.getIUWP2_DRV_CD()==null) || 
             (this.IUWP2_DRV_CD!=null &&
              this.IUWP2_DRV_CD.equals(other.getIUWP2_DRV_CD()))) &&
            ((this.IUWP2_DRV_AGE==null && other.getIUWP2_DRV_AGE()==null) || 
             (this.IUWP2_DRV_AGE!=null &&
              this.IUWP2_DRV_AGE.equals(other.getIUWP2_DRV_AGE()))) &&
            ((this.IUWP2_DRV_GENDER_CD==null && other.getIUWP2_DRV_GENDER_CD()==null) || 
             (this.IUWP2_DRV_GENDER_CD!=null &&
              this.IUWP2_DRV_GENDER_CD.equals(other.getIUWP2_DRV_GENDER_CD()))) &&
            ((this.IUWP2_DRV_NM==null && other.getIUWP2_DRV_NM()==null) || 
             (this.IUWP2_DRV_NM!=null &&
              this.IUWP2_DRV_NM.equals(other.getIUWP2_DRV_NM()))) &&
            ((this.IUWP2_DRV_LICN_ISS_DT==null && other.getIUWP2_DRV_LICN_ISS_DT()==null) || 
             (this.IUWP2_DRV_LICN_ISS_DT!=null &&
              this.IUWP2_DRV_LICN_ISS_DT.equals(other.getIUWP2_DRV_LICN_ISS_DT()))) &&
            ((this.IUWP2_DRV_DOB==null && other.getIUWP2_DRV_DOB()==null) || 
             (this.IUWP2_DRV_DOB!=null &&
              this.IUWP2_DRV_DOB.equals(other.getIUWP2_DRV_DOB()))) &&
            ((this.IUWP2_DRV_ADDR==null && other.getIUWP2_DRV_ADDR()==null) || 
             (this.IUWP2_DRV_ADDR!=null &&
              this.IUWP2_DRV_ADDR.equals(other.getIUWP2_DRV_ADDR()))) &&
            ((this.IUWP2_DRV_YR_EXP==null && other.getIUWP2_DRV_YR_EXP()==null) || 
             (this.IUWP2_DRV_YR_EXP!=null &&
              this.IUWP2_DRV_YR_EXP.equals(other.getIUWP2_DRV_YR_EXP()))) &&
            ((this.IUWP2_DRV_LICN_EXPIRY_DT==null && other.getIUWP2_DRV_LICN_EXPIRY_DT()==null) || 
             (this.IUWP2_DRV_LICN_EXPIRY_DT!=null &&
              this.IUWP2_DRV_LICN_EXPIRY_DT.equals(other.getIUWP2_DRV_LICN_EXPIRY_DT())));
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
        if (getIUWP2_DRV_NO() != null) {
            _hashCode += getIUWP2_DRV_NO().hashCode();
        }
        if (getIUWP2_DRV_CD() != null) {
            _hashCode += getIUWP2_DRV_CD().hashCode();
        }
        if (getIUWP2_DRV_AGE() != null) {
            _hashCode += getIUWP2_DRV_AGE().hashCode();
        }
        if (getIUWP2_DRV_GENDER_CD() != null) {
            _hashCode += getIUWP2_DRV_GENDER_CD().hashCode();
        }
        if (getIUWP2_DRV_NM() != null) {
            _hashCode += getIUWP2_DRV_NM().hashCode();
        }
        if (getIUWP2_DRV_LICN_ISS_DT() != null) {
            _hashCode += getIUWP2_DRV_LICN_ISS_DT().hashCode();
        }
        if (getIUWP2_DRV_DOB() != null) {
            _hashCode += getIUWP2_DRV_DOB().hashCode();
        }
        if (getIUWP2_DRV_ADDR() != null) {
            _hashCode += getIUWP2_DRV_ADDR().hashCode();
        }
        if (getIUWP2_DRV_YR_EXP() != null) {
            _hashCode += getIUWP2_DRV_YR_EXP().hashCode();
        }
        if (getIUWP2_DRV_LICN_EXPIRY_DT() != null) {
            _hashCode += getIUWP2_DRV_LICN_EXPIRY_DT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DriverVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "driverVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_AGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_AGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_GENDER_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_GENDER_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_NM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_NM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_LICN_ISS_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_LICN_ISS_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_ADDR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_ADDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_YR_EXP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_YR_EXP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DRV_LICN_EXPIRY_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DRV_LICN_EXPIRY_DT"));
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
