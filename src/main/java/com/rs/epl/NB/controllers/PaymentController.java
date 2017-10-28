package com.rs.epl.NB.controllers;

/*import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

//import org.slf4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rs.epl.NB.dtoresponse.AppSessionDto;
//import com.rs.epl.NB.dtoresponse.CommonResponseDto;
import com.rs.epl.NB.dtoresponse.DataTableDto;
import com.rs.epl.NB.dtoresponse.ReciptStatusDto;
//import com.rs.epl.cn.repository.PaymentRepository;
import com.rs.epl.cn.repository.ReceiptFaStatusRepository;
import com.rs.epl.cn.service.PaymentService;
import com.rs.epl.NB.service.ReceiptFaStatusService;

*//**
 * @author Jitu
 *
 *//*
@Controller
public class PaymentController extends CommonController {

	
	
	@Resource
	ReceiptFaStatusService receiptFaStatusService;

	@RequestMapping(value = "/receiptPage",method = RequestMethod.GET)
	public ModelAndView receiptPage(HttpServletRequest request) {
		
		logger.info("Inside ReceiptPage Controller*******");
		
		ModelAndView modelAndView = new ModelAndView("receipt_error_data");
		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
		if (appSessionDto != null) {
			modelAndView = new ModelAndView("receipt_error_data");
			modelAndView.addObject("username", appSessionDto.getUsername());
		} else {
			modelAndView = new ModelAndView("index");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/getStatusData", method = RequestMethod.POST)
	public String receiptStatus(Model model, HttpServletRequest request) {
		
		logger.info("Inside Receipt Status Controller*******");
		
		String start = request.getParameter("start");
		Integer startIndx = Integer.parseInt(start);

		Integer pageSize = Integer.parseInt(request.getParameter("length"));

		Integer pageNumber = startIndx / pageSize;

		String searchKey = request.getParameter("search[value]");// empty

		// sorting Asc and Dsc
		Integer sortColumnIndex = Integer.parseInt(request.getParameter("order[0][column]"));

		String sortOrder = request.getParameter("order[0][dir]");

		DataTableDto<List<ReciptStatusDto>> receiptFaStatusListDatas = receiptFaStatusService
				.getAllRecordsByStatus(pageNumber, pageSize, sortColumnIndex, sortOrder, searchKey);

		model.addAttribute("status", "Success");
		model.addAttribute("recordsTotal", receiptFaStatusListDatas.getRecordsTotal());
		model.addAttribute("recordsFiltered", receiptFaStatusListDatas.getRecordsTotal());
		if (receiptFaStatusListDatas.getTableValue() != null) {
			model.addAttribute("payListDtos", receiptFaStatusListDatas.getTableValue());
		}
		return "payListDtos";
	}

	@RequestMapping(value = "/get_databy_search", method = RequestMethod.POST)
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

		DataTableDto<List<ReciptStatusDto>> receiptFaStatusListDatas = receiptFaStatusService
				.searchByReceiptNoOrPaymentNo(pageNumber, pageSize, Integer.parseInt(orderColumn), sortOrder,
						searchValue, startDate, endDate, searchType);

		model.addAttribute("status", "Success");
		model.addAttribute("recordsTotal", receiptFaStatusListDatas.getRecordsTotal());
		model.addAttribute("recordsFiltered", receiptFaStatusListDatas.getRecordsTotal());
		if (receiptFaStatusListDatas.getTableValue() != null) {
			model.addAttribute("payListDtos", receiptFaStatusListDatas.getTableValue());
		}
		return "payListDtos";
	}
}*/
