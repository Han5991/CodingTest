package level1;

class Solution46 {
	public int solution(int left, int right) {
		int answer = 0;
		int size = right - left + 1;
		int c = 0;
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = left + i;
		}
		int b[] = new int[size];
		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					c++;
				}
			}
			b[i] = c;
			c = 0;
		}
		for (int i = 0; i < a.length; i++) {
			if (b[i] % 2 == 0) {
				answer += a[i];
			} else {
				answer -= a[i];
			}
		}
		return answer;
	}
}

public class day38_02 {

	public static void main(String[] args) {
		Solution46 a = new Solution46();
		System.out.println(a.solution(13, 17));
	}

}
