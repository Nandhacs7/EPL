package com.rs.epl.NB.policyrepository;


import java.util.Date;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fa.component.policy.EPL_UISTATUS;

/**
 * @author Rameswar
 *
 */


@Repository
public interface UIStatus extends JpaRepository<EPL_UISTATUS, String> {

	@Modifying
	@Transactional
	@Query(value = "update EPL_STATUS st  set st.GARBAGEDETAILS=(st.POLICYNO||'==>'||st.RECEIPTNO) , st.POLICYNO='Garbage' , st.RECEIPTNO='Garbage' where st.POLICYNO=?1",nativeQuery = true)
	Integer UpdatePolicyGarbage(String polno); 
	
	@Modifying
	@Transactional
	@Query(value = "update EPL_STATUS set POLICY_STATUS='' where POLICYNO=?1",nativeQuery = true)
	Integer UpdateOemPolicyGarbage(String polno); 
	
	
	@Query("select pomm from EPL_UISTATUS pomm where  pomm.policyno like ?1% OR pomm.receiptno like %?2%")   
    @Cacheable(value="data8956")
    Page<EPL_UISTATUS> getByPolicynoOrReciptno2(String policyno,String Receiptno, Pageable pageable);
    
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2) and "
    		+ "polerrdt.policy_status=?3 and polerrdt.productcode=?4  and polerrdt.fromsysystem=?5")
    @Cacheable(value="data2")   
    Page<EPL_UISTATUS> EmotordatabyAll(Date startDate,Date endDate,String status,String Productcode,String system,Pageable pageable);
	
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2)"
    		+ "and polerrdt.fromsysystem=?3 and polerrdt.policy_status=?4")
    @Cacheable(value="data3")   
    Page<EPL_UISTATUS> Emotordatabystatus(Date startDate,Date endDate,String system,String status,Pageable pageable);
	
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2)"
    		+ "and polerrdt.fromsysystem=?3 and polerrdt.productcode=?4")
    @Cacheable(value="data3")   
    Page<EPL_UISTATUS> EmotordatabyProduct(Date startDate,Date endDate,String system,String product,Pageable pageable);
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2) and polerrdt.fromsysystem=?3")
    @Cacheable(value="data5")   
    Page<EPL_UISTATUS> EmotordatabyDaterange(Date startDate,Date endDate,String system,Pageable pageable);
	
    
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2) and "
    		+ "polerrdt.policy_status=?3 and polerrdt.productcode=?4  and polerrdt.fromsysystem=?5 and polerrdt.mfgname like ?6% ")
    @Cacheable(value="data2")   
    Page<EPL_UISTATUS> OEMdatabyAll(Date startDate,Date endDate,String status,String Productcode,String system,String mfg, Pageable pageable);
	
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2)"
    		+ "and polerrdt.fromsysystem=?3 and polerrdt.mfgname like ?4% ")
    @Cacheable(value="data3")   
    Page<EPL_UISTATUS> OEMdatabyMfg(Date startDate,Date endDate,String system,String mfg,Pageable pageable);
    
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2) and "
    		+ "polerrdt.policy_status=?3 and polerrdt.productcode=?4  and polerrdt.fromsysystem=?5")
    @Cacheable(value="data2")   
    Page<EPL_UISTATUS> OEMdatabyProductandstatus(Date startDate,Date endDate,String status,String Productcode,String system, Pageable pageable);
	
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2) and "
    		+ "polerrdt.policy_status=?3 and polerrdt.mfgname like ?4%  and polerrdt.fromsysystem=?5")
    @Cacheable(value="data2")   
    Page<EPL_UISTATUS> OEMdatabystatusandmfg(Date startDate,Date endDate,String status,String mfg,String system, Pageable pageable);
	 
    @Query("select polerrdt from EPL_UISTATUS polerrdt where polerrdt.policyno!='Garbage' and (polerrdt.policy_attempt_time between ?1 and ?2) and "
    		+ "polerrdt.productcode=?3 and polerrdt.mfgname like ?4%  and polerrdt.fromsysystem=?5")
    @Cacheable(value="data2")   
    Page<EPL_UISTATUS> OEMdatabyproductandmfg(Date startDate,Date endDate,String Product,String mfg,String system, Pageable pageable);

}
