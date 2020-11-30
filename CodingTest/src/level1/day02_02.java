package level1;

import java.util.ArrayList;
import java.util.Collections;

class Solution4 {

	public ArrayList<Integer> solution(int[] numbers) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!answer.contains(numbers[i] + numbers[j])) { // 중복 체크 contains 객체를 더한 값
					answer.add(numbers[i] + numbers[j]); // 없으면 추가
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}

	int index = 0;

	public ArrayList<Integer> solution4(int[] numbers) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) // 자신의 수를 제외한 나머지수를 전부 더해서 배열에 추가
			for (int k = 0; k < numbers.length; k++)
				if (i != k)
					answer.add(index, numbers[i] + numbers[k]);

		for (int i = 0; i < answer.size(); i++) { // 인덱스와 실제 값을 비교해 중복 삭제 및 0추가(삭제하면 배열 크기가 달라져 일단 0을 추가)
			for (int k = 0; k < answer.size(); k++)
				if (i != k && answer.get(i).equals(answer.get(k))) {
					answer.remove(k);
					answer.add(k, 0);
				}
			if (answer.get(i) == 0) {// 위에서 넣어준 0을 지워줌 여기서도 지워짐과 동시에 배열이 줄어들기 때문에 i-- 시전
				answer.remove(i);
				i--;
			}
		}

		Collections.sort(answer);// 버블 솔트를 통해 정렬도 가능하지만 있는건 잘 써먹자
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
