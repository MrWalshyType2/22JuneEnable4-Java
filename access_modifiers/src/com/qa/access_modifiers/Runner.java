package com.qa.access_modifiers;

import com.qa.access_modifiers.classes.ClassB;

public class Runner {

	public static void main(String[] args) {
		ClassA classA = new ClassA("some text"); // ClassA is public, so it is accessible anywhere. It's constructor
		// is also public.
		System.out.println(classA.getField()); // ClassA has a private field but a public method for getting the value of the field
//		classA.field; // not accessible as it is private
		
		ClassB classB = new ClassB("Some value"); // can create as its public
//		ClassC classC = new ClassC(); // cannot do as ClassC is package-private
		
		// classB.protectedField; // not accessible as it is a protected field, 
		// Runner is not in the same package
		
		classB.createInstanceOfC();
	}
}
