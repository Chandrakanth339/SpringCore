package com.chandrakanth.springcore.annotations;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotationExample {

	private String bool;

	@Required // org.springframework.beans.factory.BeanInitializationException will be thrown
				// if this property is not set
	public void setBool(String bool) {
		this.bool = bool;
	}

	public String getBool() {
		return bool;
	}

}
