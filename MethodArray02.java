package replitQuestions;

public class MethodArray02 {
	/*
	 * 
	 * Write a Java program that reverse a sentence by using Array (with all spaces
	 * and special characters).
	 * 
	 * Input : Coding is greate.
	 * 
	 * Output : .etaerg si gnidoC
	 */
	public static void main(String[] args) {
		// First
		System.out.println(reverseString("Coding is greate."));
		
		// Second
		System.out.println(reverseString2("Coding is greate."));
	}

	// First Way;
	static char[] reverseString(String str) {
		char[] newArr = new char[str.length()];

		for (int i = str.length() - 1; i >= 0; i--) {
			newArr[str.length() - i - 1] = str.charAt(i);
		}
		// System.out.println(String.copyValueOf(newArr)); => .etaerg si gnidoC
		return newArr; // .etaerg si gnidoC
	}

	// Second Way - Swap method: Use a variable to "swap"
	static String reverseString2(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return String.copyValueOf(arr);
	}

}
