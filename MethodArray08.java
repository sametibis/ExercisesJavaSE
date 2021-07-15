package replitQuestions;

import java.util.Arrays;

public class MethodArray08 {

	/*
	 * 
	 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
	 * array into a new Array and prints it.
	 * 
	 * Input1={1,2,3,4}
	 * 
	 * Input2={5,6}
	 * 
	 * Output={1,2,3,4,5,6}
	 * 
	 */

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6 };

		System.out.println(Arrays.toString(addArrays(arr1, arr2)));
	}

	static int[] addArrays(int[] arr1, int[] arr2) {

		int[] added = new int[arr1.length + arr2.length];
		
		// Concatenate Two Arrays without using arraycopy
		/*
		for (int i = 0; i < arr1.length; i++) {
			added[i] = arr1[i];
		}

		for (int i = arr1.length, j = 0; i < added.length; i++, j++) {
			added[i] = arr2[j];
		}
		*/
		
		
		// Concatenate Two Arrays using arraycopy() method.
		System.arraycopy(arr1, 0, added, 0, arr1.length);
		System.arraycopy(arr2, 0, added, arr1.length, arr2.length);
		return added;
	}

}
