/*package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


*//**
 * The persistent class for the TTRN_ADITYA_NEWRENEWAL database table.
 * 
 *//*
@Entity
@Table(name="TTRN_ADITYA_NEWRENEWAL")
public class TtrnAdityaNewrenewal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=200)
	private String aadiscamount;

	@Column(length=200)
	private String aaexpiryperiod;

	@Column(length=200)
	private String aamemno;

	@Column(length=200)
	private String active;

	@Column(length=200)
	private String addonaddtowingamt;

	@Column(length=200)
	private String addonconsumablesamt;

	@Column(length=200)
	private String addoncourtesycaramt;

	@Column(precision=22)
	private BigDecimal addonemicoveramt;

	@Column(length=200)
	private String addonengineprotamt;

	@Column(length=200)
	private String addonisaddtowing;

	@Column(length=200)
	private String addonisconsumable;

	@Column(length=200)
	private String addoniscourtesycar;

	@Column(length=200)
	private String addonisemicover;

	@Column(length=200)
	private String addonisengineprot;

	@Column(length=200)
	private String addonisncbprot;

	@Column(length=200)
	private String addonisnildep;

	@Column(length=200)
	private String addonispersonalbelonging;

	@Column(length=200)
	private String addonisrti;

	@Column(length=200)
	private String addonncbprotamt;

	@Column(precision=22)
	private BigDecimal addonnildepamt;

	@Column(length=200)
	private String addonpersonalbelongingamt;

	@Column(length=200)
	private String addonrtiamt;

	@Column(length=200)
	private String address1;

	@Column(length=200)
	private String address2;

	@Column(length=200)
	private String address3;

	@Column(length=200)
	private String aggrementtype;

	@Column(precision=22)
	private BigDecimal antitheftdiscamount;

	@Column(name="APD_ID", length=200)
	private String apdId;

	@Temporal(TemporalType.DATE)
	@Column(name="APD_UPDATE_DATE")
	private Date apdUpdateDate;

	@Column(length=200)
	private String bankname;

	@Column(length=200)
	private String basicodp;

	@Column(precision=22)
	private BigDecimal basictpl;

	@Column(length=200)
	private String batchid;

	@Column(precision=22)
	private BigDecimal bifuelkitidv;

	@Column(precision=22)
	private BigDecimal bifuelkitpremium;

	@Column(precision=22)
	private BigDecimal bifuelkitvalue;

	@Column(precision=22)
	private BigDecimal bifueltppremium;

	@Column(precision=22)
	private BigDecimal bodyidv;

	@Column(length=200)
	private String branchcode;

	@Column(length=200)
	private String carriertype;

	@Column(precision=22)
	private BigDecimal carryingcapacity;

	@Column(length=200)
	private String cc;

	@Column(length=200)
	private String chassisno;

	@Temporal(TemporalType.DATE)
	@Column(name="CHEQUE_DATE")
	private Date chequeDate;

	@Column(name="CHEQUE_NO", length=200)
	private String chequeNo;

	@Column(length=200)
	private String chequeamount;

	@Column(length=200)
	private String citycode;

	@Column(length=200)
	private String citycode1;

	@Column(length=200)
	private String citycodetemp;

	@Column(name="CLAIM_INTIAMTION_ID", length=200)
	private String claimIntiamtionId;

	@Column(name="CLAIM_SETTLED_ID", length=200)
	private String claimSettledId;

	@Column(length=200)
	private String clientcode;

	@Column(length=200)
	private String companyname;

	@Column(length=200)
	private String compdeductibles;

	@Column(length=200)
	private String cvmisctype;

	@Temporal(TemporalType.DATE)
	private Date dateofbirth;

	@Column(name="DEPOSIT_STATUS", length=200)
	private String depositStatus;

	@Column(length=200)
	private String electricaccidv;

	@Column(precision=22)
	private BigDecimal electricaccpremium;

	@Column(length=200)
	private String email;

	@Column(name="EMPLOYEE_CODE", length=200)
	private String employeeCode;

	@Column(length=200)
	private String engineno;

	@Column(precision=22)
	private BigDecimal exshowroomprice;

	@Column(length=200)
	private String exttppd;

	@Temporal(TemporalType.DATE)
	private Date filegenerateddate;

	@Column(length=10)
	private String filegeneratedtime;

	@Column(length=200)
	private String financerbranch;

	@Column(length=200)
	private String financercode;

	@Column(length=200)
	private String financercodetemp;

	@Column(length=200)
	private String firstissingdealercode;

	@Column(length=200)
	private String firstname;

	@Column(length=1)
	private String gender;

	@Column(precision=22)
	private BigDecimal geographicextnpremium;

	@Column(precision=22)
	private BigDecimal geographicextntppremium;

	@Column(precision=22)
	private BigDecimal grosspremium;

	@Column(length=200)
	private String gvw;

	@Column(precision=22)
	private BigDecimal imt23premium;

	@Column(precision=22)
	private BigDecimal imt33premium;

	@Column(precision=22)
	private BigDecimal imt34premium;

	@Column(length=200)
	private String imt34tp;

	@Column(length=200)
	private String imtcode;

	@Column(length=200)
	private String inscovertype;

	@Temporal(TemporalType.DATE)
	private Date inspolicyeffectivedate;

	@Column(length=50)
	private String inspolicyeffectivetime;

	@Temporal(TemporalType.DATE)
	private Date inspolicyexpirydate;

	@Column(length=200)
	private String inspolicyissuingdealercode;

	@Column(length=1)
	private String inspolicytype;

	@Column(length=200)
	private String isaamembership;

	@Column(length=200)
	private String isantitheftattached;

	@Column(length=200)
	private String isbangladeshcovered;

	@Column(length=200)
	private String isbhutancovered;

	@Column(length=200)
	private String iscustomerundertakingsubmit;

	@Column(length=200)
	private String isllcleaner;

	@Column(length=200)
	private String isllconductor;

	@Column(length=200)
	private String isllhelper;

	@Column(length=200)
	private String isllnfpp;

	@Column(length=200)
	private String isllotheremp;

	@Column(length=200)
	private String isllpaiddriver;

	@Column(length=200)
	private String isllunnamedpass;

	@Column(length=200)
	private String ismaldivescovered;

	@Column(length=200)
	private String isncbcertificatesubmit;

	@Column(length=200)
	private String isnepalcovered;

	@Column(length=200)
	private String isownpremises;

	@Column(length=200)
	private String ispacleaner;

	@Column(length=200)
	private String ispaconductor;

	@Column(length=200)
	private String ispahelper;

	@Column(length=200)
	private String ispakistancovered;

	@Column(length=200)
	private String ispapaiddriver;

	@Column(length=200)
	private String isprevpolcopysubmit;

	@Column(length=200)
	private String isproposalmanualapproved;

	@Column(length=200)
	private String issrilankacovered;

	@Column(length=200)
	private String lastname;

	@Column(length=200)
	private String leadby;

	@Column(precision=22)
	private BigDecimal llcleanerpremium;

	@Column(precision=22)
	private BigDecimal llconductorpremium;

	@Column(precision=22)
	private BigDecimal llhelperpremium;

	@Column(length=200)
	private String llnfppcount;

	@Column(precision=22)
	private BigDecimal llnfpppremium;

	@Column(length=200)
	private String llotherempcount;

	@Column(precision=22)
	private BigDecimal llotheremppremium;

	@Column(precision=22)
	private BigDecimal llpaiddrivpremium;

	@Column(length=200)
	private String llunnamedpasscount;

	@Column(precision=22)
	private BigDecimal llunnamedpasspremium;

	@Column(length=200)
	private String make;

	@Column(length=200)
	private String middlename;

	@Column(length=200)
	private String modelcode;

	@Temporal(TemporalType.DATE)
	@Column(name="MOVED_DATE")
	private Date movedDate;

	@Column(precision=22)
	private BigDecimal ncbamount;

	@Column(length=200)
	private String ncbflag;

	@Column(length=200)
	private String ncbper;

	@Column(precision=22)
	private BigDecimal netliabilitypremiumb;

	@Column(precision=22)
	private BigDecimal netodpremium;

	@Column(length=200)
	private String nonelectricaccidv;

	@Column(precision=22)
	private BigDecimal nonelectricaccpremium;

	@Column(length=200)
	private String noofcleanerll;

	@Column(length=200)
	private String noofcleanerpa;

	@Column(length=200)
	private String noofconductorll;

	@Column(length=200)
	private String noofconductorpa;

	@Column(length=200)
	private String noofhelperll;

	@Column(length=200)
	private String noofhelperpa;

	@Column(length=200)
	private String noofpaiddriverll;

	@Column(length=200)
	private String noofpaiddriverpa;

	@Column(precision=22)
	private BigDecimal nooftrailers;

	@Column(length=200)
	private String oddiscper;

	@Column(length=200)
	private String overturncover;

	@Column(length=200)
	private String pacoverpillionrider;

	@Column(length=200)
	private String pacoverpremcleaner;

	@Column(length=200)
	private String pacoverpremconductor;

	@Column(length=200)
	private String pacoverpremhelper;

	@Column(length=200)
	private String pacoverpremownerdriver;

	@Column(length=200)
	private String pacoverprempaiddriver;

	@Column(length=200)
	private String pacoverpremunnamedperson;

	@Column(length=200)
	private String pacoverunnameddriver;

	@Column(length=200)
	private String pannumber;

	@Column(length=200)
	private String panoofperson;

	@Column(length=200)
	private String paowndriverappointeename;

	@Column(length=200)
	private String paowndriverappointeerelation;

	@Column(precision=22)
	private BigDecimal paowndrivernomage;

	@Column(length=1)
	private String paowndrivernomgender;

	@Column(length=200)
	private String paowndrivernomname;

	@Column(length=200)
	private String paowndrivernomreleation;

	@Column(length=200)
	private String pasuminsuredperemployee;

	@Column(length=200)
	private String pasuminsuredperunnamedperson;

	@Column(precision=22)
	private BigDecimal patotalpremium;

	@Temporal(TemporalType.DATE)
	private Date payinslipdate;

	@Column(length=200)
	private String payinslipno;

	@Column(name="PAYMENT_RECONCILE_ID", length=200)
	private String paymentReconcileId;

	@Column(name="PAYMENT_RECONCILE_STATUS", length=200)
	private String paymentReconcileStatus;

	@Column(length=200)
	private String paymentid;

	@Column(precision=22)
	private BigDecimal pincode;

	@Id
	@Column(name="POLICY_NO", length=200)
	private String policyNo;

	@Column(name="POLICY_STATUS", length=200)
	private String policyStatus;

	@Column(length=200)
	private String policyissuingdealercodetemp;

	@Column(length=200)
	private String premiumcalculatedby;

	@Column(length=200)
	private String previnsurcompanyadd;

	@Column(length=200)
	private String previnsurcompanycode;

	@Column(length=200)
	private String previnsurcompanyname;

	@Temporal(TemporalType.DATE)
	private Date prevpolicyeffectivedate;

	@Temporal(TemporalType.DATE)
	private Date prevpolicyexpirydate;

	@Column(length=200)
	private String prevpolicyno;

	@Temporal(TemporalType.DATE)
	private Date proposalcreateddate;

	@Column(length=100)
	private String proposalcreatedtime;

	@Column(length=200)
	private String proposerpan;

	@Column(length=200)
	private String proposerpaymentmode;

	@Column(length=200)
	private String proposertype;

	@Column(length=200)
	private String reconciledchequeamount;

	@Column(length=200)
	private String reconciledchequebank;

	@Column(length=200)
	private String reconciledchequebanktemp;

	@Column(length=200)
	private String reconciledchequebranch;

	@Column(length=50)
	private String reconciledchequedate;

	@Column(length=1)
	private String reconciledchequeissuedby;

	@Column(length=200)
	private String reconciledchequeno;

	@Temporal(TemporalType.DATE)
	private Date registrationdate;

	@Column(length=200)
	private String registrationno;

	@Column(length=200)
	private String rtocode;

	@Column(length=200)
	private String rtocodetemp;

	@Column(length=200)
	private String salutation;

	@Column(precision=22)
	private BigDecimal servicetax;

	@Column(name="SETTLEMENT_TYPE", length=200)
	private String settlementType;

	@Column(length=200)
	private String statecode;

	@Column(length=200)
	private String statecodetemp;

	@Column(length=200)
	private String tariffpaxrange;

	@Column(precision=22)
	private BigDecimal totalidv;

	@Column(length=200)
	private String totallegalliability;

	@Column(precision=22)
	private BigDecimal totalpremium;

	@Column(precision=22)
	private BigDecimal totaltp;

	@Column(precision=22)
	private BigDecimal trailerchassisno;

	@Column(precision=22)
	private BigDecimal traileridv;

	@Column(precision=22)
	private BigDecimal trailerpremium;

	@Column(precision=22)
	private BigDecimal trailerregistrationno;

	@Column(length=200)
	private String trailertp;

	@Column(length=200)
	private String uniquereferenceno;

	@Column(name="VALIDATE_STATUS", length=200)
	private String validateStatus;

	@Column(length=200)
	private String variantcode;

	@Column(length=200)
	private String variantcodetemp;

	@Column(length=200)
	private String vehicleclass;

	@Column(precision=22)
	private BigDecimal vehicleidv;

	@Temporal(TemporalType.DATE)
	private Date vehicleinvoicedate;

	@Column(precision=22)
	private BigDecimal vehiclepremium;

	@Column(length=200)
	private String vehiclesubclass;

	@Column(length=200)
	private String vehicletype;

	@Column(length=200)
	private String voluntarydeductible;

	@Column(length=200)
	private String voluntarydisc;

	@Column(name="XGEN_DOWNLOAD_ID", length=200)
	private String xgenDownloadId;

	@Column(name="XGEN_DOWNLOAD_STATUS", length=200)
	private String xgenDownloadStatus;

	@Column(name="XGEN_ENDORSEMENT_NO", length=200)
	private String xgenEndorsementNo;

	@Temporal(TemporalType.DATE)
	@Column(name="XGEN_MOVED_DATE")
	private Date xgenMovedDate;

	@Column(name="XGEN_MOVED_STATUS", length=200)
	private String xgenMovedStatus;

	@Column(name="XGEN_POLICY_NUMBER", length=200)
	private String xgenPolicyNumber;

	@Column(name="XGEN_PRODUCT_CODE", length=200)
	private String xgenProductCode;

	@Column(name="XGEN_PRODUCT_ID", length=200)
	private String xgenProductId;

	@Temporal(TemporalType.DATE)
	@Column(name="XGEN_RECEIPT_DATE")
	private Date xgenReceiptDate;

	@Column(name="XGEN_RECEIPT_NUMBER", length=100)
	private String xgenReceiptNumber;

	@Column(precision=22)
	private BigDecimal yearofmanufacture;

	public TtrnAdityaNewrenewal() {
	}

	public String getAadiscamount() {
		return this.aadiscamount;
	}

	public void setAadiscamount(String aadiscamount) {
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

	public String getAddonaddtowingamt() {
		return this.addonaddtowingamt;
	}

	public void setAddonaddtowingamt(String addonaddtowingamt) {
		this.addonaddtowingamt = addonaddtowingamt;
	}

	public String getAddonconsumablesamt() {
		return this.addonconsumablesamt;
	}

	public void setAddonconsumablesamt(String addonconsumablesamt) {
		this.addonconsumablesamt = addonconsumablesamt;
	}

	public String getAddoncourtesycaramt() {
		return this.addoncourtesycaramt;
	}

	public void setAddoncourtesycaramt(String addoncourtesycaramt) {
		this.addoncourtesycaramt = addoncourtesycaramt;
	}

	public BigDecimal getAddonemicoveramt() {
		return this.addonemicoveramt;
	}

	public void setAddonemicoveramt(BigDecimal addonemicoveramt) {
		this.addonemicoveramt = addonemicoveramt;
	}

	public String getAddonengineprotamt() {
		return this.addonengineprotamt;
	}

	public void setAddonengineprotamt(String addonengineprotamt) {
		this.addonengineprotamt = addonengineprotamt;
	}

	public String getAddonisaddtowing() {
		return this.addonisaddtowing;
	}

	public void setAddonisaddtowing(String addonisaddtowing) {
		this.addonisaddtowing = addonisaddtowing;
	}

	public String getAddonisconsumable() {
		return this.addonisconsumable;
	}

	public void setAddonisconsumable(String addonisconsumable) {
		this.addonisconsumable = addonisconsumable;
	}

	public String getAddoniscourtesycar() {
		return this.addoniscourtesycar;
	}

	public void setAddoniscourtesycar(String addoniscourtesycar) {
		this.addoniscourtesycar = addoniscourtesycar;
	}

	public String getAddonisemicover() {
		return this.addonisemicover;
	}

	public void setAddonisemicover(String addonisemicover) {
		this.addonisemicover = addonisemicover;
	}

	public String getAddonisengineprot() {
		return this.addonisengineprot;
	}

	public void setAddonisengineprot(String addonisengineprot) {
		this.addonisengineprot = addonisengineprot;
	}

	public String getAddonisncbprot() {
		return this.addonisncbprot;
	}

	public void setAddonisncbprot(String addonisncbprot) {
		this.addonisncbprot = addonisncbprot;
	}

	public String getAddonisnildep() {
		return this.addonisnildep;
	}

	public void setAddonisnildep(String addonisnildep) {
		this.addonisnildep = addonisnildep;
	}

	public String getAddonispersonalbelonging() {
		return this.addonispersonalbelonging;
	}

	public void setAddonispersonalbelonging(String addonispersonalbelonging) {
		this.addonispersonalbelonging = addonispersonalbelonging;
	}

	public String getAddonisrti() {
		return this.addonisrti;
	}

	public void setAddonisrti(String addonisrti) {
		this.addonisrti = addonisrti;
	}

	public String getAddonncbprotamt() {
		return this.addonncbprotamt;
	}

	public void setAddonncbprotamt(String addonncbprotamt) {
		this.addonncbprotamt = addonncbprotamt;
	}

	public BigDecimal getAddonnildepamt() {
		return this.addonnildepamt;
	}

	public void setAddonnildepamt(BigDecimal addonnildepamt) {
		this.addonnildepamt = addonnildepamt;
	}

	public String getAddonpersonalbelongingamt() {
		return this.addonpersonalbelongingamt;
	}

	public void setAddonpersonalbelongingamt(String addonpersonalbelongingamt) {
		this.addonpersonalbelongingamt = addonpersonalbelongingamt;
	}

	public String getAddonrtiamt() {
		return this.addonrtiamt;
	}

	public void setAddonrtiamt(String addonrtiamt) {
		this.addonrtiamt = addonrtiamt;
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

	public String getApdId() {
		return this.apdId;
	}

	public void setApdId(String apdId) {
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

	public String getBasicodp() {
		return this.basicodp;
	}

	public void setBasicodp(String basicodp) {
		this.basicodp = basicodp;
	}

	public BigDecimal getBasictpl() {
		return this.basictpl;
	}

	public void setBasictpl(BigDecimal basictpl) {
		this.basictpl = basictpl;
	}

	public String getBatchid() {
		return this.batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public BigDecimal getBifuelkitidv() {
		return this.bifuelkitidv;
	}

	public void setBifuelkitidv(BigDecimal bifuelkitidv) {
		this.bifuelkitidv = bifuelkitidv;
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

	public BigDecimal getBodyidv() {
		return this.bodyidv;
	}

	public void setBodyidv(BigDecimal bodyidv) {
		this.bodyidv = bodyidv;
	}

	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getCarriertype() {
		return this.carriertype;
	}

	public void setCarriertype(String carriertype) {
		this.carriertype = carriertype;
	}

	public BigDecimal getCarryingcapacity() {
		return this.carryingcapacity;
	}

	public void setCarryingcapacity(BigDecimal carryingcapacity) {
		this.carryingcapacity = carryingcapacity;
	}

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getChassisno() {
		return this.chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	public Date getChequeDate() {
		return this.chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getChequeNo() {
		return this.chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeamount() {
		return this.chequeamount;
	}

	public void setChequeamount(String chequeamount) {
		this.chequeamount = chequeamount;
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

	public String getClaimIntiamtionId() {
		return this.claimIntiamtionId;
	}

	public void setClaimIntiamtionId(String claimIntiamtionId) {
		this.claimIntiamtionId = claimIntiamtionId;
	}

	public String getClaimSettledId() {
		return this.claimSettledId;
	}

	public void setClaimSettledId(String claimSettledId) {
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

	public String getCompdeductibles() {
		return this.compdeductibles;
	}

	public void setCompdeductibles(String compdeductibles) {
		this.compdeductibles = compdeductibles;
	}

	public String getCvmisctype() {
		return this.cvmisctype;
	}

	public void setCvmisctype(String cvmisctype) {
		this.cvmisctype = cvmisctype;
	}

	public Date getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getDepositStatus() {
		return this.depositStatus;
	}

	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}

	public String getElectricaccidv() {
		return this.electricaccidv;
	}

	public void setElectricaccidv(String electricaccidv) {
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

	public String getExttppd() {
		return this.exttppd;
	}

	public void setExttppd(String exttppd) {
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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getGeographicextnpremium() {
		return this.geographicextnpremium;
	}

	public void setGeographicextnpremium(BigDecimal geographicextnpremium) {
		this.geographicextnpremium = geographicextnpremium;
	}

	public BigDecimal getGeographicextntppremium() {
		return this.geographicextntppremium;
	}

	public void setGeographicextntppremium(BigDecimal geographicextntppremium) {
		this.geographicextntppremium = geographicextntppremium;
	}

	public BigDecimal getGrosspremium() {
		return this.grosspremium;
	}

	public void setGrosspremium(BigDecimal grosspremium) {
		this.grosspremium = grosspremium;
	}

	public String getGvw() {
		return this.gvw;
	}

	public void setGvw(String gvw) {
		this.gvw = gvw;
	}

	public BigDecimal getImt23premium() {
		return this.imt23premium;
	}

	public void setImt23premium(BigDecimal imt23premium) {
		this.imt23premium = imt23premium;
	}

	public BigDecimal getImt33premium() {
		return this.imt33premium;
	}

	public void setImt33premium(BigDecimal imt33premium) {
		this.imt33premium = imt33premium;
	}

	public BigDecimal getImt34premium() {
		return this.imt34premium;
	}

	public void setImt34premium(BigDecimal imt34premium) {
		this.imt34premium = imt34premium;
	}

	public String getImt34tp() {
		return this.imt34tp;
	}

	public void setImt34tp(String imt34tp) {
		this.imt34tp = imt34tp;
	}

	public String getImtcode() {
		return this.imtcode;
	}

	public void setImtcode(String imtcode) {
		this.imtcode = imtcode;
	}

	public String getInscovertype() {
		return this.inscovertype;
	}

	public void setInscovertype(String inscovertype) {
		this.inscovertype = inscovertype;
	}

	public Date getInspolicyeffectivedate() {
		return this.inspolicyeffectivedate;
	}

	public void setInspolicyeffectivedate(Date inspolicyeffectivedate) {
		this.inspolicyeffectivedate = inspolicyeffectivedate;
	}

	public String getInspolicyeffectivetime() {
		return this.inspolicyeffectivetime;
	}

	public void setInspolicyeffectivetime(String inspolicyeffectivetime) {
		this.inspolicyeffectivetime = inspolicyeffectivetime;
	}

	public Date getInspolicyexpirydate() {
		return this.inspolicyexpirydate;
	}

	public void setInspolicyexpirydate(Date inspolicyexpirydate) {
		this.inspolicyexpirydate = inspolicyexpirydate;
	}

	public String getInspolicyissuingdealercode() {
		return this.inspolicyissuingdealercode;
	}

	public void setInspolicyissuingdealercode(String inspolicyissuingdealercode) {
		this.inspolicyissuingdealercode = inspolicyissuingdealercode;
	}

	public String getInspolicytype() {
		return this.inspolicytype;
	}

	public void setInspolicytype(String inspolicytype) {
		this.inspolicytype = inspolicytype;
	}

	public String getIsaamembership() {
		return this.isaamembership;
	}

	public void setIsaamembership(String isaamembership) {
		this.isaamembership = isaamembership;
	}

	public String getIsantitheftattached() {
		return this.isantitheftattached;
	}

	public void setIsantitheftattached(String isantitheftattached) {
		this.isantitheftattached = isantitheftattached;
	}

	public String getIsbangladeshcovered() {
		return this.isbangladeshcovered;
	}

	public void setIsbangladeshcovered(String isbangladeshcovered) {
		this.isbangladeshcovered = isbangladeshcovered;
	}

	public String getIsbhutancovered() {
		return this.isbhutancovered;
	}

	public void setIsbhutancovered(String isbhutancovered) {
		this.isbhutancovered = isbhutancovered;
	}

	public String getIscustomerundertakingsubmit() {
		return this.iscustomerundertakingsubmit;
	}

	public void setIscustomerundertakingsubmit(String iscustomerundertakingsubmit) {
		this.iscustomerundertakingsubmit = iscustomerundertakingsubmit;
	}

	public String getIsllcleaner() {
		return this.isllcleaner;
	}

	public void setIsllcleaner(String isllcleaner) {
		this.isllcleaner = isllcleaner;
	}

	public String getIsllconductor() {
		return this.isllconductor;
	}

	public void setIsllconductor(String isllconductor) {
		this.isllconductor = isllconductor;
	}

	public String getIsllhelper() {
		return this.isllhelper;
	}

	public void setIsllhelper(String isllhelper) {
		this.isllhelper = isllhelper;
	}

	public String getIsllnfpp() {
		return this.isllnfpp;
	}

	public void setIsllnfpp(String isllnfpp) {
		this.isllnfpp = isllnfpp;
	}

	public String getIsllotheremp() {
		return this.isllotheremp;
	}

	public void setIsllotheremp(String isllotheremp) {
		this.isllotheremp = isllotheremp;
	}

	public String getIsllpaiddriver() {
		return this.isllpaiddriver;
	}

	public void setIsllpaiddriver(String isllpaiddriver) {
		this.isllpaiddriver = isllpaiddriver;
	}

	public String getIsllunnamedpass() {
		return this.isllunnamedpass;
	}

	public void setIsllunnamedpass(String isllunnamedpass) {
		this.isllunnamedpass = isllunnamedpass;
	}

	public String getIsmaldivescovered() {
		return this.ismaldivescovered;
	}

	public void setIsmaldivescovered(String ismaldivescovered) {
		this.ismaldivescovered = ismaldivescovered;
	}

	public String getIsncbcertificatesubmit() {
		return this.isncbcertificatesubmit;
	}

	public void setIsncbcertificatesubmit(String isncbcertificatesubmit) {
		this.isncbcertificatesubmit = isncbcertificatesubmit;
	}

	public String getIsnepalcovered() {
		return this.isnepalcovered;
	}

	public void setIsnepalcovered(String isnepalcovered) {
		this.isnepalcovered = isnepalcovered;
	}

	public String getIsownpremises() {
		return this.isownpremises;
	}

	public void setIsownpremises(String isownpremises) {
		this.isownpremises = isownpremises;
	}

	public String getIspacleaner() {
		return this.ispacleaner;
	}

	public void setIspacleaner(String ispacleaner) {
		this.ispacleaner = ispacleaner;
	}

	public String getIspaconductor() {
		return this.ispaconductor;
	}

	public void setIspaconductor(String ispaconductor) {
		this.ispaconductor = ispaconductor;
	}

	public String getIspahelper() {
		return this.ispahelper;
	}

	public void setIspahelper(String ispahelper) {
		this.ispahelper = ispahelper;
	}

	public String getIspakistancovered() {
		return this.ispakistancovered;
	}

	public void setIspakistancovered(String ispakistancovered) {
		this.ispakistancovered = ispakistancovered;
	}

	public String getIspapaiddriver() {
		return this.ispapaiddriver;
	}

	public void setIspapaiddriver(String ispapaiddriver) {
		this.ispapaiddriver = ispapaiddriver;
	}

	public String getIsprevpolcopysubmit() {
		return this.isprevpolcopysubmit;
	}

	public void setIsprevpolcopysubmit(String isprevpolcopysubmit) {
		this.isprevpolcopysubmit = isprevpolcopysubmit;
	}

	public String getIsproposalmanualapproved() {
		return this.isproposalmanualapproved;
	}

	public void setIsproposalmanualapproved(String isproposalmanualapproved) {
		this.isproposalmanualapproved = isproposalmanualapproved;
	}

	public String getIssrilankacovered() {
		return this.issrilankacovered;
	}

	public void setIssrilankacovered(String issrilankacovered) {
		this.issrilankacovered = issrilankacovered;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLeadby() {
		return this.leadby;
	}

	public void setLeadby(String leadby) {
		this.leadby = leadby;
	}

	public BigDecimal getLlcleanerpremium() {
		return this.llcleanerpremium;
	}

	public void setLlcleanerpremium(BigDecimal llcleanerpremium) {
		this.llcleanerpremium = llcleanerpremium;
	}

	public BigDecimal getLlconductorpremium() {
		return this.llconductorpremium;
	}

	public void setLlconductorpremium(BigDecimal llconductorpremium) {
		this.llconductorpremium = llconductorpremium;
	}

	public BigDecimal getLlhelperpremium() {
		return this.llhelperpremium;
	}

	public void setLlhelperpremium(BigDecimal llhelperpremium) {
		this.llhelperpremium = llhelperpremium;
	}

	public String getLlnfppcount() {
		return this.llnfppcount;
	}

	public void setLlnfppcount(String llnfppcount) {
		this.llnfppcount = llnfppcount;
	}

	public BigDecimal getLlnfpppremium() {
		return this.llnfpppremium;
	}

	public void setLlnfpppremium(BigDecimal llnfpppremium) {
		this.llnfpppremium = llnfpppremium;
	}

	public String getLlotherempcount() {
		return this.llotherempcount;
	}

	public void setLlotherempcount(String llotherempcount) {
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

	public String getLlunnamedpasscount() {
		return this.llunnamedpasscount;
	}

	public void setLlunnamedpasscount(String llunnamedpasscount) {
		this.llunnamedpasscount = llunnamedpasscount;
	}

	public BigDecimal getLlunnamedpasspremium() {
		return this.llunnamedpasspremium;
	}

	public void setLlunnamedpasspremium(BigDecimal llunnamedpasspremium) {
		this.llunnamedpasspremium = llunnamedpasspremium;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
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

	public Date getMovedDate() {
		return this.movedDate;
	}

	public void setMovedDate(Date movedDate) {
		this.movedDate = movedDate;
	}

	public BigDecimal getNcbamount() {
		return this.ncbamount;
	}

	public void setNcbamount(BigDecimal ncbamount) {
		this.ncbamount = ncbamount;
	}

	public String getNcbflag() {
		return this.ncbflag;
	}

	public void setNcbflag(String ncbflag) {
		this.ncbflag = ncbflag;
	}

	public String getNcbper() {
		return this.ncbper;
	}

	public void setNcbper(String ncbper) {
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

	public String getNonelectricaccidv() {
		return this.nonelectricaccidv;
	}

	public void setNonelectricaccidv(String nonelectricaccidv) {
		this.nonelectricaccidv = nonelectricaccidv;
	}

	public BigDecimal getNonelectricaccpremium() {
		return this.nonelectricaccpremium;
	}

	public void setNonelectricaccpremium(BigDecimal nonelectricaccpremium) {
		this.nonelectricaccpremium = nonelectricaccpremium;
	}

	public String getNoofcleanerll() {
		return this.noofcleanerll;
	}

	public void setNoofcleanerll(String noofcleanerll) {
		this.noofcleanerll = noofcleanerll;
	}

	public String getNoofcleanerpa() {
		return this.noofcleanerpa;
	}

	public void setNoofcleanerpa(String noofcleanerpa) {
		this.noofcleanerpa = noofcleanerpa;
	}

	public String getNoofconductorll() {
		return this.noofconductorll;
	}

	public void setNoofconductorll(String noofconductorll) {
		this.noofconductorll = noofconductorll;
	}

	public String getNoofconductorpa() {
		return this.noofconductorpa;
	}

	public void setNoofconductorpa(String noofconductorpa) {
		this.noofconductorpa = noofconductorpa;
	}

	public String getNoofhelperll() {
		return this.noofhelperll;
	}

	public void setNoofhelperll(String noofhelperll) {
		this.noofhelperll = noofhelperll;
	}

	public String getNoofhelperpa() {
		return this.noofhelperpa;
	}

	public void setNoofhelperpa(String noofhelperpa) {
		this.noofhelperpa = noofhelperpa;
	}

	public String getNoofpaiddriverll() {
		return this.noofpaiddriverll;
	}

	public void setNoofpaiddriverll(String noofpaiddriverll) {
		this.noofpaiddriverll = noofpaiddriverll;
	}

	public String getNoofpaiddriverpa() {
		return this.noofpaiddriverpa;
	}

	public void setNoofpaiddriverpa(String noofpaiddriverpa) {
		this.noofpaiddriverpa = noofpaiddriverpa;
	}

	public BigDecimal getNooftrailers() {
		return this.nooftrailers;
	}

	public void setNooftrailers(BigDecimal nooftrailers) {
		this.nooftrailers = nooftrailers;
	}

	public String getOddiscper() {
		return this.oddiscper;
	}

	public void setOddiscper(String oddiscper) {
		this.oddiscper = oddiscper;
	}

	public String getOverturncover() {
		return this.overturncover;
	}

	public void setOverturncover(String overturncover) {
		this.overturncover = overturncover;
	}

	public String getPacoverpillionrider() {
		return this.pacoverpillionrider;
	}

	public void setPacoverpillionrider(String pacoverpillionrider) {
		this.pacoverpillionrider = pacoverpillionrider;
	}

	public String getPacoverpremcleaner() {
		return this.pacoverpremcleaner;
	}

	public void setPacoverpremcleaner(String pacoverpremcleaner) {
		this.pacoverpremcleaner = pacoverpremcleaner;
	}

	public String getPacoverpremconductor() {
		return this.pacoverpremconductor;
	}

	public void setPacoverpremconductor(String pacoverpremconductor) {
		this.pacoverpremconductor = pacoverpremconductor;
	}

	public String getPacoverpremhelper() {
		return this.pacoverpremhelper;
	}

	public void setPacoverpremhelper(String pacoverpremhelper) {
		this.pacoverpremhelper = pacoverpremhelper;
	}

	public String getPacoverpremownerdriver() {
		return this.pacoverpremownerdriver;
	}

	public void setPacoverpremownerdriver(String pacoverpremownerdriver) {
		this.pacoverpremownerdriver = pacoverpremownerdriver;
	}

	public String getPacoverprempaiddriver() {
		return this.pacoverprempaiddriver;
	}

	public void setPacoverprempaiddriver(String pacoverprempaiddriver) {
		this.pacoverprempaiddriver = pacoverprempaiddriver;
	}

	public String getPacoverpremunnamedperson() {
		return this.pacoverpremunnamedperson;
	}

	public void setPacoverpremunnamedperson(String pacoverpremunnamedperson) {
		this.pacoverpremunnamedperson = pacoverpremunnamedperson;
	}

	public String getPacoverunnameddriver() {
		return this.pacoverunnameddriver;
	}

	public void setPacoverunnameddriver(String pacoverunnameddriver) {
		this.pacoverunnameddriver = pacoverunnameddriver;
	}

	public String getPannumber() {
		return this.pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getPanoofperson() {
		return this.panoofperson;
	}

	public void setPanoofperson(String panoofperson) {
		this.panoofperson = panoofperson;
	}

	public String getPaowndriverappointeename() {
		return this.paowndriverappointeename;
	}

	public void setPaowndriverappointeename(String paowndriverappointeename) {
		this.paowndriverappointeename = paowndriverappointeename;
	}

	public String getPaowndriverappointeerelation() {
		return this.paowndriverappointeerelation;
	}

	public void setPaowndriverappointeerelation(String paowndriverappointeerelation) {
		this.paowndriverappointeerelation = paowndriverappointeerelation;
	}

	public BigDecimal getPaowndrivernomage() {
		return this.paowndrivernomage;
	}

	public void setPaowndrivernomage(BigDecimal paowndrivernomage) {
		this.paowndrivernomage = paowndrivernomage;
	}

	public String getPaowndrivernomgender() {
		return this.paowndrivernomgender;
	}

	public void setPaowndrivernomgender(String paowndrivernomgender) {
		this.paowndrivernomgender = paowndrivernomgender;
	}

	public String getPaowndrivernomname() {
		return this.paowndrivernomname;
	}

	public void setPaowndrivernomname(String paowndrivernomname) {
		this.paowndrivernomname = paowndrivernomname;
	}

	public String getPaowndrivernomreleation() {
		return this.paowndrivernomreleation;
	}

	public void setPaowndrivernomreleation(String paowndrivernomreleation) {
		this.paowndrivernomreleation = paowndrivernomreleation;
	}

	public String getPasuminsuredperemployee() {
		return this.pasuminsuredperemployee;
	}

	public void setPasuminsuredperemployee(String pasuminsuredperemployee) {
		this.pasuminsuredperemployee = pasuminsuredperemployee;
	}

	public String getPasuminsuredperunnamedperson() {
		return this.pasuminsuredperunnamedperson;
	}

	public void setPasuminsuredperunnamedperson(String pasuminsuredperunnamedperson) {
		this.pasuminsuredperunnamedperson = pasuminsuredperunnamedperson;
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

	public String getPaymentReconcileId() {
		return this.paymentReconcileId;
	}

	public void setPaymentReconcileId(String paymentReconcileId) {
		this.paymentReconcileId = paymentReconcileId;
	}

	public String getPaymentReconcileStatus() {
		return this.paymentReconcileStatus;
	}

	public void setPaymentReconcileStatus(String paymentReconcileStatus) {
		this.paymentReconcileStatus = paymentReconcileStatus;
	}

	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public BigDecimal getPincode() {
		return this.pincode;
	}

	public void setPincode(BigDecimal pincode) {
		this.pincode = pincode;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyissuingdealercodetemp() {
		return this.policyissuingdealercodetemp;
	}

	public void setPolicyissuingdealercodetemp(String policyissuingdealercodetemp) {
		this.policyissuingdealercodetemp = policyissuingdealercodetemp;
	}

	public String getPremiumcalculatedby() {
		return this.premiumcalculatedby;
	}

	public void setPremiumcalculatedby(String premiumcalculatedby) {
		this.premiumcalculatedby = premiumcalculatedby;
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

	public Date getProposalcreateddate() {
		return this.proposalcreateddate;
	}

	public void setProposalcreateddate(Date proposalcreateddate) {
		this.proposalcreateddate = proposalcreateddate;
	}

	public String getProposalcreatedtime() {
		return this.proposalcreatedtime;
	}

	public void setProposalcreatedtime(String proposalcreatedtime) {
		this.proposalcreatedtime = proposalcreatedtime;
	}

	public String getProposerpan() {
		return this.proposerpan;
	}

	public void setProposerpan(String proposerpan) {
		this.proposerpan = proposerpan;
	}

	public String getProposerpaymentmode() {
		return this.proposerpaymentmode;
	}

	public void setProposerpaymentmode(String proposerpaymentmode) {
		this.proposerpaymentmode = proposerpaymentmode;
	}

	public String getProposertype() {
		return this.proposertype;
	}

	public void setProposertype(String proposertype) {
		this.proposertype = proposertype;
	}

	public String getReconciledchequeamount() {
		return this.reconciledchequeamount;
	}

	public void setReconciledchequeamount(String reconciledchequeamount) {
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

	public String getReconciledchequedate() {
		return this.reconciledchequedate;
	}

	public void setReconciledchequedate(String reconciledchequedate) {
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

	public Date getRegistrationdate() {
		return this.registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
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

	public String getTariffpaxrange() {
		return this.tariffpaxrange;
	}

	public void setTariffpaxrange(String tariffpaxrange) {
		this.tariffpaxrange = tariffpaxrange;
	}

	public BigDecimal getTotalidv() {
		return this.totalidv;
	}

	public void setTotalidv(BigDecimal totalidv) {
		this.totalidv = totalidv;
	}

	public String getTotallegalliability() {
		return this.totallegalliability;
	}

	public void setTotallegalliability(String totallegalliability) {
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

	public BigDecimal getTrailerchassisno() {
		return this.trailerchassisno;
	}

	public void setTrailerchassisno(BigDecimal trailerchassisno) {
		this.trailerchassisno = trailerchassisno;
	}

	public BigDecimal getTraileridv() {
		return this.traileridv;
	}

	public void setTraileridv(BigDecimal traileridv) {
		this.traileridv = traileridv;
	}

	public BigDecimal getTrailerpremium() {
		return this.trailerpremium;
	}

	public void setTrailerpremium(BigDecimal trailerpremium) {
		this.trailerpremium = trailerpremium;
	}

	public BigDecimal getTrailerregistrationno() {
		return this.trailerregistrationno;
	}

	public void setTrailerregistrationno(BigDecimal trailerregistrationno) {
		this.trailerregistrationno = trailerregistrationno;
	}

	public String getTrailertp() {
		return this.trailertp;
	}

	public void setTrailertp(String trailertp) {
		this.trailertp = trailertp;
	}

	public String getUniquereferenceno() {
		return this.uniquereferenceno;
	}

	public void setUniquereferenceno(String uniquereferenceno) {
		this.uniquereferenceno = uniquereferenceno;
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

	public String getVehiclesubclass() {
		return this.vehiclesubclass;
	}

	public void setVehiclesubclass(String vehiclesubclass) {
		this.vehiclesubclass = vehiclesubclass;
	}

	public String getVehicletype() {
		return this.vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public String getVoluntarydeductible() {
		return this.voluntarydeductible;
	}

	public void setVoluntarydeductible(String voluntarydeductible) {
		this.voluntarydeductible = voluntarydeductible;
	}

	public String getVoluntarydisc() {
		return this.voluntarydisc;
	}

	public void setVoluntarydisc(String voluntarydisc) {
		this.voluntarydisc = voluntarydisc;
	}

	public String getXgenDownloadId() {
		return this.xgenDownloadId;
	}

	public void setXgenDownloadId(String xgenDownloadId) {
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

	public Date getXgenMovedDate() {
		return this.xgenMovedDate;
	}

	public void setXgenMovedDate(Date xgenMovedDate) {
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

	public String getXgenProductId() {
		return this.xgenProductId;
	}

	public void setXgenProductId(String xgenProductId) {
		this.xgenProductId = xgenProductId;
	}

	public Date getXgenReceiptDate() {
		return this.xgenReceiptDate;
	}

	public void setXgenReceiptDate(Date xgenReceiptDate) {
		this.xgenReceiptDate = xgenReceiptDate;
	}

	public String getXgenReceiptNumber() {
		return this.xgenReceiptNumber;
	}

	public void setXgenReceiptNumber(String xgenReceiptNumber) {
		this.xgenReceiptNumber = xgenReceiptNumber;
	}

	public BigDecimal getYearofmanufacture() {
		return this.yearofmanufacture;
	}

	public void setYearofmanufacture(BigDecimal yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}

}*/