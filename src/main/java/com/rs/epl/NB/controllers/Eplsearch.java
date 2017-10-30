package com.rs.epl.NB.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firstapex.rs.epl.NB.common.ENEplProperties;
import com.rs.epl.NB.dtoresponse.DataTableDto;
import com.rs.epl.NB.dtoresponse.StatusDto;
import com.rs.epl.NB.eappsrepo.EappPolicy;
import com.rs.epl.NB.oemrepository.Policyinfo;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.service.Policystatusservice;
@Controller
public class Eplsearch {

	@Autowired
	Policystatusservice StatusServive;
	
	@Resource
	PolicyRepository polforui;
	
	@Resource
	EappPolicy eappforui;

	@Resource
	Policyinfo oempol;
	
	@RequestMapping(value = "/PolicyNoData", method = RequestMethod.POST)
	public String getPolicyDataByPolicyNoOrReceisptNo(@RequestParam("start") String start,
			@RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
			@RequestParam("order[0][column]") String orderColumn, @RequestParam("order[0][dir]") String sortOrder,
			@RequestParam(value = "startdate", required = false) String startDate,
			@RequestParam(value = "enddate", required = false) String endDate,
			@RequestParam(value = "searchvalue", required = false) String searchValue, ModelMap model,
			HttpServletRequest request) throws Exception {
		Integer startIndx = Integer.parseInt(start);
		Integer pageSize = Integer.parseInt(length);
		Integer pageNumber = startIndx / pageSize;

		DataTableDto<List<StatusDto>> policyErrorDataDtos = 
		StatusServive.getPolicyByPolicyOrReceiptNo(pageNumber, pageSize, 
				Integer.parseInt(orderColumn), sortOrder, searchKey,
						searchValue);

		model.addAttribute("status", "Success");
		model.addAttribute("recordsTotal", policyErrorDataDtos.getRecordsTotal());
		model.addAttribute("recordsFiltered", policyErrorDataDtos.getRecordsTotal());
		if (policyErrorDataDtos.getTableValue() != null) {
			model.addAttribute("policynoDtos", policyErrorDataDtos.getTableValue());
		}
		return "policynoDtos";
	}
			
	@RequestMapping(value = "/DaterangeData", method = RequestMethod.POST)
    public String getPolicyFailDataByDateRange(@RequestParam("start") String start,
            @RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
            @RequestParam("order[0][column]") String orderColumn,
            @RequestParam("order[0][dir]") String sortOrder,
            @RequestParam(value = "startdate", required = false) String startDate,
            @RequestParam(value = "enddate", required = false) String endDate,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "searchtype", required = false) String searchType,
            @RequestParam(value = "searchvalue", required = false) String searchValue,
            @RequestParam(value = "productd", required = false) String productdcode,
            @RequestParam(value = "fromsystem", required = false) String system,
            ModelMap model, HttpServletRequest request) throws Exception {
        Integer sortColumnIndex = Integer.parseInt(orderColumn);
        Integer startIndx = Integer.parseInt(start);
        Integer pageSize = Integer.parseInt(length);
        Integer pageNumber = startIndx / pageSize;


        Date startdate = convertToDate(startDate);
        Date enddate = convertToDate(endDate);
        

        DataTableDto<List<StatusDto>> policyErrorDataDto = new DataTableDto<>();
        policyErrorDataDto = StatusServive.getDatabyDaterange(pageNumber,
                pageSize, sortColumnIndex, sortOrder,searchKey, startdate, enddate,status,productdcode,system,searchValue);

        model.addAttribute("status", "Success");
        model.addAttribute("recordsTotal", policyErrorDataDto.getRecordsTotal());
        model.addAttribute("recordsFiltered", policyErrorDataDto.getRecordsTotal());
        if (policyErrorDataDto.getTableValue() != null) {
            model.addAttribute("DaterangeDtos", policyErrorDataDto.getTableValue());
        }
        return "DaterangeDtos";
    }	
	
	@RequestMapping(value = "/DaterangeDataoem", method = RequestMethod.POST)
    public String getPolicyFailDataByDateRangeOEM(@RequestParam("start") String start,
            @RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
            @RequestParam("order[0][column]") String orderColumn,
            @RequestParam("order[0][dir]") String sortOrder,
            @RequestParam(value = "startdate", required = false) String startDate,
            @RequestParam(value = "enddate", required = false) String endDate,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "searchtype", required = false) String searchType,
            @RequestParam(value = "searchvalue", required = false) String searchValue,
            @RequestParam(value = "productd", required = false) String productdcode,
            @RequestParam(value = "fromsystem", required = false) String system,
            @RequestParam(value = "mfgname", required = false) String mfg,
            ModelMap model, HttpServletRequest request) throws Exception {
        Integer sortColumnIndex = Integer.parseInt(orderColumn);
        Integer startIndx = Integer.parseInt(start);
        Integer pageSize = Integer.parseInt(length);
        Integer pageNumber = startIndx / pageSize;


        Date startdate = convertToDate(startDate);
        Date enddate = convertToDate(endDate);
        

        DataTableDto<List<StatusDto>> policyErrorDataDto = new DataTableDto<>();
        policyErrorDataDto = StatusServive.getDatabyDaterange(pageNumber,
                pageSize, sortColumnIndex, sortOrder,searchKey, startdate, enddate,status,productdcode,system,mfg);

        model.addAttribute("status", "Success");
        model.addAttribute("recordsTotal", policyErrorDataDto.getRecordsTotal());
        model.addAttribute("recordsFiltered", policyErrorDataDto.getRecordsTotal());
        if (policyErrorDataDto.getTableValue() != null) {
            model.addAttribute("DaterangeDtos", policyErrorDataDto.getTableValue());
        }
        return "DaterangeDtos";
    }
	

	
	public Date convertToDate(String strDate) {
		Date date = null;
		// SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = dateFormat.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	
	@RequestMapping(value = "/emotortry", method = RequestMethod.POST)
	@ResponseBody
	public Integer switchchange(HttpServletRequest request,
			@RequestParam("source") String fromsystem,
			@RequestParam("prd") String productcode,
			@RequestParam("oemretry") String type,
			@RequestParam("oemreset") String failcase) {
		
		Integer updatecount=null;
		
		if(fromsystem.equalsIgnoreCase("EMOTOR")){
/*			polforui.UpdateGarbagepolicy();
			polforui.UpdateGarbagestatus();*/
			eappforui.Updatehasuploaded();
		}else if(fromsystem.equalsIgnoreCase("OEM")){
			if(failcase.equalsIgnoreCase("Retry With Valid Data")){
				if(productcode.length()>1){
					updatecount=oempol.Receiptretryivalidrec_product(productcode);
				}else{
					updatecount=oempol.Receiptretryinvalid();
				}
				
			}else {
				if(productcode.length()>1 && type.length()>1){
					if(type.equalsIgnoreCase("RECEIPT")){
						
						updatecount=oempol.Receiptretry(productcode);
						
					}else if(type.equalsIgnoreCase("POLICY")){
						updatecount=oempol.Policyretry(productcode);
					}
					
				}else if(productcode.length()>1 && type.length() == 0){
					
					updatecount=oempol.Productretry(productcode);
					
				}else if(productcode.length() == 0 && type.length()>1){
					
					if(type.equalsIgnoreCase("RECEIPT")){
						updatecount=oempol.RetryAllReceipt();
						
					}else if(type.equalsIgnoreCase("POLICY")){
						updatecount=oempol.RetryAllPolicy();
					}
					
				}else{
					updatecount=oempol.RetryAll();
				}
			}
		}
    return updatecount;
	}	
	
	
	
	@RequestMapping(value = "/swithchvalue", method = RequestMethod.GET)
	@ResponseBody
	public String switchchange(HttpServletRequest request) {
	  String conn=ENEplProperties.getEnEplProperties().getConnectionstring();  
		if(conn.contains("emotorcon")){
			boolean switchval=ENEplProperties.getEnEplProperties().isEappflag();
			String str = String.valueOf(switchval);
			return str;			
		}else{			
			boolean switchval=ENEplProperties.getEnEplProperties().isFlag();
			String str = String.valueOf(switchval);
			return str;
		}		
	}		
	
//		@RequestMapping(value = "/oemdata", method = RequestMethod.POST)
//	public String getPolicyDataByPolicyNoOrReceisptNooem(@RequestParam("start") String start,
//			@RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
//			@RequestParam("order[0][column]") String orderColumn, @RequestParam("order[0][dir]") String sortOrder,
//			@RequestParam(value = "startdate", required = false) String startDate,
//			@RequestParam(value = "enddate", required = false) String endDate,
//			@RequestParam(value = "searchvalue", required = false) String searchValue, ModelMap model,
//			HttpServletRequest request) throws Exception {
//		Integer startIndx = Integer.parseInt(start);
//		Integer pageSize = Integer.parseInt(length);
//		Integer pageNumber = startIndx / pageSize;
//
//		DataTableDto<List<StatusDto>> policyErrorDataDtos = 
//		StatusServive.getPolicyByPolicyOrReceiptNo(pageNumber, pageSize, 
//				Integer.parseInt(orderColumn), sortOrder, searchKey,
//						searchValue);
//
//		model.addAttribute("status", "Success");
//		model.addAttribute("recordsTotal", policyErrorDataDtos.getRecordsTotal());
//		model.addAttribute("recordsFiltered", policyErrorDataDtos.getRecordsTotal());
//		if (policyErrorDataDtos.getTableValue() != null) {
//			model.addAttribute("policynoDtos", policyErrorDataDtos.getTableValue());
//		}
//		return "policynoDtos";
//	}

}
