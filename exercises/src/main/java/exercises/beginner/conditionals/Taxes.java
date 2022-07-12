package exercises.beginner.conditionals;

public class Taxes {
	
	int taxRate;

	public int calculateTaxRate(int salary) {
		
		if (salary >= 0 && salary <= 14999) {
			taxRate = 0;
		}
		else if (salary >= 15000 && salary <= 19999) {
			taxRate = 10;
		}
		else if (salary >= 20000 && salary <= 29999) {
			taxRate = 15;
		}
		else if (salary >= 30000 && salary <= 44999) {
			taxRate = 20;
		}
		else if (salary >= 45000) {
			taxRate = 25;
		}
		
		return taxRate;
	}
	
	public int calculateTax(int salary) {
		
		return salary * calculateTaxRate(salary) / 100;
		
	}
}
