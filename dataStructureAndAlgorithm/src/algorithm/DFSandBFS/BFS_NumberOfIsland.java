package algorithm.DFSandBFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_NumberOfIsland {

	int[][] dirs = {{-1,0}, {1,0}, {0, 1}, {0, -1}};
	
	public int numberOfIsland(char[][] grid) {
		if(grid == null || grid.length == 0) {
			return 0;
		}
		
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == '1') {
					count++;
					bfs(grid, i, j);
				}
			}
		}

		return count;
	}
	
	public void bfs(char[][] grid, int i, int j) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {i, j});
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			int[] point = queue.poll();
			for(int k = 0; k < size; k++) {
				for(int[] dir : dirs) {
					int x1 = point[0] + dir[0];
					int y1 = point[1] + dir[1];
					if(x1 >= 0 && y1 >= 0 && x1 < grid.length && y1 < grid[0].length && grid[x1][y1] == '1') {
						grid[x1][y1] = '0';
						queue.offer(new int[] {x1, y1});
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		char[][] grid = {
				{'1', '1', '1', '0', '1'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '1'},
				{'0', '0', '0', '0', '1'}
		};
		BFS_NumberOfIsland a = new BFS_NumberOfIsland();
		int result = a.numberOfIsland(grid);
		System.out.println(result);
	}
}









