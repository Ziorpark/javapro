package prac2;

import java.util.*;

class Solution7 {
	public int[] solution(String s) {
		int [] answer = new int[5];
		HashMap<Character, Integer> sH = new HashMap<>();
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		String tmp = "abcde";
		for (char key : tmp.toCharArray()) {
			if(sH.getOrDefault(key, 0)>max) {
				max = sH.getOrDefault(key, 0);
			}
		}
		for (int i = 0; i < tmp.length(); i++) {
			answer[i] = max - sH.getOrDefault(tmp.charAt(i), 0);
		}
		return answer;
	}
}

public class ttp_bindosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution7 T = new Solution7();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));

	}

}
