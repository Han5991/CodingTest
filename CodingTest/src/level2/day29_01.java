package level2;

class Solution36 {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (int i = 0; i < skill_trees.length; i++) {
			String[] s = skill_trees[i].split("");
			int index = 0;
			boolean ck = true;
			for (int j = 0; j < s.length; j++) {
				if (index < skill.indexOf(s[j])) {
					ck = false;
					break;
				} else if (index == skill.indexOf(s[j])) {
					index++;
				}
			}
			if (ck) {
				answer++;
			}
		}
		return answer;
	}
}

public class day29_01 {

	public static void main(String[] args) {
		Solution36 solution36 = new Solution36();
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println(solution36.solution(skill, skill_trees));

	}

}
