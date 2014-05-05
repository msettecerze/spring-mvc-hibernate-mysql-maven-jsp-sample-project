package com.gt.webapp.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.gt.webapp.web.util.GTSpringException;

/**
 * For Spring 3.x, we can simplify the XML configuration via @ExceptionHandler annotation.
 * 
 * @author gtiwari
 *
 */
/*
 *TODO: this is not working
 */
@Controller
public class ExceptionController {

	@ExceptionHandler( GTSpringException.class )
	public ModelAndView handleCustomException( GTSpringException ex ) {

		ModelAndView mav = new ModelAndView( "pages/generic-exception" );
		mav.addObject( "exception", ex );
		mav.addObject( "name", ex.getClass( ).getSimpleName( ) );
		mav.addObject( "message", ex.getMessage( ) );
		return mav;

	}

	@ExceptionHandler( Exception.class )
	// @ExceptionHandler( { NullPointerException.class, ArrayIndexOutOfBoundsException.class, IOException.class } )
	public ModelAndView handleAllException( Exception ex ) {

		ModelAndView mav = new ModelAndView( "error/custom-error" );
		mav.addObject( "exception", ex );
		mav.addObject( "name", ex.getClass( ).getSimpleName( ) );
		mav.addObject( "message", ex.getMessage( ) );
		return mav;

	}
}
