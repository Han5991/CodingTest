package level2;

class Solution25 {
	public String solution(int n) {
		String[] a = { "4", "1", "2" };
		String answer = "";

		while (n > 0) {
			int b = n % 3;
			n /= 3;

			if (b == 0) {
				n--;
			}
			answer = a[b] + answer;
		}
		return answer;
	}
}

public class day19_01 {

	public static void main(String[] args) {
		Solution25 solution25 = new Solution25();
		System.out.println(solution25.solution(12));
	}

}
