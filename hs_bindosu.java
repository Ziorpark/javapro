package prac2;

import java.util.*;

class Solution6 {
	public int[] solution(String s){
		
		int[] answer = new int[5];
		HashMap<Character, Integer> a = new HashMap<>();
		
		for (int i = 97; i < 102; i++) {
			if (a.getOrDefault((char)i, 0) == 0) {
				a.put((char)i, 0);
			}
		}
		
		// a,b,c,d,e 빈도수 
		for (char x : s.toCharArray()) {
			a.put(x, a.getOrDefault(x, 0) + 1); // 존재의 경우 +1 없으면 기본값 0
		}
		
		int max = 0; // 최대값 찾기
		for (int i = 0; i< a.size(); i++) {
			int num = a.get((char)(97+i));
			
			if (num > max) {
				max = num;
			}
		}
		 // 최댓값에서 밸류값 뺴기
		for (int i = 0; i < a.size(); i++) {
			int ho = a.get((char)(97+i));
			answer[i] = max -ho;
		}
		
		return answer;
	}
}
public class hs_bindosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution6 T = new Solution6();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
		
	}

	
}
