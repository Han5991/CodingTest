package level2;

import java.util.Stack;

class Solution38 {
	public int solution(String s) {
		Stack<String> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (st.isEmpty()) {
				st.push(s.substring(i, i + 1));
			} else if (st.peek().equals(s.substring(i, i + 1))) {
				st.pop();
			} else {
				st.push(s.substring(i, i + 1));
			}
		}

		return st.isEmpty() ? 1 : 0;
	}
}

public class day31_01 {

	public static void main(String[] args) {
		String a = "baabaa";
		String c = "cdcd";
		System.out.println(new Solution38().solution(a));
	}

}
