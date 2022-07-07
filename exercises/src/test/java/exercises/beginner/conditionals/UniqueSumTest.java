package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UniqueSumTest {
	
	private UniqueSum uniqueSum;

	@BeforeEach
	void setUp() throws Exception {
		uniqueSum = new UniqueSum();
	}

	@ParameterizedTest
	@CsvSource({
		"1,2,3,6",
		"3,3,3,0",
		"1,1,2,2"
	})
	void testUniqueSum(int n1, int n2, int n3, int expected) {
		assertEquals(expected, uniqueSum.play(n1, n2, n3));
	}

}
