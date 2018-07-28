package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.EmployeeService;

public class SpringAOPInvocator {

	private SpringAOPInvocator() {
		
	}
	public static void main(String argz[]) throws Exception {
		try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AOPConfigFile.xml")) {
			Employee emp = (Employee) appContext.getBean("employee");
			EmployeeService empService = (EmployeeService) appContext.getBean("employeeService");
			System.out.println(emp.getName());
			System.out.println(empService.getEmployeeServiceDummy());
			System.out.println(empService.getEmployee().getName());
		}

	}
}
