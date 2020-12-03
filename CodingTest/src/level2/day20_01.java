package level2;

import java.util.Arrays;

class Solution26 {
	public String solution(String s) {
		String answer = "";
		String[] a = s.split(" ");
		int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(b);

		answer += b[0] + " " + b[b.length - 1];

		return answer;
	}
}

public class day20_01 {

	public static void main(String[] args) {
		Solution26 solution26 = new Solution26();
		System.out.print(solution26.solution("-1 -2 -3 -4"));
	}
}