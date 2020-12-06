package level2;

import java.util.Arrays;

class Solution29 {
	public int solution(int[] citations) {
		Arrays.sort(citations);
		int answer = -1;
		for (int i = 0; i < citations.length; i++) {
			answer = Math.max(answer, Math.min(citations[i], citations.length - i));
		}
		return answer;
	}
}

public class day23_01 {

	public static void main(String[] args) {
		Solution29 solution29 = new Solution29();
		int citations[] = { 12, 11, 10, 9, 8, 1 };
		System.out.println(solution29.solution(citations));
	}

}