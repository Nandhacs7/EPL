/*package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


*//**
 * The persistent class for the TTRN_MARUTI_NEWRENEWAL database table.
 * 
 *//*
@Entity
@Table(name="TTRN_MARUTI_NEWRENEWAL")
public class TtrnMarutiNewrenewal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=200)
	private String policyno;

	@Column(length=200)
	private String aamembershipdiscountstatus;

	@Column(length=1)
	private String active;

	@Column(length=200)
	private String antitheftattached;

	@Column(length=200)
	private String bankname;

	@Column(precision=38)
	private BigDecimal batchid;

	@Column(length=200)
	private String branchcode;

	@Column(length=250)
	private String brokercode;

	@Column(length=200)
	private String brokercodetemp;

	@Temporal(TemporalType.DATE)
	private Date cancelleddate;

	@Column(precision=38)
	private BigDecimal carryingcapacityforcommcar;

	@Column(precision=38)
	private BigDecimal carryingcapacityforprivatecar;

	@Column(precision=38)
	private BigDecimal cc;

	@Column(length=200)
	private String chassisno;

	@Column(length=200)
	private String citycode;

	@Column(length=200)
	private String citycodetemp;

	@Column(name="CLAIM_INTIAMTION_ID", precision=38)
	private BigDecimal claimIntiamtionId;

	@Column(name="CLAIM_SETTLED_ID", precision=38)
	private BigDecimal claimSettledId;

	@Column(length=200)
	private String clientcode;

	@Column(precision=14, scale=2)
	private BigDecimal cngdepriciatedvalue;

	@Column(precision=5, scale=2)
	private BigDecimal cngpercentage;

	@Column(length=200)
	private String colortype;

	@Column(length=200)
	private String colortypetemp;

	@Column(length=200)
	private String compacoverforownerdriver;

	@Column(length=200)
	private String companyaddress;

	@Column(length=200)
	private String companyname;

	@Column(precision=38)
	private BigDecimal compulsurydeductibles;

	@Column(length=200)
	private String corpname;

	@Column(length=200)
	private String custname;

	@Column(name="CUSTOMER_ADDRESS", length=500)
	private String customerAddress;

	@Column(length=200)
	private String custtype;

	@Column(length=200)
	private String custtypetemp;

	@Column(name="DEPOSIT_STATUS", length=1)
	private String depositStatus;

	@Column(precision=38)
	private BigDecimal dob;

	@Column(length=200)
	private String eaccper;

	@Column(precision=38)
	private BigDecimal electricaccessoriesvalue;

	@Column(name="EMAIL_ID", length=200)
	private String emailId;

	@Column(name="EMP_RLIABILITY_PREMIUM", precision=38)
	private BigDecimal empRliabilityPremium;

	@Column(name="EMPLOYEE_CODE", length=25)
	private String employeeCode;

	@Column(precision=38)
	private BigDecimal employerliabilitynoofemployees;

	@Column(length=200)
	private String engineno;

	@Column(precision=14, scale=2)
	private BigDecimal engprotectpremium;

	@Column(name="EX_SHOW_ROOM_PRICE", precision=38)
	private BigDecimal exShowRoomPrice;

	@Column(length=200)
	private String fconame;

	@Column(precision=10)
	private BigDecimal fibrefuelprm;

	@Temporal(TemporalType.DATE)
	private Date filegenerateddate;

	@Column(length=3)
	private String filetype;

	@Column(length=200)
	private String financierbranch;

	@Column(length=200)
	private String firstname;

	@Column(length=200)
	private String forcode;

	@Column(length=200)
	private String freeinsurance;

	@Column(length=200)
	private String freescheme;

	@Column(length=200)
	private String fueltype;

	@Column(name="GEO_GRAPHIC_EXTN_PREMIUM", precision=14, scale=2)
	private BigDecimal geoGraphicExtnPremium;

	@Column(length=200)
	private String govtvehicle;

	@Column(length=200)
	private String inceptiontime;

	@Column(precision=38)
	private BigDecimal incrementisi;

	@Column(precision=38)
	private BigDecimal industry;

	@Column(length=200)
	private String industryname;

	@Column(precision=30, scale=2)
	private BigDecimal insantitheftdevicepremium;

	@Column(length=500)
	private String insantitheftdevicepremiumtemp;

	@Column(length=200)
	private String insbangladeshcovered;

	@Column(length=200)
	private String insbhutancovered;

	@Column(length=200)
	private String inscngapplied;

	@Column(precision=38)
	private BigDecimal inscngbifuelkitpremium;

	@Column(precision=14, scale=2)
	private BigDecimal inscngkitvalue;

	@Column(precision=10)
	private BigDecimal inscngpremium;

	@Column(precision=38)
	private BigDecimal inscompanyname;

	@Column(precision=38)
	private BigDecimal inscompulsarypapremium;

	@Column(length=200)
	private String insextraloadingodp;

	@Column(precision=38)
	private BigDecimal insextrapremium;

	@Column(length=200)
	private String insfcocode;

	@Column(length=200)
	private String insmaldivescovered;

	@Column(precision=38)
	private BigDecimal insmuldepositno;

	@Column(length=200)
	private String insncbmalusvalue;

	@Column(length=200)
	private String insnepalcovered;

	@Column(precision=38)
	private BigDecimal insnonelectaccpremium;

	@Column(length=200)
	private String inspakistancovered;

	@Column(length=200)
	private String inspreviouspolicyno;

	@Column(precision=38)
	private BigDecimal insrtocity;

	@Column(length=200)
	private String inssrilankacovered;

	@Column(precision=14, scale=2)
	private BigDecimal instppdextnsumassured;

	@Temporal(TemporalType.DATE)
	private Date insvehicleregndate;

	@Column(precision=38)
	private BigDecimal insyearofmanufacture;

	@Column(length=200)
	private String intermediarycode;

	@Column(length=200)
	private String lastname;

	@Column(length=200)
	private String logbooknumber;

	@Column(length=200)
	private String mannualdepositno;

	@Column(name="MDS_PREMIUM", precision=38)
	private BigDecimal mdsPremium;

	@Column(length=200)
	private String middlename;

	@Column(length=10)
	private String mipolicytype;

	@Column(length=200)
	private String model;

	@Column(name="MOVED_DATE")
	private Timestamp movedDate;

	@Column(precision=14, scale=2)
	private BigDecimal ncbmalus;

	@Column(length=200)
	private String ncbmalusflag;

	@Column(length=500)
	private String ncbmalustemp;

	@Column(precision=38)
	private BigDecimal netodpremium;

	@Column(precision=38)
	private BigDecimal nettppremium;

	@Column(length=200)
	private String nomineeage;

	@Column(length=200)
	private String nomineeappointeename;

	@Column(length=200)
	private String nomineename;

	@Column(length=250)
	private String nomineerelation;

	@Column(length=250)
	private String nomineereltoappointee;

	@Column(precision=14, scale=2)
	private BigDecimal nonelectricaccvalue;

	@Column(precision=38)
	private BigDecimal occupation;

	@Column(name="OTHER_RLIABILITY_PREMIUM", length=10)
	private String otherRliabilityPremium;

	@Column(length=200)
	private String panoofperson;

	@Column(precision=14, scale=2)
	private BigDecimal papremium;

	@Column(precision=14, scale=2)
	private BigDecimal pasuminsuredperperson;

	@Column(name="PAYMENT_RECONCILE_ID", precision=38)
	private BigDecimal paymentReconcileId;

	@Column(name="PAYMENT_RECONCILE_STATUS", length=1)
	private String paymentReconcileStatus;

	@Column(length=200)
	private String pincode;

	@Column(name="POLICY_STATUS", length=1)
	private String policyStatus;

	@Column(length=200)
	private String policycancellationemarks;

	@Column(length=2)
	private String policycancellationstatus;

	@Column(length=200)
	private String policycancelledby;

	@Temporal(TemporalType.DATE)
	private Date policycreateddate;

	@Temporal(TemporalType.DATE)
	private Date policyissuedate;

	@Column(length=200)
	private String policyissuetime;

	@Column(length=200)
	private String policyissuingoutletcode;

	@Column(length=200)
	private String policyissuingoutletcodetemp;

	@Temporal(TemporalType.DATE)
	private Date policyriskexpirydate;

	@Temporal(TemporalType.DATE)
	private Date policyriskinceptiondate;

	@Column(precision=38)
	private BigDecimal policytrxnno;

	@Column(name="\"PREFIX\"", length=200)
	private String prefix;

	@Column(precision=38)
	private BigDecimal premium;

	@Temporal(TemporalType.DATE)
	private Date premiumcollectiondate;

	@Column(length=200)
	private String premiumcollectionno;

	@Column(name="PREV_POL_ISSUE_OUTLETCODE", precision=38)
	private BigDecimal prevPolIssueOutletcode;

	@Temporal(TemporalType.DATE)
	@Column(name="PREVIOUS_POLICY_END_DATE")
	private Date previousPolicyEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PREVIOUS_POLICY_START_DATE")
	private Date previousPolicyStartDate;

	@Column(precision=38)
	private BigDecimal previouspolicycompanycode;

	@Column(length=200)
	private String previouspolicyofficecode;

	@Column(precision=4)
	private BigDecimal prevpolicyyear;

	@Column(length=200)
	private String proposaltype;

	@Column(name="PV_SP_MODEL_CODE", length=200)
	private String pvSpModelCode;

	@Column(name="PV_SP_MODEL_CODETEMP", length=200)
	private String pvSpModelCodetemp;

	@Temporal(TemporalType.DATE)
	@Column(name="RECONCILATION_DATE")
	private Date reconcilationDate;

	@Column(precision=38)
	private BigDecimal reconciledinstrumentamt;

	@Column(length=200)
	private String reconciledinstrumentbank;

	@Column(length=200)
	private String reconciledinstrumentbanktemp;

	@Column(length=200)
	private String reconciledinstrumentbranch;

	@Temporal(TemporalType.DATE)
	private Date reconciledinstrumentdate;

	@Column(length=200)
	private String reconciledinstrumentissueby;

	@Column(length=200)
	private String reconciledinstrumentno;

	@Column(precision=38)
	private BigDecimal reconciledinstrumenttypecode;

	@Column(length=200)
	private String recordtype;

	@Column(length=200)
	private String regno;

	@Column(precision=14, scale=2)
	private BigDecimal rtipremium;

	@Column(name="RTO_ADDRESS", length=200)
	private String rtoAddress;

	@Column(precision=38)
	private BigDecimal rtostate;

	@Column(name="SERVICE_TAX_AMOUNT", precision=38)
	private BigDecimal serviceTaxAmount;

	@Column(name="SETTLEMENT_TYPE", length=200)
	private String settlementType;

	@Column(length=200)
	private String sex;

	@Column(precision=38)
	private BigDecimal sivpcprm;

	@Column(length=200)
	private String statecode;

	@Column(length=200)
	private String statecodetemp;

	@Column(name="SUB_BATCH", precision=22)
	private BigDecimal subBatch;

	@Column(precision=38)
	private BigDecimal totalpremium;

	@Column(precision=38)
	private BigDecimal tppddisc;

	@Column(length=200)
	private String usagecode;

	@Column(length=200)
	private String usedforcommpurpose;

	@Column(length=1)
	private String userfordrivingtution;

	@Column(name="VALIDATE_STATUS", length=200)
	private String validateStatus;

	@Column(length=200)
	private String variant;

	@Column(length=200)
	private String vehicleclass;

	@Column(length=200)
	private String vehicleregnno1;

	@Column(length=200)
	private String vehicleregnno2;

	@Column(length=200)
	private String vehicleregnno3;

	@Column(length=200)
	private String vehicleregnno4;

	@Temporal(TemporalType.DATE)
	private Date vehiclesaledate;

	@Column(name="VIN_NUMBER", length=200)
	private String vinNumber;

	@Column(name="VOLUNTARY_EXCESS_PREMIUM", precision=14, scale=2)
	private BigDecimal voluntaryExcessPremium;

	@Column(precision=14, scale=2)
	private BigDecimal voluntaryexcesslimit;

	@Column(precision=38)
	private BigDecimal vpcaad;

	@Column(precision=38)
	private BigDecimal vpceas;

	@Column(precision=38)
	private BigDecimal vpclld;

	@Column(precision=38)
	private BigDecimal vpcphd;

	@Column(precision=38, scale=2)
	private BigDecimal vpcprm;

	@Column(precision=38)
	private BigDecimal vpctpl;

	@Column(length=1)
	private String whetherhandicapped;

	@Column(name="XBROKER_CODE", length=200)
	private String xbrokerCode;

	@Column(name="XGEN_DOWNLOAD_TRANID", precision=38)
	private BigDecimal xgenDownloadTranId;

	@Column(name="XGEN_DOWNLOAD_STATUS", length=1)
	private String xgenDownloadStatus;

	@Column(name="XGEN_DOWNLOAD_ID", precision=38)
	private BigDecimal xgenDownloadid;

	public BigDecimal getXgenDownloadTranId() {
		return xgenDownloadTranId;
	}

	public void setXgenDownloadTranId(BigDecimal xgenDownloadTranId) {
		this.xgenDownloadTranId = xgenDownloadTranId;
	}

	public void setXgenDownloadid(BigDecimal xgenDownloadid) {
		this.xgenDownloadid = xgenDownloadid;
	}

	@Column(name="XGEN_ENDORSEMENT_NO", length=200)
	private String xgenEndorsementNo;

	@Column(name="XGEN_MOVED_DATE")
	private Timestamp xgenMovedDate;

	@Column(name="XGEN_MOVED_STATUS", length=1)
	private String xgenMovedStatus;

	@Column(name="XGEN_POLICY_NUMBER", length=200)
	private String xgenPolicyNumber;

	@Column(name="XGEN_PRODUCT_CODE", length=200)
	private String xgenProductCode;

	@Column(name="XGEN_PRODUCT_ID", precision=38)
	private BigDecimal xgenProductId;

	@Column(name="XGEN_RECEIPT_DATE")
	private Timestamp xgenReceiptDate;

	@Column(name="XGEN_RECEIPT_NUMBER", length=200)
	private String xgenReceiptNumber;

	@Column(name="ZERO_DEP_LOADING", precision=22)
	private BigDecimal zeroDepLoading;

	@Column(name="ZERO_DEP_PRM", precision=22)
	private BigDecimal zeroDepPrm;

	@Column(name="\"ZONE\"", length=200)
	private String zone;

	@Column(length=200)
	private String zonetemp;

	public TtrnMarutiNewrenewal() {
	}

	public String getPolicyno() {
		return this.policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public String getAamembershipdiscountstatus() {
		return this.aamembershipdiscountstatus;
	}

	public void setAamembershipdiscountstatus(String aamembershipdiscountstatus) {
		this.aamembershipdiscountstatus = aamembershipdiscountstatus;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getAntitheftattached() {
		return this.antitheftattached;
	}

	public void setAntitheftattached(String antitheftattached) {
		this.antitheftattached = antitheftattached;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public BigDecimal getBatchid() {
		return this.batchid;
	}

	public void setBatchid(BigDecimal batchid) {
		this.batchid = batchid;
	}

	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getBrokercode() {
		return this.brokercode;
	}

	public void setBrokercode(String brokercode) {
		this.brokercode = brokercode;
	}

	public String getBrokercodetemp() {
		return this.brokercodetemp;
	}

	public void setBrokercodetemp(String brokercodetemp) {
		this.brokercodetemp = brokercodetemp;
	}

	public Date getCancelleddate() {
		return this.cancelleddate;
	}

	public void setCancelleddate(Date cancelleddate) {
		this.cancelleddate = cancelleddate;
	}

	public BigDecimal getCarryingcapacityforcommcar() {
		return this.carryingcapacityforcommcar;
	}

	public void setCarryingcapacityforcommcar(BigDecimal carryingcapacityforcommcar) {
		this.carryingcapacityforcommcar = carryingcapacityforcommcar;
	}

	public BigDecimal getCarryingcapacityforprivatecar() {
		return this.carryingcapacityforprivatecar;
	}

	public void setCarryingcapacityforprivatecar(BigDecimal carryingcapacityforprivatecar) {
		this.carryingcapacityforprivatecar = carryingcapacityforprivatecar;
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

	public BigDecimal getCngdepriciatedvalue() {
		return this.cngdepriciatedvalue;
	}

	public void setCngdepriciatedvalue(BigDecimal cngdepriciatedvalue) {
		this.cngdepriciatedvalue = cngdepriciatedvalue;
	}

	public BigDecimal getCngpercentage() {
		return this.cngpercentage;
	}

	public void setCngpercentage(BigDecimal cngpercentage) {
		this.cngpercentage = cngpercentage;
	}

	public String getColortype() {
		return this.colortype;
	}

	public void setColortype(String colortype) {
		this.colortype = colortype;
	}

	public String getColortypetemp() {
		return this.colortypetemp;
	}

	public void setColortypetemp(String colortypetemp) {
		this.colortypetemp = colortypetemp;
	}

	public String getCompacoverforownerdriver() {
		return this.compacoverforownerdriver;
	}

	public void setCompacoverforownerdriver(String compacoverforownerdriver) {
		this.compacoverforownerdriver = compacoverforownerdriver;
	}

	public String getCompanyaddress() {
		return this.companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public BigDecimal getCompulsurydeductibles() {
		return this.compulsurydeductibles;
	}

	public void setCompulsurydeductibles(BigDecimal compulsurydeductibles) {
		this.compulsurydeductibles = compulsurydeductibles;
	}

	public String getCorpname() {
		return this.corpname;
	}

	public void setCorpname(String corpname) {
		this.corpname = corpname;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCusttype() {
		return this.custtype;
	}

	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}

	public String getCusttypetemp() {
		return this.custtypetemp;
	}

	public void setCusttypetemp(String custtypetemp) {
		this.custtypetemp = custtypetemp;
	}

	public String getDepositStatus() {
		return this.depositStatus;
	}

	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}

	public BigDecimal getDob() {
		return this.dob;
	}

	public void setDob(BigDecimal dob) {
		this.dob = dob;
	}

	public String getEaccper() {
		return this.eaccper;
	}

	public void setEaccper(String eaccper) {
		this.eaccper = eaccper;
	}

	public BigDecimal getElectricaccessoriesvalue() {
		return this.electricaccessoriesvalue;
	}

	public void setElectricaccessoriesvalue(BigDecimal electricaccessoriesvalue) {
		this.electricaccessoriesvalue = electricaccessoriesvalue;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigDecimal getEmpRliabilityPremium() {
		return this.empRliabilityPremium;
	}

	public void setEmpRliabilityPremium(BigDecimal empRliabilityPremium) {
		this.empRliabilityPremium = empRliabilityPremium;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public BigDecimal getEmployerliabilitynoofemployees() {
		return this.employerliabilitynoofemployees;
	}

	public void setEmployerliabilitynoofemployees(BigDecimal employerliabilitynoofemployees) {
		this.employerliabilitynoofemployees = employerliabilitynoofemployees;
	}

	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	public BigDecimal getEngprotectpremium() {
		return this.engprotectpremium;
	}

	public void setEngprotectpremium(BigDecimal engprotectpremium) {
		this.engprotectpremium = engprotectpremium;
	}

	public BigDecimal getExShowRoomPrice() {
		return this.exShowRoomPrice;
	}

	public void setExShowRoomPrice(BigDecimal exShowRoomPrice) {
		this.exShowRoomPrice = exShowRoomPrice;
	}

	public String getFconame() {
		return this.fconame;
	}

	public void setFconame(String fconame) {
		this.fconame = fconame;
	}

	public BigDecimal getFibrefuelprm() {
		return this.fibrefuelprm;
	}

	public void setFibrefuelprm(BigDecimal fibrefuelprm) {
		this.fibrefuelprm = fibrefuelprm;
	}

	public Date getFilegenerateddate() {
		return this.filegenerateddate;
	}

	public void setFilegenerateddate(Date filegenerateddate) {
		this.filegenerateddate = filegenerateddate;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getFinancierbranch() {
		return this.financierbranch;
	}

	public void setFinancierbranch(String financierbranch) {
		this.financierbranch = financierbranch;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getForcode() {
		return this.forcode;
	}

	public void setForcode(String forcode) {
		this.forcode = forcode;
	}

	public String getFreeinsurance() {
		return this.freeinsurance;
	}

	public void setFreeinsurance(String freeinsurance) {
		this.freeinsurance = freeinsurance;
	}

	public String getFreescheme() {
		return this.freescheme;
	}

	public void setFreescheme(String freescheme) {
		this.freescheme = freescheme;
	}

	public String getFueltype() {
		return this.fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public BigDecimal getGeoGraphicExtnPremium() {
		return this.geoGraphicExtnPremium;
	}

	public void setGeoGraphicExtnPremium(BigDecimal geoGraphicExtnPremium) {
		this.geoGraphicExtnPremium = geoGraphicExtnPremium;
	}

	public String getGovtvehicle() {
		return this.govtvehicle;
	}

	public void setGovtvehicle(String govtvehicle) {
		this.govtvehicle = govtvehicle;
	}

	public String getInceptiontime() {
		return this.inceptiontime;
	}

	public void setInceptiontime(String inceptiontime) {
		this.inceptiontime = inceptiontime;
	}

	public BigDecimal getIncrementisi() {
		return this.incrementisi;
	}

	public void setIncrementisi(BigDecimal incrementisi) {
		this.incrementisi = incrementisi;
	}

	public BigDecimal getIndustry() {
		return this.industry;
	}

	public void setIndustry(BigDecimal industry) {
		this.industry = industry;
	}

	public String getIndustryname() {
		return this.industryname;
	}

	public void setIndustryname(String industryname) {
		this.industryname = industryname;
	}

	public BigDecimal getInsantitheftdevicepremium() {
		return this.insantitheftdevicepremium;
	}

	public void setInsantitheftdevicepremium(BigDecimal insantitheftdevicepremium) {
		this.insantitheftdevicepremium = insantitheftdevicepremium;
	}

	public String getInsantitheftdevicepremiumtemp() {
		return this.insantitheftdevicepremiumtemp;
	}

	public void setInsantitheftdevicepremiumtemp(String insantitheftdevicepremiumtemp) {
		this.insantitheftdevicepremiumtemp = insantitheftdevicepremiumtemp;
	}

	public String getInsbangladeshcovered() {
		return this.insbangladeshcovered;
	}

	public void setInsbangladeshcovered(String insbangladeshcovered) {
		this.insbangladeshcovered = insbangladeshcovered;
	}

	public String getInsbhutancovered() {
		return this.insbhutancovered;
	}

	public void setInsbhutancovered(String insbhutancovered) {
		this.insbhutancovered = insbhutancovered;
	}

	public String getInscngapplied() {
		return this.inscngapplied;
	}

	public void setInscngapplied(String inscngapplied) {
		this.inscngapplied = inscngapplied;
	}

	public BigDecimal getInscngbifuelkitpremium() {
		return this.inscngbifuelkitpremium;
	}

	public void setInscngbifuelkitpremium(BigDecimal inscngbifuelkitpremium) {
		this.inscngbifuelkitpremium = inscngbifuelkitpremium;
	}

	public BigDecimal getInscngkitvalue() {
		return this.inscngkitvalue;
	}

	public void setInscngkitvalue(BigDecimal inscngkitvalue) {
		this.inscngkitvalue = inscngkitvalue;
	}

	public BigDecimal getInscngpremium() {
		return this.inscngpremium;
	}

	public void setInscngpremium(BigDecimal inscngpremium) {
		this.inscngpremium = inscngpremium;
	}

	public BigDecimal getInscompanyname() {
		return this.inscompanyname;
	}

	public void setInscompanyname(BigDecimal inscompanyname) {
		this.inscompanyname = inscompanyname;
	}

	public BigDecimal getInscompulsarypapremium() {
		return this.inscompulsarypapremium;
	}

	public void setInscompulsarypapremium(BigDecimal inscompulsarypapremium) {
		this.inscompulsarypapremium = inscompulsarypapremium;
	}

	public String getInsextraloadingodp() {
		return this.insextraloadingodp;
	}

	public void setInsextraloadingodp(String insextraloadingodp) {
		this.insextraloadingodp = insextraloadingodp;
	}

	public BigDecimal getInsextrapremium() {
		return this.insextrapremium;
	}

	public void setInsextrapremium(BigDecimal insextrapremium) {
		this.insextrapremium = insextrapremium;
	}

	public String getInsfcocode() {
		return this.insfcocode;
	}

	public void setInsfcocode(String insfcocode) {
		this.insfcocode = insfcocode;
	}

	public String getInsmaldivescovered() {
		return this.insmaldivescovered;
	}

	public void setInsmaldivescovered(String insmaldivescovered) {
		this.insmaldivescovered = insmaldivescovered;
	}

	public BigDecimal getInsmuldepositno() {
		return this.insmuldepositno;
	}

	public void setInsmuldepositno(BigDecimal insmuldepositno) {
		this.insmuldepositno = insmuldepositno;
	}

	public String getInsncbmalusvalue() {
		return this.insncbmalusvalue;
	}

	public void setInsncbmalusvalue(String insncbmalusvalue) {
		this.insncbmalusvalue = insncbmalusvalue;
	}

	public String getInsnepalcovered() {
		return this.insnepalcovered;
	}

	public void setInsnepalcovered(String insnepalcovered) {
		this.insnepalcovered = insnepalcovered;
	}

	public BigDecimal getInsnonelectaccpremium() {
		return this.insnonelectaccpremium;
	}

	public void setInsnonelectaccpremium(BigDecimal insnonelectaccpremium) {
		this.insnonelectaccpremium = insnonelectaccpremium;
	}

	public String getInspakistancovered() {
		return this.inspakistancovered;
	}

	public void setInspakistancovered(String inspakistancovered) {
		this.inspakistancovered = inspakistancovered;
	}

	public String getInspreviouspolicyno() {
		return this.inspreviouspolicyno;
	}

	public void setInspreviouspolicyno(String inspreviouspolicyno) {
		this.inspreviouspolicyno = inspreviouspolicyno;
	}

	public BigDecimal getInsrtocity() {
		return this.insrtocity;
	}

	public void setInsrtocity(BigDecimal insrtocity) {
		this.insrtocity = insrtocity;
	}

	public String getInssrilankacovered() {
		return this.inssrilankacovered;
	}

	public void setInssrilankacovered(String inssrilankacovered) {
		this.inssrilankacovered = inssrilankacovered;
	}

	public BigDecimal getInstppdextnsumassured() {
		return this.instppdextnsumassured;
	}

	public void setInstppdextnsumassured(BigDecimal instppdextnsumassured) {
		this.instppdextnsumassured = instppdextnsumassured;
	}

	public Date getInsvehicleregndate() {
		return this.insvehicleregndate;
	}

	public void setInsvehicleregndate(Date insvehicleregndate) {
		this.insvehicleregndate = insvehicleregndate;
	}

	public BigDecimal getInsyearofmanufacture() {
		return this.insyearofmanufacture;
	}

	public void setInsyearofmanufacture(BigDecimal insyearofmanufacture) {
		this.insyearofmanufacture = insyearofmanufacture;
	}

	public String getIntermediarycode() {
		return this.intermediarycode;
	}

	public void setIntermediarycode(String intermediarycode) {
		this.intermediarycode = intermediarycode;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLogbooknumber() {
		return this.logbooknumber;
	}

	public void setLogbooknumber(String logbooknumber) {
		this.logbooknumber = logbooknumber;
	}

	public String getMannualdepositno() {
		return this.mannualdepositno;
	}

	public void setMannualdepositno(String mannualdepositno) {
		this.mannualdepositno = mannualdepositno;
	}

	public BigDecimal getMdsPremium() {
		return this.mdsPremium;
	}

	public void setMdsPremium(BigDecimal mdsPremium) {
		this.mdsPremium = mdsPremium;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMipolicytype() {
		return this.mipolicytype;
	}

	public void setMipolicytype(String mipolicytype) {
		this.mipolicytype = mipolicytype;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Timestamp getMovedDate() {
		return this.movedDate;
	}

	public void setMovedDate(Timestamp movedDate) {
		this.movedDate = movedDate;
	}

	public BigDecimal getNcbmalus() {
		return this.ncbmalus;
	}

	public void setNcbmalus(BigDecimal ncbmalus) {
		this.ncbmalus = ncbmalus;
	}

	public String getNcbmalusflag() {
		return this.ncbmalusflag;
	}

	public void setNcbmalusflag(String ncbmalusflag) {
		this.ncbmalusflag = ncbmalusflag;
	}

	public String getNcbmalustemp() {
		return this.ncbmalustemp;
	}

	public void setNcbmalustemp(String ncbmalustemp) {
		this.ncbmalustemp = ncbmalustemp;
	}

	public BigDecimal getNetodpremium() {
		return this.netodpremium;
	}

	public void setNetodpremium(BigDecimal netodpremium) {
		this.netodpremium = netodpremium;
	}

	public BigDecimal getNettppremium() {
		return this.nettppremium;
	}

	public void setNettppremium(BigDecimal nettppremium) {
		this.nettppremium = nettppremium;
	}

	public String getNomineeage() {
		return this.nomineeage;
	}

	public void setNomineeage(String nomineeage) {
		this.nomineeage = nomineeage;
	}

	public String getNomineeappointeename() {
		return this.nomineeappointeename;
	}

	public void setNomineeappointeename(String nomineeappointeename) {
		this.nomineeappointeename = nomineeappointeename;
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

	public String getNomineereltoappointee() {
		return this.nomineereltoappointee;
	}

	public void setNomineereltoappointee(String nomineereltoappointee) {
		this.nomineereltoappointee = nomineereltoappointee;
	}

	public BigDecimal getNonelectricaccvalue() {
		return this.nonelectricaccvalue;
	}

	public void setNonelectricaccvalue(BigDecimal nonelectricaccvalue) {
		this.nonelectricaccvalue = nonelectricaccvalue;
	}

	public BigDecimal getOccupation() {
		return this.occupation;
	}

	public void setOccupation(BigDecimal occupation) {
		this.occupation = occupation;
	}

	public String getOtherRliabilityPremium() {
		return this.otherRliabilityPremium;
	}

	public void setOtherRliabilityPremium(String otherRliabilityPremium) {
		this.otherRliabilityPremium = otherRliabilityPremium;
	}

	public String getPanoofperson() {
		return this.panoofperson;
	}

	public void setPanoofperson(String panoofperson) {
		this.panoofperson = panoofperson;
	}

	public BigDecimal getPapremium() {
		return this.papremium;
	}

	public void setPapremium(BigDecimal papremium) {
		this.papremium = papremium;
	}

	public BigDecimal getPasuminsuredperperson() {
		return this.pasuminsuredperperson;
	}

	public void setPasuminsuredperperson(BigDecimal pasuminsuredperperson) {
		this.pasuminsuredperperson = pasuminsuredperperson;
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

	public String getPolicycancellationemarks() {
		return this.policycancellationemarks;
	}

	public void setPolicycancellationemarks(String policycancellationemarks) {
		this.policycancellationemarks = policycancellationemarks;
	}

	public String getPolicycancellationstatus() {
		return this.policycancellationstatus;
	}

	public void setPolicycancellationstatus(String policycancellationstatus) {
		this.policycancellationstatus = policycancellationstatus;
	}

	public String getPolicycancelledby() {
		return this.policycancelledby;
	}

	public void setPolicycancelledby(String policycancelledby) {
		this.policycancelledby = policycancelledby;
	}

	public Date getPolicycreateddate() {
		return this.policycreateddate;
	}

	public void setPolicycreateddate(Date policycreateddate) {
		this.policycreateddate = policycreateddate;
	}

	public Date getPolicyissuedate() {
		return this.policyissuedate;
	}

	public void setPolicyissuedate(Date policyissuedate) {
		this.policyissuedate = policyissuedate;
	}

	public String getPolicyissuetime() {
		return this.policyissuetime;
	}

	public void setPolicyissuetime(String policyissuetime) {
		this.policyissuetime = policyissuetime;
	}

	public String getPolicyissuingoutletcode() {
		return this.policyissuingoutletcode;
	}

	public void setPolicyissuingoutletcode(String policyissuingoutletcode) {
		this.policyissuingoutletcode = policyissuingoutletcode;
	}

	public String getPolicyissuingoutletcodetemp() {
		return this.policyissuingoutletcodetemp;
	}

	public void setPolicyissuingoutletcodetemp(String policyissuingoutletcodetemp) {
		this.policyissuingoutletcodetemp = policyissuingoutletcodetemp;
	}

	public Date getPolicyriskexpirydate() {
		return this.policyriskexpirydate;
	}

	public void setPolicyriskexpirydate(Date policyriskexpirydate) {
		this.policyriskexpirydate = policyriskexpirydate;
	}

	public Date getPolicyriskinceptiondate() {
		return this.policyriskinceptiondate;
	}

	public void setPolicyriskinceptiondate(Date policyriskinceptiondate) {
		this.policyriskinceptiondate = policyriskinceptiondate;
	}

	public BigDecimal getPolicytrxnno() {
		return this.policytrxnno;
	}

	public void setPolicytrxnno(BigDecimal policytrxnno) {
		this.policytrxnno = policytrxnno;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public BigDecimal getPremium() {
		return this.premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	public Date getPremiumcollectiondate() {
		return this.premiumcollectiondate;
	}

	public void setPremiumcollectiondate(Date premiumcollectiondate) {
		this.premiumcollectiondate = premiumcollectiondate;
	}

	public String getPremiumcollectionno() {
		return this.premiumcollectionno;
	}

	public void setPremiumcollectionno(String premiumcollectionno) {
		this.premiumcollectionno = premiumcollectionno;
	}

	public BigDecimal getPrevPolIssueOutletcode() {
		return this.prevPolIssueOutletcode;
	}

	public void setPrevPolIssueOutletcode(BigDecimal prevPolIssueOutletcode) {
		this.prevPolIssueOutletcode = prevPolIssueOutletcode;
	}

	public Date getPreviousPolicyEndDate() {
		return this.previousPolicyEndDate;
	}

	public void setPreviousPolicyEndDate(Date previousPolicyEndDate) {
		this.previousPolicyEndDate = previousPolicyEndDate;
	}

	public Date getPreviousPolicyStartDate() {
		return this.previousPolicyStartDate;
	}

	public void setPreviousPolicyStartDate(Date previousPolicyStartDate) {
		this.previousPolicyStartDate = previousPolicyStartDate;
	}

	public BigDecimal getPreviouspolicycompanycode() {
		return this.previouspolicycompanycode;
	}

	public void setPreviouspolicycompanycode(BigDecimal previouspolicycompanycode) {
		this.previouspolicycompanycode = previouspolicycompanycode;
	}

	public String getPreviouspolicyofficecode() {
		return this.previouspolicyofficecode;
	}

	public void setPreviouspolicyofficecode(String previouspolicyofficecode) {
		this.previouspolicyofficecode = previouspolicyofficecode;
	}

	public BigDecimal getPrevpolicyyear() {
		return this.prevpolicyyear;
	}

	public void setPrevpolicyyear(BigDecimal prevpolicyyear) {
		this.prevpolicyyear = prevpolicyyear;
	}

	public String getProposaltype() {
		return this.proposaltype;
	}

	public void setProposaltype(String proposaltype) {
		this.proposaltype = proposaltype;
	}

	public String getPvSpModelCode() {
		return this.pvSpModelCode;
	}

	public void setPvSpModelCode(String pvSpModelCode) {
		this.pvSpModelCode = pvSpModelCode;
	}

	public String getPvSpModelCodetemp() {
		return this.pvSpModelCodetemp;
	}

	public void setPvSpModelCodetemp(String pvSpModelCodetemp) {
		this.pvSpModelCodetemp = pvSpModelCodetemp;
	}

	public Date getReconcilationDate() {
		return this.reconcilationDate;
	}

	public void setReconcilationDate(Date reconcilationDate) {
		this.reconcilationDate = reconcilationDate;
	}

	public BigDecimal getReconciledinstrumentamt() {
		return this.reconciledinstrumentamt;
	}

	public void setReconciledinstrumentamt(BigDecimal reconciledinstrumentamt) {
		this.reconciledinstrumentamt = reconciledinstrumentamt;
	}

	public String getReconciledinstrumentbank() {
		return this.reconciledinstrumentbank;
	}

	public void setReconciledinstrumentbank(String reconciledinstrumentbank) {
		this.reconciledinstrumentbank = reconciledinstrumentbank;
	}

	public String getReconciledinstrumentbanktemp() {
		return this.reconciledinstrumentbanktemp;
	}

	public void setReconciledinstrumentbanktemp(String reconciledinstrumentbanktemp) {
		this.reconciledinstrumentbanktemp = reconciledinstrumentbanktemp;
	}

	public String getReconciledinstrumentbranch() {
		return this.reconciledinstrumentbranch;
	}

	public void setReconciledinstrumentbranch(String reconciledinstrumentbranch) {
		this.reconciledinstrumentbranch = reconciledinstrumentbranch;
	}

	public Date getReconciledinstrumentdate() {
		return this.reconciledinstrumentdate;
	}

	public void setReconciledinstrumentdate(Date reconciledinstrumentdate) {
		this.reconciledinstrumentdate = reconciledinstrumentdate;
	}

	public String getReconciledinstrumentissueby() {
		return this.reconciledinstrumentissueby;
	}

	public void setReconciledinstrumentissueby(String reconciledinstrumentissueby) {
		this.reconciledinstrumentissueby = reconciledinstrumentissueby;
	}

	public String getReconciledinstrumentno() {
		return this.reconciledinstrumentno;
	}

	public void setReconciledinstrumentno(String reconciledinstrumentno) {
		this.reconciledinstrumentno = reconciledinstrumentno;
	}

	public BigDecimal getReconciledinstrumenttypecode() {
		return this.reconciledinstrumenttypecode;
	}

	public void setReconciledinstrumenttypecode(BigDecimal reconciledinstrumenttypecode) {
		this.reconciledinstrumenttypecode = reconciledinstrumenttypecode;
	}

	public String getRecordtype() {
		return this.recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	public String getRegno() {
		return this.regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public BigDecimal getRtipremium() {
		return this.rtipremium;
	}

	public void setRtipremium(BigDecimal rtipremium) {
		this.rtipremium = rtipremium;
	}

	public String getRtoAddress() {
		return this.rtoAddress;
	}

	public void setRtoAddress(String rtoAddress) {
		this.rtoAddress = rtoAddress;
	}

	public BigDecimal getRtostate() {
		return this.rtostate;
	}

	public void setRtostate(BigDecimal rtostate) {
		this.rtostate = rtostate;
	}

	public BigDecimal getServiceTaxAmount() {
		return this.serviceTaxAmount;
	}

	public void setServiceTaxAmount(BigDecimal serviceTaxAmount) {
		this.serviceTaxAmount = serviceTaxAmount;
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

	public BigDecimal getSivpcprm() {
		return this.sivpcprm;
	}

	public void setSivpcprm(BigDecimal sivpcprm) {
		this.sivpcprm = sivpcprm;
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

	public BigDecimal getSubBatch() {
		return this.subBatch;
	}

	public void setSubBatch(BigDecimal subBatch) {
		this.subBatch = subBatch;
	}

	public BigDecimal getTotalpremium() {
		return this.totalpremium;
	}

	public void setTotalpremium(BigDecimal totalpremium) {
		this.totalpremium = totalpremium;
	}

	public BigDecimal getTppddisc() {
		return this.tppddisc;
	}

	public void setTppddisc(BigDecimal tppddisc) {
		this.tppddisc = tppddisc;
	}

	public String getUsagecode() {
		return this.usagecode;
	}

	public void setUsagecode(String usagecode) {
		this.usagecode = usagecode;
	}

	public String getUsedforcommpurpose() {
		return this.usedforcommpurpose;
	}

	public void setUsedforcommpurpose(String usedforcommpurpose) {
		this.usedforcommpurpose = usedforcommpurpose;
	}

	public String getUserfordrivingtution() {
		return this.userfordrivingtution;
	}

	public void setUserfordrivingtution(String userfordrivingtution) {
		this.userfordrivingtution = userfordrivingtution;
	}

	public String getValidateStatus() {
		return this.validateStatus;
	}

	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}

	public String getVariant() {
		return this.variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getVehicleclass() {
		return this.vehicleclass;
	}

	public void setVehicleclass(String vehicleclass) {
		this.vehicleclass = vehicleclass;
	}

	public String getVehicleregnno1() {
		return this.vehicleregnno1;
	}

	public void setVehicleregnno1(String vehicleregnno1) {
		this.vehicleregnno1 = vehicleregnno1;
	}

	public String getVehicleregnno2() {
		return this.vehicleregnno2;
	}

	public void setVehicleregnno2(String vehicleregnno2) {
		this.vehicleregnno2 = vehicleregnno2;
	}

	public String getVehicleregnno3() {
		return this.vehicleregnno3;
	}

	public void setVehicleregnno3(String vehicleregnno3) {
		this.vehicleregnno3 = vehicleregnno3;
	}

	public String getVehicleregnno4() {
		return this.vehicleregnno4;
	}

	public void setVehicleregnno4(String vehicleregnno4) {
		this.vehicleregnno4 = vehicleregnno4;
	}

	public Date getVehiclesaledate() {
		return this.vehiclesaledate;
	}

	public void setVehiclesaledate(Date vehiclesaledate) {
		this.vehiclesaledate = vehiclesaledate;
	}

	public String getVinNumber() {
		return this.vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public BigDecimal getVoluntaryExcessPremium() {
		return this.voluntaryExcessPremium;
	}

	public void setVoluntaryExcessPremium(BigDecimal voluntaryExcessPremium) {
		this.voluntaryExcessPremium = voluntaryExcessPremium;
	}

	public BigDecimal getVoluntaryexcesslimit() {
		return this.voluntaryexcesslimit;
	}

	public void setVoluntaryexcesslimit(BigDecimal voluntaryexcesslimit) {
		this.voluntaryexcesslimit = voluntaryexcesslimit;
	}

	public BigDecimal getVpcaad() {
		return this.vpcaad;
	}

	public void setVpcaad(BigDecimal vpcaad) {
		this.vpcaad = vpcaad;
	}

	public BigDecimal getVpceas() {
		return this.vpceas;
	}

	public void setVpceas(BigDecimal vpceas) {
		this.vpceas = vpceas;
	}

	public BigDecimal getVpclld() {
		return this.vpclld;
	}

	public void setVpclld(BigDecimal vpclld) {
		this.vpclld = vpclld;
	}

	public BigDecimal getVpcphd() {
		return this.vpcphd;
	}

	public void setVpcphd(BigDecimal vpcphd) {
		this.vpcphd = vpcphd;
	}

	public BigDecimal getVpcprm() {
		return this.vpcprm;
	}

	public void setVpcprm(BigDecimal vpcprm) {
		this.vpcprm = vpcprm;
	}

	public BigDecimal getVpctpl() {
		return this.vpctpl;
	}

	public void setVpctpl(BigDecimal vpctpl) {
		this.vpctpl = vpctpl;
	}

	public String getWhetherhandicapped() {
		return this.whetherhandicapped;
	}

	public void setWhetherhandicapped(String whetherhandicapped) {
		this.whetherhandicapped = whetherhandicapped;
	}

	public String getXbrokerCode() {
		return this.xbrokerCode;
	}

	public void setXbrokerCode(String xbrokerCode) {
		this.xbrokerCode = xbrokerCode;
	}


	public String getXgenDownloadStatus() {
		return this.xgenDownloadStatus;
	}

	public void setXgenDownloadStatus(String xgenDownloadStatus) {
		this.xgenDownloadStatus = xgenDownloadStatus;
	}

	public BigDecimal getXgenDownloadid() {
		return this.xgenDownloadid;
	}

	public void setXgenDownloadTranid(BigDecimal xgenDownloadTranid) {
		this.xgenDownloadid = xgenDownloadTranid;
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

	public BigDecimal getZeroDepLoading() {
		return this.zeroDepLoading;
	}

	public void setZeroDepLoading(BigDecimal zeroDepLoading) {
		this.zeroDepLoading = zeroDepLoading;
	}

	public BigDecimal getZeroDepPrm() {
		return this.zeroDepPrm;
	}

	public void setZeroDepPrm(BigDecimal zeroDepPrm) {
		this.zeroDepPrm = zeroDepPrm;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZonetemp() {
		return this.zonetemp;
	}

	public void setZonetemp(String zonetemp) {
		this.zonetemp = zonetemp;
	}

}*/