/*package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="INSURANCEPOLICY")
public class Insurancepolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(length=255)
	private String accountdate;

//	@Column(precision=19)
//	private BigDecimal addipreamount;

	@Column(name="AGENT_DISCOUNT_FLAG", length=255)
	private String agentDiscountFlag;

	@Column(length=255)
	private String agentcode;

//	@Column(precision=126)
//	private double agentcommamount;
//
//	@Column(precision=126)
//	private double agentcommrate;

	@Column(length=255)
	private String agentgroupcode;

	@Column(length=255)
	private String agentname;

	@Column(length=255)
	private String agentpartytype;

//	@Column(precision=1)
//	private BigDecimal autorenewal;

	@Column(length=55)
	private String bdocode;

	@Column(length=225)
	private String bdoname;

	@Column(length=255)
	private String branchcode;

	@Column(length=255)
	private String businessstatus;

//	@Column(name="CBVALIDATION_REQUIRED", precision=1)
//	private BigDecimal cbvalidationRequired;

	@Column(length=20)
	private String changediscount;

	@Column(length=255)
	private String channel;

	@Column(length=10)
	private String claimsbillingownership;

//	@Column(precision=1)
//	private BigDecimal clientcumagent;

//	@Column(precision=1)
//	private BigDecimal coinsurapplicable;

	@Column(length=20)
	private String combipolicynumber;

//	@Column(precision=1)
//	private BigDecimal commdiscapplicable;

	@Column(length=255)
	private String commdiscdiscription;

	@Column(length=255)
	private String commdiscounttype;

//	@Column(precision=126)
//	private double commercialdiscount;

//	@Column(precision=38)
//	private BigDecimal commflatamount;

//	@Column(precision=1)
//	private BigDecimal commissionapplicable;

//	@Column(precision=126)
//	private double commissionrate;

//	@Column(name="CONVERTED_FROM_RATING", precision=22)
//	private BigDecimal convertedFromRating;

	@Column(name="COVER_BOOK_EXPIRE_DATE", length=255)
	private String coverBookExpireDate;

	@Column(name="COVER_BOOK_START_DATE", length=255)
	private String coverBookStartDate;

	@Column(length=255)
	private String coverageterm;

	@Column(length=255)
	private String covernoteissuedate;

	@Column(length=255)
	private String covernotenumber;

//	@Column(precision=126)
//	private double covernotepremium;

	@Column(length=255)
	private String createdby;

	@Column(length=255)
	private String creationdate;

	@Column(length=255)
	private String creationmode;

//	@Column(name="DECLIED_POOL", precision=22)
//	private BigDecimal decliedPool;

//	@Column(precision=19)
//	private BigDecimal discount;

//	@Column(precision=1)
//	private BigDecimal electroniccovernote;

//	@Column(name="ENDORSE_ITEM_TERMINATED", precision=1)
//	private BigDecimal endorseItemTerminated;

//	@Column(name="ENDORSE_POLICY_TERMINATED", precision=1)
//	private BigDecimal endorsePolicyTerminated;

	@Column(length=255)
	private String endorsementcode;

	@Column(length=255)
	private String endorsementcomments;

	@Column(length=255)
	private String endorsementdate;

//	@Column(precision=19)
//	private BigDecimal endorsementrate;

	@Column(length=255)
	private String endorsementtype;

	@Column(length=255)
	private String expirydate;

//	@Column(name="\"EXTERNAL\"", precision=1)
//	private BigDecimal external;

	@Column(length=255)
	private String externalvendorobjectname;

	@Column(name="FINANCIAL_RIGHNTS_AGENT", length=255)
	private String financialRighntsAgent;

//	@Column(precision=20, scale=5)
//	private BigDecimal firehighestrate;

//	@Column(name="FOLLOWUP_FOR_RENEWAL", precision=1)
//	private BigDecimal followupForRenewal;

	@Column(name="GPA_MASTERPOLICY", length=20)
	private String gpaMasterpolicy;

//	@Column(name="GPA_MASTERPOLICY_ID", precision=19)
//	private BigDecimal gpaMasterpolicyId;

//	@Column(name="GPA_PLAN_ID", precision=19)
//	private BigDecimal gpaPlanId;

	@Column(name="GPA_PLANCODE", length=20)
	private String gpaPlancode;

	@Column(length=150)
	private String groupname;

//	@Column(precision=1)
//	private BigDecimal hasrenewed;

	@Column(precision=1)
	private Long hasuploaded;

//	@Column(precision=19)
//	private BigDecimal identifier;

	@Column(length=255)
	private String inceptiondate;

//	@Column(precision=19)
//	private BigDecimal installmentopted;

//	@Column(precision=1)
//	private BigDecimal installmentsallowed;

	@Column(length=255)
	private String insurableitem;

//	@Column(precision=1)
//	private BigDecimal internaluser;

	@Column(length=255)
	private String inwardcode;

//	@Column(name="IS_LOADING_APPLICABLE", precision=1)
//	private BigDecimal isLoadingApplicable;

//	@Column(name="IS_PAN_LETTER_GENERATED", precision=1)
//	private BigDecimal isPanLetterGenerated;
//
//	@Column(name="IS_PORTABLE_POLICY", precision=1)
//	private BigDecimal isPortablePolicy;
//
//	@Column(name="IS_POS_POLICY", precision=1)
//	private BigDecimal isPosPolicy;
//
//	@Column(name="IS_RENEWAL_NOTICE_GENERATED", precision=1)
//	private BigDecimal isRenewalNoticeGenerated;
//
//	@Column(name="IS_UPSELL_ALLOWED", precision=1)
//	private BigDecimal isUpsellAllowed;

	@Column(name="IS_VIR_REQUIRED", length=20)
	private String isVirRequired;

//	@Column(precision=1)
//	private BigDecimal islatest;
//
//	@Column(precision=1)
//	private BigDecimal ispreapproval;
//
//	@Column(precision=1)
//	private BigDecimal ispreferredcustomer;

//	@Column(precision=1)
//	private BigDecimal isreceiptcreated;
//
//	@Column(precision=1)
//	private BigDecimal isrenewalextraction;
//
//	@Column(precision=22)
//	private BigDecimal isrenewalprint;
//
//	@Column(precision=1)
//	private BigDecimal isroadsideassistance;

//	@Column(precision=19)
//	private BigDecimal issuancerate;

//	@Column(name="ISTECHNICALPRICING_APPLICABLE", precision=22)
//	private BigDecimal istechnicalpricingApplicable;
//
//	@Column(precision=1)
//	private BigDecimal isvaletcare;
//
//	@Column(precision=1)
//	private BigDecimal isvippolicy;

	@Column(length=255)
	private String jurisdiction;

	@Column(length=255)
	private String lastmodifiedby;

	@Column(length=255)
	private String lastmodifiedtime;

	@Column(length=255)
	private String leaseplanassetno;

	@Column(length=255)
	private String livescovered;

//	@Column(precision=19)
//	private BigDecimal mailinsourceid;

//	@Column(name="MANAUL_WRITEOFF", precision=22)
//	private BigDecimal manaulWriteoff;

//	@Column(precision=1)
//	private BigDecimal manualcovernote;

	@Column(name="MASTER_REFERENCE_NUMBER", length=255)
	private String masterReferenceNumber;

//	@Column(precision=126)
//	private double masteragentcommission;

//	@Column(precision=19)
//	private BigDecimal mbdpolicyid;

	@Column(name="MODE_OF_AUTORENEWAL", length=255)
	private String modeOfAutorenewal;

//	@Column(precision=126)
//	private double netchangeamount;

//	@Column(name="NO_OF_TIMES_SENT", precision=10)
//	private BigDecimal noOfTimesSent;

	@Column(length=55)
	private String nonirdaagentcode;

	@Column(length=225)
	private String nonirdaagentname;

//	@Column(precision=10)
//	private BigDecimal noofinsurableitems;

//	@Column(precision=19)
//	private BigDecimal noofyearswithrs;

	@Column(length=255)
	private String oacode;

	@Column(length=255)
	private String packagedisplayname;

	@Column(length=255)
	private String packagename;

	@Column(name="PAN_LETTER_GENERATED_DATE", length=255)
	private String panLetterGeneratedDate;

	@Column(name="PARENT_POLICY", length=50)
	private String parentPolicy;

//	@Column(name="PAYMENT_APPROVED", precision=1)
//	private BigDecimal paymentApproved;

//	@Column(precision=19)
//	private BigDecimal paymentid;

//	@Column(precision=22)
//	private BigDecimal payout;

//	@Column(precision=22)
//	private BigDecimal payouteligible;

	@Column(length=200)
	private String periodindays;

	@Column(length=30)
	private String planoption;

	@Column(length=255)
	private String plmproductname;

	@Column(length=255)
	private String policycode;

//	@Column(precision=19)
//	private BigDecimal policycoinsurerid;

//	@Column(precision=126)
//	private double policycommission;

//	@Column(precision=10)
//	private BigDecimal policyduration;

//	@Column(precision=1)
//	private BigDecimal policyoriginalprinted;

	@Column(length=25)
	private String policyperiod;

//	@Column(precision=1)
//	private BigDecimal policyprint;

//	@Column(precision=10)
//	private BigDecimal policyrejectedcount;

	@Column(length=255)
	private String policytype;

//	@Column(name="POLICYWORKFLOWAUDIT_ID", precision=19)
//	private BigDecimal policyworkflowauditId;
//
//	@Column(name="POSDETAILS_ID", precision=19)
//	private BigDecimal posdetailsId;
//
//	@Column(name="POSITIVEUPLOAD_ID", precision=22)
//	private BigDecimal positiveuploadId;
//
//	@Column(name="PREVIOUSPOLICYDETAILS_ID", precision=19)
//	private BigDecimal previouspolicydetailsId;

	@Column(length=255)
	private String previouspolicyexpirydate;

	@Column(length=255)
	private String previouspolicynumber;

//	@Column(name="PRINT_COVERNOTE_APPROVED", precision=1)
//	private BigDecimal printCovernoteApproved;

//	@Column(name="PRINT_POLICY_APPROVED", precision=1)
//	private BigDecimal printPolicyApproved;

	@Column(name="PRINTCRITERIA_RIGHNTS_AGENT", length=255)
	private String printcriteriaRighntsAgent;

//	@Column(name="PRINTPROPOSAL_COUNT", precision=4)
//	private BigDecimal printproposalCount;

	@Column(length=255)
	private String productdisplayname;

	@Column(length=255)
	private String productname;

	@Column(length=200)
	private String proposaldate;

	@Column(length=255)
	private String proposalnoteissuedate;

	@Column(length=255)
	private String proposalnotenumber;

	@Column(length=255)
	private String proposalnumber;

	@Column(length=255)
	private String quotenumber;

	@Column(length=200)
	private String quotetype;

	@Column(length=30)
	private String ratelogic;

//	@Column(name="RE_CALCULATED", precision=1)
//	private BigDecimal reCalculated;

	@Column(length=255)
	private String reasoncode;

	@Column(length=255)
	private String reasontext;

	@Column(length=255)
	private String recommendedby;

	@Column(name="REFERENCE_CODE", length=50)
	private String referenceCode;

//	@Column(precision=22)
//	private BigDecimal referencenumber;

	@Column(length=255)
	private String referralid;

	@Column(name="REFERRER_CODE", length=255)
	private String referrerCode;

//	@Column(precision=1)
//	private BigDecimal refundflag;

	@Column(name="RENEWAL_OPTION", length=255)
	private String renewalOption;

//	@Column(name="RENEWAL_TECHNICAL_APPLICABLE", precision=22)
//	private BigDecimal renewalTechnicalApplicable;

//	@Column(precision=1)
//	private BigDecimal renewalapplicable;

	@Column(name="RENEWALNOTICE_GENERATED_DATE", length=200)
	private String renewalnoticeGeneratedDate;

//	@Column(name="RESELL_LETTER_GENERATED", precision=1)
//	private BigDecimal resellLetterGenerated;

	@Column(name="RISKACCUMULATION_CODE", length=200)
	private String riskaccumulationCode;

	@Column(length=255)
	private String rmcode;

	@Column(length=255)
	private String salescompany;

	@Column(name="SC_LETTER_GENERATED_DATE", length=255)
	private String scLetterGeneratedDate;

	@Column(name="SELECTED_GROUP_CODE", length=1025)
	private String selectedGroupCode;

	@Column(name="SELECTED_PARTY_CODE", length=20)
	private String selectedPartyCode;

	@Column(name="SELECTED_PAYMENT_MODE", length=50)
	private String selectedPaymentMode;

	@Column(length=200)
	private String selectedhigherexcess;

	@Column(length=255)
	private String selforbehalf;

	@Column(name="SERVICE_MANAGER_CODE", length=255)
	private String serviceManagerCode;

//	@Column(name="SHOW_COVERNOTEPRINT", precision=1)
//	private BigDecimal showCovernoteprint;
//
//	@Column(name="SHOW_POLICYPRINT", precision=1)
//	private BigDecimal showPolicyprint;
//
//	@Column(name="SHOW_PROPOSALPRINT", precision=1)
//	private BigDecimal showProposalprint;

	@Column(length=1000)
	private String subchannel;

	@Column(length=255)
	private String subline;

	@Column(length=255)
	private String subplan;

	@Column(length=25)
	private String subquotenumber;

	@Column(length=200)
	private String subvertical;

//	@Column(precision=1)
//	private BigDecimal techdiscapplicable;

//	@Column(precision=126)
//	private double technicaldiscount;

//	@Column(precision=5)
//	private double terrorismcommission;

	@Column(name="TP_EXEMPTION", length=20)
	private String tpExemption;

	@Column(length=50)
	private String tpacode;

	@Column(length=255)
	private String tparate;

	@Column(name="TRANS_RIGHNTS_AGENT", length=255)
	private String transRighntsAgent;

	@Column(length=255)
	private String transactiontype;

	@Column(name="TYPE_OF_BUSINESS", length=50)
	private String typeOfBusiness;

//	@Temporal(TemporalType.DATE)
//	private Date uploadeddate;

	@Column(length=255)
	private String uploadedtime;

	@Column(length=255)
	private String uprbasis;

//	@Column(precision=1)
//	private BigDecimal uprgenerated;

//	@Column(precision=10)
//	private BigDecimal uwyr;
//
//	@Column(precision=1)
//	private BigDecimal valetcareoriginalprinted;

	@Column(name="VALIDITY_DATE", length=255)
	private String validityDate;

//	@Column(precision=10)
//	private BigDecimal versionnumber;

	@Column(length=255)
	private String versionreasons;

	@Column(name="VERTICAL_BASED_AUTH", length=4000)
	private String verticalBasedAuth;

	@Column(length=1000)
	private String verticalchannel;

	@Column(length=255)
	private String weightedaveragerate;

	@Column(length=255)
	private String workflowstatus;

	@Column(length=255)
	private String xgenpolicycode;

	//bi-directional many-to-one association to Insuranceoaagent
//	@ManyToOne
//	@JoinColumn(name="OADETAILS_ID")
//	private Insuranceoaagent insuranceoaagent;

	public Insurancepolicy() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccountdate() {
		return this.accountdate;
	}

	public void setAccountdate(String accountdate) {
		this.accountdate = accountdate;
	}



	public String getAgentDiscountFlag() {
		return this.agentDiscountFlag;
	}

	public void setAgentDiscountFlag(String agentDiscountFlag) {
		this.agentDiscountFlag = agentDiscountFlag;
	}

	public String getAgentcode() {
		return this.agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

//	public double getAgentcommamount() {
//		return this.agentcommamount;
//	}
//
//	public void setAgentcommamount(double agentcommamount) {
//		this.agentcommamount = agentcommamount;
//	}
//
//	public double getAgentcommrate() {
//		return this.agentcommrate;
//	}
//
//	public void setAgentcommrate(double agentcommrate) {
//		this.agentcommrate = agentcommrate;
//	}

	public String getAgentgroupcode() {
		return this.agentgroupcode;
	}

	public void setAgentgroupcode(String agentgroupcode) {
		this.agentgroupcode = agentgroupcode;
	}

	public String getAgentname() {
		return this.agentname;
	}

	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}

	public String getAgentpartytype() {
		return this.agentpartytype;
	}

	public void setAgentpartytype(String agentpartytype) {
		this.agentpartytype = agentpartytype;
	}

//	public BigDecimal getAutorenewal() {
//		return this.autorenewal;
//	}
//
//	public void setAutorenewal(BigDecimal autorenewal) {
//		this.autorenewal = autorenewal;
//	}

	public String getBdocode() {
		return this.bdocode;
	}

	public void setBdocode(String bdocode) {
		this.bdocode = bdocode;
	}

	public String getBdoname() {
		return this.bdoname;
	}

	public void setBdoname(String bdoname) {
		this.bdoname = bdoname;
	}

	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getBusinessstatus() {
		return this.businessstatus;
	}

	public void setBusinessstatus(String businessstatus) {
		this.businessstatus = businessstatus;
	}

//	public BigDecimal getCbvalidationRequired() {
//		return this.cbvalidationRequired;
//	}
//
//	public void setCbvalidationRequired(BigDecimal cbvalidationRequired) {
//		this.cbvalidationRequired = cbvalidationRequired;
//	}

	public String getChangediscount() {
		return this.changediscount;
	}

	public void setChangediscount(String changediscount) {
		this.changediscount = changediscount;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClaimsbillingownership() {
		return this.claimsbillingownership;
	}

	public void setClaimsbillingownership(String claimsbillingownership) {
		this.claimsbillingownership = claimsbillingownership;
	}

//	public BigDecimal getClientcumagent() {
//		return this.clientcumagent;
//	}
//
//	public void setClientcumagent(BigDecimal clientcumagent) {
//		this.clientcumagent = clientcumagent;
//	}
//
//	public BigDecimal getCoinsurapplicable() {
//		return this.coinsurapplicable;
//	}
//
//	public void setCoinsurapplicable(BigDecimal coinsurapplicable) {
//		this.coinsurapplicable = coinsurapplicable;
//	}

	public String getCombipolicynumber() {
		return this.combipolicynumber;
	}

	public void setCombipolicynumber(String combipolicynumber) {
		this.combipolicynumber = combipolicynumber;
	}

//	public BigDecimal getCommdiscapplicable() {
//		return this.commdiscapplicable;
//	}
//
//	public void setCommdiscapplicable(BigDecimal commdiscapplicable) {
//		this.commdiscapplicable = commdiscapplicable;
//	}

	public String getCommdiscdiscription() {
		return this.commdiscdiscription;
	}

	public void setCommdiscdiscription(String commdiscdiscription) {
		this.commdiscdiscription = commdiscdiscription;
	}

	public String getCommdiscounttype() {
		return this.commdiscounttype;
	}

	public void setCommdiscounttype(String commdiscounttype) {
		this.commdiscounttype = commdiscounttype;
	}

//	public double getCommercialdiscount() {
//		return this.commercialdiscount;
//	}
//
//	public void setCommercialdiscount(double commercialdiscount) {
//		this.commercialdiscount = commercialdiscount;
//	}

//	public BigDecimal getCommflatamount() {
//		return this.commflatamount;
//	}
//
//	public void setCommflatamount(BigDecimal commflatamount) {
//		this.commflatamount = commflatamount;
//	}
//
//	public BigDecimal getCommissionapplicable() {
//		return this.commissionapplicable;
//	}
//
//	public void setCommissionapplicable(BigDecimal commissionapplicable) {
//		this.commissionapplicable = commissionapplicable;
//	}
//
//	public double getCommissionrate() {
//		return this.commissionrate;
//	}
//
//	public void setCommissionrate(double commissionrate) {
//		this.commissionrate = commissionrate;
//	}
//
//	public BigDecimal getConvertedFromRating() {
//		return this.convertedFromRating;
//	}
//
//	public void setConvertedFromRating(BigDecimal convertedFromRating) {
//		this.convertedFromRating = convertedFromRating;
//	}

	public String getCoverBookExpireDate() {
		return this.coverBookExpireDate;
	}

	public void setCoverBookExpireDate(String coverBookExpireDate) {
		this.coverBookExpireDate = coverBookExpireDate;
	}

	public String getCoverBookStartDate() {
		return this.coverBookStartDate;
	}

	public void setCoverBookStartDate(String coverBookStartDate) {
		this.coverBookStartDate = coverBookStartDate;
	}

	public String getCoverageterm() {
		return this.coverageterm;
	}

	public void setCoverageterm(String coverageterm) {
		this.coverageterm = coverageterm;
	}

	public String getCovernoteissuedate() {
		return this.covernoteissuedate;
	}

	public void setCovernoteissuedate(String covernoteissuedate) {
		this.covernoteissuedate = covernoteissuedate;
	}

	public String getCovernotenumber() {
		return this.covernotenumber;
	}

	public void setCovernotenumber(String covernotenumber) {
		this.covernotenumber = covernotenumber;
	}

//	public double getCovernotepremium() {
//		return this.covernotepremium;
//	}
//
//	public void setCovernotepremium(double covernotepremium) {
//		this.covernotepremium = covernotepremium;
//	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public String getCreationmode() {
		return this.creationmode;
	}

	public void setCreationmode(String creationmode) {
		this.creationmode = creationmode;
	}

//	public BigDecimal getDecliedPool() {
//		return this.decliedPool;
//	}
//
//	public void setDecliedPool(BigDecimal decliedPool) {
//		this.decliedPool = decliedPool;
//	}
//
//	public BigDecimal getDiscount() {
//		return this.discount;
//	}
//
//	public void setDiscount(BigDecimal discount) {
//		this.discount = discount;
//	}
//
//	public BigDecimal getElectroniccovernote() {
//		return this.electroniccovernote;
//	}
//
//	public void setElectroniccovernote(BigDecimal electroniccovernote) {
//		this.electroniccovernote = electroniccovernote;
//	}
//
//	public BigDecimal getEndorseItemTerminated() {
//		return this.endorseItemTerminated;
//	}
//
//	public void setEndorseItemTerminated(BigDecimal endorseItemTerminated) {
//		this.endorseItemTerminated = endorseItemTerminated;
//	}
//
//	public BigDecimal getEndorsePolicyTerminated() {
//		return this.endorsePolicyTerminated;
//	}
//
//	public void setEndorsePolicyTerminated(BigDecimal endorsePolicyTerminated) {
//		this.endorsePolicyTerminated = endorsePolicyTerminated;
//	}

	public String getEndorsementcode() {
		return this.endorsementcode;
	}

	public void setEndorsementcode(String endorsementcode) {
		this.endorsementcode = endorsementcode;
	}

	public String getEndorsementcomments() {
		return this.endorsementcomments;
	}

	public void setEndorsementcomments(String endorsementcomments) {
		this.endorsementcomments = endorsementcomments;
	}

	public String getEndorsementdate() {
		return this.endorsementdate;
	}

	public void setEndorsementdate(String endorsementdate) {
		this.endorsementdate = endorsementdate;
	}

//	public BigDecimal getEndorsementrate() {
//		return this.endorsementrate;
//	}
//
//	public void setEndorsementrate(BigDecimal endorsementrate) {
//		this.endorsementrate = endorsementrate;
//	}

	public String getEndorsementtype() {
		return this.endorsementtype;
	}

	public void setEndorsementtype(String endorsementtype) {
		this.endorsementtype = endorsementtype;
	}

	public String getExpirydate() {
		return this.expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

//	public BigDecimal getExternal() {
//		return this.external;
//	}
//
//	public void setExternal(BigDecimal external) {
//		this.external = external;
//	}

	public String getExternalvendorobjectname() {
		return this.externalvendorobjectname;
	}

	public void setExternalvendorobjectname(String externalvendorobjectname) {
		this.externalvendorobjectname = externalvendorobjectname;
	}

	public String getFinancialRighntsAgent() {
		return this.financialRighntsAgent;
	}

	public void setFinancialRighntsAgent(String financialRighntsAgent) {
		this.financialRighntsAgent = financialRighntsAgent;
	}

//	public BigDecimal getFirehighestrate() {
//		return this.firehighestrate;
//	}
//
//	public void setFirehighestrate(BigDecimal firehighestrate) {
//		this.firehighestrate = firehighestrate;
//	}
//
//	public BigDecimal getFollowupForRenewal() {
//		return this.followupForRenewal;
//	}
//
//	public void setFollowupForRenewal(BigDecimal followupForRenewal) {
//		this.followupForRenewal = followupForRenewal;
//	}

	public String getGpaMasterpolicy() {
		return this.gpaMasterpolicy;
	}

	public void setGpaMasterpolicy(String gpaMasterpolicy) {
		this.gpaMasterpolicy = gpaMasterpolicy;
	}

//	public BigDecimal getGpaMasterpolicyId() {
//		return this.gpaMasterpolicyId;
//	}
//
//	public void setGpaMasterpolicyId(BigDecimal gpaMasterpolicyId) {
//		this.gpaMasterpolicyId = gpaMasterpolicyId;
//	}
//
//	public BigDecimal getGpaPlanId() {
//		return this.gpaPlanId;
//	}
//
//	public void setGpaPlanId(BigDecimal gpaPlanId) {
//		this.gpaPlanId = gpaPlanId;
//	}

	public String getGpaPlancode() {
		return this.gpaPlancode;
	}

	public void setGpaPlancode(String gpaPlancode) {
		this.gpaPlancode = gpaPlancode;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

//	public BigDecimal getHasrenewed() {
//		return this.hasrenewed;
//	}
//
//	public void setHasrenewed(BigDecimal hasrenewed) {
//		this.hasrenewed = hasrenewed;
//	}

	public Long getHasuploaded() {
		return this.hasuploaded;
	}

	public void setHasuploaded(Long hasuploaded) {
		this.hasuploaded = hasuploaded;
	}

//	public BigDecimal getIdentifier() {
//		return this.identifier;
//	}
//
//	public void setIdentifier(BigDecimal identifier) {
//		this.identifier = identifier;
//	}

	public String getInceptiondate() {
		return this.inceptiondate;
	}

	public void setInceptiondate(String inceptiondate) {
		this.inceptiondate = inceptiondate;
	}

//	public BigDecimal getInstallmentopted() {
//		return this.installmentopted;
//	}
//
//	public void setInstallmentopted(BigDecimal installmentopted) {
//		this.installmentopted = installmentopted;
//	}
//
//	public BigDecimal getInstallmentsallowed() {
//		return this.installmentsallowed;
//	}
//
//	public void setInstallmentsallowed(BigDecimal installmentsallowed) {
//		this.installmentsallowed = installmentsallowed;
//	}

	public String getInsurableitem() {
		return this.insurableitem;
	}

	public void setInsurableitem(String insurableitem) {
		this.insurableitem = insurableitem;
	}

//	public BigDecimal getInternaluser() {
//		return this.internaluser;
//	}
//
//	public void setInternaluser(BigDecimal internaluser) {
//		this.internaluser = internaluser;
//	}

	public String getInwardcode() {
		return this.inwardcode;
	}

	public void setInwardcode(String inwardcode) {
		this.inwardcode = inwardcode;
	}

//	public BigDecimal getIsLoadingApplicable() {
//		return this.isLoadingApplicable;
//	}
//
//	public void setIsLoadingApplicable(BigDecimal isLoadingApplicable) {
//		this.isLoadingApplicable = isLoadingApplicable;
//	}
//
//	public BigDecimal getIsPanLetterGenerated() {
//		return this.isPanLetterGenerated;
//	}
//
//	public void setIsPanLetterGenerated(BigDecimal isPanLetterGenerated) {
//		this.isPanLetterGenerated = isPanLetterGenerated;
//	}
//
//	public BigDecimal getIsPortablePolicy() {
//		return this.isPortablePolicy;
//	}
//
//	public void setIsPortablePolicy(BigDecimal isPortablePolicy) {
//		this.isPortablePolicy = isPortablePolicy;
//	}
//
//	public BigDecimal getIsPosPolicy() {
//		return this.isPosPolicy;
//	}
//
//	public void setIsPosPolicy(BigDecimal isPosPolicy) {
//		this.isPosPolicy = isPosPolicy;
//	}
//
//	public BigDecimal getIsRenewalNoticeGenerated() {
//		return this.isRenewalNoticeGenerated;
//	}
//
//	public void setIsRenewalNoticeGenerated(BigDecimal isRenewalNoticeGenerated) {
//		this.isRenewalNoticeGenerated = isRenewalNoticeGenerated;
//	}
//
//	public BigDecimal getIsUpsellAllowed() {
//		return this.isUpsellAllowed;
//	}
//
//	public void setIsUpsellAllowed(BigDecimal isUpsellAllowed) {
//		this.isUpsellAllowed = isUpsellAllowed;
//	}

	public String getIsVirRequired() {
		return this.isVirRequired;
	}

	public void setIsVirRequired(String isVirRequired) {
		this.isVirRequired = isVirRequired;
	}

//	public BigDecimal getIslatest() {
//		return this.islatest;
//	}
//
//	public void setIslatest(BigDecimal islatest) {
//		this.islatest = islatest;
//	}
//
//	public BigDecimal getIspreapproval() {
//		return this.ispreapproval;
//	}
//
//	public void setIspreapproval(BigDecimal ispreapproval) {
//		this.ispreapproval = ispreapproval;
//	}
//
//	public BigDecimal getIspreferredcustomer() {
//		return this.ispreferredcustomer;
//	}
//
//	public void setIspreferredcustomer(BigDecimal ispreferredcustomer) {
//		this.ispreferredcustomer = ispreferredcustomer;
//	}
//
//	public BigDecimal getIsreceiptcreated() {
//		return this.isreceiptcreated;
//	}
//
//	public void setIsreceiptcreated(BigDecimal isreceiptcreated) {
//		this.isreceiptcreated = isreceiptcreated;
//	}
//
//	public BigDecimal getIsrenewalextraction() {
//		return this.isrenewalextraction;
//	}
//
//	public void setIsrenewalextraction(BigDecimal isrenewalextraction) {
//		this.isrenewalextraction = isrenewalextraction;
//	}
//
//	public BigDecimal getIsrenewalprint() {
//		return this.isrenewalprint;
//	}
//
//	public void setIsrenewalprint(BigDecimal isrenewalprint) {
//		this.isrenewalprint = isrenewalprint;
//	}
//
//	public BigDecimal getIsroadsideassistance() {
//		return this.isroadsideassistance;
//	}
//
//	public void setIsroadsideassistance(BigDecimal isroadsideassistance) {
//		this.isroadsideassistance = isroadsideassistance;
//	}
//
//	public BigDecimal getIssuancerate() {
//		return this.issuancerate;
//	}
//
//	public void setIssuancerate(BigDecimal issuancerate) {
//		this.issuancerate = issuancerate;
//	}
//
//	public BigDecimal getIstechnicalpricingApplicable() {
//		return this.istechnicalpricingApplicable;
//	}
//
//	public void setIstechnicalpricingApplicable(BigDecimal istechnicalpricingApplicable) {
//		this.istechnicalpricingApplicable = istechnicalpricingApplicable;
//	}
//
//	public BigDecimal getIsvaletcare() {
//		return this.isvaletcare;
//	}
//
//	public void setIsvaletcare(BigDecimal isvaletcare) {
//		this.isvaletcare = isvaletcare;
//	}
//
//	public BigDecimal getIsvippolicy() {
//		return this.isvippolicy;
//	}
//
//	public void setIsvippolicy(BigDecimal isvippolicy) {
//		this.isvippolicy = isvippolicy;
//	}

	public String getJurisdiction() {
		return this.jurisdiction;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public String getLastmodifiedby() {
		return this.lastmodifiedby;
	}

	public void setLastmodifiedby(String lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}

	public String getLastmodifiedtime() {
		return this.lastmodifiedtime;
	}

	public void setLastmodifiedtime(String lastmodifiedtime) {
		this.lastmodifiedtime = lastmodifiedtime;
	}

	public String getLeaseplanassetno() {
		return this.leaseplanassetno;
	}

	public void setLeaseplanassetno(String leaseplanassetno) {
		this.leaseplanassetno = leaseplanassetno;
	}

	public String getLivescovered() {
		return this.livescovered;
	}

	public void setLivescovered(String livescovered) {
		this.livescovered = livescovered;
	}

//	public BigDecimal getMailinsourceid() {
//		return this.mailinsourceid;
//	}
//
//	public void setMailinsourceid(BigDecimal mailinsourceid) {
//		this.mailinsourceid = mailinsourceid;
//	}
//
//	public BigDecimal getManaulWriteoff() {
//		return this.manaulWriteoff;
//	}
//
//	public void setManaulWriteoff(BigDecimal manaulWriteoff) {
//		this.manaulWriteoff = manaulWriteoff;
//	}
//
//	public BigDecimal getManualcovernote() {
//		return this.manualcovernote;
//	}
//
//	public void setManualcovernote(BigDecimal manualcovernote) {
//		this.manualcovernote = manualcovernote;
//	}

	public String getMasterReferenceNumber() {
		return this.masterReferenceNumber;
	}

	public void setMasterReferenceNumber(String masterReferenceNumber) {
		this.masterReferenceNumber = masterReferenceNumber;
	}

//	public double getMasteragentcommission() {
//		return this.masteragentcommission;
//	}
//
//	public void setMasteragentcommission(double masteragentcommission) {
//		this.masteragentcommission = masteragentcommission;
//	}
//
//	public BigDecimal getMbdpolicyid() {
//		return this.mbdpolicyid;
//	}
//
//	public void setMbdpolicyid(BigDecimal mbdpolicyid) {
//		this.mbdpolicyid = mbdpolicyid;
//	}

	public String getModeOfAutorenewal() {
		return this.modeOfAutorenewal;
	}

	public void setModeOfAutorenewal(String modeOfAutorenewal) {
		this.modeOfAutorenewal = modeOfAutorenewal;
	}

//	public double getNetchangeamount() {
//		return this.netchangeamount;
//	}
//
//	public void setNetchangeamount(double netchangeamount) {
//		this.netchangeamount = netchangeamount;
//	}
//
//	public BigDecimal getNoOfTimesSent() {
//		return this.noOfTimesSent;
//	}
//
//	public void setNoOfTimesSent(BigDecimal noOfTimesSent) {
//		this.noOfTimesSent = noOfTimesSent;
//	}

	public String getNonirdaagentcode() {
		return this.nonirdaagentcode;
	}

	public void setNonirdaagentcode(String nonirdaagentcode) {
		this.nonirdaagentcode = nonirdaagentcode;
	}

	public String getNonirdaagentname() {
		return this.nonirdaagentname;
	}

	public void setNonirdaagentname(String nonirdaagentname) {
		this.nonirdaagentname = nonirdaagentname;
	}

//	public BigDecimal getNoofinsurableitems() {
//		return this.noofinsurableitems;
//	}
//
//	public void setNoofinsurableitems(BigDecimal noofinsurableitems) {
//		this.noofinsurableitems = noofinsurableitems;
//	}
//
//	public BigDecimal getNoofyearswithrs() {
//		return this.noofyearswithrs;
//	}
//
//	public void setNoofyearswithrs(BigDecimal noofyearswithrs) {
//		this.noofyearswithrs = noofyearswithrs;
//	}

	public String getOacode() {
		return this.oacode;
	}

	public void setOacode(String oacode) {
		this.oacode = oacode;
	}

	public String getPackagedisplayname() {
		return this.packagedisplayname;
	}

	public void setPackagedisplayname(String packagedisplayname) {
		this.packagedisplayname = packagedisplayname;
	}

	public String getPackagename() {
		return this.packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public String getPanLetterGeneratedDate() {
		return this.panLetterGeneratedDate;
	}

	public void setPanLetterGeneratedDate(String panLetterGeneratedDate) {
		this.panLetterGeneratedDate = panLetterGeneratedDate;
	}

	public String getParentPolicy() {
		return this.parentPolicy;
	}

	public void setParentPolicy(String parentPolicy) {
		this.parentPolicy = parentPolicy;
	}

//	public BigDecimal getPaymentApproved() {
//		return this.paymentApproved;
//	}
//
//	public void setPaymentApproved(BigDecimal paymentApproved) {
//		this.paymentApproved = paymentApproved;
//	}
//
//	public BigDecimal getPaymentid() {
//		return this.paymentid;
//	}
//
//	public void setPaymentid(BigDecimal paymentid) {
//		this.paymentid = paymentid;
//	}
//
//	public BigDecimal getPayout() {
//		return this.payout;
//	}
//
//	public void setPayout(BigDecimal payout) {
//		this.payout = payout;
//	}
//
//	public BigDecimal getPayouteligible() {
//		return this.payouteligible;
//	}
//
//	public void setPayouteligible(BigDecimal payouteligible) {
//		this.payouteligible = payouteligible;
//	}

	public String getPeriodindays() {
		return this.periodindays;
	}

	public void setPeriodindays(String periodindays) {
		this.periodindays = periodindays;
	}

	public String getPlanoption() {
		return this.planoption;
	}

	public void setPlanoption(String planoption) {
		this.planoption = planoption;
	}

	public String getPlmproductname() {
		return this.plmproductname;
	}

	public void setPlmproductname(String plmproductname) {
		this.plmproductname = plmproductname;
	}

	public String getPolicycode() {
		return this.policycode;
	}

	public void setPolicycode(String policycode) {
		this.policycode = policycode;
	}

//	public BigDecimal getPolicycoinsurerid() {
//		return this.policycoinsurerid;
//	}
//
//	public void setPolicycoinsurerid(BigDecimal policycoinsurerid) {
//		this.policycoinsurerid = policycoinsurerid;
//	}
//
//	public double getPolicycommission() {
//		return this.policycommission;
//	}
//
//	public void setPolicycommission(double policycommission) {
//		this.policycommission = policycommission;
//	}
//
//	public BigDecimal getPolicyduration() {
//		return this.policyduration;
//	}
//
//	public void setPolicyduration(BigDecimal policyduration) {
//		this.policyduration = policyduration;
//	}
//
//	public BigDecimal getPolicyoriginalprinted() {
//		return this.policyoriginalprinted;
//	}
//
//	public void setPolicyoriginalprinted(BigDecimal policyoriginalprinted) {
//		this.policyoriginalprinted = policyoriginalprinted;
//	}

	public String getPolicyperiod() {
		return this.policyperiod;
	}

	public void setPolicyperiod(String policyperiod) {
		this.policyperiod = policyperiod;
	}

//	public BigDecimal getPolicyprint() {
//		return this.policyprint;
//	}
//
//	public void setPolicyprint(BigDecimal policyprint) {
//		this.policyprint = policyprint;
//	}
//
//	public BigDecimal getPolicyrejectedcount() {
//		return this.policyrejectedcount;
//	}
//
//	public void setPolicyrejectedcount(BigDecimal policyrejectedcount) {
//		this.policyrejectedcount = policyrejectedcount;
//	}

	public String getPolicytype() {
		return this.policytype;
	}

	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}

//	public BigDecimal getPolicyworkflowauditId() {
//		return this.policyworkflowauditId;
//	}
//
//	public void setPolicyworkflowauditId(BigDecimal policyworkflowauditId) {
//		this.policyworkflowauditId = policyworkflowauditId;
//	}
//
//	public BigDecimal getPosdetailsId() {
//		return this.posdetailsId;
//	}
//
//	public void setPosdetailsId(BigDecimal posdetailsId) {
//		this.posdetailsId = posdetailsId;
//	}
//
//	public BigDecimal getPositiveuploadId() {
//		return this.positiveuploadId;
//	}
//
//	public void setPositiveuploadId(BigDecimal positiveuploadId) {
//		this.positiveuploadId = positiveuploadId;
//	}
//
//	public BigDecimal getPreviouspolicydetailsId() {
//		return this.previouspolicydetailsId;
//	}
//
//	public void setPreviouspolicydetailsId(BigDecimal previouspolicydetailsId) {
//		this.previouspolicydetailsId = previouspolicydetailsId;
//	}

	public String getPreviouspolicyexpirydate() {
		return this.previouspolicyexpirydate;
	}

	public void setPreviouspolicyexpirydate(String previouspolicyexpirydate) {
		this.previouspolicyexpirydate = previouspolicyexpirydate;
	}

	public String getPreviouspolicynumber() {
		return this.previouspolicynumber;
	}

	public void setPreviouspolicynumber(String previouspolicynumber) {
		this.previouspolicynumber = previouspolicynumber;
	}

//	public BigDecimal getPrintCovernoteApproved() {
//		return this.printCovernoteApproved;
//	}
//
//	public void setPrintCovernoteApproved(BigDecimal printCovernoteApproved) {
//		this.printCovernoteApproved = printCovernoteApproved;
//	}
//
//	public BigDecimal getPrintPolicyApproved() {
//		return this.printPolicyApproved;
//	}
//
//	public void setPrintPolicyApproved(BigDecimal printPolicyApproved) {
//		this.printPolicyApproved = printPolicyApproved;
//	}

	public String getPrintcriteriaRighntsAgent() {
		return this.printcriteriaRighntsAgent;
	}

	public void setPrintcriteriaRighntsAgent(String printcriteriaRighntsAgent) {
		this.printcriteriaRighntsAgent = printcriteriaRighntsAgent;
	}

//	public BigDecimal getPrintproposalCount() {
//		return this.printproposalCount;
//	}
//
//	public void setPrintproposalCount(BigDecimal printproposalCount) {
//		this.printproposalCount = printproposalCount;
//	}

	public String getProductdisplayname() {
		return this.productdisplayname;
	}

	public void setProductdisplayname(String productdisplayname) {
		this.productdisplayname = productdisplayname;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProposaldate() {
		return this.proposaldate;
	}

	public void setProposaldate(String proposaldate) {
		this.proposaldate = proposaldate;
	}

	public String getProposalnoteissuedate() {
		return this.proposalnoteissuedate;
	}

	public void setProposalnoteissuedate(String proposalnoteissuedate) {
		this.proposalnoteissuedate = proposalnoteissuedate;
	}

	public String getProposalnotenumber() {
		return this.proposalnotenumber;
	}

	public void setProposalnotenumber(String proposalnotenumber) {
		this.proposalnotenumber = proposalnotenumber;
	}

	public String getProposalnumber() {
		return this.proposalnumber;
	}

	public void setProposalnumber(String proposalnumber) {
		this.proposalnumber = proposalnumber;
	}

	public String getQuotenumber() {
		return this.quotenumber;
	}

	public void setQuotenumber(String quotenumber) {
		this.quotenumber = quotenumber;
	}

	public String getQuotetype() {
		return this.quotetype;
	}

	public void setQuotetype(String quotetype) {
		this.quotetype = quotetype;
	}

	public String getRatelogic() {
		return this.ratelogic;
	}

	public void setRatelogic(String ratelogic) {
		this.ratelogic = ratelogic;
	}

//	public BigDecimal getReCalculated() {
//		return this.reCalculated;
//	}
//
//	public void setReCalculated(BigDecimal reCalculated) {
//		this.reCalculated = reCalculated;
//	}

	public String getReasoncode() {
		return this.reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}

	public String getReasontext() {
		return this.reasontext;
	}

	public void setReasontext(String reasontext) {
		this.reasontext = reasontext;
	}

	public String getRecommendedby() {
		return this.recommendedby;
	}

	public void setRecommendedby(String recommendedby) {
		this.recommendedby = recommendedby;
	}

	public String getReferenceCode() {
		return this.referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

//	public BigDecimal getReferencenumber() {
//		return this.referencenumber;
//	}
//
//	public void setReferencenumber(BigDecimal referencenumber) {
//		this.referencenumber = referencenumber;
//	}

	public String getReferralid() {
		return this.referralid;
	}

	public void setReferralid(String referralid) {
		this.referralid = referralid;
	}

	public String getReferrerCode() {
		return this.referrerCode;
	}

	public void setReferrerCode(String referrerCode) {
		this.referrerCode = referrerCode;
	}

//	public BigDecimal getRefundflag() {
//		return this.refundflag;
//	}
//
//	public void setRefundflag(BigDecimal refundflag) {
//		this.refundflag = refundflag;
//	}

	public String getRenewalOption() {
		return this.renewalOption;
	}

	public void setRenewalOption(String renewalOption) {
		this.renewalOption = renewalOption;
	}

//	public BigDecimal getRenewalTechnicalApplicable() {
//		return this.renewalTechnicalApplicable;
//	}
//
//	public void setRenewalTechnicalApplicable(BigDecimal renewalTechnicalApplicable) {
//		this.renewalTechnicalApplicable = renewalTechnicalApplicable;
//	}
//
//	public BigDecimal getRenewalapplicable() {
//		return this.renewalapplicable;
//	}
//
//	public void setRenewalapplicable(BigDecimal renewalapplicable) {
//		this.renewalapplicable = renewalapplicable;
//	}

	public String getRenewalnoticeGeneratedDate() {
		return this.renewalnoticeGeneratedDate;
	}

	public void setRenewalnoticeGeneratedDate(String renewalnoticeGeneratedDate) {
		this.renewalnoticeGeneratedDate = renewalnoticeGeneratedDate;
	}

//	public BigDecimal getResellLetterGenerated() {
//		return this.resellLetterGenerated;
//	}
//
//	public void setResellLetterGenerated(BigDecimal resellLetterGenerated) {
//		this.resellLetterGenerated = resellLetterGenerated;
//	}

	public String getRiskaccumulationCode() {
		return this.riskaccumulationCode;
	}

	public void setRiskaccumulationCode(String riskaccumulationCode) {
		this.riskaccumulationCode = riskaccumulationCode;
	}

	public String getRmcode() {
		return this.rmcode;
	}

	public void setRmcode(String rmcode) {
		this.rmcode = rmcode;
	}

	public String getSalescompany() {
		return this.salescompany;
	}

	public void setSalescompany(String salescompany) {
		this.salescompany = salescompany;
	}

	public String getScLetterGeneratedDate() {
		return this.scLetterGeneratedDate;
	}

	public void setScLetterGeneratedDate(String scLetterGeneratedDate) {
		this.scLetterGeneratedDate = scLetterGeneratedDate;
	}

	public String getSelectedGroupCode() {
		return this.selectedGroupCode;
	}

	public void setSelectedGroupCode(String selectedGroupCode) {
		this.selectedGroupCode = selectedGroupCode;
	}

	public String getSelectedPartyCode() {
		return this.selectedPartyCode;
	}

	public void setSelectedPartyCode(String selectedPartyCode) {
		this.selectedPartyCode = selectedPartyCode;
	}

	public String getSelectedPaymentMode() {
		return this.selectedPaymentMode;
	}

	public void setSelectedPaymentMode(String selectedPaymentMode) {
		this.selectedPaymentMode = selectedPaymentMode;
	}

	public String getSelectedhigherexcess() {
		return this.selectedhigherexcess;
	}

	public void setSelectedhigherexcess(String selectedhigherexcess) {
		this.selectedhigherexcess = selectedhigherexcess;
	}

	public String getSelforbehalf() {
		return this.selforbehalf;
	}

	public void setSelforbehalf(String selforbehalf) {
		this.selforbehalf = selforbehalf;
	}

	public String getServiceManagerCode() {
		return this.serviceManagerCode;
	}

	public void setServiceManagerCode(String serviceManagerCode) {
		this.serviceManagerCode = serviceManagerCode;
	}

//	public BigDecimal getShowCovernoteprint() {
//		return this.showCovernoteprint;
//	}
//
//	public void setShowCovernoteprint(BigDecimal showCovernoteprint) {
//		this.showCovernoteprint = showCovernoteprint;
//	}
//
//	public BigDecimal getShowPolicyprint() {
//		return this.showPolicyprint;
//	}
//
//	public void setShowPolicyprint(BigDecimal showPolicyprint) {
//		this.showPolicyprint = showPolicyprint;
//	}
//
//	public BigDecimal getShowProposalprint() {
//		return this.showProposalprint;
//	}
//
//	public void setShowProposalprint(BigDecimal showProposalprint) {
//		this.showProposalprint = showProposalprint;
//	}

	public String getSubchannel() {
		return this.subchannel;
	}

	public void setSubchannel(String subchannel) {
		this.subchannel = subchannel;
	}

	public String getSubline() {
		return this.subline;
	}

	public void setSubline(String subline) {
		this.subline = subline;
	}

	public String getSubplan() {
		return this.subplan;
	}

	public void setSubplan(String subplan) {
		this.subplan = subplan;
	}

	public String getSubquotenumber() {
		return this.subquotenumber;
	}

	public void setSubquotenumber(String subquotenumber) {
		this.subquotenumber = subquotenumber;
	}

	public String getSubvertical() {
		return this.subvertical;
	}

	public void setSubvertical(String subvertical) {
		this.subvertical = subvertical;
	}

//	public BigDecimal getTechdiscapplicable() {
//		return this.techdiscapplicable;
//	}
//
//	public void setTechdiscapplicable(BigDecimal techdiscapplicable) {
//		this.techdiscapplicable = techdiscapplicable;
//	}

//	public double getTechnicaldiscount() {
//		return this.technicaldiscount;
//	}
//
//	public void setTechnicaldiscount(double technicaldiscount) {
//		this.technicaldiscount = technicaldiscount;
//	}

//	public double getTerrorismcommission() {
//		return this.terrorismcommission;
//	}
//
//	public void setTerrorismcommission(double terrorismcommission) {
//		this.terrorismcommission = terrorismcommission;
//	}

	public String getTpExemption() {
		return this.tpExemption;
	}

	public void setTpExemption(String tpExemption) {
		this.tpExemption = tpExemption;
	}

	public String getTpacode() {
		return this.tpacode;
	}

	public void setTpacode(String tpacode) {
		this.tpacode = tpacode;
	}

	public String getTparate() {
		return this.tparate;
	}

	public void setTparate(String tparate) {
		this.tparate = tparate;
	}

	public String getTransRighntsAgent() {
		return this.transRighntsAgent;
	}

	public void setTransRighntsAgent(String transRighntsAgent) {
		this.transRighntsAgent = transRighntsAgent;
	}

	public String getTransactiontype() {
		return this.transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public String getTypeOfBusiness() {
		return this.typeOfBusiness;
	}

	public void setTypeOfBusiness(String typeOfBusiness) {
		this.typeOfBusiness = typeOfBusiness;
	}

//	public Date getUploadeddate() {
//		return this.uploadeddate;
//	}
//
//	public void setUploadeddate(Date uploadeddate) {
//		this.uploadeddate = uploadeddate;
//	}

	public String getUploadedtime() {
		return this.uploadedtime;
	}

	public void setUploadedtime(String uploadedtime) {
		this.uploadedtime = uploadedtime;
	}

	public String getUprbasis() {
		return this.uprbasis;
	}

	public void setUprbasis(String uprbasis) {
		this.uprbasis = uprbasis;
	}

//	public BigDecimal getUprgenerated() {
//		return this.uprgenerated;
//	}
//
//	public void setUprgenerated(BigDecimal uprgenerated) {
//		this.uprgenerated = uprgenerated;
//	}
//
//	public BigDecimal getUwyr() {
//		return this.uwyr;
//	}
//
//	public void setUwyr(BigDecimal uwyr) {
//		this.uwyr = uwyr;
//	}
//
//	public BigDecimal getValetcareoriginalprinted() {
//		return this.valetcareoriginalprinted;
//	}
//
//	public void setValetcareoriginalprinted(BigDecimal valetcareoriginalprinted) {
//		this.valetcareoriginalprinted = valetcareoriginalprinted;
//	}

	public String getValidityDate() {
		return this.validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}

//	public BigDecimal getVersionnumber() {
//		return this.versionnumber;
//	}
//
//	public void setVersionnumber(BigDecimal versionnumber) {
//		this.versionnumber = versionnumber;
//	}

	public String getVersionreasons() {
		return this.versionreasons;
	}

	public void setVersionreasons(String versionreasons) {
		this.versionreasons = versionreasons;
	}

	public String getVerticalBasedAuth() {
		return this.verticalBasedAuth;
	}

	public void setVerticalBasedAuth(String verticalBasedAuth) {
		this.verticalBasedAuth = verticalBasedAuth;
	}

	public String getVerticalchannel() {
		return this.verticalchannel;
	}

	public void setVerticalchannel(String verticalchannel) {
		this.verticalchannel = verticalchannel;
	}

	public String getWeightedaveragerate() {
		return this.weightedaveragerate;
	}

	public void setWeightedaveragerate(String weightedaveragerate) {
		this.weightedaveragerate = weightedaveragerate;
	}

	public String getWorkflowstatus() {
		return this.workflowstatus;
	}

	public void setWorkflowstatus(String workflowstatus) {
		this.workflowstatus = workflowstatus;
	}

	public String getXgenpolicycode() {
		return this.xgenpolicycode;
	}

	public void setXgenpolicycode(String xgenpolicycode) {
		this.xgenpolicycode = xgenpolicycode;
	}
}
//	public Insuranceoaagent getInsuranceoaagent() {
//		return this.insuranceoaagent;
//	}
//
//	public void setInsuranceoaagent(Insuranceoaagent insuranceoaagent) {
//		this.insuranceoaagent = insuranceoaagent;
//	}

*/