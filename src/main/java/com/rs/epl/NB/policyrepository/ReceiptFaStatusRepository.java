/*package com.rs.epl.NB.policyrepository;

import java.util.Date;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.ReceiptFaStatus;


@Repository
public interface ReceiptFaStatusRepository extends JpaRepository<ReceiptFaStatus, String> { 
	
    @Query("select rcptfs from ReceiptFaStatus rcptfs where rcptfs.policyNo like %?1%")
    @Cacheable(value="rec1")
    Page<ReceiptFaStatus> findReceiptFaStatuByPolicyNo(String policyNo, Pageable pageable);
    
    @Query("select rcptfs from ReceiptFaStatus rcptfs where rcptfs.receiptNo like %?1%")
    @Cacheable(value="rec2")
    Page<ReceiptFaStatus> findReceiptFaStatuByReceiptNo(String receiptNo, Pageable pageable);

    
    ReceiptFaStatus findBypolicyNo(String policyNo);   
    
//     findByreceiptNo(String Receiptno);
       
//    @Cacheable(value="rec3")
//    @Query(value = "delete from RECEIPT_STATUS where POLICY_NO=?1",nativeQuery = true)   
//    void deleteBypolicyNo(String policyNo);
    
    @Query("select rcptfs from ReceiptFaStatus rcptfs where (rcptfs.policyNo=?1 OR rcptfs.receiptNo=?1) AND ((rcptfs.policyNo like %?2%) OR (rcptfs.receiptNo like %?2%) OR (rcptfs.status like %?2%) OR (rcptfs.attemptTime like %?2%) OR (rcptfs.errorcode like %?2%) OR (rcptfs.noofattempts like %?2%)  OR (rcptfs.response like %?2%))")
    @Cacheable(value="rec4")
    Page<ReceiptFaStatus> getReceiptByReceiptNoOrPolicyNo(String policyOrreceiptNo,String searchKey,Pageable pageable);    


//  @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.status = ?1) AND (rcptfs.attemptTime between ?3 and ?4)) AND ((rcptfs.policyNo like %?2%) OR (rcptfs.receiptNo like %?2%) OR (rcptfs.status like %?2%) OR (rcptfs.attemptTime like %?2%) OR (rcptfs.errorcode like %?2%) OR (rcptfs.noofattempts like %?2%)  OR (rcptfs.response like %?2%))")
    
    @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.status like ?1%) AND (rcptfs.attemptTime between ?2 and ?3)) AND rcptfs.ProductCode=?3 AND rcptfs.fromsystem=?4")
    @Cacheable(value="rec5")
    Page<ReceiptFaStatus> getByStatusAndAttemptTimeBetween(String status,Date startDate,Date endDate,String Productcode,String System,Pageable pageable);
    
//Page<ReceiptFaStatus> findByAttemptTimeBetween(Date startDate,Date endDate,Pageable pageable);
    
  Page<ReceiptFaStatus> findByStatusAndAttemptTimeBetween(String status,Date startDate,Date endDate,Pageable pageable);
  Page<ReceiptFaStatus> findByReceiptNoOrPolicyNo(String policyno,String receiptno,Pageable pageable);

 ////////////Chart/////////////
  
  @Query(value = "select * from Receipt_Status where attempt_time like (sysdate-1) and status='SUCCESS'",nativeQuery = true)
  @Cacheable(value="rec6")
  List<Object> findAll2DaysBeforeReceiptSuccessRecords();

  @Query(value = "select * from Receipt_Status where attempt_time like (sysdate-1) and status='FAIL'",nativeQuery = true)
  @Cacheable(value="rec7")
  List<Object> findAll2DaysBeforeReceiptFailRecords();

  //@Query(value = "select * from Receipt_Status where attempt_time > attempt_time-7 and status='SUCCESS'",nativeQuery = true)
  @Query(value ="select * from Receipt_Status where attempt_time between (sysdate-8) and (sysdate-1) and status='SUCCESS'",nativeQuery = true)
  @Cacheable(value="rec8")
  List<Object> findAll1WeekBeforeReceiptSuccessRecords();

  @Query(value = "select * from Receipt_Status where attempt_time between (sysdate-8) and (sysdate-1) and status='FAIL'",nativeQuery = true)
  @Cacheable(value="rec9")
  List<Object> findAll1WeekBeforeReceiptFailRecords();

  @Query(value = "select * from Receipt_Status where attempt_time between (sysdate-32) and (sysdate-1) and status='SUCCESS'",nativeQuery = true)
  @Cacheable(value="rec10")
  List<Object> findAll1MonthBeforeReceiptSuccessRecords();

  @Query(value = "select * from Receipt_Status where attempt_time between (sysdate-32) and (sysdate-1) and status='FAIL'",nativeQuery = true)
  @Cacheable(value="rec11")
  List<Object> findAll1MonthBeforeReceiptFailRecords();

  @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.attemptTime between ?1 and ?2) and rcptfs.ProductCode=?3 and rcptfs.fromsystem=?4)")
  @Cacheable(value="rec12")
  Page<ReceiptFaStatus> findByAttemptTimeBetween(Date startDate, Date endDate,String Productcode,String system, Pageable pageable);
  
  @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.attemptTime between ?1 and ?2) and rcptfs.status=?3 and rcptfs.fromsystem=?4)")
  @Cacheable(value="rec13")
  Page<ReceiptFaStatus> findBystatus(Date startDate, Date endDate,String Status, String system, Pageable pageable);
  
  @Query("select rcptfs from ReceiptFaStatus rcptfs where (rcptfs.attemptTime between ?1 and ?2) and rcptfs.fromsystem=?3")
  @Cacheable(value="rec14")
  Page<ReceiptFaStatus> findBydatesonly(Date startDate, Date endDate,String system ,Pageable pageable);
  
  @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.attemptTime between ?1 and ?2) and (rcptfs.ProductCode=?3) and (rcptfs.Mfgname like ?4%))")
  @Cacheable(value="rec15")
  Page<ReceiptFaStatus> findByproductcodeandmfg(Date startDate, Date endDate,String ProductCode,String Mfg,Pageable pageable);
  
  @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.attemptTime between ?1 and ?2) and (rcptfs.status=?3)  and (rcptfs.Mfgname like ?4%))")
  @Cacheable(value="rec16")
  Page<ReceiptFaStatus> findByStatusandmfg(Date startDate, Date endDate,String Status,String Mfg,Pageable pageable);

  @Query("select recdata from ReceiptFaStatus recdata where ((recdata.status = ?1) AND (recdata.attemptTime between ?2 and ?3)) AND ((recdata.Mfgname like ?4%) AND (recdata.ProductCode=?5))")
  @Cacheable(value="rec17") 
  Page<ReceiptFaStatus> getByStatusAndMfg(String status, Date startdate, Date enddate, String mfgtype,String Productcode, Pageable pageable);

  @Query("select rcptfs from ReceiptFaStatus rcptfs where ((rcptfs.attemptTime between ?1 and ?2) and rcptfs.Mfgname like ?3%)")
  @Cacheable(value="rec18")
  Page<ReceiptFaStatus> findByMfgonly(Date startDate, Date endDate,String Mfg, Pageable pageable);
  

  
//  @Query(value="select * from Receipt_Status where POLICY_NO=?1" , nativeQuery = true)
//  List<ReceiptFaStatus> EappfindPolicycodes(String Policucode);
  
  
	@Modifying
	@Transactional
	@Query(value = "update RECEIPT_STATUS set RECEIPT_NO='Garbage',POLICY_NO='Garbage'  where POLICY_NO=?1",nativeQuery = true)
	Integer UpdateReceiptGarbage(String polno);
   
}
*/