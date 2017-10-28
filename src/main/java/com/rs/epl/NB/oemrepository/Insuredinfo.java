package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rs.epl.NB.oementity.TtrnInsured;
@Repository
public interface Insuredinfo extends JpaRepository<TtrnInsured, String> {
	@Query(value ="select * from (select t1.*,ROW_NUMBER() OVER (ORDER BY XGEN_POLICYNO desc)rn from TTRN_INSURED t1)where rn=?1",nativeQuery = true)
	public TtrnInsured findRow(long m);
}
