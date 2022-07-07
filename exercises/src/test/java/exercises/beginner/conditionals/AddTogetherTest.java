package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AddTogetherTest {
	
	private AddTogether addTogether;

	@BeforeEach
	void setUp() throws Exception {
		addTogether = new AddTogether();
	}

	@ParameterizedTest
	@CsvSource({
		"11,2",
		"5,0",
		"32,5",
		"100,0",
		"55,10",
		"99,18"
	})
	void testAddTogether(int num, int expected) {
		assertEquals(expected, addTogether.play(num));
	}

}
