package exercises.beginner.operators;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.utility.StandardOutputReader;

class ResultsTest {
	
	private StandardOutputReader stdoutReader;
	private Results results;

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
		results = new Results();
		results.physicsScore = 32;
		results.chemistryScore = 55;
		results.biologyScore = 32;
		String expectedHeader = 
				"###############\r\n"
				+ "# EXAM SCORES #\r\n"
				+ "###############";
		String expectedBody = 
				"PHYSICS: 32\r\n"
				+ "CHEMISTRY: 55\r\n"
				+ "BIOLOGY: 32";
		
		String expectedFooter = 
				"TOTAL SCORE: 119/450\r\n"
				+ "PERCENTAGE: 26%";

		results.displayResults();
		assertTrue(stdoutReader.contains(expectedHeader), 
				"\nExpected output to contain: \n\n" + expectedHeader + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedBody), 
				"\nExpected output to contain: \n\n" + expectedBody + "\n\nbut actually got: \n\n" + stdoutReader.read());
		assertTrue(stdoutReader.contains(expectedFooter), 
				"\nExpected output to contain: \n\n" + expectedFooter + "\n\nbut actually got: \n\n" + stdoutReader.read());
	}

	@ParameterizedTest
	@CsvSource({
		"32,55,32,26",
		"60,60,60,40",
		"104,134,97,74"
	})
	void testDisplayPercentage(int physics, int chemistry, int biology, int totalPercentage) throws UnsupportedEncodingException {
		String expected = "PERCENTAGE: %s%s".formatted(totalPercentage, "%");
		results = new Results();
		results.physicsScore = physics;
		results.chemistryScore = chemistry;
		results.biologyScore = biology;
		results.displayPercentage();
		assertTrue(stdoutReader.contains(expected), 
				"\nExpected output to contain: \n\n" + expected + "\n\nbut actually got: \n\n" + stdoutReader.read());
	}

}
