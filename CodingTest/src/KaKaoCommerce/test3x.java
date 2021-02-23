package KaKaoCommerce;

import java.util.Arrays;

public class test3x {

	public static void main(String[] args) {
		String answer3 = "";
		int[] numbers = random(65);
		int[] numbers2 = random(97);
		for (int i = 0; i < 5; i++) {
			answer3 += (char) numbers2[i];
			answer3 += (char) numbers[i];
		}
		System.out.println(answer3);
		char[] charArr = answer3.toCharArray();
		Arrays.sort(charArr);
		String answer4 = new String(charArr);
		System.out.println(answer4);
	}

	public static int[] random(int a) {
		int n[] = new int[5];
		for (int insertCur = 0; insertCur < n.length; insertCur++) {
			n[insertCur] = (int) (Math.random() * 26) + a;
			for (int searchCur = 0; searchCur < insertCur; searchCur++) {
				if (n[insertCur] == n[searchCur]) {
					insertCur--;
					break;
				}
			}
		}
		return n;
	}
}