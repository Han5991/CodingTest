package level1;

class Solution20 {
//	public long solution(long n) {
//		long ret = 0;
//		long plus = 0;
//		long k = 0;
//		while (true) {
//			k += plus * 2 + 1;
//			plus += 1;
//			if (n == k) {
//				ret = k + (plus * 2 + 1);
//				break;
//			}
//			if (k > n) {
//				ret = -1;
//				break;
//			}
//		}
//		return ret;
//	}
	public long solution(long n) {
		long answer = 0;
		long plus = 0;
		for (int i = 0; i == n;) {
			i += plus * 2 + 1;
			plus++;
			answer = i + (plus * 2 + 1);
			
			if (i > n) {
				answer = -1;
				break;
			}
		}
		
		return answer;
	}
}

public class day14_01 {

	public static void main(String[] args) {

		Solution20 a = new Solution20();
		System.out.println(a.solution(121));
	}
}