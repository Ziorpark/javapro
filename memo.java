package prac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;


	


public class memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcc";
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		
		Iterator<Character> iter =  sH.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		

	}
	


}
