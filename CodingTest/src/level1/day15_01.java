package level1;

class Solution21 {
	public int solution(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}
}

public class day15_01 {

	public static void main(String[] args) {
		Solution21 solution21 = new Solution21();
		int[] a = { 1, 2, 3, 4 };
		int[] b = { -3, -1, 0, 2 };
		System.out.println(solution21.solution(a, b));

	}

}
