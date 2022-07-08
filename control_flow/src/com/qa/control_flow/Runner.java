package com.qa.control_flow;

public class Runner {

	public static void main(String[] args) {
		// Equality operators
		// ==   : binary operation that returns true if the left and the right primitive values are
		//        the same or the reference in the variable (for a reference type) are the same.
		// !=   : inverse of ==, returns true if the the left and the right primitive values are
		//        different or the references are different.
		
		// Relational operators:
		// - <, >, <=, >=
		// - applied to numeric operands
		// - the result is a boolean
		int temperature = 31; // c
		boolean isTooHot = (temperature > 30);
		
		// Ternary conditional statement:
		// - has three operands
		// - (boolean_expression) ? valueIfTrue : valueIfFalse;
		String output = (isTooHot) ? "Get the damn fan on" : "Who left the barn door open";
		System.out.println(output);
		
		// if statements accept a boolean expression and execute their contained code
		// if the expression is true
		// - if (boolean_expression) {  }
		if (isTooHot == true) {
			// if isTooHot is true, this code runs
			System.out.println("Get the fan on");
			
			// we are in a code block
			// - variables declared in this block cannot be accessed outside of it
			int x = 3;
		} else {
			// if isTooHot is false, this code runs instead
			System.out.println("Someone put the wood in the hole");
//			x = 5; // cannot do as x is not in the same scope
		}
		
		// Want to run code dependent on multiple conditions:
		// - if temperature is greater than 30, print "it is too hot"
		// - if temperature is less than 10, print "it is too cold",
		// - otherwise print "it just right"
		//
		// To handle the case where we have more than 2 different branches of code that 
		// we could follow, we use the if else statement to add additional checks:
		temperature = 15;
		System.out.println("\nIF ELSE EXAMPLE:\n");
		if (temperature > 30) {
			System.out.println("It is too hot");
		} else if (temperature < 10) {
			System.out.println("It is too cold");
		} else {
			System.out.println("It's just right");
		}
		
		// Boolean logical operators:
		// - bitwise
		// - short-circuit
		// AND, OR, NOT
		// - NOT = !
		
		// Bitwise
		// - both operands are checked no matter what
		// - AND = &
		// - OR  = |
		boolean isCloudy = true;
		boolean isRaining = false;
		
		if (isCloudy & isRaining) {
			System.out.println("It is cloudy and raining");
		}
		
		if (isCloudy | isRaining) {
			System.out.println("Weather is a bit dismal today");
		}
		
		// if (isRaining == false)
		if (!isRaining) {
			System.out.println("It is not raining");
		}
		
		// Shortcircuit:
		// - AND = &&
		// - OR  = ||
		// Shortcircuit AND will only evaluate the right operand if the left was true
		// Shortcircuit OR will only evaluate the right operand if the left was false
		if (true && doesSomething()) {
			System.out.println("Left operand was true, so doesSomething() was executed");
		}
		System.out.println();
		if (true || doesSomething()) {
			System.out.println("One of either operand was true");
		}
	}

	public static boolean doesSomething() {
		System.out.println("Does something :D");
		return true;
	}
}
