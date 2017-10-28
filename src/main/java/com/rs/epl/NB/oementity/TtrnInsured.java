package com.rs.epl.NB.oementity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "TTRN_INSURED_INFO")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnInsured implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String xgenPolicyno;
	private String clientfirstname;
	private String clientaddr1;
	private String clientaddr2;
	private String clientaddr3;
	private String clientaddr4;
	private Integer clientpincode;
	private String clientmiddlename;
	private String clientlastname;
	private String clienttype;
	private String city;
	private String corporatename;
	private String isnewnominee;
//	private String clientnomineecode;
//	private String clientnomineename;
//	private String clientnomineerelation;
//	private String clientnomineeaddress1;
//	private String clientnomineeaddress2;
//	private String clientnomineeaddress3;
//	private String clientnomineeaddress4;
//	private String nomineegender;
//	private String dob;
//	private String minor;
//	private String guardiancode;
//	private String guardianname;
//	private BigDecimal guardianage;
//	private String relationshipwithnominee;
//	private String phone;
//	private String handphone;
//	private String campcode;
//	private String country;
//	private Integer corppincode;
//	private Long batchid;
//	private Character active;
//	private Long recordType;
//	private Long recordNumber;
//	private String blank1;
//	private String blank2;
//	private String blank3;
//	private String occupation;
//	private String xgenEndorsementno;
//	private Long xgenProductid;
//	private Long recordno;
//	private String officephone;
//	private String clientdob;
//	private String blank4;
//	private String blank5;
//	private String blank6;
//	private String blank7;
//	private String blank8;
//	private String blank9;
//	private String blank10;
//	private String blank11;
//	private String blank12;
//	private String blank13;
//	private String blank14;
//	private String blank15;
//	private String blank16;
//	private String blank17;
//	private String blank18;
//	private String blank19;
//	private String blank20;
//	private String blank21;
//	private String blank22;
//	private String pannumber;
//	private String clientemailid;
	private String fullname;
	
	private String statecode;

	public TtrnInsured() {
	}

	public TtrnInsured(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}

	@Id
	@Column(name = "XGEN_POLICYNO", unique = true, nullable = false, length = 16)
	public String getXgenPolicyno() {
		return this.xgenPolicyno;
	}

	public void setXgenPolicyno(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}

	@Column(name = "CLIENTFIRSTNAME", length = 100)
	public String getClientfirstname() {
		return this.clientfirstname;
	}

	public void setClientfirstname(String clientfirstname) {
		this.clientfirstname = clientfirstname;
	}

	@Column(name = "CLIENTADDR1")
	public String getClientaddr1() {
		return this.clientaddr1;
	}

	public void setClientaddr1(String clientaddr1) {
		this.clientaddr1 = clientaddr1;
	}

	@Column(name = "CLIENTADDR2")
	public String getClientaddr2() {
		return this.clientaddr2;
	}

	public void setClientaddr2(String clientaddr2) {
		this.clientaddr2 = clientaddr2;
	}

	@Column(name = "CLIENTADDR3")
	public String getClientaddr3() {
		return this.clientaddr3;
	}

	public void setClientaddr3(String clientaddr3) {
		this.clientaddr3 = clientaddr3;
	}

	@Column(name = "CLIENTADDR4")
	public String getClientaddr4() {
		return this.clientaddr4;
	}

	public void setClientaddr4(String clientaddr4) {
		this.clientaddr4 = clientaddr4;
	}

	@Column(name = "CLIENTPINCODE", precision = 6, scale = 0)
	public Integer getClientpincode() {
		return this.clientpincode;
	}

	public void setClientpincode(Integer clientpincode) {
		this.clientpincode = clientpincode;
	}
	@Column(name = "CLIENTMIDDLENAME", length = 100)
	public String getClientmiddlename() {
		return this.clientmiddlename;
	}

	public void setClientmiddlename(String clientmiddlename) {
		this.clientmiddlename = clientmiddlename;
	}

	@Column(name = "CLIENTLASTNAME", length = 100)
	public String getClientlastname() {
		return this.clientlastname;
	}

	public void setClientlastname(String clientlastname) {
		this.clientlastname = clientlastname;
	}

	@Column(name = "CLIENTTYPE", length = 50)
	public String getClienttype() {
		return this.clienttype;
	}

	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}

	@Column(name = "CITY", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "CORPORATENAME", length = 200)
	public String getCorporatename() {
		return this.corporatename;
	}

	public void setCorporatename(String corporatename) {
		this.corporatename = corporatename;
	}

	@Column(name = "ISNEWNOMINEE", length = 30)
	public String getIsnewnominee() {
		return this.isnewnominee;
	}

	public void setIsnewnominee(String isnewnominee) {
		this.isnewnominee = isnewnominee;
	}

	@Column(name = "FULLNAME", length = 100)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	@Column(name = "STATECODE")
	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}	
	
//	@Column(name = "CLIENTNOMINEECODE", length = 30)
//	public String getClientnomineecode() {
//		return this.clientnomineecode;
//	}
//
//	public void setClientnomineecode(String clientnomineecode) {
//		this.clientnomineecode = clientnomineecode;
//	}
//
//	@Column(name = "CLIENTNOMINEENAME", length = 50)
//	public String getClientnomineename() {
//		return this.clientnomineename;
//	}
//
//	public void setClientnomineename(String clientnomineename) {
//		this.clientnomineename = clientnomineename;
//	}
//
//	@Column(name = "CLIENTNOMINEERELATION", length = 100)
//	public String getClientnomineerelation() {
//		return this.clientnomineerelation;
//	}
//
//	public void setClientnomineerelation(String clientnomineerelation) {
//		this.clientnomineerelation = clientnomineerelation;
//	}
//
//	@Column(name = "CLIENTNOMINEEADDRESS1", length = 200)
//	public String getClientnomineeaddress1() {
//		return this.clientnomineeaddress1;
//	}
//
//	public void setClientnomineeaddress1(String clientnomineeaddress1) {
//		this.clientnomineeaddress1 = clientnomineeaddress1;
//	}
//
//	@Column(name = "CLIENTNOMINEEADDRESS2", length = 200)
//	public String getClientnomineeaddress2() {
//		return this.clientnomineeaddress2;
//	}
//
//	public void setClientnomineeaddress2(String clientnomineeaddress2) {
//		this.clientnomineeaddress2 = clientnomineeaddress2;
//	}
//
//	@Column(name = "CLIENTNOMINEEADDRESS3", length = 200)
//	public String getClientnomineeaddress3() {
//		return this.clientnomineeaddress3;
//	}
//
//	public void setClientnomineeaddress3(String clientnomineeaddress3) {
//		this.clientnomineeaddress3 = clientnomineeaddress3;
//	}
//
//	@Column(name = "CLIENTNOMINEEADDRESS4", length = 200)
//	public String getClientnomineeaddress4() {
//		return this.clientnomineeaddress4;
//	}
//
//	public void setClientnomineeaddress4(String clientnomineeaddress4) {
//		this.clientnomineeaddress4 = clientnomineeaddress4;
//	}
//
//	@Column(name = "NOMINEEGENDER", length = 20)
//	public String getNomineegender() {
//		return this.nomineegender;
//	}
//
//	public void setNomineegender(String nomineegender) {
//		this.nomineegender = nomineegender;
//	}
//
//	@Column(name = "DOB", length = 50)
//	public String getDob() {
//		return this.dob;
//	}
//
//	public void setDob(String dob) {
//		this.dob = dob;
//	}
//
//	@Column(name = "MINOR", length = 30)
//	public String getMinor() {
//		return this.minor;
//	}
//
//	public void setMinor(String minor) {
//		this.minor = minor;
//	}
//
//	@Column(name = "GUARDIANCODE", length = 30)
//	public String getGuardiancode() {
//		return this.guardiancode;
//	}
//
//	public void setGuardiancode(String guardiancode) {
//		this.guardiancode = guardiancode;
//	}
//
//	@Column(name = "GUARDIANNAME", length = 50)
//	public String getGuardianname() {
//		return this.guardianname;
//	}
//
//	public void setGuardianname(String guardianname) {
//		this.guardianname = guardianname;
//	}
//
//	@Column(name = "GUARDIANAGE", precision = 22, scale = 0)
//	public BigDecimal getGuardianage() {
//		return this.guardianage;
//	}
//
//	public void setGuardianage(BigDecimal guardianage) {
//		this.guardianage = guardianage;
//	}
//
//	@Column(name = "RELATIONSHIPWITHNOMINEE", length = 30)
//	public String getRelationshipwithnominee() {
//		return this.relationshipwithnominee;
//	}
//
//	public void setRelationshipwithnominee(String relationshipwithnominee) {
//		this.relationshipwithnominee = relationshipwithnominee;
//	}
	
	
//	@Column(name = "CORPPINCODE", precision = 6, scale = 0)
//	public Integer getCorppincode() {
//		return this.corppincode;
//	}
//
//	public void setCorppincode(Integer corppincode) {
//		this.corppincode = corppincode;
//	}

//	@Column(name = "BATCHID", precision = 10, scale = 0)
//	public Long getBatchid() {
//		return this.batchid;
//	}
//
//	public void setBatchid(Long batchid) {
//		this.batchid = batchid;
//	}
//
//	@Column(name = "ACTIVE", length = 1)
//	public Character getActive() {
//		return this.active;
//	}
//
//	public void setActive(Character active) {
//		this.active = active;
//	}
//
//	@Column(name = "RECORD_TYPE", precision = 10, scale = 0)
//	public Long getRecordType() {
//		return this.recordType;
//	}
//
//	public void setRecordType(Long recordType) {
//		this.recordType = recordType;
//	}
//
//	@Column(name = "RECORD_NUMBER", precision = 10, scale = 0)
//	public Long getRecordNumber() {
//		return this.recordNumber;
//	}
//
//	public void setRecordNumber(Long recordNumber) {
//		this.recordNumber = recordNumber;
//	}
//
//	@Column(name = "BLANK1", length = 50)
//	public String getBlank1() {
//		return this.blank1;
//	}
//
//	public void setBlank1(String blank1) {
//		this.blank1 = blank1;
//	}
//
//	@Column(name = "BLANK2", length = 50)
//	public String getBlank2() {
//		return this.blank2;
//	}
//
//	public void setBlank2(String blank2) {
//		this.blank2 = blank2;
//	}
//
//	@Column(name = "BLANK3", length = 50)
//	public String getBlank3() {
//		return this.blank3;
//	}
//
//	public void setBlank3(String blank3) {
//		this.blank3 = blank3;
//	}
//
//	@Column(name = "OCCUPATION", length = 50)
//	public String getOccupation() {
//		return this.occupation;
//	}
//
//	public void setOccupation(String occupation) {
//		this.occupation = occupation;
//	}
//
//	@Column(name = "XGEN_ENDORSEMENTNO", length = 10)
//	public String getXgenEndorsementno() {
//		return this.xgenEndorsementno;
//	}
//
//	public void setXgenEndorsementno(String xgenEndorsementno) {
//		this.xgenEndorsementno = xgenEndorsementno;
//	}
//
//	@Column(name = "XGEN_PRODUCTID", precision = 10, scale = 0)
//	public Long getXgenProductid() {
//		return this.xgenProductid;
//	}
//
//	public void setXgenProductid(Long xgenProductid) {
//		this.xgenProductid = xgenProductid;
//	}
//
//	@Column(name = "RECORDNO", precision = 10, scale = 0)
//	public Long getRecordno() {
//		return this.recordno;
//	}
//
//	public void setRecordno(Long recordno) {
//		this.recordno = recordno;
//	}
//
//	@Column(name = "OFFICEPHONE", length = 20)
//	public String getOfficephone() {
//		return this.officephone;
//	}
//
//	public void setOfficephone(String officephone) {
//		this.officephone = officephone;
//	}
//
////	@Temporal(TemporalType.DATE)
//	@Column(name = "CLIENTDOB", length = 7)
//	public String getClientdob() {
//		return this.clientdob;
//	}
//
//	public void setClientdob(String clientdob) {
//		this.clientdob = clientdob;
//	}
//
//	@Column(name = "BLANK4", length = 50)
//	public String getBlank4() {
//		return this.blank4;
//	}
//
//	public void setBlank4(String blank4) {
//		this.blank4 = blank4;
//	}
//
//	@Column(name = "BLANK5", length = 50)
//	public String getBlank5() {
//		return this.blank5;
//	}
//
//	public void setBlank5(String blank5) {
//		this.blank5 = blank5;
//	}
//
//	@Column(name = "BLANK6", length = 50)
//	public String getBlank6() {
//		return this.blank6;
//	}
//
//	public void setBlank6(String blank6) {
//		this.blank6 = blank6;
//	}
//
//	@Column(name = "BLANK7", length = 50)
//	public String getBlank7() {
//		return this.blank7;
//	}
//
//	public void setBlank7(String blank7) {
//		this.blank7 = blank7;
//	}
//
//	@Column(name = "BLANK8", length = 50)
//	public String getBlank8() {
//		return this.blank8;
//	}
//
//	public void setBlank8(String blank8) {
//		this.blank8 = blank8;
//	}
//
//	@Column(name = "BLANK9", length = 50)
//	public String getBlank9() {
//		return this.blank9;
//	}
//
//	public void setBlank9(String blank9) {
//		this.blank9 = blank9;
//	}
//
//	@Column(name = "BLANK10", length = 50)
//	public String getBlank10() {
//		return this.blank10;
//	}
//
//	public void setBlank10(String blank10) {
//		this.blank10 = blank10;
//	}
//
//	@Column(name = "BLANK11", length = 50)
//	public String getBlank11() {
//		return this.blank11;
//	}
//
//	public void setBlank11(String blank11) {
//		this.blank11 = blank11;
//	}
//
//	@Column(name = "BLANK12", length = 50)
//	public String getBlank12() {
//		return this.blank12;
//	}
//
//	public void setBlank12(String blank12) {
//		this.blank12 = blank12;
//	}
//
//	@Column(name = "BLANK13", length = 50)
//	public String getBlank13() {
//		return this.blank13;
//	}
//
//	public void setBlank13(String blank13) {
//		this.blank13 = blank13;
//	}
//
//	@Column(name = "BLANK14", length = 50)
//	public String getBlank14() {
//		return this.blank14;
//	}
//
//	public void setBlank14(String blank14) {
//		this.blank14 = blank14;
//	}
//
//	@Column(name = "BLANK15", length = 50)
//	public String getBlank15() {
//		return this.blank15;
//	}
//
//	public void setBlank15(String blank15) {
//		this.blank15 = blank15;
//	}
//
//	@Column(name = "BLANK16", length = 50)
//	public String getBlank16() {
//		return this.blank16;
//	}
//
//	public void setBlank16(String blank16) {
//		this.blank16 = blank16;
//	}
//
//	@Column(name = "BLANK17", length = 50)
//	public String getBlank17() {
//		return this.blank17;
//	}
//
//	public void setBlank17(String blank17) {
//		this.blank17 = blank17;
//	}
//
//	@Column(name = "BLANK18", length = 50)
//	public String getBlank18() {
//		return this.blank18;
//	}
//
//	public void setBlank18(String blank18) {
//		this.blank18 = blank18;
//	}
//
//	@Column(name = "BLANK19", length = 50)
//	public String getBlank19() {
//		return this.blank19;
//	}
//
//	public void setBlank19(String blank19) {
//		this.blank19 = blank19;
//	}
//
//	@Column(name = "BLANK20", length = 50)
//	public String getBlank20() {
//		return this.blank20;
//	}
//
//	public void setBlank20(String blank20) {
//		this.blank20 = blank20;
//	}
//
//	@Column(name = "BLANK21", length = 50)
//	public String getBlank21() {
//		return this.blank21;
//	}
//
//	public void setBlank21(String blank21) {
//		this.blank21 = blank21;
//	}
//
//	@Column(name = "BLANK22", length = 50)
//	public String getBlank22() {
//		return this.blank22;
//	}
//
//	public void setBlank22(String blank22) {
//		this.blank22 = blank22;
//	}
//
//	@Column(name = "PANNUMBER", length = 50)
//	public String getPannumber() {
//		return this.pannumber;
//	}
//
//	public void setPannumber(String pannumber) {
//		this.pannumber = pannumber;
//	}
//
//	@Column(name = "CLIENTEMAILID", length = 100)
//	public String getClientemailid() {
//		return this.clientemailid;
//	}
//
//	public void setClientemailid(String clientemailid) {
//		this.clientemailid = clientemailid;
//	}
	
//	@Column(name = "PHONE", length = 20)
//	public String getPhone() {
//		return this.phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

//	@Column(name = "HANDPHONE", length = 20)
//	public String getHandphone() {
//		return this.handphone;
//	}
//
//	public void setHandphone(String handphone) {
//		this.handphone = handphone;
//	}

//	@Column(name = "CAMPCODE", length = 10)
//	public String getCampcode() {
//		return this.campcode;
//	}
//
//	public void setCampcode(String campcode) {
//		this.campcode = campcode;
//	}

//	@Column(name = "COUNTRY", length = 3)
//	public String getCountry() {
//		return this.country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}	
}
