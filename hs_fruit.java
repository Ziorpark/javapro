package prac2;

class Solution2 {
	public int soluton(int[][] fruit) {
		int answer = 0;
		
		return answer;
	}
	
	public static void frumin(int[][] map) {
		
		//2차원 배열을 받는다.
		int idx = map.length;
		//int [] arr = new int[3];

		//최솟값을 찾아야한다.
		//index별로 구분지어야한다.
		
		int n = 0;

		for(int i = 0; i < map[0].length; i++) {
			System.out.println(map[0][i]);
			int mmin = Math.min(map[0][i], map[0][i+1]);
			for (int j = 0; j < 3; j++) {
				Math.min(map[0][j], map[0][j+1]);
			}
		}
		
	
	}
}

public class hs_fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 sol = new Solution2();
		
		
		int [][] map = {{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}};
		sol.frumin(map);
		
	}

}
