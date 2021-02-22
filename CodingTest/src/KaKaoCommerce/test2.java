package KaKaoCommerce;

public class test2 {

	public static void main(String[] args) {
//		int v[] = { 2, 3, 1 };
		int v[] = { 3, 2, 3, 1 };
		int m = 4;
		int a = answer(m, v);
		System.out.println(a);
	}

	public static int answer(int m, int[] v) {
		int result = 0;
		int gap = 0;
		for (int i = 0; i < v.length; i++) {
			result++;
			gap = m - v[i];
			if (v[i] < gap) {
				result--;
			}
		}
		return result;
	}
}
