package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rs.epl.NB.oementity.TtrnInscovered;
@Repository
public interface InsCovered extends JpaRepository<TtrnInscovered, String> {
	@Query(value ="select * from (select t1.*,ROW_NUMBER() OVER (ORDER BY XGEN_POLICYNO desc)rn from TTRN_INSCOVERED t1)where rn=?1",nativeQuery = true)
	public  TtrnInscovered findRow(long m);
	
/*	@Query(value ="select * from TTRN_INSCOVERED_FORD_VPC WHERE XGEN_POLICYNO=?1",nativeQuery = true)
	public TtrnInscovered Findford(String polno);
	
	@Query(value ="select * from TTRN_INSCOVERED_RENAULT_VPC WHERE XGEN_POLICYNO=?1",nativeQuery = true)
	public TtrnInscovered FindRenault(String polno);*/
	
	
}
