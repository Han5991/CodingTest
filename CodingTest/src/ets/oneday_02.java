package ets;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class oneday_02 {

	public static void main(String[] args) {
		StringBuilder answer = new StringBuilder("12211211");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		List<int[]> temp = combinations(arr);
		List<String> answer2 = new ArrayList<String>();
		String temp2 = "";
		for (int[] a : temp) {
			int i = 0;
			for (int v : a) {
				if (i == 0) {
					temp2 = answer.insert(v, ".").toString();
					if (Pattern.matches("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])([.](?!$)|$)){4}", temp2)) {
						answer2.add(temp2);
					}
				} else {
					temp2 = answer.insert(v + 2, ".").toString();
					if (Pattern.matches("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])([.](?!$)|$)){4}", temp2)) {
						answer2.add(temp2);
					}
				}
				i++;
			}
			i = 0;
			answer = new StringBuilder("12211211");
		}
		for (String q : answer2) {
			System.out.println(q);
		}
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
