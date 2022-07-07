package com.qa.user_defined_classes.model;

public class Car {

	// the state/data that belongs to an object created from a class
	// is declared at the class-level
	// - this state is referred to as the fields of a class in Java
	// - these fields are given default values
	// - primitive types receive an actual value, such as 0 for short, byte, int, long
	// - all reference type fields, such as a String, default to null
	// - the null value means nothing is in the variable
	
	// Fields are structured as follows:
	// - AccessModifier DataType fieldName;
	public String manufacturer; // null
	public String model; // null
	public byte numOfDoors; // 0
	
	// These fields are referred to as instance variables, this is because
	// we can only use these variables if we have an object to use them
	// - they cannot be accessed through the class name, i.e., Car.manufacturer

	// methods with void as the return type return nothing
	public void displayInfo() { // doesn't take inputs, no parameters
		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("Model: " + this.model);
		System.out.println("Doors: " + this.numOfDoors + "\n");
		// 'this' refers to the object that you are calling the method on
	}
	
}
