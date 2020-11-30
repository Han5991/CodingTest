package level1;

import java.util.ArrayList;
import java.util.Collections;

class Solution4 {

	public ArrayList<Integer> solution(int[] numbers) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!answer.contains(numbers[i] + numbers[j])) { // �ߺ� üũ contains ��ü�� ���� ��
					answer.add(numbers[i] + numbers[j]); // ������ �߰�
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}

	int index = 0;

	public ArrayList<Integer> solution4(int[] numbers) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) // �ڽ��� ���� ������ ���������� ���� ���ؼ� �迭�� �߰�
			for (int k = 0; k < numbers.length; k++)
				if (i != k)
					answer.add(index, numbers[i] + numbers[k]);

		for (int i = 0; i < answer.size(); i++) { // �ε����� ���� ���� ���� �ߺ� ���� �� 0�߰�(�����ϸ� �迭 ũ�Ⱑ �޶��� �ϴ� 0�� �߰�)
			for (int k = 0; k < answer.size(); k++)
				if (i != k && answer.get(i).equals(answer.get(k))) {
					answer.remove(k);
					answer.add(k, 0);
				}
			if (answer.get(i) == 0) {// ������ �־��� 0�� ������ ���⼭�� �������� ���ÿ� �迭�� �پ��� ������ i-- ����
				answer.remove(i);
				i--;
			}
		}

		Collections.sort(answer);// ���� ��Ʈ�� ���� ���ĵ� ���������� �ִ°� �� �����
		return answer;
	}
}

public class day02_02 {

	public static void main(String[] args) {

		Solution4 a = new Solution4();
		int[] b = { 2, 1, 3, 4, 1 };
		int[] c = { 5, 0, 2, 7 };
		int[] d = new int[(int) ((Math.random() * 100))];
		for (int i = 0; i < d.length; i++) {
			d[i] = (int) (Math.random() * 100);
		}
		int[] e = new int[(int) ((Math.random() * 100))];
		for (int i = 0; i < e.length; i++) {
			e[i] = (int) (Math.random() * 100);
		}
		int[] f = new int[(int) ((Math.random() * 100))];
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (Math.random() * 100);
		}
		System.out.println(a.solution4(b));
		System.out.println(a.solution4(c));
		System.out.println(a.solution4(d));
		System.out.println(a.solution(f));
	}
}
