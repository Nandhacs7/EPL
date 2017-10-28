/**
 * 
 */
package com.rs.epl.NB.dtorequest;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Nandhu
 *
 */
public class UserLoginDto {
	@NotEmpty(message="Please Enter UserName")
	private String username;
	
	@NotEmpty(message="Please Enter Password")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
