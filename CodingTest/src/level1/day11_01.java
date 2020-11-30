package level1;

import java.util.Arrays;

class Solution15 {

	public String[] solution(String[] strings, int n) {

		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}

		Arrays.sort(strings);

		String[] ans = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			ans[i] = strings[i].substring(1, strings[i].length());
		}
		return ans;
	}
}

public class day11_01 {

	public static void main(String[] args) {
		String strings[] = { "sun", "bed", "car" };
		int a = 1;
		String strings1[] = { "abce", "abcd", "cdx" };
		int b = 2;

		String strings2[] = { "abcd", "abce", "abcf" };
		Solution15 s = new Solution15();

		for (String c : s.solution(strings2, b)) {
			System.out.println(c);
		}
	}

}
