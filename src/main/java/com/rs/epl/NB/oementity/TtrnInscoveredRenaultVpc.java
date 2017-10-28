/*package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.math.BigDecimal;


*//**
 * The persistent class for the TTRN_INSCOVERED_RENAULT_VPC database table.
 * 
 *//*
@Entity
@Table(name="TTRN_INSCOVERED_RENAULT_VPC")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnInscoveredRenaultVpc implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="XGEN_POLICYNO", unique=true, nullable=false, length=16)
	private String xgenPolicyno;

	@Column(name="XGEN_ENDORSEMENTNO", unique=true, nullable=false, length=10)
	private String xgenEndorsementno;
	
	@Column(length=1)
	private String active;

	@Column(precision=10)
	private BigDecimal batchid;

	@Column(length=50)
	private String blank1;

	@Column(length=50)
	private String blank2;

	@Column(length=50)
	private String blank3;

	@Column(precision=10)
	private Long capacity;//changed from bigdecimal to long

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
	private BigDecimal deductiblesvpcaad;

	@Column(precision=10)
	private BigDecimal deductiblesvpcatd;

	@Column(length=10)
	private String deductiblesvpcbag;

	@Column(precision=10)
	private BigDecimal deductiblesvpccm2;

	@Column(precision=10)
	private BigDecimal deductiblesvpccng;

	@Column(precision=10)
	private BigDecimal deductiblesvpccvd;

	@Column(length=10)
	private String deductiblesvpcdep;

	@Column(precision=10)
	private BigDecimal deductiblesvpcdte;

	@Column(precision=10)
	private BigDecimal deductiblesvpceas;

	@Column(precision=10)
	private BigDecimal deductiblesvpcexg;

	@Column(precision=10)
	private BigDecimal deductiblesvpcfbg;

	@Column(precision=10)
	private BigDecimal deductiblesvpcfor;

	@Column(precision=10)
	private BigDecimal deductiblesvpcgas;

	@Column(length=10)
	private String deductiblesvpcinv;

	@Column(precision=10)
	private BigDecimal deductiblesvpclld;

	@Column(precision=10)
	private BigDecimal deductiblesvpclle;

	@Column(length=10)
	private String deductiblesvpclrt;

	@Column(length=10)
	private String deductiblesvpclsc;

	@Column(precision=10)
	private BigDecimal deductiblesvpcncd;

	@Column(precision=10)
	private BigDecimal deductiblesvpcnmd;

	@Column(precision=10)
	private BigDecimal deductiblesvpcphd;

	@Column(precision=10)
	private BigDecimal deductiblesvpcpnd;

	@Column(precision=10)
	private BigDecimal deductiblesvpcpod;

	@Column(precision=10)
	private BigDecimal deductiblesvpcprm;

	@Column(precision=10)
	private BigDecimal deductiblesvpctdd;

	@Column(precision=10)
	private BigDecimal deductiblesvpctpl;

	@Column(precision=10)
	private BigDecimal deductiblesvpctrl;

	@Column(precision=10)
	private BigDecimal deductiblesvpcund;

	@Column(precision=10)
	private BigDecimal deductiblesvpcves;

	@Column(length=10)
	private String deductiblesvpcwsg;

	@Column(length=10)
	private String deductiblesvphrsa;

	@Column(length=3)
	private String eml;

	@Column(length=30)
	private String engineno;

	@Column(length=30)
	private String fueltype;

	@Column(precision=10)
	private BigDecimal gvweight;

	@Column(length=200)
	private String hypothecatedto;

	@Column(length=5)
	private String itemno;

	@Column(precision=10)
	private Double itemsi;//changed BigDecimal to Double

	@Column(length=30)
	private String logbooknumber;

	@Column(length=50)
	private String make;

	@Column(length=10)
	private String maprefno;

	@Column(precision=10)
	private String mfgyr;//changed from BigDecimal to String

	@Column(length=10)
	private String mileageused;

	@Column(length=50)
	private String model;

	@Column(length=20)
	private String monthlymileage;

	@Column(precision=10)
	private Long ncdgrade;  //changed from BigDecimal to Long

	@Column(precision=10)
	private BigDecimal noofdrivers;

	@Column(length=100)
	private String oldinsured;

	@Column(length=100)
	private String oldpolexp;

	@Column(length=30)
	private String otherparty;

	@Column(length=50)
	private String papaiddriver;

	@Column(length=30)
	private String parkingfac;

	@Column(precision=10)
	private BigDecimal recordno;

	@Column(precision=10)
	private BigDecimal recordtype;

	@Column(length=200)
	private String registringauthority;

	@Column(length=30)
	private String regno;

	@Column(length=30)
	private String riskblock;

	@Column(length=30)
	private String riskcategory;

	@Column(length=30)
	private String roadtype;

	@Column(precision=10)
	private BigDecimal round1;

	@Column(precision=10)
	private BigDecimal round2;

	@Column(length=30)
	private String safetyfea;

	@Column(precision=10)
	private Long seatingcapacity;//changed from bigdecimal to long

	@Column(length=5)
	private String sectionno;

	@Column(precision=10)
	private BigDecimal siround1;

	@Column(length=30)
	private String siround2;

	@Column(precision=10)
	private BigDecimal sivpcaad;

	@Column(precision=10)
	private BigDecimal sivpcatd;

	@Column(length=10)
	private String sivpcbag;

	@Column(length=30)
	private String sivpccm2;

	@Column(precision=10)
	private BigDecimal sivpccng;

	@Column(precision=10)
	private BigDecimal sivpccvd;

	@Column(length=10)
	private String sivpcdep;

	@Column(precision=10)
	private BigDecimal sivpcdte;

	@Column(precision=10)
	private BigDecimal sivpceas;

	@Column(precision=10)
	private BigDecimal sivpcexg;

	@Column(length=50)
	private String sivpcfbg;

	@Column(precision=10)
	private BigDecimal sivpcfor;

	@Column(precision=10)
	private BigDecimal sivpcgas;

	@Column(length=10)
	private String sivpcinv;

	@Column(precision=10)
	private BigDecimal sivpclld;

	@Column(length=30)
	private String sivpclle;

	@Column(length=10)
	private String sivpclrt;

	@Column(length=10)
	private String sivpclsc;

	@Column(precision=10)
	private BigDecimal sivpcncd;

	@Column(precision=10)
	private BigDecimal sivpcnmd;

	@Column(precision=10)
	private BigDecimal sivpcphd;

	@Column(precision=10)
	private BigDecimal sivpcpnd;

	@Column(precision=10)
	private BigDecimal sivpcpod;

	@Column(precision=10)
	private BigDecimal sivpcprm;

	@Column(precision=10)
	private BigDecimal sivpctdd;

	@Column(precision=10)
	private BigDecimal sivpctpl;

	@Column(precision=10)
	private BigDecimal sivpctrl;

	@Column(precision=10)
	private BigDecimal sivpcund;

	@Column(precision=10)
	private BigDecimal sivpcves;

	@Column(length=10)
	private String sivpcwsg;

	@Column(length=10)
	private String sivphrsa;

	@Column(length=10)
	private String territory2;

	@Column(length=100)
	private String territorystate;

	@Column(length=4)
	private String usagecode;

	@Column(length=30)
	private String vehicleregistrationdate;

	@Column(precision=10)
	private BigDecimal vpcaad;

	@Column(precision=10)
	private BigDecimal vpcatd;

	@Column(length=10)
	private String vpcbag;

	@Column(precision=10)
	private BigDecimal vpccm2;

	@Column(precision=10)
	private BigDecimal vpccng;

	@Column(length=30)
	private String vpccvd;

	@Column(length=10)
	private String vpcdep;

	@Column(precision=10)
	private BigDecimal vpcdte;

	@Column(precision=10)
	private BigDecimal vpceas;

	@Column(precision=10)
	private BigDecimal vpcexg;

	@Column(precision=10)
	private BigDecimal vpcfbg;

	@Column(precision=10)
	private BigDecimal vpcfor;

	@Column(precision=10)
	private BigDecimal vpcgas;

	@Column(length=10)
	private String vpcinv;

	@Column(precision=10)
	private BigDecimal vpclld;

	@Column(precision=10)
	private BigDecimal vpclle;

	@Column(length=10)
	private String vpclrt;

	@Column(length=10)
	private String vpclsc;

	@Column(precision=10)
	private BigDecimal vpcncd;

	@Column(precision=10)
	private BigDecimal vpcnmd;

	@Column(precision=10)
	private BigDecimal vpcphd;

	@Column(precision=10)
	private BigDecimal vpcpnd;

	@Column(precision=10)
	private BigDecimal vpcpod;

	@Column(precision=10)
	private BigDecimal vpcprm;

	@Column(precision=10)
	private BigDecimal vpctdd;

	@Column(precision=10)
	private BigDecimal vpctpl;

	@Column(length=30)
	private String vpctrl;

	@Column(precision=10)
	private BigDecimal vpcund;

	@Column(precision=10)
	private BigDecimal vpcves;

	@Column(length=10)
	private String vpcwsg;

	@Column(length=10)
	private String vphrsa;

	@Column(length=30)
	private String wartext;

	@Column(name="XGEN_PRODUCTID", precision=10)
	private BigDecimal xgenProductid;

	@Column(precision=10)
	private Long zip;//changed BigDecimal to Long

	public TtrnInscoveredRenaultVpc() {
	}	
	public String getXgenPolicyno() {
		return this.xgenPolicyno;
	}
	public void setXgenPolicyno(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}
	public String getXgenEndorsementno() {
		return this.xgenEndorsementno;
	}
	public void setXgenEndorsementno(String xgenEndorsementno) {
		this.xgenEndorsementno = xgenEndorsementno;
	}	
	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public BigDecimal getBatchid() {
		return this.batchid;
	}

	public void setBatchid(BigDecimal batchid) {
		this.batchid = batchid;
	}

	public String getBlank1() {
		return this.blank1;
	}

	public void setBlank1(String blank1) {
		this.blank1 = blank1;
	}

	public String getBlank2() {
		return this.blank2;
	}

	public void setBlank2(String blank2) {
		this.blank2 = blank2;
	}

	public String getBlank3() {
		return this.blank3;
	}

	public void setBlank3(String blank3) {
		this.blank3 = blank3;
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

	public BigDecimal getDeductiblesvpcaad() {
		return this.deductiblesvpcaad;
	}

	public void setDeductiblesvpcaad(BigDecimal deductiblesvpcaad) {
		this.deductiblesvpcaad = deductiblesvpcaad;
	}

	public BigDecimal getDeductiblesvpcatd() {
		return this.deductiblesvpcatd;
	}

	public void setDeductiblesvpcatd(BigDecimal deductiblesvpcatd) {
		this.deductiblesvpcatd = deductiblesvpcatd;
	}

	public String getDeductiblesvpcbag() {
		return this.deductiblesvpcbag;
	}

	public void setDeductiblesvpcbag(String deductiblesvpcbag) {
		this.deductiblesvpcbag = deductiblesvpcbag;
	}

	public BigDecimal getDeductiblesvpccm2() {
		return this.deductiblesvpccm2;
	}

	public void setDeductiblesvpccm2(BigDecimal deductiblesvpccm2) {
		this.deductiblesvpccm2 = deductiblesvpccm2;
	}

	public BigDecimal getDeductiblesvpccng() {
		return this.deductiblesvpccng;
	}

	public void setDeductiblesvpccng(BigDecimal deductiblesvpccng) {
		this.deductiblesvpccng = deductiblesvpccng;
	}

	public BigDecimal getDeductiblesvpccvd() {
		return this.deductiblesvpccvd;
	}

	public void setDeductiblesvpccvd(BigDecimal deductiblesvpccvd) {
		this.deductiblesvpccvd = deductiblesvpccvd;
	}

	public String getDeductiblesvpcdep() {
		return this.deductiblesvpcdep;
	}

	public void setDeductiblesvpcdep(String deductiblesvpcdep) {
		this.deductiblesvpcdep = deductiblesvpcdep;
	}

	public BigDecimal getDeductiblesvpcdte() {
		return this.deductiblesvpcdte;
	}

	public void setDeductiblesvpcdte(BigDecimal deductiblesvpcdte) {
		this.deductiblesvpcdte = deductiblesvpcdte;
	}

	public BigDecimal getDeductiblesvpceas() {
		return this.deductiblesvpceas;
	}

	public void setDeductiblesvpceas(BigDecimal deductiblesvpceas) {
		this.deductiblesvpceas = deductiblesvpceas;
	}

	public BigDecimal getDeductiblesvpcexg() {
		return this.deductiblesvpcexg;
	}

	public void setDeductiblesvpcexg(BigDecimal deductiblesvpcexg) {
		this.deductiblesvpcexg = deductiblesvpcexg;
	}

	public BigDecimal getDeductiblesvpcfbg() {
		return this.deductiblesvpcfbg;
	}

	public void setDeductiblesvpcfbg(BigDecimal deductiblesvpcfbg) {
		this.deductiblesvpcfbg = deductiblesvpcfbg;
	}

	public BigDecimal getDeductiblesvpcfor() {
		return this.deductiblesvpcfor;
	}

	public void setDeductiblesvpcfor(BigDecimal deductiblesvpcfor) {
		this.deductiblesvpcfor = deductiblesvpcfor;
	}

	public BigDecimal getDeductiblesvpcgas() {
		return this.deductiblesvpcgas;
	}

	public void setDeductiblesvpcgas(BigDecimal deductiblesvpcgas) {
		this.deductiblesvpcgas = deductiblesvpcgas;
	}

	public String getDeductiblesvpcinv() {
		return this.deductiblesvpcinv;
	}

	public void setDeductiblesvpcinv(String deductiblesvpcinv) {
		this.deductiblesvpcinv = deductiblesvpcinv;
	}

	public BigDecimal getDeductiblesvpclld() {
		return this.deductiblesvpclld;
	}

	public void setDeductiblesvpclld(BigDecimal deductiblesvpclld) {
		this.deductiblesvpclld = deductiblesvpclld;
	}

	public BigDecimal getDeductiblesvpclle() {
		return this.deductiblesvpclle;
	}

	public void setDeductiblesvpclle(BigDecimal deductiblesvpclle) {
		this.deductiblesvpclle = deductiblesvpclle;
	}

	public String getDeductiblesvpclrt() {
		return this.deductiblesvpclrt;
	}

	public void setDeductiblesvpclrt(String deductiblesvpclrt) {
		this.deductiblesvpclrt = deductiblesvpclrt;
	}

	public String getDeductiblesvpclsc() {
		return this.deductiblesvpclsc;
	}

	public void setDeductiblesvpclsc(String deductiblesvpclsc) {
		this.deductiblesvpclsc = deductiblesvpclsc;
	}

	public BigDecimal getDeductiblesvpcncd() {
		return this.deductiblesvpcncd;
	}

	public void setDeductiblesvpcncd(BigDecimal deductiblesvpcncd) {
		this.deductiblesvpcncd = deductiblesvpcncd;
	}

	public BigDecimal getDeductiblesvpcnmd() {
		return this.deductiblesvpcnmd;
	}

	public void setDeductiblesvpcnmd(BigDecimal deductiblesvpcnmd) {
		this.deductiblesvpcnmd = deductiblesvpcnmd;
	}

	public BigDecimal getDeductiblesvpcphd() {
		return this.deductiblesvpcphd;
	}

	public void setDeductiblesvpcphd(BigDecimal deductiblesvpcphd) {
		this.deductiblesvpcphd = deductiblesvpcphd;
	}

	public BigDecimal getDeductiblesvpcpnd() {
		return this.deductiblesvpcpnd;
	}

	public void setDeductiblesvpcpnd(BigDecimal deductiblesvpcpnd) {
		this.deductiblesvpcpnd = deductiblesvpcpnd;
	}

	public BigDecimal getDeductiblesvpcpod() {
		return this.deductiblesvpcpod;
	}

	public void setDeductiblesvpcpod(BigDecimal deductiblesvpcpod) {
		this.deductiblesvpcpod = deductiblesvpcpod;
	}

	public BigDecimal getDeductiblesvpcprm() {
		return this.deductiblesvpcprm;
	}

	public void setDeductiblesvpcprm(BigDecimal deductiblesvpcprm) {
		this.deductiblesvpcprm = deductiblesvpcprm;
	}

	public BigDecimal getDeductiblesvpctdd() {
		return this.deductiblesvpctdd;
	}

	public void setDeductiblesvpctdd(BigDecimal deductiblesvpctdd) {
		this.deductiblesvpctdd = deductiblesvpctdd;
	}

	public BigDecimal getDeductiblesvpctpl() {
		return this.deductiblesvpctpl;
	}

	public void setDeductiblesvpctpl(BigDecimal deductiblesvpctpl) {
		this.deductiblesvpctpl = deductiblesvpctpl;
	}

	public BigDecimal getDeductiblesvpctrl() {
		return this.deductiblesvpctrl;
	}

	public void setDeductiblesvpctrl(BigDecimal deductiblesvpctrl) {
		this.deductiblesvpctrl = deductiblesvpctrl;
	}

	public BigDecimal getDeductiblesvpcund() {
		return this.deductiblesvpcund;
	}

	public void setDeductiblesvpcund(BigDecimal deductiblesvpcund) {
		this.deductiblesvpcund = deductiblesvpcund;
	}

	public BigDecimal getDeductiblesvpcves() {
		return this.deductiblesvpcves;
	}

	public void setDeductiblesvpcves(BigDecimal deductiblesvpcves) {
		this.deductiblesvpcves = deductiblesvpcves;
	}

	public String getDeductiblesvpcwsg() {
		return this.deductiblesvpcwsg;
	}

	public void setDeductiblesvpcwsg(String deductiblesvpcwsg) {
		this.deductiblesvpcwsg = deductiblesvpcwsg;
	}

	public String getDeductiblesvphrsa() {
		return this.deductiblesvphrsa;
	}

	public void setDeductiblesvphrsa(String deductiblesvphrsa) {
		this.deductiblesvphrsa = deductiblesvphrsa;
	}

	public String getEml() {
		return this.eml;
	}

	public void setEml(String eml) {
		this.eml = eml;
	}

	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	public String getFueltype() {
		return this.fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
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

	public String getItemno() {
		return this.itemno;
	}

	public void setItemno(String itemno) {
		this.itemno = itemno;
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

	public String getMaprefno() {
		return this.maprefno;
	}

	public void setMaprefno(String maprefno) {
		this.maprefno = maprefno;
	}

	public String getMfgyr() {
		return this.mfgyr;
	}

	public void setMfgyr(String mfgyr) {
		this.mfgyr = mfgyr;
	}

	public String getMileageused() {
		return this.mileageused;
	}

	public void setMileageused(String mileageused) {
		this.mileageused = mileageused;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMonthlymileage() {
		return this.monthlymileage;
	}

	public void setMonthlymileage(String monthlymileage) {
		this.monthlymileage = monthlymileage;
	}

	public Long getNcdgrade() {
		return this.ncdgrade;
	}

	public void setNcdgrade(Long ncdgrade) {
		this.ncdgrade = ncdgrade;
	}

	public BigDecimal getNoofdrivers() {
		return this.noofdrivers;
	}

	public void setNoofdrivers(BigDecimal noofdrivers) {
		this.noofdrivers = noofdrivers;
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

	public String getPapaiddriver() {
		return this.papaiddriver;
	}

	public void setPapaiddriver(String papaiddriver) {
		this.papaiddriver = papaiddriver;
	}

	public String getParkingfac() {
		return this.parkingfac;
	}

	public void setParkingfac(String parkingfac) {
		this.parkingfac = parkingfac;
	}

	public BigDecimal getRecordno() {
		return this.recordno;
	}

	public void setRecordno(BigDecimal recordno) {
		this.recordno = recordno;
	}

	public BigDecimal getRecordtype() {
		return this.recordtype;
	}

	public void setRecordtype(BigDecimal recordtype) {
		this.recordtype = recordtype;
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

	public String getRiskblock() {
		return this.riskblock;
	}

	public void setRiskblock(String riskblock) {
		this.riskblock = riskblock;
	}

	public String getRiskcategory() {
		return this.riskcategory;
	}

	public void setRiskcategory(String riskcategory) {
		this.riskcategory = riskcategory;
	}

	public String getRoadtype() {
		return this.roadtype;
	}

	public void setRoadtype(String roadtype) {
		this.roadtype = roadtype;
	}

	public BigDecimal getRound1() {
		return this.round1;
	}

	public void setRound1(BigDecimal round1) {
		this.round1 = round1;
	}

	public BigDecimal getRound2() {
		return this.round2;
	}

	public void setRound2(BigDecimal round2) {
		this.round2 = round2;
	}

	public String getSafetyfea() {
		return this.safetyfea;
	}

	public void setSafetyfea(String safetyfea) {
		this.safetyfea = safetyfea;
	}

	public Long getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(Long seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public String getSectionno() {
		return this.sectionno;
	}

	public void setSectionno(String sectionno) {
		this.sectionno = sectionno;
	}

	public BigDecimal getSiround1() {
		return this.siround1;
	}

	public void setSiround1(BigDecimal siround1) {
		this.siround1 = siround1;
	}

	public String getSiround2() {
		return this.siround2;
	}

	public void setSiround2(String siround2) {
		this.siround2 = siround2;
	}

	public BigDecimal getSivpcaad() {
		return this.sivpcaad;
	}

	public void setSivpcaad(BigDecimal sivpcaad) {
		this.sivpcaad = sivpcaad;
	}

	public BigDecimal getSivpcatd() {
		return this.sivpcatd;
	}

	public void setSivpcatd(BigDecimal sivpcatd) {
		this.sivpcatd = sivpcatd;
	}

	public String getSivpcbag() {
		return this.sivpcbag;
	}

	public void setSivpcbag(String sivpcbag) {
		this.sivpcbag = sivpcbag;
	}

	public String getSivpccm2() {
		return this.sivpccm2;
	}

	public void setSivpccm2(String sivpccm2) {
		this.sivpccm2 = sivpccm2;
	}

	public BigDecimal getSivpccng() {
		return this.sivpccng;
	}

	public void setSivpccng(BigDecimal sivpccng) {
		this.sivpccng = sivpccng;
	}

	public BigDecimal getSivpccvd() {
		return this.sivpccvd;
	}

	public void setSivpccvd(BigDecimal sivpccvd) {
		this.sivpccvd = sivpccvd;
	}

	public String getSivpcdep() {
		return this.sivpcdep;
	}

	public void setSivpcdep(String sivpcdep) {
		this.sivpcdep = sivpcdep;
	}

	public BigDecimal getSivpcdte() {
		return this.sivpcdte;
	}

	public void setSivpcdte(BigDecimal sivpcdte) {
		this.sivpcdte = sivpcdte;
	}

	public BigDecimal getSivpceas() {
		return this.sivpceas;
	}

	public void setSivpceas(BigDecimal sivpceas) {
		this.sivpceas = sivpceas;
	}

	public BigDecimal getSivpcexg() {
		return this.sivpcexg;
	}

	public void setSivpcexg(BigDecimal sivpcexg) {
		this.sivpcexg = sivpcexg;
	}

	public String getSivpcfbg() {
		return this.sivpcfbg;
	}

	public void setSivpcfbg(String sivpcfbg) {
		this.sivpcfbg = sivpcfbg;
	}

	public BigDecimal getSivpcfor() {
		return this.sivpcfor;
	}

	public void setSivpcfor(BigDecimal sivpcfor) {
		this.sivpcfor = sivpcfor;
	}

	public BigDecimal getSivpcgas() {
		return this.sivpcgas;
	}

	public void setSivpcgas(BigDecimal sivpcgas) {
		this.sivpcgas = sivpcgas;
	}

	public String getSivpcinv() {
		return this.sivpcinv;
	}

	public void setSivpcinv(String sivpcinv) {
		this.sivpcinv = sivpcinv;
	}

	public BigDecimal getSivpclld() {
		return this.sivpclld;
	}

	public void setSivpclld(BigDecimal sivpclld) {
		this.sivpclld = sivpclld;
	}

	public String getSivpclle() {
		return this.sivpclle;
	}

	public void setSivpclle(String sivpclle) {
		this.sivpclle = sivpclle;
	}

	public String getSivpclrt() {
		return this.sivpclrt;
	}

	public void setSivpclrt(String sivpclrt) {
		this.sivpclrt = sivpclrt;
	}

	public String getSivpclsc() {
		return this.sivpclsc;
	}

	public void setSivpclsc(String sivpclsc) {
		this.sivpclsc = sivpclsc;
	}

	public BigDecimal getSivpcncd() {
		return this.sivpcncd;
	}

	public void setSivpcncd(BigDecimal sivpcncd) {
		this.sivpcncd = sivpcncd;
	}

	public BigDecimal getSivpcnmd() {
		return this.sivpcnmd;
	}

	public void setSivpcnmd(BigDecimal sivpcnmd) {
		this.sivpcnmd = sivpcnmd;
	}

	public BigDecimal getSivpcphd() {
		return this.sivpcphd;
	}

	public void setSivpcphd(BigDecimal sivpcphd) {
		this.sivpcphd = sivpcphd;
	}

	public BigDecimal getSivpcpnd() {
		return this.sivpcpnd;
	}

	public void setSivpcpnd(BigDecimal sivpcpnd) {
		this.sivpcpnd = sivpcpnd;
	}

	public BigDecimal getSivpcpod() {
		return this.sivpcpod;
	}

	public void setSivpcpod(BigDecimal sivpcpod) {
		this.sivpcpod = sivpcpod;
	}

	public BigDecimal getSivpcprm() {
		return this.sivpcprm;
	}

	public void setSivpcprm(BigDecimal sivpcprm) {
		this.sivpcprm = sivpcprm;
	}

	public BigDecimal getSivpctdd() {
		return this.sivpctdd;
	}

	public void setSivpctdd(BigDecimal sivpctdd) {
		this.sivpctdd = sivpctdd;
	}

	public BigDecimal getSivpctpl() {
		return this.sivpctpl;
	}

	public void setSivpctpl(BigDecimal sivpctpl) {
		this.sivpctpl = sivpctpl;
	}

	public BigDecimal getSivpctrl() {
		return this.sivpctrl;
	}

	public void setSivpctrl(BigDecimal sivpctrl) {
		this.sivpctrl = sivpctrl;
	}

	public BigDecimal getSivpcund() {
		return this.sivpcund;
	}

	public void setSivpcund(BigDecimal sivpcund) {
		this.sivpcund = sivpcund;
	}

	public BigDecimal getSivpcves() {
		return this.sivpcves;
	}

	public void setSivpcves(BigDecimal sivpcves) {
		this.sivpcves = sivpcves;
	}

	public String getSivpcwsg() {
		return this.sivpcwsg;
	}

	public void setSivpcwsg(String sivpcwsg) {
		this.sivpcwsg = sivpcwsg;
	}

	public String getSivphrsa() {
		return this.sivphrsa;
	}

	public void setSivphrsa(String sivphrsa) {
		this.sivphrsa = sivphrsa;
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

	public BigDecimal getVpcaad() {
		return this.vpcaad;
	}

	public void setVpcaad(BigDecimal vpcaad) {
		this.vpcaad = vpcaad;
	}

	public BigDecimal getVpcatd() {
		return this.vpcatd;
	}

	public void setVpcatd(BigDecimal vpcatd) {
		this.vpcatd = vpcatd;
	}

	public String getVpcbag() {
		return this.vpcbag;
	}

	public void setVpcbag(String vpcbag) {
		this.vpcbag = vpcbag;
	}

	public BigDecimal getVpccm2() {
		return this.vpccm2;
	}

	public void setVpccm2(BigDecimal vpccm2) {
		this.vpccm2 = vpccm2;
	}

	public BigDecimal getVpccng() {
		return this.vpccng;
	}

	public void setVpccng(BigDecimal vpccng) {
		this.vpccng = vpccng;
	}

	public String getVpccvd() {
		return this.vpccvd;
	}

	public void setVpccvd(String vpccvd) {
		this.vpccvd = vpccvd;
	}

	public String getVpcdep() {
		return this.vpcdep;
	}

	public void setVpcdep(String vpcdep) {
		this.vpcdep = vpcdep;
	}

	public BigDecimal getVpcdte() {
		return this.vpcdte;
	}

	public void setVpcdte(BigDecimal vpcdte) {
		this.vpcdte = vpcdte;
	}

	public BigDecimal getVpceas() {
		return this.vpceas;
	}

	public void setVpceas(BigDecimal vpceas) {
		this.vpceas = vpceas;
	}

	public BigDecimal getVpcexg() {
		return this.vpcexg;
	}

	public void setVpcexg(BigDecimal vpcexg) {
		this.vpcexg = vpcexg;
	}

	public BigDecimal getVpcfbg() {
		return this.vpcfbg;
	}

	public void setVpcfbg(BigDecimal vpcfbg) {
		this.vpcfbg = vpcfbg;
	}

	public BigDecimal getVpcfor() {
		return this.vpcfor;
	}

	public void setVpcfor(BigDecimal vpcfor) {
		this.vpcfor = vpcfor;
	}

	public BigDecimal getVpcgas() {
		return this.vpcgas;
	}

	public void setVpcgas(BigDecimal vpcgas) {
		this.vpcgas = vpcgas;
	}

	public String getVpcinv() {
		return this.vpcinv;
	}

	public void setVpcinv(String vpcinv) {
		this.vpcinv = vpcinv;
	}

	public BigDecimal getVpclld() {
		return this.vpclld;
	}

	public void setVpclld(BigDecimal vpclld) {
		this.vpclld = vpclld;
	}

	public BigDecimal getVpclle() {
		return this.vpclle;
	}

	public void setVpclle(BigDecimal vpclle) {
		this.vpclle = vpclle;
	}

	public String getVpclrt() {
		return this.vpclrt;
	}

	public void setVpclrt(String vpclrt) {
		this.vpclrt = vpclrt;
	}

	public String getVpclsc() {
		return this.vpclsc;
	}

	public void setVpclsc(String vpclsc) {
		this.vpclsc = vpclsc;
	}

	public BigDecimal getVpcncd() {
		return this.vpcncd;
	}

	public void setVpcncd(BigDecimal vpcncd) {
		this.vpcncd = vpcncd;
	}

	public BigDecimal getVpcnmd() {
		return this.vpcnmd;
	}

	public void setVpcnmd(BigDecimal vpcnmd) {
		this.vpcnmd = vpcnmd;
	}

	public BigDecimal getVpcphd() {
		return this.vpcphd;
	}

	public void setVpcphd(BigDecimal vpcphd) {
		this.vpcphd = vpcphd;
	}

	public BigDecimal getVpcpnd() {
		return this.vpcpnd;
	}

	public void setVpcpnd(BigDecimal vpcpnd) {
		this.vpcpnd = vpcpnd;
	}

	public BigDecimal getVpcpod() {
		return this.vpcpod;
	}

	public void setVpcpod(BigDecimal vpcpod) {
		this.vpcpod = vpcpod;
	}

	public BigDecimal getVpcprm() {
		return this.vpcprm;
	}

	public void setVpcprm(BigDecimal vpcprm) {
		this.vpcprm = vpcprm;
	}

	public BigDecimal getVpctdd() {
		return this.vpctdd;
	}

	public void setVpctdd(BigDecimal vpctdd) {
		this.vpctdd = vpctdd;
	}

	public BigDecimal getVpctpl() {
		return this.vpctpl;
	}

	public void setVpctpl(BigDecimal vpctpl) {
		this.vpctpl = vpctpl;
	}

	public String getVpctrl() {
		return this.vpctrl;
	}

	public void setVpctrl(String vpctrl) {
		this.vpctrl = vpctrl;
	}

	public BigDecimal getVpcund() {
		return this.vpcund;
	}

	public void setVpcund(BigDecimal vpcund) {
		this.vpcund = vpcund;
	}

	public BigDecimal getVpcves() {
		return this.vpcves;
	}

	public void setVpcves(BigDecimal vpcves) {
		this.vpcves = vpcves;
	}

	public String getVpcwsg() {
		return this.vpcwsg;
	}

	public void setVpcwsg(String vpcwsg) {
		this.vpcwsg = vpcwsg;
	}

	public String getVphrsa() {
		return this.vphrsa;
	}

	public void setVphrsa(String vphrsa) {
		this.vphrsa = vphrsa;
	}

	public String getWartext() {
		return this.wartext;
	}

	public void setWartext(String wartext) {
		this.wartext = wartext;
	}

	public BigDecimal getXgenProductid() {
		return this.xgenProductid;
	}

	public void setXgenProductid(BigDecimal xgenProductid) {
		this.xgenProductid = xgenProductid;
	}

	public Long getZip() {
		return this.zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

}*/