/*package com.rs.epl.NB.oementity;
// Generated Feb 21, 2017 11:27:53 AM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

*//**
 * TtrnDriver generated by hbm2java
 *//*
@Entity
@Table(name = "TTRN_DRIVER_INFO")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnDriver implements java.io.Serializable {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	private String xgenPolicyno;
	private Short recordtype;
	private String recordno;
	private Short itemno;
	private Short sectionno;
	private String driverno;
	private Integer driverage;
	private String driversex;
	private String drivername;
	private String driverno1;
	private Integer batchid;
	private Short active;
	private String blank1;
	private String blank2;
	private String blank3;
	private Short xgenEndorsementno;
	private Short xgenProductid;
	private String driverdob;
	private String driveraddress;
	private BigDecimal driverexperience;
	private String drivinglicenceno;
	private String licenceissuedate;
	private String licenceexpirydate;
	private String licenceissuingauthority;
	private String typeoflicence;
	private String relationshipofdriver;
	private String employmentperiod;
	private String endorsementsonlicence;
	private String accidentinvolved;
	private String anychargesbyauthority;
	private String driversuffer;
	private String detailsofsuffer;
	private String blank4;
	private String driverno2;

	public TtrnDriver() {
	}

	public TtrnDriver(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}

	public TtrnDriver(String xgenPolicyno, Short recordtype, String recordno, Short itemno, Short sectionno,
			String driverno, Integer driverage, String driversex, String drivername, String driverno1, Integer batchid,
			Short active, String blank1, String blank2, String blank3, Short xgenEndorsementno, Short xgenProductid,
			String driverdob, String driveraddress, BigDecimal driverexperience, String drivinglicenceno,
			String licenceissuedate, String licenceexpirydate, String licenceissuingauthority, String typeoflicence,
			String relationshipofdriver, String employmentperiod, String endorsementsonlicence, String accidentinvolved,
			String anychargesbyauthority, String driversuffer, String detailsofsuffer, String blank4,
			String driverno2) {
		this.xgenPolicyno = xgenPolicyno;
		this.recordtype = recordtype;
		this.recordno = recordno;
		this.itemno = itemno;
		this.sectionno = sectionno;
		this.driverno = driverno;
		this.driverage = driverage;
		this.driversex = driversex;
		this.drivername = drivername;
		this.driverno1 = driverno1;
		this.batchid = batchid;
		this.active = active;
		this.blank1 = blank1;
		this.blank2 = blank2;
		this.blank3 = blank3;
		this.xgenEndorsementno = xgenEndorsementno;
		this.xgenProductid = xgenProductid;
		this.driverdob = driverdob;
		this.driveraddress = driveraddress;
		this.driverexperience = driverexperience;
		this.drivinglicenceno = drivinglicenceno;
		this.licenceissuedate = licenceissuedate;
		this.licenceexpirydate = licenceexpirydate;
		this.licenceissuingauthority = licenceissuingauthority;
		this.typeoflicence = typeoflicence;
		this.relationshipofdriver = relationshipofdriver;
		this.employmentperiod = employmentperiod;
		this.endorsementsonlicence = endorsementsonlicence;
		this.accidentinvolved = accidentinvolved;
		this.anychargesbyauthority = anychargesbyauthority;
		this.driversuffer = driversuffer;
		this.detailsofsuffer = detailsofsuffer;
		this.blank4 = blank4;
		this.driverno2 = driverno2;
	}

	@Id

	@Column(name = "XGEN_POLICYNO", unique = true, nullable = false, length = 26)
	public String getXgenPolicyno() {
		return this.xgenPolicyno;
	}

	public void setXgenPolicyno(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}

	@Column(name = "RECORDTYPE", precision = 4, scale = 0)
	public Short getRecordtype() {
		return this.recordtype;
	}

	public void setRecordtype(Short recordtype) {
		this.recordtype = recordtype;
	}

	@Column(name = "RECORDNO", length = 26)
	public String getRecordno() {
		return this.recordno;
	}

	public void setRecordno(String recordno) {
		this.recordno = recordno;
	}

	@Column(name = "ITEMNO", precision = 3, scale = 0)
	public Short getItemno() {
		return this.itemno;
	}

	public void setItemno(Short itemno) {
		this.itemno = itemno;
	}

	@Column(name = "SECTIONNO", precision = 3, scale = 0)
	public Short getSectionno() {
		return this.sectionno;
	}

	public void setSectionno(Short sectionno) {
		this.sectionno = sectionno;
	}

	@Column(name = "DRIVERNO", precision = 3, scale = 0)
	public String getDriverno() {
		return this.driverno;
	}

	public void setDriverno(String driverno) {
		this.driverno = driverno;
	}

	@Column(name = "DRIVERAGE", length = 26)
	public Integer getDriverage() {
		return this.driverage;
	}

	public void setDriverage(Integer driverage) {
		this.driverage = driverage;
	}

	@Column(name = "DRIVERSEX", length = 26)
	public String getDriversex() {
		return this.driversex;
	}

	public void setDriversex(String driversex) {
		this.driversex = driversex;
	}

	@Column(name = "DRIVERNAME", length = 26)
	public String getDrivername() {
		return this.drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	@Column(name = "DRIVERNO1", length = 26)
	public String getDriverno1() {
		return this.driverno1;
	}

	public void setDriverno1(String driverno1) {
		this.driverno1 = driverno1;
	}

	@Column(name = "BATCHID", precision = 7, scale = 0)
	public Integer getBatchid() {
		return this.batchid;
	}

	public void setBatchid(Integer batchid) {
		this.batchid = batchid;
	}

	@Column(name = "ACTIVE", precision = 3, scale = 0)
	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	@Column(name = "BLANK1", length = 26)
	public String getBlank1() {
		return this.blank1;
	}

	public void setBlank1(String blank1) {
		this.blank1 = blank1;
	}

	@Column(name = "BLANK2", length = 26)
	public String getBlank2() {
		return this.blank2;
	}

	public void setBlank2(String blank2) {
		this.blank2 = blank2;
	}

	@Column(name = "BLANK3", length = 26)
	public String getBlank3() {
		return this.blank3;
	}

	public void setBlank3(String blank3) {
		this.blank3 = blank3;
	}

	@Column(name = "XGEN_ENDORSEMENTNO", precision = 3, scale = 0)
	public Short getXgenEndorsementno() {
		return this.xgenEndorsementno;
	}

	public void setXgenEndorsementno(Short xgenEndorsementno) {
		this.xgenEndorsementno = xgenEndorsementno;
	}

	@Column(name = "XGEN_PRODUCTID", precision = 3, scale = 0)
	public Short getXgenProductid() {
		return this.xgenProductid;
	}

	public void setXgenProductid(Short xgenProductid) {
		this.xgenProductid = xgenProductid;
	}

	@Column(name = "DRIVERDOB", length = 26)
	public String getDriverdob() {
		return this.driverdob;
	}

	public void setDriverdob(String driverdob) {
		this.driverdob = driverdob;
	}

	@Column(name = "DRIVERADDRESS", length = 26)
	public String getDriveraddress() {
		return this.driveraddress;
	}

	public void setDriveraddress(String driveraddress) {
		this.driveraddress = driveraddress;
	}

	@Column(name = "DRIVEREXPERIENCE", length = 26)
	public BigDecimal getDriverexperience() {
		return this.driverexperience;
	}

	public void setDriverexperience(BigDecimal driverexperience) {
		this.driverexperience = driverexperience;
	}

	@Column(name = "DRIVINGLICENCENO", length = 26)
	public String getDrivinglicenceno() {
		return this.drivinglicenceno;
	}

	public void setDrivinglicenceno(String drivinglicenceno) {
		this.drivinglicenceno = drivinglicenceno;
	}

	@Column(name = "LICENCEISSUEDATE", length = 26)
	public String getLicenceissuedate() {
		return this.licenceissuedate;
	}

	public void setLicenceissuedate(String licenceissuedate) {
		this.licenceissuedate = licenceissuedate;
	}

	@Column(name = "LICENCEEXPIRYDATE", length = 26)
	public String getLicenceexpirydate() {
		return this.licenceexpirydate;
	}

	public void setLicenceexpirydate(String licenceexpirydate) {
		this.licenceexpirydate = licenceexpirydate;
	}

	@Column(name = "LICENCEISSUINGAUTHORITY", length = 26)
	public String getLicenceissuingauthority() {
		return this.licenceissuingauthority;
	}

	public void setLicenceissuingauthority(String licenceissuingauthority) {
		this.licenceissuingauthority = licenceissuingauthority;
	}

	@Column(name = "TYPEOFLICENCE", length = 26)
	public String getTypeoflicence() {
		return this.typeoflicence;
	}

	public void setTypeoflicence(String typeoflicence) {
		this.typeoflicence = typeoflicence;
	}

	@Column(name = "RELATIONSHIPOFDRIVER", length = 26)
	public String getRelationshipofdriver() {
		return this.relationshipofdriver;
	}

	public void setRelationshipofdriver(String relationshipofdriver) {
		this.relationshipofdriver = relationshipofdriver;
	}

	@Column(name = "EMPLOYMENTPERIOD", length = 26)
	public String getEmploymentperiod() {
		return this.employmentperiod;
	}

	public void setEmploymentperiod(String employmentperiod) {
		this.employmentperiod = employmentperiod;
	}

	@Column(name = "ENDORSEMENTSONLICENCE", length = 26)
	public String getEndorsementsonlicence() {
		return this.endorsementsonlicence;
	}

	public void setEndorsementsonlicence(String endorsementsonlicence) {
		this.endorsementsonlicence = endorsementsonlicence;
	}

	@Column(name = "ACCIDENTINVOLVED", length = 26)
	public String getAccidentinvolved() {
		return this.accidentinvolved;
	}

	public void setAccidentinvolved(String accidentinvolved) {
		this.accidentinvolved = accidentinvolved;
	}

	@Column(name = "ANYCHARGESBYAUTHORITY", length = 26)
	public String getAnychargesbyauthority() {
		return this.anychargesbyauthority;
	}

	public void setAnychargesbyauthority(String anychargesbyauthority) {
		this.anychargesbyauthority = anychargesbyauthority;
	}

	@Column(name = "DRIVERSUFFER", length = 26)
	public String getDriversuffer() {
		return this.driversuffer;
	}

	public void setDriversuffer(String driversuffer) {
		this.driversuffer = driversuffer;
	}

	@Column(name = "DETAILSOFSUFFER", length = 26)
	public String getDetailsofsuffer() {
		return this.detailsofsuffer;
	}

	public void setDetailsofsuffer(String detailsofsuffer) {
		this.detailsofsuffer = detailsofsuffer;
	}

	@Column(name = "BLANK4", length = 26)
	public String getBlank4() {
		return this.blank4;
	}

	public void setBlank4(String blank4) {
		this.blank4 = blank4;
	}

	@Column(name = "DRIVERNO2", length = 26)
	public String getDriverno2() {
		return this.driverno2;
	}

	public void setDriverno2(String driverno2) {
		this.driverno2 = driverno2;
	}

}
*/