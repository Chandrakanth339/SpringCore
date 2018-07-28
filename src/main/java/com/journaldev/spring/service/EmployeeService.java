package com.journaldev.spring.service;

import com.journaldev.spring.model.Employee;

public class EmployeeService {

	private EmployeeService() {
		super();
	}

	private Employee employee;
	private String employeeServiceDummy;
	
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public String getEmployeeServiceDummy() {
		return employeeServiceDummy;
	}

	public void setEmployeeServiceDummy(String employeeServiceDummy) {
		this.employeeServiceDummy = employeeServiceDummy;
	}

	
	
	
}
