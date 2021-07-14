package level1;

import java.util.HashSet;

class Solution49 {
	public int solution(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : nums) {
			set.add(a);
		}
		
		return (nums.length / 2 < set.size()) ? nums.length / 2 : set.size();
	}
}

public class day41_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
