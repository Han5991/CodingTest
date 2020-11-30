package level1;

class Solution1 {
	public boolean solution(int x) {
		boolean answer = false;
		int a[] = new int[5];
		int sum = 0;
		a[0] = x / 10000 % 10;
		a[1] = x / 1000 % 10;
		a[2] = x / 100 % 10;
		a[3] = x / 10 % 10;
		a[4] = x % 10;

		for (int i = 0; i < 5; i++)
			sum += a[i];
		if (x % sum == 0)
			answer = true;
		return answer;
	}
}

public class day01_01 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
		System.out.println(s.solution(11));
		System.out.println(s.solution(13));
	}

}
