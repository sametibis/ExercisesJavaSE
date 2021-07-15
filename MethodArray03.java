package replitQuestions;

public class MethodArray03 {

	/*
	 * Write a method which accepts a String as parameter and prints the sum of the
	 * digits, present in the given string.
	 * 
	 * input : ade1r4d3
	 * 
	 * output : 8
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(sumOfDigits("ade1r4d3"));
	}

	static int sumOfDigits(String str) {
		char[] arr = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		return sum;
	}

}
