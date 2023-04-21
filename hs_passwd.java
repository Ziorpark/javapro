package prac2;

import java.util.Arrays;

class Solution {
	public int solution(int[] keypad, String passwd){
		int answer = 0;
		int [][] map = new int[9][9];
		int[] dx = {-1,-1,-1,0,1,1,1,0};
		int[] dy = {-1,0,1,1,1,0,-1,-1};
		
		for(int i = 0 ; i < map.length; i++) {
			System.out.println();
			Arrays.fill(map[i], 2); //2로 채워넣기
			for (int j = 0; j < map[i].length; j++) {
				if (i==j) {
					map[i][j] = 0;
				}
				
				//System.out.print(map[i][j]);
				
			}
		}
		
		
		System.out.println((char)7);
		
		return answer;
	}
}

public class hs_passwd {
	Solution T = new Solution();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
