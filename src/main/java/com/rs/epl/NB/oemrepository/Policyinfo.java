package com.rs.epl.NB.oemrepository;

//import java.util.HashMap;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.TtrnPolicy;
@Repository
@Transactional
public interface Policyinfo extends JpaRepository<TtrnPolicy, String> {
/*	@Query(value ="select * from (select t1.*,ROW_NUMBER() OVER (ORDER BY XGEN_POLICYNO desc)rn from TTRN_POLICY t1)where rn=?1",nativeQuery = true)
	public TtrnPolicy findRow(long m);*/
	
//	@Query(value="select POLICYNO FROM TTRN_POLICY_INFO where productcode='VPC' and RECEIPT_WEB_SERVICE is null and policyno  like 'FOP%'",nativeQuery = true)
//	@Query(value="select policyno from TTRN_POLICY_INFO where batchid in ('14462','14496','14370','14507','14506') and (WEBSERVICE_STATUS is null or RECEIPT_WEB_SERVICE is null) and productcode='VPC'",nativeQuery = true)
//	@Query(value="select policyno from TTRN_policy_INFO where xgen_policyno in('TAP1019635','TAP1019641','TAP1019863','TAP1019866','TAP1019868','TAP1020888','TAP1020889','TAP1020891','TAP1020896','TAP1020898','TAP1020886')",nativeQuery = true)
//	@Query(value="select policyno from TTRN_POLICY_INFO where POLICYNO in ('MIP1000007','MIP1000010','MMQ1000031','MMQ1000024','MMQ1000030','MMQ1000035','MMQ1000033','MMP1000013','MMQ1000032')",nativeQuery = true)
//	@Query(value="select policyno from TTRN_POLICY_INFO where batchid in ('13879') and (WEBSERVICE_STATUS is null or RECEIPT_WEB_SERVICE is null) and productcode='VOC'",nativeQuery = true)
//	@Query(value="select POLICYNO from TTRN_POLICY_INFO where productcode='VOC' and (RECEIPT_WEB_SERVICE is null or WEBSERVICE_STATUS is null)",nativeQuery = true)
//	@Query(value="select POLICYNO from TTRN_POLICY_INFO where productcode='VPCV' and policyno='MOQ1121164'",nativeQuery = true)
//	@Query(value="select policyno from TTRN_POLICY_INFO where batchid in ('13882') and (WEBSERVICE_STATUS is null or RECEIPT_WEB_SERVICE is null) and productcode='VPCV'",nativeQuery = true)
//	@Query(value="select POLICYNO from TTRN_POLICY_INFO where POLICYNO='MOP4360631'",nativeQuery = true)
//	@Query(value="select POLICYNO from TTRN_POLICY_INFO where RECEIPT_WEB_SERVICE is null or WEBSERVICE_STATUS is null or MASTERUPDATE is null",nativeQuery = true)
//	@Query(value="select POLICYNO from TTRN_POLICY_INFO where WEBSERVICE_STATUS IN('N','RETRY') or RECEIPT_WEB_SERVICE in('N','RETRY') or MASTERUPDATE IN('N','RETRY')",nativeQuery = true)
//	@Query(value="select  POLICYNO from TTRN_POLICY_INFO where (WEBSERVICE_STATUS is null or RECEIPT_WEB_SERVICE is null or MASTERUPDATE is null) and XGEN_PRODUCTID in(5,6,7,8,9)",nativeQuery = true)
	
//	@Query(value="select  POLICYNO from TTRN_POLICY_INFO,Epl_Flag where ((WEBSERVICE_STATUS='RETRY'or WEBSERVICE_STATUS is null) or (RECEIPT_WEB_SERVICE='RETRY' or RECEIPT_WEB_SERVICE is null) or (MASTERUPDATE='RETRY' or MASTERUPDATE is null))and XGEN_PRODUCTID in(1,2,5,6,7,8,9,11,15,16,17,18,19,25,32,33,34,35,36,20,21,22,23,24) and not exists (select 'x' from Epl_Server where Epl_Server.Policyno=Ttrn_Policy_Info.Policyno and Epl_Server.Uploadstatus is  not null) and rownum<=300 and Epl_Flag.Flag='true'",nativeQuery = true)
//	@Query(value="select  Policyno from TTRN_POLICY_INFO where  (WEBSERVICE_STATUS='RETRY' and   RECEIPT_WEB_SERVICE='RETRY' and  MASTERUPDATE='RETRY') and XGEN_PRODUCTID in(1,2,5,6,7,8,9,11,15,16,17,18,19,25,32,33,34,35,36,20,21,22,23,24)", nativeQuery = true)
//	@Query(value="select  POLICYNO from TTRN_POLICY_INFO where ((WEBSERVICE_STATUS='RETRY'or WEBSERVICE_STATUS is null) or (RECEIPT_WEB_SERVICE='RETRY' or RECEIPT_WEB_SERVICE is null) or (MASTERUPDATE='RETRY' or MASTERUPDATE is null))and XGEN_PRODUCTID in(1,2,5,6,7,8,9,11,15,16,17,18,19,25,32,33,34,35,36,20,21,22,23,24)", nativeQuery = true)
	
	@Query(value="select  POLICYNO from TTRN_POLICY_INFO where (WEBSERVICE_STATUS='RETRY' or RECEIPT_WEB_SERVICE='RETRY' or MASTERUPDATE='RETRY') and (pickupserver='INMCHN284' or pickupserver='INMCHN118') and Endorsement_No=000 and Endorsement_Type=00 and Xgen_Productid in (select inm.Product_Id from Inmchn118 inm where inm.Flag_Value='true')", nativeQuery = true)
	@Cacheable(value="orm1")
	public List<String> FindRetryPolicyno();
	
	
	
	@Query(value="select  POLICYNO from TTRN_POLICY_INFO where (WEBSERVICE_STATUS is null or RECEIPT_WEB_SERVICE is null or MASTERUPDATE is null) and (pickupserver='INMCHN284' or pickupserver='INMCHN118') and Endorsement_No=000 and Endorsement_Type=00 and Xgen_Productid in (select inm.Product_Id from Inmchn118 inm where inm.Flag_Value='true')", nativeQuery = true)
	@Cacheable(value="orm1")
	public List<String> FindFreshpolicy();
	
	
//select  POLICYNO from TTRN_POLICY_INFO where ((WEBSERVICE_STATUS='RETRY'or WEBSERVICE_STATUS is null) or (RECEIPT_WEB_SERVICE='RETRY' or RECEIPT_WEB_SERVICE is null) or (MASTERUPDATE='RETRY' or MASTERUPDATE is null))and (Pickupserver='INMCHN284') and  XGEN_PRODUCTID in(select Product_Id From Inmchn284 where Flag_Value='true')
//select  POLICYNO from TTRN_POLICY_INFO where ((WEBSERVICE_STATUS='RETRY'or WEBSERVICE_STATUS is null) or (RECEIPT_WEB_SERVICE='RETRY' or RECEIPT_WEB_SERVICE is null) or (MASTERUPDATE='RETRY' or MASTERUPDATE is null)) and (pickupserver='INMCHN284' or pickupserver='INMCHN118') and Endorsement_No=000 and Endorsement_Type=00 and Xgen_Productid in (select inm.Product_Id from Inmchn118 inm where inm.Flag_Value='true')	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set Pickupserver='INMCHN284' where Pickupserver is null and Rownum<=?1", nativeQuery = true)
	Integer Updateinmchn284(int no);
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set Pickupserver='INMCHN118' where Pickupserver is null and Rownum<=?1", nativeQuery = true)
	Integer Updateinmchn118(int no);

	@Query(value="select count(*) from Ttrn_Policy_Info where Pickupserver is null",nativeQuery = true)
	int readfreshpolicy();
	
	@Modifying
	@Transactional
	@Cacheable(value="orm2")
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE=?1,ERRORDESC=?2,RECEIPT_REQUEST_TIME=?3,WEBSERVICE_STATUS=?4,MASTERUPDATE=?5 where POLICYNO=?6", nativeQuery = true)
	Integer Upatestatus(String status,String errdsc,String requestdate,String polstatus,String master,String polno);
	
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm2")
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE=?1,ERRORDESC=?2,RECEIPT_REQUEST_TIME=?3,WEBSERVICE_STATUS=?4,Masterupdate=?5 where POLICYNO=?6", nativeQuery = true)
	Integer UpdateForException(String status,String errdsc,String requestdate,String polstatus,String master,String polno);
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm8")
	@Query(value="update Ttrn_Policy_Info Set WEBSERVICE_STATUS=?1,ERRORDESC=?2,MASTERUPDATE=?3 where POLICYNO=?4", nativeQuery = true)
	Integer UpateForPolicy(String status,String errdsc,String master,String polno);

	@Modifying
	@Transactional
	@Cacheable(value="orm9")
	@Query(value="update Ttrn_Policy_Info Set WEBSERVICE_STATUS=?1,ERRORDESC=?2,MASTERUPDATE=?3,SETTLEMENT_TYPE='EXISTINGRECT',NEWCLIENT='N' where POLICYNO=?4", nativeQuery = true)
	Integer UpateForFailedPolicy(String status,String errdsc,String master,String polno);
	

	
	@Modifying
	@Transactional
	@Cacheable(value="orm10")
	@Query(value="update TTRN_MARUTI_NEWRENEWAL Set XGEN_DOWNLOAD_STATUS='D' where policyno=?1", nativeQuery = true)
	Integer MasterMaruti(String polno);
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm11")
	@Query(value="update TTRN_TATA_NEW Set XGEN_DOWNLOAD_STATUS='D' where policyno=?1", nativeQuery = true)
	Integer MasterTata(String polno);
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm12")
	@Query(value="update TTRN_NEWRENEWAL Set XGEN_DOWNLOAD_STATUS='D' where policyno=?1", nativeQuery = true)
	Integer MasterHonda(String polno);
	
	
	
	@Modifying
	@Transactional
	@Query(value="update TTRN_ADITYA_NEWRENEWAL Set XGEN_DOWNLOAD_STATUS='D' where POLICY_NO=?", nativeQuery = true)
	Integer MasterAbibl(String polno);
	
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm13")
	@Query(value="update TTRN_FORD_NEWRENEWAL Set XGEN_DOWNLOAD_STATUS='D' where where policyno=?1", nativeQuery = true)
	Integer MasterFord(String polno);
	
	
	
	@Modifying
	@Transactional
	@Query(value="update TTRN_MIBL_NEWRENEWAL Set XGEN_DOWNLOAD_STATUS='D' where policyno=?1", nativeQuery = true)
	Integer MasterMahindra(String polno);
	
	
	
  
	
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set MASTERUPDATE='Y' where policyno=?1", nativeQuery = true)
	Integer OnlyMasterUpdate(String polno);
	
	
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE='RETRY' where RECEIPT_WEB_SERVICE='FAIL' and productcode=?1", nativeQuery = true)
	Integer Receiptretry(String product);
	
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set WEBSERVICE_STATUS='RETRY' where WEBSERVICE_STATUS='FAIL' and productcode=?1", nativeQuery = true)
	Integer Policyretry(String product);

	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set WEBSERVICE_STATUS='RETRY',RECEIPT_WEB_SERVICE='RETRY' where (WEBSERVICE_STATUS='FAIL' or RECEIPT_WEB_SERVICE='FAIL') and productcode=?1", nativeQuery = true)
	Integer Productretry(String product);
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE='RETRY' where RECEIPT_WEB_SERVICE='FAIL' ", nativeQuery = true)
	Integer RetryAllReceipt();

	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set WEBSERVICE_STATUS='RETRY' where WEBSERVICE_STATUS='FAIL' ", nativeQuery = true)
	Integer RetryAllPolicy();
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE='RETRY',WEBSERVICE_STATUS='RETRY' where RECEIPT_WEB_SERVICE='FAIL' or WEBSERVICE_STATUS='FAIL'", nativeQuery = true)
	Integer RetryAll();
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE='RETRY' where RECEIPT_WEB_SERVICE='Retry With Valid Data' and productcode=?1", nativeQuery = true)
	Integer Receiptretryivalidrec_product(String product);
	
	@Modifying
	@Transactional
	@Query(value="update Ttrn_Policy_Info Set RECEIPT_WEB_SERVICE='RETRY' where RECEIPT_WEB_SERVICE='Retry With Valid Data'", nativeQuery = true)
	Integer Receiptretryinvalid();
	
	@Modifying
	@Transactional
	@Cacheable(value="orm10")
	@Query(value="update TTRN_MARUTI_NEWRENEWAL Set SETTLEMENT_TYPE='EXISTINGRECT' where policyno=?1", nativeQuery = true)
	Integer MasterMarutiFail(String polno);
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm11")
	@Query(value="update TTRN_TATA_NEW Set SETTLEMENT_TYPE='EXISTINGRECT' where policyno=?1", nativeQuery = true)
	Integer MasterTataFail(String polno);
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm12")
	@Query(value="update TTRN_NEWRENEWAL Set SETTLEMENT_TYPE='EXISTINGRECT' where policyno=?1", nativeQuery = true)
	Integer MasterHondaFail(String polno);
	
	
	
	@Modifying
	@Transactional
	@Query(value="update TTRN_ADITYA_NEWRENEWAL Set SETTLEMENT_TYPE='EXISTINGRECT' where POLICY_NO=?", nativeQuery = true)
	Integer MasterAbiblFail(String polno);
	
	
	
	@Modifying
	@Transactional
	@Cacheable(value="orm13")
	@Query(value="update TTRN_FORD_NEWRENEWAL Set SETTLEMENT_TYPE='EXISTINGRECT' where where policyno=?1", nativeQuery = true)
	Integer MasterFordFail(String polno);
	
	
	
	@Modifying
	@Transactional
	@Query(value="update TTRN_MIBL_NEWRENEWAL Set SETTLEMENT_TYPE='EXISTINGRECT' where policyno=?1", nativeQuery = true)
	Integer MasterMahindraFail(String polno);


	

	@Query(value="select ERRORDESC from Ttrn_Policy_Info where POLICYNO=?1", nativeQuery = true)
	String selecterr(String polno);
	
	
//UPDATEPICKUPSERVER(?1)
//update TTRN_POLICY_INFO set PickupServer='INMCHN284' where PickupServer is null and Rownum<200 and XGEN_PRODUCTID in(select Product_Id From Inmchn284 where Flag_Value='true')
	
//	@Modifying
//	@Transactional
//	@Query("update TtrnPolicy set PickupServer='INMCHN284' where policyno=?1")
//	Integer Updatepolicy(String polno); 
	
//	@Query(value="select POLICYNO from TTRN_POLICY_INFO where RECEIPT_WEB_SERVICE=\"SUCCESS\"")
//	public List<String> UpdateForMasters();
	
//or MASTERUPDATE is null 	
//	@Query(value="select distinct product_id,mfr_code from tmas_product prod, manufacture_master mm where prod.mfr_id=mm.mfr_id",nativeQuery = true)
//	public Map<Integer,String> ProdIDAndCode();
	
//	@Query(value="select mfr_code,mfr_name from manufacture_master",nativeQuery = true)
//	@Query(value="select mfr_code as mfrt,mfr_name as mfrs from manufacture_master",nativeQuery = true)
//	public Map<String,String> CodeandName();
	
	
//	@Query(value ="select distinct xm.product_id,mfr_code,mfr_name from tmas_xgen_master xm inner join tmas_manufacture_master mm on (mm.mfr_id=xm.mfr_id)order by 2" , nativeQuery = true)
//	@Cacheable(value="orm2")
//	public List<Object> GrpupByMfg();	
/*	@Query(value="select pol.policyno, case when ford.xgen_policyno=pol.policyno then 'FORD' else case when ren.xgen_policyno=pol.policyno then 'RENAULT' else 'OTHERS' end end as partner from ttrn_policy_info pol left outer join ttrn_inscovered_ford_vpc ford on(ford.xgen_policyno=pol.xgen_policyno) left outer join ttrn_inscovered_renault_vpc ren on(ren.xgen_policyno=pol.xgen_policyno) where productcode='VPC' and (pol.webservice_status is null or receipt_web_service is null)",nativeQuery = true)
	public Map<String,String> GroupByPolicyno();*/
}
//POLFGSTATUS is null and
//	@Query(value="select POLICYNO from TTRN_POLICY where substr(policyno,0,3)='HOD' and (POLFGSTATUS is null or RECFGSTATUS is null)",nativeQuery = true)
//	@Query(value="select POLICYNO from TTRN_POLICY where policyno='TAT1017139'",nativeQuery = true)


//select pol.policyno, case when ford.xgen_policyno=pol.policyno then 'FORD' else 
//case when ren.xgen_policyno=pol.policyno then 'RENAULT' else 'OTHERS' end end as partner
//from ttrn_policy_info pol
//left outer join ttrn_inscovered_ford_vpc ford on(ford.xgen_policyno=pol.xgen_policyno)
//left outer join ttrn_inscovered_renault_vpc ren on(ren.xgen_policyno=pol.xgen_policyno)
//where productcode='VPC' and (pol.webservice_status is null or receipt_web_service is null);