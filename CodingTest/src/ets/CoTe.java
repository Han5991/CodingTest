package ets;

class Solution {
	public int solution(String p, String s) {
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != p.charAt(i % p.length())) {
				answer++;
			}
			System.out.println(s.charAt(i) + " " + p.charAt(i % p.length()));
		}
		if (answer == s.length())
			answer = -1;
		return answer;
	}
}

public class CoTe {

	public static void main(String[] args) {
		String p[] = { "101", "110", "000", "00" };
		String s[] = { "10100010101101100", "110110110", "00000000", "1111111" };// 8 0 2 -1
		Solution solution = new Solution();
//		for (int i = 0; i < p.length; i++)
//			System.out.println(solution.solution(p[i], s[i]));
		int i = 1, sum = 0;
		while (i++ < 10) {
			sum += i * 3 >= sum ? i : 1;
			System.out.println(i + " " + sum);
		}
		System.out.println(sum);
	}

}
