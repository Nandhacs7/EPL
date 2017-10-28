/**
 * FguwResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.util.Arrays;

public class FguwResponseVO  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String oprId;

    private java.lang.String polNo;

    private java.lang.String endtNo;

    private java.lang.String prdCd;

    private java.lang.String errorMsg;

    private java.lang.String successMsg;

    private java.lang.String[] partyIDList;

    private com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO[] errorDetailVOList;

    public FguwResponseVO() {
    }

    public FguwResponseVO(
           java.lang.String status,
           java.lang.String oprId,
           java.lang.String polNo,
           java.lang.String endtNo,
           java.lang.String prdCd,
           java.lang.String errorMsg,
           java.lang.String successMsg,
           java.lang.String[] partyIDList,
           com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO[] errorDetailVOList) {
           this.status = status;
           this.oprId = oprId;
           this.polNo = polNo;
           this.endtNo = endtNo;
           this.prdCd = prdCd;
           this.errorMsg = errorMsg;
           this.successMsg = successMsg;
           this.partyIDList = partyIDList;
           this.errorDetailVOList = errorDetailVOList;
    }


    /**
     * Gets the status value for this FguwResponseVO.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FguwResponseVO.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the oprId value for this FguwResponseVO.
     * 
     * @return oprId
     */
    public java.lang.String getOprId() {
        return oprId;
    }


    /**
     * Sets the oprId value for this FguwResponseVO.
     * 
     * @param oprId
     */
    public void setOprId(java.lang.String oprId) {
        this.oprId = oprId;
    }


    /**
     * Gets the polNo value for this FguwResponseVO.
     * 
     * @return polNo
     */
    public java.lang.String getPolNo() {
        return polNo;
    }


    /**
     * Sets the polNo value for this FguwResponseVO.
     * 
     * @param polNo
     */
    public void setPolNo(java.lang.String polNo) {
        this.polNo = polNo;
    }


    /**
     * Gets the endtNo value for this FguwResponseVO.
     * 
     * @return endtNo
     */
    public java.lang.String getEndtNo() {
        return endtNo;
    }


    /**
     * Sets the endtNo value for this FguwResponseVO.
     * 
     * @param endtNo
     */
    public void setEndtNo(java.lang.String endtNo) {
        this.endtNo = endtNo;
    }


    /**
     * Gets the prdCd value for this FguwResponseVO.
     * 
     * @return prdCd
     */
    public java.lang.String getPrdCd() {
        return prdCd;
    }


    /**
     * Sets the prdCd value for this FguwResponseVO.
     * 
     * @param prdCd
     */
    public void setPrdCd(java.lang.String prdCd) {
        this.prdCd = prdCd;
    }


    /**
     * Gets the errorMsg value for this FguwResponseVO.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this FguwResponseVO.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the successMsg value for this FguwResponseVO.
     * 
     * @return successMsg
     */
    public java.lang.String getSuccessMsg() {
        return successMsg;
    }


    /**
     * Sets the successMsg value for this FguwResponseVO.
     * 
     * @param successMsg
     */
    public void setSuccessMsg(java.lang.String successMsg) {
        this.successMsg = successMsg;
    }


    /**
     * Gets the partyIDList value for this FguwResponseVO.
     * 
     * @return partyIDList
     */
    public java.lang.String[] getPartyIDList() {
        return partyIDList;
    }


    /**
     * Sets the partyIDList value for this FguwResponseVO.
     * 
     * @param partyIDList
     */
    public void setPartyIDList(java.lang.String[] partyIDList) {
        this.partyIDList = partyIDList;
    }

    public java.lang.String getPartyIDList(int i) {
        return this.partyIDList[i];
    }

    public void setPartyIDList(int i, java.lang.String _value) {
        this.partyIDList[i] = _value;
    }


    /**
     * Gets the errorDetailVOList value for this FguwResponseVO.
     * 
     * @return errorDetailVOList
     */
    public com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO[] getErrorDetailVOList() {
        return errorDetailVOList;
    }


    /**
     * Sets the errorDetailVOList value for this FguwResponseVO.
     * 
     * @param errorDetailVOList
     */
    public void setErrorDetailVOList(com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO[] errorDetailVOList) {
        this.errorDetailVOList = errorDetailVOList;
    }

    public com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO getErrorDetailVOList(int i) {
        return this.errorDetailVOList[i];
    }

    public void setErrorDetailVOList(int i, com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO _value) {
        this.errorDetailVOList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FguwResponseVO)) return false;
        FguwResponseVO other = (FguwResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.oprId==null && other.getOprId()==null) || 
             (this.oprId!=null &&
              this.oprId.equals(other.getOprId()))) &&
            ((this.polNo==null && other.getPolNo()==null) || 
             (this.polNo!=null &&
              this.polNo.equals(other.getPolNo()))) &&
            ((this.endtNo==null && other.getEndtNo()==null) || 
             (this.endtNo!=null &&
              this.endtNo.equals(other.getEndtNo()))) &&
            ((this.prdCd==null && other.getPrdCd()==null) || 
             (this.prdCd!=null &&
              this.prdCd.equals(other.getPrdCd()))) &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.successMsg==null && other.getSuccessMsg()==null) || 
             (this.successMsg!=null &&
              this.successMsg.equals(other.getSuccessMsg()))) &&
            ((this.partyIDList==null && other.getPartyIDList()==null) || 
             (this.partyIDList!=null &&
              java.util.Arrays.equals(this.partyIDList, other.getPartyIDList()))) &&
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOprId() != null) {
            _hashCode += getOprId().hashCode();
        }
        if (getPolNo() != null) {
            _hashCode += getPolNo().hashCode();
        }
        if (getEndtNo() != null) {
            _hashCode += getEndtNo().hashCode();
        }
        if (getPrdCd() != null) {
            _hashCode += getPrdCd().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getSuccessMsg() != null) {
            _hashCode += getSuccessMsg().hashCode();
        }
        if (getPartyIDList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartyIDList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartyIDList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(FguwResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "fguwResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oprId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oprId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "polNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endtNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endtNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prdCd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prdCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIDList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partyIDList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDetailVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDetailVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "errorDetailVO"));
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

	@Override
	public String toString() {
		return "FguwResponseVO [status=" + status + ", oprId=" + oprId + ", polNo=" + polNo + ", endtNo=" + endtNo
				+ ", prdCd=" + prdCd + ", errorMsg=" + errorMsg + ", successMsg=" + successMsg + ", partyIDList="
				+ Arrays.toString(partyIDList) + ", errorDetailVOList=" + Arrays.toString(errorDetailVOList)
				+ ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc + "]";
	}

}
