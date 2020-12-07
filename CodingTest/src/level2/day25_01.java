package level2;

import java.util.LinkedList;
import java.util.Queue;

class Printer {
	int location;
	int prior;

	Printer(int location, int prior) {
		this.location = location;
		this.prior = prior;
	}
}

class Solution31 {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Printer> q = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			q.add(new Printer(i, priorities[i]));
		}

		while (!q.isEmpty()) {
			boolean flag = false;
			int com = q.peek().prior;
			for (Printer p : q) {
				if (com < p.prior) { // 맨앞의 수보다 큰 숫자가 존재하면
					flag = true;
				}
			}
			if (flag) {
				q.offer(q.poll());
			} else if (q.poll().location == location) {
				answer = priorities.length - q.size();
			}
		}
		return answer;
	}

}

public class day25_01 {

	public static void main(String[] args) {
		int a[] = { 2, 1, 3, 2 };
		int b[] = { 1, 1, 9, 1, 1, 1 };
		Solution31 solution31 = new Solution31();
		System.out.println(solution31.solution(b, 5));
	}

}
