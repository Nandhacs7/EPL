/**
 * 
 */
package com.rs.epl.NB.controllers;

//import java.util.ArrayList;
/*import java.util.List;*/

/*import javax.annotation.Resource;*/
/*import javax.servlet.http.HttpServletRequest;*/

//import org.springframework.security.authentication.AnonymousAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Controller;*/
/*import org.springframework.ui.ModelMap;*/
/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
*/
//import com.mysql.fabric.xmlrpc.base.Array;
//import com.rs.epl.NB.dtorequest.UserLoginDto;
/*import com.rs.epl.NB.dtoresponse.AppSessionDto;
import com.rs.epl.NB.dtoresponse.DataTableDto;*/
//import com.rs.epl.NB.dtoresponse.NewBussinessresponeseDto;
/*import com.rs.epl.NB.service.NewMotorBusinessService;*/
//import com.rs.epl.cn.dto.request.UserLoginDto;

//import com.firstapex.rs.epl.cn.service.MotorNewBusinessService;
//import com.rs.epl.cn.service.DoMotorNewBusinessService;


/*@Controller
// @RequestMapping("/")
public class DoMotorNewBusinessController extends CommonController {
	 @Resource
	 NewMotorBusinessService NewMotorBusinessService;
	 ModelAndView modelAndView = new ModelAndView();

	@RequestMapping(value = "/getallpolicyerrordatapage", method = RequestMethod.GET)
	public ModelAndView userLoginForm(HttpServletRequest request) throws Exception {
		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
//		logger.info("Inside NewBusMotorService -- pushdatatofgpage Started..");
//		logger.info("Inside NewBusMotorService -- pushdatatofgpage Completed..");
		ModelAndView modelAndView = new ModelAndView("policy_error_datas");
		modelAndView.addObject("username", appSessionDto.getUsername());
		return modelAndView;
	}
		
	@RequestMapping(value = "/getallpolicyerrordata", method = RequestMethod.POST)
	public String testToNewBusiness(@RequestParam("start") String start, @RequestParam("length") String length,
			@RequestParam("search[value]") String searchKey, @RequestParam("order[0][column]") String orderColumn,
			@RequestParam("order[0][dir]") String sortOrder,
			@RequestParam(value = "startdate", required = false) String startDate,
			@RequestParam(value = "enddate", required = false) String endDate,
			@RequestParam(value = "searchtype", required = false) String searchType,
			 ModelMap model,
			HttpServletRequest request) throws Exception {

		Integer startIndx = Integer.parseInt(start);
		Integer pageSize = Integer.parseInt(length);
		Integer pageNumber = startIndx / pageSize;

		// String searchKey = request.getParameter("search[value]");// empty

		// sorting Asc and Dsc
		Integer sortColumnIndex = Integer.parseInt(orderColumn);

		DataTableDto<List<NewBussinessresponeseDto>> dt = new DataTableDto<List<NewBussinessresponeseDto>>();
//		DataTableDto dataTableDto = new DataTableDto();
		logger.info("Inside Get All Policy Data Controller*******");
//		List<NewBussinessresponeseDto> newBussinessresponeseDtoList = new ArrayList<NewBussinessresponeseDto>();
		try {

			AppSessionDto appSession = (AppSessionDto) httpSession.getAttribute("appSessionDto");
			if (appSession != null) {

				dt = NewMotorBusinessService.NewMotorBusinessService1(pageNumber, pageSize, sortColumnIndex, sortOrder,
						searchKey, startDate, endDate, searchType);

				model.addAttribute("status", "Success");
				model.addAttribute("recordsTotal", dt.getRecordsTotal());
				model.addAttribute("recordsFiltered", dt.getRecordsTotal());
				if (dt.getTableValue() != null) {
					model.addAttribute("newBussinessresponeseDtos", dt.getTableValue());
				} else {
					model.addAttribute("newBussinessresponeseDtos", new DataTableDto<List<NewBussinessresponeseDto>>());
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			model.addAttribute("status", e.getMessage());
			model.addAttribute("newBussinessresponeseDtos", new DataTableDto<List<NewBussinessresponeseDto>>());
		}

		logger.info("Inside Get All Policy Data Controller******* Completed..");
		return "newBussinessresponeseDtos";
	}

	@RequestMapping(value = "/getallpolicyerrordatabysearch", method = RequestMethod.POST)
	public String getallpolicyerrordatabysearch(@RequestParam("start") String start, @RequestParam("length") String length,
			@RequestParam("search[value]") String searchKey, @RequestParam("order[0][column]") String orderColumn,
			@RequestParam("order[0][dir]") String sortOrder,
			@RequestParam(value = "startdate", required = false) String startDate,
			@RequestParam(value = "enddate", required = false) String endDate,
			@RequestParam(value = "searchtype", required = false) String searchType,
			@RequestParam(value = "searchvalue", required = false) String searchValue,
			 ModelMap model,
			HttpServletRequest request) throws Exception {

		Integer startIndx = Integer.parseInt(start);
		Integer pageSize = Integer.parseInt(length);
		Integer pageNumber = startIndx / pageSize;

		// String searchKey = request.getParameter("search[value]");// empty

		// sorting Asc and Dsc
		Integer sortColumnIndex = Integer.parseInt(orderColumn);

		DataTableDto<List<NewBussinessresponeseDto>> dt = new DataTableDto<List<NewBussinessresponeseDto>>();
//		DataTableDto dataTableDto = new DataTableDto();
		logger.info("Inside Get All Searching Policy Controller........");
//		List<NewBussinessresponeseDto> newBussinessresponeseDtoList = new ArrayList<NewBussinessresponeseDto>();
		try {
			AppSessionDto appSession = (AppSessionDto) httpSession.getAttribute("appSessionDto");
			if (appSession != null) {
				
				dt = NewMotorBusinessService.newMotorBusinessServiceSearching(pageNumber, pageSize, sortColumnIndex, sortOrder,
						searchValue, startDate, endDate, searchType);
				model.addAttribute("status", "Success");
				model.addAttribute("recordsTotal", dt.getRecordsTotal());
				model.addAttribute("recordsFiltered", dt.getRecordsTotal());
				if (dt.getTableValue() != null) {
					model.addAttribute("newBussinessresponeseDtos", dt.getTableValue());
				} else {
					model.addAttribute("newBussinessresponeseDtos", new DataTableDto<List<NewBussinessresponeseDto>>());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			model.addAttribute("status", e.getMessage());
			model.addAttribute("newBussinessresponeseDtos", new DataTableDto<List<NewBussinessresponeseDto>>());
		}
		logger.info("Inside Get All Searching Policy Controller........ Completed");
		return "newBussinessresponeseDtos";
 }
}*/
