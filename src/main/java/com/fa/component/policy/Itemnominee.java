package com.fa.component.policy;
//package com.rs.epl.NB.policyentity;
//// Generated Feb 17, 2017 1:17:05 PM by Hibernate Tools 4.3.5.Final
//
////import java.io.Serializable;
////import java.math.BigDecimal;
//import java.util.Date;
////import java.util.HashSet;
////import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
////import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
////import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
///**
// * Itemnominee generated by hbm2java
// */
//@Entity
//@Table(name = "ITEMNOMINEE")
//public class Itemnominee implements java.io.Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private Long id;
//	private String code;
//	private String firstname;
//	private String middlename;
//	private String lastname;
//	private String relationship;
//	private String prefix;
//	private String gender;
//	private Long ageinmonths;
//	private Date dob;
//	private Boolean isinsured;
//	private Boolean isguardian;
//
//	public Policyitem policyitems;
//
//	public Itemnominee() {
//	}
//
//	public Itemnominee(Long id) {
//		this.id = id;
//	}
//
//	/*public Itemnominee(Long id, String code, String firstname, String middlename, String lastname,
//			String relationship, String prefix, String gender, Long ageinmonths, Date dob, Boolean isinsured,
//			Boolean isguardian,Policyitem policyitems) {
//		this.id = id;
//		this.code = code;
//		this.firstname = firstname;
//		this.middlename = middlename;
//		this.lastname = lastname;
//		this.relationship = relationship;
//		this.prefix = prefix;
//		this.gender = gender;
//		this.ageinmonths = ageinmonths;
//		this.dob = dob;
//		this.isinsured = isinsured;
//		this.isguardian = isguardian;
//		this.policyitems=policyitems;
//	}*/
//
//	@Id
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "partner_sequence")
//	@SequenceGenerator(initialValue=1, allocationSize=1,name = "partner_sequence",sequenceName="partner_sequence8")
//	@Column(name = "ID", unique = true, nullable = false, scale = 0)
//	public Long getId() {
//		return this.id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	@Column(name = "CODE")
//	public String getCode() {
//		return this.code;
//	}
//
//	public void setCode(String code) {
//		this.code = code;
//	}
//
//	@Column(name = "FIRSTNAME")
//	public String getFirstname() {
//		return this.firstname;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	@Column(name = "MIDDLENAME")
//	public String getMiddlename() {
//		return this.middlename;
//	}
//
//	public void setMiddlename(String middlename) {
//		this.middlename = middlename;
//	}
//
//	@Column(name = "LASTNAME")
//	public String getLastname() {
//		return this.lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	@Column(name = "RELATIONSHIP")
//	public String getRelationship() {
//		return this.relationship;
//	}
//
//	public void setRelationship(String relationship) {
//		this.relationship = relationship;
//	}
//
//	@Column(name = "PREFIX")
//	public String getPrefix() {
//		return this.prefix;
//	}
//
//	public void setPrefix(String prefix) {
//		this.prefix = prefix;
//	}
//
//	@Column(name = "GENDER")
//	public String getGender() {
//		return this.gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	@Column(name = "AGEINMONTHS", precision = 10, scale = 0)
//	public Long getAgeinmonths() {
//		return this.ageinmonths;
//	}
//
//	public void setAgeinmonths(Long ageinmonths) {
//		this.ageinmonths = ageinmonths;
//	}
//
//	@Column(name = "DOB")
//	public Date getDob() {
//		return this.dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//
//	@Column(name = "ISINSURED", precision = 1, scale = 0)
//	public Boolean getIsinsured() {
//		return this.isinsured;
//	}
//
//	public void setIsinsured(Boolean isinsured) {
//		this.isinsured = isinsured;
//	}
//
//	@Column(name = "ISGUARDIAN", precision = 1, scale = 0)
//	public Boolean getIsguardian() {
//		return this.isguardian;
//	}
//
//	public void setIsguardian(Boolean isguardian) {
//		this.isguardian = isguardian;
//	}
//
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="ITEMID")
//	public Policyitem getPolicyitems() {
//		return this.policyitems;
//	}
//
//	public void setPolicyitems(Policyitem policyitems) {
//		this.policyitems = policyitems;
//	}
//
//}