package prac2;

import java.util.HashMap;

class Solution5{
	public int solution(String s) {
		
		HashMap<Character, Integer> sH = new HashMap<>();
		
		for (char x : s.toCharArray()) {
			// map에 x가 있으면 1, 없으면 -1리턴
			//String ss = Character.toString(x);
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) { //문자열에서 1번 나온 인덱스 알아내기
			if (sH.get(s.charAt(i)) == 1) return i + 1;
		}
		return -1;
	}
	
		
}

public class ttp_sstirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 T = new Solution5();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));

	}

}
