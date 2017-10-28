package com.fa.component.policy;
// Generated Feb 17, 2017 1:17:05 PM by Hibernate Tools 4.3.5.Final

//import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Policy generated by hbm2java
 * 
 * 
 */
@Entity
@Table(name = "POLICY")
@Access(AccessType.PROPERTY)
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="employee")
public class Policy implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
//	@GenericGenerator(name = "Policy", strategy = "increment")
//	@GeneratedValue(generator = "Policy")
	
	@Id
	@Access(AccessType.FIELD)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "partner_sequence")
	@SequenceGenerator(initialValue=1, allocationSize=1,name = "partner_sequence",sequenceName="POLICY_SEQ")
	private Long polid;
	private Policyclient policyclient;
	private String productcode;
//	private String productname;
	private String productdisplayname;
//	private String ratingproductname;
//	private String coreproductcode;
	private String lineofbusiness;
//	private String subline;
//	private String planname;
//	private String subplanname;
	private String transactiontype;
//	private String endorsementtype;
//	private String endorsementname;
	private String polno;
	private String quoteno;
//	private String covernoteno;
//	private String endtno;
	private String proposalno;
	private String previouspolno;
	private String effectivedate;
	private String polstartdate;
	private String polexpirydate;
//	private Date endorsementdate;
	private String creationdate;
	private String proposalDate;
	@Column(name="noofitem")
	private int noofitem=1;
    private String accountDate;
//	private String createduser;
//	private String createdusertype;
//	private Date modifieddate;
	private Date covernotedate;
//	private String moifiedby;
//	private Boolean isportablepolicy;
//	private Boolean isautorenewal;
//	private Boolean isrenewaldone;
	private String policystatus;
	private String agentcode;
//	private String agentname;
	private String oacode;
	private String branchcode;
//	private String branchname;
	private String modeofbusiness;
//	private String channelofbusiness;
	private String bdocode;
//	private String bdoname;
//	private String tpacode;
//	private String tpaname;
	private Double policysuminsuredamount;
	private Double policypremium;
//	private Double endorsmentpremium;
//	private Double covernotepremium;
//	private Double tpacharges;
//	private Double paidamount;
//	private Double shortfallamount;
//	private Boolean installmentapplicable;
//	private Long noofinstallments;
//	private Long noofpaidinstallments;
//	private String installmentfrequency;
//	private Double installmentamount;
//	private Boolean isprintgenerated;
//	private Boolean isprintindms;
//	private Long versionno;
//	private Boolean islatestversion;
//	private BigDecimal batchid;
	private String batchname;
//	private String batchuser;
	private String fromsystem;
	private String uwyr;
	private String polStartTime;
	private String polExpTime;
	@Column(name="SETTLEMENT_TYPE")
	private String SETTLEMENT_TYPE;
/*	private Set<Policyelement> policyelements = new HashSet<Policyelement>(0);*/
	private Set<Policyitem> policyitems = new HashSet<Policyitem>(0);
/*	private Set<Policyvariables> policyvariableses = new HashSet<Policyvariables>(0);*/
	private Set<Payment> payments = new HashSet<Payment>(0);
	private Set<Policycoverage> policycoverages = new HashSet<Policycoverage>(0);
	@Column(name="PRODUCTID")
	private String productid;
	@Column(name="MFGNAME")
	private String mfgname;
	@Column(name="MFGCODE")
	private String mfgcode;
	
	public Policy() {
	}

	public Policy(Long polid) {
		this.polid = polid;
	}

/*	@Id
    @GenericGenerator(name = "custom_policy", strategy = "sequence" , parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
    })
	@GeneratedValue(generator = "custom_policy", strategy=GenerationType.SEQUENCE)
    @GeneratedValue(generator = "custom_policy")
	@Column(name = "POLID")	*/
	public Long getPolid() {
		return this.polid;
	}

	public void setPolid(Long polid) {
		this.polid = polid;
	}

//	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="POLCLIENTID")
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "policies", cascade = CascadeType.ALL)
	public Policyclient getPolicyclient() {
		return this.policyclient;
	}

	public void setPolicyclient(Policyclient policyclient) {
		this.policyclient = policyclient;
	}	
	@Column(name = "PRODUCTCODE")
	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

//	@Column(name = "PRODUCTNAME")
//	public String getProductname() {
//		return this.productname;
//	}
//
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}

	@Column(name = "PRODUCTDISPLAYNAME")
	public String getProductdisplayname() {
		return this.productdisplayname;
	}

	public void setProductdisplayname(String productdisplayname) {
		this.productdisplayname = productdisplayname;
	}

//	@Column(name = "RATINGPRODUCTNAME")
//	public String getRatingproductname() {
//		return this.ratingproductname;
//	}
//
//	public void setRatingproductname(String ratingproductname) {
//		this.ratingproductname = ratingproductname;
//	}
//
//	@Column(name = "COREPRODUCTCODE")
//	public String getCoreproductcode() {
//		return this.coreproductcode;
//	}
//
//	public void setCoreproductcode(String coreproductcode) {
//		this.coreproductcode = coreproductcode;
//	}

	@Column(name = "LINEOFBUSINESS")
	public String getLineofbusiness() {
		return this.lineofbusiness;
	}

	public void setLineofbusiness(String lineofbusiness) {
		this.lineofbusiness = lineofbusiness;
	}

//	@Column(name = "SUBLINE")
//	public String getSubline() {
//		return this.subline;
//	}
//
//	public void setSubline(String subaline) {
//		this.subline = subline;
//	}
//
//	@Column(name = "PLANNAME")
//	public String getPlanname() {
//		return this.planname;
//	}
//
//	public void setPlanname(String planname) {
//		this.planname = planname;
//	}
//
//	@Column(name = "SUBPLANNAME")
//	public String getSubplanname() {
//		return this.subplanname;
//	}
//
//	public void setSubplanname(String subplanname) {
//		this.subplanname = subplanname;
//	}

	@Column(name = "TRANSACTIONTYPE")
	public String getTransactiontype() {
		return this.transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
//
//	@Column(name = "ENDORSEMENTTYPE")
//	public String getEndorsementtype() {
//		return this.endorsementtype;
//	}
//
//	public void setEndorsementtype(String endorsementtype) {
//		this.endorsementtype = endorsementtype;
//	}
//
//	@Column(name = "ENDORSEMENTNAME")
//	public String getEndorsementname() {
//		return this.endorsementname;
//	}
//
//	public void setEndorsementname(String endorsementname) {
//		this.endorsementname = endorsementname;
//	}

	@Column(name = "POLNO")
	public String getPolno() {
		return this.polno;
	}

	public void setPolno(String polno) {
	 this.polno = polno;
	}

	@Column(name = "QUOTENO")
	public String getQuoteno() {
		return this.quoteno;
	}

	public void setQuoteno(String quoteno) {
		this.quoteno = quoteno;
	}
//
//	@Column(name = "COVERNOTENO")
//	public String getCovernoteno() {
//		return this.covernoteno;
//	}
//
//	public void setCovernoteno(String covernoteno) {
//		this.covernoteno = covernoteno;
//	}
//
//	@Column(name = "ENDTNO")
//	public String getEndtno() {
//		return this.endtno;
//	}
//
//	public void setEndtno(String endtno) {
//		this.endtno = endtno;
//	}

	@Column(name = "PROPOSALNO")
	public String getProposalno() {
		return this.proposalno;
	}

	public void setProposalno(String proposalno) {
		this.proposalno = proposalno;
	}

	@Column(name = "PREVIOUSPOLNO")
	public String getPreviouspolno() {
		return this.previouspolno;
	}

	public void setPreviouspolno(String previouspolno) {
		this.previouspolno = previouspolno;
	}

	@Column(name = "EFFECTIVEDATE")
	public String getEffectivedate() {
		return this.effectivedate;
	}

	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	@Column(name = "POLSTARTDATE")
	public String getPolstartdate() {
		return this.polstartdate;
	}

	public void setPolstartdate(String polstartdate,String polStartTime) {
		this.polStartTime=polStartTime;
		this.polstartdate = polstartdate;
		polstartdate=polstartdate.concat(polStartTime);
	}

	@Column(name = "POLEXPIRYDATE")
	public String getPolexpirydate() {
		return this.polexpirydate;
	}

	
//	public void setPolexpirydate(String polexpirydate,String polExpTime) {
//		this.polExpTime=polExpTime;
//		this.polexpirydate = polexpirydate;
//		this.polexpirydate=polexpirydate.concat(polExpTime);
//	}

	public void setPolexpirydate(String polexpirydate) {
		this.polexpirydate = polexpirydate;
	}

//	@Column(name = "ENDORSEMENTDATE")
//	public Date getEndorsementdate() {
//		return this.endorsementdate;
//	}
//
//	public void setEndorsementdate(Date endorsementdate) {
//		this.endorsementdate = endorsementdate;
//	}

	@Column(name = "CREATIONDATE")
	public String getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

//	@Column(name = "CREATEDUSER")
//	public String getCreateduser() {
//		return this.createduser;
//	}
//
//	public void setCreateduser(String createduser) {
//		this.createduser = createduser;
//	}
//
//	@Column(name = "CREATEDUSERTYPE")
//	public String getCreatedusertype() {
//		return this.createdusertype;
//	}
//
//	public void setCreatedusertype(String createdusertype) {
//		this.createdusertype = createdusertype;
//	}
//
//	@Column(name = "MODIFIEDDATE")
//	public Date getModifieddate() {
//		return this.modifieddate;
//	}
//
//	public void setModifieddate(Date modifieddate) {
//		this.modifieddate = modifieddate;
//	}

	@Column(name = "COVERNOTEDATE")
	public Date getCovernotedate() {
		return this.covernotedate;
	}

	public void setCovernotedate(Date covernotedate) {
		this.covernotedate = covernotedate;
	}

//	@Column(name = "MOIFIEDBY")
//	public String getMoifiedby() {
//		return this.moifiedby;
//	}
//
//	public void setMoifiedby(String moifiedby) {
//		this.moifiedby = moifiedby;
//	}

//	@Column(name = "ISPORTABLEPOLICY", precision = 1, scale = 0)
//	public Boolean getIsportablepolicy() {
//		return this.isportablepolicy;
//	}
//
//	public void setIsportablepolicy(Boolean isportablepolicy) {
//		this.isportablepolicy = isportablepolicy;
//	}
//
//	@Column(name = "ISAUTORENEWAL", precision = 1, scale = 0)
//	public Boolean getIsautorenewal() {
//		return this.isautorenewal;
//	}
//
//	public void setIsautorenewal(Boolean isautorenewal) {
//		this.isautorenewal = isautorenewal;
//	}
//
//	@Column(name = "ISRENEWALDONE", precision = 1, scale = 0)
//	public Boolean getIsrenewaldone() {
//		return this.isrenewaldone;
//	}
//
//	public void setIsrenewaldone(Boolean isrenewaldone) {
//		this.isrenewaldone = isrenewaldone;
//	}

	@Column(name = "POLICYSTATUS")
	public String getPolicystatus() {
		return this.policystatus;
	}

	public void setPolicystatus(String policystatus) {
		this.policystatus = policystatus;
	}

	@Column(name = "AGENTCODE")
	public String getAgentcode() {
		return this.agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

//	@Column(name = "AGENTNAME")
//	public String getAgentname() {
//		return this.agentname;
//	}
//
//	public void setAgentname(String agentname) {
//		this.agentname = agentname;
//	}

	@Column(name = "OACODE")
	public String getOacode() {
		return this.oacode;
	}

	public void setOacode(String oacode) {
		this.oacode = oacode;
	}

	@Column(name = "BRANCHCODE")
	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

//	@Column(name = "BRANCHNAME")
//	public String getBranchname() {
//		return this.branchname;
//	}
//
//	public void setBranchname(String branchname) {
//		this.branchname = branchname;
//	}

	@Column(name = "MODEOFBUSINESS")
	public String getModeofbusiness() {
		return this.modeofbusiness;
	}

	public void setModeofbusiness(String modeofbusiness) {
		this.modeofbusiness = modeofbusiness;
	}

//	@Column(name = "CHANNELOFBUSINESS")
//	public String getChannelofbusiness() {
//		return this.channelofbusiness;
//	}
//
//	public void setChannelofbusiness(String channelofbusiness) {
//		this.channelofbusiness = channelofbusiness;
//	}

	@Column(name = "BDOCODE")
	public String getBdocode() {
		return this.bdocode;
	}

	public void setBdocode(String bdocode) {
		this.bdocode = bdocode;
	}

//	@Column(name = "BDONAME")
//	public String getBdoname() {
//		return this.bdoname;
//	}
//
//	public void setBdoname(String bdoname) {
//		this.bdoname = bdoname;
//	}
//
//	@Column(name = "TPACODE")
//	public String getTpacode() {
//		return this.tpacode;
//	}
//
//	public void setTpacode(String tpacode) {
//		this.tpacode = tpacode;
//	}
//
//	@Column(name = "TPANAME")
//	public String getTpaname() {
//		return this.tpaname;
//	}
//
//	public void setTpaname(String tpaname) {
//		this.tpaname = tpaname;
//	}

	@Column(name = "POLICYSUMINSUREDAMOUNT", precision = 126, scale = 0)
	public Double getPolicysuminsuredamount() {
		return this.policysuminsuredamount;
	}

	public void setPolicysuminsuredamount(Double policysuminsuredamount) {
		this.policysuminsuredamount = policysuminsuredamount;
	}

	@Column(name = "POLICYPREMIUM", precision = 126, scale = 0)
	public Double getPolicypremium() {
		return this.policypremium;
	}

	public void setPolicypremium(Double policypremium) {
		this.policypremium = policypremium;
	}

//	@Column(name = "ENDORSMENTPREMIUM", precision = 126, scale = 0)
//	public Double getEndorsmentpremium() {
//		return this.endorsmentpremium;
//	}
//
//	public void setEndorsmentpremium(Double endorsmentpremium) {
//		this.endorsmentpremium = endorsmentpremium;
//	}
//
//	@Column(name = "COVERNOTEPREMIUM", precision = 126, scale = 0)
//	public Double getCovernotepremium() {
//		return this.covernotepremium;
//	}
//
//	public void setCovernotepremium(Double covernotepremium) {
//		this.covernotepremium = covernotepremium;
//	}
//
//	@Column(name = "TPACHARGES", precision = 126, scale = 0)
//	public Double getTpacharges() {
//		return this.tpacharges;
//	}
//
//	public void setTpacharges(Double tpacharges) {
//		this.tpacharges = tpacharges;
//	}
//
//	@Column(name = "PAIDAMOUNT", precision = 126, scale = 0)
//	public Double getPaidamount() {
//		return this.paidamount;
//	}
//
//	public void setPaidamount(Double paidamount) {
//		this.paidamount = paidamount;
//	}
//
//	@Column(name = "SHORTFALLAMOUNT", precision = 126, scale = 0)
//	public Double getShortfallamount() {
//		return this.shortfallamount;
//	}
//
//	public void setShortfallamount(Double shortfallamount) {
//		this.shortfallamount = shortfallamount;
//	}
//
//	@Column(name = "INSTALLMENTAPPLICABLE", precision = 1, scale = 0)
//	public Boolean getInstallmentapplicable() {
//		return this.installmentapplicable;
//	}
//
//	public void setInstallmentapplicable(Boolean installmentapplicable) {
//		this.installmentapplicable = installmentapplicable;
//	}
//
//	@Column(name = "NOOFINSTALLMENTS", precision = 10, scale = 0)
//	public Long getNoofinstallments() {
//		return this.noofinstallments;
//	}
//
//	public void setNoofinstallments(Long noofinstallments) {
//		this.noofinstallments = noofinstallments;
//	}
//
//	@Column(name = "NOOFPAIDINSTALLMENTS", precision = 10, scale = 0)
//	public Long getNoofpaidinstallments() {
//		return this.noofpaidinstallments;
//	}
//
//	public void setNoofpaidinstallments(Long noofpaidinstallments) {
//		this.noofpaidinstallments = noofpaidinstallments;
//	}
//
//	@Column(name = "INSTALLMENTFREQUENCY")
//	public String getInstallmentfrequency() {
//		return this.installmentfrequency;
//	}
//
//	public void setInstallmentfrequency(String installmentfrequency) {
//		this.installmentfrequency = installmentfrequency;
//	}
//
//	@Column(name = "INSTALLMENTAMOUNT", precision = 126, scale = 0)
//	public Double getInstallmentamount() {
//		return this.installmentamount;
//	}
//
//	public void setInstallmentamount(Double installmentamount) {
//		this.installmentamount = installmentamount;
//	}
//
//	@Column(name = "ISPRINTGENERATED", precision = 1, scale = 0)
//	public Boolean getIsprintgenerated() {
//		return this.isprintgenerated;
//	}
//
//	public void setIsprintgenerated(Boolean isprintgenerated) {
//		this.isprintgenerated = isprintgenerated;
//	}
//
//	@Column(name = "ISPRINTINDMS", precision = 1, scale = 0)
//	public Boolean getIsprintindms() {
//		return this.isprintindms;
//	}
//
//	public void setIsprintindms(Boolean isprintindms) {
//		this.isprintindms = isprintindms;
//	}
//
//	@Column(name = "VERSIONNO", precision = 10, scale = 0)
//	public Long getVersionno() {
//		return this.versionno;
//	}
//
//	public void setVersionno(Long versionno) {
//		this.versionno = versionno;
//	}
//
//	@Column(name = "ISLATESTVERSION", precision = 1, scale = 0)
//	public Boolean getIslatestversion() {
//		return this.islatestversion;
//	}
//
//	public void setIslatestversion(Boolean islatestversion) {
//		this.islatestversion = islatestversion;
//	}
//
//	@Column(name = "BATCHID", scale = 0)
//	public BigDecimal getBatchid() {
//		return this.batchid;
//	}
//
//	public void setBatchid(BigDecimal batchid) {
//		this.batchid = batchid;
//	}
//
	@Column(name = "BATCHNAME")
	public String getBatchname() {
		return this.batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
//
//	@Column(name = "BATCHUSER")
//	public String getBatchuser() {
//		return this.batchuser;
//	}
//
//	public void setBatchuser(String batchuser) {
//		this.batchuser = batchuser;
//	}

	@Column(name = "FROMSYSTEM")
	public String getFromsystem() {
		return this.fromsystem;
	}

	public void setFromsystem(String fromsystem) {
		this.fromsystem = fromsystem;
	}

//	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "policy")
//	public Set<Policyelement> getPolicyelements() {
//		return this.policyelements;
//	}
//
//	public void setPolicyelements(Set<Policyelement> policyelements) {
//		this.policyelements = policyelements;
//	}

//	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "policy")
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "POLID")
	public Set<Policyitem> getPolicyitems() {
		return this.policyitems;
	}

	public void setPolicyitems(Set<Policyitem> policyitems) {
		this.policyitems = policyitems;
	}

//	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "policy")
//	public Set<Policyvariables> getPolicyvariableses() {
//		return this.policyvariableses;
//	}
//
//	public void setPolicyvariableses(Set<Policyvariables> policyvariableses) {
//		this.policyvariableses = policyvariableses;
//	}

//	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "policy")
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "POLID")
	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

//	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "policy")
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "POLID")
	public Set<Policycoverage> getPolicycoverages() {
		return this.policycoverages;
	}

	public void setPolicycoverages(Set<Policycoverage> policycoverages) {
		this.policycoverages = policycoverages;
	}
	public int getNoofitem() {
		return noofitem;
	}

	public void setNoofitem(int noofitem) {
		this.noofitem = noofitem;
	}
	@Column(name = "ProposalDate")
	public String getProposalDate() {
		return proposalDate;
	}

	public void setProposalDate(String proposalDate) {
		this.proposalDate = proposalDate;
	}
	@Column(name = "AccountDate")
	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	@Column(name = "Uwyr")
	public String getUwyr() {
		return uwyr;
	}

	public void setUwyr(String uwyr) {
		this.uwyr = uwyr;
	}

	public String getPolStartTime() {
		return polStartTime;
	}

	public void setPolStartTime(String polStartTime) {
		this.polStartTime = polStartTime;
	}

	public String getPolExpTime() {
		return polExpTime;
	}

	public void setPolExpTime(String polExpTime) {
		this.polExpTime = polExpTime;
	}

	public String getSETTLEMENT_TYPE() {
		return SETTLEMENT_TYPE;
	}

	public void setSETTLEMENT_TYPE(String sETTLEMENT_TYPE) {
		SETTLEMENT_TYPE = sETTLEMENT_TYPE;
	}

	public void setPolstartdate(String polstartdate) {
		this.polstartdate = polstartdate;
	}
	
	
	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getMfgname() {
		return mfgname;
	}

	public void setMfgname(String mfgname) {
		this.mfgname = mfgname;
	}

	public String getMfgcode() {
		return mfgcode;
	}

	public void setMfgcode(String mfgcode) {
		this.mfgcode = mfgcode;
	}

}
	
//	public String getPolStartTime() {
//		return polStartTime;
//	}
//
//	public void setPolStartTime(String polStartTime) {
//		this.polStartTime = polStartTime;
//	}
//
//	public String getPolExpTime() {
//		return polExpTime;
//	}
//
//	public void setPolExpTime(String polExpTime) {
//		this.polExpTime = polExpTime;
//	}
	
	
