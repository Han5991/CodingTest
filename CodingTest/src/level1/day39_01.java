package level1;

class Solution47 {
	public int solution(String s) {
		String answer = s;
		answer = answer.replaceAll("zero", "0");
		answer = answer.replaceAll("one", "1");
		answer = answer.replaceAll("three", "3");
		answer = answer.replaceAll("four", "4");
		answer = answer.replaceAll("five", "5");
		answer = answer.replaceAll("six", "6");
		answer = answer.replaceAll("seven", "7");
		answer = answer.replaceAll("eight", "8");
		answer = answer.replaceAll("nine", "9");
		return Integer.parseInt(answer);
	}
}

public class day39_01 {

	public static void main(String[] args) {

		String answer = "one2345onetwotwoone";
		answer = answer.replaceAll("zero", "0");
		answer = answer.replaceAll("one", "1");
		answer = answer.replaceAll("two", "2");
		answer = answer.replaceAll("three", "3");
		answer = answer.replaceAll("four", "4");
		answer = answer.replaceAll("five", "5");
		answer = answer.replaceAll("six", "6");
		answer = answer.replaceAll("seven", "7");
		answer = answer.replaceAll("eight", "8");
		answer = answer.replaceAll("nine", "9");
		int b = Integer.parseInt(answer);
		System.out.println(b);
	}

}
