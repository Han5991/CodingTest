package KaKaoCommerce;

import java.util.ArrayList;
import java.util.HashMap;

public class test1x {

	public static void main(String[] args) {
//		String record[] = { "1 fracta", "1 sina", "1 hena", "1 robel", "1 abc", "1 lynn" };
		String record[] = { "1 a", "1 b", "1 abc", "3 b", "3 a", "1 abcd", "1 abc", "1 aaa", "1 a", "1 z", "1 q", "3 k",
				"3 q", "3 z", "3 m", "3 b" };
		int n = 4;
		answer(n, record);
//
//		for (String a : answer(n, record))
//			System.out.println(a);
	}

	public static String[] answer(int n, String[] record) {
		ArrayList<ArrayList<String>> server = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < n; i++) {
			server.add(new ArrayList<String>());
		}

		for (String a : record) {
			if (a.substring(0, 1).equals("1")) {
				if (server.get(0).size() == 5) {
					server.get(0).remove(0);
					server.get(0).add(a.substring(2, a.length()));
				}
				if (!server.get(0).contains(a.substring(2, a.length()))) {
					server.get(0).add(a.substring(2, a.length()));
				}
				System.out.println(server.get(0));
			} else if (a.substring(0, 1).equals("3")) {
				if (server.get(2).size() == 5) {
					server.get(2).remove(0);
					server.get(0).add(a.substring(2, a.length()));
				}
				if (!server.get(0).contains(a.substring(2, a.length()))) {
					server.get(0).add(a.substring(2, a.length()));
				}
			}
		}
		int b = 0;
		for (int i = 0; i < server.size(); i++) {
			b += server.get(i).size();
		}
		String[] anwer = new String[b];
		return anwer;
	}
}
