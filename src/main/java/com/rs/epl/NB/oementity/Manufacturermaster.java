package com.rs.epl.NB.oementity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "EPL_MFG")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="oem")
public class Manufacturermaster {
	
	@Id
	@Column(name="PRODUCTID")
	private int productid;
	
	@Column(name="MFR_CODE")
	private String mfrcode;
	
	@Column(name="MFR_NAME")
	private String mfrname;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getMfrcode() {
		return mfrcode;
	}
	public void setMfrcode(String mfrcode) {
		this.mfrcode = mfrcode;
	}
	public String getMfrname() {
		return mfrname;
	}
	public void setMfrname(String mfrname) {
		this.mfrname = mfrname;
	}
}
