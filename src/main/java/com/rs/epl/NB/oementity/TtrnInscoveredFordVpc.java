package com.rs.epl.NB.oementity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * The persistent class for the TTRN_INSCOVERED_FORD_VPC database table.
 * 
 */
@Entity
@Table(name="TTRN_INSCOVERED_FORD_VPC")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class TtrnInscoveredFordVpc implements Serializable {
	private static final long serialVersionUID = 1L;
    
	@Id
	@Column(name="XGEN_POLICYNO", unique=true, nullable=false, length=16)
	private String xgenPolicyno;

	@Column(precision=10)
	private Long capacity;//changed from Long to Long

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
	private Long deductiblesround1;

	@Column(precision=10)
	private Long deductiblesround2;

	@Column(precision=10)
	private Long deductiblesvpcaad;

	@Column(precision=10)
	private Long deductiblesvpcatd;

	@Column(length=10)
	private String deductiblesvpcbag;

	@Column(precision=10)
	private Long deductiblesvpccm2;

	@Column(precision=10)
	private Long deductiblesvpccng;

	@Column(precision=10)
	private Long deductiblesvpccvd;

	@Column(length=10)
	private String deductiblesvpcdep;

	@Column(precision=10)
	private Long deductiblesvpcdte;

	@Column(precision=10)
	private Long deductiblesvpceas;

	@Column(length=100)
	private String deductiblesvpceng;

	@Column(precision=10)
	private Long deductiblesvpcexg;

	@Column(precision=10)
	private Long deductiblesvpcfbg;

	@Column(precision=10)
	private Long deductiblesvpcfor;

	@Column(precision=10)
	private Long deductiblesvpcgas;

	@Column(length=10)
	private String deductiblesvpcinv;

	@Column(precision=10)
	private Long deductiblesvpclld;

	@Column(precision=10)
	private Long deductiblesvpclle;

	@Column(length=10)
	private String deductiblesvpclrt;

	@Column(length=10)
	private String deductiblesvpclsc;

	@Column(precision=22)
	private Long deductiblesvpcncb;

	@Column(precision=10)
	private Long deductiblesvpcncd;

	@Column(precision=10)
	private Long deductiblesvpcnmd;

	@Column(precision=10)
	private Long deductiblesvpcphd;

	@Column(precision=10)
	private Long deductiblesvpcpnd;

	@Column(precision=10)
	private Long deductiblesvpcpod;

	@Column(precision=10)
	private Long deductiblesvpcprm;

	@Column(precision=10)
	private Long deductiblesvpctdd;

	@Column(precision=10)
	private Long deductiblesvpctpl;

	@Column(precision=10)
	private Long deductiblesvpctrl;

	@Column(precision=10)
	private Long deductiblesvpcund;

	@Column(precision=10)
	private Long deductiblesvpcves;

	@Column(length=10)
	private String deductiblesvpcwsg;



	@Column(precision=22)
	private Long deductiblevpcke1;

	@Column(precision=22)
	private Long deductiblevpcke2;



	@Column(length=30)
	private String engineno;



	@Column(length=200)
	private String hypothecatedto;


	@Column(precision=10)
	private Double itemsi;//chnaged from Long To Double

	@Column(length=30)
	private String logbooknumber;

	@Column(length=50)
	private String make;



	@Column(precision=10)
	private String mfgyr;//changed from String To String



	@Column(length=50)
	private String model;



	@Column(precision=10)
	private Long ncdgrade;//changed from Long To Long


	@Column(length=100)
	private String oldinsured;

	@Column(length=100)
	private String oldpolexp;

	@Column(length=30)
	private String otherparty;



	@Column(length=200)
	private String registringauthority;

	@Column(length=30)
	private String regno;



	@Column(precision=10)
	private Long round1;

	@Column(precision=10)
	private Long round2;



	@Column(precision=10)
	private Long seatingcapacity;//changed from Long to Long



	@Column(precision=10)
	private Long siround1;

	@Column(length=30)
	private String siround2;

	@Column(precision=10)
	private Long sivpcaad;

	@Column(precision=10)
	private Long sivpcatd;

	@Column(length=10)
	private String sivpcbag;

	@Column(length=30)
	private String sivpccm2;

	@Column(precision=10)
	private Long sivpccng;

	@Column(precision=10)
	private Long sivpccvd;

	@Column(length=10)
	private String sivpcdep;

	@Column(precision=10)
	private Long sivpcdte;

	@Column(precision=10)
	private Long sivpceas;

	@Column(length=100)
	private String sivpceng;

	@Column(precision=10)
	private Long sivpcexg;

	@Column(length=50)
	private String sivpcfbg;

	@Column(precision=10)
	private Long sivpcfor;

	@Column(precision=10)
	private Long sivpcgas;

	@Column(length=10)
	private String sivpcinv;

	@Column(precision=22)
	private Long sivpcke1;

	@Column(precision=22)
	private Long sivpcke2;

	@Column(precision=10)
	private Long sivpclld;

	@Column(length=30)
	private String sivpclle;

	@Column(length=10)
	private String sivpclrt;

	@Column(length=10)
	private String sivpclsc;

	@Column(precision=22)
	private Long sivpcncb;

	@Column(precision=10)
	private Long sivpcncd;

	@Column(precision=10)
	private Long sivpcnmd;

	@Column(precision=10)
	private Long sivpcphd;

	@Column(precision=10)
	private Long sivpcpnd;

	@Column(precision=10)
	private Long sivpcpod;

	@Column(precision=10)
	private Long sivpcprm;

	@Column(precision=10)
	private Long sivpctdd;

	@Column(precision=10)
	private Long sivpctpl;

	@Column(precision=10)
	private Long sivpctrl;

	@Column(precision=10)
	private Long sivpcund;

	@Column(precision=10)
	private Long sivpcves;

	@Column(length=10)
	private String sivpcwsg;


	@Column(length=10)
	private String territory2;

	@Column(length=100)
	private String territorystate;

	@Column(length=4)
	private String usagecode;

	@Column(length=30)
	private String vehicleregistrationdate;

	@Column(precision=10)
	private Long vpcaad;

	@Column(precision=10)
	private Long vpcatd;

	@Column(length=10)
	private String vpcbag;

	@Column(precision=10)
	private Long vpccm2;

	@Column(precision=10)
	private Long vpccng;

	@Column(length=30)
	private String vpccvd;

	@Column(length=10)
	private String vpcdep;

	@Column(precision=10)
	private Long vpcdte;

	@Column(precision=10)
	private Long vpceas;

	@Column(length=100)
	private String vpceng;

	@Column(precision=10)
	private Long vpcexg;

	@Column(precision=22)
	private Long vpcexl;

	@Column(precision=10)
	private Long vpcfbg;

	@Column(precision=10)
	private Long vpcfor;

	@Column(precision=10)
	private Long vpcgas;

	@Column(length=10)
	private String vpcinv;

	@Column(precision=22)
	private Long vpcke1;

	@Column(precision=22)
	private Long vpcke2;

	@Column(precision=10)
	private Long vpclld;

	@Column(precision=10)
	private Long vpclle;

	@Column(length=10)
	private String vpclrt;

	@Column(length=10)
	private String vpclsc;

	@Column(precision=22)
	private Long vpcncb;

	@Column(precision=10)
	private Long vpcncd;

	@Column(precision=10)
	private Long vpcnmd;

	@Column(precision=10)
	private Long vpcphd;

	@Column(precision=10)
	private Long vpcpnd;

	@Column(precision=10)
	private Long vpcpod;

	@Column(precision=10)
	private Long vpcprm;

	@Column(precision=10)
	private Long vpctdd;

	@Column(precision=10)
	private Long vpctpl;

	@Column(length=30)
	private String vpctrl;

	@Column(precision=10)
	private Long vpcund;

	@Column(precision=10)
	private Long vpcves;

	@Column(length=10)
	private String vpcwsg;





	@Column(precision=10)
	private Long zip;//changed from Long To Long
		
	private String VPCCM1rate;
	
	@Column(name="GSTNUMBER")
	private String Gstnumber;

	public String getGstnumber() {
		return Gstnumber;
	}

	public void setGstnumber(String gstnumber) {
		Gstnumber = gstnumber;
	}

	public TtrnInscoveredFordVpc() {
	}
   
	public String getXgenPolicyno() {
		return this.xgenPolicyno;
	}
	public void setXgenPolicyno(String xgenPolicyno) {
		this.xgenPolicyno = xgenPolicyno;
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

	public Long getDeductiblesround1() {
		return this.deductiblesround1;
	}

	public void setDeductiblesround1(Long deductiblesround1) {
		this.deductiblesround1 = deductiblesround1;
	}

	public Long getDeductiblesround2() {
		return this.deductiblesround2;
	}

	public void setDeductiblesround2(Long deductiblesround2) {
		this.deductiblesround2 = deductiblesround2;
	}

	public Long getDeductiblesvpcaad() {
		return this.deductiblesvpcaad;
	}

	public void setDeductiblesvpcaad(Long deductiblesvpcaad) {
		this.deductiblesvpcaad = deductiblesvpcaad;
	}

	public Long getDeductiblesvpcatd() {
		return this.deductiblesvpcatd;
	}

	public void setDeductiblesvpcatd(Long deductiblesvpcatd) {
		this.deductiblesvpcatd = deductiblesvpcatd;
	}

	public String getDeductiblesvpcbag() {
		return this.deductiblesvpcbag;
	}

	public void setDeductiblesvpcbag(String deductiblesvpcbag) {
		this.deductiblesvpcbag = deductiblesvpcbag;
	}

	public Long getDeductiblesvpccm2() {
		return this.deductiblesvpccm2;
	}

	public void setDeductiblesvpccm2(Long deductiblesvpccm2) {
		this.deductiblesvpccm2 = deductiblesvpccm2;
	}

	public Long getDeductiblesvpccng() {
		return this.deductiblesvpccng;
	}

	public void setDeductiblesvpccng(Long deductiblesvpccng) {
		this.deductiblesvpccng = deductiblesvpccng;
	}

	public Long getDeductiblesvpccvd() {
		return this.deductiblesvpccvd;
	}

	public void setDeductiblesvpccvd(Long deductiblesvpccvd) {
		this.deductiblesvpccvd = deductiblesvpccvd;
	}

	public String getDeductiblesvpcdep() {
		return this.deductiblesvpcdep;
	}

	public void setDeductiblesvpcdep(String deductiblesvpcdep) {
		this.deductiblesvpcdep = deductiblesvpcdep;
	}

	public Long getDeductiblesvpcdte() {
		return this.deductiblesvpcdte;
	}

	public void setDeductiblesvpcdte(Long deductiblesvpcdte) {
		this.deductiblesvpcdte = deductiblesvpcdte;
	}

	public Long getDeductiblesvpceas() {
		return this.deductiblesvpceas;
	}

	public void setDeductiblesvpceas(Long deductiblesvpceas) {
		this.deductiblesvpceas = deductiblesvpceas;
	}

	public String getDeductiblesvpceng() {
		return this.deductiblesvpceng;
	}

	public void setDeductiblesvpceng(String deductiblesvpceng) {
		this.deductiblesvpceng = deductiblesvpceng;
	}

	public Long getDeductiblesvpcexg() {
		return this.deductiblesvpcexg;
	}

	public void setDeductiblesvpcexg(Long deductiblesvpcexg) {
		this.deductiblesvpcexg = deductiblesvpcexg;
	}

	public Long getDeductiblesvpcfbg() {
		return this.deductiblesvpcfbg;
	}

	public void setDeductiblesvpcfbg(Long deductiblesvpcfbg) {
		this.deductiblesvpcfbg = deductiblesvpcfbg;
	}

	public Long getDeductiblesvpcfor() {
		return this.deductiblesvpcfor;
	}

	public void setDeductiblesvpcfor(Long deductiblesvpcfor) {
		this.deductiblesvpcfor = deductiblesvpcfor;
	}

	public Long getDeductiblesvpcgas() {
		return this.deductiblesvpcgas;
	}

	public void setDeductiblesvpcgas(Long deductiblesvpcgas) {
		this.deductiblesvpcgas = deductiblesvpcgas;
	}

	public String getDeductiblesvpcinv() {
		return this.deductiblesvpcinv;
	}

	public void setDeductiblesvpcinv(String deductiblesvpcinv) {
		this.deductiblesvpcinv = deductiblesvpcinv;
	}

	public Long getDeductiblesvpclld() {
		return this.deductiblesvpclld;
	}

	public void setDeductiblesvpclld(Long deductiblesvpclld) {
		this.deductiblesvpclld = deductiblesvpclld;
	}

	public Long getDeductiblesvpclle() {
		return this.deductiblesvpclle;
	}

	public void setDeductiblesvpclle(Long deductiblesvpclle) {
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

	public Long getDeductiblesvpcncb() {
		return this.deductiblesvpcncb;
	}

	public void setDeductiblesvpcncb(Long deductiblesvpcncb) {
		this.deductiblesvpcncb = deductiblesvpcncb;
	}

	public Long getDeductiblesvpcncd() {
		return this.deductiblesvpcncd;
	}

	public void setDeductiblesvpcncd(Long deductiblesvpcncd) {
		this.deductiblesvpcncd = deductiblesvpcncd;
	}

	public Long getDeductiblesvpcnmd() {
		return this.deductiblesvpcnmd;
	}

	public void setDeductiblesvpcnmd(Long deductiblesvpcnmd) {
		this.deductiblesvpcnmd = deductiblesvpcnmd;
	}

	public Long getDeductiblesvpcphd() {
		return this.deductiblesvpcphd;
	}

	public void setDeductiblesvpcphd(Long deductiblesvpcphd) {
		this.deductiblesvpcphd = deductiblesvpcphd;
	}

	public Long getDeductiblesvpcpnd() {
		return this.deductiblesvpcpnd;
	}

	public void setDeductiblesvpcpnd(Long deductiblesvpcpnd) {
		this.deductiblesvpcpnd = deductiblesvpcpnd;
	}

	public Long getDeductiblesvpcpod() {
		return this.deductiblesvpcpod;
	}

	public void setDeductiblesvpcpod(Long deductiblesvpcpod) {
		this.deductiblesvpcpod = deductiblesvpcpod;
	}

	public Long getDeductiblesvpcprm() {
		return this.deductiblesvpcprm;
	}

	public void setDeductiblesvpcprm(Long deductiblesvpcprm) {
		this.deductiblesvpcprm = deductiblesvpcprm;
	}

	public Long getDeductiblesvpctdd() {
		return this.deductiblesvpctdd;
	}

	public void setDeductiblesvpctdd(Long deductiblesvpctdd) {
		this.deductiblesvpctdd = deductiblesvpctdd;
	}

	public Long getDeductiblesvpctpl() {
		return this.deductiblesvpctpl;
	}

	public void setDeductiblesvpctpl(Long deductiblesvpctpl) {
		this.deductiblesvpctpl = deductiblesvpctpl;
	}

	public Long getDeductiblesvpctrl() {
		return this.deductiblesvpctrl;
	}

	public void setDeductiblesvpctrl(Long deductiblesvpctrl) {
		this.deductiblesvpctrl = deductiblesvpctrl;
	}

	public Long getDeductiblesvpcund() {
		return this.deductiblesvpcund;
	}

	public void setDeductiblesvpcund(Long deductiblesvpcund) {
		this.deductiblesvpcund = deductiblesvpcund;
	}

	public Long getDeductiblesvpcves() {
		return this.deductiblesvpcves;
	}

	public void setDeductiblesvpcves(Long deductiblesvpcves) {
		this.deductiblesvpcves = deductiblesvpcves;
	}

	public String getDeductiblesvpcwsg() {
		return this.deductiblesvpcwsg;
	}

	public void setDeductiblesvpcwsg(String deductiblesvpcwsg) {
		this.deductiblesvpcwsg = deductiblesvpcwsg;
	}


	public Long getDeductiblevpcke1() {
		return this.deductiblevpcke1;
	}

	public void setDeductiblevpcke1(Long deductiblevpcke1) {
		this.deductiblevpcke1 = deductiblevpcke1;
	}

	public Long getDeductiblevpcke2() {
		return this.deductiblevpcke2;
	}

	public void setDeductiblevpcke2(Long deductiblevpcke2) {
		this.deductiblevpcke2 = deductiblevpcke2;
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

	

	public Long getRound1() {
		return this.round1;
	}

	public void setRound1(Long round1) {
		this.round1 = round1;
	}

	public Long getRound2() {
		return this.round2;
	}

	public void setRound2(Long round2) {
		this.round2 = round2;
	}

	

	public Long getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(Long seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	

	public Long getSiround1() {
		return this.siround1;
	}

	public void setSiround1(Long siround1) {
		this.siround1 = siround1;
	}

	public String getSiround2() {
		return this.siround2;
	}

	public void setSiround2(String siround2) {
		this.siround2 = siround2;
	}

	public Long getSivpcaad() {
		return this.sivpcaad;
	}

	public void setSivpcaad(Long sivpcaad) {
		this.sivpcaad = sivpcaad;
	}

	public Long getSivpcatd() {
		return this.sivpcatd;
	}

	public void setSivpcatd(Long sivpcatd) {
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

	public Long getSivpccng() {
		return this.sivpccng;
	}

	public void setSivpccng(Long sivpccng) {
		this.sivpccng = sivpccng;
	}

	public Long getSivpccvd() {
		return this.sivpccvd;
	}

	public void setSivpccvd(Long sivpccvd) {
		this.sivpccvd = sivpccvd;
	}

	public String getSivpcdep() {
		return this.sivpcdep;
	}

	public void setSivpcdep(String sivpcdep) {
		this.sivpcdep = sivpcdep;
	}

	public Long getSivpcdte() {
		return this.sivpcdte;
	}

	public void setSivpcdte(Long sivpcdte) {
		this.sivpcdte = sivpcdte;
	}

	public Long getSivpceas() {
		return this.sivpceas;
	}

	public void setSivpceas(Long sivpceas) {
		this.sivpceas = sivpceas;
	}

	public String getSivpceng() {
		return this.sivpceng;
	}

	public void setSivpceng(String sivpceng) {
		this.sivpceng = sivpceng;
	}

	public Long getSivpcexg() {
		return this.sivpcexg;
	}

	public void setSivpcexg(Long sivpcexg) {
		this.sivpcexg = sivpcexg;
	}

	public String getSivpcfbg() {
		return this.sivpcfbg;
	}

	public void setSivpcfbg(String sivpcfbg) {
		this.sivpcfbg = sivpcfbg;
	}

	public Long getSivpcfor() {
		return this.sivpcfor;
	}

	public void setSivpcfor(Long sivpcfor) {
		this.sivpcfor = sivpcfor;
	}

	public Long getSivpcgas() {
		return this.sivpcgas;
	}

	public void setSivpcgas(Long sivpcgas) {
		this.sivpcgas = sivpcgas;
	}

	public String getSivpcinv() {
		return this.sivpcinv;
	}

	public void setSivpcinv(String sivpcinv) {
		this.sivpcinv = sivpcinv;
	}

	public Long getSivpcke1() {
		return this.sivpcke1;
	}

	public void setSivpcke1(Long sivpcke1) {
		this.sivpcke1 = sivpcke1;
	}

	public Long getSivpcke2() {
		return this.sivpcke2;
	}

	public void setSivpcke2(Long sivpcke2) {
		this.sivpcke2 = sivpcke2;
	}

	public Long getSivpclld() {
		return this.sivpclld;
	}

	public void setSivpclld(Long sivpclld) {
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

	public Long getSivpcncb() {
		return this.sivpcncb;
	}

	public void setSivpcncb(Long sivpcncb) {
		this.sivpcncb = sivpcncb;
	}

	public Long getSivpcncd() {
		return this.sivpcncd;
	}

	public void setSivpcncd(Long sivpcncd) {
		this.sivpcncd = sivpcncd;
	}

	public Long getSivpcnmd() {
		return this.sivpcnmd;
	}

	public void setSivpcnmd(Long sivpcnmd) {
		this.sivpcnmd = sivpcnmd;
	}

	public Long getSivpcphd() {
		return this.sivpcphd;
	}

	public void setSivpcphd(Long sivpcphd) {
		this.sivpcphd = sivpcphd;
	}

	public Long getSivpcpnd() {
		return this.sivpcpnd;
	}

	public void setSivpcpnd(Long sivpcpnd) {
		this.sivpcpnd = sivpcpnd;
	}

	public Long getSivpcpod() {
		return this.sivpcpod;
	}

	public void setSivpcpod(Long sivpcpod) {
		this.sivpcpod = sivpcpod;
	}

	public Long getSivpcprm() {
		return this.sivpcprm;
	}

	public void setSivpcprm(Long sivpcprm) {
		this.sivpcprm = sivpcprm;
	}

	public Long getSivpctdd() {
		return this.sivpctdd;
	}

	public void setSivpctdd(Long sivpctdd) {
		this.sivpctdd = sivpctdd;
	}

	public Long getSivpctpl() {
		return this.sivpctpl;
	}

	public void setSivpctpl(Long sivpctpl) {
		this.sivpctpl = sivpctpl;
	}

	public Long getSivpctrl() {
		return this.sivpctrl;
	}

	public void setSivpctrl(Long sivpctrl) {
		this.sivpctrl = sivpctrl;
	}

	public Long getSivpcund() {
		return this.sivpcund;
	}

	public void setSivpcund(Long sivpcund) {
		this.sivpcund = sivpcund;
	}

	public Long getSivpcves() {
		return this.sivpcves;
	}

	public void setSivpcves(Long sivpcves) {
		this.sivpcves = sivpcves;
	}

	public String getSivpcwsg() {
		return this.sivpcwsg;
	}

	public void setSivpcwsg(String sivpcwsg) {
		this.sivpcwsg = sivpcwsg;
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

	public Long getVpcaad() {
		return this.vpcaad;
	}

	public void setVpcaad(Long vpcaad) {
		this.vpcaad = vpcaad;
	}

	public Long getVpcatd() {
		return this.vpcatd;
	}

	public void setVpcatd(Long vpcatd) {
		this.vpcatd = vpcatd;
	}

	public String getVpcbag() {
		return this.vpcbag;
	}

	public void setVpcbag(String vpcbag) {
		this.vpcbag = vpcbag;
	}

	public Long getVpccm2() {
		return this.vpccm2;
	}

	public void setVpccm2(Long vpccm2) {
		this.vpccm2 = vpccm2;
	}

	public Long getVpccng() {
		return this.vpccng;
	}

	public void setVpccng(Long vpccng) {
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

	public Long getVpcdte() {
		return this.vpcdte;
	}

	public void setVpcdte(Long vpcdte) {
		this.vpcdte = vpcdte;
	}

	public Long getVpceas() {
		return this.vpceas;
	}

	public void setVpceas(Long vpceas) {
		this.vpceas = vpceas;
	}

	public String getVpceng() {
		return this.vpceng;
	}

	public void setVpceng(String vpceng) {
		this.vpceng = vpceng;
	}

	public Long getVpcexg() {
		return this.vpcexg;
	}

	public void setVpcexg(Long vpcexg) {
		this.vpcexg = vpcexg;
	}

	public Long getVpcexl() {
		return this.vpcexl;
	}

	public void setVpcexl(Long vpcexl) {
		this.vpcexl = vpcexl;
	}

	public Long getVpcfbg() {
		return this.vpcfbg;
	}

	public void setVpcfbg(Long vpcfbg) {
		this.vpcfbg = vpcfbg;
	}

	public Long getVpcfor() {
		return this.vpcfor;
	}

	public void setVpcfor(Long vpcfor) {
		this.vpcfor = vpcfor;
	}

	public Long getVpcgas() {
		return this.vpcgas;
	}

	public void setVpcgas(Long vpcgas) {
		this.vpcgas = vpcgas;
	}

	public String getVpcinv() {
		return this.vpcinv;
	}

	public void setVpcinv(String vpcinv) {
		this.vpcinv = vpcinv;
	}

	public Long getVpcke1() {
		return this.vpcke1;
	}

	public void setVpcke1(Long vpcke1) {
		this.vpcke1 = vpcke1;
	}

	public Long getVpcke2() {
		return this.vpcke2;
	}

	public void setVpcke2(Long vpcke2) {
		this.vpcke2 = vpcke2;
	}

	public Long getVpclld() {
		return this.vpclld;
	}

	public void setVpclld(Long vpclld) {
		this.vpclld = vpclld;
	}

	public Long getVpclle() {
		return this.vpclle;
	}

	public void setVpclle(Long vpclle) {
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

	public Long getVpcncb() {
		return this.vpcncb;
	}

	public void setVpcncb(Long vpcncb) {
		this.vpcncb = vpcncb;
	}

	public Long getVpcncd() {
		return this.vpcncd;
	}

	public void setVpcncd(Long vpcncd) {
		this.vpcncd = vpcncd;
	}

	public Long getVpcnmd() {
		return this.vpcnmd;
	}

	public void setVpcnmd(Long vpcnmd) {
		this.vpcnmd = vpcnmd;
	}

	public Long getVpcphd() {
		return this.vpcphd;
	}

	public void setVpcphd(Long vpcphd) {
		this.vpcphd = vpcphd;
	}

	public Long getVpcpnd() {
		return this.vpcpnd;
	}

	public void setVpcpnd(Long vpcpnd) {
		this.vpcpnd = vpcpnd;
	}

	public Long getVpcpod() {
		return this.vpcpod;
	}

	public void setVpcpod(Long vpcpod) {
		this.vpcpod = vpcpod;
	}

	public Long getVpcprm() {
		return this.vpcprm;
	}

	public void setVpcprm(Long vpcprm) {
		this.vpcprm = vpcprm;
	}

	public Long getVpctdd() {
		return this.vpctdd;
	}

	public void setVpctdd(Long vpctdd) {
		this.vpctdd = vpctdd;
	}

	public Long getVpctpl() {
		return this.vpctpl;
	}

	public void setVpctpl(Long vpctpl) {
		this.vpctpl = vpctpl;
	}

	public String getVpctrl() {
		return this.vpctrl;
	}

	public void setVpctrl(String vpctrl) {
		this.vpctrl = vpctrl;
	}

	public Long getVpcund() {
		return this.vpcund;
	}

	public void setVpcund(Long vpcund) {
		this.vpcund = vpcund;
	}

	public Long getVpcves() {
		return this.vpcves;
	}

	public void setVpcves(Long vpcves) {
		this.vpcves = vpcves;
	}

	public String getVpcwsg() {
		return this.vpcwsg;
	}

	public void setVpcwsg(String vpcwsg) {
		this.vpcwsg = vpcwsg;
	}


	public Long getZip() {
		return this.zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}
 
	public String getVPCCM1rate() {
		return VPCCM1rate;
	}

	public void setVPCCM1rate(String vPCCM1rate) {
		VPCCM1rate = vPCCM1rate;
	}
}


////@Column(length=1)
////private String active;
//
////@Column(precision=10)
////private Long batchid;
//
////@Column(length=50)
////private String blank1;
////
////@Column(length=50)
////private String blank2;
////
////@Column(length=50)
////private String blank3;
//
////@Column(precision=10)
////private Long deductiblesround1;
////
////@Column(precision=10)
////private Long deductiblesround2;
//
////@Column(length=3)
////private String eml;
//
////@Column(length=30)
////private String fueltype;
//
////@Column(precision=10)
////private Long gvweight;
//
////@Column(length=10)
////private String maprefno;
//
////@Column(length=10)
////private String mileageused;
//
//
////@Column(length=20)
////private String monthlymileage;
//
//@Column(precision=10)
//private Long noofdrivers;
//
//	@Column(length=50)
//private String papaiddriver;
//
//	@Column(length=30)
//private String parkingfac;
//
//	@Column(precision=10)
//private Long recordno;
//
//	@Column(precision=10)
//private Long recordtype;
//
//	@Column(length=30)
//private String riskblock;
//
//@Column(length=30)
//private String riskcategory;
//
//@Column(length=30)
//private String roadtype;
//
//@Column(length=100)
//private String roadtypedesc;
//
//	@Column(length=30)
//private String safetyfea;
//
//
//	@Column(length=5)
//private String sectionno;
//
//	@Column(length=30)
//private String wartext;
//
//@Column(name="XGEN_PRODUCTID", precision=10)
//private Long xgenProductid;
//
//
//@Column(name="XGEN_ENDORSEMENTNO", unique=true, nullable=false, length=10)
//private String xgenEndorsementno; 
//
//
//	@Column(length=3)
//private String eml;
//
//	@Column(length=30)
//private String fueltype;
//
//@Column(precision=10)
//private Long gvweight;
//
//
//@Column(length=5)
//private String itemno;
//
//	@Column(length=10)
//private String maprefno;
//
//	@Column(length=10)
//private String mileageused;
//
//	@Column(length=20)
//private String monthlymileage;
//
//	@Column(precision=10)
//private Long noofdrivers;
//
//
//	@Column(length=50)
//private String papaiddriver;
//
//@Column(length=30)
//private String parkingfac;
//
//@Column(precision=10)
//private Long recordno;
//
//@Column(precision=10)
//private Long recordtype;
//
//	@Column(length=30)
//private String riskblock;
//
//@Column(length=30)
//private String riskcategory;
//
//@Column(length=30)
//private String roadtype;
//
//@Column(length=100)
//private String roadtypedesc;
//
//	@Column(length=30)
//private String safetyfea;
//
//	@Column(length=5)
//private String sectionno;
//
//	@Column(length=30)
//private String wartext;
//
//@Column(name="XGEN_PRODUCTID", precision=10)
//private Long xgenProductid;
//	public String getXgenEndorsementno() {
//	return this.xgenEndorsementno;
//}
//public void setXgenEndorsementno(String xgenEndorsementno) {
//	this.xgenEndorsementno = xgenEndorsementno;
//}
//
//public String getActive() {
//	return this.active;
//}
//
//public void setActive(String active) {
//	this.active = active;
//}
//
//public Long getBatchid() {
//	return this.batchid;
//}
//
//public void setBatchid(Long batchid) {
//	this.batchid = batchid;
//}
//
//public String getBlank1() {
//	return this.blank1;
//}
//
//public void setBlank1(String blank1) {
//	this.blank1 = blank1;
//}
//
//public String getBlank2() {
//	return this.blank2;
//}
//
//public void setBlank2(String blank2) {
//	this.blank2 = blank2;
//}
//
//public String getBlank3() {
//	return this.blank3;
//}
//
//public void setBlank3(String blank3) {
//	this.blank3 = blank3;
//}
//
//	public String getEml() {
//	return this.eml;
//}
//
//public void setEml(String eml) {
//	this.eml = eml;
//}
//
//public String getFueltype() {
//	return this.fueltype;
//}
//
//public void setFueltype(String fueltype) {
//	this.fueltype = fueltype;
//}
//
//public Long getGvweight() {
//	return this.gvweight;
//}
//
//public void setGvweight(Long gvweight) {
//	this.gvweight = gvweight;
//}
//
//public String getItemno() {
//	return this.itemno;
//}
//
//public void setItemno(String itemno) {
//	this.itemno = itemno;
//}
//
//public String getMaprefno() {
//	return this.maprefno;
//}
//
//public void setMaprefno(String maprefno) {
//	this.maprefno = maprefno;
//}
//
//public String getMileageused() {
//	return this.mileageused;
//}
//
//public void setMileageused(String mileageused) {
//	this.mileageused = mileageused;
//}
//
//public String getMonthlymileage() {
//	return this.monthlymileage;
//}
//
//public void setMonthlymileage(String monthlymileage) {
//	this.monthlymileage = monthlymileage;
//}
//
//public Long getNoofdrivers() {
//	return this.noofdrivers;
//}
//
//public void setNoofdrivers(Long noofdrivers) {
//	this.noofdrivers = noofdrivers;
//}
//
//public String getPapaiddriver() {
//	return this.papaiddriver;
//}
//
//public void setPapaiddriver(String papaiddriver) {
//	this.papaiddriver = papaiddriver;
//}
//
//public String getParkingfac() {
//	return this.parkingfac;
//}
//
//public void setParkingfac(String parkingfac) {
//	this.parkingfac = parkingfac;
//}
//
//public Long getRecordno() {
//	return this.recordno;
//}
//
//public void setRecordno(Long recordno) {
//	this.recordno = recordno;
//}
//
//public Long getRecordtype() {
//	return this.recordtype;
//}
//
//public void setRecordtype(Long recordtype) {
//	this.recordtype = recordtype;
//}
//
//public String getRiskblock() {
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
//public String getRoadtype() {
//	return this.roadtype;
//}
//
//public void setRoadtype(String roadtype) {
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
//public String getSafetyfea() {
//	return this.safetyfea;
//}
//
//public void setSafetyfea(String safetyfea) {
//	this.safetyfea = safetyfea;
//}
//
//public String getSectionno() {
//	return this.sectionno;
//}
//
//public void setSectionno(String sectionno) {
//	this.sectionno = sectionno;
//}
//
//public String getWartext() {
//	return this.wartext;
//}
//
//public void setWartext(String wartext) {
//	this.wartext = wartext;
//}
//
//public Long getXgenProductid() {
//	return this.xgenProductid;
//}
//
//public void setXgenProductid(Long xgenProductid) {
//	this.xgenProductid = xgenProductid;
//}

//@Column(length=10)
//private String deductiblesvphrsa;

//@Column(precision=22)
//private Long deductiblesvpmrsa;


//@Column(length=10)
//private String sivphrsa;
//
//@Column(precision=22)
//private Long sivpmrsa;

//public String getSivphrsa() {
//	return this.sivphrsa;
//}
//
//public void setSivphrsa(String sivphrsa) {
//	this.sivphrsa = sivphrsa;
//}
//
//public Long getSivpmrsa() {
//	return this.sivpmrsa;
//}
//
//public void setSivpmrsa(Long sivpmrsa) {
//	this.sivpmrsa = sivpmrsa;
//}
//
//public String getDeductiblesvphrsa() {
//	return this.deductiblesvphrsa;
//}
//
//public void setDeductiblesvphrsa(String deductiblesvphrsa) {
//	this.deductiblesvphrsa = deductiblesvphrsa;
//}
//
//public Long getDeductiblesvpmrsa() {
//	return this.deductiblesvpmrsa;
//}
//
//public void setDeductiblesvpmrsa(Long deductiblesvpmrsa) {
//	this.deductiblesvpmrsa = deductiblesvpmrsa;
//}



//public String getVphrsa() {
//	return this.vphrsa;
//}
//
//public void setVphrsa(String vphrsa) {
//	this.vphrsa = vphrsa;
//}
//
//public Long getVpmrsa() {
//	return this.vpmrsa;
//}
//
//public void setVpmrsa(Long vpmrsa) {
//	this.vpmrsa = vpmrsa;
//}
//
//@Column(length=10)
//private String vphrsa;
//
//@Column(precision=22)
//private Long vpmrsa;