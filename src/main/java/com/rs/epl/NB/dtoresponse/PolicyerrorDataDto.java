package com.rs.epl.NB.dtoresponse;

public class PolicyerrorDataDto {
	private String policyno;
	private String reciptno;
	private Long policyid;
	private long reciptid;
	private String status;
	private int attempt;
	private String errorcode;
	private String responsexml;	
	private String attemptTime;
	private String mfgname;
	
	private String productCode;
	
	public Long getPolicyid() {
		return policyid;
	}

	public void setPolicyid(Long policyid) {
		this.policyid = policyid;
	}
	
	
	public String getPolicyno() {
		return policyno;
	}
	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}
	public String getReciptno() {
		return reciptno;
	}
	public void setReciptno(String reciptno) {
		this.reciptno = reciptno;
	}
	public long getReciptid() {
		return reciptid;
	}
	public void setReciptid(long reciptid) {
		this.reciptid = reciptid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAttempt() {
		return attempt;
	}
	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getResponsexml() {
		return responsexml;
	}
	public void setResponsexml(String responsexml) {
		this.responsexml = responsexml;	
	}
	public String getAttemptTime() {
		return attemptTime;
	}
	public void setAttemptTime(String attemptTime) {
		this.attemptTime = attemptTime;
	}

	public String getMfgname() {
		return mfgname;
	}

	public void setMfgname(String mfgname) {
		this.mfgname = mfgname;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	

	
	
}
