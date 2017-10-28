package com.rs.epl.NB.policyrepository;


import java.util.Date;
//import java.math.BigDecimal;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fa.component.policy.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

	
	@Query(value="select polid from Policy",nativeQuery = true)
	@Cacheable(value="policy1")
	public List<Long> findallpolids();
	
	@Cacheable(value="policy2")
//	@Query(value="select * from Policy where polno=?1 and Createduser is null",nativeQuery = true)
	public Policy findBypolno(String polno);
	
/*	@Query(value="delete FROM POLICY_STATUS where POLNO=?1")
	public void deleteBypolno(String polno);*/

//	@Query(value="delete from Policy where polno=?1")
	@Query(value = "delete from POLICY where polno=?1",nativeQuery = true)
	@Cacheable(value="policy3")
	public void deleteBypolno(String polno);
	
	
	
	@Modifying
	@Transactional
	@Query(value ="update policy pol set Pol.Createduser=Pol.Polno,Pol.Polno='Garbage' where polno=?1",nativeQuery = true)
	Integer UpdateGarbage(String polno); 
	
	
	
	@Modifying
	@Transactional
	@Query(value ="update Epl_Flag set flag=?1",nativeQuery = true)
	Integer Updateflag(String flag); 
	
	
	@Query(value ="select flag from Epl_Flag",nativeQuery = true)
	String readflag(); 
	
	@Query(value="select updateflag from Epl_Flag",nativeQuery = true)
	String readupdateflag();
	
	@Modifying
	@Transactional
	@Query(value="update Epl_Flag set Updateflag=?1",nativeQuery = true)
	void changeupdateflag(String upflag);

	
	@Modifying
	@Transactional
	@Query(value ="update policy pol set Pol.Createduser=Pol.Polno,Pol.Polno='Garbage' where polno in (select eplst.POLICYNO from EPL_STATUS eplst where eplst.POLICY_STATUS='FAIL' or eplst.POLICY_STATUS='Invalid Request')",nativeQuery = true)
	void UpdateGarbagepolicy(); 
	
	@Modifying
	@Transactional
	@Query(value ="update EPL_STATUS st  set st.GARBAGEDETAILS=(st.POLICYNO||'==>'||st.RECEIPTNO) , st.POLICYNO='Garbage' , st.RECEIPTNO='Garbage' where st.POLICYNO in (select eplst.POLICYNO from EPL_STATUS eplst where eplst.POLICY_STATUS='FAIL' or eplst.POLICY_STATUS='Invalid Request')",nativeQuery = true)
	void UpdateGarbagestatus(); 
	
	
	
	@Modifying
	@Transactional
	@Query(value ="update EPL_STATUS st set st.POLICY_STATUS='SUCCESS',"
			+ " st.POLICY_REQUESTXML=?1 ,st.POLICY_ATTEMPT_TIME=?2 , st.POLICY_RESPONSEXML='N/A',st.POLICY_ERRORDETAILS='N/A' where st.POLICYNO=?3",nativeQuery = true)
	void Updatesuccess(String stx5, Date date,String string4);

	
	@Modifying
	@Transactional
	@Query(value ="update EPL_STATUS st set st.POLICY_STATUS='FAIL',st.POLICY_ATTEMPT_TIME=SYSDATE,st.POLICY_REQUESTXML=?1, st.POLICY_RESPONSEXML=?2 ,st.POLICY_ERRORDETAILS=?3 where st.POLICYNO=?4",nativeQuery = true)
	public void Updatefail(String Request,String respXML, String string, String polno); 
	
	
}
