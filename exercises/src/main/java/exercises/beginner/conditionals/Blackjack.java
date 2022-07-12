package exercises.beginner.conditionals;

public class Blackjack {

	public int play(int n1, int n2) {
		
		int result = 0;
		
		// int distance1 = 21-n1;
		// int distance2 = 21-n2;
		
		// if (distance1 < 0 && distance2 < 0) {
		//	result = 0;
		//}
		
		//else if (distance2 > distance1 & distance1 >= 0) {
			result = n1;
//		}
//		else if (distance1 > distance2 & distance2 >= 0) {
//			result = n2; 
//		}
	
		if (n1 > 21 && n2 > 21) {
			result = 0;
		}
		else if (n1>n2) {
			if (n1 <= 21) {
				result = n1;
			} else result = n2;
		}
		else if (n2 > n1) {
			if (n2 <= 21) {
				result = n2;
			} else result = n1;
		}
			
		return result;
    }
}
