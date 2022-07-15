package com.qa.recap;

import java.util.ArrayList;
import java.util.List;

public class ClassesRecapRunner {

	public static void main(String[] args) {
		// Declaring variables
		// - a variable just holds a single value
		// - always done with the same structure
		// - the data types may differ, primitive or reference
		//
		// DataType variableName = value;
		int number1 = 32;
		int number2 = 50;
		int sum = number1 + number2;
		System.out.println(sum);

		// primitive types are just a value, they don't have any methods or properties that
		// can be accessed with dot notation, i.e., sum.doSomething() is not possible
		
		// Reference types are easily distinguished from primitive types by the first character
		// in the type, the first character of a reference type is capitalised.
		String name = "Fred";
		List<String> listOfNames = List.of("Fred", "Bob", "Sarah");
		
		// Reference types have methods and variables inside them
		// - these can belong to an object, instance members, or they can belong to the class itself
		name.length(); // instance method that belongs the String object reference by the name variable
		
		Todo task; // declared a variable of type Todo called task
		task = new Todo(); // initialise
		
		// Structure for creating a variable of a reference type:
		// - ClassName variableName = new ClassName();
		
		// We can access fields and methods in an object using dot notation.
//		Todo.name // illegal, name belongs to an object of type Todo not the class itself
		task.name = "exercise 1"; // assigning the string "exercise 1" to the name field on the task Todo object
		task.storyPoints = 5;
		
		System.out.println(task.name);
		
		// The problem: Get the length of the task Todo objects name
		// Subproblems:
		// - declare a variable that can store an integer
		// - assign the variable the length of the name
		int lengthOfTaskName = task.getLengthOfName(); // assigning the value returned
		// from task.getLengthOfName() to the integer variable lengthOfTaskName
		System.out.println(lengthOfTaskName);
	}
}
