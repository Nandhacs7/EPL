package com.fa.component.policy;
// Generated Feb 17, 2017 1:17:05 PM by Hibernate Tools 4.3.5.Final

//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
/**
 * Policyclient generated by hbm2java
 */
@Entity
@Table(name = "POLICYCLIENT")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="employee")
public class Policyclient implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long polclientid;
//	private Clientnominee clientnominee;
	private String code;
//	private String title;
	private String firstname;
	private String middlename;
	private String lastname;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String citycode;
	private String city;
	private String statecode;
//	private String state;
	private Integer pincode;
//	private String stdcode;
//	private String telephone;
	private String primarymobile;
	private String alternatemobile;
	private String email;
	private String gender;
	private String dob;
//	private String occupation;
	private String maritalstatus;
	private Boolean iscorporateclient;
	private Boolean isexistingclient;
//	private String idproof;
	private String idrefnumber;
//	private String residenceproof;
	private String residencerefnumber;
	private String pannumber;
	private String aadharNumber;
	private String eianNumber;
//	private boolean optedEian;
	private Boolean isvip;
//	private Boolean ispoliticallyexposed;
	@Column(name="country")
	private String country="IND";
	
	public Policy policies;

	public Policyclient() {
	}

	public Policyclient(Long polclientid) {
		this.polclientid = polclientid;
	}


//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "partner_sequence")
//	@SequenceGenerator(initialValue=1, allocationSize=1,name = "partner_sequence",sequenceName="partner_sequence11")
//	@GenericGenerator(name = "custom_PolicyClient", strategy = "increment")
//	@GeneratedValue(generator = "custom_PolicyClient")
	
	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "policies"))	
	@GeneratedValue(generator = "generator")
	@Column(name = "POLCLIENTID", unique = true, nullable = false, scale = 0)
	public Long getPolclientid() {
		return this.polclientid;
	}

	public void setPolclientid(Long polclientid) {
		this.polclientid = polclientid;
	}

//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="ID")
//	public Clientnominee getClientnominee() {
//		return this.clientnominee;
//	}
//
//	public void setClientnominee(Clientnominee clientnominee) {
//		this.clientnominee = clientnominee;
//	}

	@Column(name = "CODE")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

//	@Column(name = "TITLE")
//	public String getTitle() {
//		return this.title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}

	@Column(name = "FIRSTNAME")
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "MIDDLENAME")
	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Column(name = "LASTNAME")
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "ADDRESS1")
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "ADDRESS2")
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "ADDRESS3")
	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "ADDRESS4")
	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	@Column(name = "CITYCODE")
	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	@Column(name = "CITY")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "STATECODE")
	public String getStatecode() {
		return this.statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

//	@Column(name = "STATE")
//	public String getState() {
//		return this.state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
	@Column(name = "PINCODE")
	public Integer getPincode() {
		return this.pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
//
//	@Column(name = "STDCODE")
//	public String getStdcode() {
//		return this.stdcode;
//	}

//	public void setStdcode(String stdcode) {
//		this.stdcode = stdcode;
//	}
//
//	@Column(name = "TELEPHONE")
//	public String getTelephone() {
//		return this.telephone;
//	}
//
//	public void setTelephone(String telephone) {
//		this.telephone = telephone;
//	}
//
	@Column(name = "PRIMARYMOBILE")
	public String getPrimarymobile() {
		return this.primarymobile;
	}

	public void setPrimarymobile(String primarymobile) {
		this.primarymobile = primarymobile;
	}

	@Column(name = "ALTERNATEMOBILE")
	public String getAlternatemobile() {
		return this.alternatemobile;
	}

	public void setAlternatemobile(String alternatemobile) {
		this.alternatemobile = alternatemobile;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "GENDER")
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "DOB")
	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
//
//	@Column(name = "OCCUPATION")
//	public String getOccupation() {
//		return this.occupation;
//	}
//
//	public void setOccupation(String occupation) {
//		this.occupation = occupation;
//	}
//
	@Column(name = "MARITALSTATUS")
	public String getMaritalstatus() {
		return this.maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	@Column(name = "ISCORPORATECLIENT", precision = 1, scale = 0)
	public Boolean getIscorporateclient() {
		return this.iscorporateclient;
	}

	public void setIscorporateclient(Boolean iscorporateclient) {
		this.iscorporateclient = iscorporateclient;
	}

	@Column(name = "ISEXISTINGCLIENT", precision = 1, scale = 0)
	public Boolean getIsexistingclient() {
		return this.isexistingclient;
	}

	public void setIsexistingclient(Boolean isexistingclient) {
		this.isexistingclient = isexistingclient;
	}

//	@Column(name = "IDPROOF")
//	public String getIdproof() {
//		return this.idproof;
//	}
//
//	public void setIdproof(String idproof) {
//		this.idproof = idproof;
//	}
//
	@Column(name = "IDREFNUMBER")
	public String getIdrefnumber() {
		return this.idrefnumber;
	}

	public void setIdrefnumber(String idrefnumber) {
		this.idrefnumber = idrefnumber;
	}
//
//	@Column(name = "RESIDENCEPROOF")
//	public String getResidenceproof() {
//		return this.residenceproof;
//	}
//
//	public void setResidenceproof(String residenceproof) {
//		this.residenceproof = residenceproof;
//	}

	@Column(name = "RESIDENCEREFNUMBER")
	public String getResidencerefnumber() {
		return this.residencerefnumber;
	}

	public void setResidencerefnumber(String residencerefnumber) {
		this.residencerefnumber = residencerefnumber;
	}

	@Column(name = "PANNUMBER")
	public String getPannumber() {
		return this.pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	@Column(name = "ISVIP", precision = 1, scale = 0)
	public Boolean getIsvip() {
		return this.isvip;
	}

	public void setIsvip(Boolean isvip) {
		this.isvip = isvip;
	}

//	@Column(name = "ISPOLITICALLYEXPOSED", precision = 1, scale = 0)
//	public Boolean getIspoliticallyexposed() {
//		return this.ispoliticallyexposed;
//	}
//
//	public void setIspoliticallyexposed(Boolean ispoliticallyexposed) {
//		this.ispoliticallyexposed = ispoliticallyexposed;
//	}


	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Policy getPolicies() {
		return this.policies;
	}

	public void setPolicies(Policy policies) {
		this.policies = policies;
	}
	@Column(name = "AadharNumber")
	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	@Column(name = "EianNumber")
	public String getEianNumber() {
		return eianNumber;
	}

	public void setEianNumber(String eianNumber) {
		this.eianNumber = eianNumber;
	}
//	@Column(name = "OptedEian")
//	public boolean isOptedEian() {
//		return optedEian;
//	}
//
//	public void setOptedEian(boolean optedEian) {
//		this.optedEian = optedEian;
//	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
