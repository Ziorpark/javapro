package prac;
import java.util.*;

class Solution2 {
	public int[] solution(int[][] board, int k) {
		int[] answer = new int[2];
		int n = board.length; //전체맵의 크기
		
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1}; // 4방향 옯겨다니기
		int x = 0, y = 0, d =1 , count = 0; // x좌표, y좌표, d 3시방향부터 진행, count초세기
		while (count < k) {
			count ++;
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) { //벽에 부딪힘 or 장애물을 만남
				d = (d+1)%4; //4방향 옯기기
				continue;
			}
			x = nx;
			y = ny;
		}
		
		answer[0] = x;
		answer[1] = y;
		
		return answer;
	}
}

public class pp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 T = new Solution2();
		int[][] arr1 = {{0, 0, 0, 0, 0}, 
			{0, 1, 1, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = {{0, 0, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 1}, 
			{1, 1, 0, 0, 1, 0}, 
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = {{0, 0, 1, 0, 0}, 
			{0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr3, 25)));
		
	}

}
