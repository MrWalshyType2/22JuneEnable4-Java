package com.qa.user_defined_classes.model;

public class Car {
	
	// Encapsulation:
	// - bundling the data (fields) and behaviours (methods) together, i.e., in a class
	// - restricting access to the data
	
	// the state/data that belongs to an object created from a class
	// is declared at the class-level
	// - this state is referred to as the fields of a class in Java
	// - these fields are given default values
	// - primitive types receive an actual value, such as 0 for short, byte, int, long
	// - all reference type fields, such as a String, default to null
	// - the null value means nothing is in the variable
	
	// Fields are structured as follows:
	// - AccessModifier DataType fieldName;
	// - private fields and methods cannot be accessed outside of this class
	private String manufacturer; // null
	public String model; // null
	public byte numOfDoors; // 0
	public float engineSize;
	public int numOfSeats;
	
	// These fields are referred to as instance variables, this is because
	// we can only use these variables if we have an object to use them
	// - they cannot be accessed through the class name, i.e., Car.manufacturer

	// methods with void as the return type return nothing
	public void displayInfo() { // doesn't take inputs, no parameters
		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("Model: " + this.model);
		System.out.println("Doors: " + this.numOfDoors);
		System.out.println("Engine size: " + this.engineSize);
		System.out.println("Number of seats: " + this.numOfSeats + "\n");
		// 'this' refers to the object that you are calling the method on
	}
	
	// We can return data from a method
	// - this is a getter/accessor
	public String getManufacturer() {
		// we return data from a method using the return keyword
		// - return someData;
		return this.manufacturer;
	}
	
	// We can also accept inputs to set data
	// - this is a setter/mutator
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		// any variable within a method, or code block, that is not
		// at the class-level is a local variable
		// - local variables can only be accessed within the scope (code block)
		//   that they are declared in, or any nested code blocks in the same
		//   file
		// - local variables cannot have access modifiers
	}
}
