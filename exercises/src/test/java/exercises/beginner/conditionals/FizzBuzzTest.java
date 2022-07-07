package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@BeforeEach
	void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@ParameterizedTest
	@CsvSource({
		"3,Fizz",
		"5,Buzz",
		"10,Buzz",
		"15,FizzBuzz",
		"17,17"
	})
	void testPlay(int num, String expected) {
		assertEquals(expected, fizzBuzz.play(num));
	}

}
