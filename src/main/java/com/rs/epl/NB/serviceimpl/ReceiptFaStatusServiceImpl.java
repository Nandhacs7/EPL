/*package com.rs.epl.NB.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rs.epl.NB.dtoresponse.DataTableDto;
import com.rs.epl.NB.dtoresponse.ReciptStatusDto;
import com.rs.epl.NB.oementity.ReceiptFaStatus;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.policyrepository.ReceiptFaStatusRepository;
import com.rs.epl.NB.service.ReceiptFaStatusService;

@Service
public class ReceiptFaStatusServiceImpl implements ReceiptFaStatusService {

	@Resource
	ReceiptFaStatusRepository receiptFaStatusRepository;

	@Resource
	PolicyRepository policyRepository;

	public DataTableDto<List<ReciptStatusDto>> getAllRecordsByStatus(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchKey) {

		Page<ReceiptFaStatus> receiptFaStatusPage = null;
		List<ReceiptFaStatus> receiptFaStatusDatas = null;
		PageRequest pageRequest = null;
		List<ReciptStatusDto> receiptStatusList = new ArrayList<ReciptStatusDto>();
		DataTableDto<List<ReciptStatusDto>> dt = new DataTableDto<List<ReciptStatusDto>>();
		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		receiptFaStatusPage = receiptFaStatusRepository.findAll(pageRequest);
		receiptFaStatusDatas = receiptFaStatusPage.getContent();
		if (receiptFaStatusDatas != null) {
			for (ReceiptFaStatus receiptStatus : receiptFaStatusDatas) {
				ReciptStatusDto ReciptStatusDto = new ReciptStatusDto();
				ReciptStatusDto = convertToReciptStatusDto(receiptStatus);
				receiptStatusList.add(ReciptStatusDto);
			}
		}
		dt.setTableValue(receiptStatusList);
		dt.setRecordsFiltered(receiptFaStatusPage.getTotalPages());
		dt.setRecordsTotal(receiptFaStatusPage.getTotalElements());
		return dt;
	}

	private ReciptStatusDto convertToReciptStatusDto(ReceiptFaStatus receiptStatus) {
		SimpleDateFormat smDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		ReciptStatusDto ReciptStatusDto = new ReciptStatusDto();
		ReciptStatusDto.setPolicyNo(receiptStatus.getPolicyNo());
		ReciptStatusDto.setReceiptNo(receiptStatus.getReceiptNo());
		ReciptStatusDto.setAttemptTime(smDateFormat.format(receiptStatus.getAttemptTime()));
		ReciptStatusDto.setPaymentId(receiptStatus.getPaymentId());
		ReciptStatusDto.setProductCode(receiptStatus.getProductCode());
		ReciptStatusDto.setPolicyId(receiptStatus.getPolicyId());
		String Status= receiptStatus.getResponse();
		try {
			int i=Status.indexOf("<errorCode>");
			int j=Status.lastIndexOf("</errorDesc>");
			String stx2=Status.substring(i, j);
			String ram=stx2.replaceAll("<.*?>", "  ").trim().replace("  " , "=>");
			ReciptStatusDto.setResponse(ram);
		} catch (Exception e) {
			
		}
		if(ReciptStatusDto.getResponse() == null){
			ReciptStatusDto.setResponse(receiptStatus.getResponse());
		}
		ReciptStatusDto.setStatus(receiptStatus.getStatus());
		ReciptStatusDto.setErrorcode(receiptStatus.getErrorcode());
		ReciptStatusDto.setNoofattempts(receiptStatus.getNoofattempts());
		ReciptStatusDto.setMfgname(receiptStatus.getMfgname());
		return ReciptStatusDto;
	}

	public DataTableDto<List<ReciptStatusDto>> searchByReceiptNoOrPaymentNo(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchvalue, String startDateStr, String endDateStr,
			String searchType) {
		Page<ReceiptFaStatus> receiptFaStatusPage = null;
		List<ReceiptFaStatus> receiptFaStatusDatas = null;
		PageRequest pageRequest = null;
		List<ReciptStatusDto> receiptStatusList = new ArrayList<ReciptStatusDto>();
		DataTableDto<List<ReciptStatusDto>> dt = new DataTableDto<List<ReciptStatusDto>>();
		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		if (!searchvalue.isEmpty()) {
			if (searchType.equalsIgnoreCase("policyno")) {
				receiptFaStatusPage = receiptFaStatusRepository.findReceiptFaStatuByPolicyNo(searchvalue, pageRequest);
			} else if (searchType.equalsIgnoreCase("receiptno")) {
				receiptFaStatusPage = receiptFaStatusRepository.findReceiptFaStatuByReceiptNo(searchvalue, pageRequest);
			}
		}
		receiptFaStatusDatas = receiptFaStatusPage.getContent();

		if (receiptFaStatusDatas != null) {
			for (ReceiptFaStatus receiptStatus : receiptFaStatusDatas) {
				ReciptStatusDto ReciptStatusDto = new ReciptStatusDto();
				ReciptStatusDto = convertToReciptStatusDto(receiptStatus);
				receiptStatusList.add(ReciptStatusDto);
			}
		}
		dt.setTableValue(receiptStatusList);
		dt.setRecordsFiltered(receiptFaStatusPage.getTotalPages());
		dt.setRecordsTotal(receiptFaStatusPage.getTotalElements());

		return dt;
	}

	public PageRequest sortingPaymentErrorData(Integer pageNumber, Integer pageSize, Integer sortColumnIndex,
			String sortOrder) {

		PageRequest pageRequest = null;

		
		 * if (sortColumnIndex == 0 && sortOrder.equals("asc")) {
		 * 
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.ASC, "id");
		 * 
		 * } else if (sortColumnIndex == 0 && sortOrder.equals("desc")) {
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.DESC, "id");
		 
		if (sortColumnIndex == 0 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policyNo");

		} else if (sortColumnIndex == 0 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policyNo");

		} else if (sortColumnIndex == 1 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "receiptNo");

		} else if (sortColumnIndex == 1 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "receiptNo");
		} else if (sortColumnIndex == 2 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "paymentId");

		} else if (sortColumnIndex == 2 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "paymentId");
		} else if (sortColumnIndex == 3 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policyId");

		} else if (sortColumnIndex == 3 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policyId");
		}
		// else if (sortColumnIndex == 4 && sortOrder.equals("asc")) {
		//
		// pageRequest = new PageRequest(pageNumber, pageSize,
		// Sort.Direction.ASC, "policyId");
		//
		// } else if (sortColumnIndex == 4 && sortOrder.equals("desc")) {
		// pageRequest = new PageRequest(pageNumber, pageSize,
		// Sort.Direction.DESC, "policyId");
		// }
		
		 * else if (sortColumnIndex == 7 && sortOrder.equals("asc")) {
		 * 
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.ASC, "attemptTime");
		 * 
		 * } else if (sortColumnIndex == 7 && sortOrder.equals("desc")) {
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.DESC, "attemptTime"); } else if (sortColumnIndex == 5
		 * && sortOrder.equals("asc")) {
		 * 
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.ASC, "response");
		 * 
		 * } else if (sortColumnIndex == 5 && sortOrder.equals("desc")) {
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.DESC, "response"); } else if (sortColumnIndex == 5 &&
		 * sortOrder.equals("asc")) {
		 * 
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.ASC, "status");
		 * 
		 * } else if (sortColumnIndex == 5 && sortOrder.equals("desc")) {
		 * pageRequest = new PageRequest(pageNumber, pageSize,
		 * Sort.Direction.DESC, "status"); }
		 
		return pageRequest;
	}

	public DataTableDto<List<ReciptStatusDto>> searchByReceiptNoOrPaymentNo(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchvalue, String startDateStr, String endDateStr,
			String searchKey, String searchType) {
		// DataTableDto<List<ReceiptFaStatus>> ReciptStatusDto = new
		// DataTableDto<>();
		DataTableDto<List<ReciptStatusDto>> dt = new DataTableDto<List<ReciptStatusDto>>();
		List<ReciptStatusDto> receiptStatusDtoList = new ArrayList<>();
		Page<ReceiptFaStatus> receiptStatusPage = null;
		List<ReceiptFaStatus> receiptStatusList = null;
		PageRequest pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		if (!searchvalue.isEmpty()) {
			if (searchType.equalsIgnoreCase("receipt")) {
				receiptStatusPage = receiptFaStatusRepository.getReceiptByReceiptNoOrPolicyNo(searchvalue,searchKey,
						pageRequest);
			}
			if (receiptStatusPage != null)
				receiptStatusList = receiptStatusPage.getContent();
			else
				System.out.println();
			if (receiptStatusList != null) {
				for (ReceiptFaStatus rfs : receiptStatusList) {
					ReciptStatusDto receiptStatusDto = new ReciptStatusDto();
					receiptStatusDto = convertToReciptStatusDto(rfs);
					receiptStatusDtoList.add(receiptStatusDto);
				}
					
			} 
		}
		dt.setTableValue(receiptStatusDtoList);
		dt.setRecordsFiltered(receiptStatusPage.getTotalPages());
		dt.setRecordsTotal(receiptStatusPage.getTotalElements());

		return dt;
	}

	////////// Getting Receipt Fail Data By Date Range
	public DataTableDto<List<ReciptStatusDto>> getReceiptDataByDateRange(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex,String searchKey, String searchValue,String sortOrder, Date startDate,
			Date endDate,String status,String Productcode,String System) {
		// DataTableDto<List<ReceiptFaStatus>> ReciptStatusDto = new
		// DataTableDto<>();
		DataTableDto<List<ReciptStatusDto>> dt = new DataTableDto<List<ReciptStatusDto>>();
		Page<ReceiptFaStatus> receiptStatusPage = null;
		List<ReceiptFaStatus> receiptStatusList = null;
		List<ReciptStatusDto> receiptDtoList = new ArrayList<ReciptStatusDto>();
		PageRequest pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);
		
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(endDate);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		endDate = cal.getTime();
		
		if(((Productcode !="null" || Productcode!="All") && Productcode.length()>0) && ("null".equalsIgnoreCase(status) && "All".equalsIgnoreCase(status))){			
			receiptStatusPage = receiptFaStatusRepository.findByAttemptTimeBetween(startDate,endDate,Productcode,System,pageRequest);			
		}
		else if(("null".equalsIgnoreCase(Productcode) || "All".equalsIgnoreCase(Productcode) || Productcode.length() ==0 )){
			if(null!=status && !"null".equalsIgnoreCase(status) && !"ALL".equalsIgnoreCase(status)){
				receiptStatusPage=receiptFaStatusRepository.findBystatus(startDate,endDate,status,System,pageRequest);				
			}
			else{
				receiptStatusPage=receiptFaStatusRepository.findBydatesonly(startDate,endDate,System,pageRequest);
			}
		}
		else{			
			receiptStatusPage = receiptFaStatusRepository.getByStatusAndAttemptTimeBetween(status,startDate,endDate,Productcode, System,pageRequest);			
		}
		receiptStatusList = receiptStatusPage.getContent();
		if (receiptStatusList != null) {
			for (ReceiptFaStatus receiptEntity : receiptStatusList) {
				ReciptStatusDto receiptDto = new ReciptStatusDto();
				receiptDto = convertToReciptStatusDto(receiptEntity);
				receiptDtoList.add(receiptDto);
			}
		}
		dt.setTableValue(receiptDtoList);
		dt.setRecordsFiltered(receiptStatusPage.getTotalPages());
		dt.setRecordsTotal(receiptStatusPage.getTotalElements());
		return dt;
	}

	@Override
	public DataTableDto<List<ReciptStatusDto>> getReceiptDataByDateRangeAndMfg(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, Date startdate, Date enddate, String status, String mfgtype,String Productcode) {
		
		
		DataTableDto<List<ReciptStatusDto>> dt = new DataTableDto<List<ReciptStatusDto>>();
		Page<ReceiptFaStatus> receiptStatusPage = null;
		List<ReceiptFaStatus> receiptStatusList = null;
		List<ReciptStatusDto> receiptDtoList = new ArrayList<ReciptStatusDto>();
		PageRequest pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);
		
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(enddate);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		enddate = cal.getTime();
		
		if(((Productcode !="null" || Productcode!="All") && Productcode.length()>0) && ("null".equalsIgnoreCase(status) && "All".equalsIgnoreCase(status))){			
			receiptStatusPage = receiptFaStatusRepository.findByproductcodeandmfg(startdate,enddate,Productcode,mfgtype,pageRequest);			
		}
		else if(("null".equalsIgnoreCase(Productcode) || "All".equalsIgnoreCase(Productcode) || Productcode.length() ==0 )){
			if(null!=status && !"null".equalsIgnoreCase(status) && !"ALL".equalsIgnoreCase(status)){
				receiptStatusPage=receiptFaStatusRepository.findByStatusandmfg(startdate,enddate,status,mfgtype,pageRequest);				
			}
			else{
				receiptStatusPage = receiptFaStatusRepository.findByMfgonly(startdate,enddate,mfgtype,pageRequest);
			}
		}		
		else{
			receiptStatusPage = receiptFaStatusRepository.getByStatusAndMfg(status,startdate,enddate, mfgtype,Productcode,pageRequest);						
		}

		receiptStatusList = receiptStatusPage.getContent();
		if (receiptStatusList != null) {
			for (ReceiptFaStatus receiptEntity : receiptStatusList) {
				ReciptStatusDto receiptDto = new ReciptStatusDto();
				receiptDto = convertToReciptStatusDto(receiptEntity);
				receiptDtoList.add(receiptDto);
			}
		}
		dt.setTableValue(receiptDtoList);
		dt.setRecordsFiltered(receiptStatusPage.getTotalPages());
		dt.setRecordsTotal(receiptStatusPage.getTotalElements());
		return dt;		
	}
}
*/