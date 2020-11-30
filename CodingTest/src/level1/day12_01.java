package level1;

//import java.util.ArrayList;

// 나눌 대상이 나누는 것 보다 작으면 그만
//class Solution17 {
//	public int solution(int n) {
//		int answer = 0;
//		int result = 1;
//
//		ArrayList<Integer> simjin = new ArrayList<Integer>();
//		ArrayList<Integer> samjin = new ArrayList<Integer>();
//		simjin.add(n);
//		for (int i = n; i > 3;) {
//			i = i / 3;
//			simjin.add(i);
//		}
//		for (int i = 0; i < simjin.size(); i++)
//			samjin.add(simjin.get(i) % 3);
//
//		for (int i = samjin.size() - 1; i > 0; i--) {
//			result = (result * 3);
//			answer += samjin.get(i - 1) * result;
//		}
//		answer += samjin.get(samjin.size() - 1);
//
//		System.out.println(simjin);
//		System.out.println(samjin);
//		return answer;
//	}
//}

class Solution17 {
    public int solution(int n) {
        int answer = 0;
        String num = "";

        while(n > 0) {
            num = n%3 + num;
            n /= 3;
        }

        for(int i = 0; i < num.length(); i++) {
            answer += Math.pow(3, i) * Character.getNumericValue(num.charAt(i));
        } // 제곱

        return answer;
    }
}

public class day12_01 {

	public static void main(String[] args) {
		Solution17 s = new Solution17();
		System.out.println(s.solution(300));
	}

}
