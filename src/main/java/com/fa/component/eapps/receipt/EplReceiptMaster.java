/*package com.fa.component.eapps.receipt;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.sql.Timestamp;



@Entity
@Table(name="EPL_RECEIPT_MASTER")
public class EplReceiptMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=50)
	private String agentcode;

	@Column(length=255)
	private String bankcity;

	@Column(length=255)
	private String cbc;

	@Column(length=50)
	private String createdcode;

	@Column(length=255)
	private String depositingbankcode;

	@Column(precision=19)
	@GenericGenerator(name = "Eapp-Receipt", strategy = "increment")
	@GeneratedValue(generator = "Eapp-Receipt")
	@Id
	private Long id;
	
	@Column(name="BRANCHCODE")
	private String branchcode;

	@Column(length=255)
	private String ifsccode;

	@Column(length=255)
	private String instrumentbank;

	@Column(length=255)
	private String instrumentbranch;

	private Timestamp instrumentdate;

	@Column(length=255)
	private String instrumentexpdt;

	@Column(length=255)
	private String instrumentnumber;

	@Column(length=255)
	private String instrumenttype;

	@Column(precision=1)
	private BigDecimal iscustomerpayment;

	@Column(precision=1)
	private BigDecimal islocalinstrument;

	@Column(length=255)
	private String micrcode;

	@Column(name="MVMT_DATE", length=50)
	private String mvmtDate;

	@Column(name="MVMT_STATUS", length=50)
	private String mvmtStatus;

	@Column(length=255)
	private String payeename;

	@Column(length=255)
	private String paymentamount;

	@Column(length=255)
	private String paymentdate;

	@Column(length=255)
	private String paymenttype;

	@Column(length=255)
	private String payto;

	@Column(length=255)
	private String pgserviceprovider;

	@Column(precision=19)
	private BigDecimal polid;

	@Column(length=50)
	private String polno;

	@Column(name="RECEIPT_AMOUNT", length=255)
	private String receiptAmount;

	@Column(length=255)
	private String receiptnumber;

	@Column(length=50)
	private String source;

	@Column(name="TRANSCATION_NO", length=255)
	private String transcationNo;

	public EplReceiptMaster() {
	}

	public String getAgentcode() {
		return this.agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	public String getBankcity() {
		return this.bankcity;
	}

	public void setBankcity(String bankcity) {
		this.bankcity = bankcity;
	}

	public String getCbc() {
		return this.cbc;
	}

	public void setCbc(String cbc) {
		this.cbc = cbc;
	}

	public String getCreatedcode() {
		return this.createdcode;
	}

	public void setCreatedcode(String createdcode) {
		this.createdcode = createdcode;
	}

	public String getDepositingbankcode() {
		return this.depositingbankcode;
	}

	public void setDepositingbankcode(String depositingbankcode) {
		this.depositingbankcode = depositingbankcode;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIfsccode() {
		return this.ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getInstrumentbank() {
		return this.instrumentbank;
	}

	public void setInstrumentbank(String instrumentbank) {
		this.instrumentbank = instrumentbank;
	}

	public String getInstrumentbranch() {
		return this.instrumentbranch;
	}

	public void setInstrumentbranch(String instrumentbranch) {
		this.instrumentbranch = instrumentbranch;
	}

	public Timestamp getInstrumentdate() {
		return this.instrumentdate;
	}

	public void setInstrumentdate(Timestamp instrumentdate) {
		this.instrumentdate = instrumentdate;
	}

	public String getInstrumentexpdt() {
		return this.instrumentexpdt;
	}

	public void setInstrumentexpdt(String instrumentexpdt) {
		this.instrumentexpdt = instrumentexpdt;
	}

	public String getInstrumentnumber() {
		return this.instrumentnumber;
	}

	public void setInstrumentnumber(String instrumentnumber) {
		this.instrumentnumber = instrumentnumber;
	}

	public String getInstrumenttype() {
		return this.instrumenttype;
	}

	public void setInstrumenttype(String instrumenttype) {
		this.instrumenttype = instrumenttype;
	}

	public BigDecimal getIscustomerpayment() {
		return this.iscustomerpayment;
	}

	public void setIscustomerpayment(BigDecimal iscustomerpayment) {
		this.iscustomerpayment = iscustomerpayment;
	}

	public BigDecimal getIslocalinstrument() {
		return this.islocalinstrument;
	}

	public void setIslocalinstrument(BigDecimal islocalinstrument) {
		this.islocalinstrument = islocalinstrument;
	}

	public String getMicrcode() {
		return this.micrcode;
	}

	public void setMicrcode(String micrcode) {
		this.micrcode = micrcode;
	}

	public String getMvmtDate() {
		return this.mvmtDate;
	}

	public void setMvmtDate(String mvmtDate) {
		this.mvmtDate = mvmtDate;
	}

	public String getMvmtStatus() {
		return this.mvmtStatus;
	}

	public void setMvmtStatus(String mvmtStatus) {
		this.mvmtStatus = mvmtStatus;
	}

	public String getPayeename() {
		return this.payeename;
	}

	public void setPayeename(String payeename) {
		this.payeename = payeename;
	}

	public String getPaymentamount() {
		return this.paymentamount;
	}

	public void setPaymentamount(String paymentamount) {
		this.paymentamount = paymentamount;
	}

	public String getPaymentdate() {
		return this.paymentdate;
	}

	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}

	public String getPaymenttype() {
		return this.paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public String getPayto() {
		return this.payto;
	}

	public void setPayto(String payto) {
		this.payto = payto;
	}

	public String getPgserviceprovider() {
		return this.pgserviceprovider;
	}

	public void setPgserviceprovider(String pgserviceprovider) {
		this.pgserviceprovider = pgserviceprovider;
	}

	public BigDecimal getPolid() {
		return this.polid;
	}

	public void setPolid(BigDecimal polid) {
		this.polid = polid;
	}

	public String getPolno() {
		return this.polno;
	}

	public void setPolno(String polno) {
		this.polno = polno;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getReceiptnumber() {
		return this.receiptnumber;
	}

	public void setReceiptnumber(String receiptnumber) {
		this.receiptnumber = receiptnumber;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTranscationNo() {
		return this.transcationNo;
	}

	public void setTranscationNo(String transcationNo) {
		this.transcationNo = transcationNo;
	}
	
	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

}*/