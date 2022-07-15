package com.qa.classes_and_objects;

public class Animal {

	private String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	public Animal(int type) {
		System.out.println(type);
	}
	
	public void printInfo() {
		System.out.println(type);
	}
	
	public void setType(String type) {
		this.type = type; 
		// we have to use `this` here as the method parameter `type` is shadowing/hiding the field called `type`
		// - the field `type` has a class scope, whereas the parameter `type` has a local scope (it is scoped to the method rather than the object)
	}
	
	public String getType() {
		return type; 
		// we don't need to use `this.type` as there is no method parameter with the same name
		// - in this instance, `type` implicitly refers to `this.type`
	}
	
	// Method overloading:
	// - two eat() methods, different inputs
	public void eat() {
		System.out.println("Searching for some food");
	}
	
	// overloaded methods can have different return types
	// - the return type does not matter
	// - it is the signature that matters, the name and inputs
	public int eat(String food) {
		System.out.println("Nom nom nom... " + food);
		return 0;
	}
}
