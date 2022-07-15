package com.qa.recap;

public class Todo {

	// Classes are blueprints on how to create something
	// - something being an object
	// - they can contain methods and variables (fields)
	// - variables belonging to the class are not declared inside a method although
	//   we might use them in a method
	
	// Fields are structured as follows:
	// - AccessModifier DataType = value;
	public String name; // null
	public int storyPoints; // 0
	// if we don't assign a value to a field, it receives a default value
	// - all reference types default to `null`
	// - variables declared in a method, local variables, do not receive a default value

	// Methods
	// - reusable pieces of behaviour
	// Structured as follows:
	//
	// AccessModifier ReturnType methodsName() {
	//     // code belonging to the method here
	// }
	public int getLengthOfName() {
		// the return keyword is used to return some data from a method
		return name.length();
	}
}
