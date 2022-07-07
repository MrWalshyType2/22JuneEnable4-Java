package exercises.beginner.operators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	
	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		this.calculator = new Calculator();
	}

	@ParameterizedTest
	@CsvSource({
		"0.001,1,1.001",
		"0.432,-1,-0.5680000000000001", // imprecision due to floating-point arithmetic
		"134.78,72,206.78",
		"5.0, 5.0, 10.0"
	})
	void testAdd(double num1, double num2, double expected) {
		assertEquals(expected, calculator.add(num1, num2));
	}
	
	@ParameterizedTest
	@CsvSource({
		"430,20,410",
		"0.5,0.3,0.2",
		"9879877983.337,493.4232,9.8798774899138E9",
	})
	void testSubtract(double num1, double num2, double expected) {
		assertEquals(expected, calculator.subtract(num1, num2));
	}
	
	@ParameterizedTest
	@CsvSource({
		"0.001,1,0.001",
		"0.432,-1,-0.432",
		"0.432,-432.432,-186.81062400000002",
		"756,320,241920"
	})
	void testMultiply(double num1, double num2, double expected) {
		assertEquals(expected, calculator.multiply(num1, num2));
	}
	
	@ParameterizedTest
	@CsvSource({
		"0,10,0",
		"5543243252,4324.34243,1281869.6349169556", // imprecision due to floating-point arithmetic
		"8324.23422773,0.0103,808178.0803621359"
	})
	void testDivide(double num1, double num2, double expected) {
		assertEquals(expected, calculator.divide(num1, num2));
	}

}
