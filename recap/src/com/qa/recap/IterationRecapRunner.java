package com.qa.recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IterationRecapRunner {
	
	// Iteration:
	// - In Agile Scrum, we refer to an iteration as a Sprint
	// - In programming, iteration is where we repeat some instructions some n amount of times.
	//     - While iterating, using a looping statement, we can say that the loop has multiple 
	//       iterations

	public static void main(String[] args) {
		// While statements
		// - might never execute
		// - we use while loops when we don't know in advance how many times we want to execute something
		/*
		 * while (someConditionIsTrue) {
		 *     // execute this code
		 * }
		 */
		
		// While statement example:
		/*
		Scanner sc = new Scanner(System.in);
		boolean inPlay = true; // boolean flag for the loop
		
		while (inPlay) {
			System.out.println("=== MENU ===");
			System.out.println("- EXIT");
			
			System.out.print("> ");
			String input = sc.nextLine();
			
			// switch statements take a single input:
			// - the input may be a: primitive type, a string, a wrapper class for a primitive type
			//                       and enums
			// switch statements have cases, one of these cases usually matches the input
			// - a default case can be supplied for when no other case matches the input value
			switch (input) {
			case "EXIT":
				inPlay = false;
				break;
			case "SOMETHING":
				System.out.println("something");
				break;
			default:
				System.out.println("\nPlease enter a valid option!\n");
				break;
			}
		}
		*/
		
		// Do-while statements
		// - always executes at least once
		// - we use while loops when we don't know in advance how many times we want to execute something
		/*
		 * do {
		 *     // execute this code
		 * } while (someConditionIsTrue);
		 */
		Scanner sc = new Scanner(System.in);
		boolean inPlay = true; // boolean flag for the loop
		
		do {
			System.out.println("=== MENU ===");
			System.out.println("- EXIT");
			
			System.out.print("> ");
			String input = sc.nextLine();
			
			// switch statements take a single input:
			// - the input may be a: primitive type, a string, a wrapper class for a primitive type
			//                       and enums
			// switch statements have cases, one of these cases usually matches the input
			// - a default case can be supplied for when no other case matches the input value
			switch (input) {
			case "EXIT":
				inPlay = false;
				break;
			case "SOMETHING":
				System.out.println("something");
				break;
			default:
				System.out.println("\nPlease enter a valid option!\n");
				break;
			} 
		} while (inPlay);
		
		// For statements
		// - might never execute
		// - we use when we do know how many times we need to execute some instructions
		// - Example of knowing how many times to iterate could be the length of an array
		/*
		 * for (initialisers; terminationCondition; increment/decrement) {
		 *     // code to execute
		 * }
		 */
		System.out.println("COUNTING");
		// counting from 1 to 10 in increments of 1 and 2 to 20 in increments of 2
		for (int i = 1, j = 2; 
			i <= 10 && j <= 20; 
			i++, j += 2) {
			System.out.println(i);
			System.out.println(j);
		}
		System.out.println("END COUNTING");
		
		// NESTED FOR STATEMENTS
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
		// Enhanced for statement
		// - used generally when we only need to read data in an array, arraylist or other collection type
		// - not generally used for modifying data, causes concurrent modification exceptions
		int[] arr = {1,2,3};
		
		// for (dataType localVariableName : collection) { }
		for (int num : arr) {
			System.out.println("The number is: " + num);
		}
		
		// iterating over an array with a for statement	
		// - i <= arr.length - 1 as the final index in the array is always 1 less than its length
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		
		// - i < arr.length as the final index in the array is always 1 less than its length
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// iterating over a 2d array with nested for statements
		System.out.println("Game board:");
		char[][] gameBoard = {
				{' ', 'x', 'o'},
				{' ', 'x', 'o'},
				{' ', 'o', ' '},
		};
		
		for (int row = 0; row < gameBoard.length; row++) {
			System.out.print("| ");
			for (int col = 0; col < gameBoard[row].length; col++) {
				System.out.print(gameBoard[row][col] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		
		System.out.println("Alternate:");
		var gameBoardAlternate = new ArrayList<List<Character>>();
		gameBoardAlternate.add(List.of(' ', 'x', 'O'));
		gameBoardAlternate.add(List.of(' ', 'x', 'O'));
		gameBoardAlternate.add(List.of(' ', 'O', ' '));
		
		for (int row = 0; row < gameBoardAlternate.size(); row++) {
			System.out.print("| ");
			for (int col = 0; col < gameBoardAlternate.get(row).size(); col++) {
				char currentColumn = gameBoardAlternate.get(row).get(col);
				System.out.print(currentColumn + " ");
			}
			System.out.print("|");
			System.out.println();
		}
	}

}
