package level1;

import java.util.ArrayList;

class Solution18 {
	public ArrayList<Integer> solution(long n) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		String num = "";

		while (n > 0) {
			num = n % 10 + num;
			n /= 10;
		}
		System.out.println(num);

		for (int i = num.length() - 1; i >= 0; i--) {
			answer.add(num.charAt(i) - 48);
		}
		return answer;
	}
}

public class day13_01 {

	public static void main(String[] args) {
		Solution18 a = new Solution18();
		System.out.println(a.solution(12345));

	}

}
