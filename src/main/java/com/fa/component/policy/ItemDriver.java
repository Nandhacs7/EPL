/*
package com.fa.component.policy;

import java.math.BigDecimal;
//import java.util.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

//import org.hibernate.annotations.ManyToAny;

//import org.hibernate.annotations.GeneratorType;



@Entity
@Table(name = "ITEMDRIVER")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="employee")
public class ItemDriver {
    
//   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "partner_sequence")
//	@SequenceGenerator(initialValue=1, allocationSize=1,name = "partner_sequence",sequenceName="partner_sequence7")
//  @GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "custom_ItemDriver", strategy = "native")
	@GeneratedValue(generator = "custom_ItemDriver")
    
   @Id
   @GenericGenerator(name = "custom_policy", strategy = "sequence" , parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
    })
  @GeneratedValue(generator = "custom_policy", strategy=GenerationType.SEQUENCE)	
  @Column(name = "DRIVERID", unique = true, nullable = false, scale = 0)
  private Long DRIVERID;
  
  @Column(name = "DRIVERNO")
  private String DRIVERNO;
  @Column(name = "DRIVERAGE")
  private Integer DRIVERAGE;
  @Column(name = "DRIVERSEX")
  private String DRIVERSEX;
  @Column(name = "DRIVERNAME")
  private String DRIVERNAME;
  @Column(name = "DRIVERDOB")
  private String DRIVERDOB;
  @Column(name = "DRIVERADDRESS")
  private String DRIVERADDRESS;
  @Column(name = "DRIVEREXPERIENCE")
  private BigDecimal DRIVEREXPERIENCE;
  @Column(name = "DRIVINGLICENCENO")
  private String DRIVINGLICENCENO;
  @Column(name = "LICENCEISSUEDATE")
  private String LICENCEISSUEDATE;
  @Column(name = "LICENCEEXPIRYDATE")
  private String LICENCEEXPIRYDATE;
  @Column(name = "LICENCEISSUINGAUTHORITY")
  private String LICENCEISSUINGAUTHORITY;
  @Column(name = "TYPEOFLICENCE")
  private String TYPEOFLICENCE;
  @Column(name = "RELATIONSHIPOFDRIVER")
  private String RELATIONSHIPOFDRIVER;
  @Column(name = "EMPLOYMENTPERIOD")
  private String EMPLOYMENTPERIOD;
  @Column(name = "ENDORSEMENTSONLICENCE")
  private String ENDORSEMENTSONLICENCE;
  @Column(name = "ACCIDENTINVOLVED")
  private String ACCIDENTINVOLVED;
  @Column(name = "ANYCHARGESBYAUTHORITY")
  private String ANYCHARGESBYAUTHORITY;
  @Column(name = "DRIVERSUFFER")
  private String DRIVERSUFFER;
  @Column(name = "DETAILSOFSUFFER")
  private String DETAILSOFSUFFER;
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="ITEMID")
//   public Policyitem politems;
	
//  public Policyitem getPolitems() {
//	return politems;
//}
//public void setPolitems(Policyitem politems) {
//	this.politems = politems;
//}
public Long getDRIVERID() {
	return DRIVERID;
}
public void setDRIVERID(Long dRIVERID) {
	DRIVERID = dRIVERID;
}
public String getDRIVERNO() {
	return DRIVERNO;
}
public void setDRIVERNO(String dRIVERNO) {
	DRIVERNO = dRIVERNO;
}
public Integer getDRIVERAGE() {
	return DRIVERAGE;
}
public void setDRIVERAGE(Integer dRIVERAGE) {
	DRIVERAGE = dRIVERAGE;
}
public String getDRIVERSEX() {
	return DRIVERSEX;
}
public void setDRIVERSEX(String dRIVERSEX) {
	DRIVERSEX = dRIVERSEX;
}
public String getDRIVERNAME() {
	return DRIVERNAME;
}
public void setDRIVERNAME(String dRIVERNAME) {
	DRIVERNAME = dRIVERNAME;
}
public String getDRIVERDOB() {
	return DRIVERDOB;
}
public void setDRIVERDOB(String dRIVERDOB) {
	DRIVERDOB = dRIVERDOB;
}
public String getDRIVERADDRESS() {
	return DRIVERADDRESS;
}
public void setDRIVERADDRESS(String dRIVERADDRESS) {
	DRIVERADDRESS = dRIVERADDRESS;
}
public BigDecimal getDRIVEREXPERIENCE() {
	return DRIVEREXPERIENCE;
}
public void setDRIVEREXPERIENCE(BigDecimal dRIVEREXPERIENCE) {
	DRIVEREXPERIENCE = dRIVEREXPERIENCE;
}
public String getDRIVINGLICENCENO() {
	return DRIVINGLICENCENO;
}
public void setDRIVINGLICENCENO(String dRIVINGLICENCENO) {
	DRIVINGLICENCENO = dRIVINGLICENCENO;
}
public String getLICENCEISSUEDATE() {
	return LICENCEISSUEDATE;
}
public void setLICENCEISSUEDATE(String lICENCEISSUEDATE) {
	LICENCEISSUEDATE = lICENCEISSUEDATE;
}
public String getLICENCEEXPIRYDATE() {
	return LICENCEEXPIRYDATE;
}
public void setLICENCEEXPIRYDATE(String lICENCEEXPIRYDATE) {
	LICENCEEXPIRYDATE = lICENCEEXPIRYDATE;
}
public String getLICENCEISSUINGAUTHORITY() {
	return LICENCEISSUINGAUTHORITY;
}
public void setLICENCEISSUINGAUTHORITY(String lICENCEISSUINGAUTHORITY) {
	LICENCEISSUINGAUTHORITY = lICENCEISSUINGAUTHORITY;
}
public String getTYPEOFLICENCE() {
	return TYPEOFLICENCE;
}
public void setTYPEOFLICENCE(String tYPEOFLICENCE) {
	TYPEOFLICENCE = tYPEOFLICENCE;
}
public String getRELATIONSHIPOFDRIVER() {
	return RELATIONSHIPOFDRIVER;
}
public void setRELATIONSHIPOFDRIVER(String rELATIONSHIPOFDRIVER) {
	RELATIONSHIPOFDRIVER = rELATIONSHIPOFDRIVER;
}
public String getEMPLOYMENTPERIOD() {
	return EMPLOYMENTPERIOD;
}
public void setEMPLOYMENTPERIOD(String eMPLOYMENTPERIOD) {
	EMPLOYMENTPERIOD = eMPLOYMENTPERIOD;
}
public String getENDORSEMENTSONLICENCE() {
	return ENDORSEMENTSONLICENCE;
}
public void setENDORSEMENTSONLICENCE(String eNDORSEMENTSONLICENCE) {
	ENDORSEMENTSONLICENCE = eNDORSEMENTSONLICENCE;
}
public String getACCIDENTINVOLVED() {
	return ACCIDENTINVOLVED;
}
public void setACCIDENTINVOLVED(String aCCIDENTINVOLVED) {
	ACCIDENTINVOLVED = aCCIDENTINVOLVED;
}
public String getANYCHARGESBYAUTHORITY() {
	return ANYCHARGESBYAUTHORITY;
}
public void setANYCHARGESBYAUTHORITY(String aNYCHARGESBYAUTHORITY) {
	ANYCHARGESBYAUTHORITY = aNYCHARGESBYAUTHORITY;
}
public String getDRIVERSUFFER() {
	return DRIVERSUFFER;
}
public void setDRIVERSUFFER(String dRIVERSUFFER) {
	DRIVERSUFFER = dRIVERSUFFER;
}
public String getDETAILSOFSUFFER() {
	return DETAILSOFSUFFER;
}
public void setDETAILSOFSUFFER(String dETAILSOFSUFFER) {
	DETAILSOFSUFFER = dETAILSOFSUFFER;
}

  
}
*/