package level2;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution35 {
//	public int solution(int[] people, int limit) {
//		int answer = 0;
//		PriorityQueue<Integer> p = new PriorityQueue<>();
//		for (Integer a : people) {
//			p.add(a);
//		}
//		int sum = 0;
//		while (!p.isEmpty()) {
//			if (p.size() != 1) {
//				while (sum <= limit) {
//					sum += p.poll();
//					if (sum > limit) {
//						answer++;
//						break;
//					}
//				}
//			} else
//				p.poll();
//			answer++;
//		}
//		return answer;
//	} 전부 시간 초과

	public int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);
		int i = people.length-1;
		int j = 0 ;
		
		while ( i > j ) {
			
			if( people[i] + people[j] <= limit ) j++;
			
			i--;
			
			answer++;
		}
		
		if ( i==j ) answer++;
		
		return answer;
	}
}

public class day28_01 {

	public static void main(String[] args) {
		Solution35 solution35 = new Solution35();
		int people[] = { 70, 80, 50 };
		int limit = 100;
		System.out.println(solution35.solution(people, limit));
	}
}