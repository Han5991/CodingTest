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
          
          //2���� n������ ���� �迭�� �ִ´�.
          for(int i=2; i<=n; i++) {
              number[i] = i;
          }
          
          //2���� �����ؼ� ���� ������� 0���� �����.
          //�Ŀ� 0�̸� �Ѿ�� �ƴϸ� ���� ������� �ٽ� 0���� �����.
          for(int i=2; i<=n; i++) {
              if(number[i]==0) continue;
              for(int j= 2*i; j<=n; j += i) {
                  number[j] = 0;
              }
          }
          
          //�迭���� 0�� �ƴ� �͵��� ������ ���ش�.
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
		System.out.print("���� �ð� : " + (end - start) / 1000.0 + "��");
	}
}