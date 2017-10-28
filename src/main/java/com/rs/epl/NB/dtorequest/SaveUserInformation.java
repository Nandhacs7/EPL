/**
 * 
 */
package com.rs.epl.NB.dtorequest;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author System7
 *
 */
public class SaveUserInformation {
	
	@NotEmpty(message="Please Enter UserName")
	private String userName;
	
	@NotEmpty
	@Size(min = 8, max = 30,message="Password Length Must be 8 to 30 ")
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
