package prac;

import java.util.*;

class Solution {
	public char[] solution(int n, int[][] ladder) {
		char[] answer = new char[n];
		for (int i = 0; i < n; i++) {
			answer[i] = (char)(i + 65); //학생이름지어주기(A,B,C,D...)
		}
		
		for (int[] line : ladder) { //이중배열중 배열하나
			for (int x : line) { //배열에서 값을 하나
				char tmp = answer[x]; //위치를 교환하기 위해 필요한 변수 tmp = B
				answer[x] = answer[x-1]; //위치교환 answer[1] = A
				answer[x-1] = tmp; //answer[0] = tmp, B
			}
		}
		
		return answer;
	}
}

public class pp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
		System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
		System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
		System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
	}

}
