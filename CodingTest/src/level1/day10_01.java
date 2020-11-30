package level1;

class Solution14 {
//	public int solution(int n) {
//		int answer = 0;
//		int answer2 = 0;
//		for (int k = 1; k <= n; k++) {
//			answer2 = 0;
//			for (int i = 1; i <= k; i++) {
//				if (k % i == 0) {
//					answer2++;
//				}
//				if (answer2 == 3) {
//					break;
//				}
//			}
//			if (answer2 == 2) {
//				answer++;
//			}
//		}
//		return answer;
//	}
	  public int solution(int n) {
          int answer = 0;
          
          int[] number = new int[n+1];
          
          //2부터 n까지의 수를 배열에 넣는다.
          for(int i=2; i<=n; i++) {
              number[i] = i;
          }
          
          //2부터 시작해서 그의 배수들을 0으로 만든다.
          //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
          for(int i=2; i<=n; i++) {
              if(number[i]==0) continue;
              for(int j= 2*i; j<=n; j += i) {
                  number[j] = 0;
              }
          }
          
          //배열에서 0이 아닌 것들의 개수를 세준다.
          for(int i=0; i<number.length; i++) {
              if(number[i]!=0) {
                  answer++;
              }
          }
          
          return answer;
      }
}

public class day10_01 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Solution14 s = new Solution14();
		System.out.println(s.solution(100000));
		long end = System.currentTimeMillis();
		System.out.print("실행 시간 : " + (end - start) / 1000.0 + "초");
	}
}