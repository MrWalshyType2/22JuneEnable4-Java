package com.qa.primitive_types;

public class Runner {

	public static void main(String[] args) {
		// Variable:
		// - Stores a value
		// - Value can change over time
		
		// Primitive data types:
		// - The smallest pieces of data that we can represent in Java
		
		// How do we declare a variable?
		// - Python is dynamically typed, we can just create a variable
		//   that can represent any value, i.e., x = 3, x = "hello", etc...
		// - Java is statically typed, meaning we MUST specify the type
		//   of data being stored in the variable.
		
		// Structure of a variable declaration:
		// DataType variableName;
		// - the case of the type matters
		boolean isAlive;
		
		// Structure of a variable declaration that is also initialised
		// upon declaration:
		boolean isSwimming = false;
		System.out.println(isSwimming); // print the value of isSwimming
		isSwimming = true; 
		// We can also initialise variables after their declaration:
		isAlive = true;  
		// = is the assignment operator
		// - what is on the right of the = is assigned to the variable on
		//   the left
		
		// Booleans (logical primitive type)
		// - yes (true) or no (false) value
		// - asking a yes or no question, isAlive, isSwimming, isDriving
		
		// Numerical primitive types:
		// - byte
		byte min = -128;
		byte max = 127;
		// - char (must be specified within single quotes)
		// - https://www.asciitable.com/
		char someCharacter = 'A';
		// char someChar = "A"; // is invalid
		char lowercaseOfSomeCharacter = (char)(someCharacter + 32);
		System.out.println(someCharacter);
		System.out.println(lowercaseOfSomeCharacter);
		// - short
		short smallNumber = 4324; // max num of 2^16 - 1
		// - int
		//    - we can put smaller data types inside of larger ones when it comes to numbers
		int myNumber = smallNumber;
		//    - but not the other way around
//		short cannotDo = myNumber;
		// - long: max num of 2^64 - 1
		long bigNumber = 42342423423423L;
		//   - the L must be specified as Java views whole numbers as integers 
		//     by default
		// - float
		//   - must be suffixed with an f or F
		float pi = 3.14f;
		// - double
		//   - are the default for decimal values
		double evenBigger = 3.1434234324243243;
		
		System.out.println(evenBigger);
		System.out.println(pi + myNumber);
		
		// The convention when naming variables in Java is camelCase:
		// - every second word is capitalised
		boolean isRunning = false;
		
		// Identifier names:
		// - no reserved keywords
//		float class = 32.3f; // invalid
		// - identifiers are case sensitive
		//   - isRunning and IsRunning are two different identifiers
		// - cannot be literal values such as false, true, 0, 3, 3.14
//		int 3 = 32; // invalid
		// - may start with a letter, dollar symbol or underscore
		int x = 32;
		int $x = 54;
		int _x = 33;
		// - may not start with a number, but may contain a number
//		int 3x = 32; // invalid
		int x3 = 32; // valid
		// - may not contain whitespace
//		int x 3 = 32; // invalid
		// - cannot contain special symbols
//		int #@xb = 32; // invalid
	}

}
