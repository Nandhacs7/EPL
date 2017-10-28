package com.rs.epl.NB.oementity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="POLICY_STATUS")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
public class PolicyerrorData {
	@Column(name="POLNO")
	private String policyno;
	
	@Column(name="RECIPTNO")
	private String reciptno;
	
	@Id
	@Column(name="POLICYID")
	private Long policyid;
	
	@Column(name="RECIPTID")
	private long reciptid;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="ATTEMPT")
	private int attempt;
	
	@Column(name="ERRORCODE")
	private String errorcode;
	
	@Column(name="RESPONSEXML")
	private String responsexml;	
	
	@Column(name="ATTEMPT_TIME")
	private Date Attempttime;	
	
	@Column(name="INPUTXML")
	private String InputXml;	
	
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
	public Date getAttempttime() {
		return Attempttime;
	}
	public void setAttempttime(Date attempttime) {
		Attempttime = attempttime;
	}
	public String getInputXml() {
		return InputXml;
	}
	public void setInputXml(String inputXml) {
		InputXml = inputXml;
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

	
}
