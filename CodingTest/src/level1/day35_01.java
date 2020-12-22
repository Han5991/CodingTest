package level1;

class Solution42 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}

public class day35_01 {

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2 }, { 2, 3 } };
		int arr2[][] = { { 3, 4 }, { 5, 6 } };

		for (int[] a : new Solution42().solution(arr1, arr2))
			for(int b : a) {
				System.out.println(b);
			}
	}

}
