/*package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.EplServer;

@Transactional
public interface EplStatus extends JpaRepository<EplServer, String> {
	
	@Modifying
	@Transactional
	@Query("update EplServer set uploadstatus='Y' where policyno=?1")
	Integer Updatepolicy(String polno); 

}
*/