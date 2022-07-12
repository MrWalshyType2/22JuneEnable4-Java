package exercises.beginner.conditionals;

public class AddTogether {

	/**
	 * Given a two digit number from 10 up to 100, the sum of both digits
	 * will be returned.<br />
	 * <ul>
	 * 	<li>The value <code>0</code> will be returned for invalid input values.
	 * </ul>
	 * For example:<br />
	 * 
	 * <pre><code>
	 * addTogether(33); // 6
	 * addTogether(57); // 12
	 * addTogether(13); // 4
	 * addTogether(5); // 0
	 * addTogether(100); // 0
	 * </code></pre>
	 * @param n1
	 * @return
	 */
	public int play(int n1) {
		
		int result;
		if (String.valueOf(n1).length() != 2) result = 0; 
		else {
			int lastDigit = n1 % 10;
			int slimmedOnce = n1 / 10;
			int secondLast = slimmedOnce % 10;
			
			result = lastDigit + secondLast;
		}
		return result;
	}
}
