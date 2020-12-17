package level2;

import java.util.Arrays;

class Solution40 {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[(B.length - 1) - i];
		}
		return answer;
	}
}

public class day33_01 {

	public static void main(String[] args) {

		int A[] = { 1, 2 };
		int B[] = { 3, 4 };
		System.out.println(new Solution40().solution(A, B));

	}

}
