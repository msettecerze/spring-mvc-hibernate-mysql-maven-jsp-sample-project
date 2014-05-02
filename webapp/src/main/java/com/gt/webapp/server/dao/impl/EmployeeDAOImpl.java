package com.gt.webapp.server.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gt.webapp.server.dao.EmployeeDAO;
import com.gt.webapp.server.entity.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl extends GenericHibernateDAOImpl< Employee, Long > implements EmployeeDAO {

	public EmployeeDAOImpl( ) {
		super( Employee.class );
	}

}
