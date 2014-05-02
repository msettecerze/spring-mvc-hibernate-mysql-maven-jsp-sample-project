package com.gt.webapp.server.entity;

import javax.persistence.*;

@Entity
@Table( name = "EMPLOYEE" )
public class Employee extends BaseEntity {
	private static final long	serialVersionUID	= 613865546485511882L;


	@Column( name = "first_name" )
	private String				firstName;

	@Column( name = "last_name" )
	private String				lastName;

	@Column( name = "salary" )
	private int					salary;

	public Employee( ) {
	}


	public String getFirstName( ) {
		return firstName;
	}

	public void setFirstName( String first_name ) {
		this.firstName = first_name;
	}

	public String getLastName( ) {
		return lastName;
	}

	public void setLastName( String last_name ) {
		this.lastName = last_name;
	}

	public int getSalary( ) {
		return salary;
	}

	public void setSalary( int salary ) {
		this.salary = salary;
	}
}