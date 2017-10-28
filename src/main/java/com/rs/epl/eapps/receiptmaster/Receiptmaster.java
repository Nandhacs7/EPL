/*package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="RECEIPTMASTER")
public class Receiptmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="ACCOUNT_HOLDER_NAME", length=50)
	private String accountHolderName;

	@Column(length=255)
	private String address1;

	@Column(length=255)
	private String address2;

	@Column(name="AGENT_CODE", length=255)
	private String agentCode;

	@Column(name="BALANCE_AMOUNT", precision=126)
	private double balanceAmount;

	@Column(length=255)
	private String bankaccount;

	@Column(length=255)
	private String bankcode;

	@Column(name="BUSINESS_STATUS", length=255)
	private String businessStatus;

	@Column(length=255)
	private String cbcnumber;

	@Column(length=255)
	private String cdnumber;

	@Column(name="CHEQUE_AMOUNT", precision=126)
	private double chequeAmount;

	@Column(name="CHEQUE_BANK", length=255)
	private String chequeBank;

	@Column(name="CHEQUE_BRANCH", length=255)
	private String chequeBranch;

	@Column(name="CHEQUE_DATE", length=255)
	private String chequeDate;

	@Column(name="CHEQUE_NUMBER", length=255)
	private String chequeNumber;

	@Column(length=255)
	private String city;

	@Column(name="CREATED_BY", length=255)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(length=255)
	private String crecardexpirydate;

	@Column(precision=19)
	private double crecardtranamount;

	@Column(length=255)
	private String crecardtrandate;

	@Column(length=255)
	private String creditcardbank;

	@Column(length=255)
	private String creditcardno;

	@Column(length=255)
	private String creditcardreferencenumber;

	@Column(length=255)
	private String creditcardtype;

	@Column(name="CUSTOMER_DEPOSIT", precision=22)
	private BigDecimal customerDeposit;

	@Column(name="CUSTOMER_NAME", length=255)
	private String customerName;

	@Column(length=16)
	private String dateofremittance;

	@Column(name="DEPOSITING_BRANCH", length=255)
	private String depositingBranch;

	@Column(length=255)
	private String description;

	@Column(length=255)
	private String directdebittransactionno;

	@Column(length=255)
	private String email;

	@Column(length=255)
	private String fax;

	@Column(length=255)
	private String firstname;

	@Column(length=255)
	private String gender;

	@Column(precision=19)
	private BigDecimal hasuploaded;

	@Column(name="IFSC_CODE", length=20)
	private String ifscCode;

	@Column(length=500)
	private String intermediarybank;

	@Column(name="IS_RECEIPT_INTERNAL_PURPOSE", precision=1)
	private BigDecimal isReceiptInternalPurpose;

	@Column(precision=1)
	private BigDecimal isapdreceipt;

	@Column(name="ISSUED_TO", length=255)
	private String issuedTo;

	@Column(length=255)
	private String lastname;

	@Column(name="LEGACY_CODE", length=255)
	private String legacyCode;

	@Column(name="LOCAL_CHEQUE", precision=1)
	private BigDecimal localCheque;

	@Column(name="MICR_CODE", length=30)
	private String micrCode;

	@Column(length=255)
	private String phone1;

	@Column(length=255)
	private String phone2;

	@Column(length=255)
	private String pincode;

	@Column(name="POLICY_NUMBER", length=255)
	private String policyNumber;

	@Column(name="POS_CODE", length=255)
	private String posCode;

	@Column(name="POS_NAME", length=255)
	private String posName;

	@Column(name="PRODUCT_CODE", length=255)
	private String productCode;

	@Column(name="REALIZATION_UPDATED_DATE", length=255)
	private String realizationUpdatedDate;

	@Column(length=255)
	private String realizationdate;

	@Column(name="RECEIPT_BRANCH", length=255)
	private String receiptBranch;

	@Column(name="RECEIPT_DATE", length=255)
	private String receiptDate;

	@Column(name="RECEIPT_NUMBER", length=255)
	private String receiptNumber;

	@Column(name="RECEIPT_STATUS", length=255)
	private String receiptStatus;

	@Column(name="RECEIPT_STATUS_APPROVED_BY", length=255)
	private String receiptStatusApprovedBy;

	@Column(length=255)
	private String receiptfor;

	@Temporal(TemporalType.DATE)
	@Column(name="RECEIVED_DATE")
	private Date receivedDate;

	@Column(length=255)
	private String roleplayercode;

	@Column(length=100)
	private String rsaccountnumber;

	@Column(name="SETTLING_AGENT_NAME", length=255)
	private String settlingAgentName;

	@Column(name="\"STATE\"", length=255)
	private String state;

	@Column(length=255)
	private String title;

	@Column(precision=126)
	private String totalamount;

	@Column(precision=19)
	private double totalcreditamount;

	@Column(precision=126)
	private String transactionamount;

	@Column(length=50)
	private String transactiondate;

	@Column(length=255)
	private String transactionno;

	@Column(length=255)
	private String uploadedtime;

	@Column(length=100)
	private String utrnumber;

	@Column(name="VALUE_DATE", length=255)
	private String valueDate;

	public Receiptmaster() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return this.accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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

	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public double getBalanceAmount() {
		return this.balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getBankaccount() {
		return this.bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}

	public String getBankcode() {
		return this.bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getCbcnumber() {
		return this.cbcnumber;
	}

	public void setCbcnumber(String cbcnumber) {
		this.cbcnumber = cbcnumber;
	}

	public String getCdnumber() {
		return this.cdnumber;
	}

	public void setCdnumber(String cdnumber) {
		this.cdnumber = cdnumber;
	}

	public double getChequeAmount() {
		return this.chequeAmount;
	}

	public void setChequeAmount(double chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public String getChequeBank() {
		return this.chequeBank;
	}

	public void setChequeBank(String chequeBank) {
		this.chequeBank = chequeBank;
	}

	public String getChequeBranch() {
		return this.chequeBranch;
	}

	public void setChequeBranch(String chequeBranch) {
		this.chequeBranch = chequeBranch;
	}

	public String getChequeDate() {
		return this.chequeDate;
	}

	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getChequeNumber() {
		return this.chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCrecardexpirydate() {
		return this.crecardexpirydate;
	}

	public void setCrecardexpirydate(String crecardexpirydate) {
		this.crecardexpirydate = crecardexpirydate;
	}

	public double getCrecardtranamount() {
		return this.crecardtranamount;
	}

	public void setCrecardtranamount(double crecardtranamount) {
		this.crecardtranamount = crecardtranamount;
	}

	public String getCrecardtrandate() {
		return this.crecardtrandate;
	}

	public void setCrecardtrandate(String crecardtrandate) {
		this.crecardtrandate = crecardtrandate;
	}

	public String getCreditcardbank() {
		return this.creditcardbank;
	}

	public void setCreditcardbank(String creditcardbank) {
		this.creditcardbank = creditcardbank;
	}

	public String getCreditcardno() {
		return this.creditcardno;
	}

	public void setCreditcardno(String creditcardno) {
		this.creditcardno = creditcardno;
	}

	public String getCreditcardreferencenumber() {
		return this.creditcardreferencenumber;
	}

	public void setCreditcardreferencenumber(String creditcardreferencenumber) {
		this.creditcardreferencenumber = creditcardreferencenumber;
	}

	public String getCreditcardtype() {
		return this.creditcardtype;
	}

	public void setCreditcardtype(String creditcardtype) {
		this.creditcardtype = creditcardtype;
	}

	public BigDecimal getCustomerDeposit() {
		return this.customerDeposit;
	}

	public void setCustomerDeposit(BigDecimal customerDeposit) {
		this.customerDeposit = customerDeposit;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDateofremittance() {
		return this.dateofremittance;
	}

	public void setDateofremittance(String dateofremittance) {
		this.dateofremittance = dateofremittance;
	}

	public String getDepositingBranch() {
		return this.depositingBranch;
	}

	public void setDepositingBranch(String depositingBranch) {
		this.depositingBranch = depositingBranch;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirectdebittransactionno() {
		return this.directdebittransactionno;
	}

	public void setDirectdebittransactionno(String directdebittransactionno) {
		this.directdebittransactionno = directdebittransactionno;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public BigDecimal getHasuploaded() {
		return this.hasuploaded;
	}

	public void setHasuploaded(BigDecimal hasuploaded) {
		this.hasuploaded = hasuploaded;
	}

	public String getIfscCode() {
		return this.ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getIntermediarybank() {
		return this.intermediarybank;
	}

	public void setIntermediarybank(String intermediarybank) {
		this.intermediarybank = intermediarybank;
	}

	public BigDecimal getIsReceiptInternalPurpose() {
		return this.isReceiptInternalPurpose;
	}

	public void setIsReceiptInternalPurpose(BigDecimal isReceiptInternalPurpose) {
		this.isReceiptInternalPurpose = isReceiptInternalPurpose;
	}

	public BigDecimal getIsapdreceipt() {
		return this.isapdreceipt;
	}

	public void setIsapdreceipt(BigDecimal isapdreceipt) {
		this.isapdreceipt = isapdreceipt;
	}

	public String getIssuedTo() {
		return this.issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLegacyCode() {
		return this.legacyCode;
	}

	public void setLegacyCode(String legacyCode) {
		this.legacyCode = legacyCode;
	}

	public BigDecimal getLocalCheque() {
		return this.localCheque;
	}

	public void setLocalCheque(BigDecimal localCheque) {
		this.localCheque = localCheque;
	}

	public String getMicrCode() {
		return this.micrCode;
	}

	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPolicyNumber() {
		return this.policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPosCode() {
		return this.posCode;
	}

	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}

	public String getPosName() {
		return this.posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRealizationUpdatedDate() {
		return this.realizationUpdatedDate;
	}

	public void setRealizationUpdatedDate(String realizationUpdatedDate) {
		this.realizationUpdatedDate = realizationUpdatedDate;
	}

	public String getRealizationdate() {
		return this.realizationdate;
	}

	public void setRealizationdate(String realizationdate) {
		this.realizationdate = realizationdate;
	}

	public String getReceiptBranch() {
		return this.receiptBranch;
	}

	public void setReceiptBranch(String receiptBranch) {
		this.receiptBranch = receiptBranch;
	}

	public String getReceiptDate() {
		return this.receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getReceiptNumber() {
		return this.receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public String getReceiptStatus() {
		return this.receiptStatus;
	}

	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public String getReceiptStatusApprovedBy() {
		return this.receiptStatusApprovedBy;
	}

	public void setReceiptStatusApprovedBy(String receiptStatusApprovedBy) {
		this.receiptStatusApprovedBy = receiptStatusApprovedBy;
	}

	public String getReceiptfor() {
		return this.receiptfor;
	}

	public void setReceiptfor(String receiptfor) {
		this.receiptfor = receiptfor;
	}

	public Date getReceivedDate() {
		return this.receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getRoleplayercode() {
		return this.roleplayercode;
	}

	public void setRoleplayercode(String roleplayercode) {
		this.roleplayercode = roleplayercode;
	}

	public String getRsaccountnumber() {
		return this.rsaccountnumber;
	}

	public void setRsaccountnumber(String rsaccountnumber) {
		this.rsaccountnumber = rsaccountnumber;
	}

	public String getSettlingAgentName() {
		return this.settlingAgentName;
	}

	public void setSettlingAgentName(String settlingAgentName) {
		this.settlingAgentName = settlingAgentName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

	public double getTotalcreditamount() {
		return this.totalcreditamount;
	}

	public void setTotalcreditamount(double totalcreditamount) {
		this.totalcreditamount = totalcreditamount;
	}

	public String getTransactionamount() {
		return this.transactionamount;
	}

	public void setTransactionamount(String transactionamount) {
		this.transactionamount = transactionamount;
	}

	public String getTransactiondate() {
		return this.transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransactionno() {
		return this.transactionno;
	}

	public void setTransactionno(String transactionno) {
		this.transactionno = transactionno;
	}

	public String getUploadedtime() {
		return this.uploadedtime;
	}

	public void setUploadedtime(String uploadedtime) {
		this.uploadedtime = uploadedtime;
	}

	public String getUtrnumber() {
		return this.utrnumber;
	}

	public void setUtrnumber(String utrnumber) {
		this.utrnumber = utrnumber;
	}

	public String getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

}*/