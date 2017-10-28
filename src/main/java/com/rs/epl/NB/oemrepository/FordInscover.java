/**
 * 
 */
package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.epl.NB.oementity.TtrnInscoveredFordVpc;

/**
 * @author fasupport
 *
 */
public interface FordInscover extends JpaRepository<TtrnInscoveredFordVpc, String> {
	

}
