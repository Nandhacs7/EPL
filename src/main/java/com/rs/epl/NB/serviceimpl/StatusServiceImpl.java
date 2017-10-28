/**
 * 
 */
package com.rs.epl.NB.serviceimpl;

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

import com.fa.component.policy.EPL_UISTATUS;
import com.rs.epl.NB.dtoresponse.DataTableDto;
import com.rs.epl.NB.dtoresponse.StatusDto;
import com.rs.epl.NB.policyrepository.UIStatus;
import com.rs.epl.NB.service.Policystatusservice;

/**
 * @author Rameswar
 *
 */
@Service
public class StatusServiceImpl implements Policystatusservice {
	
	@Resource
	UIStatus  policystatus68;

	@Override
	public DataTableDto<List<StatusDto>> getPolicyByPolicyOrReceiptNo(Integer pageNumber, Integer pageSize,
			int parseInt, String sortOrder, String searchKey, String searchValue) throws InterruptedException {
		DataTableDto<List<StatusDto>> Datatablestatusdtos = new DataTableDto<>();

		List<StatusDto> policyNoDtoList = new ArrayList<>();		
		
		PageRequest pageRequest = null;	
		
		
		Page<EPL_UISTATUS> StatusDataList=policystatus68.getByPolicynoOrReciptno2(searchValue,searchValue,pageRequest);
		
		List<EPL_UISTATUS> polnoStatusDataList = StatusDataList.getContent();
		
		if (StatusDataList != null) {
			for (EPL_UISTATUS policyNoData : polnoStatusDataList) {
				StatusDto policyNoDataDto = new StatusDto();
				policyNoDataDto = convertToPolicyErrorDataDto(policyNoData);
				policyNoDtoList.add(policyNoDataDto);
			}
		}

		Datatablestatusdtos.setTableValue(policyNoDtoList);
		Datatablestatusdtos.setRecordsFiltered(StatusDataList.getTotalPages());
		Datatablestatusdtos.setRecordsTotal(StatusDataList.getTotalElements());
		
		
		
		return Datatablestatusdtos;
	}
	
	

	
	@Override
	public DataTableDto<List<StatusDto>> getDatabyDaterange(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchKey, Date startdate, Date enddate, String status,
			String productdcode, String system,String mfg) throws InterruptedException {
		DataTableDto<List<StatusDto>> Datatablestatusdtos = new DataTableDto<>();
		
		List<StatusDto> policyNoDtoList = new ArrayList<StatusDto>();;
		
		PageRequest pageRequest = null;	
		
		Page<EPL_UISTATUS> Daterangedata=null;
		
		List<EPL_UISTATUS> listDaterangedata=null;
		
		pageRequest = sortingPaymentErrorData(pageNumber, pageSize, sortColumnIndex, sortOrder);
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(enddate);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		enddate = cal.getTime();
		
		if(system.equals("EAPPS")){
			if(productdcode.length()>1
					&& (!"null".equalsIgnoreCase(status) || status !="null")){
				Daterangedata=policystatus68.EmotordatabyAll(startdate,enddate,status,productdcode,system,pageRequest);
			}else if(productdcode.length()>1
					&& ("null".equalsIgnoreCase(status) || status =="null")){
				Daterangedata=policystatus68.EmotordatabyProduct(startdate,enddate,system,productdcode,pageRequest);
				
			}else if(productdcode.length()==0
					&& !"null".equalsIgnoreCase(status)){
				
				Daterangedata=policystatus68.Emotordatabystatus(startdate,enddate,system,status,pageRequest);
				
			}else{			
				Daterangedata=policystatus68.EmotordatabyDaterange(startdate,enddate,system,pageRequest);		
			}		
		}
		
		else{
			
			if(productdcode.length()>1
					&& (!"null".equalsIgnoreCase(status) || status !="null") && mfg.length()>1){
				Daterangedata=policystatus68.OEMdatabyAll(startdate,enddate,status,productdcode,system,mfg,pageRequest);
			}else if(productdcode.length()>1
					&& ("null".equalsIgnoreCase(status) || status =="null") && mfg.length() == 0){
				Daterangedata=policystatus68.EmotordatabyProduct(startdate,enddate,system,productdcode,pageRequest);
				
			}else if(productdcode.length()==0
					&& !"null".equalsIgnoreCase(status) && mfg.length() == 0){				
				Daterangedata=policystatus68.Emotordatabystatus(startdate,enddate,system,status,pageRequest);
				
			}else if(productdcode.length()==0
					&& "null".equalsIgnoreCase(status) && mfg.length()>1){				
				Daterangedata=policystatus68.OEMdatabyMfg(startdate,enddate,system,mfg,pageRequest);
				
			}else if(productdcode.length()>0
					&& !"null".equalsIgnoreCase(status) && mfg.length() == 0){				
				Daterangedata=policystatus68.OEMdatabyProductandstatus(startdate,enddate,status,productdcode,system,pageRequest);
			}else if(productdcode.length() == 0
					&& !"null".equalsIgnoreCase(status) && mfg.length()>0){				
				Daterangedata=policystatus68.OEMdatabystatusandmfg(startdate,enddate,status,mfg,system,pageRequest);
			}else if(productdcode.length()>0
					&& "null".equalsIgnoreCase(status) && mfg.length()>0){				
				Daterangedata=policystatus68.OEMdatabyproductandmfg(startdate,enddate,productdcode,mfg,system,pageRequest);
			}else{
				Daterangedata=policystatus68.EmotordatabyDaterange(startdate,enddate,system,pageRequest);
			}
			
			
			
		}
		
		 listDaterangedata = Daterangedata.getContent();
		
		if (listDaterangedata != null) {
			for (EPL_UISTATUS policyNoData : listDaterangedata) {
				StatusDto policyNoDataDto = new StatusDto();
				policyNoDataDto = convertToPolicyErrorDataDto(policyNoData);
				policyNoDtoList.add(policyNoDataDto);
			}
		}

		Datatablestatusdtos.setTableValue(policyNoDtoList);
		Datatablestatusdtos.setRecordsFiltered(Daterangedata.getTotalPages());
		Datatablestatusdtos.setRecordsTotal(Daterangedata.getTotalElements());
		
		return Datatablestatusdtos;
	}
	
	
	
	
	

	private StatusDto convertToPolicyErrorDataDto(EPL_UISTATUS policyNoData) {
		SimpleDateFormat smDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		StatusDto std=new StatusDto();
		
		std.setFromsysystem(policyNoData.getFromsysystem());
		std.setMfgname(policyNoData.getMfgname());
		std.setPolicy_attempt_time(smDateFormat.format(policyNoData.getPolicy_attempt_time()));
		std.setPolicy_errordeatils(policyNoData.getPolicy_errordeatils());
		std.setPolicy_status(policyNoData.getPolicy_status());
		std.setPolicyno(policyNoData.getPolicyno());
		std.setProductcode(policyNoData.getProductcode());
		if(null!=policyNoData.getReceipt_attempt_time()){
			std.setReceipt_attempt_time(smDateFormat.format(policyNoData.getReceipt_attempt_time()));			
		}
		std.setReceipt_errordetails(policyNoData.getReceipt_errordetails());
		std.setReceipt_status(policyNoData.getReceipt_status());
		std.setReceiptno(policyNoData.getReceiptno());
		return std;
	}

	
	
	public PageRequest sortingPaymentErrorData(Integer pageNumber, Integer pageSize, Integer sortColumnIndex,
			String sortOrder) {

		PageRequest pageRequest = null;

        if (sortColumnIndex == 3 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policy_attempt_time");

		} else if (sortColumnIndex == 3 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policy_attempt_time");
		} else if (sortColumnIndex == 0 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policy_attempt_time");
		}else if (sortColumnIndex == 0 && sortOrder.equals("asc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policy_attempt_time");
		}else if (sortColumnIndex == 6 && sortOrder.equals("asc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policy_attempt_time");
		}else if (sortColumnIndex == 6 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policy_attempt_time");
		}else if (sortColumnIndex == 7 && sortOrder.equals("asc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "receipt_attempt_time");
		}else if (sortColumnIndex == 7 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "receipt_attempt_time");
		}
		
		
		return pageRequest;
	}



}
