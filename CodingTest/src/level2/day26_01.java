package level2;

import java.util.PriorityQueue;

class Solution32 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		PriorityQueue<String> p = new PriorityQueue<>();
		String com = null;
		for (String a : phone_book) {
			p.add(a);
		}
			com = p.poll();
			for (String b : p) {
				if (b.startsWith(com)) {
					answer = false;
					break;
				}
			}
		return answer;
	}
}

public class day26_01 {

	public static void main(String[] args) {
		Solution32 solution32 = new Solution32();
		String[] phone_book = { "119", "97674223", "1195524421" };
		System.out.println(solution32.solution(phone_book));
	}
}