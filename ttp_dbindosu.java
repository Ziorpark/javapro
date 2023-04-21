package prac2;

import java.util.HashMap;
import java.util.HashSet;

class Solution10 {
	public int solution(String s) {
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		HashSet<Integer> ch = new HashSet<>();
		
		for (char x : s.toCharArray()) { // 빈도수 채우기
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		
		for (char key : sH.keySet()) { // 다음 key값 가져오고
			while (ch.contains(sH.get(key))) { // 고유의 값들에서 key 값이 있는지 여부
				answer++; // 중복이니까 뺴줄거야.
				sH.put(key, sH.get(key) - 1); // 뺐어.
			}
			if (sH.get(key) == 0) continue; // key 값이 0인지 여부
			ch.add(sH.get(key)); //set에 key값 저장
		}
		
		return answer;
	}
}
public class ttp_dbindosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10 T = new Solution10();
		System.out.println(T.solution("aaabbbcc"));	
		System.out.println(T.solution("aaabbc"));	
		System.out.println(T.solution("aebbbbc"));	
		System.out.println(T.solution("aaabbbcccde"));	
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));	
	}

}
