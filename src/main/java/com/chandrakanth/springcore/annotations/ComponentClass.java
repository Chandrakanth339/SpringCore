package com.chandrakanth.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("componentClass")
public class ComponentClass {

	@Autowired(required=false)
	private AutoWiringDependentObject audoObject;

	public AutoWiringDependentObject getAudoObject() {
		return audoObject;
	}

	public void setAudoObject(AutoWiringDependentObject audoObject) {
		this.audoObject = audoObject;
	}
}
