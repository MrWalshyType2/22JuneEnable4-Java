package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.utility.StandardOutputReader;

class ResultsRevisitedTest {
	
	private StandardOutputReader stdoutReader;

	@BeforeEach
	void setUp() throws Exception {
		stdoutReader = new StandardOutputReader();
		stdoutReader.redirectStandardOut();
	}
	
	@AfterEach
	void teardown() {
		stdoutReader.restoreStandardOutput();
	}

	@Test
	void testDisplayResults() throws UnsupportedEncodingException {
		ResultsRevisited results = new ResultsRevisited();
		results.physics = 98;
		results.chemistry = 130;
		results.biology = 122;
		String expectedHeader = 
				"###############\r\n"
				+ "# EXAM SCORES #\r\n"
				+ "###############";
		String expectedBody = 
				"PHYSICS: 98/150\r\n"
				+ "CHEMISTRY: 130/150\r\n"
				+ "BIOLOGY: 122/150";
		
		String expectedFooter = 
				"TOTAL SCORE: 350/450\r\n"
				+ "PASSED: 77%";

		results.displayResults();
		assertTrue(stdoutReader.contains(expectedHeader), 
				"\nExpected output to contain: \n\n" + expectedHeader + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedBody), 
				"\nExpected output to contain: \n\n" + expectedBody + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedFooter), 
				"\nExpected output to contain: \n\n" + expectedFooter + "\n\nbut actually got: \n\n" + stdoutReader.read());
	}
	
	@Test
	void failedChemistryTest() throws UnsupportedEncodingException {
		ResultsRevisited results = new ResultsRevisited();
		results.physics = 98;
		results.chemistry = 30;
		results.biology = 122;
		results.displayResults();
		
		String expected = "FAILED CHEMISTRY: 20%";
		String expectedFailure = "FAILED: 55%";
		assertTrue(stdoutReader.contains(expected), 
				"\nExpected output to contain: \n\n" + expected + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedFailure), 
				"\nExpected output to contain: \n\n" + expectedFailure + "\n\nbut actually got: \n\n" + stdoutReader.read());
	}

	@Test
	void failedPhysicsTest() throws UnsupportedEncodingException {
		ResultsRevisited results = new ResultsRevisited();
		results.physics = 22;
		results.chemistry = 30;
		results.biology = 122;
		results.displayResults();
		
		String expected = "FAILED PHYSICS: 14%";
		String expectedFailure = "FAILED: 38%";
		assertTrue(stdoutReader.contains(expected), 
				"\nExpected output to contain: \n\n" + expected + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedFailure), 
				"\nExpected output to contain: \n\n" + expectedFailure + "\n\nbut actually got: \n\n" + stdoutReader.read());
	}
	
	@Test
	void failedBiologyTest() throws UnsupportedEncodingException {
		ResultsRevisited results = new ResultsRevisited();
		results.physics = 98;
		results.chemistry = 30;
		results.biology = 59;
		results.displayResults();
		
		String expected = "FAILED BIOLOGY: 39%";
		String expectedFailure = "FAILED: 41%";
		assertTrue(stdoutReader.contains(expected), 
				"\nExpected output to contain: \n\n" + expected + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedFailure), 
				"\nExpected output to contain: \n\n" + expectedFailure + "\n\nbut actually got: \n\n" + stdoutReader.read());
	}
}
