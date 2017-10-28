/**
 * 
 */
package com.firstapex.rs.epl.cn.common;

import java.util.Date;

/**
 * @author lokeshm
 *
 */
public class EplCommon {
	private String policyNumber;
	private String endtno;
	private String endtType;
	private String endtReason;
	private Date endtDateTime;
	private String endtUser;
	private String lob;
	private String sellingProductName;
	private String fgProductCode;
	private String fgProductName;
	private String[] errorCodes;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getEndtno() {
		return endtno;
	}
	public void setEndtno(String endtno) {
		this.endtno = endtno;
	}
	public String getEndtType() {
		return endtType;
	}
	public void setEndtType(String endtType) {
		this.endtType = endtType;
	}
	public String getEndtReason() {
		return endtReason;
	}
	public void setEndtReason(String endtReason) {
		this.endtReason = endtReason;
	}
	public Date getEndtDateTime() {
		return endtDateTime;
	}
	public void setEndtDateTime(Date endtDateTime) {
		this.endtDateTime = endtDateTime;
	}
	public String getEndtUser() {
		return endtUser;
	}
	public void setEndtUser(String endtUser) {
		this.endtUser = endtUser;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getSellingProductName() {
		return sellingProductName;
	}
	public void setSellingProductName(String sellingProductName) {
		this.sellingProductName = sellingProductName;
	}
	public String getFgProductCode() {
		return fgProductCode;
	}
	public void setFgProductCode(String fgProductCode) {
		this.fgProductCode = fgProductCode;
	}
	public String getFgProductName() {
		return fgProductName;
	}
	public void setFgProductName(String fgProductName) {
		this.fgProductName = fgProductName;
	}
	public String[] getErrorCodes() {
		return errorCodes;
	}
	public void setErrorCodes(String[] errorCodes) {
		this.errorCodes = errorCodes;
	}

}
