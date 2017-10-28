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
 * The persistent class for the TTRN_INSCOVERED_INFO_VOC database table.
 * 
 */
@Entity
@Table(name="TTRN_INSCOVERED_INFO_VOC")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnInscoveredInfoVoc implements Serializable {
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
	private BigDecimal deductiblesvocatd;

	@Column(precision=10)
	private BigDecimal deductiblesvocbpr;

	@Column(precision=10)
	private BigDecimal deductiblesvoccng;

	@Column(length=200)
	private String deductiblesvocdep;

	@Column(precision=10)
	private BigDecimal deductiblesvoceas;

	@Column(precision=10)
	private BigDecimal deductiblesvocexg;

	@Column(precision=10)
	private BigDecimal deductiblesvocgas;

	@Column(precision=10)
	private BigDecimal deductiblesvocih;

	@Column(precision=10)
	private BigDecimal deductiblesvocipd;

	@Column(precision=10)
	private BigDecimal deductiblesvoclle;

	@Column(precision=10)
	private BigDecimal deductiblesvocllm;

	@Column(precision=10)
	private BigDecimal deductiblesvocllw;

	@Column(precision=10)
	private BigDecimal deductiblesvocncd;

	@Column(precision=10)
	private BigDecimal deductiblesvocnfe;

	@Column(precision=10)
	private BigDecimal deductiblesvocnfn;

	@Column(precision=10)
	private BigDecimal deductiblesvocotr;

	@Column(precision=10)
	private BigDecimal deductiblesvocpnd;

	@Column(precision=10)
	private BigDecimal deductiblesvocpod;

	@Column(precision=10)
	private BigDecimal deductiblesvocptm;

	@Column(precision=10)
	private BigDecimal deductiblesvoctdd;

	@Column(precision=10)
	private BigDecimal deductiblesvoctow;

	@Column(precision=10)
	private BigDecimal deductiblesvoctpl;

	@Column(precision=10)
	private BigDecimal deductiblesvocves;

	@Column(length=200)
	private String deductiblesvocwsg;

	@Column(length=200)
	private String deductiblevocnea;

	@Column(length=30)
	private String engineno;

	@Column(length=200)
	private String hypothecatedto;

	@Column(precision=10)
	private Double itemsi;//chnaged from BigDecimal To Double

	@Column(length=30)
	private String logbooknumber;

	@Column(length=50)
	private String make;

	@Column(precision=10)
	private String mfgyr;//changed from String To String

	@Column(length=50)
	private String model;

	@Column(precision=10)
	private Long ncdgrade;//changed from BigDecimal To Long

	@Column(length=100)
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
	private BigDecimal sivocatd;

	@Column(precision=10)
	private BigDecimal sivocbpr;

	@Column(precision=10)
	private BigDecimal sivoccng;

	@Column(length=200)
	private String sivocdep;

	@Column(precision=10)
	private BigDecimal sivoceas;

	@Column(precision=10)
	private BigDecimal sivocexg;

	@Column(precision=10)
	private BigDecimal sivocgas;

	@Column(precision=10)
	private BigDecimal sivocih;

	@Column(precision=10)
	private BigDecimal sivocipd;

	@Column(precision=10)
	private BigDecimal sivoclle;

	@Column(precision=10)
	private BigDecimal sivocllm;

	@Column(precision=10)
	private BigDecimal sivocllw;

	@Column(precision=10)
	private BigDecimal sivocncd;

	@Column(length=200)
	private String sivocnea;

	@Column(precision=10)
	private BigDecimal sivocnfe;

	@Column(precision=10)
	private BigDecimal sivocnfn;

	@Column(precision=10)
	private BigDecimal sivocotr;

	@Column(precision=10)
	private BigDecimal sivocpnd;

	@Column(precision=10)
	private BigDecimal sivocpod;

	@Column(precision=10)
	private BigDecimal sivocptm;

	@Column(precision=10)
	private BigDecimal sivoctdd;

	@Column(precision=10)
	private BigDecimal sivoctow;

	@Column(precision=10)
	private BigDecimal sivoctpl;

	@Column(precision=10)
	private BigDecimal sivocves;

	@Column(length=200)
	private String sivocwsg;

	@Column(length=10)
	private String territory2;

	@Column(length=100)
	private String territorystate;

	@Column(length=4)
	private String usagecode;

	@Column(length=30)
	private String vehicleregistrationdate;

	@Column(precision=10)
	private BigDecimal vocatd;

	@Column(precision=20, scale=2)
	private BigDecimal vocbpr;

	@Column(length=200)
	private String voccm1rate;

	@Column(precision=10)
	private BigDecimal voccng;

	@Column(length=200)
	private String vocdep;

	@Column(precision=20, scale=2)
	private BigDecimal voceas;

	@Column(precision=10)
	private BigDecimal vocexg;

	@Column(length=200)
	private String vocexl;

	@Column(precision=10)
	private BigDecimal vocgas;

	@Column(precision=10)
	private BigDecimal vocih;

	@Column(precision=10)
	private BigDecimal vocipd;

	@Column(precision=20, scale=2)
	private BigDecimal voclle;

	@Column(precision=10)
	private BigDecimal vocllm;

	@Column(precision=10)
	private BigDecimal vocllw;

	@Column(precision=20, scale=2)
	private BigDecimal vocncd;

	@Column(length=200)
	private String vocnea;

	@Column(precision=10)
	private BigDecimal vocnfe;

	@Column(precision=10)
	private BigDecimal vocnfn;

	@Column(precision=10)
	private BigDecimal vocotr;

	@Column(precision=10)
	private BigDecimal vocpnd;

	@Column(precision=10)
	private BigDecimal vocpod;

	@Column(precision=10)
	private BigDecimal vocptm;

	@Column(precision=20, scale=2)
	private BigDecimal voctdd;

	@Column(precision=10)
	private BigDecimal voctow;

	@Column(precision=20, scale=2)
	private BigDecimal voctpl;

	@Column(precision=10)
	private BigDecimal vocves;

	@Column(length=200)
	private String vocwsg;

	@Column(precision=10)
	private Long zip;//changed from BigDecimal To Long
	
	@Column(name="GSTNUMBER")
	private String Gstnumber;

	public TtrnInscoveredInfoVoc() {
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

	public BigDecimal getDeductiblesvocatd() {
		return this.deductiblesvocatd;
	}

	public void setDeductiblesvocatd(BigDecimal deductiblesvocatd) {
		this.deductiblesvocatd = deductiblesvocatd;
	}

	public BigDecimal getDeductiblesvocbpr() {
		return this.deductiblesvocbpr;
	}

	public void setDeductiblesvocbpr(BigDecimal deductiblesvocbpr) {
		this.deductiblesvocbpr = deductiblesvocbpr;
	}

	public BigDecimal getDeductiblesvoccng() {
		return this.deductiblesvoccng;
	}

	public void setDeductiblesvoccng(BigDecimal deductiblesvoccng) {
		this.deductiblesvoccng = deductiblesvoccng;
	}

	public String getDeductiblesvocdep() {
		return this.deductiblesvocdep;
	}

	public void setDeductiblesvocdep(String deductiblesvocdep) {
		this.deductiblesvocdep = deductiblesvocdep;
	}

	public BigDecimal getDeductiblesvoceas() {
		return this.deductiblesvoceas;
	}

	public void setDeductiblesvoceas(BigDecimal deductiblesvoceas) {
		this.deductiblesvoceas = deductiblesvoceas;
	}

	public BigDecimal getDeductiblesvocexg() {
		return this.deductiblesvocexg;
	}

	public void setDeductiblesvocexg(BigDecimal deductiblesvocexg) {
		this.deductiblesvocexg = deductiblesvocexg;
	}

	public BigDecimal getDeductiblesvocgas() {
		return this.deductiblesvocgas;
	}

	public void setDeductiblesvocgas(BigDecimal deductiblesvocgas) {
		this.deductiblesvocgas = deductiblesvocgas;
	}

	public BigDecimal getDeductiblesvocih() {
		return this.deductiblesvocih;
	}

	public void setDeductiblesvocih(BigDecimal deductiblesvocih) {
		this.deductiblesvocih = deductiblesvocih;
	}

	public BigDecimal getDeductiblesvocipd() {
		return this.deductiblesvocipd;
	}

	public void setDeductiblesvocipd(BigDecimal deductiblesvocipd) {
		this.deductiblesvocipd = deductiblesvocipd;
	}

	public BigDecimal getDeductiblesvoclle() {
		return this.deductiblesvoclle;
	}

	public void setDeductiblesvoclle(BigDecimal deductiblesvoclle) {
		this.deductiblesvoclle = deductiblesvoclle;
	}

	public BigDecimal getDeductiblesvocllm() {
		return this.deductiblesvocllm;
	}

	public void setDeductiblesvocllm(BigDecimal deductiblesvocllm) {
		this.deductiblesvocllm = deductiblesvocllm;
	}

	public BigDecimal getDeductiblesvocllw() {
		return this.deductiblesvocllw;
	}

	public void setDeductiblesvocllw(BigDecimal deductiblesvocllw) {
		this.deductiblesvocllw = deductiblesvocllw;
	}

	public BigDecimal getDeductiblesvocncd() {
		return this.deductiblesvocncd;
	}

	public void setDeductiblesvocncd(BigDecimal deductiblesvocncd) {
		this.deductiblesvocncd = deductiblesvocncd;
	}

	public BigDecimal getDeductiblesvocnfe() {
		return this.deductiblesvocnfe;
	}

	public void setDeductiblesvocnfe(BigDecimal deductiblesvocnfe) {
		this.deductiblesvocnfe = deductiblesvocnfe;
	}

	public BigDecimal getDeductiblesvocnfn() {
		return this.deductiblesvocnfn;
	}

	public void setDeductiblesvocnfn(BigDecimal deductiblesvocnfn) {
		this.deductiblesvocnfn = deductiblesvocnfn;
	}

	public BigDecimal getDeductiblesvocotr() {
		return this.deductiblesvocotr;
	}

	public void setDeductiblesvocotr(BigDecimal deductiblesvocotr) {
		this.deductiblesvocotr = deductiblesvocotr;
	}

	public BigDecimal getDeductiblesvocpnd() {
		return this.deductiblesvocpnd;
	}

	public void setDeductiblesvocpnd(BigDecimal deductiblesvocpnd) {
		this.deductiblesvocpnd = deductiblesvocpnd;
	}

	public BigDecimal getDeductiblesvocpod() {
		return this.deductiblesvocpod;
	}

	public void setDeductiblesvocpod(BigDecimal deductiblesvocpod) {
		this.deductiblesvocpod = deductiblesvocpod;
	}

	public BigDecimal getDeductiblesvocptm() {
		return this.deductiblesvocptm;
	}

	public void setDeductiblesvocptm(BigDecimal deductiblesvocptm) {
		this.deductiblesvocptm = deductiblesvocptm;
	}

	public BigDecimal getDeductiblesvoctdd() {
		return this.deductiblesvoctdd;
	}

	public void setDeductiblesvoctdd(BigDecimal deductiblesvoctdd) {
		this.deductiblesvoctdd = deductiblesvoctdd;
	}

	public BigDecimal getDeductiblesvoctow() {
		return this.deductiblesvoctow;
	}

	public void setDeductiblesvoctow(BigDecimal deductiblesvoctow) {
		this.deductiblesvoctow = deductiblesvoctow;
	}

	public BigDecimal getDeductiblesvoctpl() {
		return this.deductiblesvoctpl;
	}

	public void setDeductiblesvoctpl(BigDecimal deductiblesvoctpl) {
		this.deductiblesvoctpl = deductiblesvoctpl;
	}

	public BigDecimal getDeductiblesvocves() {
		return this.deductiblesvocves;
	}

	public void setDeductiblesvocves(BigDecimal deductiblesvocves) {
		this.deductiblesvocves = deductiblesvocves;
	}

	public String getDeductiblesvocwsg() {
		return this.deductiblesvocwsg;
	}

	public void setDeductiblesvocwsg(String deductiblesvocwsg) {
		this.deductiblesvocwsg = deductiblesvocwsg;
	}

	public String getDeductiblevocnea() {
		return this.deductiblevocnea;
	}

	public void setDeductiblevocnea(String deductiblevocnea) {
		this.deductiblevocnea = deductiblevocnea;
	}


	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
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

	public BigDecimal getSivocatd() {
		return this.sivocatd;
	}

	public void setSivocatd(BigDecimal sivocatd) {
		this.sivocatd = sivocatd;
	}

	public BigDecimal getSivocbpr() {
		return this.sivocbpr;
	}

	public void setSivocbpr(BigDecimal sivocbpr) {
		this.sivocbpr = sivocbpr;
	}

	public BigDecimal getSivoccng() {
		return this.sivoccng;
	}

	public void setSivoccng(BigDecimal sivoccng) {
		this.sivoccng = sivoccng;
	}

	public String getSivocdep() {
		return this.sivocdep;
	}

	public void setSivocdep(String sivocdep) {
		this.sivocdep = sivocdep;
	}

	public BigDecimal getSivoceas() {
		return this.sivoceas;
	}

	public void setSivoceas(BigDecimal sivoceas) {
		this.sivoceas = sivoceas;
	}

	public BigDecimal getSivocexg() {
		return this.sivocexg;
	}

	public void setSivocexg(BigDecimal sivocexg) {
		this.sivocexg = sivocexg;
	}

	public BigDecimal getSivocgas() {
		return this.sivocgas;
	}

	public void setSivocgas(BigDecimal sivocgas) {
		this.sivocgas = sivocgas;
	}

	public BigDecimal getSivocih() {
		return this.sivocih;
	}

	public void setSivocih(BigDecimal sivocih) {
		this.sivocih = sivocih;
	}

	public BigDecimal getSivocipd() {
		return this.sivocipd;
	}

	public void setSivocipd(BigDecimal sivocipd) {
		this.sivocipd = sivocipd;
	}

	public BigDecimal getSivoclle() {
		return this.sivoclle;
	}

	public void setSivoclle(BigDecimal sivoclle) {
		this.sivoclle = sivoclle;
	}

	public BigDecimal getSivocllm() {
		return this.sivocllm;
	}

	public void setSivocllm(BigDecimal sivocllm) {
		this.sivocllm = sivocllm;
	}

	public BigDecimal getSivocllw() {
		return this.sivocllw;
	}

	public void setSivocllw(BigDecimal sivocllw) {
		this.sivocllw = sivocllw;
	}

	public BigDecimal getSivocncd() {
		return this.sivocncd;
	}

	public void setSivocncd(BigDecimal sivocncd) {
		this.sivocncd = sivocncd;
	}

	public String getSivocnea() {
		return this.sivocnea;
	}

	public void setSivocnea(String sivocnea) {
		this.sivocnea = sivocnea;
	}

	public BigDecimal getSivocnfe() {
		return this.sivocnfe;
	}

	public void setSivocnfe(BigDecimal sivocnfe) {
		this.sivocnfe = sivocnfe;
	}

	public BigDecimal getSivocnfn() {
		return this.sivocnfn;
	}

	public void setSivocnfn(BigDecimal sivocnfn) {
		this.sivocnfn = sivocnfn;
	}

	public BigDecimal getSivocotr() {
		return this.sivocotr;
	}

	public void setSivocotr(BigDecimal sivocotr) {
		this.sivocotr = sivocotr;
	}

	public BigDecimal getSivocpnd() {
		return this.sivocpnd;
	}

	public void setSivocpnd(BigDecimal sivocpnd) {
		this.sivocpnd = sivocpnd;
	}

	public BigDecimal getSivocpod() {
		return this.sivocpod;
	}

	public void setSivocpod(BigDecimal sivocpod) {
		this.sivocpod = sivocpod;
	}

	public BigDecimal getSivocptm() {
		return this.sivocptm;
	}

	public void setSivocptm(BigDecimal sivocptm) {
		this.sivocptm = sivocptm;
	}

	public BigDecimal getSivoctdd() {
		return this.sivoctdd;
	}

	public void setSivoctdd(BigDecimal sivoctdd) {
		this.sivoctdd = sivoctdd;
	}

	public BigDecimal getSivoctow() {
		return this.sivoctow;
	}

	public void setSivoctow(BigDecimal sivoctow) {
		this.sivoctow = sivoctow;
	}

	public BigDecimal getSivoctpl() {
		return this.sivoctpl;
	}

	public void setSivoctpl(BigDecimal sivoctpl) {
		this.sivoctpl = sivoctpl;
	}

	public BigDecimal getSivocves() {
		return this.sivocves;
	}

	public void setSivocves(BigDecimal sivocves) {
		this.sivocves = sivocves;
	}

	public String getSivocwsg() {
		return this.sivocwsg;
	}

	public void setSivocwsg(String sivocwsg) {
		this.sivocwsg = sivocwsg;
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

	public BigDecimal getVocatd() {
		return this.vocatd;
	}

	public void setVocatd(BigDecimal vocatd) {
		this.vocatd = vocatd;
	}

	public BigDecimal getVocbpr() {
		return this.vocbpr;
	}

	public void setVocbpr(BigDecimal vocbpr) {
		this.vocbpr = vocbpr;
	}

	public String getVoccm1rate() {
		return this.voccm1rate;
	}

	public void setVoccm1rate(String voccm1rate) {
		this.voccm1rate = voccm1rate;
	}

	public BigDecimal getVoccng() {
		return this.voccng;
	}

	public void setVoccng(BigDecimal voccng) {
		this.voccng = voccng;
	}

	public String getVocdep() {
		return this.vocdep;
	}

	public void setVocdep(String vocdep) {
		this.vocdep = vocdep;
	}

	public BigDecimal getVoceas() {
		return this.voceas;
	}

	public void setVoceas(BigDecimal voceas) {
		this.voceas = voceas;
	}

	public BigDecimal getVocexg() {
		return this.vocexg;
	}

	public void setVocexg(BigDecimal vocexg) {
		this.vocexg = vocexg;
	}

	public String getVocexl() {
		return this.vocexl;
	}

	public void setVocexl(String vocexl) {
		this.vocexl = vocexl;
	}

	public BigDecimal getVocgas() {
		return this.vocgas;
	}

	public void setVocgas(BigDecimal vocgas) {
		this.vocgas = vocgas;
	}

	public BigDecimal getVocih() {
		return this.vocih;
	}

	public void setVocih(BigDecimal vocih) {
		this.vocih = vocih;
	}

	public BigDecimal getVocipd() {
		return this.vocipd;
	}

	public void setVocipd(BigDecimal vocipd) {
		this.vocipd = vocipd;
	}

	public BigDecimal getVoclle() {
		return this.voclle;
	}

	public void setVoclle(BigDecimal voclle) {
		this.voclle = voclle;
	}

	public BigDecimal getVocllm() {
		return this.vocllm;
	}

	public void setVocllm(BigDecimal vocllm) {
		this.vocllm = vocllm;
	}

	public BigDecimal getVocllw() {
		return this.vocllw;
	}

	public void setVocllw(BigDecimal vocllw) {
		this.vocllw = vocllw;
	}

	public BigDecimal getVocncd() {
		return this.vocncd;
	}

	public void setVocncd(BigDecimal vocncd) {
		this.vocncd = vocncd;
	}

	public String getVocnea() {
		return this.vocnea;
	}

	public void setVocnea(String vocnea) {
		this.vocnea = vocnea;
	}

	public BigDecimal getVocnfe() {
		return this.vocnfe;
	}

	public void setVocnfe(BigDecimal vocnfe) {
		this.vocnfe = vocnfe;
	}

	public BigDecimal getVocnfn() {
		return this.vocnfn;
	}

	public void setVocnfn(BigDecimal vocnfn) {
		this.vocnfn = vocnfn;
	}

	public BigDecimal getVocotr() {
		return this.vocotr;
	}

	public void setVocotr(BigDecimal vocotr) {
		this.vocotr = vocotr;
	}

	public BigDecimal getVocpnd() {
		return this.vocpnd;
	}

	public void setVocpnd(BigDecimal vocpnd) {
		this.vocpnd = vocpnd;
	}

	public BigDecimal getVocpod() {
		return this.vocpod;
	}

	public void setVocpod(BigDecimal vocpod) {
		this.vocpod = vocpod;
	}

	public BigDecimal getVocptm() {
		return this.vocptm;
	}

	public void setVocptm(BigDecimal vocptm) {
		this.vocptm = vocptm;
	}

	public BigDecimal getVoctdd() {
		return this.voctdd;
	}

	public void setVoctdd(BigDecimal voctdd) {
		this.voctdd = voctdd;
	}

	public BigDecimal getVoctow() {
		return this.voctow;
	}

	public void setVoctow(BigDecimal voctow) {
		this.voctow = voctow;
	}

	public BigDecimal getVoctpl() {
		return this.voctpl;
	}

	public void setVoctpl(BigDecimal voctpl) {
		this.voctpl = voctpl;
	}

	public BigDecimal getVocves() {
		return this.vocves;
	}

	public void setVocves(BigDecimal vocves) {
		this.vocves = vocves;
	}

	public String getVocwsg() {
		return this.vocwsg;
	}

	public void setVocwsg(String vocwsg) {
		this.vocwsg = vocwsg;
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
//  }
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
//public String getSectionno() {
//return this.sectionno;
//}
//
//public void setSectionno(String sectionno) {
//this.sectionno = sectionno;
//}
//public String getRiskblock() {
//return this.riskblock;
//}
//
//public void setRiskblock(String riskblock) {
//this.riskblock = riskblock;
//}
//
//public String getRiskcategory() {
//return this.riskcategory;
//}
//
//public void setRiskcategory(String riskcategory) {
//this.riskcategory = riskcategory;
//}
//
//public BigDecimal getRoadtype() {
//return this.roadtype;
//}
//
//public void setRoadtype(BigDecimal roadtype) {
//this.roadtype = roadtype;
//}
//
//public String getRoadtypedesc() {
//return this.roadtypedesc;
//}
//
//public void setRoadtypedesc(String roadtypedesc) {
//this.roadtypedesc = roadtypedesc;
//}
//
//public BigDecimal getRound1() {
//return this.round1;
//}
//
//public void setRound1(BigDecimal round1) {
//this.round1 = round1;
//}
//
//public BigDecimal getRound2() {
//return this.round2;
//}
//
//public void setRound2(BigDecimal round2) {
//this.round2 = round2;
//}
//
//public BigDecimal getSafetyfea() {
//return this.safetyfea;
//}
//
//public void setSafetyfea(BigDecimal safetyfea) {
//this.safetyfea = safetyfea;
//}
//public BigDecimal getParkingfac() {
//return this.parkingfac;
//}
//
//public void setParkingfac(BigDecimal parkingfac) {
//this.parkingfac = parkingfac;
//}
//
//public BigDecimal getRecordno() {
//return this.recordno;
//}
//
//public void setRecordno(BigDecimal recordno) {
//this.recordno = recordno;
//}
//
//public BigDecimal getRecordtype() {
//return this.recordtype;
//}
//
//public void setRecordtype(BigDecimal recordtype) {
//this.recordtype = recordtype;
//}
//public String getNoofdrivers() {
//return this.noofdrivers;
//}
//
//public void setNoofdrivers(String noofdrivers) {
//this.noofdrivers = noofdrivers;
//}
//public String getItemno() {
//return this.itemno;
//}
//
//public void setItemno(String itemno) {
//this.itemno = itemno;
//}
//public BigDecimal getFueltype() {
//return this.fueltype;
//}
//
//public void setFueltype(BigDecimal fueltype) {
//this.fueltype = fueltype;
//}
//
//public BigDecimal getGvweight() {
//return this.gvweight;
//}
//
//public void setGvweight(BigDecimal gvweight) {
//this.gvweight = gvweight;
//}
//	public String getEml() {
//	return this.eml;
//}
//
//public void setEml(String eml) {
//	this.eml = eml;
//}
//public BigDecimal getDeductiblesround1() {
//return this.deductiblesround1;
//}
//
//public void setDeductiblesround1(BigDecimal deductiblesround1) {
//this.deductiblesround1 = deductiblesround1;
//}
//
//public BigDecimal getDeductiblesround2() {
//return this.deductiblesround2;
//}
//
//public void setDeductiblesround2(BigDecimal deductiblesround2) {
//this.deductiblesround2 = deductiblesround2;
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
//public String getBlank2() {
//return this.blank2;
//}
//
//public void setBlank2(String blank2) {
//this.blank2 = blank2;
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
//public String getBlank5() {
//return this.blank5;
//}
//
//public void setBlank5(String blank5) {
//this.blank5 = blank5;
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
//@Column(length=30)
//private String wartext;

//@Column(name="XGEN_PRODUCTID", precision=10)
//private BigDecimal xgenProductid;

//@Column(length=5)
//private String sectionno;
//@Column(length=30)
//private String riskblock;

//@Column(length=30)
//private String riskcategory;

//@Column(precision=10)
//private BigDecimal roadtype;

//@Column(length=200)
//private String roadtypedesc;

//@Column(precision=20, scale=2)
//private BigDecimal round1;

//@Column(precision=10, scale=2)
//private BigDecimal round2;

//@Column(precision=10)
//private BigDecimal safetyfea;

//@Column(precision=10)
//private BigDecimal parkingfac;

//@Column(precision=10)
//private BigDecimal recordno;

//@Column(precision=10)
//private BigDecimal recordtype;

//@Column(length=20)
//private String noofdrivers;
//@Column(length=5)
//private String itemno;

//@Column(precision=10)
//private BigDecimal fueltype;

//@Column(precision=10)
//private BigDecimal gvweight;

//@Column(length=3)
//private String eml;

//@Column(precision=10)
//private BigDecimal deductiblesround1;

//@Column(precision=10)
//private BigDecimal deductiblesround2;

//@Column(length=1)
//private String active;

//@Column(precision=10)
//private BigDecimal batchid;

//@Column(length=50)
//private String blank1;

//@Column(length=50)
//private String blank2;

//@Column(length=50)
//private String blank4;

//@Column(length=200)
//private String blank5;

//@Column(length=200)
//private String blank6;

//@Column(length=200)
//private String blank7;	
	
}