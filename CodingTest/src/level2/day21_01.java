package level2;

import java.util.HashMap;

class Solution27 {
	public int solution(String name) {
		int answer = 0;
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("A", 0);
		a.put("B", 1);
		a.put("C", 2);
		a.put("D", 3);
		a.put("E", 4);
		a.put("F", 5);
		a.put("G", 6);
		a.put("H", 7);
		a.put("I", 8);
		a.put("J", 9);
		a.put("K", 10);
		a.put("L", 11);
		a.put("M", 12);
		a.put("N", 13);
		a.put("O", 12);
		a.put("P", 11);
		a.put("Q", 10);
		a.put("R", 9);
		a.put("S", 8);
		a.put("T", 7);
		a.put("U", 6);
		a.put("V", 5);
		a.put("W", 4);
		a.put("X", 3);
		a.put("Y", 2);
		a.put("Z", 1);
		for (int i = 0; i < name.length(); i++) {
			answer += a.get(name.charAt(i) + "");
		}
		int minMove = name.length() - 1;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'A') {
				int next = i + 1;
				while (next < name.length() && name.charAt(next) == 'A') {
					next++;
				}
				int move = 2 * i + name.length() - next;
				minMove = Math.min(move, minMove);
			}
		}
		return answer + minMove;
	}
}

public class day21_01 {

	public static void main(String[] args) {
		String a[] = { "JAZ", "JEROEN", "JAN", "AAA" };
		System.out.println(new Solution27().solution(a[0]));
		System.out.println(new Solution27().solution(a[1]));
		System.out.println(new Solution27().solution(a[2]));
		System.out.println(new Solution27().solution(a[3]));
	}

}
