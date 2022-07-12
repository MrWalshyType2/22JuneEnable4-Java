
package exercises.beginner.conditionals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TaxesTest {

	private Taxes taxes;
	
	@BeforeEach
	void setUp() throws Exception {
		this.taxes = new Taxes();
	}

	@ParameterizedTest
	@CsvSource({
		"12000,0",
		"15000,10",
		"20000,15",
		"30000,20",
		"45000,25"
	})
	void testCalculateTaxRate(int salary, int expected) {
		assertEquals(expected, taxes.calculateTaxRate(salary));
	}

	@ParameterizedTest
	@CsvSource({
		"12000,0",
		"15000,1500",
		"20000,3000",
		"30000,6000",
		"45000,11250"
	})
	void testCalculateTax(int salary, int expected) {
		assertEquals(expected, taxes.calculateTax(salary));
	}

}
