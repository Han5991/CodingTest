package level1;

import java.util.ArrayList;

class Solution19 {
	public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int mini = 0;
		if (arr.length == 1) {
			answer.add(-1);
		} else {
			for (int i = 0; i < arr.length; i++) {
				answer.add(arr[i]);
			}
			mini = answer.get(0);

			for (int i = 0; i < answer.size(); i++) {
				if (mini > answer.get(i)) {
					mini = answer.get(i);
				}
			}
		}
		for (int i = 0; i < answer.size(); i++) {
			if (mini == answer.get(i)) {
				answer.remove(i);
			}
		}
		return answer;
	}
}

public class day13_02 {

	public static void main(String[] args) {
		Solution19 s = new Solution19();
		int[] arr = { 10 };
		System.out.println(s.solution(arr));
	}

}
