/*package com.rs.epl.NB.policyrepository;

import java.util.Date;
import java.util.List;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rs.epl.NB.oementity.PolicyerrorData;
@Repository

public interface PolicyErrorDataRepository extends JpaRepository<PolicyerrorData, Long>{
	

    Page<PolicyerrorData> findByStatus(String status, Pageable pageable);
    
    Page<PolicyerrorData> findByPolicynoOrReciptno(String policyno, Pageable pageable);
    


    @Query("select polerrdt from PolicyerrorData polerrdt where (polerrdt.reciptno=?1 or polerrdt.policyno=?1) and ((polerrdt.policyno like %?2%) OR (polerrdt.reciptno like %?2%) OR (polerrdt.status like %?2%) OR (polerrdt.Attempttime like %?2%) OR (polerrdt.errorcode like %?2%) OR (polerrdt.responsexml like %?2%))")   
    @Cacheable(value="data1")
    Page<PolicyerrorData> getByPolicynoOrReciptno(String policynoOrReceiptno,String searchKey, Pageable pageable);
    
//    Page<PolicyerrorData> findByStatusAndAttempttimeBetween(String status,Date startDate,Date endDate, Pageable pageable);
    
//    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.status = ?1) AND (polerrdt.Attempttime between ?3 and ?4)) AND ((polerrdt.policyno like %?2%) OR (polerrdt.reciptno like %?2%) OR (polerrdt.status like %?2%) OR (polerrdt.Attempttime like %?2%) OR (polerrdt.errorcode like %?2%) OR (polerrdt.responsexml like %?2%))")
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.status like ?1%) AND (polerrdt.Attempttime between ?2 and ?3)) AND polerrdt.ProductCode=?4 and polerrdt.fromsystem=?5")
    @Cacheable(value="data2")
    Page<PolicyerrorData> getByStatusAndAttempttimeBetween(String status,Date startDate, Date endDate,String Productcode,Pageable pageable,String system);
    
//    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.status = ?1) AND (polerrdt.attempttime between ?3 and ?4)) AND ((polerrdt.policyno like %?2%) OR (polerrdt.reciptno like %?2%) OR (polerrdt.status like %?2%) OR (polerrdt.attempt like %?2%) OR (polerrdt.errorcode like %?2%) OR (polerrdt.responsexml like %?2%)) ")
//    Page<PolicyerrorData> getByStatusAndAttempttimeBetween(String status,String searchKey,Date startDate, Date endDate, Pageable pageable);
//}
    
    
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.Attempttime between ?1 and ?2)) and polerrdt.ProductCode=?3 and polerrdt.fromsystem=?4")
    @Cacheable(value="data3")
    Page<PolicyerrorData> getByTypeAndAttempttimeBetween(Date startDate, Date endDate,String ProductCode, Pageable pageable,String system);
    
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.Attempttime between ?1 and ?2)) and polerrdt.status=?3 and polerrdt.fromsystem=?4")
    @Cacheable(value="data4")
    Page<PolicyerrorData> getByTypeAndAttempttimeandStatus(Date startDate, Date endDate,String status, Pageable pageable,String system);
    
    //value = "employee"
    @Query("select polerrdt from PolicyerrorData polerrdt where (polerrdt.Attempttime between ?1 and ?2) and polerrdt.fromsystem=?3")    
    @Cacheable(value="data5")
    Page<PolicyerrorData> getBydateonly(Date startDate, Date endDate, Pageable pageable,String system);
    
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.Attempttime between ?1 and ?2) and (polerrdt.ProductCode=?3) and (polerrdt.Mfgname like ?4%))")
    @Cacheable(value="data6")
    Page<PolicyerrorData> getByMfgandProductcode(Date startDate, Date endDate,String ProductCode,String Mfgtype,Pageable pageable);
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.Attempttime between ?1 and ?2) and (polerrdt.status=?3) and (polerrdt.Mfgname like ?4%))")
    @Cacheable(value="data7")
    Page<PolicyerrorData> getByMfgandStatus(Date startDate, Date endDate,String Status,String Mfganme,Pageable pageable);
    
    ///Chart
    @Query(value = "select * from POLICY_STATUS where attempt_time like (sysdate-1) and status='SUCCESS'",nativeQuery = true)
    @Cacheable(value="data10")
    List<Object> findAll2DaysBeforePolicyErrorDataSuccessRecords();

    @Query(value = "select * from POLICY_STATUS where attempt_time like (sysdate-1) and status='FAIL'",nativeQuery = true)
    @Cacheable(value="data11")
    List<Object> findAll2DaysBeforePolicyErrorDataFailRecords();

    @Query(value = "select * from POLICY_STATUS where attempt_time between (sysdate-8) and (sysdate-1) and status='SUCCESS'",nativeQuery = true)
    @Cacheable(value="data12")
    List<Object> findAll1WeekBeforePolicyErrorDataSuccessRecords();

    @Query(value = "select * from POLICY_STATUS where attempt_time between (sysdate-8) and (sysdate-1) and status='FAIL'",nativeQuery = true)
    @Cacheable(value="data13")
    List<Object> findAll1WeekBeforePolicyErrorDataFailRecords();

    @Query(value = "select * from POLICY_STATUS where attempt_time between (sysdate-32) and (sysdate-1) and status='SUCCESS'",nativeQuery = true)
    @Cacheable(value="data14")
    List<Object> findAll1MonthBeforePolicyErrorDataSuccessRecords();

    @Query(value = "select * from POLICY_STATUS where attempt_time between (sysdate-32) and (sysdate-1) and status='FAIL'",nativeQuery = true)
    @Cacheable(value="data15")
    List<Object> findAll1MonthBeforePolicyErrorDataFailRecords();
    
    ////new Req
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.Attempttime between ?1 and ?2)) and polerrdt.Mfgname like ?3%")
    @Cacheable(value="data8")
    Page<PolicyerrorData> getbymfgonly(Date startDate, Date endDate,String Mfg, Pageable pageable);
    
    @Query("select polerrdt from PolicyerrorData polerrdt where ((polerrdt.status = ?1) AND (polerrdt.Attempttime between ?2 and ?3)) AND ((polerrdt.Mfgname like ?4%) AND (polerrdt.ProductCode=?5))") 
    @Cacheable(value="data9")
	Page<PolicyerrorData> getByMfgAndStatus(String status,Date startdate, Date enddate, String mfgtype,String ProductCode,
			Pageable pageable);   
    
}   
*/