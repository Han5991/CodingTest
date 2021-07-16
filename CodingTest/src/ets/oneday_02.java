package ets;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class oneday_02 {

	public static void main(String[] args) {
		String a = "12211211";
		String b = "125211321";
		for (String q : solution(b)) {
			System.out.println(q);
		}
	}

	static List<String> solution(String arg) {
		StringBuilder answer = new StringBuilder(arg);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		List<String> answer2 = new ArrayList<String>();

		for (int[] a : combinations(arr)) {
			int i = 0;
			for (int v : a) {
				String temp2 = answer.insert(v + i, ".").toString();
				if (Pattern.matches("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])([.](?!$)|$)){4}", temp2)) {
					answer2.add(temp2);
				}
				i++;
			}
			i = 0;
			answer = new StringBuilder(arg);
		}
		return answer2;
	}

	static List<int[]> combinations(int[] arr) {
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					list.add(new int[] { arr[i], arr[j], arr[k] });
				}
			}
		}
		return list;
	}

}
