package com.rs.epl.NB.oementity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "TTRN_INSCOVERED_INFO")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnInscovered implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String xgenPolicyno;	
	private String registringauthority;
	private Long ncdgrade;
	private String hypothecatedto;
	private Double itemsi;
	@Column(name="otherparty")
	private String otherparty;
	private String cover;	
	private String territorystate;
	private Long zip;
	private String territory2;
	private String usagecode;
	private String model;
	private String make;
	private String class_;
	private String color;
	private String mfgyr;
	private String vehicleregistrationdate;
	private String regno;
	private String chassisno;
	private String engineno;
	private Long capacity;	
	private Long seatingcapacity;
	private String logbooknumber;
	private String deductible;
	private Long sivpcvpr;
	private Long sivpcvea;
	private Long sivpcvcn;
	private Long sivpcvnc;
	private Long sivpcvxg;
	private Long sivpcvfd;
	private Long sivpcvve;
	private Long sivpcvat;
	private Long sivpcvtp;
	private Long sivpcvgs;
	private Long sivpcvop;
	private Long sivpcvpn;
	private Long sivpcvll;
	private Long sivpcvlp;
	private Long sivpcvtm;
	private Long sivpcvld;
	private Long sivpcvlw;
	private Long sivpcvfo;
	private Long sivpcvnp;
	private Long sivpcvnf;
	private Long vpcvpr;
	private Long vpcvea;
	private Long vpcvcn;
	private Long vpcvnc;
	private Long vpcvxg;
	private Long vpcvfd;
	private Long vpcvve;
	private Long round1;
	private Long vpcvat;
	private Long vpcvtp;
	private Long vpcvgs;
	private Long vpcvop;
	private Long vpcvpn;
	private Long vpcvll;
	private Long vpcvlp;
	private Long vpcvtm;
	private Long vpcvld;
	private Long vpcvlw;
	private Long round2;
	private Long vpcvfo;
	private Long vpcvnp;
	private Long vpcvnf;
	private Long deductiblesvpcvpr;
	private Long deductiblesvpcvea;
	private Long deductiblesvpcvcn;
	private Long deductiblesvpcvnc;
	private Long deductiblesvpcvxg;
	private Long deductiblesvpcvfd;
	private Long deductiblesvpcvve;
	private Long deductiblesvpcvat;
	private Long deductiblesvpcvtp;
	private Long deductiblesvpcvgs;
	private Long deductiblesvpcvop;
	private Long deductiblesvpcvpn;
	private Long deductiblesvpcvll;
	private Long deductiblesvpcvlp;
	private Long deductiblesvpcvtm;
	private Long deductiblesvpcvld;
	private Long deductiblesvpcvlw;
	private Long deductiblesvpcvfo;
	private Long deductiblesvpcvnp;
	private Long deductiblesvpcvnf;
	private Long sivpcprm;
	private Long sivpceas;
	private Long sivpccng;
	private Long sivpctrl;
	private Long sivpcexg;
	private Long sivpcfor;
	private Long sivpcdte;
	private Long sivpctdd;
	private Long sivpcphd;
	private Long sivpcves;
	private Long sivpcaad;
	private Long sivpccvd;
	private Long sivpcncd;
	private Long siround1;
	private Long sivpcatd;
	private Long sivpctpl;
	private Long sivpcgas;
	private Long sivpcpod;
	private Long sivpcpnd;
	private Long sivpcnmd;
	private Long sivpcund;
	private Long sivpclld;
	private String sivpclle;
	private String siround2;
	private String sivpccm2;
	private Long vpcprm;
	private Long vpceas;
	private Long vpccng;
	private String vpctrl;
	private Long vpcexg;
	private Long vpcfor;
	private Long vpcdte;
	private Long vpctdd;
	private Long vpcphd;
	private Long vpcves;
	private Long vpcaad;
	private String vpccvd;
	private Long vpcncd;
	private Long vpcatd;
	private Long vpctpl;
	private Long vpcgas;
	private Long vpcpod;
	private Long vpcpnd;
	private Long vpcnmd;
	private Long vpcund;
	private Long vpclld;
	private Long vpclle;
	private Long vpccm2;
	private Long deductiblesvpcprm;
	private Long deductiblesvpceas;
	private Long deductiblesvpccng;
	private Long deductiblesvpctrl;
	private Long deductiblesvpcexg;
	private Long deductiblesvpcfor;
	private Long deductiblesvpcdte;
	private Long deductiblesvpctdd;
	private Long deductiblesvpcphd;
	private Long deductiblesvpcves;
	private Long deductiblesvpcaad;
	private Long deductiblesvpccvd;
	private Long deductiblesvpcncd;
	private Long deductiblesround1;
	private Long deductiblesvpcatd;
	private Long deductiblesvpctpl;
	private Long deductiblesvpcgas;
	private Long deductiblesvpcpod;
	private Long deductiblesvpcpnd;
	private Long deductiblesvpcnmd;
	private Long deductiblesvpcund;
	private Long deductiblesvpclld;
	private Long deductiblesvpclle;
	private Long deductiblesround2;
	private Long deductiblesvpccm2;
	private String sivpcfbg;
	private Long vpcfbg;
	private Long deductiblesvpcfbg;
	private String oldinsured;
	private String oldpolexp;
	private String sivpcwsg;
	private String vpcwsg;
	private String deductiblesvpcwsg;
	private String sivpcdep;
	private String vpcdep;
	private String deductiblesvpcdep;
	private String sivpclrt;
	private String vpclrt;
	private String deductiblesvpclrt;

	private String sivpclsc;
	private String vpclsc;
	private String deductiblesvpclsc;
	private String sivpcinv;
	private String vpcinv;
	private String deductiblesvpcinv;
	private String sivpcbag;
	private String vpcbag;
	private String deductiblesvpcbag;

	private String sivpcvde;
	private String vpcvde;
	private String deductiblesvpcvde;
	private String sivpcvws;
	private String vpcvws;
	private String deductiblesvpcvws;
	private String sivpcvfg;
	private String vpcvfg;
	private String deductiblesvpcvfg;

	private Long vpccng1;
	private Long sivpceng;
	private Long vpceng;
	private Long deductiblesvpceng;

	private Long sivpcncb;
	private Long vpcncb;
	private Long deductiblesvpcncb;
	private Long sivpcke1;
	private Long vpcke1;
	private Long deductiblesvpcke1;
	private Long sivpcnea;
	private Long vpcnea;
	private Long vpcexl;
	private Long sivpcke2;
	private Long vpcke2;
	private Long deductiblesvpcke2;
	private Long deductiblevpcnea;

	private String vpcvxl;
	private Long vpcvne;
	private Long sivpcvne;

	private String vpctow;	
	private String vpvtow;
	private String VPCCM1;
	private String VPCVM1;
	
	
	private String VPCVDT;
	
	@Column(name="GSTNUMBER")
	private String Gstnumber;
	
	public TtrnInscovered() {
		
	}

	public TtrnInscovered(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}


	@Id
	@Column(name = "XGEN_POLICYNO", unique = true, nullable = false, length = 16)
	public String getXgenPolicyno() {
		return this.xgenPolicyno;
	}

	public void setXgenPolicyno(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
	}

	

	@Column(name = "REGISTRINGAUTHORITY", length = 200)
	public String getRegistringauthority() {
		return this.registringauthority;
	}

	public void setRegistringauthority(String registringauthority) {
		this.registringauthority = registringauthority;
	}

	@Column(name = "NCDGRADE", precision = 10, scale = 0)
	public Long getNcdgrade() {
		return this.ncdgrade;
	}

	public void setNcdgrade(Long ncdgrade) {
		this.ncdgrade = ncdgrade;
	}

	@Column(name = "HYPOTHECATEDTO", length = 200)
	public String getHypothecatedto() {
		return this.hypothecatedto;
	}

	public void setHypothecatedto(String hypothecatedto) {
		this.hypothecatedto = hypothecatedto;
	}

	@Column(name = "ITEMSI", precision = 10, scale = 0)
	public Double getItemsi() {
		return this.itemsi;
	}

	public void setItemsi(Double itemsi) {
		this.itemsi = itemsi;
	}
	
	@Column(name = "COVER", length = 50)
	public String getCover() {
		return this.cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	

	@Column(name = "TERRITORYSTATE", length = 100)
	public String getTerritorystate() {
		return this.territorystate;
	}

	public void setTerritorystate(String territorystate) {
		this.territorystate = territorystate;
	}

	@Column(name = "ZIP", precision = 10, scale = 0)
	public Long getZip() {
		return this.zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	@Column(name = "TERRITORY2", length = 10)
	public String getTerritory2() {
		return this.territory2;
	}

	public void setTerritory2(String territory2) {
		this.territory2 = territory2;
	}

	@Column(name = "USAGECODE", length = 10)
	public String getUsagecode() {
		return this.usagecode;
	}

	public void setUsagecode(String usagecode) {
		this.usagecode = usagecode;
	}

	@Column(name = "MODEL", length = 50)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "MAKE", length = 50)
	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Column(name = "CLASS", length = 5)
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "COLOR", length = 50)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "MFGYR", precision = 10, scale = 0)
	public String getMfgyr() {
		return this.mfgyr;
	}

	public void setMfgyr(String mfgyr) {
		this.mfgyr = mfgyr;
	}

	@Column(name = "VEHICLEREGISTRATIONDATE", length = 30)
	public String getVehicleregistrationdate() {
		return this.vehicleregistrationdate;
	}

	public void setVehicleregistrationdate(String vehicleregistrationdate) {
		this.vehicleregistrationdate = vehicleregistrationdate;
	}

	@Column(name = "REGNO", length = 30)
	public String getRegno() {
		return this.regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	@Column(name = "CHASSISNO", length = 30)
	public String getChassisno() {
		return this.chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	@Column(name = "ENGINENO", length = 30)
	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	@Column(name = "CAPACITY", precision = 10, scale = 0)
	public Long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	

	@Column(name = "SEATINGCAPACITY", precision = 10, scale = 0)
	public Long getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(Long seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	@Column(name = "LOGBOOKNUMBER", length = 30)
	public String getLogbooknumber() {
		return this.logbooknumber;
	}

	public void setLogbooknumber(String logbooknumber) {
		this.logbooknumber = logbooknumber;
	}

	

	@Column(name = "DEDUCTIBLE", length = 10)
	public String getDeductible() {
		return this.deductible;
	}

	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}

	@Column(name = "SIVPCVPR", precision = 10, scale = 0)
	public Long getSivpcvpr() {
		return this.sivpcvpr;
	}

	public void setSivpcvpr(Long sivpcvpr) {
		this.sivpcvpr = sivpcvpr;
	}

	@Column(name = "SIVPCVEA", precision = 10, scale = 0)
	public Long getSivpcvea() {
		return this.sivpcvea;
	}

	public void setSivpcvea(Long sivpcvea) {
		this.sivpcvea = sivpcvea;
	}

	@Column(name = "SIVPCVCN", precision = 10, scale = 0)
	public Long getSivpcvcn() {
		return this.sivpcvcn;
	}

	public void setSivpcvcn(Long sivpcvcn) {
		this.sivpcvcn = sivpcvcn;
	}

	@Column(name = "SIVPCVNC", precision = 10, scale = 0)
	public Long getSivpcvnc() {
		return this.sivpcvnc;
	}

	public void setSivpcvnc(Long sivpcvnc) {
		this.sivpcvnc = sivpcvnc;
	}

	@Column(name = "SIVPCVXG", precision = 10, scale = 0)
	public Long getSivpcvxg() {
		return this.sivpcvxg;
	}

	public void setSivpcvxg(Long sivpcvxg) {
		this.sivpcvxg = sivpcvxg;
	}

	@Column(name = "SIVPCVFD", precision = 10, scale = 0)
	public Long getSivpcvfd() {
		return this.sivpcvfd;
	}

	public void setSivpcvfd(Long sivpcvfd) {
		this.sivpcvfd = sivpcvfd;
	}

	@Column(name = "SIVPCVVE", precision = 10, scale = 0)
	public Long getSivpcvve() {
		return this.sivpcvve;
	}

	public void setSivpcvve(Long sivpcvve) {
		this.sivpcvve = sivpcvve;
	}

	@Column(name = "SIVPCVAT", precision = 10, scale = 0)
	public Long getSivpcvat() {
		return this.sivpcvat;
	}

	public void setSivpcvat(Long sivpcvat) {
		this.sivpcvat = sivpcvat;
	}

	@Column(name = "SIVPCVTP", precision = 10, scale = 0)
	public Long getSivpcvtp() {
		return this.sivpcvtp;
	}

	public void setSivpcvtp(Long sivpcvtp) {
		this.sivpcvtp = sivpcvtp;
	}

	@Column(name = "SIVPCVGS", precision = 10, scale = 0)
	public Long getSivpcvgs() {
		return this.sivpcvgs;
	}

	public void setSivpcvgs(Long sivpcvgs) {
		this.sivpcvgs = sivpcvgs;
	}

	@Column(name = "SIVPCVOP", precision = 10, scale = 0)
	public Long getSivpcvop() {
		return this.sivpcvop;
	}

	public void setSivpcvop(Long sivpcvop) {
		this.sivpcvop = sivpcvop;
	}

	@Column(name = "SIVPCVPN", precision = 10, scale = 0)
	public Long getSivpcvpn() {
		return this.sivpcvpn;
	}

	public void setSivpcvpn(Long sivpcvpn) {
		this.sivpcvpn = sivpcvpn;
	}

	@Column(name = "SIVPCVLL", precision = 10, scale = 0)
	public Long getSivpcvll() {
		return this.sivpcvll;
	}

	public void setSivpcvll(Long sivpcvll) {
		this.sivpcvll = sivpcvll;
	}

	@Column(name = "SIVPCVLP", precision = 10, scale = 0)
	public Long getSivpcvlp() {
		return this.sivpcvlp;
	}

	public void setSivpcvlp(Long sivpcvlp) {
		this.sivpcvlp = sivpcvlp;
	}

	@Column(name = "SIVPCVTM", precision = 10, scale = 0)
	public Long getSivpcvtm() {
		return this.sivpcvtm;
	}

	public void setSivpcvtm(Long sivpcvtm) {
		this.sivpcvtm = sivpcvtm;
	}

	@Column(name = "SIVPCVLD", precision = 10, scale = 0)
	public Long getSivpcvld() {
		return this.sivpcvld;
	}

	public void setSivpcvld(Long sivpcvld) {
		this.sivpcvld = sivpcvld;
	}

	@Column(name = "SIVPCVLW", precision = 10, scale = 0)
	public Long getSivpcvlw() {
		return this.sivpcvlw;
	}

	public void setSivpcvlw(Long sivpcvlw) {
		this.sivpcvlw = sivpcvlw;
	}

	@Column(name = "SIVPCVFO", precision = 10, scale = 0)
	public Long getSivpcvfo() {
		return this.sivpcvfo;
	}

	public void setSivpcvfo(Long sivpcvfo) {
		this.sivpcvfo = sivpcvfo;
	}

	@Column(name = "SIVPCVNP", precision = 10, scale = 0)
	public Long getSivpcvnp() {
		return this.sivpcvnp;
	}

	public void setSivpcvnp(Long sivpcvnp) {
		this.sivpcvnp = sivpcvnp;
	}

	@Column(name = "SIVPCVNF", precision = 10)
	public Long getSivpcvnf() {
		return this.sivpcvnf;
	}

	public void setSivpcvnf(Long sivpcvnf) {
		this.sivpcvnf = sivpcvnf;
	}

	@Column(name = "VPCVPR", precision = 10)
	public Long getVpcvpr() {
		return this.vpcvpr;
	}

	public void setVpcvpr(Long vpcvpr) {
		this.vpcvpr = vpcvpr;
	}

	@Column(name = "VPCVEA", precision = 20)
	public Long getVpcvea() {
		return this.vpcvea;
	}

	public void setVpcvea(Long vpcvea) {
		this.vpcvea = vpcvea;
	}

	@Column(name = "VPCVCN", precision = 10, scale = 0)
	public Long getVpcvcn() {
		return this.vpcvcn;
	}

	public void setVpcvcn(Long vpcvcn) {
		this.vpcvcn = vpcvcn;
	}

	@Column(name = "VPCVNC", precision = 20)
	public Long getVpcvnc() {
		return this.vpcvnc;
	}

	public void setVpcvnc(Long vpcvnc) {
		this.vpcvnc = vpcvnc;
	}

	@Column(name = "VPCVXG", precision = 10, scale = 0)
	public Long getVpcvxg() {
		return this.vpcvxg;
	}

	public void setVpcvxg(Long vpcvxg) {
		this.vpcvxg = vpcvxg;
	}

	@Column(name = "VPCVFD", precision = 20)
	public Long getVpcvfd() {
		return this.vpcvfd;
	}

	public void setVpcvfd(Long vpcvfd) {
		this.vpcvfd = vpcvfd;
	}

	@Column(name = "VPCVVE", precision = 10, scale = 0)
	public Long getVpcvve() {
		return this.vpcvve;
	}

	public void setVpcvve(Long vpcvve) {
		this.vpcvve = vpcvve;
	}

	@Column(name = "ROUND1", precision = 20)
	public Long getRound1() {
		return this.round1;
	}

	public void setRound1(Long round1) {
		this.round1 = round1;
	}

	@Column(name = "VPCVAT", precision = 10, scale = 0)
	public Long getVpcvat() {
		return this.vpcvat;
	}

	public void setVpcvat(Long vpcvat) {
		this.vpcvat = vpcvat;
	}

	@Column(name = "VPCVTP", precision = 20)
	public Long getVpcvtp() {
		return this.vpcvtp;
	}

	public void setVpcvtp(Long vpcvtp) {
		this.vpcvtp = vpcvtp;
	}

	@Column(name = "VPCVGS", precision = 10, scale = 0)
	public Long getVpcvgs() {
		return this.vpcvgs;
	}

	public void setVpcvgs(Long vpcvgs) {
		this.vpcvgs = vpcvgs;
	}

	@Column(name = "VPCVOP", precision = 10, scale = 0)
	public Long getVpcvop() {
		return this.vpcvop;
	}

	public void setVpcvop(Long vpcvop) {
		this.vpcvop = vpcvop;
	}

	@Column(name = "VPCVPN", precision = 10, scale = 0)
	public Long getVpcvpn() {
		return this.vpcvpn;
	}

	public void setVpcvpn(Long vpcvpn) {
		this.vpcvpn = vpcvpn;
	}

	@Column(name = "VPCVLL", precision = 20)
	public Long getVpcvll() {
		return this.vpcvll;
	}

	public void setVpcvll(Long vpcvll) {
		this.vpcvll = vpcvll;
	}

	@Column(name = "VPCVLP", precision = 10, scale = 0)
	public Long getVpcvlp() {
		return this.vpcvlp;
	}

	public void setVpcvlp(Long vpcvlp) {
		this.vpcvlp = vpcvlp;
	}

	@Column(name = "VPCVTM", precision = 10, scale = 0)
	public Long getVpcvtm() {
		return this.vpcvtm;
	}

	public void setVpcvtm(Long vpcvtm) {
		this.vpcvtm = vpcvtm;
	}

	@Column(name = "VPCVLD", precision = 10)
	public Long getVpcvld() {
		return this.vpcvld;
	}

	public void setVpcvld(Long vpcvld) {
		this.vpcvld = vpcvld;
	}

	@Column(name = "VPCVLW", precision = 10, scale = 0)
	public Long getVpcvlw() {
		return this.vpcvlw;
	}

	public void setVpcvlw(Long vpcvlw) {
		this.vpcvlw = vpcvlw;
	}

	@Column(name = "ROUND2", precision = 20)
	public Long getRound2() {
		return this.round2;
	}

	public void setRound2(Long round2) {
		this.round2 = round2;
	}

	@Column(name = "VPCVFO", precision = 10, scale = 0)
	public Long getVpcvfo() {
		return this.vpcvfo;
	}

	public void setVpcvfo(Long vpcvfo) {
		this.vpcvfo = vpcvfo;
	}

	@Column(name = "VPCVNP", precision = 10, scale = 0)
	public Long getVpcvnp() {
		return this.vpcvnp;
	}

	public void setVpcvnp(Long vpcvnp) {
		this.vpcvnp = vpcvnp;
	}

	@Column(name = "VPCVNF", precision = 10)
	public Long getVpcvnf() {
		return this.vpcvnf;
	}

	public void setVpcvnf(Long vpcvnf) {
		this.vpcvnf = vpcvnf;
	}

	@Column(name = "DEDUCTIBLESVPCVPR", precision = 10)
	public Long getDeductiblesvpcvpr() {
		return this.deductiblesvpcvpr;
	}

	public void setDeductiblesvpcvpr(Long deductiblesvpcvpr) {
		this.deductiblesvpcvpr = deductiblesvpcvpr;
	}

	@Column(name = "DEDUCTIBLESVPCVEA", precision = 10)
	public Long getDeductiblesvpcvea() {
		return this.deductiblesvpcvea;
	}

	public void setDeductiblesvpcvea(Long deductiblesvpcvea) {
		this.deductiblesvpcvea = deductiblesvpcvea;
	}

	@Column(name = "DEDUCTIBLESVPCVCN", precision = 10)
	public Long getDeductiblesvpcvcn() {
		return this.deductiblesvpcvcn;
	}

	public void setDeductiblesvpcvcn(Long deductiblesvpcvcn) {
		this.deductiblesvpcvcn = deductiblesvpcvcn;
	}

	@Column(name = "DEDUCTIBLESVPCVNC", precision = 10)
	public Long getDeductiblesvpcvnc() {
		return this.deductiblesvpcvnc;
	}

	public void setDeductiblesvpcvnc(Long deductiblesvpcvnc) {
		this.deductiblesvpcvnc = deductiblesvpcvnc;
	}

	@Column(name = "DEDUCTIBLESVPCVXG", precision = 10)
	public Long getDeductiblesvpcvxg() {
		return this.deductiblesvpcvxg;
	}

	public void setDeductiblesvpcvxg(Long deductiblesvpcvxg) {
		this.deductiblesvpcvxg = deductiblesvpcvxg;
	}

	@Column(name = "DEDUCTIBLESVPCVFD", precision = 10)
	public Long getDeductiblesvpcvfd() {
		return this.deductiblesvpcvfd;
	}

	public void setDeductiblesvpcvfd(Long deductiblesvpcvfd) {
		this.deductiblesvpcvfd = deductiblesvpcvfd;
	}

	@Column(name = "DEDUCTIBLESVPCVVE", precision = 10)
	public Long getDeductiblesvpcvve() {
		return this.deductiblesvpcvve;
	}

	public void setDeductiblesvpcvve(Long deductiblesvpcvve) {
		this.deductiblesvpcvve = deductiblesvpcvve;
	}

	@Column(name = "DEDUCTIBLESVPCVAT", precision = 10)
	public Long getDeductiblesvpcvat() {
		return this.deductiblesvpcvat;
	}

	public void setDeductiblesvpcvat(Long deductiblesvpcvat) {
		this.deductiblesvpcvat = deductiblesvpcvat;
	}

	@Column(name = "DEDUCTIBLESVPCVTP", precision = 10)
	public Long getDeductiblesvpcvtp() {
		return this.deductiblesvpcvtp;
	}

	public void setDeductiblesvpcvtp(Long deductiblesvpcvtp) {
		this.deductiblesvpcvtp = deductiblesvpcvtp;
	}

	@Column(name = "DEDUCTIBLESVPCVGS", precision = 10)
	public Long getDeductiblesvpcvgs() {
		return this.deductiblesvpcvgs;
	}

	public void setDeductiblesvpcvgs(Long deductiblesvpcvgs) {
		this.deductiblesvpcvgs = deductiblesvpcvgs;
	}

	@Column(name = "DEDUCTIBLESVPCVOP", precision = 10)
	public Long getDeductiblesvpcvop() {
		return this.deductiblesvpcvop;
	}

	public void setDeductiblesvpcvop(Long deductiblesvpcvop) {
		this.deductiblesvpcvop = deductiblesvpcvop;
	}

	@Column(name = "DEDUCTIBLESVPCVPN", precision = 10)
	public Long getDeductiblesvpcvpn() {
		return this.deductiblesvpcvpn;
	}

	public void setDeductiblesvpcvpn(Long deductiblesvpcvpn) {
		this.deductiblesvpcvpn = deductiblesvpcvpn;
	}

	@Column(name = "DEDUCTIBLESVPCVLL", precision = 10)
	public Long getDeductiblesvpcvll() {
		return this.deductiblesvpcvll;
	}

	public void setDeductiblesvpcvll(Long deductiblesvpcvll) {
		this.deductiblesvpcvll = deductiblesvpcvll;
	}

	@Column(name = "DEDUCTIBLESVPCVLP", precision = 10)
	public Long getDeductiblesvpcvlp() {
		return this.deductiblesvpcvlp;
	}

	public void setDeductiblesvpcvlp(Long deductiblesvpcvlp) {
		this.deductiblesvpcvlp = deductiblesvpcvlp;
	}

	@Column(name = "DEDUCTIBLESVPCVTM", precision = 10)
	public Long getDeductiblesvpcvtm() {
		return this.deductiblesvpcvtm;
	}

	public void setDeductiblesvpcvtm(Long deductiblesvpcvtm) {
		this.deductiblesvpcvtm = deductiblesvpcvtm;
	}

	@Column(name = "DEDUCTIBLESVPCVLD", precision = 10)
	public Long getDeductiblesvpcvld() {
		return this.deductiblesvpcvld;
	}

	public void setDeductiblesvpcvld(Long deductiblesvpcvld) {
		this.deductiblesvpcvld = deductiblesvpcvld;
	}

	@Column(name = "DEDUCTIBLESVPCVLW", precision = 10)
	public Long getDeductiblesvpcvlw() {
		return this.deductiblesvpcvlw;
	}

	public void setDeductiblesvpcvlw(Long deductiblesvpcvlw) {
		this.deductiblesvpcvlw = deductiblesvpcvlw;
	}

	@Column(name = "DEDUCTIBLESVPCVFO", precision = 10)
	public Long getDeductiblesvpcvfo() {
		return this.deductiblesvpcvfo;
	}

	public void setDeductiblesvpcvfo(Long deductiblesvpcvfo) {
		this.deductiblesvpcvfo = deductiblesvpcvfo;
	}

	@Column(name = "DEDUCTIBLESVPCVNP", precision = 10)
	public Long getDeductiblesvpcvnp() {
		return this.deductiblesvpcvnp;
	}

	public void setDeductiblesvpcvnp(Long deductiblesvpcvnp) {
		this.deductiblesvpcvnp = deductiblesvpcvnp;
	}

	@Column(name = "DEDUCTIBLESVPCVNF", precision = 10)
	public Long getDeductiblesvpcvnf() {
		return this.deductiblesvpcvnf;
	}

	public void setDeductiblesvpcvnf(Long deductiblesvpcvnf) {
		this.deductiblesvpcvnf = deductiblesvpcvnf;
	}

	@Column(name = "SIVPCPRM", precision = 10, scale = 0)
	public Long getSivpcprm() {
		return this.sivpcprm;
	}

	public void setSivpcprm(Long sivpcprm) {
		this.sivpcprm = sivpcprm;
	}

	@Column(name = "SIVPCEAS", precision = 10, scale = 0)
	public Long getSivpceas() {
		return this.sivpceas;
	}

	public void setSivpceas(Long sivpceas) {
		this.sivpceas = sivpceas;
	}

	@Column(name = "SIVPCCNG", precision = 10, scale = 0)
	public Long getSivpccng() {
		return this.sivpccng;
	}

	public void setSivpccng(Long sivpccng) {
		this.sivpccng = sivpccng;
	}

	@Column(name = "SIVPCTRL", precision = 10, scale = 0)
	public Long getSivpctrl() {
		return this.sivpctrl;
	}

	public void setSivpctrl(Long sivpctrl) {
		this.sivpctrl = sivpctrl;
	}

	@Column(name = "SIVPCEXG", precision = 10, scale = 0)
	public Long getSivpcexg() {
		return this.sivpcexg;
	}

	public void setSivpcexg(Long sivpcexg) {
		this.sivpcexg = sivpcexg;
	}

	@Column(name = "SIVPCFOR", precision = 10, scale = 0)
	public Long getSivpcfor() {
		return this.sivpcfor;
	}

	public void setSivpcfor(Long sivpcfor) {
		this.sivpcfor = sivpcfor;
	}

	@Column(name = "SIVPCDTE", precision = 10, scale = 0)
	public Long getSivpcdte() {
		return this.sivpcdte;
	}

	public void setSivpcdte(Long sivpcdte) {
		this.sivpcdte = sivpcdte;
	}

	@Column(name = "SIVPCTDD", precision = 10, scale = 0)
	public Long getSivpctdd() {
		return this.sivpctdd;
	}

	public void setSivpctdd(Long sivpctdd) {
		this.sivpctdd = sivpctdd;
	}

	@Column(name = "SIVPCPHD", precision = 10, scale = 0)
	public Long getSivpcphd() {
		return this.sivpcphd;
	}

	public void setSivpcphd(Long sivpcphd) {
		this.sivpcphd = sivpcphd;
	}

	@Column(name = "SIVPCVES", precision = 10, scale = 0)
	public Long getSivpcves() {
		return this.sivpcves;
	}

	public void setSivpcves(Long sivpcves) {
		this.sivpcves = sivpcves;
	}

	@Column(name = "SIVPCAAD", precision = 10, scale = 0)
	public Long getSivpcaad() {
		return this.sivpcaad;
	}

	public void setSivpcaad(Long sivpcaad) {
		this.sivpcaad = sivpcaad;
	}

	@Column(name = "SIVPCCVD", precision = 10, scale = 0)
	public Long getSivpccvd() {
		return this.sivpccvd;
	}

	public void setSivpccvd(Long sivpccvd) {
		this.sivpccvd = sivpccvd;
	}

	@Column(name = "SIVPCNCD", precision = 10, scale = 0)
	public Long getSivpcncd() {
		return this.sivpcncd;
	}

	public void setSivpcncd(Long sivpcncd) {
		this.sivpcncd = sivpcncd;
	}

	@Column(name = "SIROUND1", precision = 10, scale = 0)
	public Long getSiround1() {
		return this.siround1;
	}

	public void setSiround1(Long siround1) {
		this.siround1 = siround1;
	}

	@Column(name = "SIVPCATD", precision = 10, scale = 0)
	public Long getSivpcatd() {
		return this.sivpcatd;
	}

	public void setSivpcatd(Long sivpcatd) {
		this.sivpcatd = sivpcatd;
	}

	@Column(name = "SIVPCTPL", precision = 10, scale = 0)
	public Long getSivpctpl() {
		return this.sivpctpl;
	}

	public void setSivpctpl(Long sivpctpl) {
		this.sivpctpl = sivpctpl;
	}

	@Column(name = "SIVPCGAS", precision = 10, scale = 0)
	public Long getSivpcgas() {
		return this.sivpcgas;
	}

	public void setSivpcgas(Long sivpcgas) {
		this.sivpcgas = sivpcgas;
	}

	@Column(name = "SIVPCPOD", precision = 10, scale = 0)
	public Long getSivpcpod() {
		return this.sivpcpod;
	}

	public void setSivpcpod(Long sivpcpod) {
		this.sivpcpod = sivpcpod;
	}

	@Column(name = "SIVPCPND", precision = 10, scale = 0)
	public Long getSivpcpnd() {
		return this.sivpcpnd;
	}

	public void setSivpcpnd(Long sivpcpnd) {
		this.sivpcpnd = sivpcpnd;
	}

	@Column(name = "SIVPCNMD", precision = 10, scale = 0)
	public Long getSivpcnmd() {
		return this.sivpcnmd;
	}

	public void setSivpcnmd(Long sivpcnmd) {
		this.sivpcnmd = sivpcnmd;
	}

	@Column(name = "SIVPCUND", precision = 10, scale = 0)
	public Long getSivpcund() {
		return this.sivpcund;
	}

	public void setSivpcund(Long sivpcund) {
		this.sivpcund = sivpcund;
	}

	@Column(name = "SIVPCLLD", precision = 10, scale = 0)
	public Long getSivpclld() {
		return this.sivpclld;
	}

	public void setSivpclld(Long sivpclld) {
		this.sivpclld = sivpclld;
	}

	@Column(name = "SIVPCLLE", length = 30)
	public String getSivpclle() {
		return this.sivpclle;
	}

	public void setSivpclle(String sivpclle) {
		this.sivpclle = sivpclle;
	}

	@Column(name = "SIROUND2", length = 30)
	public String getSiround2() {
		return this.siround2;
	}

	public void setSiround2(String siround2) {
		this.siround2 = siround2;
	}

	@Column(name = "SIVPCCM2", length = 30)
	public String getSivpccm2() {
		return this.sivpccm2;
	}

	public void setSivpccm2(String sivpccm2) {
		this.sivpccm2 = sivpccm2;
	}

	@Column(name = "VPCPRM", precision = 20)
	public Long getVpcprm() {
		return this.vpcprm;
	}

	public void setVpcprm(Long vpcprm) {
		this.vpcprm = vpcprm;
	}

	@Column(name = "VPCEAS", precision = 20)
	public Long getVpceas() {
		return this.vpceas;
	}

	public void setVpceas(Long vpceas) {
		this.vpceas = vpceas;
	}

	@Column(name = "VPCCNG", precision = 10, scale = 0)
	public Long getVpccng() {
		return this.vpccng;
	}

	public void setVpccng(Long vpccng) {
		this.vpccng = vpccng;
	}

	@Column(name = "VPCTRL", length = 30)
	public String getVpctrl() {
		return this.vpctrl;
	}

	public void setVpctrl(String vpctrl) {
		this.vpctrl = vpctrl;
	}

	@Column(name = "VPCEXG", precision = 10, scale = 0)
	public Long getVpcexg() {
		return this.vpcexg;
	}

	public void setVpcexg(Long vpcexg) {
		this.vpcexg = vpcexg;
	}

	@Column(name = "VPCFOR", precision = 10, scale = 0)
	public Long getVpcfor() {
		return this.vpcfor;
	}

	public void setVpcfor(Long vpcfor) {
		this.vpcfor = vpcfor;
	}

	@Column(name = "VPCDTE", precision = 10, scale = 0)
	public Long getVpcdte() {
		return this.vpcdte;
	}

	public void setVpcdte(Long vpcdte) {
		this.vpcdte = vpcdte;
	}

	@Column(name = "VPCTDD", precision = 20)
	public Long getVpctdd() {
		return this.vpctdd;
	}

	public void setVpctdd(Long vpctdd) {
		this.vpctdd = vpctdd;
	}

	@Column(name = "VPCPHD", precision = 20)
	public Long getVpcphd() {
		return this.vpcphd;
	}

	public void setVpcphd(Long vpcphd) {
		this.vpcphd = vpcphd;
	}

	@Column(name = "VPCVES", precision = 10, scale = 0)
	public Long getVpcves() {
		return this.vpcves;
	}

	public void setVpcves(Long vpcves) {
		this.vpcves = vpcves;
	}

	@Column(name = "VPCAAD", precision = 20)
	public Long getVpcaad() {
		return this.vpcaad;
	}

	public void setVpcaad(Long vpcaad) {
		this.vpcaad = vpcaad;
	}

	@Column(name = "VPCCVD", length = 30)
	public String getVpccvd() {
		return this.vpccvd;
	}

	public void setVpccvd(String vpccvd) {
		this.vpccvd = vpccvd;
	}

	@Column(name = "VPCNCD", precision = 20)
	public Long getVpcncd() {
		return this.vpcncd;
	}

	public void setVpcncd(Long vpcncd) {
		this.vpcncd = vpcncd;
	}

	@Column(name = "VPCATD", precision = 10, scale = 0)
	public Long getVpcatd() {
		return this.vpcatd;
	}

	public void setVpcatd(Long vpcatd) {
		this.vpcatd = vpcatd;
	}

	@Column(name = "VPCTPL", precision = 20)
	public Long getVpctpl() {
		return this.vpctpl;
	}

	public void setVpctpl(Long vpctpl) {
		this.vpctpl = vpctpl;
	}

	@Column(name = "VPCGAS", precision = 10, scale = 0)
	public Long getVpcgas() {
		return this.vpcgas;
	}

	public void setVpcgas(Long vpcgas) {
		this.vpcgas = vpcgas;
	}

	@Column(name = "VPCPOD", precision = 10, scale = 0)
	public Long getVpcpod() {
		return this.vpcpod;
	}

	public void setVpcpod(Long vpcpod) {
		this.vpcpod = vpcpod;
	}

	@Column(name = "VPCPND", precision = 10, scale = 0)
	public Long getVpcpnd() {
		return this.vpcpnd;
	}

	public void setVpcpnd(Long vpcpnd) {
		this.vpcpnd = vpcpnd;
	}

	@Column(name = "VPCNMD", precision = 10, scale = 0)
	public Long getVpcnmd() {
		return this.vpcnmd;
	}

	public void setVpcnmd(Long vpcnmd) {
		this.vpcnmd = vpcnmd;
	}

	@Column(name = "VPCUND", precision = 10, scale = 0)
	public Long getVpcund() {
		return this.vpcund;
	}

	public void setVpcund(Long vpcund) {
		this.vpcund = vpcund;
	}

	@Column(name = "VPCLLD", precision = 20)
	public Long getVpclld() {
		return this.vpclld;
	}

	public void setVpclld(Long vpclld) {
		this.vpclld = vpclld;
	}

	@Column(name = "VPCLLE", precision = 10, scale = 0)
	public Long getVpclle() {
		return this.vpclle;
	}

	public void setVpclle(Long vpclle) {
		this.vpclle = vpclle;
	}

	@Column(name = "VPCCM2", precision = 10, scale = 0)
	public Long getVpccm2() {
		return this.vpccm2;
	}

	public void setVpccm2(Long vpccm2) {
		this.vpccm2 = vpccm2;
	}

	@Column(name = "DEDUCTIBLESVPCPRM", precision = 10)
	public Long getDeductiblesvpcprm() {
		return this.deductiblesvpcprm;
	}

	public void setDeductiblesvpcprm(Long deductiblesvpcprm) {
		this.deductiblesvpcprm = deductiblesvpcprm;
	}

	@Column(name = "DEDUCTIBLESVPCEAS", precision = 10)
	public Long getDeductiblesvpceas() {
		return this.deductiblesvpceas;
	}

	public void setDeductiblesvpceas(Long deductiblesvpceas) {
		this.deductiblesvpceas = deductiblesvpceas;
	}

	@Column(name = "DEDUCTIBLESVPCCNG", precision = 10)
	public Long getDeductiblesvpccng() {
		return this.deductiblesvpccng;
	}

	public void setDeductiblesvpccng(Long deductiblesvpccng) {
		this.deductiblesvpccng = deductiblesvpccng;
	}

	@Column(name = "DEDUCTIBLESVPCTRL", precision = 10)
	public Long getDeductiblesvpctrl() {
		return this.deductiblesvpctrl;
	}

	public void setDeductiblesvpctrl(Long deductiblesvpctrl) {
		this.deductiblesvpctrl = deductiblesvpctrl;
	}

	@Column(name = "DEDUCTIBLESVPCEXG", precision = 10)
	public Long getDeductiblesvpcexg() {
		return this.deductiblesvpcexg;
	}

	public void setDeductiblesvpcexg(Long deductiblesvpcexg) {
		this.deductiblesvpcexg = deductiblesvpcexg;
	}

	@Column(name = "DEDUCTIBLESVPCFOR", precision = 10)
	public Long getDeductiblesvpcfor() {
		return this.deductiblesvpcfor;
	}

	public void setDeductiblesvpcfor(Long deductiblesvpcfor) {
		this.deductiblesvpcfor = deductiblesvpcfor;
	}

	@Column(name = "DEDUCTIBLESVPCDTE", precision = 10)
	public Long getDeductiblesvpcdte() {
		return this.deductiblesvpcdte;
	}

	public void setDeductiblesvpcdte(Long deductiblesvpcdte) {
		this.deductiblesvpcdte = deductiblesvpcdte;
	}

	@Column(name = "DEDUCTIBLESVPCTDD", precision = 10)
	public Long getDeductiblesvpctdd() {
		return this.deductiblesvpctdd;
	}

	public void setDeductiblesvpctdd(Long deductiblesvpctdd) {
		this.deductiblesvpctdd = deductiblesvpctdd;
	}

	@Column(name = "DEDUCTIBLESVPCPHD", precision = 10)
	public Long getDeductiblesvpcphd() {
		return this.deductiblesvpcphd;
	}

	public void setDeductiblesvpcphd(Long deductiblesvpcphd) {
		this.deductiblesvpcphd = deductiblesvpcphd;
	}

	@Column(name = "DEDUCTIBLESVPCVES", precision = 10)
	public Long getDeductiblesvpcves() {
		return this.deductiblesvpcves;
	}

	public void setDeductiblesvpcves(Long deductiblesvpcves) {
		this.deductiblesvpcves = deductiblesvpcves;
	}

	@Column(name = "DEDUCTIBLESVPCAAD", precision = 10)
	public Long getDeductiblesvpcaad() {
		return this.deductiblesvpcaad;
	}

	public void setDeductiblesvpcaad(Long deductiblesvpcaad) {
		this.deductiblesvpcaad = deductiblesvpcaad;
	}

	@Column(name = "DEDUCTIBLESVPCCVD", precision = 10)
	public Long getDeductiblesvpccvd() {
		return this.deductiblesvpccvd;
	}

	public void setDeductiblesvpccvd(Long deductiblesvpccvd) {
		this.deductiblesvpccvd = deductiblesvpccvd;
	}

	@Column(name = "DEDUCTIBLESVPCNCD", precision = 10)
	public Long getDeductiblesvpcncd() {
		return this.deductiblesvpcncd;
	}

	public void setDeductiblesvpcncd(Long deductiblesvpcncd) {
		this.deductiblesvpcncd = deductiblesvpcncd;
	}

	@Column(name = "DEDUCTIBLESROUND1", precision = 10)
	public Long getDeductiblesround1() {
		return this.deductiblesround1;
	}

	public void setDeductiblesround1(Long deductiblesround1) {
		this.deductiblesround1 = deductiblesround1;
	}

	@Column(name = "DEDUCTIBLESVPCATD", precision = 10)
	public Long getDeductiblesvpcatd() {
		return this.deductiblesvpcatd;
	}

	public void setDeductiblesvpcatd(Long deductiblesvpcatd) {
		this.deductiblesvpcatd = deductiblesvpcatd;
	}

	@Column(name = "DEDUCTIBLESVPCTPL", precision = 10)
	public Long getDeductiblesvpctpl() {
		return this.deductiblesvpctpl;
	}

	public void setDeductiblesvpctpl(Long deductiblesvpctpl) {
		this.deductiblesvpctpl = deductiblesvpctpl;
	}

	@Column(name = "DEDUCTIBLESVPCGAS", precision = 10)
	public Long getDeductiblesvpcgas() {
		return this.deductiblesvpcgas;
	}

	public void setDeductiblesvpcgas(Long deductiblesvpcgas) {
		this.deductiblesvpcgas = deductiblesvpcgas;
	}

	@Column(name = "DEDUCTIBLESVPCPOD", precision = 10)
	public Long getDeductiblesvpcpod() {
		return this.deductiblesvpcpod;
	}

	public void setDeductiblesvpcpod(Long deductiblesvpcpod) {
		this.deductiblesvpcpod = deductiblesvpcpod;
	}

	@Column(name = "DEDUCTIBLESVPCPND", precision = 10)
	public Long getDeductiblesvpcpnd() {
		return this.deductiblesvpcpnd;
	}

	public void setDeductiblesvpcpnd(Long deductiblesvpcpnd) {
		this.deductiblesvpcpnd = deductiblesvpcpnd;
	}

	@Column(name = "DEDUCTIBLESVPCNMD", precision = 10)
	public Long getDeductiblesvpcnmd() {
		return this.deductiblesvpcnmd;
	}

	public void setDeductiblesvpcnmd(Long deductiblesvpcnmd) {
		this.deductiblesvpcnmd = deductiblesvpcnmd;
	}

	@Column(name = "DEDUCTIBLESVPCUND", precision = 10)
	public Long getDeductiblesvpcund() {
		return this.deductiblesvpcund;
	}

	public void setDeductiblesvpcund(Long deductiblesvpcund) {
		this.deductiblesvpcund = deductiblesvpcund;
	}

	@Column(name = "DEDUCTIBLESVPCLLD", precision = 10)
	public Long getDeductiblesvpclld() {
		return this.deductiblesvpclld;
	}

	public void setDeductiblesvpclld(Long deductiblesvpclld) {
		this.deductiblesvpclld = deductiblesvpclld;
	}

	@Column(name = "DEDUCTIBLESVPCLLE", precision = 10)
	public Long getDeductiblesvpclle() {
		return this.deductiblesvpclle;
	}

	public void setDeductiblesvpclle(Long deductiblesvpclle) {
		this.deductiblesvpclle = deductiblesvpclle;
	}

	@Column(name = "DEDUCTIBLESROUND2", precision = 10)
	public Long getDeductiblesround2() {
		return this.deductiblesround2;
	}

	public void setDeductiblesround2(Long deductiblesround2) {
		this.deductiblesround2 = deductiblesround2;
	}

	@Column(name = "DEDUCTIBLESVPCCM2", precision = 10)
	public Long getDeductiblesvpccm2() {
		return this.deductiblesvpccm2;
	}

	public void setDeductiblesvpccm2(Long deductiblesvpccm2) {
		this.deductiblesvpccm2 = deductiblesvpccm2;
	}

	@Column(name = "SIVPCFBG", length = 50)
	public String getSivpcfbg() {
		return this.sivpcfbg;
	}

	public void setSivpcfbg(String sivpcfbg) {
		this.sivpcfbg = sivpcfbg;
	}

	@Column(name = "VPCFBG", precision = 10, scale = 0)
	public Long getVpcfbg() {
		return this.vpcfbg;
	}

	public void setVpcfbg(Long vpcfbg) {
		this.vpcfbg = vpcfbg;
	}

	@Column(name = "DEDUCTIBLESVPCFBG", precision = 10, scale = 0)
	public Long getDeductiblesvpcfbg() {
		return this.deductiblesvpcfbg;
	}

	public void setDeductiblesvpcfbg(Long deductiblesvpcfbg) {
		this.deductiblesvpcfbg = deductiblesvpcfbg;
	}

	

	@Column(name = "OLDINSURED", length = 100)
	public String getOldinsured() {
		return this.oldinsured;
	}

	public void setOldinsured(String oldinsured) {
		this.oldinsured = oldinsured;
	}

	@Column(name = "OLDPOLEXP", length = 100)
	public String getOldpolexp() {
		return this.oldpolexp;
	}

	public void setOldpolexp(String oldpolexp) {
		this.oldpolexp = oldpolexp;
	}

	

	@Column(name = "SIVPCWSG", length = 10)
	public String getSivpcwsg() {
		return this.sivpcwsg;
	}

	public void setSivpcwsg(String sivpcwsg) {
		this.sivpcwsg = sivpcwsg;
	}

	@Column(name = "VPCWSG", length = 10)
	public String getVpcwsg() {
		return this.vpcwsg;
	}

	public void setVpcwsg(String vpcwsg) {
		this.vpcwsg = vpcwsg;
	}

	@Column(name = "DEDUCTIBLESVPCWSG", length = 10)
	public String getDeductiblesvpcwsg() {
		return this.deductiblesvpcwsg;
	}

	public void setDeductiblesvpcwsg(String deductiblesvpcwsg) {
		this.deductiblesvpcwsg = deductiblesvpcwsg;
	}

	@Column(name = "SIVPCDEP", length = 10)
	public String getSivpcdep() {
		return this.sivpcdep;
	}

	public void setSivpcdep(String sivpcdep) {
		this.sivpcdep = sivpcdep;
	}

	@Column(name = "VPCDEP", length = 10)
	public String getVpcdep() {
		return this.vpcdep;
	}

	public void setVpcdep(String vpcdep) {
		this.vpcdep = vpcdep;
	}

	@Column(name = "DEDUCTIBLESVPCDEP", length = 10)
	public String getDeductiblesvpcdep() {
		return this.deductiblesvpcdep;
	}

	public void setDeductiblesvpcdep(String deductiblesvpcdep) {
		this.deductiblesvpcdep = deductiblesvpcdep;
	}

	@Column(name = "SIVPCLRT", length = 10)
	public String getSivpclrt() {
		return this.sivpclrt;
	}

	public void setSivpclrt(String sivpclrt) {
		this.sivpclrt = sivpclrt;
	}

	@Column(name = "VPCLRT", length = 10)
	public String getVpclrt() {
		return this.vpclrt;
	}

	public void setVpclrt(String vpclrt) {
		this.vpclrt = vpclrt;
	}

	@Column(name = "DEDUCTIBLESVPCLRT", length = 10)
	public String getDeductiblesvpclrt() {
		return this.deductiblesvpclrt;
	}

	public void setDeductiblesvpclrt(String deductiblesvpclrt) {
		this.deductiblesvpclrt = deductiblesvpclrt;
	}



	@Column(name = "SIVPCLSC", length = 10)
	public String getSivpclsc() {
		return this.sivpclsc;
	}

	public void setSivpclsc(String sivpclsc) {
		this.sivpclsc = sivpclsc;
	}

	@Column(name = "VPCLSC", length = 10)
	public String getVpclsc() {
		return this.vpclsc;
	}

	public void setVpclsc(String vpclsc) {
		this.vpclsc = vpclsc;
	}

	@Column(name = "DEDUCTIBLESVPCLSC", length = 10)
	public String getDeductiblesvpclsc() {
		return this.deductiblesvpclsc;
	}

	public void setDeductiblesvpclsc(String deductiblesvpclsc) {
		this.deductiblesvpclsc = deductiblesvpclsc;
	}

	@Column(name = "SIVPCINV", length = 10)
	public String getSivpcinv() {
		return this.sivpcinv;
	}

	public void setSivpcinv(String sivpcinv) {
		this.sivpcinv = sivpcinv;
	}

	@Column(name = "VPCINV", length = 10)
	public String getVpcinv() {
		return this.vpcinv;
	}

	public void setVpcinv(String vpcinv) {
		this.vpcinv = vpcinv;
	}

	@Column(name = "DEDUCTIBLESVPCINV", length = 10)
	public String getDeductiblesvpcinv() {
		return this.deductiblesvpcinv;
	}

	public void setDeductiblesvpcinv(String deductiblesvpcinv) {
		this.deductiblesvpcinv = deductiblesvpcinv;
	}

	@Column(name = "SIVPCBAG", length = 10)
	public String getSivpcbag() {
		return this.sivpcbag;
	}

	public void setSivpcbag(String sivpcbag) {
		this.sivpcbag = sivpcbag;
	}

	@Column(name = "VPCBAG", length = 10)
	public String getVpcbag() {
		return this.vpcbag;
	}

	public void setVpcbag(String vpcbag) {
		this.vpcbag = vpcbag;
	}

	@Column(name = "DEDUCTIBLESVPCBAG", length = 10)
	public String getDeductiblesvpcbag() {
		return this.deductiblesvpcbag;
	}

	public void setDeductiblesvpcbag(String deductiblesvpcbag) {
		this.deductiblesvpcbag = deductiblesvpcbag;
	}



	@Column(name = "SIVPCVDE", length = 100)
	public String getSivpcvde() {
		return this.sivpcvde;
	}

	public void setSivpcvde(String sivpcvde) {
		this.sivpcvde = sivpcvde;
	}

	@Column(name = "VPCVDE", length = 100)
	public String getVpcvde() {
		return this.vpcvde;
	}

	public void setVpcvde(String vpcvde) {
		this.vpcvde = vpcvde;
	}

	@Column(name = "DEDUCTIBLESVPCVDE", length = 100)
	public String getDeductiblesvpcvde() {
		return this.deductiblesvpcvde;
	}

	public void setDeductiblesvpcvde(String deductiblesvpcvde) {
		this.deductiblesvpcvde = deductiblesvpcvde;
	}

	@Column(name = "SIVPCVWS", length = 100)
	public String getSivpcvws() {
		return this.sivpcvws;
	}

	public void setSivpcvws(String sivpcvws) {
		this.sivpcvws = sivpcvws;
	}

	@Column(name = "VPCVWS", length = 100)
	public String getVpcvws() {
		return this.vpcvws;
	}

	public void setVpcvws(String vpcvws) {
		this.vpcvws = vpcvws;
	}

	@Column(name = "DEDUCTIBLESVPCVWS", length = 100)
	public String getDeductiblesvpcvws() {
		return this.deductiblesvpcvws;
	}

	public void setDeductiblesvpcvws(String deductiblesvpcvws) {
		this.deductiblesvpcvws = deductiblesvpcvws;
	}

	@Column(name = "SIVPCVFG", length = 100)
	public String getSivpcvfg() {
		return this.sivpcvfg;
	}

	public void setSivpcvfg(String sivpcvfg) {
		this.sivpcvfg = sivpcvfg;
	}

	@Column(name = "VPCVFG", length = 100)
	public String getVpcvfg() {
		return this.vpcvfg;
	}

	public void setVpcvfg(String vpcvfg) {
		this.vpcvfg = vpcvfg;
	}

	@Column(name = "DEDUCTIBLESVPCVFG", length = 100)
	public String getDeductiblesvpcvfg() {
		return this.deductiblesvpcvfg;
	}

	public void setDeductiblesvpcvfg(String deductiblesvpcvfg) {
		this.deductiblesvpcvfg = deductiblesvpcvfg;
	}



	@Column(name = "VPCCNG1", precision = 10, scale = 0)
	public Long getVpccng1() {
		return this.vpccng1;
	}

	public void setVpccng1(Long vpccng1) {
		this.vpccng1 = vpccng1;
	}

	@Column(name = "SIVPCENG", precision = 22, scale = 0)
	public Long getSivpceng() {
		return this.sivpceng;
	}

	public void setSivpceng(Long sivpceng) {
		this.sivpceng = sivpceng;
	}

	@Column(name = "VPCENG", precision = 22, scale = 0)
	public Long getVpceng() {
		return this.vpceng;
	}

	public void setVpceng(Long vpceng) {
		this.vpceng = vpceng;
	}

	@Column(name = "DEDUCTIBLESVPCENG", precision = 22, scale = 0)
	public Long getDeductiblesvpceng() {
		return this.deductiblesvpceng;
	}

	public void setDeductiblesvpceng(Long deductiblesvpceng) {
		this.deductiblesvpceng = deductiblesvpceng;
	}

	

	@Column(name = "SIVPCNCB", precision = 22, scale = 0)
	public Long getSivpcncb() {
		return this.sivpcncb;
	}

	public void setSivpcncb(Long sivpcncb) {
		this.sivpcncb = sivpcncb;
	}

	@Column(name = "VPCNCB", precision = 20)
	public Long getVpcncb() {
		return this.vpcncb;
	}

	public void setVpcncb(Long vpcncb) {
		this.vpcncb = vpcncb;
	}

	@Column(name = "DEDUCTIBLESVPCNCB", precision = 20)
	public Long getDeductiblesvpcncb() {
		return this.deductiblesvpcncb;
	}

	public void setDeductiblesvpcncb(Long deductiblesvpcncb) {
		this.deductiblesvpcncb = deductiblesvpcncb;
	}

	@Column(name = "SIVPCKE1", precision = 22, scale = 0)
	public Long getSivpcke1() {
		return this.sivpcke1;
	}

	public void setSivpcke1(Long sivpcke1) {
		this.sivpcke1 = sivpcke1;
	}

	@Column(name = "VPCKE1", precision = 20)
	public Long getVpcke1() {
		return this.vpcke1;
	}

	public void setVpcke1(Long vpcke1) {
		this.vpcke1 = vpcke1;
	}

	@Column(name = "DEDUCTIBLESVPCKE1", precision = 20)
	public Long getDeductiblesvpcke1() {
		return this.deductiblesvpcke1;
	}

	public void setDeductiblesvpcke1(Long deductiblesvpcke1) {
		this.deductiblesvpcke1 = deductiblesvpcke1;
	}

	@Column(name = "SIVPCNEA", precision = 22, scale = 0)
	public Long getSivpcnea() {
		return this.sivpcnea;
	}

	public void setSivpcnea(Long sivpcnea) {
		this.sivpcnea = sivpcnea;
	}

	@Column(name = "VPCNEA", precision = 22, scale = 0)
	public Long getVpcnea() {
		return this.vpcnea;
	}

	public void setVpcnea(Long vpcnea) {
		this.vpcnea = vpcnea;
	}

	@Column(name = "VPCEXL", precision = 22, scale = 0)
	public Long getVpcexl() {
		return this.vpcexl;
	}

	public void setVpcexl(Long vpcexl) {
		this.vpcexl = vpcexl;
	}

	@Column(name = "SIVPCKE2", precision = 22, scale = 0)
	public Long getSivpcke2() {
		return this.sivpcke2;
	}

	public void setSivpcke2(Long sivpcke2) {
		this.sivpcke2 = sivpcke2;
	}

	@Column(name = "VPCKE2", precision = 22, scale = 0)
	public Long getVpcke2() {
		return this.vpcke2;
	}

	public void setVpcke2(Long vpcke2) {
		this.vpcke2 = vpcke2;
	}

	@Column(name = "DEDUCTIBLESVPCKE2", precision = 22, scale = 0)
	public Long getDeductiblesvpcke2() {
		return this.deductiblesvpcke2;
	}

	public void setDeductiblesvpcke2(Long deductiblesvpcke2) {
		this.deductiblesvpcke2 = deductiblesvpcke2;
	}

	@Column(name = "DEDUCTIBLEVPCNEA", precision = 22, scale = 0)
	public Long getDeductiblevpcnea() {
		return this.deductiblevpcnea;
	}

	public void setDeductiblevpcnea(Long deductiblevpcnea) {
		this.deductiblevpcnea = deductiblevpcnea;
	}



	@Column(name = "VPCVXL", length = 200)
	public String getVpcvxl() {
		return this.vpcvxl;
	}

	public void setVpcvxl(String vpcvxl) {
		this.vpcvxl = vpcvxl;
	}

	@Column(name = "VPCVNE", precision = 10)
	public Long getVpcvne() {
		return this.vpcvne;
	}

	public void setVpcvne(Long vpcvne) {
		this.vpcvne = vpcvne;
	}

	@Column(name = "SIVPCVNE", precision = 10)
	public Long getSivpcvne() {
		return this.sivpcvne;
	}

	public void setSivpcvne(Long sivpcvne) {
		this.sivpcvne = sivpcvne;
	}

	
	public String getOtherparty() {
		return otherparty;
	}

	public void setOtherparty(String otherparty) {
		this.otherparty = otherparty;
	}
	
	
	@Column(name="VPCTOW")
	public String getVpctow() {
		return vpctow;
	}

	public void setVpctow(String vpctow) {
		this.vpctow = vpctow;
	}
    
    @Column(name="VPVTOW")
	public String getVpvtow() {
		return vpvtow;
	}

	public void setVpvtow(String vpvtow) {
		this.vpvtow = vpvtow;
	}
    
	 @Column(name="VPCCM1RATE")
	public String getVPCCM1rate() {
		return VPCCM1;
	}

	public void setVPCCM1rate(String vPCCM1) {
		VPCCM1 = vPCCM1;
	}

	@Column(name="VPCVM1RATE")
	public String getVPCVM1rate() {
		return VPCVM1;
	}

	public void setVPCVM1rate(String vPCVM1) {
		VPCVM1 = vPCVM1;
	}
	
	public String getGstnumber() {
		return Gstnumber;
	}

	public void setGstnumber(String gstnumber) {
		Gstnumber = gstnumber;
	}
	@Column(name = "VPCVDT")
	public String getVPCVDT() {
		return VPCVDT;
	}

	public void setVPCVDT(String vPCVDT){
		VPCVDT = vPCVDT;
	}		

}

//private Long recordtype;
//private Long recordno;
//private String itemno;
//private String sectionno;
//private String riskblock;
//	
//private String wartext;
//private String riskcategory;
//private String eml;
//private Long gvweight;
//private String noofdrivers;
//	
//private String fueltype;
//private String roadtype;
//private String safetyfea;
//private String parkingfac;
//
//private Long batchid;
//private Character active;
//private String blank1;
//private String blank2;
//private String blank3;
//private String xgenEndorsementno;
//
//private String mileageused;
//private String maprefno;
//private String monthlymileage;
//private String monthlymileagerun;
//private Long xgenProductid;
//	
//private String vphrsa;
//private String sivphrsa;
//private String deductiblesvphrsa;
//private String papaiddriver;
//
//private String vpmrsa;
//private String sivpmrsa;
//private String deductiblesvpmrsa;
//
//	private String roadtypedesc;
//private String blank4;
//private String blank5;
//private String otherRliabilityPremium;
//
//
//	private String inspectionagencyname;
//private String inspectiondate;
//private String inspectionreceiptno;
//private Long nildepreciationcover;
//
//	private String typeofpassengerscarried;
//	
//		private Long blank6;
//private Long blank7;
//private String cessAmt4;
//
//
//@Column(name = "RECORDTYPE", precision = 10, scale = 0)
//public Long getRecordtype() {
//	return this.recordtype;
//}
//
//public void setRecordtype(Long recordtype) {
//	this.recordtype = recordtype;
//}
//
//@Column(name = "RECORDNO", precision = 10, scale = 0)
//public Long getRecordno() {
//	return this.recordno;
//}
//
//public void setRecordno(Long recordno) {
//	this.recordno = recordno;
//}
//
//@Column(name = "ITEMNO", length = 5)
//public String getItemno() {
//	return this.itemno;
//}
//
//public void setItemno(String itemno) {
//	this.itemno = itemno;
//}
//
//@Column(name = "SECTIONNO", length = 5)
//public String getSectionno() {
//	return this.sectionno;
//}
//
//public void setSectionno(String sectionno) {
//	this.sectionno = sectionno;
//}
//
//
//@Column(name = "RISKBLOCK", length = 30)
//public String getRiskblock() {
//	return this.riskblock;
//}
//
//public void setRiskblock(String riskblock) {
//	this.riskblock = riskblock;
//}
//
//@Column(name = "WARTEXT", length = 30)
//public String getWartext() {
//	return this.wartext;
//}
//
//public void setWartext(String wartext) {
//	this.wartext = wartext;
//}
//
//@Column(name = "RISKCATEGORY", length = 30)
//public String getRiskcategory() {
//	return this.riskcategory;
//}
//
//public void setRiskcategory(String riskcategory) {
//	this.riskcategory = riskcategory;
//}
//
//@Column(name = "EML", length = 3)
//public String getEml() {
//	return this.eml;
//}
//
//public void setEml(String eml) {
//	this.eml = eml;
//}
//
//@Column(name = "GVWEIGHT", precision = 10, scale = 0)
//public Long getGvweight() {
//	return this.gvweight;
//}
//
//public void setGvweight(Long gvweight) {
//	this.gvweight = gvweight;
//}
//
//@Column(name = "NOOFDRIVERS", length = 10)
//public String getNoofdrivers() {
//	return this.noofdrivers;
//}
//
//public void setNoofdrivers(String noofdrivers) {
//	this.noofdrivers = noofdrivers;
//}
//
//
//@Column(name = "FUELTYPE", length = 30)
//public String getFueltype() {
//	return this.fueltype;
//}
//
//public void setFueltype(String fueltype) {
//	this.fueltype = fueltype;
//}
//
//@Column(name = "ROADTYPE", length = 30)
//public String getRoadtype() {
//	return this.roadtype;
//}
//
//public void setRoadtype(String roadtype) {
//	this.roadtype = roadtype;
//}
//
//@Column(name = "SAFETYFEA", length = 30)
//public String getSafetyfea() {
//	return this.safetyfea;
//}
//
//public void setSafetyfea(String safetyfea) {
//	this.safetyfea = safetyfea;
//}
//
//@Column(name = "PARKINGFAC", length = 30)
//public String getParkingfac() {
//	return this.parkingfac;
//}
//
//public void setParkingfac(String parkingfac) {
//	this.parkingfac = parkingfac;
//}
//
//
//@Column(name = "BATCHID", precision = 10, scale = 0)
//public Long getBatchid() {
//	return this.batchid;
//}
//
//public void setBatchid(Long batchid) {
//	this.batchid = batchid;
//}
//
//@Column(name = "ACTIVE", length = 1)
//public Character getActive() {
//	return this.active;
//}
//
//public void setActive(Character active) {
//	this.active = active;
//}
//
//@Column(name = "BLANK1", length = 50)
//public String getBlank1() {
//	return this.blank1;
//}
//
//public void setBlank1(String blank1) {
//	this.blank1 = blank1;
//}
//
//@Column(name = "BLANK2", length = 50)
//public String getBlank2() {
//	return this.blank2;
//}
//
//public void setBlank2(String blank2) {
//	this.blank2 = blank2;
//}
//
//@Column(name = "BLANK3", length = 50)
//public String getBlank3() {
//	return this.blank3;
//}
//
//public void setBlank3(String blank3) {
//	this.blank3 = blank3;
//}
//
//@Column(name = "XGEN_ENDORSEMENTNO", length = 10)
//public String getXgenEndorsementno() {
//	return this.xgenEndorsementno;
//}
//
//public void setXgenEndorsementno(String xgenEndorsementno) {
//	this.xgenEndorsementno = xgenEndorsementno;
//}
//
//
//	@Column(name = "XGEN_PRODUCTID", precision = 10, scale = 0)
//public Long getXgenProductid() {
//	return this.xgenProductid;
//}
//
//public void setXgenProductid(Long xgenProductid) {
//	this.xgenProductid = xgenProductid;
//}
//
//
//	@Column(name = "VPHRSA", length = 10)
//public String getVphrsa() {
//	return this.vphrsa;
//}
//
//public void setVphrsa(String vphrsa) {
//	this.vphrsa = vphrsa;
//}
//
//@Column(name = "SIVPHRSA", length = 10)
//public String getSivphrsa() {
//	return this.sivphrsa;
//}
//
//public void setSivphrsa(String sivphrsa) {
//	this.sivphrsa = sivphrsa;
//}
//
//@Column(name = "DEDUCTIBLESVPHRSA", length = 10)
//public String getDeductiblesvphrsa() {
//	return this.deductiblesvphrsa;
//}
//
//public void setDeductiblesvphrsa(String deductiblesvphrsa) {
//	this.deductiblesvphrsa = deductiblesvphrsa;
//}
//
//@Column(name = "PAPAIDDRIVER", length = 50)
//public String getPapaiddriver() {
//	return this.papaiddriver;
//}
//
//public void setPapaiddriver(String papaiddriver) {
//	this.papaiddriver = papaiddriver;
//}
//
//@Column(name = "MILEAGEUSED", length = 10)
//public String getMileageused() {
//	return this.mileageused;
//}
//
//public void setMileageused(String mileageused) {
//	this.mileageused = mileageused;
//}
//
//@Column(name = "MAPREFNO", length = 10)
//public String getMaprefno() {
//	return this.maprefno;
//}
//
//public void setMaprefno(String maprefno) {
//	this.maprefno = maprefno;
//}
//
//@Column(name = "MONTHLYMILEAGE", length = 20)
//public String getMonthlymileage() {
//	return this.monthlymileage;
//}
//
//public void setMonthlymileage(String monthlymileage) {
//	this.monthlymileage = monthlymileage;
//}
//
//@Column(name = "MONTHLYMILEAGERUN", length = 100)
//public String getMonthlymileagerun() {
//	return this.monthlymileagerun;
//}
//
//public void setMonthlymileagerun(String monthlymileagerun) {
//	this.monthlymileagerun = monthlymileagerun;
//}
//
//@Column(name = "VPMRSA", length = 100)
//public String getVpmrsa() {
//	return this.vpmrsa;
//}
//
//public void setVpmrsa(String vpmrsa) {
//	this.vpmrsa = vpmrsa;
//}
//
//@Column(name = "SIVPMRSA", length = 100)
//public String getSivpmrsa() {
//	return this.sivpmrsa;
//}
//
//public void setSivpmrsa(String sivpmrsa) {
//	this.sivpmrsa = sivpmrsa;
//}
//
//@Column(name = "DEDUCTIBLESVPMRSA", length = 100)
//public String getDeductiblesvpmrsa() {
//	return this.deductiblesvpmrsa;
//}
//
//public void setDeductiblesvpmrsa(String deductiblesvpmrsa) {
//	this.deductiblesvpmrsa = deductiblesvpmrsa;
//}
//
//	@Column(name = "ROADTYPEDESC", length = 200)
//public String getRoadtypedesc() {
//	return this.roadtypedesc;
//}
//
//public void setRoadtypedesc(String roadtypedesc) {
//	this.roadtypedesc = roadtypedesc;
//}
//
//@Column(name = "BLANK4", length = 50)
//public String getBlank4() {
//	return this.blank4;
//}
//
//public void setBlank4(String blank4) {
//	this.blank4 = blank4;
//}
//
//@Column(name = "BLANK5", length = 50)
//public String getBlank5() {
//	return this.blank5;
//}
//
//public void setBlank5(String blank5) {
//	this.blank5 = blank5;
//}
//
//@Column(name = "OTHER_RLIABILITY_PREMIUM", length = 10)
//public String getOtherRliabilityPremium() {
//	return this.otherRliabilityPremium;
//}
//
//public void setOtherRliabilityPremium(String otherRliabilityPremium) {
//	this.otherRliabilityPremium = otherRliabilityPremium;
//}
//
//@Column(name = "INSPECTIONAGENCYNAME", length = 500)
//public String getInspectionagencyname() {
//	return this.inspectionagencyname;
//}
//
//public void setInspectionagencyname(String inspectionagencyname) {
//	this.inspectionagencyname = inspectionagencyname;
//}
//
//
//@Column(name = "INSPECTIONDATE", length = 7)
//public String getInspectiondate() {
//	return this.inspectiondate;
//}
//
//public void setInspectiondate(String inspectiondate) {
//	this.inspectiondate = inspectiondate;
//}
//
//@Column(name = "INSPECTIONRECEIPTNO", length = 200)
//public String getInspectionreceiptno() {
//	return this.inspectionreceiptno;
//}
//
//public void setInspectionreceiptno(String inspectionreceiptno) {
//	this.inspectionreceiptno = inspectionreceiptno;
//}
//
//@Column(name = "NILDEPRECIATIONCOVER", precision = 10, scale = 0)
//public Long getNildepreciationcover() {
//	return this.nildepreciationcover;
//}
//
//public void setNildepreciationcover(Long nildepreciationcover) {
//	this.nildepreciationcover = nildepreciationcover;
//}
//
//	@Column(name = "TYPEOFPASSENGERSCARRIED", length = 200)
//public String getTypeofpassengerscarried() {
//	return this.typeofpassengerscarried;
//}
//
//public void setTypeofpassengerscarried(String typeofpassengerscarried) {
//	this.typeofpassengerscarried = typeofpassengerscarried;
//}
//
//@Column(name = "BLANK6", precision = 10)
//public Long getBlank6() {
//	return this.blank6;
//}
//
//public void setBlank6(Long blank6) {
//	this.blank6 = blank6;
//}
//
//@Column(name = "BLANK7", precision = 10)
//public Long getBlank7() {
//	return this.blank7;
//}
//
//public void setBlank7(Long blank7) {
//	this.blank7 = blank7;
//}
//
//@Column(name = "CESS_AMT_4", length = 200)
//public String getCessAmt4() {
//	return this.cessAmt4;
//}
//
//public void setCessAmt4(String cessAmt4) {
//	this.cessAmt4 = cessAmt4;
//}