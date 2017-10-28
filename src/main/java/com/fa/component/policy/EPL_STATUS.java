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
public class EPL_STATUS {
	
	@Id
	@Column(name="POLICYNO")
	private String policyno;
	
	@Column(name="RECEIPTNO")
	private String receiptno;
    
	@Column(name="POLICYID")
	private String  policyid;
	
	@Column(name="RECEIPTID")
	private String  receiptid;
	
	@Column(name="RECEIPT_STATUS")
	private String receipt_status;
	
	@Column(name="POLICY_STATUS")
	private String  policy_status; 
	
	@Column(name="RECEIPT_REQUESTXML")
	private String  receipt_requestxml;
	
	@Column(name="POLICY_REQUESTXML")
	private String  policy_requestxml;
	
	@Column(name="RECEIPT_RESPONSEXML")
	private String   receipt_responsexml;
	
	@Column(name="POLICY_RESPONSEXML")
	private String    policy_responsexml;
	
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
	
	@Column(name="PRODUCTID")
	private String  productid;
	
	@Column(name="MFGCODE")
	private String   mfgcode;
	
	@Column(name="MFGNAME")
	private String mfgname;
	
	@Column(name="FROMSYSTEM")
	private String  fromsysystem;
	
	@Column(name="TRANSCATIONTYPE")
	private String transctiontype;
	
	@Column(name="GARBAGEDETAILS")
	private String garbagedetails;

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

	public String getPolicyid() {
		return policyid;
	}

	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}

	public String getReceiptid() {
		return receiptid;
	}

	public void setReceiptid(String receiptid) {
		this.receiptid = receiptid;
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

	public String getReceipt_requestxml() {
		return receipt_requestxml;
	}

	public void setReceipt_requestxml(String receipt_requestxml) {
		this.receipt_requestxml = receipt_requestxml;
	}

	public String getPolicy_requestxml() {
		return policy_requestxml;
	}

	public void setPolicy_requestxml(String policy_requestxml) {
		this.policy_requestxml = policy_requestxml;
	}

	public String getReceipt_responsexml() {
		return receipt_responsexml;
	}

	public void setReceipt_responsexml(String receipt_responsexml) {
		this.receipt_responsexml = receipt_responsexml;
	}

	public String getPolicy_responsexml() {
		return policy_responsexml;
	}

	public void setPolicy_responsexml(String policy_responsexml) {
		this.policy_responsexml = policy_responsexml;
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

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getMfgcode() {
		return mfgcode;
	}

	public void setMfgcode(String mfgcode) {
		this.mfgcode = mfgcode;
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

	public String getTransctiontype() {
		return transctiontype;
	}

	public void setTransctiontype(String transctiontype) {
		this.transctiontype = transctiontype;
	}
	
	public String getGarbagedetails() {
		return garbagedetails;
	}

	public void setGarbagedetails(String garbagedetails) {
		this.garbagedetails = garbagedetails;
	}

	@Override
	public String toString() {
		return "EPL_STATUS [policyno=" + policyno + ", receiptno=" + receiptno + ", policyid=" + policyid
				+ ", receiptid=" + receiptid + ", receipt_status=" + receipt_status + ", policy_status=" + policy_status
				+ ", receipt_requestxml=" + receipt_requestxml + ", policy_requestxml=" + policy_requestxml
				+ ", receipt_responsexml=" + receipt_responsexml + ", policy_responsexml=" + policy_responsexml
				+ ", receipt_errordetails=" + receipt_errordetails + ", policy_errordeatils=" + policy_errordeatils
				+ ", receipt_attempt_time=" + receipt_attempt_time + ", policy_attempt_time=" + policy_attempt_time
				+ ", productcode=" + productcode + ", productid=" + productid + ", mfgcode=" + mfgcode + ", mfgname="
				+ mfgname + ", fromsysystem=" + fromsysystem + ", transctiontype=" + transctiontype
				+ ", garbagedetails=" + garbagedetails + "]";
	}
  	
}
