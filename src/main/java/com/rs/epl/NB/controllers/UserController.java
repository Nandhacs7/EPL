/**
 * 
 */
package com.rs.epl.NB.controllers;

//import java.io.ByteArrayOutputStream;
import java.io.IOException;
//import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.rs.epl.NB.dtorequest.UserLoginDto;
import com.rs.epl.NB.dtoresponse.AppSessionDto;
//import com.rs.epl.NB.dtoresponse.UserResponseDto;
import com.rs.epl.NB.service.UserService;

/**
 * @author Nandhu
 *
 */
@Controller
public class UserController extends CommonController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView userLoginForm(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();

		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
		if (appSessionDto != null) {
			modelAndView = new ModelAndView("home");
			modelAndView.addObject("username", appSessionDto.getUsername());
		} else {
			modelAndView = new ModelAndView("index", "loginForm", new UserLoginDto());
		}

		return modelAndView;
	}
	
	@RequestMapping(value = "/Access-Denide", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView modelAndView = new ModelAndView("index", "loginForm", new com.rs.epl.NB.dtorequest.UserLoginDto());

		// check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			modelAndView.addObject("username", userDetail.getUsername());
		}
		modelAndView.addObject("message", "Invalid UserName Or Password");

		return modelAndView;

	}

	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public
	 * String userLogin(@Valid @ModelAttribute("loginForm") UserLoginDto
	 * userLoginDto, BindingResult bindingResult, ModelMap model) {
	 * 
	 * logger.info("Inside UsersController Started-- Login Started"); String
	 * viewPage = null; if (bindingResult.hasErrors()) { viewPage = "index"; }
	 * UserResponseDto usersResponseDto =
	 * userService.userLogin(userLoginDto.getUsername(),
	 * userLoginDto.getPassword());
	 * 
	 * if (usersResponseDto.getMessage().equalsIgnoreCase("success")) {
	 * 
	 * AppSessionDto appSessionDto = new AppSessionDto();
	 * appSessionDto.setUsername(usersResponseDto.getUsername());
	 * httpSession.setAttribute("appSessionDto", appSessionDto);
	 * 
	 * // model.addAttribute("royal", "royal"); model.addAttribute("username",
	 * usersResponseDto.getUsername()); // model.addAttribute("excelupload", new
	 * ExcelUploadRequestDto()); viewPage = "royal"; } else { viewPage =
	 * "index"; }
	 * logger.info("Inside UsersController Started-- Login Completed"); return
	 * viewPage; }
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView userLogOut(HttpServletRequest request, HttpSession session) {

		logger.info("Inside UsersController Started-- Logout Started");
		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
		ModelAndView modelAndView = new ModelAndView();
		if (appSessionDto != null) {
			request.getSession().invalidate();;
			appSessionDto.setUsername(null);
			modelAndView = new ModelAndView("index", "loginForm", new UserLoginDto());
			modelAndView.addObject("message", "Logout Successfully!!!!..");
		} else {
			modelAndView = new ModelAndView("index", "loginForm", new UserLoginDto());
		}

		logger.info("Inside UsersController Started-- Logout Completed");
		return modelAndView;
	}

	//
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response) throws IOException {

		ModelAndView modelAndView = null;
		AppSessionDto appSessionDto = (AppSessionDto) request.getSession().getAttribute("appSessionDto");
		if (appSessionDto != null) {
			modelAndView=new ModelAndView("home");
			modelAndView.addObject("username", appSessionDto.getUsername());
		}
		else{
			modelAndView = new ModelAndView("index", "loginForm", new UserLoginDto());
		}
		return modelAndView;

	}
}
