package com.fa.component.policy;
//package com.rs.epl.NB.policyentity;
//// Generated Feb 17, 2017 1:17:05 PM by Hibernate Tools 4.3.5.Final
//
//import java.math.BigDecimal;
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
// * Policysubcovelement generated by hbm2java
// */
//@Entity
//@Table(name = "POLICYSUBCOVELEMENT")
//public class Policysubcovelement implements java.io.Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private BigDecimal id;
//	private Policysubcoverage policysubcoverage;
//	private String name;
//	private String displayname;
//	private String value;
//
//	public Policysubcovelement() {
//	}
//
//	public Policysubcovelement(BigDecimal id) {
//		this.id = id;
//	}
//
//	/*public Policysubcovelement(BigDecimal id, Policysubcoverage policysubcoverage, String name, String displayname,
//			String value) {
//		this.id = id;
//		this.policysubcoverage = policysubcoverage;
//		this.name = name;
//		this.displayname = displayname;
//		this.value = value;
//	}*/
//
//	@Id
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "partner_sequence")
//	@SequenceGenerator(initialValue=1, allocationSize=1,name = "partner_sequence",sequenceName="partner_sequence17")
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
//	@JoinColumn(name = "POLSUBCOVID")
//	public Policysubcoverage getPolicysubcoverage() {
//		return this.policysubcoverage;
//	}
//
//	public void setPolicysubcoverage(Policysubcoverage policysubcoverage) {
//		this.policysubcoverage = policysubcoverage;
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
//	@Column(name = "VALUE")
//	public String getValue() {
//		return this.value;
//	}
//
//	public void setValue(String value) {
//		this.value = value;
//	}
//
//}
