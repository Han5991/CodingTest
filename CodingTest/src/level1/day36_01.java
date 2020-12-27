package level1;

import java.util.Arrays;

class Solution43 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int i = 0;
		Arrays.sort(d);

		for (i = 0; i < d.length; i++) {
			budget -= d[i];
			if (0 > budget)
				break;
			answer++;
		}

		return answer;
	}
}

public class day36_01 {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 5, 4 };
		int b = 9;
		System.out.println(new Solution43().solution(a, b));
	}

}
