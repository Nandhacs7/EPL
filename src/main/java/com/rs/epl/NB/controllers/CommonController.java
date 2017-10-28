/**
 * 
 */
package com.rs.epl.NB.controllers;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Nandhu
 *
 */
@Controller
public class CommonController {
	protected final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	HttpSession httpSession;
}
