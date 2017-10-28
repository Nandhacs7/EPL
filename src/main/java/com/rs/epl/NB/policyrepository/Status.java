/**
 * 
 */
package com.rs.epl.NB.policyrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fa.component.policy.EPL_STATUS;

/**
 * @author fasupport
 *
 */
@Repository
public interface Status extends JpaRepository<EPL_STATUS, String> {
	


}
