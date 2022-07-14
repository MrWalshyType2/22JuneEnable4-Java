package com.qa.oop_menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtilities {

	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
	
	public static int getInt(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return sc.nextInt();
			} catch (InputMismatchException | IllegalArgumentException e) {
				System.out.println("Please enter a number.");
			}
		}
	}

	public static long getLong(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return sc.nextLong();
			} catch (InputMismatchException | IllegalArgumentException e) {
				System.out.println("Please enter a number.");
			}
		}
	}

}
