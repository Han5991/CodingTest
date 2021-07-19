package level1;

class Solution52 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[][] answer2 = new double[N][2];
		double temp[] = {};
		int a = 1;
		N = stages.length;
		for (int i = 0; i < answer.length; i++) {
			for (int j : stages) {
				if (a == j) {
					answer[i]++;
				}
			}
			a++;
			answer2[i][0] = (double) answer[i] / N;
			answer2[i][1] = i + 1;
			N = N - answer[i];
		}
		for (int e = 0; e < answer2.length; e++) {
			for (int i = 0; i < answer2.length - 1; i++) {
				if (answer2[i][0] < answer2[i + 1][0]) {
					temp = answer2[i + 1];
					answer2[i + 1] = answer2[i];
					answer2[i] = temp;

				} else if (answer2[i][0] == answer2[i + 1][0]) {

					if (answer2[i][1] > answer2[i + 1][1]) {
						temp = answer2[i + 1];
						answer2[i + 1] = answer2[i];
						answer2[i] = temp;
					}
				}
			}
		}
		for (int i = 0; i < answer2.length; i++) {
			answer[i] = (int) answer2[i][1];
		}
		return answer;
	}
}

public class day44_01 {

	public static void main(String[] args) {
		int N = 5;
		int stages[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		Solution52 a = new Solution52();
		for (int b : a.solution(N, stages)) {
			System.out.println(b);
		}
	}

}
