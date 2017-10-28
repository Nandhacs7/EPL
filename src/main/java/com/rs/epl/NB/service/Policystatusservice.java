
package com.rs.epl.NB.service;

import java.util.Date;
import java.util.List;

import com.rs.epl.NB.dtoresponse.DataTableDto;
import com.rs.epl.NB.dtoresponse.StatusDto;


public interface Policystatusservice {

	DataTableDto<List<StatusDto>> getPolicyByPolicyOrReceiptNo(Integer pageNumber, Integer pageSize, int parseInt,
			String sortOrder, String searchKey, String searchValue) throws InterruptedException;

	DataTableDto<List<StatusDto>> getDatabyDaterange(Integer pageNumber, Integer pageSize, Integer sortColumnIndex,
			String sortOrder, String searchKey, Date startdate, Date enddate, String status, String productdcode,
			String system, String mfg) throws InterruptedException;

}
