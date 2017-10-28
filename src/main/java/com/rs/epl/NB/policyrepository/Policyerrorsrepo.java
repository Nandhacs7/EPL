/*package com.rs.epl.NB.policyrepository;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.PolicyerrorData;

public interface Policyerrorsrepo extends JpaRepository<PolicyerrorData, Long> {
	
	@Query("select pdcn from PolicyerrorData pdcn where pdcn.policyno like %?1%)")
	 @Cacheable(value="pol1")
	Page<PolicyerrorData> findPolicyNoDataSearchDetailsPaging(String searchText, Pageable pageable);
	
	@Query("select pdcn from PolicyerrorData pdcn where pdcn.reciptno like %?1%)")
	@Cacheable(value="pol2")
	Page<PolicyerrorData> findPolicyReceiptDataSearchDetailsPaging(String searchText, Pageable pageable);
	
//	@Cacheable(value="pol4")
	PolicyerrorData findBypolicyno(String policyno);
	
    @Query(value = "delete from POLICY_STATUS where polno=?1",nativeQuery = true)
//    @Cacheable(value="pol3")
    void deleteBypolicyNo(String policyNo);
    
    
    
	@Modifying
	@Transactional
	@Query(value = "update Policy_Status  set Attempt=?1 where polno=?2",nativeQuery = true)
	Integer Updatepolicy(int no,String polno); 
	
	
	@Modifying
	@Transactional
	@Query(value = "update Policy_Status  set polno='Garbage' , RECIPTNO='Garbage' where polno=?1",nativeQuery = true)
	Integer UpdatePolicyGarbage(String polno); 
    	
}
*/