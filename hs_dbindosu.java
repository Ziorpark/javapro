package prac2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

class Solution8 {
	public void solution(String s){
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		
		// 각 문자열 빈도수 채우기
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		
		// 빈도수가 같다면 -1
		Iterator<Character> iter =  sH.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//return answer;
	
}
public class hs_dbindosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 T = new Solution8();
		//System.out.println(T.solution("aaabbbcc"));	
		T.solution("aaabbbcc");
	}

}
}
