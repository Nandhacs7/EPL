/*package com.rs.epl.NB.eappsrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.eapps.receiptmaster.EappsStatus;

public interface EappsStatusRepo extends JpaRepository<EappsStatus, Long> {
	
	List<EappsStatus> findByinsid(Long id);
	
	@Query(value="select * from INVALID_DATA_EAPPS where insid=?1",nativeQuery=true)
	List<EappsStatus> findinsidsecond(Long ids);
	
	EappsStatus findByreceiptno(String Receiptno);
	
	
	@Modifying
	@Transactional
	@Query(value = "update Invalid_Data_Eapps set Policy_Status='Receipt Fail' where  Policycode=?1",nativeQuery = true)
	Integer Updatesta(String pol);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update Invalid_Data_Eapps set Policy_Status=?1 where  Policycode=?2",nativeQuery = true)
	Integer Updateafterpost(String status,String pol);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update Invalid_Data_Eapps set Policy_Status='FAIL',ERRORDEATILS=?1 where  Policycode=?2",nativeQuery = true)
	Integer UpdateaForFail(String Errordesc,String pol);
	
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update Invalid_Data_Eapps set RECEIPT_STATUS=?1 where  RECEIPTNO=?2",nativeQuery = true)
	Integer UpdateafterRetry(String status,String pol);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update Invalid_Data_Eapps set POLICY_STATUS=?1 where  POLICYCODE=?2",nativeQuery = true)
	void UpdatepolicyafterRetry(String status, String policycode);
	
	@Modifying
	@Transactional
	@Query(value ="update  Insurancepolicy set Hasuploaded=1 where Policycode=?1",nativeQuery = true)
	Integer UpdateInsurancepolicy(String polno); 

}
*/