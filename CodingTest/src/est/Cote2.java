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
		System.out.println("���ϴ� �� : " + q);
		System.out.println("��� �� : " + a);
		System.out.println("���� Ƚ�� : " + b);

	}
}
