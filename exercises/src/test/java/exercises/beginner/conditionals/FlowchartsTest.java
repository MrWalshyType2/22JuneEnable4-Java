package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import exercises.utility.StandardOutputReader;

class FlowchartsTest {
	
	private StandardOutputReader stdoutReader;
	private Flowcharts flowcharts;

	@BeforeEach
	void setUp() throws Exception {
		stdoutReader = new StandardOutputReader();
		stdoutReader.redirectStandardOut();
		flowcharts = new Flowcharts();
	}

	@AfterEach
	void tearDown() throws Exception {
		stdoutReader.restoreStandardOutput();
	}

	@ParameterizedTest
	@CsvSource({
		"5,5,true,10",
		"10,10,false,100"
	})
	void testQuestion1(int num1, int num2, boolean isAddition, int expected) {
		assertEquals(expected, flowcharts.question1(num1, num2, isAddition));
	}

}
