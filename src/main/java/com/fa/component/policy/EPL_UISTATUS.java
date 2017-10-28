package com.fa.component.policy;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Table(name="EPL_STATUS")
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
public class EPL_UISTATUS {
	
	@Id
	@Column(name="POLICYNO")
	private String policyno;
	
	@Column(name="RECEIPTNO")
	private String receiptno;
	
	@Column(name="RECEIPT_STATUS")
	private String receipt_status;
	
	@Column(name="POLICY_STATUS")
	private String  policy_status; 

	@Column(name="RECEIPT_ERRORDETAILS")
	private String receipt_errordetails;
	
	@Column(name="POLICY_ERRORDETAILS")
	private String   policy_errordeatils;
	
	@Column(name="RECEIPT_ATTEMPT_TIME")
	private Date receipt_attempt_time;
	
	@Column(name="POLICY_ATTEMPT_TIME")
	private Date  policy_attempt_time;
	
	@Column(name="PRODUCTCODE")
	private String   productcode;
	
	@Column(name="MFGNAME")
	private String mfgname;
	
	@Column(name="FROMSYSTEM")
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

	public Date getReceipt_attempt_time() {
		return receipt_attempt_time;
	}

	public void setReceipt_attempt_time(Date receipt_attempt_time) {
		this.receipt_attempt_time = receipt_attempt_time;
	}

	public Date getPolicy_attempt_time() {
		return policy_attempt_time;
	}

	public void setPolicy_attempt_time(Date policy_attempt_time) {
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

	@Override
	public String toString() {
		return "EPL_UISTATUS [policyno=" + policyno + ", receiptno=" + receiptno + ", receipt_status=" + receipt_status
				+ ", policy_status=" + policy_status + ", receipt_errordetails=" + receipt_errordetails
				+ ", policy_errordeatils=" + policy_errordeatils + ", receipt_attempt_time=" + receipt_attempt_time
				+ ", policy_attempt_time=" + policy_attempt_time + ", productcode=" + productcode + ", mfgname="
				+ mfgname + ", fromsysystem=" + fromsysystem + "]";
	}
	
	
	
}
