package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.math.BigDecimal;


/**
 * The persistent class for the PARTIESINPOLICY database table.
 * 
 */
@Entity
@Table(name="PARTIESINPOLICY")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class Partiesinpolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(length=255)
	private String address1;

	@Column(length=255)
	private String address2;

	@Column(length=255)
	private String address3;

	@Column(length=255)
	private String address4;

	@Column(length=255)
	private String annualincome;

	@Column(length=20)
	private String businessteam;

	@Column(length=255)
	private String city;

	@Column(length=255)
	private String citycode;

	@Column(length=255)
	private String contactperson;

	@Column(length=255)
	private String country;

	@Column(name="CUSTOMER_AADHAR_NUMBER", length=100)
	private String customerAadharNumber;

	@Column(name="CUSTOMER_COMMUNICATION", length=20)
	private String customerCommunication;

	@Column(name="CUSTOMER_SEGMENT", length=255)
	private String customerSegment;

	@Column(length=100)
	private String district;

	@Column(length=255)
	private String dob;

	@Column(name="DRIVER_ID", precision=22)
	private Long driverId;

	@Column(length=20)
	private String drivingexperience;

	@Column(name="EDUCATIONAL_QUALIFICATION", length=255)
	private String educationalQualification;

	@Column(name="ELE_INS_ACC_NUMBER", length=200)
	private String eleInsAccNumber;

	@Column(length=255)
	private String email;

	@Column(name="EMAIL_PRINT_STATUS", precision=22)
	private BigDecimal emailPrintStatus;

	@Column(name="EMP_RELATIONSHIP_COMPANYNAME", length=255)
	private String empRelationshipCompanyname;

	@Column(name="EMP_RELATIONSHIP_REFNUMBER", length=255)
	private String empRelationshipRefnumber;

	@Column(name="EMP_RELATIONSHIP_TYPE", length=255)
	private String empRelationshipType;

	@Column(length=255)
	private String fax;

	@Column(length=255)
	private String firstname;

	@Column(length=255)
	private String gender;

	@Column(name="GUARDIAN_AGE", precision=22)
	private BigDecimal guardianAge;

	@Column(name="GUARDIAN_DOB", length=20)
	private String guardianDob;

	@Column(name="GUARDIAN_GENDER", length=255)
	private String guardianGender;

	@Column(name="GUARDIAN_LASTNAME", length=255)
	private String guardianLastname;

	@Column(name="GUARDIAN_NAME", length=255)
	private String guardianName;

	@Column(name="GUARDIAN_PARTY_CODE", length=20)
	private String guardianPartyCode;

	@Column(name="GUARDIAN_RELATION_SHIP", length=255)
	private String guardianRelationShip;

	@Column(name="IDENTITY_REF_NUMBER", length=255)
	private String identityRefNumber;

	@Column(name="INS_REPOSITORY_NAME", length=200)
	private String insRepositoryName;

	@Column(name="IS_INT_ADDRESS_FOR_NOMINEE", precision=1)
	private BigDecimal isIntAddressForNominee;

	@Column(name="IS_INTERNATIONAL_ADDRESS", precision=1)
	private BigDecimal isInternationalAddress;

	@Column(name="IS_SAMEAS_PROPOSERADDRESS", precision=1)
	private BigDecimal isSameasProposeraddress;

	@Column(name="IS_SUNDARAMGROUP_EMPLOYEE", precision=1)
	private BigDecimal isSundaramgroupEmployee;

	@Column(length=255)
	private String isnewnominee;

	@Column(length=255)
	private String isnewparty;

	@Column(length=20)
	private String isproposer;

	@Column(precision=1)
	private BigDecimal isproposerpep;

	@Column(name="KYC_COMPLIANT", precision=22)
	private BigDecimal kycCompliant;

	@Column(length=255)
	private String lastname;

	@Column(name="LICENSE_ISSUE_DATE", length=255)
	private String licenseIssueDate;

	@Column(name="MARITAL_STATUS", length=255)
	private String maritalStatus;

	@Column(length=255)
	private String middlename;

	@Column(length=255)
	private String mobile;

	@Column(length=20)
	private String monthlymilage;

	@Column(length=255)
	private String nationality;

	@Column(name="NOMINEE_ADDRESS1", length=255)
	private String nomineeAddress1;

	@Column(name="NOMINEE_ADDRESS2", length=255)
	private String nomineeAddress2;

	@Column(name="NOMINEE_ADDRESS3", length=255)
	private String nomineeAddress3;

	@Column(name="NOMINEE_ADDRESS4", length=255)
	private String nomineeAddress4;

	@Column(name="NOMINEE_AGE", precision=22)
	private BigDecimal nomineeAge;

	@Column(name="NOMINEE_CITY", length=255)
	private String nomineeCity;

	@Column(name="NOMINEE_COUNTRY", length=255)
	private String nomineeCountry;

	@Column(name="NOMINEE_DOB", length=20)
	private String nomineeDob;

	@Column(name="NOMINEE_DOB1", length=20)
	private String nomineeDob1;

	@Column(name="NOMINEE_GENDER", length=255)
	private String nomineeGender;

	@Column(name="NOMINEE_LASTNAME", length=255)
	private String nomineeLastname;

	@Column(name="NOMINEE_NAME", length=255)
	private String nomineeName;

	@Column(name="NOMINEE_PARTY_CODE", length=20)
	private String nomineePartyCode;

	@Column(name="NOMINEE_PHONE1", length=255)
	private String nomineePhone1;

	@Column(name="NOMINEE_PHONE2", length=255)
	private String nomineePhone2;

	@Column(name="NOMINEE_PINCODE", length=255)
	private String nomineePincode;

	@Column(name="NOMINEE_RELATION_SHIP", length=255)
	private String nomineeRelationShip;

	@Column(name="NOMINEE_STATE", length=255)
	private String nomineeState;

	@Column(name="NOMINEE_STDPHONE1", length=255)
	private String nomineeStdphone1;

	@Column(name="NOMINEE_STDPHONE2", length=255)
	private String nomineeStdphone2;

	@Column(length=500)
	private String occupation;

	@Column(name="OTH_CUSTOMER_SEGMENT", length=255)
	private String othCustomerSegment;

	@Column(length=255)
	private String otheroccupationdesc;

	@Column(length=255)
	private String otherpepdesc;

	@Column(length=255)
	private String pannumber;

	@Column(name="PARTIESINPOLICY_INDEX", precision=10)
	private BigDecimal partiesinpolicyIndex;

	@Column(length=255)
	private String partycode;

	@Column(length=255)
	private String partyrole;

	@Column(length=255)
	private String partytype;

	@Column(length=255)
	private String phone1;

	@Column(length=255)
	private String phone2;

	@Column(name="PHYSICIAN_CONTACT", length=255)
	private String physicianContact;

	@Column(name="PHYSICIAN_NAME", length=255)
	private String physicianName;

	@Column(length=255)
	private String pincode;

	@Column(name="POLICY_PERIOD", length=20)
	private String policyPeriod;

	@Column(length=255)
	private String policycode;

	@Column(precision=19)
	private Long policyid;

	@Column(name="PROOF_OF_IDENTITY", length=255)
	private String proofOfIdentity;

	@Column(name="PROOF_OF_RESIDENCE", length=255)
	private String proofOfResidence;

	@Column(length=250)
	private String remarks;

	@Column(name="RESIDENCE_REF_NUMBER", length=255)
	private String residenceRefNumber;

	@Column(length=10)
	private String salutation;

	@Column(name="SELECTED_PEP", length=255)
	private String selectedPep;

	@Column(name="SEND_MAIL_FLAG", length=20)
	private String sendMailFlag;

	@Column(name="\"STATE\"", length=255)
	private String state;

	@Column(length=255)
	private String stdfax;

	@Column(length=255)
	private String stdphone1;

	@Column(length=255)
	private String stdphone2;

	@Column(length=255)
	private String vip;

	@Column(length=110)
	private String xgenaccountcodetype;

	public Partiesinpolicy() {
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

	public String getAnnualincome() {
		return this.annualincome;
	}

	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}

	public String getBusinessteam() {
		return this.businessteam;
	}

	public void setBusinessteam(String businessteam) {
		this.businessteam = businessteam;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getContactperson() {
		return this.contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustomerAadharNumber() {
		return this.customerAadharNumber;
	}

	public void setCustomerAadharNumber(String customerAadharNumber) {
		this.customerAadharNumber = customerAadharNumber;
	}

	public String getCustomerCommunication() {
		return this.customerCommunication;
	}

	public void setCustomerCommunication(String customerCommunication) {
		this.customerCommunication = customerCommunication;
	}

	public String getCustomerSegment() {
		return this.customerSegment;
	}

	public void setCustomerSegment(String customerSegment) {
		this.customerSegment = customerSegment;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Long getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getDrivingexperience() {
		return this.drivingexperience;
	}

	public void setDrivingexperience(String drivingexperience) {
		this.drivingexperience = drivingexperience;
	}

	public String getEducationalQualification() {
		return this.educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public String getEleInsAccNumber() {
		return this.eleInsAccNumber;
	}

	public void setEleInsAccNumber(String eleInsAccNumber) {
		this.eleInsAccNumber = eleInsAccNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEmailPrintStatus() {
		return this.emailPrintStatus;
	}

	public void setEmailPrintStatus(BigDecimal emailPrintStatus) {
		this.emailPrintStatus = emailPrintStatus;
	}

	public String getEmpRelationshipCompanyname() {
		return this.empRelationshipCompanyname;
	}

	public void setEmpRelationshipCompanyname(String empRelationshipCompanyname) {
		this.empRelationshipCompanyname = empRelationshipCompanyname;
	}

	public String getEmpRelationshipRefnumber() {
		return this.empRelationshipRefnumber;
	}

	public void setEmpRelationshipRefnumber(String empRelationshipRefnumber) {
		this.empRelationshipRefnumber = empRelationshipRefnumber;
	}

	public String getEmpRelationshipType() {
		return this.empRelationshipType;
	}

	public void setEmpRelationshipType(String empRelationshipType) {
		this.empRelationshipType = empRelationshipType;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getGuardianAge() {
		return this.guardianAge;
	}

	public void setGuardianAge(BigDecimal guardianAge) {
		this.guardianAge = guardianAge;
	}

	public String getGuardianDob() {
		return this.guardianDob;
	}

	public void setGuardianDob(String guardianDob) {
		this.guardianDob = guardianDob;
	}

	public String getGuardianGender() {
		return this.guardianGender;
	}

	public void setGuardianGender(String guardianGender) {
		this.guardianGender = guardianGender;
	}

	public String getGuardianLastname() {
		return this.guardianLastname;
	}

	public void setGuardianLastname(String guardianLastname) {
		this.guardianLastname = guardianLastname;
	}

	public String getGuardianName() {
		return this.guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianPartyCode() {
		return this.guardianPartyCode;
	}

	public void setGuardianPartyCode(String guardianPartyCode) {
		this.guardianPartyCode = guardianPartyCode;
	}

	public String getGuardianRelationShip() {
		return this.guardianRelationShip;
	}

	public void setGuardianRelationShip(String guardianRelationShip) {
		this.guardianRelationShip = guardianRelationShip;
	}

	public String getIdentityRefNumber() {
		return this.identityRefNumber;
	}

	public void setIdentityRefNumber(String identityRefNumber) {
		this.identityRefNumber = identityRefNumber;
	}

	public String getInsRepositoryName() {
		return this.insRepositoryName;
	}

	public void setInsRepositoryName(String insRepositoryName) {
		this.insRepositoryName = insRepositoryName;
	}

	public BigDecimal getIsIntAddressForNominee() {
		return this.isIntAddressForNominee;
	}

	public void setIsIntAddressForNominee(BigDecimal isIntAddressForNominee) {
		this.isIntAddressForNominee = isIntAddressForNominee;
	}

	public BigDecimal getIsInternationalAddress() {
		return this.isInternationalAddress;
	}

	public void setIsInternationalAddress(BigDecimal isInternationalAddress) {
		this.isInternationalAddress = isInternationalAddress;
	}

	public BigDecimal getIsSameasProposeraddress() {
		return this.isSameasProposeraddress;
	}

	public void setIsSameasProposeraddress(BigDecimal isSameasProposeraddress) {
		this.isSameasProposeraddress = isSameasProposeraddress;
	}

	public BigDecimal getIsSundaramgroupEmployee() {
		return this.isSundaramgroupEmployee;
	}

	public void setIsSundaramgroupEmployee(BigDecimal isSundaramgroupEmployee) {
		this.isSundaramgroupEmployee = isSundaramgroupEmployee;
	}

	public String getIsnewnominee() {
		return this.isnewnominee;
	}

	public void setIsnewnominee(String isnewnominee) {
		this.isnewnominee = isnewnominee;
	}

	public String getIsnewparty() {
		return this.isnewparty;
	}

	public void setIsnewparty(String isnewparty) {
		this.isnewparty = isnewparty;
	}

	public String getIsproposer() {
		return this.isproposer;
	}

	public void setIsproposer(String isproposer) {
		this.isproposer = isproposer;
	}

	public BigDecimal getIsproposerpep() {
		return this.isproposerpep;
	}

	public void setIsproposerpep(BigDecimal isproposerpep) {
		this.isproposerpep = isproposerpep;
	}

	public BigDecimal getKycCompliant() {
		return this.kycCompliant;
	}

	public void setKycCompliant(BigDecimal kycCompliant) {
		this.kycCompliant = kycCompliant;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLicenseIssueDate() {
		return this.licenseIssueDate;
	}

	public void setLicenseIssueDate(String licenseIssueDate) {
		this.licenseIssueDate = licenseIssueDate;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMonthlymilage() {
		return this.monthlymilage;
	}

	public void setMonthlymilage(String monthlymilage) {
		this.monthlymilage = monthlymilage;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNomineeAddress1() {
		return this.nomineeAddress1;
	}

	public void setNomineeAddress1(String nomineeAddress1) {
		this.nomineeAddress1 = nomineeAddress1;
	}

	public String getNomineeAddress2() {
		return this.nomineeAddress2;
	}

	public void setNomineeAddress2(String nomineeAddress2) {
		this.nomineeAddress2 = nomineeAddress2;
	}

	public String getNomineeAddress3() {
		return this.nomineeAddress3;
	}

	public void setNomineeAddress3(String nomineeAddress3) {
		this.nomineeAddress3 = nomineeAddress3;
	}

	public String getNomineeAddress4() {
		return this.nomineeAddress4;
	}

	public void setNomineeAddress4(String nomineeAddress4) {
		this.nomineeAddress4 = nomineeAddress4;
	}

	public BigDecimal getNomineeAge() {
		return this.nomineeAge;
	}

	public void setNomineeAge(BigDecimal nomineeAge) {
		this.nomineeAge = nomineeAge;
	}

	public String getNomineeCity() {
		return this.nomineeCity;
	}

	public void setNomineeCity(String nomineeCity) {
		this.nomineeCity = nomineeCity;
	}

	public String getNomineeCountry() {
		return this.nomineeCountry;
	}

	public void setNomineeCountry(String nomineeCountry) {
		this.nomineeCountry = nomineeCountry;
	}

	public String getNomineeDob() {
		return this.nomineeDob;
	}

	public void setNomineeDob(String nomineeDob) {
		this.nomineeDob = nomineeDob;
	}

	public String getNomineeDob1() {
		return this.nomineeDob1;
	}

	public void setNomineeDob1(String nomineeDob1) {
		this.nomineeDob1 = nomineeDob1;
	}

	public String getNomineeGender() {
		return this.nomineeGender;
	}

	public void setNomineeGender(String nomineeGender) {
		this.nomineeGender = nomineeGender;
	}

	public String getNomineeLastname() {
		return this.nomineeLastname;
	}

	public void setNomineeLastname(String nomineeLastname) {
		this.nomineeLastname = nomineeLastname;
	}

	public String getNomineeName() {
		return this.nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineePartyCode() {
		return this.nomineePartyCode;
	}

	public void setNomineePartyCode(String nomineePartyCode) {
		this.nomineePartyCode = nomineePartyCode;
	}

	public String getNomineePhone1() {
		return this.nomineePhone1;
	}

	public void setNomineePhone1(String nomineePhone1) {
		this.nomineePhone1 = nomineePhone1;
	}

	public String getNomineePhone2() {
		return this.nomineePhone2;
	}

	public void setNomineePhone2(String nomineePhone2) {
		this.nomineePhone2 = nomineePhone2;
	}

	public String getNomineePincode() {
		return this.nomineePincode;
	}

	public void setNomineePincode(String nomineePincode) {
		this.nomineePincode = nomineePincode;
	}

	public String getNomineeRelationShip() {
		return this.nomineeRelationShip;
	}

	public void setNomineeRelationShip(String nomineeRelationShip) {
		this.nomineeRelationShip = nomineeRelationShip;
	}

	public String getNomineeState() {
		return this.nomineeState;
	}

	public void setNomineeState(String nomineeState) {
		this.nomineeState = nomineeState;
	}

	public String getNomineeStdphone1() {
		return this.nomineeStdphone1;
	}

	public void setNomineeStdphone1(String nomineeStdphone1) {
		this.nomineeStdphone1 = nomineeStdphone1;
	}

	public String getNomineeStdphone2() {
		return this.nomineeStdphone2;
	}

	public void setNomineeStdphone2(String nomineeStdphone2) {
		this.nomineeStdphone2 = nomineeStdphone2;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOthCustomerSegment() {
		return this.othCustomerSegment;
	}

	public void setOthCustomerSegment(String othCustomerSegment) {
		this.othCustomerSegment = othCustomerSegment;
	}

	public String getOtheroccupationdesc() {
		return this.otheroccupationdesc;
	}

	public void setOtheroccupationdesc(String otheroccupationdesc) {
		this.otheroccupationdesc = otheroccupationdesc;
	}

	public String getOtherpepdesc() {
		return this.otherpepdesc;
	}

	public void setOtherpepdesc(String otherpepdesc) {
		this.otherpepdesc = otherpepdesc;
	}

	public String getPannumber() {
		return this.pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public BigDecimal getPartiesinpolicyIndex() {
		return this.partiesinpolicyIndex;
	}

	public void setPartiesinpolicyIndex(BigDecimal partiesinpolicyIndex) {
		this.partiesinpolicyIndex = partiesinpolicyIndex;
	}

	public String getPartycode() {
		return this.partycode;
	}

	public void setPartycode(String partycode) {
		this.partycode = partycode;
	}

	public String getPartyrole() {
		return this.partyrole;
	}

	public void setPartyrole(String partyrole) {
		this.partyrole = partyrole;
	}

	public String getPartytype() {
		return this.partytype;
	}

	public void setPartytype(String partytype) {
		this.partytype = partytype;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhysicianContact() {
		return this.physicianContact;
	}

	public void setPhysicianContact(String physicianContact) {
		this.physicianContact = physicianContact;
	}

	public String getPhysicianName() {
		return this.physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPolicyPeriod() {
		return this.policyPeriod;
	}

	public void setPolicyPeriod(String policyPeriod) {
		this.policyPeriod = policyPeriod;
	}

	public String getPolicycode() {
		return this.policycode;
	}

	public void setPolicycode(String policycode) {
		this.policycode = policycode;
	}

	public Long getPolicyid() {
		return this.policyid;
	}

	public void setPolicyid(Long policyid) {
		this.policyid = policyid;
	}

	public String getProofOfIdentity() {
		return this.proofOfIdentity;
	}

	public void setProofOfIdentity(String proofOfIdentity) {
		this.proofOfIdentity = proofOfIdentity;
	}

	public String getProofOfResidence() {
		return this.proofOfResidence;
	}

	public void setProofOfResidence(String proofOfResidence) {
		this.proofOfResidence = proofOfResidence;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getResidenceRefNumber() {
		return this.residenceRefNumber;
	}

	public void setResidenceRefNumber(String residenceRefNumber) {
		this.residenceRefNumber = residenceRefNumber;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getSelectedPep() {
		return this.selectedPep;
	}

	public void setSelectedPep(String selectedPep) {
		this.selectedPep = selectedPep;
	}

	public String getSendMailFlag() {
		return this.sendMailFlag;
	}

	public void setSendMailFlag(String sendMailFlag) {
		this.sendMailFlag = sendMailFlag;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStdfax() {
		return this.stdfax;
	}

	public void setStdfax(String stdfax) {
		this.stdfax = stdfax;
	}

	public String getStdphone1() {
		return this.stdphone1;
	}

	public void setStdphone1(String stdphone1) {
		this.stdphone1 = stdphone1;
	}

	public String getStdphone2() {
		return this.stdphone2;
	}

	public void setStdphone2(String stdphone2) {
		this.stdphone2 = stdphone2;
	}

	public String getVip() {
		return this.vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getXgenaccountcodetype() {
		return this.xgenaccountcodetype;
	}

	public void setXgenaccountcodetype(String xgenaccountcodetype) {
		this.xgenaccountcodetype = xgenaccountcodetype;
	}

}