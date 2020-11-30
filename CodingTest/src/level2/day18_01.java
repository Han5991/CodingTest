package level2;

class Solution24 {
	public StringBuffer solution(String number, int k) {// 앞뒤 비교해서 뒤에가더 크면 앞을 지움
		StringBuffer a = new StringBuffer(number);

		for (int i = 0; i < k; i++) {
			int y = a.length() - 1;
			for (int j = 0; j < y; j++) {
				if (a.charAt(j) < a.charAt(j + 1)) {
					y = j;
					break;
				}
			}
			a.deleteCharAt(y);
		}
		return a;
	}
}

public class day18_01 {

	public static void main(String[] args) {
		Solution24 solution24 = new Solution24();
		String number = "4177252841";
		int k = 4;
		System.out.println(solution24.solution(number, k));
	}

}
