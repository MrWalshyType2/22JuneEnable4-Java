package com.qa.assignment_and_arithmetic_operators;

public class Runner {

	public static void main(String[] args) {
		// Arithmetic operators:
		// + : Additive operator
		// - : Subtraction operator
		// * : Multiplication operator
		// / : Division operator
		// % : Modulo operator: Returns the remainder of a division
		
		int sum = 3 + 3;
		System.out.println("SUM OF 3 + 3: " + sum);
		
		int difference = 10 - 3;
		System.out.println("DIFFERENCE OF 10 - 3: " + difference);
		
		int product = 10 * 10;
		System.out.println("PRODUCT OF 10 x 10: " + product);
		
		int quotient = 10 / 2;
		System.out.println("QUOTIENT OF 10 / 2: " + quotient);
		
		int remainder = 10 % 2;
		System.out.println("REMAINDER OF 10 % 2: " + remainder);
		
		
		// Modulo operator tips and tricks:
		// 1. We can check if a number is even
		// - == is the equality operator, it checks if the variables are equal to each other
		// - only use == for primitive types, for reference types it does not check the values (fields)
		//   that may be contained in them
		// - the result of (x == y) is always a boolean, it is either true or false
		int n = 1148239742;
		boolean isEven = (n % 2 == 0);
		// any number % 2 that results in 0 is even
		// any number % 2 that results in 1 is odd
		System.out.println(n + " is even: " + isEven);
		
		// 2. We can retrieve the values at different places in a number using division and modulo
		n = 237;
		// if you divide numbers and store the result in an integer variable, all
		// decimal numbers are truncated (removed from the number) without rounding
		int hundreds = n / 100; // 2
		int tens = (n % 100) / 10 ; // 237 % 100 = 37, 37 / 10 = 3
		int units = n % 10; // 7
		System.out.println(n);
		System.out.println("NUM OF HUNDREDS: " + hundreds);
		System.out.println("NUM OF TENS: " + tens);
		System.out.println("NUM OF UNITS: " + units);
	
		// Compound assignment operators
		// - Allow us to perform arithmetic operations and assign the result using a shortcut
		int num1 = 23;
		
		num1 += 2; // num1 = num1 + 2;
		num1 -= 2; // num1 = num1 - 2;
		num1 *= 2; // num1 = num1 * 2;
		num1 /= 2; // num1 = num1 / 2;
		num1 %= 2; // num1 = num1 % 2;
		
		// Precedence:
		// - Which operation is executed before another (order of operations)
		// - BIDMAS/BODMAS/PEMDAS applies here
		// BIDMAS = Brackets Indices Division Multiplication Addition Subtraction
		
		// Associativity:
		// - The order in which operations are executed
		// - left to right: 3 + 5 + 8, 3 + 5 = 8 + 8 = 16
		// - right to left: expression++; 3++ = 4
		// 3 * 10 / 4 % 2 = (3 * 10) / 4 % 2 = ((3 * 10) / 4) % 2 = ((3* 10) / 4) % 2)
		// assignment is right to left:
		// - the value on the right of the equals sign is evaluated first and then
		//   stored in the variable on the left
		int x = 32 + 5; // int x = (32 + 5), (int x = (32 + 5))
		
		// 3 * 10 / 4 % 7++
		// 3 * 10 / 4 % (7++)
		// ((((3 * 10) / 4) % (7++)))
		
		int i = 7;
		System.out.println(i++); // the addition runs after i is printed
		System.out.println(i); // i++ is i += 1
	}

}
