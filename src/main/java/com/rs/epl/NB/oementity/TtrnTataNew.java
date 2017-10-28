/*package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


*//**
 * The persistent class for the TTRN_TATA_NEW database table.
 * 
 *//*
@Entity
@Table(name="TTRN_TATA_NEW")
public class TtrnTataNew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=50)
	private String aadhaarcardnumber;

	@Column(precision=22)
	private BigDecimal aadiscamount;

	@Column(length=100)
	private String aaexpiryperiod;

	@Column(length=500)
	private String aamemno;

	@Column(length=200)
	private String active;

	@Column(precision=22)
	private BigDecimal addonaddon13amt;

	@Column(precision=22)
	private BigDecimal addonaddon14amt;

	@Column(precision=22)
	private BigDecimal addonaddtowingamt;

	@Column(precision=22)
	private BigDecimal addonconsumablesamt;

	@Column(precision=22)
	private BigDecimal addoncourtesycaramt;

	@Column(precision=22)
	private BigDecimal addondailycashamt;

	@Column(precision=22)
	private BigDecimal addonemergencyexpensesamt;

	@Column(precision=22)
	private BigDecimal addonemicoveramt;

	@Column(precision=22)
	private BigDecimal addonemicovermonth;

	@Column(precision=22)
	private BigDecimal addonengineprotamt;

	@Column(precision=22)
	private BigDecimal addoninconallowanceamt;

	@Column(precision=22)
	private BigDecimal addonisaddon13;

	@Column(precision=22)
	private BigDecimal addonisaddon14;

	@Column(precision=22)
	private BigDecimal addonisaddtowing;

	@Column(precision=22)
	private BigDecimal addonisconsumable;

	@Column(precision=22)
	private BigDecimal addoniscourtesycar;

	@Column(precision=22)
	private BigDecimal addonisdailycash;

	@Column(precision=22)
	private BigDecimal addonisemergencyexpenses;

	@Column(precision=22)
	private BigDecimal addonisemicover;

	@Column(precision=22)
	private BigDecimal addonisengineprot;

	@Column(precision=22)
	private BigDecimal addonisinconallowance;

	@Column(precision=22)
	private BigDecimal addoniskeyreplacement;

	@Column(precision=22)
	private BigDecimal addonislossofincome;

	@Column(precision=22)
	private BigDecimal addonisncbprot;

	@Column(precision=22)
	private BigDecimal addonisnildep;

	@Column(precision=22)
	private BigDecimal addonispersonalbelonging;

	@Column(precision=22)
	private BigDecimal addonisrsa;

	@Column(precision=22)
	private BigDecimal addonisrti;

	@Column(precision=22)
	private BigDecimal addonkeyreplacementamt;

	@Column(precision=22)
	private BigDecimal addonlossofincomeamt;

	@Column(precision=22)
	private BigDecimal addonncbprotamt;

	@Column(precision=22)
	private BigDecimal addonnildepamt;

	@Column(precision=22)
	private BigDecimal addonpersonalbelongingamt;

	@Column(precision=22)
	private BigDecimal addonrsaamt;

	@Column(precision=22)
	private BigDecimal addonrtiamt;

	@Column(precision=22)
	private BigDecimal addonrticoveramount;

	@Column(length=500)
	private String address1;

	@Column(length=500)
	private String address2;

	@Column(length=500)
	private String address3;

	@Column(length=100)
	private String aggrementtype;

	@Column(precision=22)
	private BigDecimal antitheftdiscamount;

	@Column(length=200)
	private String bankname;

	@Column(precision=22)
	private BigDecimal basicodp;

	@Column(precision=22)
	private BigDecimal basictpl;

	@Column(precision=22)
	private BigDecimal batchid;

	@Column(precision=22)
	private BigDecimal bifuelkitidv;

	@Column(precision=22)
	private BigDecimal bifuelkitpremium;

	@Column(precision=22)
	private BigDecimal bifuelkitvalue;

	@Column(precision=22)
	private BigDecimal bifueltppremium;

	@Column(length=100)
	private String bodyidv;

	@Column(length=200)
	private String branchcode;

	@Column(length=30)
	private String breakinreferenceno;

	@Column(length=200)
	private String carriertype;

	@Column(precision=22)
	private BigDecimal carryingcapacity;

	@Column(precision=22)
	private BigDecimal cc;

	@Column(name="CESS_AMT_1", precision=22)
	private BigDecimal cessAmt1;

	@Column(name="CESS_AMT_2", precision=22)
	private BigDecimal cessAmt2;

	@Column(name="CESS_AMT_3", precision=22)
	private BigDecimal cessAmt3;

	@Column(name="CESS_AMT_4", precision=22)
	private String cessAmt4;

	@Column(name="CESS_AMT_5", precision=22)
	private BigDecimal cessAmt5;

	@Column(length=500)
	private String chassisno;

	@Column(length=200)
	private String chequeamount;

	@Column(length=200)
	private String chequeno;

	@Column(length=100)
	private String citycode;

	@Column(length=200)
	private String citycodetemp;

	@Column(length=200)
	private String clientcode;

	@Column(length=500)
	private String companyname;

	@Column(precision=22)
	private BigDecimal compdeductibles;

	@Column(length=500)
	private String cvmisctype;

	@Temporal(TemporalType.DATE)
	private Date dateofbirth;

	@Column(length=200)
	private String dealerid;

	@Column(precision=22)
	private BigDecimal electricaccidv;

	@Column(precision=22)
	private BigDecimal electricaccpremium;

	@Column(length=500)
	private String email;

	@Column(name="EMPLOYEE_CODE", length=200)
	private String employeeCode;

	@Column(length=200)
	private String endorsementno;

	@Column(length=500)
	private String engineno;

	@Column(precision=22)
	private BigDecimal exshowroomprice;

	@Column(precision=22)
	private BigDecimal exttppd;

	@Temporal(TemporalType.DATE)
	private Date filegenerateddate;

	@Column(length=100)
	private String financerbranch;

	@Column(length=100)
	private String financercode;

	@Column(length=500)
	private String firstissingdealercode;

	@Column(length=500)
	private String firstname;

	@Column(length=1)
	private String gender;

	@Column(precision=22)
	private BigDecimal geographicextnpremium;

	@Column(precision=22)
	private BigDecimal geographicextntppremium;

	@Column(precision=22)
	private BigDecimal grosspremium;

	@Column(precision=22)
	private BigDecimal gvw;

	@Column(precision=22)
	private BigDecimal handicapdispremium;

	@Column(precision=22)
	private BigDecimal imt23premium;

	@Column(precision=22)
	private BigDecimal imt33premium;

	@Column(precision=22)
	private BigDecimal imt34premium;

	@Column(precision=22)
	private BigDecimal imt34tp;

	@Column(length=500)
	private String imtcode;

	@Column(length=1)
	private String inscovertype;

	@Temporal(TemporalType.DATE)
	private Date inspolicyeffectivedate;

	@Column(length=50)
	private String inspolicyeffectivetime;

	@Temporal(TemporalType.DATE)
	private Date inspolicyexpirydate;

	@Column(length=500)
	private String inspolicyissuingdealercode;

	@Column(length=100)
	private String inspolicyno;

	@Column(length=1)
	private String inspolicytype;

	@Column(length=100)
	private String insproposalno;

	@Column(name="IS_HANDICAP_POLICY", length=10)
	private String isHandicapPolicy;

	@Column(precision=22)
	private BigDecimal isaamembership;

	@Column(precision=22)
	private BigDecimal isantitheftattached;

	@Column(precision=22)
	private BigDecimal isbangladeshcovered;

	@Column(precision=22)
	private BigDecimal isbhutancovered;

	@Column(precision=22)
	private BigDecimal iscsd;

	@Column(precision=22)
	private BigDecimal iscustomerundertakingsubmit;

	@Column(precision=22)
	private BigDecimal ishandicapvehicle;

	@Column(precision=22)
	private BigDecimal isllcleaner;

	@Column(precision=22)
	private BigDecimal isllconductor;

	@Column(precision=22)
	private BigDecimal isllhelper;

	@Column(precision=22)
	private BigDecimal isllnfpp;

	@Column(precision=22)
	private BigDecimal isllotheremp;

	@Column(precision=22)
	private BigDecimal isllpaiddriver;

	@Column(precision=22)
	private BigDecimal isllunnamedpass;

	@Column(precision=22)
	private BigDecimal ismaldivescovered;

	@Column(precision=22)
	private BigDecimal isncbcertificatesubmit;

	@Column(precision=22)
	private BigDecimal isnepalcovered;

	@Column(precision=22)
	private BigDecimal isownpremises;

	@Column(precision=22)
	private BigDecimal ispacleaner;

	@Column(precision=22)
	private BigDecimal ispaconductor;

	@Column(precision=22)
	private BigDecimal ispahelper;

	@Column(precision=22)
	private BigDecimal ispakistancovered;

	@Column(precision=22)
	private BigDecimal ispapaiddriver;

	@Column(precision=22)
	private BigDecimal isphysicallysolicitated;

	@Column(precision=22)
	private BigDecimal isprevpolcopysubmit;

	@Column(precision=22)
	private BigDecimal isproposalmanualapproved;

	@Column(precision=22)
	private BigDecimal issrilankacovered;

	@Column(length=500)
	private String lastname;

	@Column(length=1)
	private String leadby;

	@Column(precision=22)
	private BigDecimal llcleanerpremium;

	@Column(precision=22)
	private BigDecimal llconductorpremium;

	@Column(precision=22)
	private BigDecimal llhelperpremium;

	@Column(precision=22)
	private BigDecimal llnfppcount;

	@Column(precision=22)
	private BigDecimal llnfpppremium;

	@Column(precision=22)
	private BigDecimal llotherempcount;

	@Column(precision=22)
	private BigDecimal llotheremppremium;

	@Column(precision=22)
	private BigDecimal llpaiddrivpremium;

	@Column(precision=22)
	private BigDecimal llunnamedpasscount;

	@Column(precision=22)
	private BigDecimal llunnamedpasspremium;

	@Column(length=100)
	private String make;

	@Column(length=500)
	private String middlename;

	@Column(length=100)
	private String modelcode;

	@Column(length=5)
	private String movedstatus;

	@Column(precision=22)
	private BigDecimal ncbamount;

	@Column(precision=22)
	private BigDecimal ncbflag;

	@Column(precision=22)
	private BigDecimal ncbper;

	@Column(precision=22)
	private BigDecimal netliabilitypremiumb;

	@Column(precision=22)
	private BigDecimal netodpremium;

	@Column(precision=22)
	private BigDecimal nonelectricaccidv;

	@Column(precision=22)
	private BigDecimal nonelectricaccpremium;

	@Column(precision=10)
	private BigDecimal noofcleanerll;

	@Column(precision=22)
	private BigDecimal noofcleanerpa;

	@Column(precision=10)
	private BigDecimal noofconductorll;

	@Column(precision=22)
	private BigDecimal noofconductorpa;

	@Column(precision=10)
	private BigDecimal noofhelperll;

	@Column(precision=22)
	private BigDecimal noofhelperpa;

	@Column(precision=10)
	private BigDecimal noofpaiddriverll;

	@Column(precision=22)
	private BigDecimal noofpaiddriverpa;

	@Column(precision=22)
	private BigDecimal nooftrailers;

	@Column(length=50)
	private String occupation;

	@Column(precision=22)
	private BigDecimal oddiscper;

	@Column(precision=22)
	private BigDecimal overturncover;

	@Column(precision=22)
	private BigDecimal pacoverpillionrider;

	@Column(precision=22)
	private BigDecimal pacoverpremcleaner;

	@Column(precision=22)
	private BigDecimal pacoverpremconductor;

	@Column(precision=22)
	private BigDecimal pacoverpremhelper;

	@Column(precision=22)
	private BigDecimal pacoverpremownerdriver;

	@Column(precision=22)
	private BigDecimal pacoverprempaiddriver;

	@Column(precision=22)
	private BigDecimal pacoverpremunnamedperson;

	@Column(precision=22)
	private BigDecimal pacoverunnameddriver;

	@Column(precision=22)
	private BigDecimal panoofperson;

	@Column(length=500)
	private String paowndriverappointeename;

	@Column(length=500)
	private String paowndriverappointeerelation;

	@Column(precision=22)
	private BigDecimal paowndrivernomage;

	@Column(length=100)
	private String paowndrivernomgender;

	@Column(length=500)
	private String paowndrivernomname;

	@Column(length=500)
	private String paowndrivernomreleation;

	@Column(precision=22)
	private BigDecimal pasuminsuredperemployee;

	@Column(precision=22)
	private BigDecimal pasuminsuredperperson;

	@Column(precision=22)
	private BigDecimal pasuminsuredperunnamedperson;

	@Column(precision=22)
	private BigDecimal patotalpremium;

	@Column(length=100)
	private String payinslipdate;

	@Column(length=100)
	private String payinslipno;

	@Column(name="PAYMENT_RECONCILE_ID", length=200)
	private String paymentReconcileId;

	@Column(name="PAYMENT_RECONCILE_STATUS", length=200)
	private String paymentReconcileStatus;

	@Column(name="PAYMENT_YN", length=1)
	private String paymentYn;

	@Column(precision=22)
	private BigDecimal paymentid;

	@Column(length=10)
	private String pincode;

	@Column(name="POLICY_STATUS", length=200)
	private String policyStatus;

	@Column(precision=22)
	private BigDecimal policychannelpartnertype;

	@Column(length=200)
	private String policyissuingdealercodetemp;

	@Id
	@Column(length=100)
	private String policyno;

	@Column(length=100)
	private String premiumcalculatedby;

	@Column(length=500)
	private String previnsurcompanyadd;

	@Column(length=500)
	private String previnsurcompanycode;

	@Column(length=500)
	private String previnsurcompanyname;

	@Temporal(TemporalType.DATE)
	private Date prevpolicyeffectivedate;

	@Column(length=50)
	private String prevpolicyexpirydate;

	@Column(length=500)
	private String prevpolicyno;

	@Column(name="PROPOSAL_NO", precision=22)
	private BigDecimal proposalNo;

	@Temporal(TemporalType.DATE)
	private Date proposalcreateddate;

	@Temporal(TemporalType.DATE)
	private Date proposalcreatedtime;

	@Column(length=500)
	private String proposerpan;

	@Column(length=100)
	private String proposerpaymentmode;

	@Column(length=100)
	private String proposertype;

	@Column(length=100)
	private String pspname;

	@Column(length=20)
	private String psppannumber;

	@Column(precision=22)
	private BigDecimal reconciledchequeamount;

	@Column(length=100)
	private String reconciledchequebank;

	@Column(length=200)
	private String reconciledchequebanktemp;

	@Column(length=100)
	private String reconciledchequebranch;

	@Column(length=100)
	private String reconciledchequedate;

	@Column(length=100)
	private String reconciledchequeissuedby;

	@Column(length=100)
	private String reconciledchequeno;

	@Temporal(TemporalType.DATE)
	private Date registrationdate;

	@Column(length=500)
	private String registrationno;

	@Column(name="REQ_COUNT", length=100)
	private String reqCount;

	@Column(name="REQUEST_DATE", length=500)
	private String requestDate;

	@Column(name="REQUEST_TIME", length=500)
	private String requestTime;

	@Column(name="RES_TIME", length=100)
	private String resTime;

	@Column(length=100)
	private String rtocode;

	@Column(length=200)
	private String rtocodetemp;

	@Column(length=100)
	private String salutation;

	@Column(precision=22)
	private BigDecimal seatingcapacity;

	@Column(precision=22)
	private BigDecimal servicetax;

	@Column(name="SETTLEMENT_TYPE", length=200)
	private String settlementType;

	@Column(length=100)
	private String statecode;

	@Column(length=200)
	private String statecodetemp;

	@Column(length=100)
	private String status;

	@Column(name="SUB_BATCH", length=5)
	private String subBatch;

	@Column(length=500)
	private String tariffpaxrange;

	@Column(precision=22)
	private BigDecimal totalidv;

	@Column(precision=22)
	private BigDecimal totallegalliability;

	@Column(precision=22)
	private BigDecimal totalpremium;

	@Column(precision=22)
	private BigDecimal totaltp;

	@Column(length=500)
	private String trailerchassisno;

	@Column(length=100)
	private String traileridv;

	@Column(precision=20)
	private BigDecimal trailerpremium;

	@Column(length=500)
	private String trailerregistrationno;

	@Column(precision=20)
	private BigDecimal trailertp;

	@Column(length=500)
	private String transactionid;

	@Column(length=100)
	private String uniquereferenceno;

	@Column(name="VALIDATE_STATUS", length=400)
	private String validateStatus;

	@Column(length=100)
	private String variantcode;

	@Column(length=200)
	private String variantcodetemp;

	@Column(precision=22)
	private BigDecimal vehcileinspectionagencycode;

	@Temporal(TemporalType.DATE)
	private Date vehcileinspectiondate;

	@Column(length=100)
	private String vehicleclass;

	@Column(length=100)
	private String vehicleidv;

	@Temporal(TemporalType.DATE)
	private Date vehicleinvoicedate;

	@Column(precision=22)
	private BigDecimal vehiclepremium;

	@Column(length=500)
	private String vehiclesubclass;

	@Column(length=100)
	private String vehicletype;

	@Column(length=500)
	private String visofnumber;

	@Column(precision=22)
	private BigDecimal voluntarydeductible;

	@Column(precision=22)
	private BigDecimal voluntarydisc;

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

	@Column(name="XGEN_RECEIPT_NUMBER", length=200)
	private String xgenReceiptNumber;

	@Column(length=100)
	private String yearofmanufacture;

	public TtrnTataNew() {
	}

	public String getAadhaarcardnumber() {
		return this.aadhaarcardnumber;
	}

	public void setAadhaarcardnumber(String aadhaarcardnumber) {
		this.aadhaarcardnumber = aadhaarcardnumber;
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

	public BigDecimal getAddonaddon13amt() {
		return this.addonaddon13amt;
	}

	public void setAddonaddon13amt(BigDecimal addonaddon13amt) {
		this.addonaddon13amt = addonaddon13amt;
	}

	public BigDecimal getAddonaddon14amt() {
		return this.addonaddon14amt;
	}

	public void setAddonaddon14amt(BigDecimal addonaddon14amt) {
		this.addonaddon14amt = addonaddon14amt;
	}

	public BigDecimal getAddonaddtowingamt() {
		return this.addonaddtowingamt;
	}

	public void setAddonaddtowingamt(BigDecimal addonaddtowingamt) {
		this.addonaddtowingamt = addonaddtowingamt;
	}

	public BigDecimal getAddonconsumablesamt() {
		return this.addonconsumablesamt;
	}

	public void setAddonconsumablesamt(BigDecimal addonconsumablesamt) {
		this.addonconsumablesamt = addonconsumablesamt;
	}

	public BigDecimal getAddoncourtesycaramt() {
		return this.addoncourtesycaramt;
	}

	public void setAddoncourtesycaramt(BigDecimal addoncourtesycaramt) {
		this.addoncourtesycaramt = addoncourtesycaramt;
	}

	public BigDecimal getAddondailycashamt() {
		return this.addondailycashamt;
	}

	public void setAddondailycashamt(BigDecimal addondailycashamt) {
		this.addondailycashamt = addondailycashamt;
	}

	public BigDecimal getAddonemergencyexpensesamt() {
		return this.addonemergencyexpensesamt;
	}

	public void setAddonemergencyexpensesamt(BigDecimal addonemergencyexpensesamt) {
		this.addonemergencyexpensesamt = addonemergencyexpensesamt;
	}

	public BigDecimal getAddonemicoveramt() {
		return this.addonemicoveramt;
	}

	public void setAddonemicoveramt(BigDecimal addonemicoveramt) {
		this.addonemicoveramt = addonemicoveramt;
	}

	public BigDecimal getAddonemicovermonth() {
		return this.addonemicovermonth;
	}

	public void setAddonemicovermonth(BigDecimal addonemicovermonth) {
		this.addonemicovermonth = addonemicovermonth;
	}

	public BigDecimal getAddonengineprotamt() {
		return this.addonengineprotamt;
	}

	public void setAddonengineprotamt(BigDecimal addonengineprotamt) {
		this.addonengineprotamt = addonengineprotamt;
	}

	public BigDecimal getAddoninconallowanceamt() {
		return this.addoninconallowanceamt;
	}

	public void setAddoninconallowanceamt(BigDecimal addoninconallowanceamt) {
		this.addoninconallowanceamt = addoninconallowanceamt;
	}

	public BigDecimal getAddonisaddon13() {
		return this.addonisaddon13;
	}

	public void setAddonisaddon13(BigDecimal addonisaddon13) {
		this.addonisaddon13 = addonisaddon13;
	}

	public BigDecimal getAddonisaddon14() {
		return this.addonisaddon14;
	}

	public void setAddonisaddon14(BigDecimal addonisaddon14) {
		this.addonisaddon14 = addonisaddon14;
	}

	public BigDecimal getAddonisaddtowing() {
		return this.addonisaddtowing;
	}

	public void setAddonisaddtowing(BigDecimal addonisaddtowing) {
		this.addonisaddtowing = addonisaddtowing;
	}

	public BigDecimal getAddonisconsumable() {
		return this.addonisconsumable;
	}

	public void setAddonisconsumable(BigDecimal addonisconsumable) {
		this.addonisconsumable = addonisconsumable;
	}

	public BigDecimal getAddoniscourtesycar() {
		return this.addoniscourtesycar;
	}

	public void setAddoniscourtesycar(BigDecimal addoniscourtesycar) {
		this.addoniscourtesycar = addoniscourtesycar;
	}

	public BigDecimal getAddonisdailycash() {
		return this.addonisdailycash;
	}

	public void setAddonisdailycash(BigDecimal addonisdailycash) {
		this.addonisdailycash = addonisdailycash;
	}

	public BigDecimal getAddonisemergencyexpenses() {
		return this.addonisemergencyexpenses;
	}

	public void setAddonisemergencyexpenses(BigDecimal addonisemergencyexpenses) {
		this.addonisemergencyexpenses = addonisemergencyexpenses;
	}

	public BigDecimal getAddonisemicover() {
		return this.addonisemicover;
	}

	public void setAddonisemicover(BigDecimal addonisemicover) {
		this.addonisemicover = addonisemicover;
	}

	public BigDecimal getAddonisengineprot() {
		return this.addonisengineprot;
	}

	public void setAddonisengineprot(BigDecimal addonisengineprot) {
		this.addonisengineprot = addonisengineprot;
	}

	public BigDecimal getAddonisinconallowance() {
		return this.addonisinconallowance;
	}

	public void setAddonisinconallowance(BigDecimal addonisinconallowance) {
		this.addonisinconallowance = addonisinconallowance;
	}

	public BigDecimal getAddoniskeyreplacement() {
		return this.addoniskeyreplacement;
	}

	public void setAddoniskeyreplacement(BigDecimal addoniskeyreplacement) {
		this.addoniskeyreplacement = addoniskeyreplacement;
	}

	public BigDecimal getAddonislossofincome() {
		return this.addonislossofincome;
	}

	public void setAddonislossofincome(BigDecimal addonislossofincome) {
		this.addonislossofincome = addonislossofincome;
	}

	public BigDecimal getAddonisncbprot() {
		return this.addonisncbprot;
	}

	public void setAddonisncbprot(BigDecimal addonisncbprot) {
		this.addonisncbprot = addonisncbprot;
	}

	public BigDecimal getAddonisnildep() {
		return this.addonisnildep;
	}

	public void setAddonisnildep(BigDecimal addonisnildep) {
		this.addonisnildep = addonisnildep;
	}

	public BigDecimal getAddonispersonalbelonging() {
		return this.addonispersonalbelonging;
	}

	public void setAddonispersonalbelonging(BigDecimal addonispersonalbelonging) {
		this.addonispersonalbelonging = addonispersonalbelonging;
	}

	public BigDecimal getAddonisrsa() {
		return this.addonisrsa;
	}

	public void setAddonisrsa(BigDecimal addonisrsa) {
		this.addonisrsa = addonisrsa;
	}

	public BigDecimal getAddonisrti() {
		return this.addonisrti;
	}

	public void setAddonisrti(BigDecimal addonisrti) {
		this.addonisrti = addonisrti;
	}

	public BigDecimal getAddonkeyreplacementamt() {
		return this.addonkeyreplacementamt;
	}

	public void setAddonkeyreplacementamt(BigDecimal addonkeyreplacementamt) {
		this.addonkeyreplacementamt = addonkeyreplacementamt;
	}

	public BigDecimal getAddonlossofincomeamt() {
		return this.addonlossofincomeamt;
	}

	public void setAddonlossofincomeamt(BigDecimal addonlossofincomeamt) {
		this.addonlossofincomeamt = addonlossofincomeamt;
	}

	public BigDecimal getAddonncbprotamt() {
		return this.addonncbprotamt;
	}

	public void setAddonncbprotamt(BigDecimal addonncbprotamt) {
		this.addonncbprotamt = addonncbprotamt;
	}

	public BigDecimal getAddonnildepamt() {
		return this.addonnildepamt;
	}

	public void setAddonnildepamt(BigDecimal addonnildepamt) {
		this.addonnildepamt = addonnildepamt;
	}

	public BigDecimal getAddonpersonalbelongingamt() {
		return this.addonpersonalbelongingamt;
	}

	public void setAddonpersonalbelongingamt(BigDecimal addonpersonalbelongingamt) {
		this.addonpersonalbelongingamt = addonpersonalbelongingamt;
	}

	public BigDecimal getAddonrsaamt() {
		return this.addonrsaamt;
	}

	public void setAddonrsaamt(BigDecimal addonrsaamt) {
		this.addonrsaamt = addonrsaamt;
	}

	public BigDecimal getAddonrtiamt() {
		return this.addonrtiamt;
	}

	public void setAddonrtiamt(BigDecimal addonrtiamt) {
		this.addonrtiamt = addonrtiamt;
	}

	public BigDecimal getAddonrticoveramount() {
		return this.addonrticoveramount;
	}

	public void setAddonrticoveramount(BigDecimal addonrticoveramount) {
		this.addonrticoveramount = addonrticoveramount;
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

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
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

	public String getBodyidv() {
		return this.bodyidv;
	}

	public void setBodyidv(String bodyidv) {
		this.bodyidv = bodyidv;
	}

	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getBreakinreferenceno() {
		return this.breakinreferenceno;
	}

	public void setBreakinreferenceno(String breakinreferenceno) {
		this.breakinreferenceno = breakinreferenceno;
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

	public BigDecimal getCc() {
		return this.cc;
	}

	public void setCc(BigDecimal cc) {
		this.cc = cc;
	}

	public BigDecimal getCessAmt1() {
		return this.cessAmt1;
	}

	public void setCessAmt1(BigDecimal cessAmt1) {
		this.cessAmt1 = cessAmt1;
	}

	public BigDecimal getCessAmt2() {
		return this.cessAmt2;
	}

	public void setCessAmt2(BigDecimal cessAmt2) {
		this.cessAmt2 = cessAmt2;
	}

	public BigDecimal getCessAmt3() {
		return this.cessAmt3;
	}

	public void setCessAmt3(BigDecimal cessAmt3) {
		this.cessAmt3 = cessAmt3;
	}

	public String getCessAmt4() {
		return this.cessAmt4;
	}

	public void setCessAmt4(String cessAmt4) {
		this.cessAmt4 = cessAmt4;
	}

	public BigDecimal getCessAmt5() {
		return this.cessAmt5;
	}

	public void setCessAmt5(BigDecimal cessAmt5) {
		this.cessAmt5 = cessAmt5;
	}

	public String getChassisno() {
		return this.chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	public String getChequeamount() {
		return this.chequeamount;
	}

	public void setChequeamount(String chequeamount) {
		this.chequeamount = chequeamount;
	}

	public String getChequeno() {
		return this.chequeno;
	}

	public void setChequeno(String chequeno) {
		this.chequeno = chequeno;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCitycodetemp() {
		return this.citycodetemp;
	}

	public void setCitycodetemp(String citycodetemp) {
		this.citycodetemp = citycodetemp;
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

	public String getDealerid() {
		return this.dealerid;
	}

	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
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

	public String getEndorsementno() {
		return this.endorsementno;
	}

	public void setEndorsementno(String endorsementno) {
		this.endorsementno = endorsementno;
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

	public BigDecimal getGvw() {
		return this.gvw;
	}

	public void setGvw(BigDecimal gvw) {
		this.gvw = gvw;
	}

	public BigDecimal getHandicapdispremium() {
		return this.handicapdispremium;
	}

	public void setHandicapdispremium(BigDecimal handicapdispremium) {
		this.handicapdispremium = handicapdispremium;
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

	public BigDecimal getImt34tp() {
		return this.imt34tp;
	}

	public void setImt34tp(BigDecimal imt34tp) {
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

	public String getInspolicyno() {
		return this.inspolicyno;
	}

	public void setInspolicyno(String inspolicyno) {
		this.inspolicyno = inspolicyno;
	}

	public String getInspolicytype() {
		return this.inspolicytype;
	}

	public void setInspolicytype(String inspolicytype) {
		this.inspolicytype = inspolicytype;
	}

	public String getInsproposalno() {
		return this.insproposalno;
	}

	public void setInsproposalno(String insproposalno) {
		this.insproposalno = insproposalno;
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

	public BigDecimal getIshandicapvehicle() {
		return this.ishandicapvehicle;
	}

	public void setIshandicapvehicle(BigDecimal ishandicapvehicle) {
		this.ishandicapvehicle = ishandicapvehicle;
	}

	public BigDecimal getIsllcleaner() {
		return this.isllcleaner;
	}

	public void setIsllcleaner(BigDecimal isllcleaner) {
		this.isllcleaner = isllcleaner;
	}

	public BigDecimal getIsllconductor() {
		return this.isllconductor;
	}

	public void setIsllconductor(BigDecimal isllconductor) {
		this.isllconductor = isllconductor;
	}

	public BigDecimal getIsllhelper() {
		return this.isllhelper;
	}

	public void setIsllhelper(BigDecimal isllhelper) {
		this.isllhelper = isllhelper;
	}

	public BigDecimal getIsllnfpp() {
		return this.isllnfpp;
	}

	public void setIsllnfpp(BigDecimal isllnfpp) {
		this.isllnfpp = isllnfpp;
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

	public BigDecimal getIsownpremises() {
		return this.isownpremises;
	}

	public void setIsownpremises(BigDecimal isownpremises) {
		this.isownpremises = isownpremises;
	}

	public BigDecimal getIspacleaner() {
		return this.ispacleaner;
	}

	public void setIspacleaner(BigDecimal ispacleaner) {
		this.ispacleaner = ispacleaner;
	}

	public BigDecimal getIspaconductor() {
		return this.ispaconductor;
	}

	public void setIspaconductor(BigDecimal ispaconductor) {
		this.ispaconductor = ispaconductor;
	}

	public BigDecimal getIspahelper() {
		return this.ispahelper;
	}

	public void setIspahelper(BigDecimal ispahelper) {
		this.ispahelper = ispahelper;
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

	public BigDecimal getIsphysicallysolicitated() {
		return this.isphysicallysolicitated;
	}

	public void setIsphysicallysolicitated(BigDecimal isphysicallysolicitated) {
		this.isphysicallysolicitated = isphysicallysolicitated;
	}

	public BigDecimal getIsprevpolcopysubmit() {
		return this.isprevpolcopysubmit;
	}

	public void setIsprevpolcopysubmit(BigDecimal isprevpolcopysubmit) {
		this.isprevpolcopysubmit = isprevpolcopysubmit;
	}

	public BigDecimal getIsproposalmanualapproved() {
		return this.isproposalmanualapproved;
	}

	public void setIsproposalmanualapproved(BigDecimal isproposalmanualapproved) {
		this.isproposalmanualapproved = isproposalmanualapproved;
	}

	public BigDecimal getIssrilankacovered() {
		return this.issrilankacovered;
	}

	public void setIssrilankacovered(BigDecimal issrilankacovered) {
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

	public BigDecimal getLlnfppcount() {
		return this.llnfppcount;
	}

	public void setLlnfppcount(BigDecimal llnfppcount) {
		this.llnfppcount = llnfppcount;
	}

	public BigDecimal getLlnfpppremium() {
		return this.llnfpppremium;
	}

	public void setLlnfpppremium(BigDecimal llnfpppremium) {
		this.llnfpppremium = llnfpppremium;
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

	public String getMovedstatus() {
		return this.movedstatus;
	}

	public void setMovedstatus(String movedstatus) {
		this.movedstatus = movedstatus;
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

	public BigDecimal getNoofcleanerll() {
		return this.noofcleanerll;
	}

	public void setNoofcleanerll(BigDecimal noofcleanerll) {
		this.noofcleanerll = noofcleanerll;
	}

	public BigDecimal getNoofcleanerpa() {
		return this.noofcleanerpa;
	}

	public void setNoofcleanerpa(BigDecimal noofcleanerpa) {
		this.noofcleanerpa = noofcleanerpa;
	}

	public BigDecimal getNoofconductorll() {
		return this.noofconductorll;
	}

	public void setNoofconductorll(BigDecimal noofconductorll) {
		this.noofconductorll = noofconductorll;
	}

	public BigDecimal getNoofconductorpa() {
		return this.noofconductorpa;
	}

	public void setNoofconductorpa(BigDecimal noofconductorpa) {
		this.noofconductorpa = noofconductorpa;
	}

	public BigDecimal getNoofhelperll() {
		return this.noofhelperll;
	}

	public void setNoofhelperll(BigDecimal noofhelperll) {
		this.noofhelperll = noofhelperll;
	}

	public BigDecimal getNoofhelperpa() {
		return this.noofhelperpa;
	}

	public void setNoofhelperpa(BigDecimal noofhelperpa) {
		this.noofhelperpa = noofhelperpa;
	}

	public BigDecimal getNoofpaiddriverll() {
		return this.noofpaiddriverll;
	}

	public void setNoofpaiddriverll(BigDecimal noofpaiddriverll) {
		this.noofpaiddriverll = noofpaiddriverll;
	}

	public BigDecimal getNoofpaiddriverpa() {
		return this.noofpaiddriverpa;
	}

	public void setNoofpaiddriverpa(BigDecimal noofpaiddriverpa) {
		this.noofpaiddriverpa = noofpaiddriverpa;
	}

	public BigDecimal getNooftrailers() {
		return this.nooftrailers;
	}

	public void setNooftrailers(BigDecimal nooftrailers) {
		this.nooftrailers = nooftrailers;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public BigDecimal getOddiscper() {
		return this.oddiscper;
	}

	public void setOddiscper(BigDecimal oddiscper) {
		this.oddiscper = oddiscper;
	}

	public BigDecimal getOverturncover() {
		return this.overturncover;
	}

	public void setOverturncover(BigDecimal overturncover) {
		this.overturncover = overturncover;
	}

	public BigDecimal getPacoverpillionrider() {
		return this.pacoverpillionrider;
	}

	public void setPacoverpillionrider(BigDecimal pacoverpillionrider) {
		this.pacoverpillionrider = pacoverpillionrider;
	}

	public BigDecimal getPacoverpremcleaner() {
		return this.pacoverpremcleaner;
	}

	public void setPacoverpremcleaner(BigDecimal pacoverpremcleaner) {
		this.pacoverpremcleaner = pacoverpremcleaner;
	}

	public BigDecimal getPacoverpremconductor() {
		return this.pacoverpremconductor;
	}

	public void setPacoverpremconductor(BigDecimal pacoverpremconductor) {
		this.pacoverpremconductor = pacoverpremconductor;
	}

	public BigDecimal getPacoverpremhelper() {
		return this.pacoverpremhelper;
	}

	public void setPacoverpremhelper(BigDecimal pacoverpremhelper) {
		this.pacoverpremhelper = pacoverpremhelper;
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

	public BigDecimal getPacoverpremunnamedperson() {
		return this.pacoverpremunnamedperson;
	}

	public void setPacoverpremunnamedperson(BigDecimal pacoverpremunnamedperson) {
		this.pacoverpremunnamedperson = pacoverpremunnamedperson;
	}

	public BigDecimal getPacoverunnameddriver() {
		return this.pacoverunnameddriver;
	}

	public void setPacoverunnameddriver(BigDecimal pacoverunnameddriver) {
		this.pacoverunnameddriver = pacoverunnameddriver;
	}

	public BigDecimal getPanoofperson() {
		return this.panoofperson;
	}

	public void setPanoofperson(BigDecimal panoofperson) {
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

	public BigDecimal getPasuminsuredperemployee() {
		return this.pasuminsuredperemployee;
	}

	public void setPasuminsuredperemployee(BigDecimal pasuminsuredperemployee) {
		this.pasuminsuredperemployee = pasuminsuredperemployee;
	}

	public BigDecimal getPasuminsuredperperson() {
		return this.pasuminsuredperperson;
	}

	public void setPasuminsuredperperson(BigDecimal pasuminsuredperperson) {
		this.pasuminsuredperperson = pasuminsuredperperson;
	}

	public BigDecimal getPasuminsuredperunnamedperson() {
		return this.pasuminsuredperunnamedperson;
	}

	public void setPasuminsuredperunnamedperson(BigDecimal pasuminsuredperunnamedperson) {
		this.pasuminsuredperunnamedperson = pasuminsuredperunnamedperson;
	}

	public BigDecimal getPatotalpremium() {
		return this.patotalpremium;
	}

	public void setPatotalpremium(BigDecimal patotalpremium) {
		this.patotalpremium = patotalpremium;
	}

	public String getPayinslipdate() {
		return this.payinslipdate;
	}

	public void setPayinslipdate(String payinslipdate) {
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

	public String getPaymentYn() {
		return this.paymentYn;
	}

	public void setPaymentYn(String paymentYn) {
		this.paymentYn = paymentYn;
	}

	public BigDecimal getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(BigDecimal paymentid) {
		this.paymentid = paymentid;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public BigDecimal getPolicychannelpartnertype() {
		return this.policychannelpartnertype;
	}

	public void setPolicychannelpartnertype(BigDecimal policychannelpartnertype) {
		this.policychannelpartnertype = policychannelpartnertype;
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

	public String getPrevpolicyexpirydate() {
		return this.prevpolicyexpirydate;
	}

	public void setPrevpolicyexpirydate(String prevpolicyexpirydate) {
		this.prevpolicyexpirydate = prevpolicyexpirydate;
	}

	public String getPrevpolicyno() {
		return this.prevpolicyno;
	}

	public void setPrevpolicyno(String prevpolicyno) {
		this.prevpolicyno = prevpolicyno;
	}

	public BigDecimal getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(BigDecimal proposalNo) {
		this.proposalNo = proposalNo;
	}

	public Date getProposalcreateddate() {
		return this.proposalcreateddate;
	}

	public void setProposalcreateddate(Date proposalcreateddate) {
		this.proposalcreateddate = proposalcreateddate;
	}

	public Date getProposalcreatedtime() {
		return this.proposalcreatedtime;
	}

	public void setProposalcreatedtime(Date proposalcreatedtime) {
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

	public String getPspname() {
		return this.pspname;
	}

	public void setPspname(String pspname) {
		this.pspname = pspname;
	}

	public String getPsppannumber() {
		return this.psppannumber;
	}

	public void setPsppannumber(String psppannumber) {
		this.psppannumber = psppannumber;
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

	public String getReqCount() {
		return this.reqCount;
	}

	public void setReqCount(String reqCount) {
		this.reqCount = reqCount;
	}

	public String getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getResTime() {
		return this.resTime;
	}

	public void setResTime(String resTime) {
		this.resTime = resTime;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubBatch() {
		return this.subBatch;
	}

	public void setSubBatch(String subBatch) {
		this.subBatch = subBatch;
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

	public String getTrailerchassisno() {
		return this.trailerchassisno;
	}

	public void setTrailerchassisno(String trailerchassisno) {
		this.trailerchassisno = trailerchassisno;
	}

	public String getTraileridv() {
		return this.traileridv;
	}

	public void setTraileridv(String traileridv) {
		this.traileridv = traileridv;
	}

	public BigDecimal getTrailerpremium() {
		return this.trailerpremium;
	}

	public void setTrailerpremium(BigDecimal trailerpremium) {
		this.trailerpremium = trailerpremium;
	}

	public String getTrailerregistrationno() {
		return this.trailerregistrationno;
	}

	public void setTrailerregistrationno(String trailerregistrationno) {
		this.trailerregistrationno = trailerregistrationno;
	}

	public BigDecimal getTrailertp() {
		return this.trailertp;
	}

	public void setTrailertp(BigDecimal trailertp) {
		this.trailertp = trailertp;
	}

	public String getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
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

	public String getVehicleidv() {
		return this.vehicleidv;
	}

	public void setVehicleidv(String vehicleidv) {
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

	public String getVisofnumber() {
		return this.visofnumber;
	}

	public void setVisofnumber(String visofnumber) {
		this.visofnumber = visofnumber;
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

	public String getYearofmanufacture() {
		return this.yearofmanufacture;
	}

	public void setYearofmanufacture(String yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}

}*/