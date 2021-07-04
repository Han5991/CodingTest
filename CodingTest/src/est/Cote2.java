package est;

import java.util.Scanner;

public class Cote2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int q = sc.nextInt();
		if (a == 0) {
			a = 1;
			b++;
		}

		for (int i = 0; i < q / 2; i++) {
			a *= 2;
			b++;
		}
		
		if (a < q) {
			a += q - a;
			b += q - a;
		}
		System.out.println("원하는 값 : " + q);
		System.out.println("출력 값 : " + a);
		System.out.println("시행 횟수 : " + b);

	}
}
