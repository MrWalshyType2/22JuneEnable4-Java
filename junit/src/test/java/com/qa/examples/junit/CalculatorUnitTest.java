package com.qa.examples.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;

public class CalculatorUnitTest {

	private Calculator calculator;

	// usually used for configuring a db in an integration test for example, configuring the class
	// ready for all the tests to run
	@BeforeAll // methods marked @BeforeAll run before all tests in this file run
	public static void setup() {
		System.out.println("Before all tests");
	}

	@BeforeEach // runs before each test, useful for configuring test data
	public void init() {
		System.out.println("Before a test");
		calculator = new Calculator();
	}

	@AfterAll // methods marked @AfterAll run after all tests in this file run
	public static void done() {
		System.out.println("After all tests");
	}

	@AfterEach // runs after each test
	public void tearDown() {
		System.out.println("After a test");
	}
	
	// A test table holds test cases
	/*
	 * | Case               | num1  | num2  | expected  | actual
	 * | Valid addition     | 10    | 10    | 20        |
	 * | Adding zero        | 343.4 | 0     | 343.4     |
	 * | Large number       | 432433| 423423| 855856    |
	 */
	
//	@Test // marks this method as a test
	@ParameterizedTest
	@CsvSource(value = {
			"10,10,20",
			"343.4,0,343.4",
			"432433,423423,855856"
	}) // each string in the array passed to @CsvSource is a test case
	public void addTest(double num1, double num2, double expected) {
		double actual = calculator.add(num1, num2);
		// use a assertion method built into JUnit to check the results where as expected
		Assertions.assertEquals(expected, actual);
	}
	
	@Test // marks this method as a test
	public void factorialTest() {
		int num = 5;
		int expected = 120;
		int actual = calculator.factorial(num);
		
		// use a assertion method built into JUnit to check the results where as expected
		Assertions.assertEquals(expected, actual);
	}
}
