/*package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


*//**
 * The persistent class for the TTRN_FORD_NEWRENEWAL database table.
 * 
 *//*
@Entity
@Table(name="TTRN_FORD_NEWRENEWAL")
@NamedQuery(name="TtrnFordNewrenewal.findAll", query="SELECT t FROM TtrnFordNewrenewal t")
public class TtrnFordNewrenewal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ABS\"", length=200)
	private String abs;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCEPTANCE_DATE")
	private Date acceptanceDate;

	@Column(name="ACCEPTEDAMOUNT_SUM", precision=10)
	private BigDecimal acceptedamountSum;

	@Column(length=200)
	private String active;

	@Column(length=1)
	private String activeflag;

	@Column(length=200)
	private String addressline1;

	@Column(length=200)
	private String addressline2;

	@Column(length=200)
	private String airbag;

	@Column(length=200)
	private String airconditionerbuilttype;

	@Column(length=200)
	private String antitheftdiscflag;

	@Column(name="ANTITHEFTDISCOUNT_SUM", precision=10)
	private BigDecimal antitheftdiscountSum;

	@Column(length=200)
	private String area;

	@Column(precision=22)
	private BigDecimal areacode;

	@Column(precision=10)
	private BigDecimal automobassocdiscount;

	@Temporal(TemporalType.DATE)
	private Date automobileassocexpirydate;

	@Column(length=200)
	private String automobileassociationdiscount;

	@Column(precision=10)
	private BigDecimal automobileassociationnumber;

	@Column(length=200)
	private String averagemonthlymileage;

	@Column(length=200)
	private String avgkmperday;

	@Column(name="BALANCEAMOUNT_SUM", precision=10)
	private BigDecimal balanceamountSum;

	@Column(length=200)
	private String bankid;

	@Column(length=200)
	private String bankname;

	@Column(precision=10)
	private BigDecimal basicodpremium;

	@Column(precision=10)
	private BigDecimal basictppremium;

	@Column(precision=10)
	private BigDecimal batchid;

	@Column(length=200)
	private String bodycolor;

	@Column(length=200)
	private String bodytype;

	@Column(length=200)
	private String bonusdeclaration;

	@Column(name="BONUSDISCOUNT_SUM", precision=10)
	private BigDecimal bonusdiscountSum;

	@Column(precision=10)
	private BigDecimal bonusonpreviouspolicy;

	@Column(length=200)
	private String bonusrate;

	@Column(length=200)
	private String branchcode;

	@Column(precision=10)
	private BigDecimal breakinloadingamount;

	@Column(precision=10)
	private BigDecimal breakinloadingrate;

	@Column(length=200)
	private String brokercode;

	@Column(length=200)
	private String brokername;

	@Column(length=200)
	private String businesstype;

	@Column(length=200)
	private String cancellationreason;

	@Column(length=200)
	private String carfinance;

	@Column(precision=10)
	private BigDecimal carryingcapacity;

	@Column(length=200)
	private String channelnumber;

	@Column(length=200)
	private String chassisnumber;

	@Column(name="CHEQUE_AMOUNT", precision=10)
	private BigDecimal chequeAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="CHEQUE_DATE")
	private Date chequeDate;

	@Column(name="CHEQUE_NO", precision=10)
	private BigDecimal chequeNo;

	@Column(length=200)
	private String chequelocationtype;

	@Temporal(TemporalType.DATE)
	private Date chequerealizationdate;

	@Temporal(TemporalType.DATE)
	private Date chequereceiveddate;

	@Column(length=200)
	private String chequetype;

	@Column(length=200)
	private String city;

	@Column(precision=22)
	private BigDecimal citycode;

	@Column(name="CLAIM_INTIAMTION_ID", precision=10)
	private BigDecimal claimIntiamtionId;

	@Column(name="CLAIM_SETTLED_ID", precision=10)
	private BigDecimal claimSettledId;

	@Column(precision=10)
	private BigDecimal claimpaidamount;

	@Column(length=200)
	private String clientcode;

	@Column(precision=10)
	private BigDecimal cng;

	@Column(precision=10)
	private BigDecimal cngodpremium;

	@Column(precision=10)
	private BigDecimal cngtppremium;

	@Column(length=200)
	private String colorcode;

	@Column(precision=22)
	private BigDecimal commonreferenceno;

	@Column(length=200)
	private String companyname;

	@Column(precision=10)
	private BigDecimal compulsoryexcess;

	@Column(length=200)
	private String convictedinroadaccident;

	@Column(length=200)
	private String covernoteno;

	@Column(precision=10)
	private BigDecimal cubiccapacity;

	@Column(precision=10)
	private BigDecimal currentkmreading;

	@Column(name="CUSTOMER_ID", precision=20)
	private BigDecimal customerId;

	@Column(name="CUSTOMER_NAME", length=200)
	private String customerName;

	@Column(length=200)
	private String customertype;

	@Temporal(TemporalType.DATE)
	private Date dateofloss;

	@Column(name="DEALER_NAME", length=200)
	private String dealerName;

	@Column(length=200)
	private String dealercity;

	@Column(length=200)
	private String dealercode;

	@Column(length=200)
	private String dealerid;

	@Column(length=200)
	private String dealeridtemp;

	@Column(length=200)
	private String dealerregion;

	@Column(length=200)
	private String dealerstate;

	@Column(name="DEPOSIT_STATUS", length=200)
	private String depositStatus;

	@Column(length=100)
	private String depreciationwaiverpremium;

	@Column(name="DRAWEE_BANK_CODE", length=200)
	private String draweeBankCode;

	@Column(name="DRAWEE_BANK_CODETEMP", length=200)
	private String draweeBankCodetemp;

	@Column(name="DRAWEE_BANK_NAME", length=200)
	private String draweeBankName;

	@Column(name="DRAWEE_BRANCH_NAME", length=200)
	private String draweeBranchName;

	@Column(precision=10)
	private BigDecimal driverage;

	@Column(length=200)
	private String driverqualification;

	@Column(precision=10)
	private BigDecimal driversexperience;

	@Column(precision=10)
	private BigDecimal drivingtution;

	@Column(name="DSA_CODE", length=200)
	private String dsaCode;

	@Column(precision=10)
	private BigDecimal electrialaccessoriespremium;

	@Column(precision=10)
	private BigDecimal electricalaccessories;

	@Column(name="EMPLOYEE_CODE", length=25)
	private String employeeCode;

	@Column(name="EMPLOYEE_NAME", length=200)
	private String employeeName;

	@Column(precision=10)
	private BigDecimal employees;

	@Column(name="ENDORSEMENT_REASON", length=200)
	private String endorsementReason;

	@Temporal(TemporalType.DATE)
	private Date endorsementeffectivedate;

	@Column(length=200)
	private String endorsementeffectivetime;

	@Column(length=200)
	private String endorsementno;

	@Column(precision=10)
	private BigDecimal endorsementtypecode;

	@Column(length=200)
	private String endtime;

	@Column(length=200)
	private String enginenumber;

	@Column(length=100)
	private String engineprotector;

	@Column(precision=10)
	private BigDecimal exshowroomprice;

	@Column(length=200)
	private String extensoncountryname;

	@Column(precision=22)
	private BigDecimal facilitysparecar;

	@Column(length=200)
	private String fianancieraddress;

	@Column(length=200)
	private String fibreglassfueltankused;

	@Column(length=200)
	private String finanacialinstitution;

	@Column(length=200)
	private String financetype;

	@Column(length=200)
	private String financiercode;

	@Column(length=200)
	private String financiercontactno;

	@Column(precision=10)
	private BigDecimal foreignembassy;

	@Column(precision=22)
	private BigDecimal fullinvoice;

	@Column(length=50)
	private String gender;

	@Column(precision=10)
	private BigDecimal geographicalextensionod;

	@Column(precision=10)
	private BigDecimal geographicalextensiontp;

	@Column(length=200)
	private String geographicalzone;

	@Column(precision=10)
	private BigDecimal gvw;

	@Column(length=200)
	private String handicapdiscountflag;

	@Column(precision=10)
	private BigDecimal handicappeddiscount;

	@Column(precision=10)
	private BigDecimal imt23loadingamount;

	@Column(name="IRDA_SECTOR", length=200)
	private String irdaSector;

	@Column(precision=22)
	private BigDecimal keyreplacementcover;

	@Column(precision=10)
	private BigDecimal legalliabilitytopassengers;

	@Column(precision=10)
	private BigDecimal liabilitypremiumtoemployees;

	@Column(precision=10)
	private BigDecimal liabilitytopaiddriver;

	@Column(precision=10)
	private BigDecimal licenceseatingcapacity;

	@Column(precision=22)
	private BigDecimal lifetimeroadtax;

	@Column(precision=22)
	private BigDecimal lifetimeroadtaxvalue;

	@Column(precision=10)
	private BigDecimal lpg;

	@Column(length=200)
	private String lpgcngbuiltintype;

	@Column(precision=10)
	private BigDecimal lpgodpremium;

	@Column(precision=10)
	private BigDecimal lpgtppremium;

	@Column(length=200)
	private String manufacturer;

	@Column(precision=10)
	private BigDecimal manufacturingyear;

	@Column(name="METALIC_NONMETALIC", length=200)
	private String metalicNonmetalic;

	@Column(length=200)
	private String mobilenumber1;

	@Column(length=200)
	private String mobilenumber2;

	@Temporal(TemporalType.DATE)
	private Date modifieddate;

	@Column(name="MOVED_DATE")
	private Timestamp movedDate;

	@Column(precision=10)
	private BigDecimal namedpacover;

	@Column(length=200)
	private String nameofdriver;

	@Column(length=200)
	private String natureofloss;

	@Column(precision=10)
	private BigDecimal ncb;

	@Column(name="NET_OD_PREMIUM", precision=10)
	private BigDecimal netOdPremium;

	@Column(name="NET_PREMIUM", precision=10)
	private BigDecimal netPremium;

	@Column(name="NET_TP_PREMIUM", precision=10)
	private BigDecimal netTpPremium;

	@Column(precision=10)
	private BigDecimal nildepreciationcover;

	@Column(length=100)
	private String nomineeage;

	@Column(length=100)
	private String nomineename;

	@Column(length=100)
	private String nomineerelation;

	@Column(precision=10)
	private BigDecimal nonelectricalaccessories;

	@Column(precision=10)
	private BigDecimal noofchildrenbelow14yrs;

	@Column(precision=10)
	private BigDecimal noofdriver;

	@Column(precision=10)
	private BigDecimal noofworkmen;

	@Column(precision=10)
	private BigDecimal numberofwheels;

	@Column(precision=22)
	private BigDecimal numendorsementno;

	@Column(name="OFFICE_LOCATION", precision=10)
	private BigDecimal officeLocation;

	@Column(length=200)
	private String officename;

	@Column(precision=10)
	private BigDecimal otherdiscountamount;

	@Column(precision=10, scale=2)
	private BigDecimal otherdiscountrate;

	@Column(precision=10)
	private BigDecimal outstandingamount;

	@Column(precision=10)
	private BigDecimal overturncover;

	@Column(precision=10)
	private BigDecimal overturningloading;

	@Column(name="PAOWNER_DRIVER", precision=10)
	private BigDecimal paownerDriver;

	@Column(length=50)
	private String papaiddriver;

	@Column(length=200)
	private String papaiddriverpremium;

	@Column(length=200)
	private String parkingtype;

	@Column(name="PAYER_TYPE", length=200)
	private String payerType;

	@Column(precision=22)
	private BigDecimal payerid;

	@Column(length=200)
	private String payername;

	@Temporal(TemporalType.DATE)
	@Column(name="PAYINSLIP_DATE")
	private Date payinslipDate;

	@Column(name="PAYINSLIP_NO", precision=10)
	private BigDecimal payinslipNo;

	@Column(name="PAYMENT_ID", precision=10)
	private BigDecimal paymentId;

	@Column(name="PAYMENT_RECONCILE_ID", precision=10)
	private BigDecimal paymentReconcileId;

	@Column(name="PAYMENT_RECONCILE_STATUS", length=200)
	private String paymentReconcileStatus;

	@Column(name="PAYMENT_STATUS", length=200)
	private String paymentStatus;

	@Column(length=50)
	private String paymentmode;

	@Column(precision=10)
	private BigDecimal pincode;

	@Column(precision=22)
	private BigDecimal pmtofficecode;

	@Column(length=50)
	private String pmtstatus;

	@Temporal(TemporalType.DATE)
	@Column(name="POLICY_END_DATE")
	private Date policyEndDate;

	
	@Column(name="POLICY_NO", length=200)
	private String policyNo;

	@Temporal(TemporalType.DATE)
	@Column(name="POLICY_START_DATE")
	private Date policyStartDate;

	@Column(name="POLICY_STATUS", length=200)
	private String policyStatus;

	@Column(name="POLICY_TERM", length=200)
	private String policyTerm;

	@Column(name="POLICY_TYPE", length=200)
	private String policyType;
    
	@Id
	@Column(length=200)
	private String policyno;

	@Column(length=200)
	private String previousclaimno;

	@Column(length=200)
	private String previousinsureraddress;

	@Column(length=200)
	private String previousinsurername;

	@Temporal(TemporalType.DATE)
	private Date previouspolicyeffectivefrom;

	@Temporal(TemporalType.DATE)
	private Date previouspolicyeffectiveto;

	@Column(length=200)
	private String previouspolicyno;

	@Column(precision=10)
	private BigDecimal previouspolicypremium;

	@Column(length=200)
	private String previouspolicytype;

	@Column(precision=10)
	private BigDecimal previouspolicyyear;

	@Temporal(TemporalType.DATE)
	private Date previousvehiclesaledate;

	@Column(length=200)
	private String productname;

	@Column(name="PROMOTION_CODE", length=200)
	private String promotionCode;

	@Column(name="PROPOSALAMT_SUM", precision=10)
	private BigDecimal proposalamtSum;

	@Temporal(TemporalType.DATE)
	private Date proposaldate;

	@Column(precision=20)
	private BigDecimal proposalnumber;

	@Column(length=200)
	private String proposaltype;

	@Temporal(TemporalType.DATE)
	private Date purchasedate;

	@Temporal(TemporalType.DATE)
	private Date reconciledate;

	@Temporal(TemporalType.DATE)
	private Date registrationdate;

	@Column(length=200)
	private String registrationnumber;

	@Column(length=200)
	private String registrationzone;

	@Column(length=200)
	private String registrationzonetemp;

	@Column(length=200)
	private String renewaldeclaration;

	@Column(length=200)
	private String retainpremium;

	@Column(length=200)
	private String rtolocation;

	@Column(length=50)
	private String rtolocationcode;

	@Column(precision=10)
	private BigDecimal seatingcapacity;

	@Column(name="SERVICE_TAX", precision=10)
	private BigDecimal serviceTax;

	@Column(name="SERVICE_TAX_EXCEMPTION", length=200)
	private String serviceTaxExcemption;

	@Column(name="SETTLEMENT_TYPE", length=50)
	private String settlementType;

	@Column(name="START_TIME", length=200)
	private String startTime;

	@Column(name="\"STATE\"", length=200)
	private String state;

	@Column(length=50)
	private String statecode;

	@Column(length=200)
	private String statetemp;

	@Column(length=50)
	private String status;

	@Column(length=200)
	private String statusdesc;

	@Column(name="SUBBROKERCODE_SUM", precision=10)
	private BigDecimal subbrokercodeSum;

	@Column(name="TAGGEDAMOUNT_SUM", precision=10)
	private BigDecimal taggedamountSum;

	@Temporal(TemporalType.DATE)
	private Date taggeddate;

	@Column(name="TATAMOTORS_REFERENCEID", length=200)
	private String tatamotorsReferenceid;

	@Column(length=200)
	private String telephonenumber1;

	@Column(length=200)
	private String telephonenumber2;

	@Column(length=200)
	private String telephonenumber3;

	@Column(length=200)
	private String telephonenumber4;

	@Column(name="TML_TMF_REFERENCE_NO", precision=10)
	private BigDecimal tmlTmfReferenceNo;

	@Column(name="TOTAL_PREMIUM", precision=10)
	private BigDecimal totalPremium;

	@Column(precision=10)
	private BigDecimal totalchequeamount;

	@Column(precision=10)
	private BigDecimal totalsi;

	@Column(precision=10)
	private BigDecimal tppddiscount;

	@Column(precision=10)
	private BigDecimal tppdlimit;

	@Column(name="TRANSACTION_TYPE", length=200)
	private String transactionType;

	@Temporal(TemporalType.DATE)
	private Date transactiondate;

	@Column(length=200)
	private String transferofncb;

	@Column(length=200)
	private String transferofncb1;

	@Column(length=200)
	private String txtendorsementno;

	@Column(length=200)
	private String typeofcalculation;

	@Column(length=200)
	private String typeoffuel;

	@Column(precision=22)
	private BigDecimal tyreandalloycover;

	@Column(precision=10)
	private BigDecimal unnamedpacover;

	@Column(precision=10)
	private BigDecimal unnamedpapremium;

	@Temporal(TemporalType.DATE)
	private Date uploaddate;

	@Column(name="VALIDATE_STATUS", length=200)
	private String validateStatus;

	@Column(length=100)
	private String valueautocoverpremium;

	@Column(name="VEHICLE_BASE_VALUE", precision=10)
	private BigDecimal vehicleBaseValue;

	@Column(length=200)
	private String vehiclecategory;

	@Column(length=200)
	private String vehicleclass;

	@Column(length=200)
	private String vehicledriven;

	@Column(length=200)
	private String vehicledrivenby;

	@Column(length=200)
	private String vehiclemodel;

	@Column(length=200)
	private String vehiclemodelcode;

	@Column(length=200)
	private String vehiclemodelcodetemp;

	@Column(length=200)
	private String vehiclemostlydrivenon;

	@Column(length=50)
	private String vehiclesubclass;

	@Column(length=200)
	private String vehicleuse;

	@Column(precision=10)
	private BigDecimal voluntarydiscount;

	@Column(precision=10)
	private BigDecimal voluntayexcess;

	@Column(length=100)
	private String windshieldglass;

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

	@Column(precision=10)
	private BigDecimal youngestdriverage;

	public TtrnFordNewrenewal() {
	}

	public String getAbs() {
		return this.abs;
	}

	public void setAbs(String abs) {
		this.abs = abs;
	}

	public Date getAcceptanceDate() {
		return this.acceptanceDate;
	}

	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public BigDecimal getAcceptedamountSum() {
		return this.acceptedamountSum;
	}

	public void setAcceptedamountSum(BigDecimal acceptedamountSum) {
		this.acceptedamountSum = acceptedamountSum;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getActiveflag() {
		return this.activeflag;
	}

	public void setActiveflag(String activeflag) {
		this.activeflag = activeflag;
	}

	public String getAddressline1() {
		return this.addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return this.addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getAirbag() {
		return this.airbag;
	}

	public void setAirbag(String airbag) {
		this.airbag = airbag;
	}

	public String getAirconditionerbuilttype() {
		return this.airconditionerbuilttype;
	}

	public void setAirconditionerbuilttype(String airconditionerbuilttype) {
		this.airconditionerbuilttype = airconditionerbuilttype;
	}

	public String getAntitheftdiscflag() {
		return this.antitheftdiscflag;
	}

	public void setAntitheftdiscflag(String antitheftdiscflag) {
		this.antitheftdiscflag = antitheftdiscflag;
	}

	public BigDecimal getAntitheftdiscountSum() {
		return this.antitheftdiscountSum;
	}

	public void setAntitheftdiscountSum(BigDecimal antitheftdiscountSum) {
		this.antitheftdiscountSum = antitheftdiscountSum;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public BigDecimal getAreacode() {
		return this.areacode;
	}

	public void setAreacode(BigDecimal areacode) {
		this.areacode = areacode;
	}

	public BigDecimal getAutomobassocdiscount() {
		return this.automobassocdiscount;
	}

	public void setAutomobassocdiscount(BigDecimal automobassocdiscount) {
		this.automobassocdiscount = automobassocdiscount;
	}

	public Date getAutomobileassocexpirydate() {
		return this.automobileassocexpirydate;
	}

	public void setAutomobileassocexpirydate(Date automobileassocexpirydate) {
		this.automobileassocexpirydate = automobileassocexpirydate;
	}

	public String getAutomobileassociationdiscount() {
		return this.automobileassociationdiscount;
	}

	public void setAutomobileassociationdiscount(String automobileassociationdiscount) {
		this.automobileassociationdiscount = automobileassociationdiscount;
	}

	public BigDecimal getAutomobileassociationnumber() {
		return this.automobileassociationnumber;
	}

	public void setAutomobileassociationnumber(BigDecimal automobileassociationnumber) {
		this.automobileassociationnumber = automobileassociationnumber;
	}

	public String getAveragemonthlymileage() {
		return this.averagemonthlymileage;
	}

	public void setAveragemonthlymileage(String averagemonthlymileage) {
		this.averagemonthlymileage = averagemonthlymileage;
	}

	public String getAvgkmperday() {
		return this.avgkmperday;
	}

	public void setAvgkmperday(String avgkmperday) {
		this.avgkmperday = avgkmperday;
	}

	public BigDecimal getBalanceamountSum() {
		return this.balanceamountSum;
	}

	public void setBalanceamountSum(BigDecimal balanceamountSum) {
		this.balanceamountSum = balanceamountSum;
	}

	public String getBankid() {
		return this.bankid;
	}

	public void setBankid(String bankid) {
		this.bankid = bankid;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public BigDecimal getBasicodpremium() {
		return this.basicodpremium;
	}

	public void setBasicodpremium(BigDecimal basicodpremium) {
		this.basicodpremium = basicodpremium;
	}

	public BigDecimal getBasictppremium() {
		return this.basictppremium;
	}

	public void setBasictppremium(BigDecimal basictppremium) {
		this.basictppremium = basictppremium;
	}

	public BigDecimal getBatchid() {
		return this.batchid;
	}

	public void setBatchid(BigDecimal batchid) {
		this.batchid = batchid;
	}

	public String getBodycolor() {
		return this.bodycolor;
	}

	public void setBodycolor(String bodycolor) {
		this.bodycolor = bodycolor;
	}

	public String getBodytype() {
		return this.bodytype;
	}

	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public String getBonusdeclaration() {
		return this.bonusdeclaration;
	}

	public void setBonusdeclaration(String bonusdeclaration) {
		this.bonusdeclaration = bonusdeclaration;
	}

	public BigDecimal getBonusdiscountSum() {
		return this.bonusdiscountSum;
	}

	public void setBonusdiscountSum(BigDecimal bonusdiscountSum) {
		this.bonusdiscountSum = bonusdiscountSum;
	}

	public BigDecimal getBonusonpreviouspolicy() {
		return this.bonusonpreviouspolicy;
	}

	public void setBonusonpreviouspolicy(BigDecimal bonusonpreviouspolicy) {
		this.bonusonpreviouspolicy = bonusonpreviouspolicy;
	}

	public String getBonusrate() {
		return this.bonusrate;
	}

	public void setBonusrate(String bonusrate) {
		this.bonusrate = bonusrate;
	}

	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public BigDecimal getBreakinloadingamount() {
		return this.breakinloadingamount;
	}

	public void setBreakinloadingamount(BigDecimal breakinloadingamount) {
		this.breakinloadingamount = breakinloadingamount;
	}

	public BigDecimal getBreakinloadingrate() {
		return this.breakinloadingrate;
	}

	public void setBreakinloadingrate(BigDecimal breakinloadingrate) {
		this.breakinloadingrate = breakinloadingrate;
	}

	public String getBrokercode() {
		return this.brokercode;
	}

	public void setBrokercode(String brokercode) {
		this.brokercode = brokercode;
	}

	public String getBrokername() {
		return this.brokername;
	}

	public void setBrokername(String brokername) {
		this.brokername = brokername;
	}

	public String getBusinesstype() {
		return this.businesstype;
	}

	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}

	public String getCancellationreason() {
		return this.cancellationreason;
	}

	public void setCancellationreason(String cancellationreason) {
		this.cancellationreason = cancellationreason;
	}

	public String getCarfinance() {
		return this.carfinance;
	}

	public void setCarfinance(String carfinance) {
		this.carfinance = carfinance;
	}

	public BigDecimal getCarryingcapacity() {
		return this.carryingcapacity;
	}

	public void setCarryingcapacity(BigDecimal carryingcapacity) {
		this.carryingcapacity = carryingcapacity;
	}

	public String getChannelnumber() {
		return this.channelnumber;
	}

	public void setChannelnumber(String channelnumber) {
		this.channelnumber = channelnumber;
	}

	public String getChassisnumber() {
		return this.chassisnumber;
	}

	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}

	public BigDecimal getChequeAmount() {
		return this.chequeAmount;
	}

	public void setChequeAmount(BigDecimal chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public Date getChequeDate() {
		return this.chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	public BigDecimal getChequeNo() {
		return this.chequeNo;
	}

	public void setChequeNo(BigDecimal chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequelocationtype() {
		return this.chequelocationtype;
	}

	public void setChequelocationtype(String chequelocationtype) {
		this.chequelocationtype = chequelocationtype;
	}

	public Date getChequerealizationdate() {
		return this.chequerealizationdate;
	}

	public void setChequerealizationdate(Date chequerealizationdate) {
		this.chequerealizationdate = chequerealizationdate;
	}

	public Date getChequereceiveddate() {
		return this.chequereceiveddate;
	}

	public void setChequereceiveddate(Date chequereceiveddate) {
		this.chequereceiveddate = chequereceiveddate;
	}

	public String getChequetype() {
		return this.chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public BigDecimal getCitycode() {
		return this.citycode;
	}

	public void setCitycode(BigDecimal citycode) {
		this.citycode = citycode;
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

	public BigDecimal getClaimpaidamount() {
		return this.claimpaidamount;
	}

	public void setClaimpaidamount(BigDecimal claimpaidamount) {
		this.claimpaidamount = claimpaidamount;
	}

	public String getClientcode() {
		return this.clientcode;
	}

	public void setClientcode(String clientcode) {
		this.clientcode = clientcode;
	}

	public BigDecimal getCng() {
		return this.cng;
	}

	public void setCng(BigDecimal cng) {
		this.cng = cng;
	}

	public BigDecimal getCngodpremium() {
		return this.cngodpremium;
	}

	public void setCngodpremium(BigDecimal cngodpremium) {
		this.cngodpremium = cngodpremium;
	}

	public BigDecimal getCngtppremium() {
		return this.cngtppremium;
	}

	public void setCngtppremium(BigDecimal cngtppremium) {
		this.cngtppremium = cngtppremium;
	}

	public String getColorcode() {
		return this.colorcode;
	}

	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}

	public BigDecimal getCommonreferenceno() {
		return this.commonreferenceno;
	}

	public void setCommonreferenceno(BigDecimal commonreferenceno) {
		this.commonreferenceno = commonreferenceno;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public BigDecimal getCompulsoryexcess() {
		return this.compulsoryexcess;
	}

	public void setCompulsoryexcess(BigDecimal compulsoryexcess) {
		this.compulsoryexcess = compulsoryexcess;
	}

	public String getConvictedinroadaccident() {
		return this.convictedinroadaccident;
	}

	public void setConvictedinroadaccident(String convictedinroadaccident) {
		this.convictedinroadaccident = convictedinroadaccident;
	}

	public String getCovernoteno() {
		return this.covernoteno;
	}

	public void setCovernoteno(String covernoteno) {
		this.covernoteno = covernoteno;
	}

	public BigDecimal getCubiccapacity() {
		return this.cubiccapacity;
	}

	public void setCubiccapacity(BigDecimal cubiccapacity) {
		this.cubiccapacity = cubiccapacity;
	}

	public BigDecimal getCurrentkmreading() {
		return this.currentkmreading;
	}

	public void setCurrentkmreading(BigDecimal currentkmreading) {
		this.currentkmreading = currentkmreading;
	}

	public BigDecimal getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomertype() {
		return this.customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	public Date getDateofloss() {
		return this.dateofloss;
	}

	public void setDateofloss(Date dateofloss) {
		this.dateofloss = dateofloss;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealercity() {
		return this.dealercity;
	}

	public void setDealercity(String dealercity) {
		this.dealercity = dealercity;
	}

	public String getDealercode() {
		return this.dealercode;
	}

	public void setDealercode(String dealercode) {
		this.dealercode = dealercode;
	}

	public String getDealerid() {
		return this.dealerid;
	}

	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}

	public String getDealeridtemp() {
		return this.dealeridtemp;
	}

	public void setDealeridtemp(String dealeridtemp) {
		this.dealeridtemp = dealeridtemp;
	}

	public String getDealerregion() {
		return this.dealerregion;
	}

	public void setDealerregion(String dealerregion) {
		this.dealerregion = dealerregion;
	}

	public String getDealerstate() {
		return this.dealerstate;
	}

	public void setDealerstate(String dealerstate) {
		this.dealerstate = dealerstate;
	}

	public String getDepositStatus() {
		return this.depositStatus;
	}

	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}

	public String getDepreciationwaiverpremium() {
		return this.depreciationwaiverpremium;
	}

	public void setDepreciationwaiverpremium(String depreciationwaiverpremium) {
		this.depreciationwaiverpremium = depreciationwaiverpremium;
	}

	public String getDraweeBankCode() {
		return this.draweeBankCode;
	}

	public void setDraweeBankCode(String draweeBankCode) {
		this.draweeBankCode = draweeBankCode;
	}

	public String getDraweeBankCodetemp() {
		return this.draweeBankCodetemp;
	}

	public void setDraweeBankCodetemp(String draweeBankCodetemp) {
		this.draweeBankCodetemp = draweeBankCodetemp;
	}

	public String getDraweeBankName() {
		return this.draweeBankName;
	}

	public void setDraweeBankName(String draweeBankName) {
		this.draweeBankName = draweeBankName;
	}

	public String getDraweeBranchName() {
		return this.draweeBranchName;
	}

	public void setDraweeBranchName(String draweeBranchName) {
		this.draweeBranchName = draweeBranchName;
	}

	public BigDecimal getDriverage() {
		return this.driverage;
	}

	public void setDriverage(BigDecimal driverage) {
		this.driverage = driverage;
	}

	public String getDriverqualification() {
		return this.driverqualification;
	}

	public void setDriverqualification(String driverqualification) {
		this.driverqualification = driverqualification;
	}

	public BigDecimal getDriversexperience() {
		return this.driversexperience;
	}

	public void setDriversexperience(BigDecimal driversexperience) {
		this.driversexperience = driversexperience;
	}

	public BigDecimal getDrivingtution() {
		return this.drivingtution;
	}

	public void setDrivingtution(BigDecimal drivingtution) {
		this.drivingtution = drivingtution;
	}

	public String getDsaCode() {
		return this.dsaCode;
	}

	public void setDsaCode(String dsaCode) {
		this.dsaCode = dsaCode;
	}

	public BigDecimal getElectrialaccessoriespremium() {
		return this.electrialaccessoriespremium;
	}

	public void setElectrialaccessoriespremium(BigDecimal electrialaccessoriespremium) {
		this.electrialaccessoriespremium = electrialaccessoriespremium;
	}

	public BigDecimal getElectricalaccessories() {
		return this.electricalaccessories;
	}

	public void setElectricalaccessories(BigDecimal electricalaccessories) {
		this.electricalaccessories = electricalaccessories;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BigDecimal getEmployees() {
		return this.employees;
	}

	public void setEmployees(BigDecimal employees) {
		this.employees = employees;
	}

	public String getEndorsementReason() {
		return this.endorsementReason;
	}

	public void setEndorsementReason(String endorsementReason) {
		this.endorsementReason = endorsementReason;
	}

	public Date getEndorsementeffectivedate() {
		return this.endorsementeffectivedate;
	}

	public void setEndorsementeffectivedate(Date endorsementeffectivedate) {
		this.endorsementeffectivedate = endorsementeffectivedate;
	}

	public String getEndorsementeffectivetime() {
		return this.endorsementeffectivetime;
	}

	public void setEndorsementeffectivetime(String endorsementeffectivetime) {
		this.endorsementeffectivetime = endorsementeffectivetime;
	}

	public String getEndorsementno() {
		return this.endorsementno;
	}

	public void setEndorsementno(String endorsementno) {
		this.endorsementno = endorsementno;
	}

	public BigDecimal getEndorsementtypecode() {
		return this.endorsementtypecode;
	}

	public void setEndorsementtypecode(BigDecimal endorsementtypecode) {
		this.endorsementtypecode = endorsementtypecode;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getEnginenumber() {
		return this.enginenumber;
	}

	public void setEnginenumber(String enginenumber) {
		this.enginenumber = enginenumber;
	}

	public String getEngineprotector() {
		return this.engineprotector;
	}

	public void setEngineprotector(String engineprotector) {
		this.engineprotector = engineprotector;
	}

	public BigDecimal getExshowroomprice() {
		return this.exshowroomprice;
	}

	public void setExshowroomprice(BigDecimal exshowroomprice) {
		this.exshowroomprice = exshowroomprice;
	}

	public String getExtensoncountryname() {
		return this.extensoncountryname;
	}

	public void setExtensoncountryname(String extensoncountryname) {
		this.extensoncountryname = extensoncountryname;
	}

	public BigDecimal getFacilitysparecar() {
		return this.facilitysparecar;
	}

	public void setFacilitysparecar(BigDecimal facilitysparecar) {
		this.facilitysparecar = facilitysparecar;
	}

	public String getFianancieraddress() {
		return this.fianancieraddress;
	}

	public void setFianancieraddress(String fianancieraddress) {
		this.fianancieraddress = fianancieraddress;
	}

	public String getFibreglassfueltankused() {
		return this.fibreglassfueltankused;
	}

	public void setFibreglassfueltankused(String fibreglassfueltankused) {
		this.fibreglassfueltankused = fibreglassfueltankused;
	}

	public String getFinanacialinstitution() {
		return this.finanacialinstitution;
	}

	public void setFinanacialinstitution(String finanacialinstitution) {
		this.finanacialinstitution = finanacialinstitution;
	}

	public String getFinancetype() {
		return this.financetype;
	}

	public void setFinancetype(String financetype) {
		this.financetype = financetype;
	}

	public String getFinanciercode() {
		return this.financiercode;
	}

	public void setFinanciercode(String financiercode) {
		this.financiercode = financiercode;
	}

	public String getFinanciercontactno() {
		return this.financiercontactno;
	}

	public void setFinanciercontactno(String financiercontactno) {
		this.financiercontactno = financiercontactno;
	}

	public BigDecimal getForeignembassy() {
		return this.foreignembassy;
	}

	public void setForeignembassy(BigDecimal foreignembassy) {
		this.foreignembassy = foreignembassy;
	}

	public BigDecimal getFullinvoice() {
		return this.fullinvoice;
	}

	public void setFullinvoice(BigDecimal fullinvoice) {
		this.fullinvoice = fullinvoice;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getGeographicalextensionod() {
		return this.geographicalextensionod;
	}

	public void setGeographicalextensionod(BigDecimal geographicalextensionod) {
		this.geographicalextensionod = geographicalextensionod;
	}

	public BigDecimal getGeographicalextensiontp() {
		return this.geographicalextensiontp;
	}

	public void setGeographicalextensiontp(BigDecimal geographicalextensiontp) {
		this.geographicalextensiontp = geographicalextensiontp;
	}

	public String getGeographicalzone() {
		return this.geographicalzone;
	}

	public void setGeographicalzone(String geographicalzone) {
		this.geographicalzone = geographicalzone;
	}

	public BigDecimal getGvw() {
		return this.gvw;
	}

	public void setGvw(BigDecimal gvw) {
		this.gvw = gvw;
	}

	public String getHandicapdiscountflag() {
		return this.handicapdiscountflag;
	}

	public void setHandicapdiscountflag(String handicapdiscountflag) {
		this.handicapdiscountflag = handicapdiscountflag;
	}

	public BigDecimal getHandicappeddiscount() {
		return this.handicappeddiscount;
	}

	public void setHandicappeddiscount(BigDecimal handicappeddiscount) {
		this.handicappeddiscount = handicappeddiscount;
	}

	public BigDecimal getImt23loadingamount() {
		return this.imt23loadingamount;
	}

	public void setImt23loadingamount(BigDecimal imt23loadingamount) {
		this.imt23loadingamount = imt23loadingamount;
	}

	public String getIrdaSector() {
		return this.irdaSector;
	}

	public void setIrdaSector(String irdaSector) {
		this.irdaSector = irdaSector;
	}

	public BigDecimal getKeyreplacementcover() {
		return this.keyreplacementcover;
	}

	public void setKeyreplacementcover(BigDecimal keyreplacementcover) {
		this.keyreplacementcover = keyreplacementcover;
	}

	public BigDecimal getLegalliabilitytopassengers() {
		return this.legalliabilitytopassengers;
	}

	public void setLegalliabilitytopassengers(BigDecimal legalliabilitytopassengers) {
		this.legalliabilitytopassengers = legalliabilitytopassengers;
	}

	public BigDecimal getLiabilitypremiumtoemployees() {
		return this.liabilitypremiumtoemployees;
	}

	public void setLiabilitypremiumtoemployees(BigDecimal liabilitypremiumtoemployees) {
		this.liabilitypremiumtoemployees = liabilitypremiumtoemployees;
	}

	public BigDecimal getLiabilitytopaiddriver() {
		return this.liabilitytopaiddriver;
	}

	public void setLiabilitytopaiddriver(BigDecimal liabilitytopaiddriver) {
		this.liabilitytopaiddriver = liabilitytopaiddriver;
	}

	public BigDecimal getLicenceseatingcapacity() {
		return this.licenceseatingcapacity;
	}

	public void setLicenceseatingcapacity(BigDecimal licenceseatingcapacity) {
		this.licenceseatingcapacity = licenceseatingcapacity;
	}

	public BigDecimal getLifetimeroadtax() {
		return this.lifetimeroadtax;
	}

	public void setLifetimeroadtax(BigDecimal lifetimeroadtax) {
		this.lifetimeroadtax = lifetimeroadtax;
	}

	public BigDecimal getLifetimeroadtaxvalue() {
		return this.lifetimeroadtaxvalue;
	}

	public void setLifetimeroadtaxvalue(BigDecimal lifetimeroadtaxvalue) {
		this.lifetimeroadtaxvalue = lifetimeroadtaxvalue;
	}

	public BigDecimal getLpg() {
		return this.lpg;
	}

	public void setLpg(BigDecimal lpg) {
		this.lpg = lpg;
	}

	public String getLpgcngbuiltintype() {
		return this.lpgcngbuiltintype;
	}

	public void setLpgcngbuiltintype(String lpgcngbuiltintype) {
		this.lpgcngbuiltintype = lpgcngbuiltintype;
	}

	public BigDecimal getLpgodpremium() {
		return this.lpgodpremium;
	}

	public void setLpgodpremium(BigDecimal lpgodpremium) {
		this.lpgodpremium = lpgodpremium;
	}

	public BigDecimal getLpgtppremium() {
		return this.lpgtppremium;
	}

	public void setLpgtppremium(BigDecimal lpgtppremium) {
		this.lpgtppremium = lpgtppremium;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public BigDecimal getManufacturingyear() {
		return this.manufacturingyear;
	}

	public void setManufacturingyear(BigDecimal manufacturingyear) {
		this.manufacturingyear = manufacturingyear;
	}

	public String getMetalicNonmetalic() {
		return this.metalicNonmetalic;
	}

	public void setMetalicNonmetalic(String metalicNonmetalic) {
		this.metalicNonmetalic = metalicNonmetalic;
	}

	public String getMobilenumber1() {
		return this.mobilenumber1;
	}

	public void setMobilenumber1(String mobilenumber1) {
		this.mobilenumber1 = mobilenumber1;
	}

	public String getMobilenumber2() {
		return this.mobilenumber2;
	}

	public void setMobilenumber2(String mobilenumber2) {
		this.mobilenumber2 = mobilenumber2;
	}

	public Date getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public Timestamp getMovedDate() {
		return this.movedDate;
	}

	public void setMovedDate(Timestamp movedDate) {
		this.movedDate = movedDate;
	}

	public BigDecimal getNamedpacover() {
		return this.namedpacover;
	}

	public void setNamedpacover(BigDecimal namedpacover) {
		this.namedpacover = namedpacover;
	}

	public String getNameofdriver() {
		return this.nameofdriver;
	}

	public void setNameofdriver(String nameofdriver) {
		this.nameofdriver = nameofdriver;
	}

	public String getNatureofloss() {
		return this.natureofloss;
	}

	public void setNatureofloss(String natureofloss) {
		this.natureofloss = natureofloss;
	}

	public BigDecimal getNcb() {
		return this.ncb;
	}

	public void setNcb(BigDecimal ncb) {
		this.ncb = ncb;
	}

	public BigDecimal getNetOdPremium() {
		return this.netOdPremium;
	}

	public void setNetOdPremium(BigDecimal netOdPremium) {
		this.netOdPremium = netOdPremium;
	}

	public BigDecimal getNetPremium() {
		return this.netPremium;
	}

	public void setNetPremium(BigDecimal netPremium) {
		this.netPremium = netPremium;
	}

	public BigDecimal getNetTpPremium() {
		return this.netTpPremium;
	}

	public void setNetTpPremium(BigDecimal netTpPremium) {
		this.netTpPremium = netTpPremium;
	}

	public BigDecimal getNildepreciationcover() {
		return this.nildepreciationcover;
	}

	public void setNildepreciationcover(BigDecimal nildepreciationcover) {
		this.nildepreciationcover = nildepreciationcover;
	}

	public String getNomineeage() {
		return this.nomineeage;
	}

	public void setNomineeage(String nomineeage) {
		this.nomineeage = nomineeage;
	}

	public String getNomineename() {
		return this.nomineename;
	}

	public void setNomineename(String nomineename) {
		this.nomineename = nomineename;
	}

	public String getNomineerelation() {
		return this.nomineerelation;
	}

	public void setNomineerelation(String nomineerelation) {
		this.nomineerelation = nomineerelation;
	}

	public BigDecimal getNonelectricalaccessories() {
		return this.nonelectricalaccessories;
	}

	public void setNonelectricalaccessories(BigDecimal nonelectricalaccessories) {
		this.nonelectricalaccessories = nonelectricalaccessories;
	}

	public BigDecimal getNoofchildrenbelow14yrs() {
		return this.noofchildrenbelow14yrs;
	}

	public void setNoofchildrenbelow14yrs(BigDecimal noofchildrenbelow14yrs) {
		this.noofchildrenbelow14yrs = noofchildrenbelow14yrs;
	}

	public BigDecimal getNoofdriver() {
		return this.noofdriver;
	}

	public void setNoofdriver(BigDecimal noofdriver) {
		this.noofdriver = noofdriver;
	}

	public BigDecimal getNoofworkmen() {
		return this.noofworkmen;
	}

	public void setNoofworkmen(BigDecimal noofworkmen) {
		this.noofworkmen = noofworkmen;
	}

	public BigDecimal getNumberofwheels() {
		return this.numberofwheels;
	}

	public void setNumberofwheels(BigDecimal numberofwheels) {
		this.numberofwheels = numberofwheels;
	}

	public BigDecimal getNumendorsementno() {
		return this.numendorsementno;
	}

	public void setNumendorsementno(BigDecimal numendorsementno) {
		this.numendorsementno = numendorsementno;
	}

	public BigDecimal getOfficeLocation() {
		return this.officeLocation;
	}

	public void setOfficeLocation(BigDecimal officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getOfficename() {
		return this.officename;
	}

	public void setOfficename(String officename) {
		this.officename = officename;
	}

	public BigDecimal getOtherdiscountamount() {
		return this.otherdiscountamount;
	}

	public void setOtherdiscountamount(BigDecimal otherdiscountamount) {
		this.otherdiscountamount = otherdiscountamount;
	}

	public BigDecimal getOtherdiscountrate() {
		return this.otherdiscountrate;
	}

	public void setOtherdiscountrate(BigDecimal otherdiscountrate) {
		this.otherdiscountrate = otherdiscountrate;
	}

	public BigDecimal getOutstandingamount() {
		return this.outstandingamount;
	}

	public void setOutstandingamount(BigDecimal outstandingamount) {
		this.outstandingamount = outstandingamount;
	}

	public BigDecimal getOverturncover() {
		return this.overturncover;
	}

	public void setOverturncover(BigDecimal overturncover) {
		this.overturncover = overturncover;
	}

	public BigDecimal getOverturningloading() {
		return this.overturningloading;
	}

	public void setOverturningloading(BigDecimal overturningloading) {
		this.overturningloading = overturningloading;
	}

	public BigDecimal getPaownerDriver() {
		return this.paownerDriver;
	}

	public void setPaownerDriver(BigDecimal paownerDriver) {
		this.paownerDriver = paownerDriver;
	}

	public String getPapaiddriver() {
		return this.papaiddriver;
	}

	public void setPapaiddriver(String papaiddriver) {
		this.papaiddriver = papaiddriver;
	}

	public String getPapaiddriverpremium() {
		return this.papaiddriverpremium;
	}

	public void setPapaiddriverpremium(String papaiddriverpremium) {
		this.papaiddriverpremium = papaiddriverpremium;
	}

	public String getParkingtype() {
		return this.parkingtype;
	}

	public void setParkingtype(String parkingtype) {
		this.parkingtype = parkingtype;
	}

	public String getPayerType() {
		return this.payerType;
	}

	public void setPayerType(String payerType) {
		this.payerType = payerType;
	}

	public BigDecimal getPayerid() {
		return this.payerid;
	}

	public void setPayerid(BigDecimal payerid) {
		this.payerid = payerid;
	}

	public String getPayername() {
		return this.payername;
	}

	public void setPayername(String payername) {
		this.payername = payername;
	}

	public Date getPayinslipDate() {
		return this.payinslipDate;
	}

	public void setPayinslipDate(Date payinslipDate) {
		this.payinslipDate = payinslipDate;
	}

	public BigDecimal getPayinslipNo() {
		return this.payinslipNo;
	}

	public void setPayinslipNo(BigDecimal payinslipNo) {
		this.payinslipNo = payinslipNo;
	}

	public BigDecimal getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(BigDecimal paymentId) {
		this.paymentId = paymentId;
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

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentmode() {
		return this.paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public BigDecimal getPincode() {
		return this.pincode;
	}

	public void setPincode(BigDecimal pincode) {
		this.pincode = pincode;
	}

	public BigDecimal getPmtofficecode() {
		return this.pmtofficecode;
	}

	public void setPmtofficecode(BigDecimal pmtofficecode) {
		this.pmtofficecode = pmtofficecode;
	}

	public String getPmtstatus() {
		return this.pmtstatus;
	}

	public void setPmtstatus(String pmtstatus) {
		this.pmtstatus = pmtstatus;
	}

	public Date getPolicyEndDate() {
		return this.policyEndDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Date getPolicyStartDate() {
		return this.policyStartDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyTerm() {
		return this.policyTerm;
	}

	public void setPolicyTerm(String policyTerm) {
		this.policyTerm = policyTerm;
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyno() {
		return this.policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public String getPreviousclaimno() {
		return this.previousclaimno;
	}

	public void setPreviousclaimno(String previousclaimno) {
		this.previousclaimno = previousclaimno;
	}

	public String getPreviousinsureraddress() {
		return this.previousinsureraddress;
	}

	public void setPreviousinsureraddress(String previousinsureraddress) {
		this.previousinsureraddress = previousinsureraddress;
	}

	public String getPreviousinsurername() {
		return this.previousinsurername;
	}

	public void setPreviousinsurername(String previousinsurername) {
		this.previousinsurername = previousinsurername;
	}

	public Date getPreviouspolicyeffectivefrom() {
		return this.previouspolicyeffectivefrom;
	}

	public void setPreviouspolicyeffectivefrom(Date previouspolicyeffectivefrom) {
		this.previouspolicyeffectivefrom = previouspolicyeffectivefrom;
	}

	public Date getPreviouspolicyeffectiveto() {
		return this.previouspolicyeffectiveto;
	}

	public void setPreviouspolicyeffectiveto(Date previouspolicyeffectiveto) {
		this.previouspolicyeffectiveto = previouspolicyeffectiveto;
	}

	public String getPreviouspolicyno() {
		return this.previouspolicyno;
	}

	public void setPreviouspolicyno(String previouspolicyno) {
		this.previouspolicyno = previouspolicyno;
	}

	public BigDecimal getPreviouspolicypremium() {
		return this.previouspolicypremium;
	}

	public void setPreviouspolicypremium(BigDecimal previouspolicypremium) {
		this.previouspolicypremium = previouspolicypremium;
	}

	public String getPreviouspolicytype() {
		return this.previouspolicytype;
	}

	public void setPreviouspolicytype(String previouspolicytype) {
		this.previouspolicytype = previouspolicytype;
	}

	public BigDecimal getPreviouspolicyyear() {
		return this.previouspolicyyear;
	}

	public void setPreviouspolicyyear(BigDecimal previouspolicyyear) {
		this.previouspolicyyear = previouspolicyyear;
	}

	public Date getPreviousvehiclesaledate() {
		return this.previousvehiclesaledate;
	}

	public void setPreviousvehiclesaledate(Date previousvehiclesaledate) {
		this.previousvehiclesaledate = previousvehiclesaledate;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getPromotionCode() {
		return this.promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public BigDecimal getProposalamtSum() {
		return this.proposalamtSum;
	}

	public void setProposalamtSum(BigDecimal proposalamtSum) {
		this.proposalamtSum = proposalamtSum;
	}

	public Date getProposaldate() {
		return this.proposaldate;
	}

	public void setProposaldate(Date proposaldate) {
		this.proposaldate = proposaldate;
	}

	public BigDecimal getProposalnumber() {
		return this.proposalnumber;
	}

	public void setProposalnumber(BigDecimal proposalnumber) {
		this.proposalnumber = proposalnumber;
	}

	public String getProposaltype() {
		return this.proposaltype;
	}

	public void setProposaltype(String proposaltype) {
		this.proposaltype = proposaltype;
	}

	public Date getPurchasedate() {
		return this.purchasedate;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	public Date getReconciledate() {
		return this.reconciledate;
	}

	public void setReconciledate(Date reconciledate) {
		this.reconciledate = reconciledate;
	}

	public Date getRegistrationdate() {
		return this.registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getRegistrationnumber() {
		return this.registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public String getRegistrationzone() {
		return this.registrationzone;
	}

	public void setRegistrationzone(String registrationzone) {
		this.registrationzone = registrationzone;
	}

	public String getRegistrationzonetemp() {
		return this.registrationzonetemp;
	}

	public void setRegistrationzonetemp(String registrationzonetemp) {
		this.registrationzonetemp = registrationzonetemp;
	}

	public String getRenewaldeclaration() {
		return this.renewaldeclaration;
	}

	public void setRenewaldeclaration(String renewaldeclaration) {
		this.renewaldeclaration = renewaldeclaration;
	}

	public String getRetainpremium() {
		return this.retainpremium;
	}

	public void setRetainpremium(String retainpremium) {
		this.retainpremium = retainpremium;
	}

	public String getRtolocation() {
		return this.rtolocation;
	}

	public void setRtolocation(String rtolocation) {
		this.rtolocation = rtolocation;
	}

	public String getRtolocationcode() {
		return this.rtolocationcode;
	}

	public void setRtolocationcode(String rtolocationcode) {
		this.rtolocationcode = rtolocationcode;
	}

	public BigDecimal getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(BigDecimal seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public BigDecimal getServiceTax() {
		return this.serviceTax;
	}

	public void setServiceTax(BigDecimal serviceTax) {
		this.serviceTax = serviceTax;
	}

	public String getServiceTaxExcemption() {
		return this.serviceTaxExcemption;
	}

	public void setServiceTaxExcemption(String serviceTaxExcemption) {
		this.serviceTaxExcemption = serviceTaxExcemption;
	}

	public String getSettlementType() {
		return this.settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatecode() {
		return this.statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getStatetemp() {
		return this.statetemp;
	}

	public void setStatetemp(String statetemp) {
		this.statetemp = statetemp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusdesc() {
		return this.statusdesc;
	}

	public void setStatusdesc(String statusdesc) {
		this.statusdesc = statusdesc;
	}

	public BigDecimal getSubbrokercodeSum() {
		return this.subbrokercodeSum;
	}

	public void setSubbrokercodeSum(BigDecimal subbrokercodeSum) {
		this.subbrokercodeSum = subbrokercodeSum;
	}

	public BigDecimal getTaggedamountSum() {
		return this.taggedamountSum;
	}

	public void setTaggedamountSum(BigDecimal taggedamountSum) {
		this.taggedamountSum = taggedamountSum;
	}

	public Date getTaggeddate() {
		return this.taggeddate;
	}

	public void setTaggeddate(Date taggeddate) {
		this.taggeddate = taggeddate;
	}

	public String getTatamotorsReferenceid() {
		return this.tatamotorsReferenceid;
	}

	public void setTatamotorsReferenceid(String tatamotorsReferenceid) {
		this.tatamotorsReferenceid = tatamotorsReferenceid;
	}

	public String getTelephonenumber1() {
		return this.telephonenumber1;
	}

	public void setTelephonenumber1(String telephonenumber1) {
		this.telephonenumber1 = telephonenumber1;
	}

	public String getTelephonenumber2() {
		return this.telephonenumber2;
	}

	public void setTelephonenumber2(String telephonenumber2) {
		this.telephonenumber2 = telephonenumber2;
	}

	public String getTelephonenumber3() {
		return this.telephonenumber3;
	}

	public void setTelephonenumber3(String telephonenumber3) {
		this.telephonenumber3 = telephonenumber3;
	}

	public String getTelephonenumber4() {
		return this.telephonenumber4;
	}

	public void setTelephonenumber4(String telephonenumber4) {
		this.telephonenumber4 = telephonenumber4;
	}

	public BigDecimal getTmlTmfReferenceNo() {
		return this.tmlTmfReferenceNo;
	}

	public void setTmlTmfReferenceNo(BigDecimal tmlTmfReferenceNo) {
		this.tmlTmfReferenceNo = tmlTmfReferenceNo;
	}

	public BigDecimal getTotalPremium() {
		return this.totalPremium;
	}

	public void setTotalPremium(BigDecimal totalPremium) {
		this.totalPremium = totalPremium;
	}

	public BigDecimal getTotalchequeamount() {
		return this.totalchequeamount;
	}

	public void setTotalchequeamount(BigDecimal totalchequeamount) {
		this.totalchequeamount = totalchequeamount;
	}

	public BigDecimal getTotalsi() {
		return this.totalsi;
	}

	public void setTotalsi(BigDecimal totalsi) {
		this.totalsi = totalsi;
	}

	public BigDecimal getTppddiscount() {
		return this.tppddiscount;
	}

	public void setTppddiscount(BigDecimal tppddiscount) {
		this.tppddiscount = tppddiscount;
	}

	public BigDecimal getTppdlimit() {
		return this.tppdlimit;
	}

	public void setTppdlimit(BigDecimal tppdlimit) {
		this.tppdlimit = tppdlimit;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTransactiondate() {
		return this.transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransferofncb() {
		return this.transferofncb;
	}

	public void setTransferofncb(String transferofncb) {
		this.transferofncb = transferofncb;
	}

	public String getTransferofncb1() {
		return this.transferofncb1;
	}

	public void setTransferofncb1(String transferofncb1) {
		this.transferofncb1 = transferofncb1;
	}

	public String getTxtendorsementno() {
		return this.txtendorsementno;
	}

	public void setTxtendorsementno(String txtendorsementno) {
		this.txtendorsementno = txtendorsementno;
	}

	public String getTypeofcalculation() {
		return this.typeofcalculation;
	}

	public void setTypeofcalculation(String typeofcalculation) {
		this.typeofcalculation = typeofcalculation;
	}

	public String getTypeoffuel() {
		return this.typeoffuel;
	}

	public void setTypeoffuel(String typeoffuel) {
		this.typeoffuel = typeoffuel;
	}

	public BigDecimal getTyreandalloycover() {
		return this.tyreandalloycover;
	}

	public void setTyreandalloycover(BigDecimal tyreandalloycover) {
		this.tyreandalloycover = tyreandalloycover;
	}

	public BigDecimal getUnnamedpacover() {
		return this.unnamedpacover;
	}

	public void setUnnamedpacover(BigDecimal unnamedpacover) {
		this.unnamedpacover = unnamedpacover;
	}

	public BigDecimal getUnnamedpapremium() {
		return this.unnamedpapremium;
	}

	public void setUnnamedpapremium(BigDecimal unnamedpapremium) {
		this.unnamedpapremium = unnamedpapremium;
	}

	public Date getUploaddate() {
		return this.uploaddate;
	}

	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}

	public String getValidateStatus() {
		return this.validateStatus;
	}

	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}

	public String getValueautocoverpremium() {
		return this.valueautocoverpremium;
	}

	public void setValueautocoverpremium(String valueautocoverpremium) {
		this.valueautocoverpremium = valueautocoverpremium;
	}

	public BigDecimal getVehicleBaseValue() {
		return this.vehicleBaseValue;
	}

	public void setVehicleBaseValue(BigDecimal vehicleBaseValue) {
		this.vehicleBaseValue = vehicleBaseValue;
	}

	public String getVehiclecategory() {
		return this.vehiclecategory;
	}

	public void setVehiclecategory(String vehiclecategory) {
		this.vehiclecategory = vehiclecategory;
	}

	public String getVehicleclass() {
		return this.vehicleclass;
	}

	public void setVehicleclass(String vehicleclass) {
		this.vehicleclass = vehicleclass;
	}

	public String getVehicledriven() {
		return this.vehicledriven;
	}

	public void setVehicledriven(String vehicledriven) {
		this.vehicledriven = vehicledriven;
	}

	public String getVehicledrivenby() {
		return this.vehicledrivenby;
	}

	public void setVehicledrivenby(String vehicledrivenby) {
		this.vehicledrivenby = vehicledrivenby;
	}

	public String getVehiclemodel() {
		return this.vehiclemodel;
	}

	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}

	public String getVehiclemodelcode() {
		return this.vehiclemodelcode;
	}

	public void setVehiclemodelcode(String vehiclemodelcode) {
		this.vehiclemodelcode = vehiclemodelcode;
	}

	public String getVehiclemodelcodetemp() {
		return this.vehiclemodelcodetemp;
	}

	public void setVehiclemodelcodetemp(String vehiclemodelcodetemp) {
		this.vehiclemodelcodetemp = vehiclemodelcodetemp;
	}

	public String getVehiclemostlydrivenon() {
		return this.vehiclemostlydrivenon;
	}

	public void setVehiclemostlydrivenon(String vehiclemostlydrivenon) {
		this.vehiclemostlydrivenon = vehiclemostlydrivenon;
	}

	public String getVehiclesubclass() {
		return this.vehiclesubclass;
	}

	public void setVehiclesubclass(String vehiclesubclass) {
		this.vehiclesubclass = vehiclesubclass;
	}

	public String getVehicleuse() {
		return this.vehicleuse;
	}

	public void setVehicleuse(String vehicleuse) {
		this.vehicleuse = vehicleuse;
	}

	public BigDecimal getVoluntarydiscount() {
		return this.voluntarydiscount;
	}

	public void setVoluntarydiscount(BigDecimal voluntarydiscount) {
		this.voluntarydiscount = voluntarydiscount;
	}

	public BigDecimal getVoluntayexcess() {
		return this.voluntayexcess;
	}

	public void setVoluntayexcess(BigDecimal voluntayexcess) {
		this.voluntayexcess = voluntayexcess;
	}

	public String getWindshieldglass() {
		return this.windshieldglass;
	}

	public void setWindshieldglass(String windshieldglass) {
		this.windshieldglass = windshieldglass;
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

	public BigDecimal getYoungestdriverage() {
		return this.youngestdriverage;
	}

	public void setYoungestdriverage(BigDecimal youngestdriverage) {
		this.youngestdriverage = youngestdriverage;
	}

}*/