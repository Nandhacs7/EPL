/**
 * 
 */
package com.rs.epl.NB.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.User;
import com.rs.epl.NB.oementity.UserRoles;
import com.rs.epl.NB.policyrepository.UsersRepository;
import com.rs.epl.NB.service.UserService;

/**
 * @author Nandhu
 *
 */

@Service("customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UsersRepository usersRepository;

	// @Resource
	// RtoMasterRepository rtoMasterRepository;

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// userServices.getUserByUsername(username);
		User user = usersRepository.findByUsername(username);
		// List<Users> usersList = usersRepository.findAll();
		// for (Users user : usersList) {
		// System.out.println("UserName::" + user.getUsername());
		// }

		if (user == null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
		// if(user!=null){
		// List<GrantedAuthority> authorities = getGrantedAuthorities(user);
		// return buildUserForAuthentication(user, authorities);
		// }
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), true,
				true, true, true, getGrantedAuthorities(user));

	}

	// private User buildUserForAuthentication(Users user,
	// List<GrantedAuthority> authorities) {
	// return new User(user.getUsername(), user.getPassword(), true, true, true,
	// true, authorities);
	// }

	private List<GrantedAuthority> getGrantedAuthorities(User users) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (UserRoles userRoles : users.getUserRoles().getUserRoles()) {
			System.out.println("UserRoles : " + userRoles.getRoleName());
			authorities.add(new SimpleGrantedAuthority(userRoles.getRoleName()));
		}

		// if (users.getUserRoles().getRoleName() != null) {
		// System.out.println("UserRoles : " +
		// users.getUserRoles().getRoleName());
		// authorities.add(new
		// SimpleGrantedAuthority(users.getUserRoles().getRoleName()));
		// }
		System.out.print("authorities :" + authorities);
		return authorities;
	}

	// private List<GrantedAuthority> buildUserAuthority(Set<UserRoles>
	// userRoles) {
	//
	// Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
	//
	// // Build user's authorities
	// for (UserRoles userRole : userRoles) {
	// setAuths.add(new SimpleGrantedAuthority(userRole.getRoleName()));
	// }
	//
	// List<GrantedAuthority> Result = new
	// ArrayList<GrantedAuthority>(setAuths);
	//
	// return Result;
	// }
}
