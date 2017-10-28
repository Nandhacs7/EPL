package com.rs.epl.NB.viewresolvers;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class JsonViewResolver implements ViewResolver {

	protected final Logger logger = Logger.getLogger(getClass());

	public View resolveViewName(String viewName, Locale locale) throws Exception {

		logger.info("viewname - " + viewName);

		MappingJackson2JsonView view = new MappingJackson2JsonView();
		view.setPrettyPrint(true);
		return view;
	}
}