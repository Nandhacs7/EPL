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
import com.rs.epl.NB.dtoresponse.PolicyerrorDataDto;
import com.rs.epl.NB.oementity.PolicyerrorData;
import com.rs.epl.NB.policyrepository.PolicyErrorDataRepository;
import com.rs.epl.NB.service.PolicyErrorDataService;

@Service
public class PolicyErrorDataServiceImpl implements PolicyErrorDataService {

	@Resource
	PolicyErrorDataRepository policyErrorDataRepository;

	@Override
	public DataTableDto<List<PolicyerrorDataDto>> getAllPolicyData(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder) {
		DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDtos = new DataTableDto<>();

		Page<PolicyerrorData> policyErrorDataPage = null;
		List<PolicyerrorData> policyErrorDataList = null;
		List<PolicyerrorDataDto> policyErrorDataDtoList = new ArrayList<>();
		PageRequest pageRequest = null;
		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		policyErrorDataPage = policyErrorDataRepository.findAll(pageRequest);
		policyErrorDataList = policyErrorDataPage.getContent();
		if (policyErrorDataList != null) {
			for (PolicyerrorData policyErrorData : policyErrorDataList) {
				PolicyerrorDataDto policyErrorDataDto = new PolicyerrorDataDto();
				policyErrorDataDto = convertToPolicyErrorDataDto(policyErrorData);
				policyErrorDataDtoList.add(policyErrorDataDto);
			}
		}

		policyErrorDataDtos.setTableValue(policyErrorDataDtoList);
		policyErrorDataDtos.setRecordsFiltered(policyErrorDataPage.getTotalPages());
		policyErrorDataDtos.setRecordsTotal(policyErrorDataPage.getTotalElements());

		return policyErrorDataDtos;
	}

	public DataTableDto<List<PolicyerrorDataDto>> getPolicyFailData(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder) {
		DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDtos = new DataTableDto<>();

		Page<PolicyerrorData> policyErrorDataPage = null;
		List<PolicyerrorData> policyErrorDataList = null;
		List<PolicyerrorDataDto> policyErrorDataDtoList = new ArrayList<>();
		PageRequest pageRequest = null;
		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		policyErrorDataPage = policyErrorDataRepository.findByStatus("FAIL", pageRequest);
		policyErrorDataList = policyErrorDataPage.getContent();
		if (policyErrorDataList != null) {
			for (PolicyerrorData policyErrorData : policyErrorDataList) {
				PolicyerrorDataDto policyErrorDataDto = new PolicyerrorDataDto();
				policyErrorDataDto = convertToPolicyErrorDataDto(policyErrorData);
				policyErrorDataDtoList.add(policyErrorDataDto);
			}
		}

		policyErrorDataDtos.setTableValue(policyErrorDataDtoList);
		policyErrorDataDtos.setRecordsFiltered(policyErrorDataPage.getTotalPages());
		policyErrorDataDtos.setRecordsTotal(policyErrorDataPage.getTotalElements());

		return policyErrorDataDtos;
	}

	/////////////// Getting Policy Fail Data By Date Range
	public DataTableDto<List<PolicyerrorDataDto>> getPolicyFailDataByDateRange(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchKey, Date startDate, Date endDate,String status,String Productcode,String system) {
		DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDtos = new DataTableDto<>();

		Page<PolicyerrorData> policyErrorDataPage = null;
		List<PolicyerrorData> policyErrorDataList = null;
		List<PolicyerrorDataDto> policyErrorDataDtoList = new ArrayList<>();
		PageRequest pageRequest = null;
		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		Calendar cal=Calendar.getInstance();
		cal.setTime(endDate);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		endDate = cal.getTime();
		if(((Productcode !="null" || Productcode!="All") && Productcode.length()>0) && ("null".equalsIgnoreCase(status) && "All".equalsIgnoreCase(status))){
			policyErrorDataPage = policyErrorDataRepository.getByTypeAndAttempttimeBetween(startDate,endDate,Productcode,pageRequest, system);
		}
		else if(("null".equalsIgnoreCase(Productcode) || "All".equalsIgnoreCase(Productcode) || Productcode.length() ==0 )){
			if(null!=status && !"null".equalsIgnoreCase(status) && !"ALL".equalsIgnoreCase(status)){
				policyErrorDataPage=policyErrorDataRepository.getByTypeAndAttempttimeandStatus(startDate,endDate,status,pageRequest,system);				
			}
			else{
				policyErrorDataPage=policyErrorDataRepository.getBydateonly(startDate,endDate,pageRequest,system);				
			}
			
		}
		else{
			policyErrorDataPage = policyErrorDataRepository.getByStatusAndAttempttimeBetween(status,startDate,
					endDate,Productcode,pageRequest,system);	
		}
		policyErrorDataList = policyErrorDataPage.getContent();
		if (policyErrorDataList != null) {
			for (PolicyerrorData policyErrorData : policyErrorDataList) {
				PolicyerrorDataDto policyErrorDataDto = new PolicyerrorDataDto();
				policyErrorDataDto = convertToPolicyErrorDataDto(policyErrorData);
				policyErrorDataDtoList.add(policyErrorDataDto);
			}
		}

		policyErrorDataDtos.setTableValue(policyErrorDataDtoList);
		policyErrorDataDtos.setRecordsFiltered(policyErrorDataPage.getTotalPages());
		policyErrorDataDtos.setRecordsTotal(policyErrorDataPage.getTotalElements());

		return policyErrorDataDtos;
	}

	public DataTableDto<List<PolicyerrorDataDto>> getPolicyByPolicyOrReceiptNo(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchKey, String searchtype, String searchvalue) {
		DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDto = new DataTableDto<>();
		List<PolicyerrorDataDto> policyErrorDataDtoList = new ArrayList<>();
		List<PolicyerrorData> policyErrorDataList = null;
		PageRequest policyErrorDataPageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex,
				sortOrder);
		
		Page<PolicyerrorData> policyErrorDataPage = policyErrorDataRepository.getByPolicynoOrReciptno(searchvalue,
				searchKey, policyErrorDataPageRequest);
		policyErrorDataList = policyErrorDataPage.getContent();
		// if(searchtype!=null && searchtype.equalsIgnoreCase("policy")) {
		// }
		if (policyErrorDataList != null) {
			for (PolicyerrorData policyErrorData : policyErrorDataList) {
				PolicyerrorDataDto polerrordto = new PolicyerrorDataDto();
				polerrordto = convertToPolicyErrorDataDto(policyErrorData);
				policyErrorDataDtoList.add(polerrordto);
			}
			policyErrorDataDto.setTableValue(policyErrorDataDtoList);
			policyErrorDataDto.setRecordsFiltered(policyErrorDataPage.getTotalPages());
			policyErrorDataDto.setRecordsTotal(policyErrorDataPage.getTotalElements());

		}
		return policyErrorDataDto;
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

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policyno");

		} else if (sortColumnIndex == 0 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policyno");

		} else if (sortColumnIndex == 1 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "reciptno");

		} else if (sortColumnIndex == 1 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "reciptno");
		} else if (sortColumnIndex == 2 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policyid");

		} else if (sortColumnIndex == 2 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policyid");
		} else if (sortColumnIndex == 3 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "reciptid");

		} else if (sortColumnIndex == 3 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "reciptid");
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

	public PolicyerrorDataDto convertToPolicyErrorDataDto(PolicyerrorData policyerrorData) {
		SimpleDateFormat smDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		PolicyerrorDataDto policyerrorDataDto = new PolicyerrorDataDto();
		policyerrorDataDto.setPolicyno(policyerrorData.getPolicyno());
		policyerrorDataDto.setReciptno(policyerrorData.getReciptno());
		policyerrorDataDto.setPolicyid(policyerrorData.getPolicyid());
		policyerrorDataDto.setReciptid(policyerrorData.getReciptid());
		policyerrorDataDto.setStatus(policyerrorData.getStatus());
		policyerrorDataDto.setProductCode(policyerrorData.getProductCode());
		policyerrorDataDto.setAttempt(policyerrorData.getAttempt());
		policyerrorDataDto.setErrorcode(policyerrorData.getErrorcode());
		String Status= policyerrorData.getResponsexml();
		try{
			if(Status.contains("E_FICUW_AUX_002")){
				policyerrorDataDto.setResponsexml("E_FICUW_AUX_002"+"=======>"+"IUWP1_BR_CD(branchcode) is invalid(Iaxmbrch)");	
			}else{
				int i=Status.indexOf("<ErrorDetail>");
				int j=Status.lastIndexOf("</ErrorDetail>");
				String stx2=Status.substring(i, j);
				String ram=stx2.replaceAll("<.*?>", "  ").trim().replace("  " , "=>").replaceAll("=>=>=>=>null=>=>null", "");
				policyerrorDataDto.setResponsexml(ram);							
			}
		}catch (Exception e) {
			
		}
		if(policyerrorDataDto.getResponsexml()== null){
			policyerrorDataDto.setResponsexml(policyerrorData.getResponsexml());	
		}
		policyerrorDataDto.setMfgname(policyerrorData.getMfgname());
		policyerrorDataDto.setAttemptTime(smDateFormat.format(policyerrorData.getAttempttime()));
		return policyerrorDataDto;
	}

	@Override
	public DataTableDto<List<PolicyerrorDataDto>> getPolicyDataByDateRangeAndMfg(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchKey, Date startdate, Date enddate, String status,
			String mfgtype,String Productcode) {
		
		DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDto = new DataTableDto<>();
		List<PolicyerrorDataDto> policyErrorDataDtoList = new ArrayList<>();
		List<PolicyerrorData> policyErrorDataList = null;
		Page<PolicyerrorData> policyErrorDataPage=null;
		PageRequest policyErrorDataPageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex,
				sortOrder);	
		Calendar cal=Calendar.getInstance();
		cal.setTime(enddate);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		enddate = cal.getTime();
		
		if(((Productcode !="null" || Productcode!="All")  && Productcode.length()>0) && ("null".equalsIgnoreCase(status) && "All".equalsIgnoreCase(status))){
			policyErrorDataPage = policyErrorDataRepository.getByMfgandProductcode(startdate,enddate,Productcode,mfgtype,policyErrorDataPageRequest);
		}
		else if(("null".equalsIgnoreCase(Productcode) || "All".equalsIgnoreCase(Productcode) || Productcode.length() ==0) ){
			if(null!=status && !"null".equalsIgnoreCase(status) && !"ALL".equalsIgnoreCase(status)){
				policyErrorDataPage=policyErrorDataRepository.getByMfgandStatus(startdate,enddate,status,mfgtype,policyErrorDataPageRequest);
			}else{
				policyErrorDataPage = policyErrorDataRepository.getbymfgonly(startdate,enddate,mfgtype,policyErrorDataPageRequest);
			}
						
		}else{
			policyErrorDataPage = policyErrorDataRepository.getByMfgAndStatus(status,startdate,enddate,mfgtype,Productcode,policyErrorDataPageRequest);			
		}
		policyErrorDataList = policyErrorDataPage.getContent();
		// if(searchtype!=null && searchtype.equalsIgnoreCase("policy")) {
		// }
		if (policyErrorDataList != null) {
			for (PolicyerrorData policyErrorData : policyErrorDataList) {
				PolicyerrorDataDto polerrordto = new PolicyerrorDataDto();
				polerrordto = convertToPolicyErrorDataDto(policyErrorData);
				policyErrorDataDtoList.add(polerrordto);
			}
			policyErrorDataDto.setTableValue(policyErrorDataDtoList);
			policyErrorDataDto.setRecordsFiltered(policyErrorDataPage.getTotalPages());
			policyErrorDataDto.setRecordsTotal(policyErrorDataPage.getTotalElements());

		}
		return policyErrorDataDto;
	}
}
*/