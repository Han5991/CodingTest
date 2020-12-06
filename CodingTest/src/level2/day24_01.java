package level2;

class Solution30 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int c = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int k = i+1; k <= prices.length - 1; k++) {
				c++;
				if (prices[i] > prices[k]) {
					break;
				}
			}
			answer[i] = c;
			c=0;
		}
		return answer;
	}
}


public class day24_01 {

	public static void main(String[] args) {
		Solution30 solution30 = new Solution30();
		int a[] = { 1, 2, 3, 2, 3 };
		System.out.println(solution30.solution(a));
	}

}