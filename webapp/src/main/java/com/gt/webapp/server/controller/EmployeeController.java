package com.gt.webapp.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gt.webapp.server.dao.EmployeeDAO;
import com.gt.webapp.server.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDAO	employeeDao;

	@RequestMapping( value = "/employee" )
	public ModelAndView indexPage( ) {
		ModelAndView mav = new ModelAndView( "employee/employee-main" );
		mav.addObject( "message", "Welcome to Employee page" );

		return mav;
	}

	@RequestMapping( value = "/employee/add" )
	public ModelAndView addEmployeePage( ) {
		ModelAndView modelAndView = new ModelAndView( "employee/employee-add" );
		modelAndView.addObject( "employee", new Employee( ) );
		return modelAndView;
	}

	@RequestMapping( value = "/employee/add/process" )
	public String addingEmployee( @ModelAttribute Employee employee, final RedirectAttributes redirectAttributes ) {
		Long id= employeeDao.save( employee );
		String message = "Employee saved successfully added. id = " + id;
 
		redirectAttributes.addFlashAttribute( "message", message );
		
		return "redirect:/employee/list" ;
	}

	@RequestMapping( value = "/employee/list" )
	public ModelAndView listOfEmployees( ) {
		ModelAndView modelAndView = new ModelAndView( "employee/employee-list" );

		List< Employee > employees = employeeDao.findAll( );
		modelAndView.addObject( "employees", employees );

		return modelAndView;
	}

	/*
	 * return blank page with employee info
	 */
	@RequestMapping( value = "/employee/edit/{id}", method = RequestMethod.GET )
	public ModelAndView editEmployeePage( @PathVariable Long id ) {
		ModelAndView modelAndView = new ModelAndView( "employee/employee-edit" );

		Employee employee = null;
		String message = "";

		if ( employeeDao.exists( id ) ) {
			employee = employeeDao.get( id );
			modelAndView.addObject( "employee", employee );
		} else {
			message = "Employee with id " + id + " doesn't exists";
			modelAndView.addObject( "message", message );

		}
		return modelAndView;
	}

	/*
	 * save after edit
	 */
	@RequestMapping( value = "/employee/edit/process", method = RequestMethod.POST )
	public String edditingEmployee( @ModelAttribute Employee employee ,final RedirectAttributes redirectAttributes ) {

		employeeDao.merge( employee );

		String message = "Employee was successfully edited.";
		redirectAttributes.addFlashAttribute( "message", message );
		
		return "redirect:/employee/list" ;
	}

	@RequestMapping( value = "/employee/delete/{id}", method = RequestMethod.GET )
	public String deleteEmployee( @PathVariable Long id, final RedirectAttributes redirectAttributes) {
		String message = "";

		if ( employeeDao.exists( id ) ) {
			employeeDao.delete( id );
			message = "Employee was successfully deleted.";
		} else {
			message = "Employee with id " + id + " doesn't exists";
		}

		redirectAttributes.addFlashAttribute( "message", message );
		
		return "redirect:/employee/list" ;
	}
}
