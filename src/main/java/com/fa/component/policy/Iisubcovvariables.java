package com.fa.component.policy;
//package com.rs.epl.NB.policyentity;
//// Generated Feb 17, 2017 1:17:05 PM by Hibernate Tools 4.3.5.Final
//
////import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
///**
// * Iisubcovvariables generated by hbm2java
// */
//@Entity
//@Table(name = "IISUBCOVVARIABLES")
//public class Iisubcovvariables implements java.io.Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private BigDecimal id;
//	private Iisubcoverage iisubcoverage;
//	private String name;
//	private String displayname;
//	private String variabletype;
//	private String varstrvalue;
//	private Boolean varboolvalue;
//	private Double varnumvalue;
//	private Date vardatevalue;
//	private Boolean vardisplay;
//
//	public Iisubcovvariables() {
//	}
//
//	public Iisubcovvariables(BigDecimal id) {
//		this.id = id;
//	}
//
///*	public Iisubcovvariables(BigDecimal id, Iisubcoverage iisubcoverage, String name, String displayname,
//			String variabletype, String varstrvalue, Boolean varboolvalue, Double varnumvalue,
//			Date vardatevalue, Boolean vardisplay) {
//		this.id = id;
//		this.iisubcoverage = iisubcoverage;
//		this.name = name;
//		this.displayname = displayname;
//		this.variabletype = variabletype;
//		this.varstrvalue = varstrvalue;
//		this.varboolvalue = varboolvalue;
//		this.varnumvalue = varnumvalue;
//		this.vardatevalue = vardatevalue;
//		this.vardisplay = vardisplay;
//	}*/
//
//	@Id
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "partner_sequence")
//	@SequenceGenerator(initialValue=1, allocationSize=1,name = "partner_sequence",sequenceName="partner_sequence6")
//	@Column(name = "ID", unique = true, nullable = false, scale = 0)
//	public BigDecimal getId() {
//		return this.id;
//	}
//
//	public void setId(BigDecimal id) {
//		this.id = id;
//	}
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "IISUBCOVID")
//	public Iisubcoverage getIisubcoverage() {
//		return this.iisubcoverage;
//	}
//
//	public void setIisubcoverage(Iisubcoverage iisubcoverage) {
//		this.iisubcoverage = iisubcoverage;
//	}
//
//	@Column(name = "NAME")
//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Column(name = "DISPLAYNAME")
//	public String getDisplayname() {
//		return this.displayname;
//	}
//
//	public void setDisplayname(String displayname) {
//		this.displayname = displayname;
//	}
//
//	@Column(name = "VARIABLETYPE")
//	public String getVariabletype() {
//		return this.variabletype;
//	}
//
//	public void setVariabletype(String variabletype) {
//		this.variabletype = variabletype;
//	}
//
//	@Column(name = "VARSTRVALUE")
//	public String getVarstrvalue() {
//		return this.varstrvalue;
//	}
//
//	public void setVarstrvalue(String varstrvalue) {
//		this.varstrvalue = varstrvalue;
//	}
//
//	@Column(name = "VARBOOLVALUE", precision = 1, scale = 0)
//	public Boolean getVarboolvalue() {
//		return this.varboolvalue;
//	}
//
//	public void setVarboolvalue(Boolean varboolvalue) {
//		this.varboolvalue = varboolvalue;
//	}
//
//	@Column(name = "VARNUMVALUE", precision = 126, scale = 0)
//	public Double getVarnumvalue() {
//		return this.varnumvalue;
//	}
//
//	public void setVarnumvalue(Double varnumvalue) {
//		this.varnumvalue = varnumvalue;
//	}
//
//	@Column(name = "VARDATEVALUE")
//	public Date getVardatevalue() {
//		return this.vardatevalue;
//	}
//
//	public void setVardatevalue(Date vardatevalue) {
//		this.vardatevalue = vardatevalue;
//	}
//
//	@Column(name = "VARDISPLAY", precision = 1, scale = 0)
//	public Boolean getVardisplay() {
//		return this.vardisplay;
//	}
//
//	public void setVardisplay(Boolean vardisplay) {
//		this.vardisplay = vardisplay;
//	}
//
//}
