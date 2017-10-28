/**
 * 
 */
package com.rs.epl.NB.serviceimpl;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.rs.epl.NB.dtoresponse.AppSessionDto;

/**
 * @author fasupport
 *
 */
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	protected final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	HttpSession httpSession;

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		logger.info("Inside CustomAuthenticationSuccessHandler --Authentication Checking Started..");
		
		httpSession = request.getSession();
		/* Set some session variables */
		User authUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		AppSessionDto appSessionDto = new AppSessionDto();
		appSessionDto.setUsername(authUser.getUsername());
//		appSessionDto.setUserRole(authUser.getAuthorities();
		// appSessionDto.setUserId(authUser.getUserId());
		httpSession.setAttribute("appSessionDto", appSessionDto);

		// httpSession.setAttribute("uname", authUser.getUsername());
		// httpSession.setAttribute("authorities",
		// authentication.getAuthorities());

		/* Set target URL to redirect */
		String targetUrl = determineTargetUrl(authentication);
		redirectStrategy.sendRedirect(request, response, targetUrl);
		
		logger.info("Inside CustomAuthenticationSuccessHandler --Authentication Checking Completed..");

	}

	protected String determineTargetUrl(Authentication authentication) {
		Set<String> authorities = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		if (authorities.contains("FINANCE")) {
			return "/home";
		} else if (authorities.contains("OPERATIONS")) {
			return "/home";
		} else {
			throw new IllegalStateException();
		}
//		return "/login";
	}

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}
}
