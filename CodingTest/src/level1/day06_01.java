package level1;

import java.util.Arrays;

class Solution10 {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		answer = new int[commands.length];
		int c = 0;
		for (int i = 0; i < commands.length; i++) {
			int[] tmp = new int[commands[i][1] - commands[i][0] + 1];            
			for (int k = commands[i][0]; k <= commands[i][1]; k++) {
				tmp[c] = array[k - 1];
				c++;
			}
			c = 0;
			Arrays.sort(tmp);
			answer[i] = tmp[commands[i][2] - 1];
		}
		return answer;
	}
}

public class day06_01 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int array[] = { 1, 5, 2, 6, 3, 7, 4 };
		int commands[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(s.solution(array, commands));
	}

}
