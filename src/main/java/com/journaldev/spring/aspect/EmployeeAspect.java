package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	private EmployeeAspect() {
		super();
	}


	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing @Before Advice on Employee.getName() method --- ");
	}

	@Before("execution(* com.journaldev.spring.service.*.get*())")
	public void getAllAdvices() {
		System.out.println("Executing advices on all service get methods --- ");
	}
	
}
