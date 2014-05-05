package com.gt.webapp.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.gt.webapp.web.util.GTSpringException;

@Controller
/**
 * For Spring 3.x, we can simplify the XML configuration via @ExceptionHandler annotation.
 * @author gtiwari
 *
 */
public class ExceptionController {

	@ExceptionHandler( GTSpringException.class )
	public ModelAndView handleCustomException( GTSpringException ex ) {

		ModelAndView model = new ModelAndView( "pages/generic-exception" );
		model.addObject( "exception", ex );
		return model;

	}

	@ExceptionHandler( Exception.class )
	public ModelAndView handleAllException( Exception ex ) {

		ModelAndView model = new ModelAndView( "error/custom-error" );
		return model;

	}
}
