package com.rs.epl.NB.dtoresponse;

/*import java.util.Date;*/

public class ReciptStatusDto {
	private String policyNo;
	private String receiptNo;
	private String paymentId;
	private String policyId;
	private String status;
	private String attemptTime;
	private String response;
	private String errorcode;
	private int noofattempts;
	private String mfgname;
	
	private String productCode;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAttemptTime() {
		return attemptTime;
	}

	public void setAttemptTime(String attemptTime) {
		this.attemptTime = attemptTime;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public int getNoofattempts() {
		return noofattempts;
	}

	public void setNoofattempts(int noofattempts) {
		this.noofattempts = noofattempts;
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
