/**
 * 
 */
package com.rs.epl.NB.policyrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.epl.NB.oementity.User;

/**
 * @author Nandhu
 *
 */
@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
	
	User findByUsernameAndPassword(String username,String password);
	
	User findByUsername(String username);
	
	

}
