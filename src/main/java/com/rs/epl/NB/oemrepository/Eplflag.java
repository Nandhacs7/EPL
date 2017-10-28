/*package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.EplFlag;

@Transactional
public interface Eplflag extends JpaRepository<EplFlag, String> {
	
	@Modifying
	@Transactional
	@Query("update EplFlag set flag=?1")
	Integer Updateflag(String flag); 
	
	
	@Query("select flag from EplFlag")
	String readflag(); 

}
*/