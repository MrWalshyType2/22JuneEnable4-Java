package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.utility.StandardOutputReader;

class CalculatorRevisitedTest {

	private StandardOutputReader stdoutReader;
	private CalculatorRevisited calculator;

	@BeforeEach
	void setUp() throws Exception {
		stdoutReader = new StandardOutputReader();
		stdoutReader.redirectStandardOut();
		calculator = new CalculatorRevisited();
	}
	
	@AfterEach
	void teardown() {
		stdoutReader.restoreStandardOutput();
	}

	@ParameterizedTest
	@CsvSource({
		"10,0,0",
		"5543243252,4324.34243,1281869.6349169556", // imprecision due to floating-point arithmetic
		"8324.23422773,0.0103,808178.0803621359"
	})
	void testDivide(double num1, double num2, double expected) throws UnsupportedEncodingException {
		String expectedConsoleOutput = (num2 == 0 ? "Cannot divide by zero" : "");
		assertEquals(expected, calculator.divide(num1, num2));
		assertEquals(expectedConsoleOutput, stdoutReader.read());
	}
	
	@Test
	void testDivisionByZero() throws UnsupportedEncodingException {
		String expected = "Cannot divide by zero";
		assertEquals(0.0, calculator.divide(32, 0));
		assertEquals(expected, stdoutReader.read());
	}

}
