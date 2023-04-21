package prac2;

import java.util.*;

class Solution4{
	public int solution(String s) {
		
		HashMap<String, Integer> a = new HashMap<>();
		int answer = 0;
		for (char x : s.toCharArray()) {
			// map에 x가 있으면 1, 없으면 -1리턴
			
			
			
			String ss = Character.toString(x);
			
			a.getOrDefault(ss, 1); //문자와 해당 키가 없으면 1넣기
			
			if (a.get(ss) >= 1) { //해당 값이 이미 있는경우
				a.put(ss, a.get(ss) + 1 );
			} 
			
		}
	
		answer = a.get("s");
		return answer;
	}
	
	
	
}
public class hs_sstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 T = new Solution4();
		System.out.println(T.solution("statitsics"));
		//T.solution("statitsics");
	}

}
