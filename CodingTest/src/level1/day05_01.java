package level1;

import java.util.*;

// HashMap 특징 : 특정 값을 찾는 것에는 매우 유용하지만 그 값을 넣고 빼는 과정이 굉장히 복잡하여 자주 넣고 뺼 경우에는 안 좋다.
// 좋은 알고리즘은 넣는 갯수가 몇 개든 똑같은 값이 걸려야 한다.
// 나중엔 시간도 고민하자 
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

		for (String player : participant)// 참가자 넣기 있으면 +1 없으면 0
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion) // 완주자 넣기 있으면 -1 없으면 기본값 반환
			hm.put(player, hm.get(player) - 1);
		for (String key : hm.keySet()) {// 키값을 찾아서 0이 아니면 answer에 넣기
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}

// 처음 생각한 아이디어 : 배열을 정렬해서 하나하나 비교하자
// 정답 코딩 : 명단을 작성하고 비교하는 과정에서 바로 지운다
// 느낀점 다중 for문을 많이 쓰면 효율이 낮아진다. 하지만 처음 생각하는 아이디어는 다들 비슷하다.
// 가지고 있는 도구를 얼마나 잘 활용하고 생각하는게 중요한거 같다.
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
