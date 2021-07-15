package level2;

import java.util.ArrayList;
import java.util.Arrays;

class Solution50 {
	public int[] solution(String s) {
		String[] y = s.replaceAll("[{}]", " ").trim().split(" ,");
		Arrays.sort(y, (a, b) -> (a.length() - b.length()));

		ArrayList<String> arrayList = new ArrayList<>();

		for (String data : y) {
			for (String data2 : data.trim().split(",")) {
				if (!arrayList.contains(data2)) {
					arrayList.add(data2);
				}
			}

		}

		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = Integer.parseInt(arrayList.get(i));
		}
		return answer;
	}
}

public class day42_01 {

	public static void main(String[] args) {
		Solution50 a = new Solution50();
		String b = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
//		String b = "{{20,111},{111}}";
		for (int c : a.solution(b)) {
			System.out.println(c);
		}

	}

}
