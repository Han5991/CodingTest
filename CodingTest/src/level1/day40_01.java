package level1;

class Solution48 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int a = 0;
		int zeroCount = 0;
		for (int lotto : lottos) {
			if (lotto == 0) {
				zeroCount++;
			} else {
				for (int win_num : win_nums) {
					if (lotto == win_num) {
						a++;
					}
				}
			}
		}
		return new int[] { 7-(a+zeroCount) > 5? 6:7-(a+zeroCount), 7-a > 5? 6:7-a };
	}
}

public class day40_01 {

	public static void main(String[] args) {
		int[] lottos = { 0, 0, 0, 0, 0, 0 };
		int[] win_nums = { 38, 19, 20, 40, 15, 25 };
		Solution48 a = new Solution48();
		for (int v : a.solution(lottos, win_nums)) {
			System.out.println(v);
		}
	}

}
