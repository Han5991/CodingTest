package level1;

class Solution8 {
	public String solution8(String s) {
		String answer = "";

		if (s.length() % 2 == 0) {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		} else
			answer = s.substring(s.length()/2, s.length()/2+1);
		return answer;
	}
}

public class day04_02 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		System.out.println(s.solution8("abcde"));
		System.out.println(s.solution8("qwer"));
	}

}
