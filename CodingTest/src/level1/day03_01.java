package level1;

class Solution5 {
	public long solution(int a, int b) {
		long answer = 0;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; a <= b; a++)
			answer += a;

		return answer;
	}
}

public class day03_01 {

	public static void main(String[] args) {
		Solution5 a = new Solution5();
		System.out.println(a.solution(5, 3));
	}

}
