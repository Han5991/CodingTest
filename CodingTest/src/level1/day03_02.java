package level1;

class Solution6 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}
		return answer;
	}
}

public class day03_02 {

	public static void main(String[] args) {
		Solution6 a = new Solution6();
		System.out.println(a.solution(2, 5));

//		int x = 2;
//		int n = 5;
//		long[] answer = new long[n];
//		answer[0] = x;
//		for (int i = 1; i < n; i++) {
//			answer[i] = answer[i - 1] + x;
//		}
//
//		for (int i = 0; i < n; i++)
//			System.out.print(answer[i]);
	}

}
