package level2;

import java.util.Arrays;

class Solution23 {
	public int solution(int[] people, int limit) {
		Arrays.sort(people);

		int answer = 0;
		int index = people.length - 1;
		for (int i = 0; i <= index; i++, answer++)
			while (index > i && people[i] + people[index--] > limit)
				answer++;
		return answer;
	}
}

public class day17_01 {

	public static void main(String[] args) {
		Solution23 a = new Solution23();
		int[] p = { 70, 50, 80, 50 };
		int l = 100;
		System.out.println(a.solution(p, l));
	}

}
