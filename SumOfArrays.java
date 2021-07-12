package exercisesSlides;

public class SumOfArrays {

	/*
	 * Find the sum of elements whose indexes are same in arr1 and arr2:
	 * 
	 * 
	 * arr1 = { {1, 2}, {3, 4, 5}, {6} } arr2 = { {7, 8, 9}, {10, 11}, {12} }
	 * 
	 * (arr1[0][0] + arr2[0][0]) + (arr1[0][1] + arr2[0][1]) + (arr1[1][0] +
	 * arr2[1][0]) + ...........
	 * 
	 * �ki dizide'de ayn� olan indexler toplanacak. �renk; arr1'de 0-3 yok ama
	 * arr2'de var. O zaman arr2'nin 0-3. eleman� bo�ta kalacak, hi� bir say�yla
	 * toplanmayacak. Dolay�s� ile, her dizinin hangi indexindeki dizi daha k�saysa,
	 * onun se�ilmesi ve ona g�re gidilmesi gerek.
	 * 
	 * 
	 * (1+7) + (2+8) + (3+10) + (4+11) + (6+12) = 64
	 * 
	 */
	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2 }, { 3, 4, 5 }, { 6 }, { 7, 8, 9 } };
		int[][] arr2 = { { 7, 8, 9 }, { 10, 11 }, { 12 }, { 15 } };

		System.out.println(sumOfSameIndexes(arr1, arr2));

	}

	static int sumOfSameIndexes(int[][] arr1, int[][] arr2) {
		int sum = 0;
		// T�m d�ng�, hangi arr daha az dizi i�eriyorsa, o dizinin uzunlu�u kadar
		// d�necek.
		int outerLen = arr1.length < arr2.length ? arr1.length : arr2.length;
		for (int i = 0; i < outerLen; i++) {
			// Hangi dizinin i�erdi�i dizi daha k�saysa, onun uzunlu�u kadar say�
			// toplanacak.
			int innerLen = arr1[i].length < arr2[i].length ? arr1[i].length : arr2[i].length;
			for (int j = 0; j < innerLen; j++) {
				sum += arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}

}
