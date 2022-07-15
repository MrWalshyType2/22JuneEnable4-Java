package com.qa.oop_menu;

import java.util.Scanner;

public class InputUtilities {

	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
	
	public static int getInt(String prompt) {
		System.out.print(prompt);
		return sc.nextInt();
	}

}
