package naverWebToon;

class Solution3 {
	public int solution(String s, String t) {
		int result = 0;
		while (s.contains(t)) {
			s = s.replace(t, "");
			result++;
		}

		return result;
	}
}

public class test3 {

	public static void main(String[] args) {
		Solution3 a = new Solution3();
		String s = "aabcbcd";
		String t = "abc";
		System.out.println(a.solution(s, t));

	}

}
