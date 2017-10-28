/*package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;



@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(precision=10, scale=2)
	private BigDecimal commission;

	@Column(length=55)
	private String effectiveenddate;

	@Column(length=55)
	private String effectivestatrtdate;

	@Column(length=255)
	private String emailbcc;

	@Column(length=30)
	private String flag;

	@Id
	@Column(precision=22)
	private Long id;

	@Column(precision=10)
	private BigDecimal inceptiondatebackdays;

	@Column(precision=10)
	private BigDecimal inceptiondatefuturedays;

	@Column(length=255)
	private String lineofbusiness;

	@Column(precision=10)
	private BigDecimal minimumsi;

	@Column(length=155)
	private String productdisplayname;

	@Column(length=255)
	private String productname;

	@Column(precision=5)
	private BigDecimal quotevalidity;

	@Column(length=255)
	private String subline;

	@Column(precision=10)
	private BigDecimal totalsuminsuredlimit;

	@Column(name="XGEN_PRODUCT_NAME", length=255)
	private String xgenProductName;

	public Product() {
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getEffectiveenddate() {
		return this.effectiveenddate;
	}

	public void setEffectiveenddate(String effectiveenddate) {
		this.effectiveenddate = effectiveenddate;
	}

	public String getEffectivestatrtdate() {
		return this.effectivestatrtdate;
	}

	public void setEffectivestatrtdate(String effectivestatrtdate) {
		this.effectivestatrtdate = effectivestatrtdate;
	}

	public String getEmailbcc() {
		return this.emailbcc;
	}

	public void setEmailbcc(String emailbcc) {
		this.emailbcc = emailbcc;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getInceptiondatebackdays() {
		return this.inceptiondatebackdays;
	}

	public void setInceptiondatebackdays(BigDecimal inceptiondatebackdays) {
		this.inceptiondatebackdays = inceptiondatebackdays;
	}

	public BigDecimal getInceptiondatefuturedays() {
		return this.inceptiondatefuturedays;
	}

	public void setInceptiondatefuturedays(BigDecimal inceptiondatefuturedays) {
		this.inceptiondatefuturedays = inceptiondatefuturedays;
	}

	public String getLineofbusiness() {
		return this.lineofbusiness;
	}

	public void setLineofbusiness(String lineofbusiness) {
		this.lineofbusiness = lineofbusiness;
	}

	public BigDecimal getMinimumsi() {
		return this.minimumsi;
	}

	public void setMinimumsi(BigDecimal minimumsi) {
		this.minimumsi = minimumsi;
	}

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

	public BigDecimal getQuotevalidity() {
		return this.quotevalidity;
	}

	public void setQuotevalidity(BigDecimal quotevalidity) {
		this.quotevalidity = quotevalidity;
	}

	public String getSubline() {
		return this.subline;
	}

	public void setSubline(String subline) {
		this.subline = subline;
	}

	public BigDecimal getTotalsuminsuredlimit() {
		return this.totalsuminsuredlimit;
	}

	public void setTotalsuminsuredlimit(BigDecimal totalsuminsuredlimit) {
		this.totalsuminsuredlimit = totalsuminsuredlimit;
	}

	public String getXgenProductName() {
		return this.xgenProductName;
	}

	public void setXgenProductName(String xgenProductName) {
		this.xgenProductName = xgenProductName;
	}

}*/