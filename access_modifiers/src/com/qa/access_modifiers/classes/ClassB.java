package com.qa.access_modifiers.classes;

public class ClassB {

	protected String protectedField;

	public ClassB(String protectedField) {
		super();
		this.protectedField = protectedField;
		System.out.println("ClassB constructor invoked");
	}
	
	public void createInstanceOfC() {
		new ClassC();
	}
}
