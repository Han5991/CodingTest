package level1;

class Solution51 {
	public int solution(String dartResult) {
		int answer_arr[] = new int[3];
		int idx = 0, intCnt = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char dartChar = dartResult.charAt(i);
			int dartInt = Character.getNumericValue(dartChar);

			if (dartInt >= 0 && dartInt <= 10) {
				if (dartInt == 1) {
					if (Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
						dartInt = 10;
						i++;
					}
				}
				answer_arr[idx] = dartInt;
				intCnt++;
			} else {
				switch (dartChar) {
				case 'S':
					answer_arr[idx] = (int) Math.pow(answer_arr[idx], 1);
					idx++;
					break;

				case 'D':
					answer_arr[idx] = (int) Math.pow(answer_arr[idx], 2);
					idx++;
					break;

				case 'T':
					answer_arr[idx] = (int) Math.pow(answer_arr[idx], 3);
					idx++;
					break;

				case '*':
					idx = idx - 2 < 0 ? 0 : idx - 2;
					while (idx < intCnt) {
						answer_arr[idx] = answer_arr[idx] * 2;
						idx++;
					}
					break;
				case '#':
					answer_arr[idx - 1] = answer_arr[idx - 1] * (-1);
					break;
				}
			}
		}

		return answer_arr[0] + answer_arr[1] + answer_arr[2];

	}
}

public class day43_01 {
	public static void main(String[] args) {
		Solution51 a = new Solution51();
		String dartResult[] = { "1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*" };
		int answer[] = { 37, 9, 3, 23, 5, -4, 59 };
		int i = 0;
//		System.out.println(a.solution(dartResult[1]));

		for (String y : dartResult) {
			System.out.print("내 답안 : " + answer[i] + ", 정답 : " + a.solution(y) + "   ");
			System.out.print((answer[i++] == a.solution(y)) + "\n");

		}

	}
}
