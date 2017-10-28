/*package com.rs.epl.NB.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rs.epl.NB.dtoresponse.AppSessionDto;
import com.rs.epl.NB.dtoresponse.ChartDto;
import com.rs.epl.NB.service.ChartService;

@Controller
public class DashBoardController extends CommonController{
 
	@Resource
	  ChartService chartService;
	
	@RequestMapping(value = "/royal_dashboard", method = RequestMethod.GET)
    public ModelAndView royal_dashboard(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        
           AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
            if (appSessionDto != null) {
                modelAndView = new ModelAndView("royal_dashboard");
                ChartDto chartDto = chartService.getChart();
//                System.out.println("chartDto.getWeeklyNoOfPolicySuccessRecords() : "+chartDto.getWeeklyNoOfPolicySuccessRecords());
                /////////Policy no of Success & Failed Records///////////////////////// 
                modelAndView.addObject("username", appSessionDto.getUsername());
                modelAndView.addObject("monthlyNoOfPolicySuccessRecords", chartDto.getMonthlyNoOfPolicySuccessRecords());
                modelAndView.addObject("monthlyNoOfPolicyFailRecords", chartDto.getMonthlyNoOfPolicyFailedRecords());
                modelAndView.addObject("weeklyNoOfPolicySuccessRecords", chartDto.getWeeklyNoOfPolicySuccessRecords());
                modelAndView.addObject("weeklyNoOfPolicyFailRecords", chartDto.getWeeklyNoOfPolicyFailedRecords());
                modelAndView.addObject("todayNoOfPolicySuccessRecords", chartDto.getTodayNoOfPolicySuccessRecords());
                modelAndView.addObject("todayNoOfPolicyFailRecords", chartDto.getTodayNoOfPolicyFailedRecords());
                
                /////////Receipt no of Success & Failed Records/////////////////////////
                modelAndView.addObject("monthlyNoOfReceiptSuccessRecords", chartDto.getMonthlyNoOfReceiptStatusSuccessRecords());
                modelAndView.addObject("monthlyNoOfReceiptFailRecords", chartDto.getMonthlyNoOfReceiptStatusFailedRecords());
                modelAndView.addObject("weeklyNoOfReceiptSuccessRecords", chartDto.getWeeklyNoOfReceiptStatusSuccessRecords());
                modelAndView.addObject("weeklyNoOfReceiptFailRecords", chartDto.getWeeklyNoOfReceiptStatusFailedRecords());
                modelAndView.addObject("todayNoOfReceiptSuccessRecords", chartDto.getTodayNoOfReceiptStatusSuccessRecords());
                modelAndView.addObject("todayNoOfReceiptFailRecords", chartDto.getTodayNoOfReceiptStatusFailedRecords());
                System.out.println("====="+chartDto+"=====");
            } else {
                modelAndView = new ModelAndView("home");
            }   
        return modelAndView;
    }
	
	
	
	
	
}
*/