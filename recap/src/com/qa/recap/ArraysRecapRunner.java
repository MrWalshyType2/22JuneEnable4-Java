package com.qa.recap;

import java.util.ArrayList;

public class ArraysRecapRunner {
	
	// Array is a data structure in programming
	// - a way of storing data
	// - you can have multiple values in array
	//
	// There's different types of array:
	// - static: 
	//   - This is the default type built-in to Java, static arrays have a fixed capacity.
	//   - You can modify its contents but not its capacity, it's a mutable data structure,
	//     where mutable means we can modify its data.
	//   - we have a literal syntax for it: int[] arr = { 1, 2, 3 };
	// - dynamic: 
	//   - the capacity of the array is not fixed, it increases or decreases as required
	//   - usually their is an optimised algorithm (set of programming instructions) for
	//     for handling resizing the array
	//   - The ArrayList type is the dynamic implementation of an array in Java

	public static void main(String[] args) {
		// === STATIC ARRAYS ===
		// declaring:
		// - type[] name;
		// initialising an array:
		// - type[] name = { values... }; // array initialiser, can only be used on the same line as the declaration
		// - type[] name = new type[capacity];
		// We cannot mix primitive and reference types in an array
		
		// primitive array
		// - the primitive values are stored inside the array object stored in the heap
		int[] intArray = { 1, 2, 3 };
		
		// array of reference types
		// - stores the references to the strings inside the array object in the heap
		String[] stringArray = { "Hello", "World" };
		
		// declaring and initialising afterwards
		int[] anotherArray;
		anotherArray = new int[10]; // initialise with a capacity
		anotherArray = new int[] { 1, 2, 3 }; // initialise using an initialiser, capacity is inferred

		// accessing an array
		System.out.println(intArray[1]);
		
		// Multi-dimensional arrays
		// - an array of arrays
		char[][] gameBoard = {
				{' ', 'x', 'o'},
				{' ', 'x', 'o'},
				{' ', 'o', ' '},
		};
		// 2d arrays can easily be thought about as having rows and columns
		int row = 0;
		int column = 1;
		System.out.println(gameBoard[row][column]);
		
		// Dynamic arrays
		// - the ArrayList type in Java uses the diamond operator, this accepts a data type
		//   representing what type of data will be stored in the list
		// - uses methods rather than literal syntax
		ArrayList<String> listOfStrings; // stores a list of strings
		listOfStrings = new ArrayList<>(); 
		// Java can infer the type of the ArrayList to be created as its variable already has
		// declared that type, so an ArrayList of String in this case
		
		// adding to the list
		listOfStrings.add("Hello"); // appended
		listOfStrings.add(0, "Bye"); // added to beginning
		System.out.println(listOfStrings);
		
		// removing from the list
		listOfStrings.remove(0); // remove by index
		listOfStrings.remove("Hello");
		System.out.println(listOfStrings);
		
		// size() returns the number of elements in the list
		listOfStrings.size();
		
		if (!listOfStrings.contains("Hello world")) {
			listOfStrings.add("Hello world");
		}
		System.out.println(listOfStrings);
	
	}

}
