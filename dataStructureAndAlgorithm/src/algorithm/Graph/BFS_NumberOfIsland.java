package algorithm.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_NumberOfIsland {
	static int m, n; // m : 행 길이, n : 열 길이 담을 변수
	static int[][] dirs = { // 상하좌우 움직일 방향
			{-1, 0},
			{1, 0},
			{0, -1},
			{0, 1}
	};
	static int count = 0; // 땅 갯수 
	
	public static int solve(char[][] grid) {
		if(grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		
		m = grid.length;
		n = grid[0].length;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(grid[i][j] == '1') {
					count++;
					bfs(grid, i, j);
				}
			}
		}
		return count;
	}
	
	public static void bfs(char[][] grid, int i, int j) {
		
		grid[i][j] = 'X'; // 방문했다는 표시 
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {i, j}); 
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			for(int[] dir : dirs) {
				int x1 = cur[0] + dir[0];
				int y1 = cur[1] + dir[1];
				
				if(x1 >= 0 && y1 >= 0 && x1 < m && y1 < n && grid[x1][y1] == '1') {
					grid[x1][y1] = 'X';
					q.offer(new int[] {x1, y1});
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		char[][] grid = {
				{'1', '1', '0', '0', '0'},	
				{'1', '1', '0', '0', '0'},	
				{'1', '1', '1', '0', '0'},	
				{'0', '0', '0', '1', '1'}	
		};
		
		int result = solve(grid);
		System.out.println(result);
	}
}
















