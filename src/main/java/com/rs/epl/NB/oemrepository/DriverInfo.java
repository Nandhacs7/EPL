/*package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rs.epl.NB.oementity.TtrnDriver;
@Repository
public interface DriverInfo extends JpaRepository<TtrnDriver, String>{
	@Query(value ="select * from (select t1.*,ROW_NUMBER() OVER (ORDER BY XGEN_POLICYNO desc)rn from TTRN_DRIVER t1)where rn=?1",nativeQuery = true)
	public TtrnDriver findRow(long m);
}
*/