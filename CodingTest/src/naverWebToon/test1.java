package naverWebToon;

class Solution1 {
	public int solution(int[] prices, int[] discounts) {
		int a = 0;
		int b = 0;
		int answer = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = 0; j < prices.length - i - 1; j++) {
				if (prices[j] < prices[j + 1]) {
					a = prices[j];
					prices[j] = prices[j + 1];
					prices[j + 1] = a;
				}
			}
		}
		for (int i = 0; i < discounts.length; i++) {
			for (int j = 0; j < discounts.length - i - 1; j++) {
				if (discounts[j] < discounts[j + 1]) {
					b = discounts[j];
					discounts[j] = discounts[j + 1];
					discounts[j + 1] = b;
				}
			}
		}

		for (int i = 0; i < prices.length; i++) {
			if (discounts.length > i) {
				answer += prices[i] * (100 - discounts[i]) / 100;
			} else {
				answer += prices[i];
			}
		}
		return answer;
	}
}

public class test1 {

	public static void main(String[] args) {
		Solution1 a = new Solution1();
		int[] b = { 13000, 88000, 10000 };
		int[] c = { 30, 20 };
		System.out.println(a.solution(b, c));
	}

}
