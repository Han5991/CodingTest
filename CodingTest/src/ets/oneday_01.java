package ets;

import java.util.HashSet;

public class oneday_01 {

	public static void main(String[] args) {
		String test = "1a2b3c4";
		char[] a = { 'A', 'B', 'C' };
		char[] b = { 'D', 'E', 'F' };
		char[] c = { 'H', 'I', 'J' };
		HashSet<String> answer1 = new HashSet<String>();
		HashSet<String> answer2 = new HashSet<String>();
		HashSet<String> answer3 = new HashSet<String>();
		for (char d : a) {
			answer1.add(test.replace('a', d));
		}
		for (String g : answer1) {
			for (char q : b) {
				answer2.add(g.replace('b', q));
			}
		}
		
		for (String g : answer2) {
			for (char q : c) {
				answer3.add(g.replace('c', q));
			}
		}
		
		for (String j : answer3) {
			System.out.println(j);
		}
		System.out.println("정답 길이 : " + answer3.size());
	}

}
