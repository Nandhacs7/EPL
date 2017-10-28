/*package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;



@Entity
@Table(name="RSBRANCHMASTER")
public class Rsbranchmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="ADDRESS_LINES1", length=255)
	private String addressLines1;

	@Column(name="ADDRESS_LINES2", length=255)
	private String addressLines2;

	@Column(name="ADDRESS_LINES3", length=255)
	private String addressLines3;

	@Column(name="ADDRESS_LINES4", length=255)
	private String addressLines4;

	@Column(name="AGENT_CODE", length=10)
	private String agentCode;

	@Column(name="AREA_CODE1", length=255)
	private String areaCode1;

	@Column(name="AREA_CODE2", length=255)
	private String areaCode2;

	@Column(name="BRANCH_CODE", length=15)
	private String branchCode;

	@Column(name="BRANCH_NAME", length=50)
	private String branchName;

	@Column(name="BRANCH_NODE", length=25)
	private String branchNode;

	@Column(name="BUSINESS_STATUS", length=10)
	private String businessStatus;

	@Column(length=255)
	private String city;

	@Column(length=255)
	private String country;

	@Column(name="COUNTRY_PHONE_CODE", length=255)
	private String countryPhoneCode;

	@Column(name="COVERBOOK_EXPIRY_DAYS", precision=22)
	private BigDecimal coverbookExpiryDays;

	@Column(name="CREATED_BY", length=25)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_END_DATE")
	private Date effectiveEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_START_DATE")
	private Date effectiveStartDate;

	@Column(name="ELECTRONIC_TYPE", length=255)
	private String electronicType;

	@Column(length=255)
	private String extension;

	@Column(length=255)
	private String fax;

	@Column(length=255)
	private String faxcode;

	@Column(name="HOUSE_NUMBER", length=255)
	private String houseNumber;

	@Column(name="LAST_MODIFIED_BY", length=25)
	private String lastModifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	@Column(name="LEGACY_CODE", length=15)
	private String legacyCode;

	@Column(name="LOCAL_NUMBER1", length=255)
	private String localNumber1;

	@Column(name="LOCAL_NUMBER2", length=255)
	private String localNumber2;

	@Column(length=255)
	private String mobile;

	@Column(name="PARENT_BRANCH_CODE", length=25)
	private String parentBranchCode;

	@Column(name="POSTAL_CODE", length=255)
	private String postalCode;

	@Column(length=255)
	private String region;

	@Column(name="SERVICE_BRANCH", length=50)
	private String serviceBranch;

	@Column(name="\"STATE\"", length=255)
	private String state;

	@Column(length=255)
	private String street;

	public Rsbranchmaster() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressLines1() {
		return this.addressLines1;
	}

	public void setAddressLines1(String addressLines1) {
		this.addressLines1 = addressLines1;
	}

	public String getAddressLines2() {
		return this.addressLines2;
	}

	public void setAddressLines2(String addressLines2) {
		this.addressLines2 = addressLines2;
	}

	public String getAddressLines3() {
		return this.addressLines3;
	}

	public void setAddressLines3(String addressLines3) {
		this.addressLines3 = addressLines3;
	}

	public String getAddressLines4() {
		return this.addressLines4;
	}

	public void setAddressLines4(String addressLines4) {
		this.addressLines4 = addressLines4;
	}

	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAreaCode1() {
		return this.areaCode1;
	}

	public void setAreaCode1(String areaCode1) {
		this.areaCode1 = areaCode1;
	}

	public String getAreaCode2() {
		return this.areaCode2;
	}

	public void setAreaCode2(String areaCode2) {
		this.areaCode2 = areaCode2;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchNode() {
		return this.branchNode;
	}

	public void setBranchNode(String branchNode) {
		this.branchNode = branchNode;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryPhoneCode() {
		return this.countryPhoneCode;
	}

	public void setCountryPhoneCode(String countryPhoneCode) {
		this.countryPhoneCode = countryPhoneCode;
	}

	public BigDecimal getCoverbookExpiryDays() {
		return this.coverbookExpiryDays;
	}

	public void setCoverbookExpiryDays(BigDecimal coverbookExpiryDays) {
		this.coverbookExpiryDays = coverbookExpiryDays;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}

	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}

	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getElectronicType() {
		return this.electronicType;
	}

	public void setElectronicType(String electronicType) {
		this.electronicType = electronicType;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFaxcode() {
		return this.faxcode;
	}

	public void setFaxcode(String faxcode) {
		this.faxcode = faxcode;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLegacyCode() {
		return this.legacyCode;
	}

	public void setLegacyCode(String legacyCode) {
		this.legacyCode = legacyCode;
	}

	public String getLocalNumber1() {
		return this.localNumber1;
	}

	public void setLocalNumber1(String localNumber1) {
		this.localNumber1 = localNumber1;
	}

	public String getLocalNumber2() {
		return this.localNumber2;
	}

	public void setLocalNumber2(String localNumber2) {
		this.localNumber2 = localNumber2;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getParentBranchCode() {
		return this.parentBranchCode;
	}

	public void setParentBranchCode(String parentBranchCode) {
		this.parentBranchCode = parentBranchCode;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getServiceBranch() {
		return this.serviceBranch;
	}

	public void setServiceBranch(String serviceBranch) {
		this.serviceBranch = serviceBranch;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}*/