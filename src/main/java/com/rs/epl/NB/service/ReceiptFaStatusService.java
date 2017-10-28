/*package com.rs.epl.NB.service;

import java.util.Date;
import java.util.List;

import com.rs.epl.NB.dtoresponse.DataTableDto;
import com.rs.epl.NB.dtoresponse.ReciptStatusDto;

public interface ReceiptFaStatusService {
    DataTableDto<List<ReciptStatusDto>> getAllRecordsByStatus(Integer pageNumber, Integer pageSize, Integer sortColumnIndex,
			String sortOrder, String searchKey);
	
    DataTableDto<List<ReciptStatusDto>> searchByReceiptNoOrPaymentNo(Integer pageNumber,Integer pageSize,Integer
            orderColumn,String  sortOrder,String  searchValue,String  startDate,String  endDate
                ,String searchType);
	
    DataTableDto<List<ReciptStatusDto>> searchByReceiptNoOrPaymentNo(Integer pageNumber,Integer pageSize,Integer
            orderColumn,String  sortOrder,String  searchValue,String  startDate,String  endDate,String searchKey
                ,String searchType);
    
    DataTableDto<List<ReciptStatusDto>> getByReceiptNoOrPaymentNo(Integer pageNumber,Integer pageSize,Integer
            orderColumn,String  sortOrder,String  searchValue,String  startDate,String  endDate,String searchKey
                ,String searchType);
    
    
    DataTableDto<List<ReciptStatusDto>> getReceiptDataByDateRange(Integer pageNumber, Integer pageSize,
            Integer sortColumnIndex, String sortOrder,String searchKey,String searchValue,Date startDate, Date endDate,String status,String Productcode, String system);

	DataTableDto<List<ReciptStatusDto>> getReceiptDataByDateRangeAndMfg(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, Date startdate, Date enddate, String status, String mfgtype,String Productcode);
    
}
*/