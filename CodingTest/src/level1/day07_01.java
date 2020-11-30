package level1;

import java.util.ArrayList;

class Solution11 {

//	public ArrayList<Integer> solution(int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<Integer>();
//		for(int i =0; i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1])
//				arr[i]=10;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 10)
//				answer.add(arr[i]);
//		}
//		return answer;
//	}

	public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int preNum = 10;
		for (int num : arr) { // for each 문으로 바로 바로 비교 가능한 방법
			if (preNum != num)
				answer.add(num);
			preNum = num;
		}
		return answer;
	}
}

public class day07_01 {

	public static void main(String[] args) {
		Solution11 s = new Solution11();
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };
		int arr3[] = { 4, 4, 4, 3, 3 };
		System.out.println(s.solution(arr));
		System.out.println(s.solution(arr3));
	}

}