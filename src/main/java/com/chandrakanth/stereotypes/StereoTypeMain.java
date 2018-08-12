package com.chandrakanth.stereotypes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoTypeMain {

	public static void main(String[] argz) {
		AnnotationConfigApplicationContext annConfig = new AnnotationConfigApplicationContext(ConfigClass.class);

		ServiceClass sClass = (ServiceClass) annConfig.getBean(ServiceClass.class);
		System.out.println(sClass);
	}
}
