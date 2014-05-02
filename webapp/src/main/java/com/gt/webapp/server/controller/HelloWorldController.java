package com.gt.webapp.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Simple index page controller serving hello.jsp file
 */
@Controller
public class HelloWorldController {

	/**
	 * Simply serves hello.jsp
	 * 
	 * @return view with name 'hello'
	 */
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String handleRequest( ) {
		return "hello";
	}

	@RequestMapping( value = "/home" )
	public ModelAndView indexPage( ) {
		ModelAndView mav = new ModelAndView( "home" );
		mav.addObject( "message", "Welcome..." );

		return mav;
	}

}
