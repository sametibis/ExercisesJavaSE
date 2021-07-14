package replitQuestions;

public class MethodArray01 {

	/*
	 * Write a return method to reverse number.
	 * 
	 * Input : 12345
	 * 
	 * Output : 54321
	 */

	public static void main(String[] args) {
		
		// First;
		System.out.println(reverseNum("12345"));

		// Second;
		StringBuffer num = new StringBuffer("12345");
		System.out.println(reverseNum2(num));
		
		// Third;
		System.out.println(reverseNum3(12345));

	}
	
	// First Way:
	static String reverseNum(String num) {
		String reverse = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			reverse += num.charAt(i);
		}
		return reverse;
	}

	// Second Way:
	static StringBuffer reverseNum2(StringBuffer num) {
		num.reverse();
		return num;
	}

	// Third Way:
	static int reverseNum3(int num) {
		int  remainder = 0;
		int reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		return reverse;
	}

}
