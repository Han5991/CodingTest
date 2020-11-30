package level1;

import java.util.*;

// HashMap Ư¡ : Ư�� ���� ã�� �Ϳ��� �ſ� ���������� �� ���� �ְ� ���� ������ ������ �����Ͽ� ���� �ְ� �E ��쿡�� �� ����.
// ���� �˰����� �ִ� ������ �� ���� �Ȱ��� ���� �ɷ��� �Ѵ�.
// ���߿� �ð��� ������� 
class Solution9 {
//	public String solution(String[] participant, String[] completion) {
//		String answer = "";
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		for (int i = 0; i < participant.length; i++) {
//			for (int k = 0; k < completion.length; k++) {
//				if (participant[i].equals(completion[k])) {
//					completion[k] = " ";
//					participant[i] = " ";
//				}
//			}
//			if (!participant[i].equals(" ")) 
//				answer = participant[i];
//		}
//		return answer;
//	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();

		for (String player : participant)// ������ �ֱ� ������ +1 ������ 0
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion) // ������ �ֱ� ������ -1 ������ �⺻�� ��ȯ
			hm.put(player, hm.get(player) - 1);
		for (String key : hm.keySet()) {// Ű���� ã�Ƽ� 0�� �ƴϸ� answer�� �ֱ�
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}

// ó�� ������ ���̵�� : �迭�� �����ؼ� �ϳ��ϳ� ������
// ���� �ڵ� : ����� �ۼ��ϰ� ���ϴ� �������� �ٷ� �����
// ������ ���� for���� ���� ���� ȿ���� ��������. ������ ó�� �����ϴ� ���̵��� �ٵ� ����ϴ�.
// ������ �ִ� ������ �󸶳� �� Ȱ���ϰ� �����ϴ°� �߿��Ѱ� ����.
public class day05_01 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		System.out.println(s.solution(participant, completion));

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(s.solution(participant2, completion2));

		String[] participant3 = { "mislav", "stanko", "mislav", "ana" };
		String[] completion3 = { "stanko", "ana", "mislav" };
		System.out.println(s.solution(participant3, completion3));

	}

}
