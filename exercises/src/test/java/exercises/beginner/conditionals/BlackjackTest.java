package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BlackjackTest {
	
	private Blackjack blackjack;

	@BeforeEach
	void setUp() throws Exception {
		this.blackjack = new Blackjack();
	}

	@ParameterizedTest
	@CsvSource({
		"10,21,21",
		"20,18,20",
		"1,22,1",
		"22,23,0"
	})
	void testPlay(int n1, int n2, int expected) {
		assertEquals(expected, blackjack.play(n1, n2));
	}

}
