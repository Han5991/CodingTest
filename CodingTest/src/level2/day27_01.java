package level2;

import java.util.Arrays;

class Solution33 {
	public double solution(int[] su) {
		double answer = 0;
		Arrays.sort(su);
		answer = (Math.pow((su[2] - su[0]), 2) + Math.pow((su[3] - su[1]), 2));
		return answer;
	}
}

public class day27_01 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		System.out.println(new Solution33().solution(a));
	}

}
