/*package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


*//**
 * The persistent class for the INSURANCEOAAGENT database table.
 * 
 *//*
@Entity
@Table(name="INSURANCEOAAGENT")
public class Insuranceoaagent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(length=100)
	private String address1;

	@Column(length=100)
	private String address2;

	@Column(length=100)
	private String address3;

	@Column(length=100)
	private String address4;

	@Column(name="INWARD_DATE", length=255)
	private String inwardDate;

	@Column(name="IS_LICENSED", precision=1)
	private BigDecimal isLicensed;

	@Temporal(TemporalType.DATE)
	@Column(name="LICENSE_EXPIRYDATE")
	private Date licenseExpirydate;

	@Column(name="LICENSE_NUMBER", length=255)
	private String licenseNumber;

	@Column(length=25)
	private String mobile;

	@Column(name="OA_CODE", length=15)
	private String oaCode;

	@Column(name="OA_NAME", length=100)
	private String oaName;

	@Column(length=25)
	private String telephone;

	//bi-directional many-to-one association to Insurancepolicy
//	@OneToMany(mappedBy="insuranceoaagent")
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="OADETAILS_ID")
	private List<Insurancepolicy> insurancepolicies;

	public Insuranceoaagent() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getInwardDate() {
		return this.inwardDate;
	}

	public void setInwardDate(String inwardDate) {
		this.inwardDate = inwardDate;
	}

	public BigDecimal getIsLicensed() {
		return this.isLicensed;
	}

	public void setIsLicensed(BigDecimal isLicensed) {
		this.isLicensed = isLicensed;
	}

	public Date getLicenseExpirydate() {
		return this.licenseExpirydate;
	}

	public void setLicenseExpirydate(Date licenseExpirydate) {
		this.licenseExpirydate = licenseExpirydate;
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOaCode() {
		return this.oaCode;
	}

	public void setOaCode(String oaCode) {
		this.oaCode = oaCode;
	}

	public String getOaName() {
		return this.oaName;
	}

	public void setOaName(String oaName) {
		this.oaName = oaName;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Insurancepolicy> getInsurancepolicies() {
		return this.insurancepolicies;
	}

	public void setInsurancepolicies(List<Insurancepolicy> insurancepolicies) {
		this.insurancepolicies = insurancepolicies;
	}

//	public Insurancepolicy addInsurancepolicy(Insurancepolicy insurancepolicy) {
//		getInsurancepolicies().add(insurancepolicy);
//		insurancepolicy.setInsuranceoaagent(this);
//
//		return insurancepolicy;
//	}
//
//	public Insurancepolicy removeInsurancepolicy(Insurancepolicy insurancepolicy) {
//		getInsurancepolicies().remove(insurancepolicy);
//		insurancepolicy.setInsuranceoaagent(null);
//
//		return insurancepolicy;
//	}

}*/