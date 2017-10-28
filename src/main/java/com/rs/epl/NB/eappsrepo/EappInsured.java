package com.rs.epl.NB.eappsrepo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.epl.eapps.receiptmaster.Partiesinpolicy;

public interface EappInsured extends JpaRepository<Partiesinpolicy, Long>{
 
   public Partiesinpolicy findBypolicyid(Long polid);
	
}
