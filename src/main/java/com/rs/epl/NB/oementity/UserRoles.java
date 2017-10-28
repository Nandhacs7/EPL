/**
 * 
 */
package com.rs.epl.NB.oementity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Nandhu
 *
 */
@Entity
@Table(name = "user_roles")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="oem")
public class UserRoles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "user_roles_seq")
	private Integer id;

	@Column(name = "role_name")
	private String roleName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userRoles",fetch = FetchType.EAGER)
	private Set<UserRoles> userRoles = new HashSet<UserRoles>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

	
}
