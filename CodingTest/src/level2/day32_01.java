package level2;

//class Solution39 {
//	public String solution(String s) {
//		String answer = "";
//		String[] a = s.split("  ");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = a[i].toLowerCase();
//			a[i] = a[i].replace(a[i].substring(0, 1), a[i].substring(0, 1).toUpperCase());
//			if (i == a.length - 1) {
//				answer += a[i];
//			} else
//				answer += a[i] + " ";
//		}
//		return answer;
//	}
//}

class Solution39 {
//	public String solution(String s) {
//		String answer = "";
//		answer += s.substring(0, 1).toUpperCase();
//		String a = "";
//		for (int i = 1; i < s.length(); i++) {
//			a = s.substring(i, i + 1);
//			if (a.equals(" ")) {
//				answer += " ";
//			} else if (s.substring(i - 1, i).equals(" ")) {
//				answer += a.toUpperCase();
//			} else {
//				answer += a.toLowerCase();
//			}
//		}
//		return answer;
//	}
	
	  public String solution(String s) {
	        String answer = "";
	        String[] sp = s.toLowerCase().split("");// 하나씩 잘라서 넣음
	        boolean flag = true;

	        for(String ss : sp) {
	            answer += flag ? ss.toUpperCase() : ss;// 같은 방식인대 훨씬 짧고 효율적임
	            flag = ss.equals(" ") ? true : false;
	        }

	        return answer;
	  }
}

public class day32_01 {

	public static void main(String[] args) {
		Solution39 solution39 = new Solution39();
		String s = "3people unFollowed me";
		System.out.println(solution39.solution(s));
	}

}
