/*package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


*//**
 * The persistent class for the TTRN_NEWRENEWAL database table.
 * 
 *//*
@Entity
@Table(name="TTRN_NEWRENEWAL")
@NamedQuery(name="TtrnNewrenewal.findAll", query="SELECT t FROM TtrnNewrenewal t")
public class TtrnNewrenewal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(precision=10, scale=2)
	private BigDecimal aadiscamount;

	@Column(length=6)
	private String aaexpiryperiod;

	@Column(length=25)
	private String aamemno;

	@Column(length=1)
	private String active;

	@Column(precision=1)
	private BigDecimal addondailycashallowanceamt;

	@Column(precision=10, scale=2)
	private BigDecimal addonisdailycashallowance;

	@Column(length=500)
	private String addonishydrostatic;

	@Column(length=500)
	private String addonishydrostaticamt;

	@Column(length=100)
	private String addoniskeyprotect;

	@Column(precision=22)
	private BigDecimal addoniskeyprotectamt;

	@Column(precision=1)
	private BigDecimal addonisncbprotection;

	@Column(precision=1)
	private BigDecimal addonisnildep;

	@Column(precision=1)
	private BigDecimal addonisretinvvalue;

	@Column(precision=1)
	private BigDecimal addonisroadsideassist;

	@Column(precision=10, scale=2)
	private BigDecimal addonncbprotectionamt;

	@Column(precision=10, scale=2)
	private BigDecimal addonnildepamt;

	@Column(precision=10, scale=2)
	private BigDecimal addonretinvvalueamt;

	@Column(precision=10, scale=2)
	private BigDecimal addonroadsideassistamt;

	@Column(length=50)
	private String aggrementtype;

	@Column(precision=10, scale=2)
	private BigDecimal antitheftdiscamount;

	@Column(name="APD_ID", precision=10)
	private BigDecimal apdId;

	@Temporal(TemporalType.DATE)
	@Column(name="APD_UPDATE_DATE")
	private Date apdUpdateDate;

	@Column(length=200)
	private String bankname;

	@Column(name="BASIC_PREM_ELECT_ACC", length=10)
	private String basicPremElectAcc;

	@Column(precision=10, scale=2)
	private BigDecimal basicodp;

	@Column(precision=10, scale=2)
	private BigDecimal basictpl;

	@Column(precision=10)
	private BigDecimal batchid;

	@Column(precision=10, scale=2)
	private BigDecimal bifuelkitpremium;

	@Column(precision=10, scale=2)
	private BigDecimal bifuelkitvalue;

	@Column(precision=10, scale=2)
	private BigDecimal bifueltppremium;

	@Column(length=200)
	private String bodycolor;

	@Column(length=10)
	private String branchcode;

	@Column(precision=5)
	private BigDecimal cc;

	@Column(length=50)
	private String chassisno;

	@Column(length=10)
	private String citycode;

	@Column(length=10)
	private String citycode1;

	@Column(length=10)
	private String citycodetemp;

	@Column(name="CLAIM_INTIAMTION_ID", precision=10)
	private BigDecimal claimIntiamtionId;

	@Column(name="CLAIM_SETTLED_ID", precision=10)
	private BigDecimal claimSettledId;

	@Column(length=20)
	private String clientcode;

	@Column(length=100)
	private String companyname;

	@Column(precision=10, scale=2)
	private BigDecimal compdeductibles;

	@Column(name="DEPOSIT_STATUS", length=1)
	private String depositStatus;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(precision=22)
	private BigDecimal elecaccessorymrp;

	@Column(precision=10, scale=2)
	private BigDecimal electricaccidv;

	@Column(precision=10, scale=2)
	private BigDecimal electricaccpremium;

	@Column(length=50)
	private String email;

	@Column(name="EMPLOYEE_CODE", length=25)
	private String employeeCode;

	@Column(length=50)
	private String engineno;

	@Column(precision=10, scale=2)
	private BigDecimal exshowroomprice;

	@Column(precision=10, scale=2)
	private BigDecimal exttppd;

	@Temporal(TemporalType.DATE)
	private Date filegenerateddate;

	@Column(length=10)
	private String filegeneratedtime;

	@Column(length=50)
	private String financerbranch;

	@Column(length=200)
	private String financercode;

	@Column(length=200)
	private String financercodetemp;

	@Column(length=10)
	private String firstissingdealercode;

	@Column(length=50)
	private String firstname;

	@Column(length=200)
	private String fueltype;

	@Column(precision=10, scale=2)
	private BigDecimal geographicextnpremium;

	@Column(precision=10, scale=2)
	private BigDecimal grosspremium;

	@Column(name="HANDICAP_DISC_AMOUNT", length=200)
	private String handicapDiscAmount;

	@Column(length=100)
	private String hanumber;

	@Column(length=200)
	private String haproposalno;

	@Column(length=50)
	private String imtcode;

	@Column(length=500)
	private String inspectionagencyname;

	@Column(length=50)
	private String inspectiondate;

	@Column(length=200)
	private String inspectionreceiptno;

	@Column(name="INSURED_ADDRESS", length=1000)
	private String insuredAddress;

	@Column(name="IS_HANDICAP_POLICY", length=20)
	private String isHandicapPolicy;

	@Column(precision=1)
	private BigDecimal isaamembership;

	@Column(precision=1)
	private BigDecimal isantitheftattached;

	@Column(precision=1)
	private BigDecimal isbangladeshcovered;

	@Column(precision=1)
	private BigDecimal isbhutancovered;

	@Column(precision=2)
	private BigDecimal iscsd;

	@Column(precision=10)
	private BigDecimal iscustomerundertakingsubmit;

	@Column(precision=2)
	private BigDecimal isllotheremp;

	@Column(precision=2)
	private BigDecimal isllpaiddriver;

	@Column(precision=10, scale=2)
	private BigDecimal isllunnamedpass;

	@Column(precision=1)
	private BigDecimal ismaldivescovered;

	@Column(precision=10)
	private BigDecimal isncbcertificatesubmit;

	@Column(precision=1)
	private BigDecimal isnepalcovered;

	@Column(precision=1)
	private BigDecimal ispakistancovered;

	@Column(precision=1)
	private BigDecimal ispapaiddriver;

	@Column(precision=10)
	private BigDecimal isprevpolcopysubmit;

	@Column(precision=1)
	private BigDecimal issrilankacovered;

	@Column(precision=10, scale=2)
	private BigDecimal kitidv;

	@Column(length=50)
	private String lastname;

	@Column(precision=2)
	private BigDecimal llotherempcount;

	@Column(precision=10, scale=2)
	private BigDecimal llotheremppremium;

	@Column(precision=10, scale=2)
	private BigDecimal llpaiddrivpremium;

	@Column(precision=10, scale=2)
	private BigDecimal llunnamedpasscount;

	@Column(precision=10, scale=2)
	private BigDecimal llunnamedpasspremium;

	@Column(length=50)
	private String middlename;

	@Column(length=10)
	private String modelcode;

	@Column(name="MOVED_DATE")
	private Timestamp movedDate;

	@Column(precision=10, scale=2)
	private BigDecimal ncbamount;

	@Column(precision=1)
	private BigDecimal ncbflag;

	@Column(precision=10, scale=5)
	private BigDecimal ncbper;

	@Column(precision=10, scale=2)
	private BigDecimal netliabilitypremiumb;

	@Column(precision=10, scale=2)
	private BigDecimal netodpremium;

	@Column(precision=22)
	private BigDecimal nonelecaccessorymrp;

	@Column(precision=10, scale=2)
	private BigDecimal nonelectricaccidv;

	@Column(precision=10, scale=2)
	private BigDecimal nonelectricaccpremium;

	@Column(length=50)
	private String occupation;

	@Column(name="PA_NOMINEE_AGE", length=50)
	private String paNomineeAge;

	@Column(name="PA_NOMINEE_NAME", length=100)
	private String paNomineeName;

	@Column(name="PA_NOMINEE_RELATION", length=100)
	private String paNomineeRelation;

	@Column(precision=10, scale=2)
	private BigDecimal pacoverpremownerdriver;

	@Column(precision=10, scale=2)
	private BigDecimal pacoverprempaiddriver;

	@Column(precision=10, scale=2)
	private BigDecimal pacoverpremunnameddriver;

	@Column(length=10)
	private String pannumber;

	@Column(precision=2)
	private BigDecimal panoofperson;

	@Column(precision=10, scale=2)
	private BigDecimal pasuminsuredperperson;

	@Column(precision=10, scale=2)
	private BigDecimal patotalpremium;

	@Temporal(TemporalType.DATE)
	private Date payinslipdate;

	@Column(length=25)
	private String payinslipno;

	@Column(name="PAYMENT_RECONCILE_ID", precision=10)
	private BigDecimal paymentReconcileId;

	@Column(name="PAYMENT_RECONCILE_STATUS", length=1)
	private String paymentReconcileStatus;

	@Column(precision=6)
	private BigDecimal pincode;

	@Column(name="POLICY_STATUS", length=1)
	private String policyStatus;

	@Temporal(TemporalType.DATE)
	private Date policycreateddate;

	@Column(length=10)
	private String policycreatedtime;

	@Temporal(TemporalType.DATE)
	private Date policyeffectivedate;

	@Column(length=10)
	private String policyeffectivetime;

	@Temporal(TemporalType.DATE)
	private Date policyexpirydate;

	@Column(length=10)
	private String policyissuingdealercode;

	@Column(length=10)
	private String policyissuingdealercodetemp;
	
	@Id
	@Column(length=16)
	private String policyno;

	@Column(length=1)
	private String policytype;

	@Column(length=200)
	private String previnsurcompanyadd;

	@Column(length=50)
	private String previnsurcompanycode;

	@Column(length=100)
	private String previnsurcompanyname;

	@Column(length=10)
	private String prevpolicydealercode;

	@Temporal(TemporalType.DATE)
	private Date prevpolicyeffectivedate;

	@Temporal(TemporalType.DATE)
	private Date prevpolicyexpirydate;

	@Column(length=100)
	private String prevpolicyno;

	@Column(name="PROPOSERPAYMENT_MODE", length=400)
	private String proposerpaymentMode;

	@Column(length=1)
	private String proposertype;

	@Column(precision=10, scale=2)
	private BigDecimal reconciledchequeamount;

	@Column(length=30)
	private String reconciledchequebank;

	@Column(length=30)
	private String reconciledchequebanktemp;

	@Column(length=100)
	private String reconciledchequebranch;

	@Temporal(TemporalType.DATE)
	private Date reconciledchequedate;

	@Column(length=1)
	private String reconciledchequeissuedby;

	@Column(length=100)
	private String reconciledchequeno;

	@Column(length=15)
	private String registrationno;

	@Column(length=200)
	private String rtocode;

	@Column(length=200)
	private String rtocodetemp;

	@Column(length=10)
	private String salutation;

	@Column(precision=2)
	private BigDecimal seatingcapacity;

	@Column(precision=10, scale=2)
	private BigDecimal servicetax;

	@Column(name="SETTLEMENT_TYPE", length=50)
	private String settlementType;

	@Column(length=1)
	private String sex;

	@Column(length=10)
	private String statecode;

	@Column(length=10)
	private String statecodetemp;

	@Column(length=200)
	private String tarrifzone;

	@Column(precision=10, scale=2)
	private BigDecimal totallegalliability;

	@Column(precision=10, scale=2)
	private BigDecimal totalpremium;

	@Column(precision=10, scale=2)
	private BigDecimal totaltp;

	@Column(name="VALIDATE_STATUS", length=200)
	private String validateStatus;

	@Column(length=10)
	private String variantcode;

	@Column(length=10)
	private String variantcodetemp;

	@Column(precision=10)
	private BigDecimal vehcileinspectionagencycode;

	@Temporal(TemporalType.DATE)
	private Date vehcileinspectiondate;

	@Column(length=1)
	private String vehicleclass;

	@Column(precision=10, scale=2)
	private BigDecimal vehicleidv;

	@Temporal(TemporalType.DATE)
	private Date vehicleinvoicedate;

	@Column(precision=10)
	private BigDecimal vehiclepremium;

	@Column(precision=10, scale=2)
	private BigDecimal voluntarydeductible;

	@Column(precision=10, scale=2)
	private BigDecimal voluntarydisc;

	@Column(name="XGEN_DOWNLOAD_ID", precision=10)
	private BigDecimal xgenDownloadId;

	@Column(name="XGEN_DOWNLOAD_STATUS", length=1)
	private String xgenDownloadStatus;

	@Column(name="XGEN_ENDORSEMENT_NO", length=3)
	private String xgenEndorsementNo;

	@Column(name="XGEN_MOVED_DATE")
	private Timestamp xgenMovedDate;

	@Column(name="XGEN_MOVED_STATUS", length=1)
	private String xgenMovedStatus;

	@Column(name="XGEN_POLICY_NUMBER", length=16)
	private String xgenPolicyNumber;

	@Column(name="XGEN_PRODUCT_CODE", length=10)
	private String xgenProductCode;

	@Column(name="XGEN_PRODUCT_ID", precision=10)
	private BigDecimal xgenProductId;

	@Column(name="XGEN_RECEIPT_DATE")
	private Timestamp xgenReceiptDate;

	@Column(name="XGEN_RECEIPT_NUMBER", length=16)
	private String xgenReceiptNumber;

	@Column(length=4)
	private String yearofmanufacture;

	public TtrnNewrenewal() {
	}

	public BigDecimal getAadiscamount() {
		return this.aadiscamount;
	}

	public void setAadiscamount(BigDecimal aadiscamount) {
		this.aadiscamount = aadiscamount;
	}

	public String getAaexpiryperiod() {
		return this.aaexpiryperiod;
	}

	public void setAaexpiryperiod(String aaexpiryperiod) {
		this.aaexpiryperiod = aaexpiryperiod;
	}

	public String getAamemno() {
		return this.aamemno;
	}

	public void setAamemno(String aamemno) {
		this.aamemno = aamemno;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public BigDecimal getAddondailycashallowanceamt() {
		return this.addondailycashallowanceamt;
	}

	public void setAddondailycashallowanceamt(BigDecimal addondailycashallowanceamt) {
		this.addondailycashallowanceamt = addondailycashallowanceamt;
	}

	public BigDecimal getAddonisdailycashallowance() {
		return this.addonisdailycashallowance;
	}

	public void setAddonisdailycashallowance(BigDecimal addonisdailycashallowance) {
		this.addonisdailycashallowance = addonisdailycashallowance;
	}

	public String getAddonishydrostatic() {
		return this.addonishydrostatic;
	}

	public void setAddonishydrostatic(String addonishydrostatic) {
		this.addonishydrostatic = addonishydrostatic;
	}

	public String getAddonishydrostaticamt() {
		return this.addonishydrostaticamt;
	}

	public void setAddonishydrostaticamt(String addonishydrostaticamt) {
		this.addonishydrostaticamt = addonishydrostaticamt;
	}

	public String getAddoniskeyprotect() {
		return this.addoniskeyprotect;
	}

	public void setAddoniskeyprotect(String addoniskeyprotect) {
		this.addoniskeyprotect = addoniskeyprotect;
	}

	public BigDecimal getAddoniskeyprotectamt() {
		return this.addoniskeyprotectamt;
	}

	public void setAddoniskeyprotectamt(BigDecimal addoniskeyprotectamt) {
		this.addoniskeyprotectamt = addoniskeyprotectamt;
	}

	public BigDecimal getAddonisncbprotection() {
		return this.addonisncbprotection;
	}

	public void setAddonisncbprotection(BigDecimal addonisncbprotection) {
		this.addonisncbprotection = addonisncbprotection;
	}

	public BigDecimal getAddonisnildep() {
		return this.addonisnildep;
	}

	public void setAddonisnildep(BigDecimal addonisnildep) {
		this.addonisnildep = addonisnildep;
	}

	public BigDecimal getAddonisretinvvalue() {
		return this.addonisretinvvalue;
	}

	public void setAddonisretinvvalue(BigDecimal addonisretinvvalue) {
		this.addonisretinvvalue = addonisretinvvalue;
	}

	public BigDecimal getAddonisroadsideassist() {
		return this.addonisroadsideassist;
	}

	public void setAddonisroadsideassist(BigDecimal addonisroadsideassist) {
		this.addonisroadsideassist = addonisroadsideassist;
	}

	public BigDecimal getAddonncbprotectionamt() {
		return this.addonncbprotectionamt;
	}

	public void setAddonncbprotectionamt(BigDecimal addonncbprotectionamt) {
		this.addonncbprotectionamt = addonncbprotectionamt;
	}

	public BigDecimal getAddonnildepamt() {
		return this.addonnildepamt;
	}

	public void setAddonnildepamt(BigDecimal addonnildepamt) {
		this.addonnildepamt = addonnildepamt;
	}

	public BigDecimal getAddonretinvvalueamt() {
		return this.addonretinvvalueamt;
	}

	public void setAddonretinvvalueamt(BigDecimal addonretinvvalueamt) {
		this.addonretinvvalueamt = addonretinvvalueamt;
	}

	public BigDecimal getAddonroadsideassistamt() {
		return this.addonroadsideassistamt;
	}

	public void setAddonroadsideassistamt(BigDecimal addonroadsideassistamt) {
		this.addonroadsideassistamt = addonroadsideassistamt;
	}

	public String getAggrementtype() {
		return this.aggrementtype;
	}

	public void setAggrementtype(String aggrementtype) {
		this.aggrementtype = aggrementtype;
	}

	public BigDecimal getAntitheftdiscamount() {
		return this.antitheftdiscamount;
	}

	public void setAntitheftdiscamount(BigDecimal antitheftdiscamount) {
		this.antitheftdiscamount = antitheftdiscamount;
	}

	public BigDecimal getApdId() {
		return this.apdId;
	}

	public void setApdId(BigDecimal apdId) {
		this.apdId = apdId;
	}

	public Date getApdUpdateDate() {
		return this.apdUpdateDate;
	}

	public void setApdUpdateDate(Date apdUpdateDate) {
		this.apdUpdateDate = apdUpdateDate;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBasicPremElectAcc() {
		return this.basicPremElectAcc;
	}

	public void setBasicPremElectAcc(String basicPremElectAcc) {
		this.basicPremElectAcc = basicPremElectAcc;
	}

	public BigDecimal getBasicodp() {
		return this.basicodp;
	}

	public void setBasicodp(BigDecimal basicodp) {
		this.basicodp = basicodp;
	}

	public BigDecimal getBasictpl() {
		return this.basictpl;
	}

	public void setBasictpl(BigDecimal basictpl) {
		this.basictpl = basictpl;
	}

	public BigDecimal getBatchid() {
		return this.batchid;
	}

	public void setBatchid(BigDecimal batchid) {
		this.batchid = batchid;
	}

	public BigDecimal getBifuelkitpremium() {
		return this.bifuelkitpremium;
	}

	public void setBifuelkitpremium(BigDecimal bifuelkitpremium) {
		this.bifuelkitpremium = bifuelkitpremium;
	}

	public BigDecimal getBifuelkitvalue() {
		return this.bifuelkitvalue;
	}

	public void setBifuelkitvalue(BigDecimal bifuelkitvalue) {
		this.bifuelkitvalue = bifuelkitvalue;
	}

	public BigDecimal getBifueltppremium() {
		return this.bifueltppremium;
	}

	public void setBifueltppremium(BigDecimal bifueltppremium) {
		this.bifueltppremium = bifueltppremium;
	}

	public String getBodycolor() {
		return this.bodycolor;
	}

	public void setBodycolor(String bodycolor) {
		this.bodycolor = bodycolor;
	}

	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public BigDecimal getCc() {
		return this.cc;
	}

	public void setCc(BigDecimal cc) {
		this.cc = cc;
	}

	public String getChassisno() {
		return this.chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCitycode1() {
		return this.citycode1;
	}

	public void setCitycode1(String citycode1) {
		this.citycode1 = citycode1;
	}

	public String getCitycodetemp() {
		return this.citycodetemp;
	}

	public void setCitycodetemp(String citycodetemp) {
		this.citycodetemp = citycodetemp;
	}

	public BigDecimal getClaimIntiamtionId() {
		return this.claimIntiamtionId;
	}

	public void setClaimIntiamtionId(BigDecimal claimIntiamtionId) {
		this.claimIntiamtionId = claimIntiamtionId;
	}

	public BigDecimal getClaimSettledId() {
		return this.claimSettledId;
	}

	public void setClaimSettledId(BigDecimal claimSettledId) {
		this.claimSettledId = claimSettledId;
	}

	public String getClientcode() {
		return this.clientcode;
	}

	public void setClientcode(String clientcode) {
		this.clientcode = clientcode;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public BigDecimal getCompdeductibles() {
		return this.compdeductibles;
	}

	public void setCompdeductibles(BigDecimal compdeductibles) {
		this.compdeductibles = compdeductibles;
	}

	public String getDepositStatus() {
		return this.depositStatus;
	}

	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public BigDecimal getElecaccessorymrp() {
		return this.elecaccessorymrp;
	}

	public void setElecaccessorymrp(BigDecimal elecaccessorymrp) {
		this.elecaccessorymrp = elecaccessorymrp;
	}

	public BigDecimal getElectricaccidv() {
		return this.electricaccidv;
	}

	public void setElectricaccidv(BigDecimal electricaccidv) {
		this.electricaccidv = electricaccidv;
	}

	public BigDecimal getElectricaccpremium() {
		return this.electricaccpremium;
	}

	public void setElectricaccpremium(BigDecimal electricaccpremium) {
		this.electricaccpremium = electricaccpremium;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	public BigDecimal getExshowroomprice() {
		return this.exshowroomprice;
	}

	public void setExshowroomprice(BigDecimal exshowroomprice) {
		this.exshowroomprice = exshowroomprice;
	}

	public BigDecimal getExttppd() {
		return this.exttppd;
	}

	public void setExttppd(BigDecimal exttppd) {
		this.exttppd = exttppd;
	}

	public Date getFilegenerateddate() {
		return this.filegenerateddate;
	}

	public void setFilegenerateddate(Date filegenerateddate) {
		this.filegenerateddate = filegenerateddate;
	}

	public String getFilegeneratedtime() {
		return this.filegeneratedtime;
	}

	public void setFilegeneratedtime(String filegeneratedtime) {
		this.filegeneratedtime = filegeneratedtime;
	}

	public String getFinancerbranch() {
		return this.financerbranch;
	}

	public void setFinancerbranch(String financerbranch) {
		this.financerbranch = financerbranch;
	}

	public String getFinancercode() {
		return this.financercode;
	}

	public void setFinancercode(String financercode) {
		this.financercode = financercode;
	}

	public String getFinancercodetemp() {
		return this.financercodetemp;
	}

	public void setFinancercodetemp(String financercodetemp) {
		this.financercodetemp = financercodetemp;
	}

	public String getFirstissingdealercode() {
		return this.firstissingdealercode;
	}

	public void setFirstissingdealercode(String firstissingdealercode) {
		this.firstissingdealercode = firstissingdealercode;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFueltype() {
		return this.fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public BigDecimal getGeographicextnpremium() {
		return this.geographicextnpremium;
	}

	public void setGeographicextnpremium(BigDecimal geographicextnpremium) {
		this.geographicextnpremium = geographicextnpremium;
	}

	public BigDecimal getGrosspremium() {
		return this.grosspremium;
	}

	public void setGrosspremium(BigDecimal grosspremium) {
		this.grosspremium = grosspremium;
	}

	public String getHandicapDiscAmount() {
		return this.handicapDiscAmount;
	}

	public void setHandicapDiscAmount(String handicapDiscAmount) {
		this.handicapDiscAmount = handicapDiscAmount;
	}

	public String getHanumber() {
		return this.hanumber;
	}

	public void setHanumber(String hanumber) {
		this.hanumber = hanumber;
	}

	public String getHaproposalno() {
		return this.haproposalno;
	}

	public void setHaproposalno(String haproposalno) {
		this.haproposalno = haproposalno;
	}

	public String getImtcode() {
		return this.imtcode;
	}

	public void setImtcode(String imtcode) {
		this.imtcode = imtcode;
	}

	public String getInspectionagencyname() {
		return this.inspectionagencyname;
	}

	public void setInspectionagencyname(String inspectionagencyname) {
		this.inspectionagencyname = inspectionagencyname;
	}

	public String getInspectiondate() {
		return this.inspectiondate;
	}

	public void setInspectiondate(String inspectiondate) {
		this.inspectiondate = inspectiondate;
	}

	public String getInspectionreceiptno() {
		return this.inspectionreceiptno;
	}

	public void setInspectionreceiptno(String inspectionreceiptno) {
		this.inspectionreceiptno = inspectionreceiptno;
	}

	public String getInsuredAddress() {
		return this.insuredAddress;
	}

	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}

	public String getIsHandicapPolicy() {
		return this.isHandicapPolicy;
	}

	public void setIsHandicapPolicy(String isHandicapPolicy) {
		this.isHandicapPolicy = isHandicapPolicy;
	}

	public BigDecimal getIsaamembership() {
		return this.isaamembership;
	}

	public void setIsaamembership(BigDecimal isaamembership) {
		this.isaamembership = isaamembership;
	}

	public BigDecimal getIsantitheftattached() {
		return this.isantitheftattached;
	}

	public void setIsantitheftattached(BigDecimal isantitheftattached) {
		this.isantitheftattached = isantitheftattached;
	}

	public BigDecimal getIsbangladeshcovered() {
		return this.isbangladeshcovered;
	}

	public void setIsbangladeshcovered(BigDecimal isbangladeshcovered) {
		this.isbangladeshcovered = isbangladeshcovered;
	}

	public BigDecimal getIsbhutancovered() {
		return this.isbhutancovered;
	}

	public void setIsbhutancovered(BigDecimal isbhutancovered) {
		this.isbhutancovered = isbhutancovered;
	}

	public BigDecimal getIscsd() {
		return this.iscsd;
	}

	public void setIscsd(BigDecimal iscsd) {
		this.iscsd = iscsd;
	}

	public BigDecimal getIscustomerundertakingsubmit() {
		return this.iscustomerundertakingsubmit;
	}

	public void setIscustomerundertakingsubmit(BigDecimal iscustomerundertakingsubmit) {
		this.iscustomerundertakingsubmit = iscustomerundertakingsubmit;
	}

	public BigDecimal getIsllotheremp() {
		return this.isllotheremp;
	}

	public void setIsllotheremp(BigDecimal isllotheremp) {
		this.isllotheremp = isllotheremp;
	}

	public BigDecimal getIsllpaiddriver() {
		return this.isllpaiddriver;
	}

	public void setIsllpaiddriver(BigDecimal isllpaiddriver) {
		this.isllpaiddriver = isllpaiddriver;
	}

	public BigDecimal getIsllunnamedpass() {
		return this.isllunnamedpass;
	}

	public void setIsllunnamedpass(BigDecimal isllunnamedpass) {
		this.isllunnamedpass = isllunnamedpass;
	}

	public BigDecimal getIsmaldivescovered() {
		return this.ismaldivescovered;
	}

	public void setIsmaldivescovered(BigDecimal ismaldivescovered) {
		this.ismaldivescovered = ismaldivescovered;
	}

	public BigDecimal getIsncbcertificatesubmit() {
		return this.isncbcertificatesubmit;
	}

	public void setIsncbcertificatesubmit(BigDecimal isncbcertificatesubmit) {
		this.isncbcertificatesubmit = isncbcertificatesubmit;
	}

	public BigDecimal getIsnepalcovered() {
		return this.isnepalcovered;
	}

	public void setIsnepalcovered(BigDecimal isnepalcovered) {
		this.isnepalcovered = isnepalcovered;
	}

	public BigDecimal getIspakistancovered() {
		return this.ispakistancovered;
	}

	public void setIspakistancovered(BigDecimal ispakistancovered) {
		this.ispakistancovered = ispakistancovered;
	}

	public BigDecimal getIspapaiddriver() {
		return this.ispapaiddriver;
	}

	public void setIspapaiddriver(BigDecimal ispapaiddriver) {
		this.ispapaiddriver = ispapaiddriver;
	}

	public BigDecimal getIsprevpolcopysubmit() {
		return this.isprevpolcopysubmit;
	}

	public void setIsprevpolcopysubmit(BigDecimal isprevpolcopysubmit) {
		this.isprevpolcopysubmit = isprevpolcopysubmit;
	}

	public BigDecimal getIssrilankacovered() {
		return this.issrilankacovered;
	}

	public void setIssrilankacovered(BigDecimal issrilankacovered) {
		this.issrilankacovered = issrilankacovered;
	}

	public BigDecimal getKitidv() {
		return this.kitidv;
	}

	public void setKitidv(BigDecimal kitidv) {
		this.kitidv = kitidv;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigDecimal getLlotherempcount() {
		return this.llotherempcount;
	}

	public void setLlotherempcount(BigDecimal llotherempcount) {
		this.llotherempcount = llotherempcount;
	}

	public BigDecimal getLlotheremppremium() {
		return this.llotheremppremium;
	}

	public void setLlotheremppremium(BigDecimal llotheremppremium) {
		this.llotheremppremium = llotheremppremium;
	}

	public BigDecimal getLlpaiddrivpremium() {
		return this.llpaiddrivpremium;
	}

	public void setLlpaiddrivpremium(BigDecimal llpaiddrivpremium) {
		this.llpaiddrivpremium = llpaiddrivpremium;
	}

	public BigDecimal getLlunnamedpasscount() {
		return this.llunnamedpasscount;
	}

	public void setLlunnamedpasscount(BigDecimal llunnamedpasscount) {
		this.llunnamedpasscount = llunnamedpasscount;
	}

	public BigDecimal getLlunnamedpasspremium() {
		return this.llunnamedpasspremium;
	}

	public void setLlunnamedpasspremium(BigDecimal llunnamedpasspremium) {
		this.llunnamedpasspremium = llunnamedpasspremium;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getModelcode() {
		return this.modelcode;
	}

	public void setModelcode(String modelcode) {
		this.modelcode = modelcode;
	}

	public Timestamp getMovedDate() {
		return this.movedDate;
	}

	public void setMovedDate(Timestamp movedDate) {
		this.movedDate = movedDate;
	}

	public BigDecimal getNcbamount() {
		return this.ncbamount;
	}

	public void setNcbamount(BigDecimal ncbamount) {
		this.ncbamount = ncbamount;
	}

	public BigDecimal getNcbflag() {
		return this.ncbflag;
	}

	public void setNcbflag(BigDecimal ncbflag) {
		this.ncbflag = ncbflag;
	}

	public BigDecimal getNcbper() {
		return this.ncbper;
	}

	public void setNcbper(BigDecimal ncbper) {
		this.ncbper = ncbper;
	}

	public BigDecimal getNetliabilitypremiumb() {
		return this.netliabilitypremiumb;
	}

	public void setNetliabilitypremiumb(BigDecimal netliabilitypremiumb) {
		this.netliabilitypremiumb = netliabilitypremiumb;
	}

	public BigDecimal getNetodpremium() {
		return this.netodpremium;
	}

	public void setNetodpremium(BigDecimal netodpremium) {
		this.netodpremium = netodpremium;
	}

	public BigDecimal getNonelecaccessorymrp() {
		return this.nonelecaccessorymrp;
	}

	public void setNonelecaccessorymrp(BigDecimal nonelecaccessorymrp) {
		this.nonelecaccessorymrp = nonelecaccessorymrp;
	}

	public BigDecimal getNonelectricaccidv() {
		return this.nonelectricaccidv;
	}

	public void setNonelectricaccidv(BigDecimal nonelectricaccidv) {
		this.nonelectricaccidv = nonelectricaccidv;
	}

	public BigDecimal getNonelectricaccpremium() {
		return this.nonelectricaccpremium;
	}

	public void setNonelectricaccpremium(BigDecimal nonelectricaccpremium) {
		this.nonelectricaccpremium = nonelectricaccpremium;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPaNomineeAge() {
		return this.paNomineeAge;
	}

	public void setPaNomineeAge(String paNomineeAge) {
		this.paNomineeAge = paNomineeAge;
	}

	public String getPaNomineeName() {
		return this.paNomineeName;
	}

	public void setPaNomineeName(String paNomineeName) {
		this.paNomineeName = paNomineeName;
	}

	public String getPaNomineeRelation() {
		return this.paNomineeRelation;
	}

	public void setPaNomineeRelation(String paNomineeRelation) {
		this.paNomineeRelation = paNomineeRelation;
	}

	public BigDecimal getPacoverpremownerdriver() {
		return this.pacoverpremownerdriver;
	}

	public void setPacoverpremownerdriver(BigDecimal pacoverpremownerdriver) {
		this.pacoverpremownerdriver = pacoverpremownerdriver;
	}

	public BigDecimal getPacoverprempaiddriver() {
		return this.pacoverprempaiddriver;
	}

	public void setPacoverprempaiddriver(BigDecimal pacoverprempaiddriver) {
		this.pacoverprempaiddriver = pacoverprempaiddriver;
	}

	public BigDecimal getPacoverpremunnameddriver() {
		return this.pacoverpremunnameddriver;
	}

	public void setPacoverpremunnameddriver(BigDecimal pacoverpremunnameddriver) {
		this.pacoverpremunnameddriver = pacoverpremunnameddriver;
	}

	public String getPannumber() {
		return this.pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public BigDecimal getPanoofperson() {
		return this.panoofperson;
	}

	public void setPanoofperson(BigDecimal panoofperson) {
		this.panoofperson = panoofperson;
	}

	public BigDecimal getPasuminsuredperperson() {
		return this.pasuminsuredperperson;
	}

	public void setPasuminsuredperperson(BigDecimal pasuminsuredperperson) {
		this.pasuminsuredperperson = pasuminsuredperperson;
	}

	public BigDecimal getPatotalpremium() {
		return this.patotalpremium;
	}

	public void setPatotalpremium(BigDecimal patotalpremium) {
		this.patotalpremium = patotalpremium;
	}

	public Date getPayinslipdate() {
		return this.payinslipdate;
	}

	public void setPayinslipdate(Date payinslipdate) {
		this.payinslipdate = payinslipdate;
	}

	public String getPayinslipno() {
		return this.payinslipno;
	}

	public void setPayinslipno(String payinslipno) {
		this.payinslipno = payinslipno;
	}

	public BigDecimal getPaymentReconcileId() {
		return this.paymentReconcileId;
	}

	public void setPaymentReconcileId(BigDecimal paymentReconcileId) {
		this.paymentReconcileId = paymentReconcileId;
	}

	public String getPaymentReconcileStatus() {
		return this.paymentReconcileStatus;
	}

	public void setPaymentReconcileStatus(String paymentReconcileStatus) {
		this.paymentReconcileStatus = paymentReconcileStatus;
	}

	public BigDecimal getPincode() {
		return this.pincode;
	}

	public void setPincode(BigDecimal pincode) {
		this.pincode = pincode;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public Date getPolicycreateddate() {
		return this.policycreateddate;
	}

	public void setPolicycreateddate(Date policycreateddate) {
		this.policycreateddate = policycreateddate;
	}

	public String getPolicycreatedtime() {
		return this.policycreatedtime;
	}

	public void setPolicycreatedtime(String policycreatedtime) {
		this.policycreatedtime = policycreatedtime;
	}

	public Date getPolicyeffectivedate() {
		return this.policyeffectivedate;
	}

	public void setPolicyeffectivedate(Date policyeffectivedate) {
		this.policyeffectivedate = policyeffectivedate;
	}

	public String getPolicyeffectivetime() {
		return this.policyeffectivetime;
	}

	public void setPolicyeffectivetime(String policyeffectivetime) {
		this.policyeffectivetime = policyeffectivetime;
	}

	public Date getPolicyexpirydate() {
		return this.policyexpirydate;
	}

	public void setPolicyexpirydate(Date policyexpirydate) {
		this.policyexpirydate = policyexpirydate;
	}

	public String getPolicyissuingdealercode() {
		return this.policyissuingdealercode;
	}

	public void setPolicyissuingdealercode(String policyissuingdealercode) {
		this.policyissuingdealercode = policyissuingdealercode;
	}

	public String getPolicyissuingdealercodetemp() {
		return this.policyissuingdealercodetemp;
	}

	public void setPolicyissuingdealercodetemp(String policyissuingdealercodetemp) {
		this.policyissuingdealercodetemp = policyissuingdealercodetemp;
	}

	public String getPolicyno() {
		return this.policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public String getPolicytype() {
		return this.policytype;
	}

	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}

	public String getPrevinsurcompanyadd() {
		return this.previnsurcompanyadd;
	}

	public void setPrevinsurcompanyadd(String previnsurcompanyadd) {
		this.previnsurcompanyadd = previnsurcompanyadd;
	}

	public String getPrevinsurcompanycode() {
		return this.previnsurcompanycode;
	}

	public void setPrevinsurcompanycode(String previnsurcompanycode) {
		this.previnsurcompanycode = previnsurcompanycode;
	}

	public String getPrevinsurcompanyname() {
		return this.previnsurcompanyname;
	}

	public void setPrevinsurcompanyname(String previnsurcompanyname) {
		this.previnsurcompanyname = previnsurcompanyname;
	}

	public String getPrevpolicydealercode() {
		return this.prevpolicydealercode;
	}

	public void setPrevpolicydealercode(String prevpolicydealercode) {
		this.prevpolicydealercode = prevpolicydealercode;
	}

	public Date getPrevpolicyeffectivedate() {
		return this.prevpolicyeffectivedate;
	}

	public void setPrevpolicyeffectivedate(Date prevpolicyeffectivedate) {
		this.prevpolicyeffectivedate = prevpolicyeffectivedate;
	}

	public Date getPrevpolicyexpirydate() {
		return this.prevpolicyexpirydate;
	}

	public void setPrevpolicyexpirydate(Date prevpolicyexpirydate) {
		this.prevpolicyexpirydate = prevpolicyexpirydate;
	}

	public String getPrevpolicyno() {
		return this.prevpolicyno;
	}

	public void setPrevpolicyno(String prevpolicyno) {
		this.prevpolicyno = prevpolicyno;
	}

	public String getProposerpaymentMode() {
		return this.proposerpaymentMode;
	}

	public void setProposerpaymentMode(String proposerpaymentMode) {
		this.proposerpaymentMode = proposerpaymentMode;
	}

	public String getProposertype() {
		return this.proposertype;
	}

	public void setProposertype(String proposertype) {
		this.proposertype = proposertype;
	}

	public BigDecimal getReconciledchequeamount() {
		return this.reconciledchequeamount;
	}

	public void setReconciledchequeamount(BigDecimal reconciledchequeamount) {
		this.reconciledchequeamount = reconciledchequeamount;
	}

	public String getReconciledchequebank() {
		return this.reconciledchequebank;
	}

	public void setReconciledchequebank(String reconciledchequebank) {
		this.reconciledchequebank = reconciledchequebank;
	}

	public String getReconciledchequebanktemp() {
		return this.reconciledchequebanktemp;
	}

	public void setReconciledchequebanktemp(String reconciledchequebanktemp) {
		this.reconciledchequebanktemp = reconciledchequebanktemp;
	}

	public String getReconciledchequebranch() {
		return this.reconciledchequebranch;
	}

	public void setReconciledchequebranch(String reconciledchequebranch) {
		this.reconciledchequebranch = reconciledchequebranch;
	}

	public Date getReconciledchequedate() {
		return this.reconciledchequedate;
	}

	public void setReconciledchequedate(Date reconciledchequedate) {
		this.reconciledchequedate = reconciledchequedate;
	}

	public String getReconciledchequeissuedby() {
		return this.reconciledchequeissuedby;
	}

	public void setReconciledchequeissuedby(String reconciledchequeissuedby) {
		this.reconciledchequeissuedby = reconciledchequeissuedby;
	}

	public String getReconciledchequeno() {
		return this.reconciledchequeno;
	}

	public void setReconciledchequeno(String reconciledchequeno) {
		this.reconciledchequeno = reconciledchequeno;
	}

	public String getRegistrationno() {
		return this.registrationno;
	}

	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}

	public String getRtocode() {
		return this.rtocode;
	}

	public void setRtocode(String rtocode) {
		this.rtocode = rtocode;
	}

	public String getRtocodetemp() {
		return this.rtocodetemp;
	}

	public void setRtocodetemp(String rtocodetemp) {
		this.rtocodetemp = rtocodetemp;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public BigDecimal getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(BigDecimal seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public BigDecimal getServicetax() {
		return this.servicetax;
	}

	public void setServicetax(BigDecimal servicetax) {
		this.servicetax = servicetax;
	}

	public String getSettlementType() {
		return this.settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatecode() {
		return this.statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getStatecodetemp() {
		return this.statecodetemp;
	}

	public void setStatecodetemp(String statecodetemp) {
		this.statecodetemp = statecodetemp;
	}

	public String getTarrifzone() {
		return this.tarrifzone;
	}

	public void setTarrifzone(String tarrifzone) {
		this.tarrifzone = tarrifzone;
	}

	public BigDecimal getTotallegalliability() {
		return this.totallegalliability;
	}

	public void setTotallegalliability(BigDecimal totallegalliability) {
		this.totallegalliability = totallegalliability;
	}

	public BigDecimal getTotalpremium() {
		return this.totalpremium;
	}

	public void setTotalpremium(BigDecimal totalpremium) {
		this.totalpremium = totalpremium;
	}

	public BigDecimal getTotaltp() {
		return this.totaltp;
	}

	public void setTotaltp(BigDecimal totaltp) {
		this.totaltp = totaltp;
	}

	public String getValidateStatus() {
		return this.validateStatus;
	}

	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}

	public String getVariantcode() {
		return this.variantcode;
	}

	public void setVariantcode(String variantcode) {
		this.variantcode = variantcode;
	}

	public String getVariantcodetemp() {
		return this.variantcodetemp;
	}

	public void setVariantcodetemp(String variantcodetemp) {
		this.variantcodetemp = variantcodetemp;
	}

	public BigDecimal getVehcileinspectionagencycode() {
		return this.vehcileinspectionagencycode;
	}

	public void setVehcileinspectionagencycode(BigDecimal vehcileinspectionagencycode) {
		this.vehcileinspectionagencycode = vehcileinspectionagencycode;
	}

	public Date getVehcileinspectiondate() {
		return this.vehcileinspectiondate;
	}

	public void setVehcileinspectiondate(Date vehcileinspectiondate) {
		this.vehcileinspectiondate = vehcileinspectiondate;
	}

	public String getVehicleclass() {
		return this.vehicleclass;
	}

	public void setVehicleclass(String vehicleclass) {
		this.vehicleclass = vehicleclass;
	}

	public BigDecimal getVehicleidv() {
		return this.vehicleidv;
	}

	public void setVehicleidv(BigDecimal vehicleidv) {
		this.vehicleidv = vehicleidv;
	}

	public Date getVehicleinvoicedate() {
		return this.vehicleinvoicedate;
	}

	public void setVehicleinvoicedate(Date vehicleinvoicedate) {
		this.vehicleinvoicedate = vehicleinvoicedate;
	}

	public BigDecimal getVehiclepremium() {
		return this.vehiclepremium;
	}

	public void setVehiclepremium(BigDecimal vehiclepremium) {
		this.vehiclepremium = vehiclepremium;
	}

	public BigDecimal getVoluntarydeductible() {
		return this.voluntarydeductible;
	}

	public void setVoluntarydeductible(BigDecimal voluntarydeductible) {
		this.voluntarydeductible = voluntarydeductible;
	}

	public BigDecimal getVoluntarydisc() {
		return this.voluntarydisc;
	}

	public void setVoluntarydisc(BigDecimal voluntarydisc) {
		this.voluntarydisc = voluntarydisc;
	}

	public BigDecimal getXgenDownloadId() {
		return this.xgenDownloadId;
	}

	public void setXgenDownloadId(BigDecimal xgenDownloadId) {
		this.xgenDownloadId = xgenDownloadId;
	}

	public String getXgenDownloadStatus() {
		return this.xgenDownloadStatus;
	}

	public void setXgenDownloadStatus(String xgenDownloadStatus) {
		this.xgenDownloadStatus = xgenDownloadStatus;
	}

	public String getXgenEndorsementNo() {
		return this.xgenEndorsementNo;
	}

	public void setXgenEndorsementNo(String xgenEndorsementNo) {
		this.xgenEndorsementNo = xgenEndorsementNo;
	}

	public Timestamp getXgenMovedDate() {
		return this.xgenMovedDate;
	}

	public void setXgenMovedDate(Timestamp xgenMovedDate) {
		this.xgenMovedDate = xgenMovedDate;
	}

	public String getXgenMovedStatus() {
		return this.xgenMovedStatus;
	}

	public void setXgenMovedStatus(String xgenMovedStatus) {
		this.xgenMovedStatus = xgenMovedStatus;
	}

	public String getXgenPolicyNumber() {
		return this.xgenPolicyNumber;
	}

	public void setXgenPolicyNumber(String xgenPolicyNumber) {
		this.xgenPolicyNumber = xgenPolicyNumber;
	}

	public String getXgenProductCode() {
		return this.xgenProductCode;
	}

	public void setXgenProductCode(String xgenProductCode) {
		this.xgenProductCode = xgenProductCode;
	}

	public BigDecimal getXgenProductId() {
		return this.xgenProductId;
	}

	public void setXgenProductId(BigDecimal xgenProductId) {
		this.xgenProductId = xgenProductId;
	}

	public Timestamp getXgenReceiptDate() {
		return this.xgenReceiptDate;
	}

	public void setXgenReceiptDate(Timestamp xgenReceiptDate) {
		this.xgenReceiptDate = xgenReceiptDate;
	}

	public String getXgenReceiptNumber() {
		return this.xgenReceiptNumber;
	}

	public void setXgenReceiptNumber(String xgenReceiptNumber) {
		this.xgenReceiptNumber = xgenReceiptNumber;
	}

	public String getYearofmanufacture() {
		return this.yearofmanufacture;
	}

	public void setYearofmanufacture(String yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}

}*/