package com.qa.examples.junit;

public class Calculator {

	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 - num2;
	}
	
	public int factorial(int num) {
		int sum = num;
		for (int i = num - 1; i > 1; i--) {
			sum *= i;
		}
		return sum;
	}
}
