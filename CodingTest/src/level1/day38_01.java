package level1;

class Solution45 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) { 
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		return answer;
	}
}

public class day38_01 {

	public static void main(String[] args) {
		Solution45 a = new Solution45();
		int absolutes[] = { 4, 7, 12 };
		boolean signs[] = { true, false, true };
		System.out.println(a.solution(absolutes, signs));

	}

}
