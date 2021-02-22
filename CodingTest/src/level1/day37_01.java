package level1;

class Solution44 {
	public String solution(String new_id) {
		String id = new_id.toLowerCase();
		id = id.replaceAll("[^-_.a-z0-9]", "");
		id = id.replaceAll("[.]{2,}", ".");
		id = id.replaceAll("^[.]|[.]$", "");

		if (id.equals(""))
			id += "a";

		if (id.length() >= 16) {
			id = id.substring(0, 15);
			id = id.replaceAll("^[.]|[.]$", "");
		}
		if (id.length() <= 2)
			while (id.length() < 3)
				id += id.charAt(id.length() - 1);

		return id;
	}
}

public class day37_01 {

	public static void main(String[] args) {
		Solution44 a = new Solution44();
		String b[] = { "...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p" };
		for (String c : b) {
			System.out.println(a.solution(c));
		}
//		System.out.println(a.solution("...!@BaT#*..y.abcdefghijklm"));
	}

}
