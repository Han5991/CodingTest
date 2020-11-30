package level1;

class Solution16 {
	public String solution(int a, int b) {
		String answer = "";
		String yo[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		String day[][] = new String[12][];

		day[0] = new String[31];
		for (int i = 0; i < day[0].length; i++) {
			day[0][i] = yo[(i + 5) % 7];
		}

		day[1] = new String[29];
		for (int i = 0; i < day[1].length; i++) {
			day[1][i] = yo[(i + 1) % 7];
		}

		day[2] = new String[31];
		for (int i = 0; i < day[2].length; i++) {
			day[2][i] = yo[(i + 2) % 7];
		}

		day[3] = new String[30];
		for (int i = 0; i < day[3].length; i++) {
			day[3][i] = yo[(i + 5) % 7];
		}

		day[4] = new String[31];
		for (int i = 0; i < day[4].length; i++) {
			day[4][i] = yo[(i + 0) % 7];
		}

		day[5] = new String[30];
		for (int i = 0; i < day[5].length; i++) {
			day[5][i] = yo[(i + 3) % 7];
		}

		day[6] = new String[31];
		for (int i = 0; i < day[6].length; i++) {
			day[6][i] = yo[(i + 5) % 7];
		}

		day[7] = new String[31];
		for (int i = 0; i < day[7].length; i++) {
			day[7][i] = yo[(i + 1) % 7];
		}

		day[8] = new String[30];
		for (int i = 0; i < day[8].length; i++) {
			day[8][i] = yo[(i + 4) % 7];
		}

		day[9] = new String[31];
		for (int i = 0; i < day[9].length; i++) {
			day[9][i] = yo[(i + 6) % 7];
		}

		day[10] = new String[30];
		for (int i = 0; i < day[1].length; i++) {
			day[10][i] = yo[(i + 2) % 7];
		}

		day[11] = new String[31];
		for (int i = 0; i < day[11].length; i++) {
			day[11][i] = yo[(i + 4) % 7];
		}

		answer = day[a - 1][b - 1];
		return answer;
	}
}

public class day11_02 {

	public static void main(String[] args) {
		Solution16 s = new Solution16();
		System.out.println(s.solution(5, 24));

	}

}
