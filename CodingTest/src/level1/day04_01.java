package level1;

import java.util.ArrayList;

class Solution7 {
	public int solution(int[][] board, int[] moves) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int answer = 0;
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					result.add(board[j][moves[i] - 1]);
					break;
				}
			}
		}
		for (int k = 0; k < result.size() - 1; k++) {
			if (result.get(k).equals(result.get(k + 1))) {
				result.remove(k); //사이즈가 줄어드니 같은 문구로 삭제
				result.remove(k);
				answer += 2;
				k = -1; //포문이 끝나고 올라 갈 때 k++이 되어서 k=1부터 시작
			}
		}
		return answer;
	}
}

public class day04_01 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
//		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
//				{ 3, 5, 1, 3, 1 } };
//		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		int[][] board = { { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 2, 1, 0, 0 }, { 0, 2, 1, 0, 0 },
				{ 0, 2, 1, 0, 0 } };
		int[] moves = { 1, 2, 3, 3, 2, 3, 1 };
		System.out.println(s.solution(board, moves));
	}
}
