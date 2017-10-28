package com.rs.epl.NB.oementity;

import java.io.Serializable;



import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * The persistent class for the TTRN_INSCOVERED_INFO_VGC database table.
 * 
 */
@Entity
@Table(name="TTRN_INSCOVERED_INFO_VGC")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnInscoveredInfoVgc implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="XGEN_POLICYNO", unique=true, nullable=false, length=16)
	private String xgenPolicyno;

	@Column(precision=10)
	private Long capacity;//changed from bigdecimal to Long

	@Column(length=30)
	private String chassisno;

	@Column(name="\"CLASS\"", length=5)
	private String class_;

	@Column(length=50)
	private String color;

	@Column(length=50)
	private String cover;

	@Column(length=10)
	private String deductible;

	@Column(precision=10)
	private BigDecimal deductiblesround1;

	@Column(precision=10)
	private BigDecimal deductiblesround2;

	@Column(precision=10)
	private BigDecimal deductiblesvgcapg;

	@Column(precision=10)
	private BigDecimal deductiblesvgcatd;

	@Column(precision=10)
	private BigDecimal deductiblesvgcbpr;

	@Column(precision=10)
	private BigDecimal deductiblesvgccng;

	@Column(length=200)
	private String deductiblesvgcdep;

	@Column(precision=10)
	private BigDecimal deductiblesvgcdte;

	@Column(precision=10)
	private BigDecimal deductiblesvgceas;

	@Column(precision=10)
	private BigDecimal deductiblesvgcfgp;

	@Column(precision=10)
	private BigDecimal deductiblesvgcgas;

	@Column(precision=10)
	private BigDecimal deductiblesvgcipd;

	@Column(precision=10)
	private BigDecimal deductiblesvgclle;

	@Column(precision=10)
	private BigDecimal deductiblesvgcllw;

	@Column(precision=10)
	private BigDecimal deductiblesvgcncd;

	@Column(precision=20, scale=2)
	private BigDecimal deductiblesvgcnea;

	@Column(precision=10)
	private BigDecimal deductiblesvgcnfe;

	@Column(precision=10)
	private BigDecimal deductiblesvgcnfn;

	@Column(precision=10)
	private BigDecimal deductiblesvgcpnd;

	@Column(precision=10)
	private BigDecimal deductiblesvgcpod;

	@Column(precision=10)
	private BigDecimal deductiblesvgcptm;

	@Column(precision=10)
	private BigDecimal deductiblesvgctdd;

	@Column(precision=22)
	private BigDecimal deductiblesvgctow;

	@Column(precision=10)
	private BigDecimal deductiblesvgctpl;

	@Column(length=200)
	private String deductiblesvgctpr;

	@Column(length=200)
	private String deductiblesvgcttl;

	@Column(precision=10)
	private BigDecimal deductiblesvgcves;

	@Column(length=200)
	private String deductiblesvgcwsg;

	@Column(precision=10)
	private BigDecimal deductiblesvgcxge;

	@Column(length=100)
	private String deductiblesvpclrt;

	@Column(length=30)
	private String engineno;

	@Column(precision=10)
	private BigDecimal gvweight;

	@Column(length=200)
	private String hypothecatedto;

	@Column(precision=10)
	private Double itemsi;//chnaged from BigDecimal To Double

	@Column(length=100)
	private String logbooknumber;

	@Column(length=50)
	private String make;

	@Column(precision=10)
	private String mfgyr;//changed from String To String

	@Column(length=50)
	private String model;

	@Column(precision=10)
	private Long ncdgrade;//changed from BigDecimal To Long

	@Column(length=50)
	private String oldinsured;

	@Column(length=50)
	private String oldpolexp;

	@Column(length=30)
	private String otherparty;

	@Column(length=200)
	private String registringauthority;

	@Column(length=30)
	private String regno;

	@Column(precision=10)
	private Long seatingcapacity;//changed from BigDecimal to Long



	@Column(precision=10)
	private BigDecimal siround1;

	@Column(precision=10)
	private BigDecimal siround2;

	@Column(precision=10)
	private BigDecimal sivgcapg;

	@Column(precision=10)
	private BigDecimal sivgcatd;

	@Column(precision=10)
	private BigDecimal sivgcbpr;

	@Column(precision=10)
	private BigDecimal sivgccng;

	@Column(length=200)
	private String sivgcdep;

	@Column(precision=10)
	private BigDecimal sivgcdte;

	@Column(precision=10)
	private BigDecimal sivgceas;

	@Column(precision=10)
	private BigDecimal sivgcfgp;

	@Column(precision=10)
	private BigDecimal sivgcgas;

	@Column(precision=10)
	private BigDecimal sivgcipd;

	@Column(precision=10)
	private BigDecimal sivgclle;

	@Column(precision=10)
	private BigDecimal sivgcllw;

	@Column(precision=10)
	private BigDecimal sivgcncd;

	@Column(precision=22)
	private BigDecimal sivgcnea;

	@Column(precision=10)
	private BigDecimal sivgcnfe;

	@Column(precision=10)
	private BigDecimal sivgcnfn;

	@Column(precision=10)
	private BigDecimal sivgcpnd;

	@Column(precision=10)
	private BigDecimal sivgcpod;

	@Column(precision=10)
	private BigDecimal sivgcptm;

	@Column(precision=10)
	private BigDecimal sivgctdd;

	@Column(precision=22)
	private BigDecimal sivgctow;

	@Column(precision=10)
	private BigDecimal sivgctpl;

	@Column(length=200)
	private String sivgctpr;

	@Column(length=200)
	private String sivgcttl;

	@Column(precision=10)
	private BigDecimal sivgcves;

	@Column(length=200)
	private String sivgcwsg;

	@Column(precision=10)
	private BigDecimal sivgcxge;

	@Column(length=10)
	private String territory2;

	@Column(length=100)
	private String territorystate;

	@Column(length=100)
	private String usagecode;

	@Column(length=30)
	private String vehicleregistrationdate;

	@Column(precision=10)
	private BigDecimal vgcapg;

	@Column(precision=10)
	private BigDecimal vgcatd;

	@Column(precision=10, scale=2)
	private BigDecimal vgcbpr;

	@Column(length=200)
	private String vgccm1rate;

	@Column(precision=10)
	private BigDecimal vgccng;

	@Column(length=200)
	private String vgcdep;

	@Column(precision=10)
	private BigDecimal vgcdte;

	@Column(precision=20, scale=2)
	private BigDecimal vgceas;

	@Column(precision=10)
	private BigDecimal vgcfgp;

	@Column(precision=10)
	private BigDecimal vgcgas;

	@Column(precision=10)
	private BigDecimal vgcipd;

	@Column(precision=20, scale=2)
	private BigDecimal vgclle;

	@Column(precision=10)
	private BigDecimal vgcllw;

	@Column(precision=20, scale=2)
	private BigDecimal vgcncd;

	@Column(precision=22)
	private BigDecimal vgcnea;

	@Column(precision=10)
	private BigDecimal vgcnfe;

	@Column(precision=10)
	private BigDecimal vgcnfn;

	@Column(precision=10)
	private BigDecimal vgcpnd;

	@Column(precision=10)
	private BigDecimal vgcpod;

	@Column(precision=10)
	private BigDecimal vgcptm;

	@Column(precision=20, scale=2)
	private BigDecimal vgctdd;

	@Column(precision=22)
	private BigDecimal vgctow;

	@Column(precision=20, scale=2)
	private BigDecimal vgctpl;

	@Column(length=200)
	private String vgctpr;

	@Column(length=200)
	private String vgcttl;

	@Column(precision=10)
	private BigDecimal vgcves;

	@Column(length=200)
	private String vgcwsg;

	@Column(precision=10)
	private BigDecimal vgcxge;

	@Column(precision=10)
	private BigDecimal vgcxgl;


	@Column(precision=10)
	private Long zip;//changed from BigDecimal To Long
	
	@Column(name="GSTNUMBER")
	private String Gstnumber;

	public TtrnInscoveredInfoVgc() {
	}

	public Long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public String getChassisno() {
		return this.chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCover() {
		return this.cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDeductible() {
		return this.deductible;
	}

	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}

	public BigDecimal getDeductiblesround1() {
		return this.deductiblesround1;
	}

	public void setDeductiblesround1(BigDecimal deductiblesround1) {
		this.deductiblesround1 = deductiblesround1;
	}

	public BigDecimal getDeductiblesround2() {
		return this.deductiblesround2;
	}

	public void setDeductiblesround2(BigDecimal deductiblesround2) {
		this.deductiblesround2 = deductiblesround2;
	}

	public BigDecimal getDeductiblesvgcapg() {
		return this.deductiblesvgcapg;
	}

	public void setDeductiblesvgcapg(BigDecimal deductiblesvgcapg) {
		this.deductiblesvgcapg = deductiblesvgcapg;
	}

	public BigDecimal getDeductiblesvgcatd() {
		return this.deductiblesvgcatd;
	}

	public void setDeductiblesvgcatd(BigDecimal deductiblesvgcatd) {
		this.deductiblesvgcatd = deductiblesvgcatd;
	}

	public BigDecimal getDeductiblesvgcbpr() {
		return this.deductiblesvgcbpr;
	}

	public void setDeductiblesvgcbpr(BigDecimal deductiblesvgcbpr) {
		this.deductiblesvgcbpr = deductiblesvgcbpr;
	}

	public BigDecimal getDeductiblesvgccng() {
		return this.deductiblesvgccng;
	}

	public void setDeductiblesvgccng(BigDecimal deductiblesvgccng) {
		this.deductiblesvgccng = deductiblesvgccng;
	}

	public String getDeductiblesvgcdep() {
		return this.deductiblesvgcdep;
	}

	public void setDeductiblesvgcdep(String deductiblesvgcdep) {
		this.deductiblesvgcdep = deductiblesvgcdep;
	}

	public BigDecimal getDeductiblesvgcdte() {
		return this.deductiblesvgcdte;
	}

	public void setDeductiblesvgcdte(BigDecimal deductiblesvgcdte) {
		this.deductiblesvgcdte = deductiblesvgcdte;
	}

	public BigDecimal getDeductiblesvgceas() {
		return this.deductiblesvgceas;
	}

	public void setDeductiblesvgceas(BigDecimal deductiblesvgceas) {
		this.deductiblesvgceas = deductiblesvgceas;
	}

	public BigDecimal getDeductiblesvgcfgp() {
		return this.deductiblesvgcfgp;
	}

	public void setDeductiblesvgcfgp(BigDecimal deductiblesvgcfgp) {
		this.deductiblesvgcfgp = deductiblesvgcfgp;
	}

	public BigDecimal getDeductiblesvgcgas() {
		return this.deductiblesvgcgas;
	}

	public void setDeductiblesvgcgas(BigDecimal deductiblesvgcgas) {
		this.deductiblesvgcgas = deductiblesvgcgas;
	}

	public BigDecimal getDeductiblesvgcipd() {
		return this.deductiblesvgcipd;
	}

	public void setDeductiblesvgcipd(BigDecimal deductiblesvgcipd) {
		this.deductiblesvgcipd = deductiblesvgcipd;
	}

	public BigDecimal getDeductiblesvgclle() {
		return this.deductiblesvgclle;
	}

	public void setDeductiblesvgclle(BigDecimal deductiblesvgclle) {
		this.deductiblesvgclle = deductiblesvgclle;
	}

	public BigDecimal getDeductiblesvgcllw() {
		return this.deductiblesvgcllw;
	}

	public void setDeductiblesvgcllw(BigDecimal deductiblesvgcllw) {
		this.deductiblesvgcllw = deductiblesvgcllw;
	}

	public BigDecimal getDeductiblesvgcncd() {
		return this.deductiblesvgcncd;
	}

	public void setDeductiblesvgcncd(BigDecimal deductiblesvgcncd) {
		this.deductiblesvgcncd = deductiblesvgcncd;
	}

	public BigDecimal getDeductiblesvgcnea() {
		return this.deductiblesvgcnea;
	}

	public void setDeductiblesvgcnea(BigDecimal deductiblesvgcnea) {
		this.deductiblesvgcnea = deductiblesvgcnea;
	}

	public BigDecimal getDeductiblesvgcnfe() {
		return this.deductiblesvgcnfe;
	}

	public void setDeductiblesvgcnfe(BigDecimal deductiblesvgcnfe) {
		this.deductiblesvgcnfe = deductiblesvgcnfe;
	}

	public BigDecimal getDeductiblesvgcnfn() {
		return this.deductiblesvgcnfn;
	}

	public void setDeductiblesvgcnfn(BigDecimal deductiblesvgcnfn) {
		this.deductiblesvgcnfn = deductiblesvgcnfn;
	}

	public BigDecimal getDeductiblesvgcpnd() {
		return this.deductiblesvgcpnd;
	}

	public void setDeductiblesvgcpnd(BigDecimal deductiblesvgcpnd) {
		this.deductiblesvgcpnd = deductiblesvgcpnd;
	}

	public BigDecimal getDeductiblesvgcpod() {
		return this.deductiblesvgcpod;
	}

	public void setDeductiblesvgcpod(BigDecimal deductiblesvgcpod) {
		this.deductiblesvgcpod = deductiblesvgcpod;
	}

	public BigDecimal getDeductiblesvgcptm() {
		return this.deductiblesvgcptm;
	}

	public void setDeductiblesvgcptm(BigDecimal deductiblesvgcptm) {
		this.deductiblesvgcptm = deductiblesvgcptm;
	}

	public BigDecimal getDeductiblesvgctdd() {
		return this.deductiblesvgctdd;
	}

	public void setDeductiblesvgctdd(BigDecimal deductiblesvgctdd) {
		this.deductiblesvgctdd = deductiblesvgctdd;
	}

	public BigDecimal getDeductiblesvgctow() {
		return this.deductiblesvgctow;
	}

	public void setDeductiblesvgctow(BigDecimal deductiblesvgctow) {
		this.deductiblesvgctow = deductiblesvgctow;
	}

	public BigDecimal getDeductiblesvgctpl() {
		return this.deductiblesvgctpl;
	}

	public void setDeductiblesvgctpl(BigDecimal deductiblesvgctpl) {
		this.deductiblesvgctpl = deductiblesvgctpl;
	}

	public String getDeductiblesvgctpr() {
		return this.deductiblesvgctpr;
	}

	public void setDeductiblesvgctpr(String deductiblesvgctpr) {
		this.deductiblesvgctpr = deductiblesvgctpr;
	}

	public String getDeductiblesvgcttl() {
		return this.deductiblesvgcttl;
	}

	public void setDeductiblesvgcttl(String deductiblesvgcttl) {
		this.deductiblesvgcttl = deductiblesvgcttl;
	}

	public BigDecimal getDeductiblesvgcves() {
		return this.deductiblesvgcves;
	}

	public void setDeductiblesvgcves(BigDecimal deductiblesvgcves) {
		this.deductiblesvgcves = deductiblesvgcves;
	}

	public String getDeductiblesvgcwsg() {
		return this.deductiblesvgcwsg;
	}

	public void setDeductiblesvgcwsg(String deductiblesvgcwsg) {
		this.deductiblesvgcwsg = deductiblesvgcwsg;
	}

	public BigDecimal getDeductiblesvgcxge() {
		return this.deductiblesvgcxge;
	}

	public void setDeductiblesvgcxge(BigDecimal deductiblesvgcxge) {
		this.deductiblesvgcxge = deductiblesvgcxge;
	}

	public String getDeductiblesvpclrt() {
		return this.deductiblesvpclrt;
	}

	public void setDeductiblesvpclrt(String deductiblesvpclrt) {
		this.deductiblesvpclrt = deductiblesvpclrt;
	}

	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	public BigDecimal getGvweight() {
		return this.gvweight;
	}

	public void setGvweight(BigDecimal gvweight) {
		this.gvweight = gvweight;
	}

	public String getHypothecatedto() {
		return this.hypothecatedto;
	}

	public void setHypothecatedto(String hypothecatedto) {
		this.hypothecatedto = hypothecatedto;
	}

	public Double getItemsi() {
		return this.itemsi;
	}

	public void setItemsi(Double itemsi) {
		this.itemsi = itemsi;
	}

	public String getLogbooknumber() {
		return this.logbooknumber;
	}

	public void setLogbooknumber(String logbooknumber) {
		this.logbooknumber = logbooknumber;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMfgyr() {
		return this.mfgyr;
	}

	public void setMfgyr(String mfgyr) {
		this.mfgyr = mfgyr;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getNcdgrade() {
		return this.ncdgrade;
	}

	public void setNcdgrade(Long ncdgrade) {
		this.ncdgrade = ncdgrade;
	}

	public String getOldinsured() {
		return this.oldinsured;
	}

	public void setOldinsured(String oldinsured) {
		this.oldinsured = oldinsured;
	}

	public String getOldpolexp() {
		return this.oldpolexp;
	}

	public void setOldpolexp(String oldpolexp) {
		this.oldpolexp = oldpolexp;
	}

	public String getOtherparty() {
		return this.otherparty;
	}

	public void setOtherparty(String otherparty) {
		this.otherparty = otherparty;
	}
	
	public String getRegistringauthority() {
		return this.registringauthority;
	}

	public void setRegistringauthority(String registringauthority) {
		this.registringauthority = registringauthority;
	}

	public String getRegno() {
		return this.regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public Long getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(Long seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public BigDecimal getSiround1() {
		return this.siround1;
	}

	public void setSiround1(BigDecimal siround1) {
		this.siround1 = siround1;
	}

	public BigDecimal getSiround2() {
		return this.siround2;
	}

	public void setSiround2(BigDecimal siround2) {
		this.siround2 = siround2;
	}

	public BigDecimal getSivgcapg() {
		return this.sivgcapg;
	}

	public void setSivgcapg(BigDecimal sivgcapg) {
		this.sivgcapg = sivgcapg;
	}

	public BigDecimal getSivgcatd() {
		return this.sivgcatd;
	}

	public void setSivgcatd(BigDecimal sivgcatd) {
		this.sivgcatd = sivgcatd;
	}

	public BigDecimal getSivgcbpr() {
		return this.sivgcbpr;
	}

	public void setSivgcbpr(BigDecimal sivgcbpr) {
		this.sivgcbpr = sivgcbpr;
	}

	public BigDecimal getSivgccng() {
		return this.sivgccng;
	}

	public void setSivgccng(BigDecimal sivgccng) {
		this.sivgccng = sivgccng;
	}

	public String getSivgcdep() {
		return this.sivgcdep;
	}

	public void setSivgcdep(String sivgcdep) {
		this.sivgcdep = sivgcdep;
	}

	public BigDecimal getSivgcdte() {
		return this.sivgcdte;
	}

	public void setSivgcdte(BigDecimal sivgcdte) {
		this.sivgcdte = sivgcdte;
	}

	public BigDecimal getSivgceas() {
		return this.sivgceas;
	}

	public void setSivgceas(BigDecimal sivgceas) {
		this.sivgceas = sivgceas;
	}

	public BigDecimal getSivgcfgp() {
		return this.sivgcfgp;
	}

	public void setSivgcfgp(BigDecimal sivgcfgp) {
		this.sivgcfgp = sivgcfgp;
	}

	public BigDecimal getSivgcgas() {
		return this.sivgcgas;
	}

	public void setSivgcgas(BigDecimal sivgcgas) {
		this.sivgcgas = sivgcgas;
	}

	public BigDecimal getSivgcipd() {
		return this.sivgcipd;
	}

	public void setSivgcipd(BigDecimal sivgcipd) {
		this.sivgcipd = sivgcipd;
	}

	public BigDecimal getSivgclle() {
		return this.sivgclle;
	}

	public void setSivgclle(BigDecimal sivgclle) {
		this.sivgclle = sivgclle;
	}

	public BigDecimal getSivgcllw() {
		return this.sivgcllw;
	}

	public void setSivgcllw(BigDecimal sivgcllw) {
		this.sivgcllw = sivgcllw;
	}

	public BigDecimal getSivgcncd() {
		return this.sivgcncd;
	}

	public void setSivgcncd(BigDecimal sivgcncd) {
		this.sivgcncd = sivgcncd;
	}

	public BigDecimal getSivgcnea() {
		return this.sivgcnea;
	}

	public void setSivgcnea(BigDecimal sivgcnea) {
		this.sivgcnea = sivgcnea;
	}

	public BigDecimal getSivgcnfe() {
		return this.sivgcnfe;
	}

	public void setSivgcnfe(BigDecimal sivgcnfe) {
		this.sivgcnfe = sivgcnfe;
	}

	public BigDecimal getSivgcnfn() {
		return this.sivgcnfn;
	}

	public void setSivgcnfn(BigDecimal sivgcnfn) {
		this.sivgcnfn = sivgcnfn;
	}

	public BigDecimal getSivgcpnd() {
		return this.sivgcpnd;
	}

	public void setSivgcpnd(BigDecimal sivgcpnd) {
		this.sivgcpnd = sivgcpnd;
	}

	public BigDecimal getSivgcpod() {
		return this.sivgcpod;
	}

	public void setSivgcpod(BigDecimal sivgcpod) {
		this.sivgcpod = sivgcpod;
	}

	public BigDecimal getSivgcptm() {
		return this.sivgcptm;
	}

	public void setSivgcptm(BigDecimal sivgcptm) {
		this.sivgcptm = sivgcptm;
	}

	public BigDecimal getSivgctdd() {
		return this.sivgctdd;
	}

	public void setSivgctdd(BigDecimal sivgctdd) {
		this.sivgctdd = sivgctdd;
	}

	public BigDecimal getSivgctow() {
		return this.sivgctow;
	}

	public void setSivgctow(BigDecimal sivgctow) {
		this.sivgctow = sivgctow;
	}

	public BigDecimal getSivgctpl() {
		return this.sivgctpl;
	}

	public void setSivgctpl(BigDecimal sivgctpl) {
		this.sivgctpl = sivgctpl;
	}

	public String getSivgctpr() {
		return this.sivgctpr;
	}

	public void setSivgctpr(String sivgctpr) {
		this.sivgctpr = sivgctpr;
	}

	public String getSivgcttl() {
		return this.sivgcttl;
	}

	public void setSivgcttl(String sivgcttl) {
		this.sivgcttl = sivgcttl;
	}

	public BigDecimal getSivgcves() {
		return this.sivgcves;
	}

	public void setSivgcves(BigDecimal sivgcves) {
		this.sivgcves = sivgcves;
	}

	public String getSivgcwsg() {
		return this.sivgcwsg;
	}

	public void setSivgcwsg(String sivgcwsg) {
		this.sivgcwsg = sivgcwsg;
	}

	public BigDecimal getSivgcxge() {
		return this.sivgcxge;
	}

	public void setSivgcxge(BigDecimal sivgcxge) {
		this.sivgcxge = sivgcxge;
	}

	public String getTerritory2() {
		return this.territory2;
	}

	public void setTerritory2(String territory2) {
		this.territory2 = territory2;
	}

	public String getTerritorystate() {
		return this.territorystate;
	}

	public void setTerritorystate(String territorystate) {
		this.territorystate = territorystate;
	}

	public String getUsagecode() {
		return this.usagecode;
	}

	public void setUsagecode(String usagecode) {
		this.usagecode = usagecode;
	}

	public String getVehicleregistrationdate() {
		return this.vehicleregistrationdate;
	}

	public void setVehicleregistrationdate(String vehicleregistrationdate) {
		this.vehicleregistrationdate = vehicleregistrationdate;
	}

	public BigDecimal getVgcapg() {
		return this.vgcapg;
	}

	public void setVgcapg(BigDecimal vgcapg) {
		this.vgcapg = vgcapg;
	}

	public BigDecimal getVgcatd() {
		return this.vgcatd;
	}

	public void setVgcatd(BigDecimal vgcatd) {
		this.vgcatd = vgcatd;
	}

	public BigDecimal getVgcbpr() {
		return this.vgcbpr;
	}

	public void setVgcbpr(BigDecimal vgcbpr) {
		this.vgcbpr = vgcbpr;
	}

	public String getVgccm1rate() {
		return this.vgccm1rate;
	}

	public void setVgccm1rate(String vgccm1rate) {
		this.vgccm1rate = vgccm1rate;
	}

	public BigDecimal getVgccng() {
		return this.vgccng;
	}

	public void setVgccng(BigDecimal vgccng) {
		this.vgccng = vgccng;
	}

	public String getVgcdep() {
		return this.vgcdep;
	}

	public void setVgcdep(String vgcdep) {
		this.vgcdep = vgcdep;
	}

	public BigDecimal getVgcdte() {
		return this.vgcdte;
	}

	public void setVgcdte(BigDecimal vgcdte) {
		this.vgcdte = vgcdte;
	}

	public BigDecimal getVgceas() {
		return this.vgceas;
	}

	public void setVgceas(BigDecimal vgceas) {
		this.vgceas = vgceas;
	}

	public BigDecimal getVgcfgp() {
		return this.vgcfgp;
	}

	public void setVgcfgp(BigDecimal vgcfgp) {
		this.vgcfgp = vgcfgp;
	}

	public BigDecimal getVgcgas() {
		return this.vgcgas;
	}

	public void setVgcgas(BigDecimal vgcgas) {
		this.vgcgas = vgcgas;
	}

	public BigDecimal getVgcipd() {
		return this.vgcipd;
	}

	public void setVgcipd(BigDecimal vgcipd) {
		this.vgcipd = vgcipd;
	}

	public BigDecimal getVgclle() {
		return this.vgclle;
	}

	public void setVgclle(BigDecimal vgclle) {
		this.vgclle = vgclle;
	}

	public BigDecimal getVgcllw() {
		return this.vgcllw;
	}

	public void setVgcllw(BigDecimal vgcllw) {
		this.vgcllw = vgcllw;
	}

	public BigDecimal getVgcncd() {
		return this.vgcncd;
	}

	public void setVgcncd(BigDecimal vgcncd) {
		this.vgcncd = vgcncd;
	}

	public BigDecimal getVgcnea() {
		return this.vgcnea;
	}

	public void setVgcnea(BigDecimal vgcnea) {
		this.vgcnea = vgcnea;
	}

	public BigDecimal getVgcnfe() {
		return this.vgcnfe;
	}

	public void setVgcnfe(BigDecimal vgcnfe) {
		this.vgcnfe = vgcnfe;
	}

	public BigDecimal getVgcnfn() {
		return this.vgcnfn;
	}

	public void setVgcnfn(BigDecimal vgcnfn) {
		this.vgcnfn = vgcnfn;
	}

	public BigDecimal getVgcpnd() {
		return this.vgcpnd;
	}

	public void setVgcpnd(BigDecimal vgcpnd) {
		this.vgcpnd = vgcpnd;
	}

	public BigDecimal getVgcpod() {
		return this.vgcpod;
	}

	public void setVgcpod(BigDecimal vgcpod) {
		this.vgcpod = vgcpod;
	}

	public BigDecimal getVgcptm() {
		return this.vgcptm;
	}

	public void setVgcptm(BigDecimal vgcptm) {
		this.vgcptm = vgcptm;
	}

	public BigDecimal getVgctdd() {
		return this.vgctdd;
	}

	public void setVgctdd(BigDecimal vgctdd) {
		this.vgctdd = vgctdd;
	}

	public BigDecimal getVgctow() {
		return this.vgctow;
	}

	public void setVgctow(BigDecimal vgctow) {
		this.vgctow = vgctow;
	}

	public BigDecimal getVgctpl() {
		return this.vgctpl;
	}

	public void setVgctpl(BigDecimal vgctpl) {
		this.vgctpl = vgctpl;
	}

	public String getVgctpr() {
		return this.vgctpr;
	}

	public void setVgctpr(String vgctpr) {
		this.vgctpr = vgctpr;
	}

	public String getVgcttl() {
		return this.vgcttl;
	}

	public void setVgcttl(String vgcttl) {
		this.vgcttl = vgcttl;
	}

	public BigDecimal getVgcves() {
		return this.vgcves;
	}

	public void setVgcves(BigDecimal vgcves) {
		this.vgcves = vgcves;
	}

	public String getVgcwsg() {
		return this.vgcwsg;
	}

	public void setVgcwsg(String vgcwsg) {
		this.vgcwsg = vgcwsg;
	}

	public BigDecimal getVgcxge() {
		return this.vgcxge;
	}

	public void setVgcxge(BigDecimal vgcxge) {
		this.vgcxge = vgcxge;
	}

	public BigDecimal getVgcxgl() {
		return this.vgcxgl;
	}

	public void setVgcxgl(BigDecimal vgcxgl) {
		this.vgcxgl = vgcxgl;
	}

	public Long getZip() {
		return this.zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}
	
	public String getXgenPolicyno() {
		return this.xgenPolicyno;
	}
	public void setXgenPolicyno(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}
	
	public String getGstnumber() {
		return Gstnumber;
	}

	public void setGstnumber(String gstnumber) {
		Gstnumber = gstnumber;
	}

//	public String getWartext() {
//	return this.wartext;
//}
//
//public void setWartext(String wartext) {
//	this.wartext = wartext;
//}
//
//public BigDecimal getXgenProductid() {
//	return this.xgenProductid;
//}
//
//public void setXgenProductid(BigDecimal xgenProductid) {
//	this.xgenProductid = xgenProductid;
//}	

//	public String getSectionno() {
//	return this.sectionno;
//}
//
//public void setSectionno(String sectionno) {
//	this.sectionno = sectionno;
//}
	
//	@Column(length=30)
//	private String wartext;

//	@Column(name="XGEN_PRODUCTID", precision=10)
//	private BigDecimal xgenProductid;

//	@Column(length=5)
//	private String sectionno;
//	@Column(length=30)
//	private String riskblock;

//	@Column(length=30)
//	private String riskcategory;

//	@Column(precision=10)
//	private BigDecimal roadtype;

//	@Column(length=200)
//	private String roadtypedesc;

//	@Column(precision=20, scale=2)
//	private BigDecimal round1;

//	@Column(precision=10, scale=2)
//	private BigDecimal round2;

//	@Column(precision=10)
//	private BigDecimal safetyfea;

//	@Column(precision=10)
//	private BigDecimal parkingfac;
//
//	@Column(precision=10)
//	private BigDecimal recordno;
//
//	@Column(precision=10)
//	private BigDecimal recordtype;
//	@Column(length=10)
//	private String noofdrivers;

//	@Column(length=5)
//	private String itemno;
//	@Column(precision=10)
//	private BigDecimal fueltype;
//	@Column(length=3)
//	private String eml;
//	@Column(length=1)
//	private String active;
//
//	@Column(precision=10)
//	private BigDecimal batchid;
//
//	@Column(length=50)
//	private String blank1;
//
//	@Column(length=10)
//	private String blank10;
//
//	@Column(length=10)
//	private String blank11;
//
//	@Column(length=10)
//	private String blank12;
//
//	@Column(precision=22)
//	private BigDecimal blank15;
//
//	@Column(precision=22)
//	private BigDecimal blank16;
//
//	@Column(precision=22)
//	private BigDecimal blank17;
//
//	@Column(precision=22)
//	private BigDecimal blank18;
//
//	@Column(precision=22)
//	private BigDecimal blank19;
//
//	@Column(length=50)
//	private String blank2;
//
//	@Column(precision=22)
//	private BigDecimal blank20;
//
//	@Column(length=50)
//	private String blank4;
//
//	@Column(length=10)
//	private String blank6;
//
//	@Column(length=10)
//	private String blank7;
//
//	@Column(length=10)
//	private String blank8;
//
//	@Column(length=10)
//	private String blank9;
	
//	public String getItemno() {
//	return this.itemno;
//}
//
//public void setItemno(String itemno) {
//	this.itemno = itemno;
//}
//public BigDecimal getFueltype() {
//return this.fueltype;
//}
//
//public void setFueltype(BigDecimal fueltype) {
//this.fueltype = fueltype;
//}

//public String getEml() {
//return this.eml;
//}
//
//public void setEml(String eml) {
//this.eml = eml;
//}

//public String getActive() {
//return this.active;
//}
//
//public void setActive(String active) {
//this.active = active;
//}
//
//public BigDecimal getBatchid() {
//return this.batchid;
//}
//
//public void setBatchid(BigDecimal batchid) {
//this.batchid = batchid;
//}
//
//public String getBlank1() {
//return this.blank1;
//}
//
//public void setBlank1(String blank1) {
//this.blank1 = blank1;
//}
//
//public String getBlank10() {
//return this.blank10;
//}
//
//public void setBlank10(String blank10) {
//this.blank10 = blank10;
//}
//
//public String getBlank11() {
//return this.blank11;
//}
//
//public void setBlank11(String blank11) {
//this.blank11 = blank11;
//}
//
//public String getBlank12() {
//return this.blank12;
//}
//
//public void setBlank12(String blank12) {
//this.blank12 = blank12;
//}
//
//public BigDecimal getBlank15() {
//return this.blank15;
//}
//
//public void setBlank15(BigDecimal blank15) {
//this.blank15 = blank15;
//}
//
//public BigDecimal getBlank16() {
//return this.blank16;
//}
//
//public void setBlank16(BigDecimal blank16) {
//this.blank16 = blank16;
//}
//
//public BigDecimal getBlank17() {
//return this.blank17;
//}
//
//public void setBlank17(BigDecimal blank17) {
//this.blank17 = blank17;
//}
//
//public BigDecimal getBlank18() {
//return this.blank18;
//}
//
//public void setBlank18(BigDecimal blank18) {
//this.blank18 = blank18;
//}
//
//public BigDecimal getBlank19() {
//return this.blank19;
//}
//
//public void setBlank19(BigDecimal blank19) {
//this.blank19 = blank19;
//}
//
//public String getBlank2() {
//return this.blank2;
//}
//
//public void setBlank2(String blank2) {
//this.blank2 = blank2;
//}
//
//public BigDecimal getBlank20() {
//return this.blank20;
//}
//
//public void setBlank20(BigDecimal blank20) {
//this.blank20 = blank20;
//}
//
//public String getBlank4() {
//return this.blank4;
//}
//
//public void setBlank4(String blank4) {
//this.blank4 = blank4;
//}
//
//public String getBlank6() {
//return this.blank6;
//}
//
//public void setBlank6(String blank6) {
//this.blank6 = blank6;
//}
//
//public String getBlank7() {
//return this.blank7;
//}
//
//public void setBlank7(String blank7) {
//this.blank7 = blank7;
//}
//
//public String getBlank8() {
//return this.blank8;
//}
//
//public void setBlank8(String blank8) {
//this.blank8 = blank8;
//}
//
//public String getBlank9() {
//return this.blank9;
//}
//
//public void setBlank9(String blank9) {
//this.blank9 = blank9;
//}	

//	public String getNoofdrivers() {
//	return this.noofdrivers;
//}
//
//public void setNoofdrivers(String noofdrivers) {
//	this.noofdrivers = noofdrivers;
//}
//	public BigDecimal getParkingfac() {
//		return this.parkingfac;
//	}
//
//	public void setParkingfac(BigDecimal parkingfac) {
//		this.parkingfac = parkingfac;
//	}
//
//	public BigDecimal getRecordno() {
//		return this.recordno;
//	}
//
//	public void setRecordno(BigDecimal recordno) {
//		this.recordno = recordno;
//	}
//
//	public BigDecimal getRecordtype() {
//		return this.recordtype;
//	}
//
//	public void setRecordtype(BigDecimal recordtype) {
//		this.recordtype = recordtype;
//	}
//	public String getRiskblock() {
//	return this.riskblock;
//}
//
//public void setRiskblock(String riskblock) {
//	this.riskblock = riskblock;
//}
//
//public String getRiskcategory() {
//	return this.riskcategory;
//}
//
//public void setRiskcategory(String riskcategory) {
//	this.riskcategory = riskcategory;
//}
//
//public BigDecimal getRoadtype() {
//	return this.roadtype;
//}
//
//public void setRoadtype(BigDecimal roadtype) {
//	this.roadtype = roadtype;
//}
//
//public String getRoadtypedesc() {
//	return this.roadtypedesc;
//}
//
//public void setRoadtypedesc(String roadtypedesc) {
//	this.roadtypedesc = roadtypedesc;
//}
//
//public BigDecimal getRound1() {
//	return this.round1;
//}
//
//public void setRound1(BigDecimal round1) {
//	this.round1 = round1;
//}
//
//public BigDecimal getRound2() {
//	return this.round2;
//}
//
//public void setRound2(BigDecimal round2) {
//	this.round2 = round2;
//}
//
//public BigDecimal getSafetyfea() {
//	return this.safetyfea;
//}
//
//public void setSafetyfea(BigDecimal safetyfea) {
//	this.safetyfea = safetyfea;
//}
}