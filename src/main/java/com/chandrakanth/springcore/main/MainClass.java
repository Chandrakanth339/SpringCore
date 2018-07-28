package com.chandrakanth.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandrakanth.springcore.annotations.RequiredAnnotationExample;

public class MainClass {

	public static void main(String[] argz) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringCoreAnnotations.xml");
		RequiredAnnotationExample rAEx = (RequiredAnnotationExample)appContext.getBean("randomId");
	}

}
