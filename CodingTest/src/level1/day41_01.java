package level1;

import java.util.HashSet;

class Solution49 {
	public int solution(int[] nums) {
		int answer = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : nums) {
			set.add(a);
		}
		answer = (nums.length / 2 < set.size()) ? nums.length / 2 : set.size();
		return answer;
	}
}

public class day41_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
