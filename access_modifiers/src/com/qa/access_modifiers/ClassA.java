package com.qa.access_modifiers;

public class ClassA {

	private String field;
	
	public ClassA(String field) {
		super();
		this.field = field;
		System.out.println("Instance of Class A created");
	}

	public String getField() {
		return field;
	}
	
}
