package prac2;

import java.util.Arrays;

class Solution_t1 {
	public int solution(int[] keypad, String passwd){
		int answer = 0;
		int [][] dist = new int[10][10];
		int [][] pad = new int[3][3];
		int[] dx = {-1,-1,-1,0,1,1,1,0};
		int[] dy = {-1,0,1,1,1,0,-1,-1};
		
		for(int i = 0; i<3; i++) { // 3*3 키패드 생성
			for(int j =0; j<3; j++) {
				pad[i][j] = keypad[i*3 + j];
			}
		}
		
		for(int i =0; i < 10; i++) { // 기본값 2로 채우기
			Arrays.fill(dist[i],2);
		}
		for (int i =0; i < 10; i++) dist[i][i] = 0; // 대각행렬 0을 채우기
		
		for (int i =0; i < 3; i++) { // 키패드 방향 살펴 인접하면 1넣기, 하나씩 돌아가며 보기
			for(int j = 0; j < 3; j++) { 
				int from = pad[i][j]; 
				for (int k =0; k<8; k++) { // 8방향 살펴보기
					if(i + dx[k] >= 0 && i+dx[k] < 3 && j+dy[k] >= 0 && j+dy[k] < 3) { // 범위 지정
						int to = pad[i + dx[k]] [j + dy[k]];
						dist[from][to] = 1;
						
					}
				}
			}
		}
		for ( int i = 1; i < passwd.length(); i++) {
			int from = (int)passwd.charAt(i-1)-48;
			int to = (int)passwd.charAt(i)-48;
			answer += dist[from][to];
		}
		
		return answer;

	}
}



public class ttp_passwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_t1 T = new Solution_t1();
		System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}

}
