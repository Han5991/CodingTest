package naverWebToon;

class Solution2 {
	public String[] solution(String s) {
	
		String[] answer = new String[6];
		String t1 = "";
		StringBuffer t2 = new StringBuffer();
		int a = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			t1 += s.charAt(i);
			t2.insert(0, s.charAt(s.length() - 1 - i));
			if (t1.equals(t2.toString())) {
				answer[a] = t1;
				t1 = "";
				t2 = new StringBuffer();
				a++;
			}
		}
		int c = 1;
		for (int i = answer.length / 2; i < answer.length; i++) {
			answer[i] = answer[i - c];
			c += 2;
		}
		if (answer[0] == null) {
			answer[0] = s;
		}
		return answer;
	}
}

public class test2 {

	public static void main(String[] args) {
		Solution2 a = new Solution2();
		String s = "abcxyasdfasdfxyabc";
		for (String b : a.solution(s)) {
			System.out.println(b);
		}

	}

}