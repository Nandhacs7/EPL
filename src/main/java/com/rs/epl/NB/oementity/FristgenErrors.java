package com.rs.epl.NB.oementity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="FIRSTGEN_ERROR_DETAILS")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="oem")
public class FristgenErrors {

	@Id
	@Column(name="ERROR_CODE")
	private String errorcode;
	
	@Column(name="ERROR_DESC")
	private String errorDetails;

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	
	

}
