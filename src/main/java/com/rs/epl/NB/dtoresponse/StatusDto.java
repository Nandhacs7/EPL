package com.rs.epl.NB.dtoresponse;



public class StatusDto {
	
	private String policyno;
	
	private String receiptno;
	
	private String receipt_status; 
	
	private String  policy_status; 

	private String receipt_errordetails;
	
	private String   policy_errordeatils;
	
	private String receipt_attempt_time;
	
	private String  policy_attempt_time;
	
	private String   productcode;
	
	private String mfgname;
	
	private String  fromsysystem;

	public String getPolicyno() {
		return policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public String getReceiptno() {
		return receiptno;
	}

	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}

	public String getReceipt_status() {
		return receipt_status;
	}

	public void setReceipt_status(String receipt_status) {
		this.receipt_status = receipt_status;
	}

	public String getPolicy_status() {
		return policy_status;
	}

	public void setPolicy_status(String policy_status) {
		this.policy_status = policy_status;
	}

	public String getReceipt_errordetails() {
		return receipt_errordetails;
	}

	public void setReceipt_errordetails(String receipt_errordetails) {
		this.receipt_errordetails = receipt_errordetails;
	}

	public String getPolicy_errordeatils() {
		return policy_errordeatils;
	}

	public void setPolicy_errordeatils(String policy_errordeatils) {
		this.policy_errordeatils = policy_errordeatils;
	}

	public String getReceipt_attempt_time() {
		return receipt_attempt_time;
	}

	public void setReceipt_attempt_time(String receipt_attempt_time) {
		this.receipt_attempt_time = receipt_attempt_time;
	}

	public String getPolicy_attempt_time() {
		return policy_attempt_time;
	}

	public void setPolicy_attempt_time(String policy_attempt_time) {
		this.policy_attempt_time = policy_attempt_time;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getMfgname() {
		return mfgname;
	}

	public void setMfgname(String mfgname) {
		this.mfgname = mfgname;
	}

	public String getFromsysystem() {
		return fromsysystem;
	}

	public void setFromsysystem(String fromsysystem) {
		this.fromsysystem = fromsysystem;
	}
}
