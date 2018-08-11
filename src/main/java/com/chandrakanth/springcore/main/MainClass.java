package com.chandrakanth.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandrakanth.springcore.annotations.AutoWiringDependentObject;
import com.chandrakanth.springcore.annotations.ComponentClass;

public class MainClass {

	public static void main(String[] argz) {
		ApplicationContext appContext = null;
		try {

			appContext = new ClassPathXmlApplicationContext("SpringCoreAnnotations.xml");

			ComponentClass compClass = (ComponentClass) appContext.getBean("componentClass");
			
			
			// @Required Anotation example bean
			/*
			 * RequiredAnnotationExample rAEx = (RequiredAnnotationExample)
			 * appContext.getBean("randomId");
			 */
			
			// @Autowired annotation example
			// @Component, @Service, @Repository can all be used via annotation config
			// context
//			AnnotationConfigApplicationContext annAppContext = new AnnotationConfigApplicationContext();

			// Register the classes with context
//			annAppContext.register(ComponentClass.class);
//			annAppContext.refresh();

//			ComponentClass compClass = (ComponentClass) annAppContext.getBean(ComponentClass.class);
//			System.out.println(compClass);
		} finally {
			if (appContext != null && ((ClassPathXmlApplicationContext) appContext).isActive()) {
				((ClassPathXmlApplicationContext) appContext).close();
			}
		}
	}

}
