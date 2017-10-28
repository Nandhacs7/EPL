package com.rs.epl.NB.oementity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Ttrn_Inscovered_Info_Vfa")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class Vfacover implements java.io.Serializable {
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
	private String oldinsured;
	private String oldpolexp;
	@Column(name="GSTNUMBER")
	private String Gstnumber;
	
	@Column(name ="VFAVPR")
	private   String   VFAVPR;
	@Column(name ="VFATPR")
	private   String   VFATPR;
	@Column(name ="VFAVAI")
	private   String   VFAVAI;
	@Column(name ="VFAACC")
	private   String   VFAACC;
	@Column(name ="VFAVHR")
	private   String   VFAVHR;
	@Column(name ="VFAVTM")
	private   String   VFAVTM;
	@Column(name ="VFAVTL")
	private   String   VFAVTL;
	@Column(name ="VFAVPO")
	private   String   VFAVPO;
	@Column(name ="VFATTL")
	private   String   VFATTL;
	@Column(name ="VFAVLD")
	private   String   VFAVLD;
	@Column(name ="VFAVLE ")
	private   String   VFAVLE;
	@Column(name ="VFATPL")
	private   String   VFATPL;
	@Column(name ="VFAVPD")
	private   String   VFAVPD;
	@Column(name ="VFAATD")
	private   String   VFAATD;
	@Column(name ="VFAVNC")
	private   String   VFAVNC;
	@Column(name ="VFALLD")
	private   String   VFALLD;
	@Column(name ="VFATHR")
	private   String   VFATHR;
	@Column(name ="ROUND1")
	private   String   ROUND1;
	@Column(name ="ROUND2")
	private   String   ROUND2;
	@Column(name ="VFAIPD")
	private   String   VFAIPD;
	@Column(name ="RIPDPR")
	private   String   RIPDPR;
	@Column(name ="RIPHPS")
	private   String   RIPHPS;
	@Column(name ="VFADISRATE")
	private   String   VFADIS;
	@Column(name ="DEDUCTIBLESVFAVPR")
	private   String   DEDUCTIBLESVFAVPR ;
	@Column(name ="DEDUCTIBLESVFATPR")
	private   String   DEDUCTIBLESVFATPR;
	@Column(name ="DEDUCTIBLESVFAVAI")
	private   String   DEDUCTIBLESVFAVAI;
	@Column(name ="DEDUCTIBLESVFAACC")
	private   String   DEDUCTIBLESVFAACC;
	@Column(name ="DEDUCTIBLESVFAVHR")
	private   String   DEDUCTIBLESVFAVHR;
	@Column(name ="DEDUCTIBLESVFAVTM")
	private   String   DEDUCTIBLESVFAVTM;
	@Column(name ="DEDUCTIBLESVFAVTL")
	private   String   DEDUCTIBLESVFAVTL;
	@Column(name ="DEDUCTIBLESVFAVPO")
	private   String   DEDUCTIBLESVFAVPO;
	@Column(name ="DEDUCTIBLESVFATTL")
	private   String   DEDUCTIBLESVFATTL;
	@Column(name ="DEDUCTIBLESVFAVLD")
	private   String   DEDUCTIBLESVFAVLD;
	@Column(name ="DEDUCTIBLESVFAVLE")
	private   String   DEDUCTIBLESVFAVLE;
	@Column(name ="DEDUCTIBLESVFATPL")
	private   String   DEDUCTIBLESVFATPL;
	@Column(name ="DEDUCTIBLESVFADIS")
	private   String   DEDUCTIBLESVFADIS;
	@Column(name ="DEDUCTIBLESVFAVPD")
	private   String   DEDUCTIBLESVFAVPD;
	@Column(name ="DEDUCTIBLESVFAATD")
	private   String   DEDUCTIBLESVFAATD;
	@Column(name ="DEDUCTIBLESVFAVNC")
	private   String   DEDUCTIBLESVFAVNC;
	@Column(name ="DEDUCTIBLESVFALLD")
	private   String   DEDUCTIBLESVFALLD;
	@Column(name ="DEDUCTIBLESVFATHR ")
	private   String   DEDUCTIBLESVFATHR ;
	@Column(name ="DEDUCTIBLESROUND1")
	private   String   DEDUCTIBLESROUND1;
	@Column(name ="DEDUCTIBLESROUND2")
	private   String   DEDUCTIBLESROUND2;
	@Column(name ="DEDUCTIBLESVFAIPD")
	private   String   DEDUCTIBLESVFAIPD;
	@Column(name ="DEDUCTIBLESRIPDPR")
	private   String   DEDUCTIBLESRIPDPR;
	@Column(name ="DEDUCTIBLESRIPHPS")
	private   String   DEDUCTIBLESRIPHPS;
	@Column(name ="SIVFAVPR")
	private   String   SIVFAVPR;
	@Column(name ="SIVFATPR")
	private   String   SIVFATPR;
	@Column(name ="SIVFAVAI")
	private   String   SIVFAVAI;
	@Column(name ="SIVFAACC")
	private   String   SIVFAACC;
	@Column(name ="SIVFAVHR")
	private   String   SIVFAVHR;
	@Column(name ="SIVFAVTM")
	private   String   SIVFAVTM;
	@Column(name ="SIVFAVTL")
	private   String   SIVFAVTL;
	@Column(name ="SIVFAVPO")
	private   String   SIVFAVPO;
	@Column(name ="SIVFATTL")
	private   String   SIVFATTL;
	@Column(name ="SIVFAVLD")
	private   String   SIVFAVLD;
	@Column(name ="SIVFAVLE")
	private   String   SIVFAVLE;
	@Column(name ="SIVFATPL")
	private   String   SIVFATPL;
	@Column(name ="SIVFADIS")
	private   String   SIVFADIS;
	@Column(name ="SIVFAVPD")
	private   String   SIVFAVPD;
	@Column(name ="SIVFAATD")
	private   String   SIVFAATD;
	@Column(name ="SIVFAVNC")
	private   String   SIVFAVNC;
	@Column(name ="SIVFALLD")
	private   String   SIVFALLD;
	@Column(name ="SIVFATHR")
	private   String   SIVFATHR;
	@Column(name ="SIROUND1")
	private   String   SIROUND1;
	@Column(name ="SIROUND2")
	private   String   SIROUND2;
	@Column(name ="SIVFAIPD")
	private   String   SIVFAIPD;
	@Column(name ="SIRIPDPR")
	private   String   SIRIPDPR;
	@Column(name ="SIRIPHPS")
	private   String   SIRIPHPS;
	
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
	
	public String getOtherparty() {
		return otherparty;
	}

	public void setOtherparty(String otherparty) {
		this.otherparty = otherparty;
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
	
	
	public String getGstnumber() {
		return Gstnumber;
	}

	public void setGstnumber(String gstnumber) {
		Gstnumber = gstnumber;
	}

	public String getVFAVPR() {
		return VFAVPR;
	}

	public void setVFAVPR(String vFAVPR) {
		VFAVPR = vFAVPR;
	}

	public String getVFATPR() {
		return VFATPR;
	}

	public void setVFATPR(String vFATPR) {
		VFATPR = vFATPR;
	}

	public String getVFAVAI() {
		return VFAVAI;
	}

	public void setVFAVAI(String vFAVAI) {
		VFAVAI = vFAVAI;
	}

	public String getVFAACC() {
		return VFAACC;
	}

	public void setVFAACC(String vFAACC) {
		VFAACC = vFAACC;
	}

	public String getVFAVHR() {
		return VFAVHR;
	}

	public void setVFAVHR(String vFAVHR) {
		VFAVHR = vFAVHR;
	}

	public String getVFAVTM() {
		return VFAVTM;
	}

	public void setVFAVTM(String vFAVTM) {
		VFAVTM = vFAVTM;
	}

	public String getVFAVTL() {
		return VFAVTL;
	}

	public void setVFAVTL(String vFAVTL) {
		VFAVTL = vFAVTL;
	}

	public String getVFAVPO() {
		return VFAVPO;
	}

	public void setVFAVPO(String vFAVPO) {
		VFAVPO = vFAVPO;
	}

	public String getVFATTL() {
		return VFATTL;
	}

	public void setVFATTL(String vFATTL) {
		VFATTL = vFATTL;
	}

	public String getVFAVLD() {
		return VFAVLD;
	}

	public void setVFAVLD(String vFAVLD) {
		VFAVLD = vFAVLD;
	}

	public String getVFAVLE() {
		return VFAVLE;
	}

	public void setVFAVLE(String vFAVLE) {
		VFAVLE = vFAVLE;
	}

	public String getVFATPL() {
		return VFATPL;
	}

	public void setVFATPL(String vFATPL) {
		VFATPL = vFATPL;
	}

	public String getVFAVPD() {
		return VFAVPD;
	}

	public void setVFAVPD(String vFAVPD) {
		VFAVPD = vFAVPD;
	}

	public String getVFAATD() {
		return VFAATD;
	}

	public void setVFAATD(String vFAATD) {
		VFAATD = vFAATD;
	}

	public String getVFAVNC() {
		return VFAVNC;
	}

	public void setVFAVNC(String vFAVNC) {
		VFAVNC = vFAVNC;
	}

	public String getVFALLD() {
		return VFALLD;
	}

	public void setVFALLD(String vFALLD) {
		VFALLD = vFALLD;
	}

	public String getVFATHR() {
		return VFATHR;
	}

	public void setVFATHR(String vFATHR) {
		VFATHR = vFATHR;
	}

	public String getROUND1() {
		return ROUND1;
	}

	public void setROUND1(String rOUND1) {
		ROUND1 = rOUND1;
	}

	public String getROUND2() {
		return ROUND2;
	}

	public void setROUND2(String rOUND2) {
		ROUND2 = rOUND2;
	}

	public String getVFAIPD() {
		return VFAIPD;
	}

	public void setVFAIPD(String vFAIPD) {
		VFAIPD = vFAIPD;
	}

	public String getRIPDPR() {
		return RIPDPR;
	}

	public void setRIPDPR(String rIPDPR) {
		RIPDPR = rIPDPR;
	}

	public String getRIPHPS() {
		return RIPHPS;
	}

	public void setRIPHPS(String rIPHPS) {
		RIPHPS = rIPHPS;
	}

	public String getVFADIS() {
		return VFADIS;
	}

	public void setVFADIS(String vFADIS) {
		VFADIS = vFADIS;
	}

	public String getDEDUCTIBLESVFAVPR() {
		return DEDUCTIBLESVFAVPR;
	}

	public void setDEDUCTIBLESVFAVPR(String dEDUCTIBLESVFAVPR) {
		DEDUCTIBLESVFAVPR = dEDUCTIBLESVFAVPR;
	}

	public String getDEDUCTIBLESVFATPR() {
		return DEDUCTIBLESVFATPR;
	}

	public void setDEDUCTIBLESVFATPR(String dEDUCTIBLESVFATPR) {
		DEDUCTIBLESVFATPR = dEDUCTIBLESVFATPR;
	}

	public String getDEDUCTIBLESVFAVAI() {
		return DEDUCTIBLESVFAVAI;
	}

	public void setDEDUCTIBLESVFAVAI(String dEDUCTIBLESVFAVAI) {
		DEDUCTIBLESVFAVAI = dEDUCTIBLESVFAVAI;
	}

	public String getDEDUCTIBLESVFAACC() {
		return DEDUCTIBLESVFAACC;
	}

	public void setDEDUCTIBLESVFAACC(String dEDUCTIBLESVFAACC) {
		DEDUCTIBLESVFAACC = dEDUCTIBLESVFAACC;
	}

	public String getDEDUCTIBLESVFAVHR() {
		return DEDUCTIBLESVFAVHR;
	}

	public void setDEDUCTIBLESVFAVHR(String dEDUCTIBLESVFAVHR) {
		DEDUCTIBLESVFAVHR = dEDUCTIBLESVFAVHR;
	}

	public String getDEDUCTIBLESVFAVTM() {
		return DEDUCTIBLESVFAVTM;
	}

	public void setDEDUCTIBLESVFAVTM(String dEDUCTIBLESVFAVTM) {
		DEDUCTIBLESVFAVTM = dEDUCTIBLESVFAVTM;
	}

	public String getDEDUCTIBLESVFAVTL() {
		return DEDUCTIBLESVFAVTL;
	}

	public void setDEDUCTIBLESVFAVTL(String dEDUCTIBLESVFAVTL) {
		DEDUCTIBLESVFAVTL = dEDUCTIBLESVFAVTL;
	}

	public String getDEDUCTIBLESVFAVPO() {
		return DEDUCTIBLESVFAVPO;
	}

	public void setDEDUCTIBLESVFAVPO(String dEDUCTIBLESVFAVPO) {
		DEDUCTIBLESVFAVPO = dEDUCTIBLESVFAVPO;
	}

	public String getDEDUCTIBLESVFATTL() {
		return DEDUCTIBLESVFATTL;
	}

	public void setDEDUCTIBLESVFATTL(String dEDUCTIBLESVFATTL) {
		DEDUCTIBLESVFATTL = dEDUCTIBLESVFATTL;
	}

	public String getDEDUCTIBLESVFAVLD() {
		return DEDUCTIBLESVFAVLD;
	}

	public void setDEDUCTIBLESVFAVLD(String dEDUCTIBLESVFAVLD) {
		DEDUCTIBLESVFAVLD = dEDUCTIBLESVFAVLD;
	}

	public String getDEDUCTIBLESVFAVLE() {
		return DEDUCTIBLESVFAVLE;
	}

	public void setDEDUCTIBLESVFAVLE(String dEDUCTIBLESVFAVLE) {
		DEDUCTIBLESVFAVLE = dEDUCTIBLESVFAVLE;
	}

	public String getDEDUCTIBLESVFATPL() {
		return DEDUCTIBLESVFATPL;
	}

	public void setDEDUCTIBLESVFATPL(String dEDUCTIBLESVFATPL) {
		DEDUCTIBLESVFATPL = dEDUCTIBLESVFATPL;
	}

	public String getDEDUCTIBLESVFADIS() {
		return DEDUCTIBLESVFADIS;
	}

	public void setDEDUCTIBLESVFADIS(String dEDUCTIBLESVFADIS) {
		DEDUCTIBLESVFADIS = dEDUCTIBLESVFADIS;
	}

	public String getDEDUCTIBLESVFAVPD() {
		return DEDUCTIBLESVFAVPD;
	}

	public void setDEDUCTIBLESVFAVPD(String dEDUCTIBLESVFAVPD) {
		DEDUCTIBLESVFAVPD = dEDUCTIBLESVFAVPD;
	}

	public String getDEDUCTIBLESVFAATD() {
		return DEDUCTIBLESVFAATD;
	}

	public void setDEDUCTIBLESVFAATD(String dEDUCTIBLESVFAATD) {
		DEDUCTIBLESVFAATD = dEDUCTIBLESVFAATD;
	}

	public String getDEDUCTIBLESVFAVNC() {
		return DEDUCTIBLESVFAVNC;
	}

	public void setDEDUCTIBLESVFAVNC(String dEDUCTIBLESVFAVNC) {
		DEDUCTIBLESVFAVNC = dEDUCTIBLESVFAVNC;
	}

	public String getDEDUCTIBLESVFALLD() {
		return DEDUCTIBLESVFALLD;
	}

	public void setDEDUCTIBLESVFALLD(String dEDUCTIBLESVFALLD) {
		DEDUCTIBLESVFALLD = dEDUCTIBLESVFALLD;
	}

	public String getDEDUCTIBLESVFATHR() {
		return DEDUCTIBLESVFATHR;
	}

	public void setDEDUCTIBLESVFATHR(String dEDUCTIBLESVFATHR) {
		DEDUCTIBLESVFATHR = dEDUCTIBLESVFATHR;
	}

	public String getDEDUCTIBLESROUND1() {
		return DEDUCTIBLESROUND1;
	}

	public void setDEDUCTIBLESROUND1(String dEDUCTIBLESROUND1) {
		DEDUCTIBLESROUND1 = dEDUCTIBLESROUND1;
	}

	public String getDEDUCTIBLESROUND2() {
		return DEDUCTIBLESROUND2;
	}

	public void setDEDUCTIBLESROUND2(String dEDUCTIBLESROUND2) {
		DEDUCTIBLESROUND2 = dEDUCTIBLESROUND2;
	}

	public String getDEDUCTIBLESVFAIPD() {
		return DEDUCTIBLESVFAIPD;
	}

	public void setDEDUCTIBLESVFAIPD(String dEDUCTIBLESVFAIPD) {
		DEDUCTIBLESVFAIPD = dEDUCTIBLESVFAIPD;
	}

	public String getDEDUCTIBLESRIPDPR() {
		return DEDUCTIBLESRIPDPR;
	}

	public void setDEDUCTIBLESRIPDPR(String dEDUCTIBLESRIPDPR) {
		DEDUCTIBLESRIPDPR = dEDUCTIBLESRIPDPR;
	}

	public String getDEDUCTIBLESRIPHPS() {
		return DEDUCTIBLESRIPHPS;
	}

	public void setDEDUCTIBLESRIPHPS(String dEDUCTIBLESRIPHPS) {
		DEDUCTIBLESRIPHPS = dEDUCTIBLESRIPHPS;
	}

	public String getSIVFAVPR() {
		return SIVFAVPR;
	}

	public void setSIVFAVPR(String sIVFAVPR) {
		SIVFAVPR = sIVFAVPR;
	}

	public String getSIVFATPR() {
		return SIVFATPR;
	}

	public void setSIVFATPR(String sIVFATPR) {
		SIVFATPR = sIVFATPR;
	}

	public String getSIVFAVAI() {
		return SIVFAVAI;
	}

	public void setSIVFAVAI(String sIVFAVAI) {
		SIVFAVAI = sIVFAVAI;
	}

	public String getSIVFAACC() {
		return SIVFAACC;
	}

	public void setSIVFAACC(String sIVFAACC) {
		SIVFAACC = sIVFAACC;
	}

	public String getSIVFAVHR() {
		return SIVFAVHR;
	}

	public void setSIVFAVHR(String sIVFAVHR) {
		SIVFAVHR = sIVFAVHR;
	}

	public String getSIVFAVTM() {
		return SIVFAVTM;
	}

	public void setSIVFAVTM(String sIVFAVTM) {
		SIVFAVTM = sIVFAVTM;
	}

	public String getSIVFAVTL() {
		return SIVFAVTL;
	}

	public void setSIVFAVTL(String sIVFAVTL) {
		SIVFAVTL = sIVFAVTL;
	}

	public String getSIVFAVPO() {
		return SIVFAVPO;
	}

	public void setSIVFAVPO(String sIVFAVPO) {
		SIVFAVPO = sIVFAVPO;
	}

	public String getSIVFATTL() {
		return SIVFATTL;
	}

	public void setSIVFATTL(String sIVFATTL) {
		SIVFATTL = sIVFATTL;
	}

	public String getSIVFAVLD() {
		return SIVFAVLD;
	}

	public void setSIVFAVLD(String sIVFAVLD) {
		SIVFAVLD = sIVFAVLD;
	}

	public String getSIVFAVLE() {
		return SIVFAVLE;
	}

	public void setSIVFAVLE(String sIVFAVLE) {
		SIVFAVLE = sIVFAVLE;
	}

	public String getSIVFATPL() {
		return SIVFATPL;
	}

	public void setSIVFATPL(String sIVFATPL) {
		SIVFATPL = sIVFATPL;
	}

	public String getSIVFADIS() {
		return SIVFADIS;
	}

	public void setSIVFADIS(String sIVFADIS) {
		SIVFADIS = sIVFADIS;
	}

	public String getSIVFAVPD() {
		return SIVFAVPD;
	}

	public void setSIVFAVPD(String sIVFAVPD) {
		SIVFAVPD = sIVFAVPD;
	}

	public String getSIVFAATD() {
		return SIVFAATD;
	}

	public void setSIVFAATD(String sIVFAATD) {
		SIVFAATD = sIVFAATD;
	}

	public String getSIVFAVNC() {
		return SIVFAVNC;
	}

	public void setSIVFAVNC(String sIVFAVNC) {
		SIVFAVNC = sIVFAVNC;
	}

	public String getSIVFALLD() {
		return SIVFALLD;
	}

	public void setSIVFALLD(String sIVFALLD) {
		SIVFALLD = sIVFALLD;
	}

	public String getSIVFATHR() {
		return SIVFATHR;
	}

	public void setSIVFATHR(String sIVFATHR) {
		SIVFATHR = sIVFATHR;
	}

	public String getSIROUND1() {
		return SIROUND1;
	}

	public void setSIROUND1(String sIROUND1) {
		SIROUND1 = sIROUND1;
	}

	public String getSIROUND2() {
		return SIROUND2;
	}

	public void setSIROUND2(String sIROUND2) {
		SIROUND2 = sIROUND2;
	}

	public String getSIVFAIPD() {
		return SIVFAIPD;
	}

	public void setSIVFAIPD(String sIVFAIPD) {
		SIVFAIPD = sIVFAIPD;
	}

	public String getSIRIPDPR() {
		return SIRIPDPR;
	}

	public void setSIRIPDPR(String sIRIPDPR) {
		SIRIPDPR = sIRIPDPR;
	}

	public String getSIRIPHPS() {
		return SIRIPHPS;
	}

	public void setSIRIPHPS(String sIRIPHPS) {
		SIRIPHPS = sIRIPHPS;
	}	

}
