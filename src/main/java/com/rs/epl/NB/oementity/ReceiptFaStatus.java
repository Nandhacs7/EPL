package com.rs.epl.NB.oementity;

import java.util.Date;

//import javax.persistence.Access;
//import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "RECEIPT_STATUS")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
public class ReceiptFaStatus {

    
	@Id
	@Column(name="POLICY_NO")
	private String policyNo;

	
	@Column(name = "RECEIPT_NO")
	private String receiptNo;

	@Column(name = "PAYMENT_ID")
	private String paymentId;

	
	@Column(name = "POLICY_ID")
	private String policyId;

	@Column(name = "STATUS")
	private String status;


	@Column(name = "ATTEMPT_TIME")
	private Date attemptTime;

	@Column(name = "RESPONSE")
	private String response;
	
	@Column(name = "ERRORCODE")
	private String errorcode;
	
	@Column(name = "NOOFATTEMPTS")
	private int noofattempts;
	
	@Column(name="INPUTRECIPT")
	private String INPUTRECIPT;
	
	@Column(name="PRODUCTID")
	private String productId;
	
	@Column(name="MFGNAME")
	private String Mfgname;
	
	@Column(name="MFGCODE")
	private String Mfgcode;
	
	@Column(name="PRODUCTCODE")
	private String ProductCode;
	
	
	@Column(name="FROMSYSTEM")
	private String fromsystem;
	
	public String getPolicyNo() {
		return policyNo;
	}

	public int getNoofattempts() {
		return noofattempts;
	}

	public void setNoofattempts(int noofattempts) {
		this.noofattempts = noofattempts;
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

	public Date getAttemptTime() {
		return attemptTime;
	}

	public void setAttemptTime(Date attemptTime) {
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
	
	public String getINPUTRECIPT() {
		return INPUTRECIPT;
	}

	public void setINPUTRECIPT(String iNPUTRECIPT) {
		INPUTRECIPT = iNPUTRECIPT;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMfgname() {
		return Mfgname;
	}

	public void setMfgname(String mfgname) {
		Mfgname = mfgname;
	}

	public String getMfgcode() {
		return Mfgcode;
	}

	public void setMfgcode(String mfgcode) {
		Mfgcode = mfgcode;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}	
	
	public String getFromsystem() {
		return fromsystem;
	}

	public void setFromsystem(String fromsystem) {
		this.fromsystem = fromsystem;
	}
	
	
	@Override
	public String toString() {
		return "ReceiptFaStatus [policyNo=" + policyNo + ", receiptNo=" + receiptNo + ", paymentId=" + paymentId
				+ ", policyId=" + policyId + ", status=" + status + ", attemptTime=" + attemptTime + ", response="
				+ response + "]";
	}

}
