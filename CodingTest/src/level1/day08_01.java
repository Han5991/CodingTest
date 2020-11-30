package level1;

import java.util.ArrayList;

class Solution12<Intrger> {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		ArrayList<Integer> lostL = new ArrayList<Integer>();
		ArrayList<Integer> reserveL = new ArrayList<Integer>();
		for (Integer a : lost)
			lostL.add(a);
		for (Integer a : reserve)
			reserveL.add(a);

		for (int i = 0; i < lostL.size(); i++) // 자기 여분이 있는 사람 제외
			for (int k = 0; k < reserveL.size(); k++)
				if (lostL.get(i) == reserveL.get(k)) {
					lostL.remove(i);
					reserveL.remove(k);
					answer++;
					i--;
					break;
				}
		for (int i = 0; i < lostL.size(); i++)
			for (int k = 0; k < reserveL.size(); k++)
				if (lostL.get(i) == reserveL.get(k) - 1 || lostL.get(i) == reserveL.get(k) + 1) {
					reserveL.remove(k);
					answer++;
					break;
				}
		return answer;
	}
}

public class day08_01 {

	public static void main(String[] args) {
		Solution12 s = new Solution12();
//		int lost[] = { 2, 4 };
//		int reserve[] = { 3 };
		int lost[] = { 3 };
		int reserve[] = { 1 };
		System.out.println(s.solution(5, lost, reserve));

	}

}
