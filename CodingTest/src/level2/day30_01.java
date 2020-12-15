package level2;

import java.util.Arrays;
import java.util.Comparator;

class Solution37 {
	public String solution(int[] numbers) {
		String num[] = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			num[i] = Integer.toString(numbers[i]);
		}
		Arrays.sort(num, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {//양쪽을 빼서 음수가 나오면 오른쪽이 아래로 내려감
				return (o1 + o2).compareTo(o2 + o1);
			}
		});
		if (num[num.length - 1].equals("0")) {
			return "0";
		}
		String answer = "";
		for (int i = num.length; i > 0; i--) {
			answer += num[i - 1];
		}

		return answer;
	}
}

public class day30_01 {

	public static void main(String[] args) {
		int[] a = { 3, 30, 34, 5, 9 };
		int[] b = { 6, 10, 2 };
		Solution37 solution37 = new Solution37();
		System.out.println(solution37.solution(a));
	}
}