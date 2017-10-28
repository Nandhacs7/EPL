/*package com.rs.epl.NB.policyrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rs.epl.NB.oementity.EappReceipt;

public interface EappReceiptRepo extends JpaRepository<EappReceipt, String> {
	
	 EappReceipt findByreceiptNo(String Receiptno);
	 
	 
	    
		@Modifying
		@Transactional
		@Query(value = "update RECEIPT_STATUS set Noofattempts=?1 where RECEIPT_NO=?2",nativeQuery = true)
		Integer Updaterec(int no,String recno); 
		
		
		
	//  @Query("select rcptfs from ReceiptFaStatus rcptfs where rcptfs.policyNo=?1")
		  @Query(value="select * from Receipt_Status where Policy_No=?1" ,nativeQuery=true)
		  List<EappReceipt>  EappReceipts(String polno);
		  
		  
			@Modifying
			@Transactional
			@Query(value = "update RECEIPT_STATUS set RECEIPT_NO='Garbage',POLICY_NO='Garbage'  where RECEIPT_NO=?1",nativeQuery = true)
			Integer UpdateReceiptGarbage(String recno);

}
*/