package exercises.beginner.arrays;

public class StringifyNumbers {
	
	public static void main(String[] args) {
		var sn = new StringifyNumbers();
		String num = sn.oneToNinetyNine(7);
		System.out.println(num);
		
		num = sn.oneToNineHundredNinetyNine(390);
		System.out.println(num);
	}
	
	private String units[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };
	private String uniques[] = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };

	public String oneToNinetyNine(int num) {
		if (num > 99) {
			return "TOO BIG";
		} else if (num < 0) {
			return "TOO SMALL";
		}
		StringBuilder sb = new StringBuilder();

		if (num >= 20) {
			sb.append(tens[num / 10]);
			num = num % 10;
			if (num != 0) sb.append("-");
			// get the ones place
			sb.append(units[num]);
			num /= 10;
		}
		if (num >= 10) {
			sb.append(uniques[num % 10]);
			num = 0;
		}
		if (num > 0) {
			sb.append(units[num]);
		}
		String output = sb.toString();
		return output.equals("") ? "zero" : output;
	}
	
	public String oneToNineHundredNinetyNine(int num) {
		if (num > 999) {
			return "TOO BIG";
		} else if (num < 0) {
			return "TOO SMALL";
		}
		StringBuilder sb = new StringBuilder();

		if (num >= 100) {
			sb.append(units[num / 100]);
			sb.append("-hundred");
			num %= 100; // remove the hundreds
			if (num != 0) sb.append(" and ");
		}
		if (num >= 20) {
			sb.append(tens[num / 10]);
			num = num % 10; // get the ones place
			if (num != 0) sb.append("-");
			sb.append(units[num]);
			num /= 10;
		}
		if (num >= 10) {
			sb.append(uniques[num % 10]);
			num = 0;
		}
		if (num > 0) {
			sb.append(units[num]);
		}
		String output = sb.toString();
		return output.equals("") ? "zero" : output;
	}
}
 