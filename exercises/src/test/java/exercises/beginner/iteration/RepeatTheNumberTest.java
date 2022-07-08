package exercises.beginner.iteration;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.utility.StandardOutputReader;

class RepeatTheNumberTest {

	private StandardOutputReader stdoutReader;
	private RepeatTheNumber repeatTheNumber;

	@BeforeEach
	void setUp() throws Exception {
		stdoutReader = new StandardOutputReader();
		stdoutReader.redirectStandardOut();
		repeatTheNumber = new RepeatTheNumber();
	}
	
	@AfterEach
	void teardown() {
		stdoutReader.restoreStandardOutput();
	}


	@Test
	void testPrintOneThroughTenQuestion1() throws UnsupportedEncodingException {
		String expected = "1111111111\r\n"
				+ "2222222222\r\n"
				+ "3333333333\r\n"
				+ "4444444444\r\n"
				+ "5555555555\r\n"
				+ "6666666666\r\n"
				+ "7777777777\r\n"
				+ "8888888888\r\n"
				+ "9999999999\r\n"
				+ "10101010101010101010";
		repeatTheNumber.printOneThroughTenQuestion1();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintOneThroughTenQuestion2() throws UnsupportedEncodingException {
		String expected = "1\r\n"
				+ "22\r\n"
				+ "333\r\n"
				+ "4444\r\n"
				+ "55555\r\n"
				+ "666666\r\n"
				+ "7777777\r\n"
				+ "88888888\r\n"
				+ "999999999\r\n"
				+ "10101010101010101010";
		repeatTheNumber.printOneThroughTenQuestion2();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

}
