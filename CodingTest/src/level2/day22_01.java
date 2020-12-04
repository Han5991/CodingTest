package level2;

import java.util.PriorityQueue;

class Solution28 {
	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		int answer = 0;
		for (int a : scoville)
			priorityQueue.add(a);
		while (priorityQueue.peek() <= K) {
			int a = priorityQueue.poll();
			int b = priorityQueue.poll();
			int c = a + b * 2;
			priorityQueue.add(c);
			answer++;
			if (priorityQueue.size() == 1 && priorityQueue.peek() < K) {
				answer = -1;
				break;
			}
		}

		return answer;
	}
}

public class day22_01 {

	public static void main(String[] args) {
		Solution28 solution28 = new Solution28();
		int a[] = { 1, 2, 3, 9, 10, 12 };
		int k = 7;
		System.out.println(solution28.solution(a, k));
	}

}
