package practiceOzkanAyata;

import java.util.Arrays;

public class Homeworks {

	// 9. Write a method that accepts an Array of integers and returns the max.

	// 10. Write a method that accepts an Array of integers and returns the second
	// max.

	// 11. Write a method that accepts an Array of ints returns the sorted Array in
	// ascending order.Do not use the sort method.

	public static void main(String[] args) {
		int array[] = {189,-5, 87, 10, 20, 25, 63, 96, 57};
		
		System.out.println(findMax(array));
		System.out.println(findSecondMax(array));
		System.out.println(Arrays.toString(ascendingSorter(array)));

	}
	
	
	// 9
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	// 10
	static int findSecondMax(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		// to see, duplicate elements deleted or not?
		System.out.println(list); // [-5, 10, 20, 25, 57, 63, 87, 96, 189]
​
		return list.get(list.size()-2);
	}
	
	// 11: Not use the sort() method
	static int[] ascendingSorter(int[] arr) {
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
}
