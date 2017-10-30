package com.rs.epl.NB.controllers;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.firstapex.rs.epl.NB.common.ENEplProperties;
import com.rs.epl.NB.dtorequest.UserLoginDto;
import com.rs.epl.NB.dtoresponse.AppSessionDto;
//import com.rs.epl.NB.oementity.ReceiptFaStatus;
import com.rs.epl.NB.serviceimpl.EappSchedular;
import com.rs.epl.NB.serviceimpl.TaskSchedular;

@Controller
public class SearchController {

	
	@RequestMapping(value = "/changeinprops", method = RequestMethod.POST)
	@ResponseBody
	public String switchchange(HttpServletRequest request,@RequestParam("switchvalue") String switchval) throws ConfigurationException {
		
		String conn=ENEplProperties.getEnEplProperties().getConnectionstring();
		if(conn.contains("emotorcon")){
			PropertiesConfiguration conf = new PropertiesConfiguration(conn);
			if(switchval.equalsIgnoreCase("true")){
				conf.setProperty("EAPP.Eappflag", "true");			
			}else{
				conf.setProperty("EAPP.Eappflag", "false");
			}
			conf.save();
			return "SUCCESS";
			
		}else{			
			PropertiesConfiguration conf = new PropertiesConfiguration(conn);
			if(switchval.equalsIgnoreCase("true")){
				conf.setProperty("EPLNB.flag", "true");			
			}else{
				conf.setProperty("EPLNB.flag", "false");
			}
			conf.save();
			return "SUCCESS";
		}
//    System.out.println(switchval);
	}	
	
	@RequestMapping(value = "/changeinschedular", method = RequestMethod.POST)
	public String switchchange2(HttpServletRequest request,@RequestParam("switchvalue2") String switchval) {
		String conn=ENEplProperties.getEnEplProperties().getConnectionstring();
		if(conn.contains("emotorcon")){
			EappSchedular eapp=new EappSchedular();
			if(switchval.equalsIgnoreCase("true")){
				eapp.setFlag2(true);			
			}else{
				eapp.setFlag2(false);
			}			
			return "SUCCESS";
		}else{
			TaskSchedular task=new TaskSchedular();
			if(switchval.equalsIgnoreCase("true")){
				task.setFlag2(true);			
			}else{
				task.setFlag2(false);
			}
			return "SUCCESS";
		}

	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchPage(HttpServletRequest request) {
		ModelAndView modelAndView=null;
		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
		if (appSessionDto != null){
		       modelAndView = new ModelAndView("search");
			modelAndView.addObject("username", appSessionDto.getUsername());
			}
		else{
			modelAndView = new ModelAndView("index", "loginForm", new UserLoginDto());
		}
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/eappsearch", method = RequestMethod.GET)
	public ModelAndView eappssearchPage(HttpServletRequest request) {
		ModelAndView modelAndView=null;
		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
		if (appSessionDto != null){
		       modelAndView = new ModelAndView("eappsearch");
			modelAndView.addObject("username", appSessionDto.getUsername());
			}
		else{
			modelAndView = new ModelAndView("index", "loginForm", new UserLoginDto());
		}
		return modelAndView;
	}

/*	///////// Getting Policy Data by Receipt no Or Policy No
	@RequestMapping(value = "/getPolicyDataByPolicyNoOrReceiptNo", method = RequestMethod.POST)
	public String getPolicyDataByPolicyNoOrReceiptNo(@RequestParam("start") String start,
			@RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
			@RequestParam("order[0][column]") String orderColumn, @RequestParam("order[0][dir]") String sortOrder,
			@RequestParam(value = "startdate", required = false) String startDate,
			@RequestParam(value = "enddate", required = false) String endDate,
			@RequestParam(value = "searchtype", required = false) String searchType,
			@RequestParam(value = "searchvalue", required = false) String searchValue, ModelMap model,
			HttpServletRequest request) throws Exception {
		Integer startIndx = Integer.parseInt(start);
		Integer pageSize = Integer.parseInt(length);
		Integer pageNumber = startIndx / pageSize;

		DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDtos = policyErrorDataService
				.getPolicyByPolicyOrReceiptNo(pageNumber, pageSize, Integer.parseInt(orderColumn), sortOrder, searchKey,
						searchType, searchValue);

		model.addAttribute("status", "Success");
		model.addAttribute("recordsTotal", policyErrorDataDtos.getRecordsTotal());
		model.addAttribute("recordsFiltered", policyErrorDataDtos.getRecordsTotal());
		if (policyErrorDataDtos.getTableValue() != null) {
			model.addAttribute("payListDtos", policyErrorDataDtos.getTableValue());
		}
		return "payListDtos";
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

	///////// Getting Receipt Data by Receipt no Or Policy No
	@RequestMapping(value = "/getReceiptDataByReceiptNoOrPolicyNo", method = RequestMethod.POST)
	public String getallpolicyerrordatabysearch(@RequestParam("start") String start,
			@RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
			@RequestParam("order[0][column]") String orderColumn, @RequestParam("order[0][dir]") String sortOrder,
			@RequestParam(value = "startdate", required = false) String startDate,
			@RequestParam(value = "enddate", required = false) String endDate,
			@RequestParam(value = "searchtype", required = false) String searchType,
			@RequestParam(value = "searchvalue", required = false) String searchValue, ModelMap model,
			HttpServletRequest request) throws Exception {
		Integer startIndx = Integer.parseInt(start);
		Integer pageSize = Integer.parseInt(length);
		Integer pageNumber = startIndx / pageSize;


		DataTableDto<List<ReciptStatusDto>> receiptFaStatusListDatas = receiptStatusService
				.searchByReceiptNoOrPaymentNo(pageNumber, pageSize, Integer.parseInt(orderColumn), sortOrder,
						searchValue, startDate, endDate, searchKey, searchType);

		model.addAttribute("status", "Success");
		model.addAttribute("recordsTotal", receiptFaStatusListDatas.getRecordsTotal());
		model.addAttribute("recordsFiltered", receiptFaStatusListDatas.getRecordsTotal());
		if (receiptFaStatusListDatas.getTableValue() != null) {
			model.addAttribute("payListDtos", receiptFaStatusListDatas.getTableValue());
		}
		return "payListDtos";
	}
	
	 @RequestMapping(value = "/getPolicyFailDataByDateRange", method = RequestMethod.POST)
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
	        
	        if(status.equalsIgnoreCase("Invalid Request")){
	        	status="Retry Policy with Valid Data";
	        }

	        DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDto = new DataTableDto<>();
	        policyErrorDataDto = policyErrorDataService.getPolicyFailDataByDateRange(pageNumber,
	                pageSize, sortColumnIndex, sortOrder,searchKey, startdate, enddate,status,productdcode,system);

	        model.addAttribute("status", "Success");
	        model.addAttribute("recordsTotal", policyErrorDataDto.getRecordsTotal());
	        model.addAttribute("recordsFiltered", policyErrorDataDto.getRecordsTotal());
	        if (policyErrorDataDto.getTableValue() != null) {
	            model.addAttribute("payListDtos", policyErrorDataDto.getTableValue());
	        }
	        return "payListDtos";
	    }
	 
	 @RequestMapping(value = "/getReceiptFailDataByDateRange", method = RequestMethod.POST)
	    public String getReceiptDataByDateRange(@RequestParam("start") String start,
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
	        Integer startIndx = Integer.parseInt(start);
	        Integer pageSize = Integer.parseInt(length);
	        Integer pageNumber = startIndx / pageSize;
	        Integer sortColumnIndex = Integer.parseInt(orderColumn);
	        Date startdate = convertToDate(startDate);
	        Date enddate = convertToDate(endDate);
	        if(status.equalsIgnoreCase("Invalid Request")){
	        	status="Retry";
	        }

	        DataTableDto<List<ReciptStatusDto>> receiptFaStatusListDatas = receiptStatusService.getReceiptDataByDateRange
	        		(pageNumber, pageSize, sortColumnIndex,searchKey,searchValue, sortOrder, startdate, enddate,status,productdcode,system);

	        model.addAttribute("status", "Success");
	        model.addAttribute("recordsTotal", receiptFaStatusListDatas.getRecordsTotal());
	        model.addAttribute("recordsFiltered", receiptFaStatusListDatas.getRecordsTotal());
	        if (receiptFaStatusListDatas.getTableValue() != null) {
	            model.addAttribute("payListDtos", receiptFaStatusListDatas.getTableValue());
	        }
	        return "payListDtos";
	    }
	 
	 @RequestMapping(value = "/getbymfg", method = RequestMethod.POST)
	 public String getbymfg(@RequestParam("start") String start,
	            @RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
	            @RequestParam("order[0][column]") String orderColumn,
	            @RequestParam("order[0][dir]") String sortOrder,
	            @RequestParam(value = "startdate", required = false) String startDate,
	            @RequestParam(value = "enddate", required = false) String endDate,
	            @RequestParam(value = "status", required = false) String status,
	            @RequestParam(value = "searchtype", required = false) String searchType,
	            @RequestParam(value = "searchvalue", required = false) String searchValue,
	            @RequestParam(value = "product", required = false) String product,
	            @RequestParam(value = "mfgtype", required = false) String mfgtype,
	            ModelMap model, HttpServletRequest request){
	        Integer sortColumnIndex = Integer.parseInt(orderColumn);
	        Integer startIndx = Integer.parseInt(start);
	        Integer pageSize = Integer.parseInt(length);
	        Integer pageNumber = startIndx / pageSize;


	        Date startdate = convertToDate(startDate);
	        Date enddate = convertToDate(endDate);

	        DataTableDto<List<PolicyerrorDataDto>> policyErrorDataDto = new DataTableDto<>();
	        policyErrorDataDto = policyErrorDataService.getPolicyDataByDateRangeAndMfg(pageNumber,
	                pageSize, sortColumnIndex, sortOrder,searchKey, startdate, enddate,status,mfgtype,product);

	        model.addAttribute("status", "Success");
	        model.addAttribute("recordsTotal", policyErrorDataDto.getRecordsTotal());
	        model.addAttribute("recordsFiltered", policyErrorDataDto.getRecordsTotal());
	        if (policyErrorDataDto.getTableValue() != null) {
	            model.addAttribute("mfgListDtos", policyErrorDataDto.getTableValue());
	        }
	        return "mfgListDtos";	 
//             System.out.println("============="+startDate);
//		 
//             System.out.println("============="+endDate);
//		 
//             System.out.println("============="+status);
//		 
//             System.out.println("============="+searchType);
		 
//             System.out.println("============="+searchValue);
             
//             System.out.println("============="+mfgtype);
		 
		 
		 
//					return searchValue;
		 
	 }
	 
	 @RequestMapping(value = "/getbymfgrec", method = RequestMethod.POST)
	 public String getbymfgrec(@RequestParam("start") String start,
	            @RequestParam("length") String length, @RequestParam("search[value]") String searchKey,
	            @RequestParam("order[0][column]") String orderColumn,
	            @RequestParam("order[0][dir]") String sortOrder,
	            @RequestParam(value = "startdate", required = false) String startDate,
	            @RequestParam(value = "enddate", required = false) String endDate,
	            @RequestParam(value = "status", required = false) String status,
	            @RequestParam(value = "searchtype", required = false) String searchType,
	            @RequestParam(value = "searchvalue", required = false) String searchValue,
	            @RequestParam(value = "product", required = false) String product,
	            @RequestParam(value = "mfgtype", required = false) String mfgtype,
	            ModelMap model, HttpServletRequest request){
		 
		 Integer startIndx = Integer.parseInt(start);
	        Integer pageSize = Integer.parseInt(length);
	        Integer pageNumber = startIndx / pageSize;
	        Integer sortColumnIndex = Integer.parseInt(orderColumn);
	        Date startdate = convertToDate(startDate);
	        Date enddate = convertToDate(endDate);
	        

	        DataTableDto<List<ReciptStatusDto>> receiptFaStatusListDatas = receiptStatusService.getReceiptDataByDateRangeAndMfg(pageNumber,
	                pageSize, sortColumnIndex, sortOrder,startdate, enddate,status,mfgtype,product);

	        model.addAttribute("status", "Success");
	        model.addAttribute("recordsTotal", receiptFaStatusListDatas.getRecordsTotal());
	        model.addAttribute("recordsFiltered", receiptFaStatusListDatas.getRecordsTotal());
	        if (receiptFaStatusListDatas.getTableValue() != null) {
	            model.addAttribute("getbymfgrec", receiptFaStatusListDatas.getTableValue());
	        }
	        return "getbymfgrec";
		 
          System.out.println("============="+startDate);
		 
          System.out.println("============="+endDate);
		 
          System.out.println("============="+status);
		 
          System.out.println("============="+searchType);
		 
//          System.out.println("============="+searchValue);
          
          System.out.println("============="+mfgtype);
		 		 
	 } */
}