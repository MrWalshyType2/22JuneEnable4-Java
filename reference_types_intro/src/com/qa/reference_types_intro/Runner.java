package com.qa.reference_types_intro;

public class Runner {

	public static void main(String[] args) {
		// String is a reference type
		// - a special reference type that also has a literal value
		//   like the primitive types, i.e., a literal string of characters
		//   is represented within double quotes
		String name = "Bob";
		String greeting = "Good morning";
		
		System.out.print(greeting);
		System.out.print(" ");
		System.out.println(name); 
		// println() adds a new line character to what is printed
		// print() does not add a new line character
		
		// Concatenation allows for two strings to be joined to form a whole
		// new string
		// - we use the + operator to concatenate strings
		// - + is also used for numerical operations
		String fullGreeting = greeting + " " + name;
		System.out.println(fullGreeting);
		
		// String formatting
		// - insert data into a String
		// - %s for strings, %d for int, %n for newline, %f for float
		String fullGreetingAlt = "%s %s".formatted(greeting, name);
		System.out.println(fullGreetingAlt);
		
		// alternately with String formatting, we can print the values directly
		// using the printf() method:
		System.out.printf("%s %d %s %n", greeting, 10, "Fred");
		// equivalent to: System.out.println(greeting + " Fred";
		
		// Escape characters
		// - begin with a \, indicate some character in the string such as a tab
		//   or newline
		System.out.println("This text \n spans over \n multiple \n \t\t\t lines");
		// \n = newline
		// \t = tab
		
		// we can create new strings that are upper or lowercase from existing ones
		String noRef; 
		String uppercasedName = name.toUpperCase();
		String lowercasedName = name.toLowerCase();
		System.out.println(uppercasedName);
		System.out.println(lowercasedName);
		System.out.println(name);
		System.out.println(name.length()); // we can get the length of a string
		
		// when we have lists of items, such as multiple characters in a string,
		// the first character is said to be at position 0 rather than 1
		// - this is known as the index of the character, the index being
		//   the characters position in the string
		char firstCharacterInName = name.charAt(0);
		System.out.println(firstCharacterInName);
		
		// Reference types can have data and methods on them,
		// primitive type can not have data and methods belonging to them
		int x = 3 + 3;
		
		// The easiest way to tell apart a primitive from a reference type
		// is the first letter of the type:
		// - primitive types are all lowercase
		// - reference types (classes) use PascalCase, where each word is 
		//   capitalised
		// - method and variable names use camelCase, where every word after
		//   the first is capitalised
		
		String name2 = "Albert";
		String favouriteColor = "black";
		System.out.println("Hello " + name2 + ", is your favourite colour " 
							+ favouriteColor + "?");
		
		// substring
		// - allows us to get a section of a string
		name = "Fred Barry";
		String surname = name.substring(5);
		System.out.println(surname);
	}

}
