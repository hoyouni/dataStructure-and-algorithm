package algorithm.DFSandBFS;

public class DFS_NumberOfIsland {
	//int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public int solve(char[][] grid) {
		print(grid);
		System.out.println();
		
		// 1. error check
		if(grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		
		// 2. (i, j) 위치가 1인 곳 부터 찾는다.
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == '1') {
					System.out.println("grid["+i+"]["+j+"] : " + grid[i][j]);
					count++;
					dfs(grid, i, j);
				}
			}
		}
		
		return count;
	}
	
	public void dfs(char[][] grid, int i, int j) {
		System.out.println("i : " + i + " j : " + j);
		int m = grid.length;
		int n = grid[0].length;
		
		// 1. error check
		if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1')
			return;
		
		grid[i][j] = 'X';
		
		
		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);

		/*
		for(int[] dir : dirs) {
			int dx = i + dir[0];
			int dy = j + dir[1];
			dfs(grid, dx, dy);
		}
		 */
		
		return;
	}
	
	
	public void print(char[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				//System.out.print("grid["+i+"]["+j+"] : " + grid[i][j] + " ");
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char[][] grid = {
				{'1', '1', '1', '0', '1'},
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0', '0', '1'},
				{'0', '0', '0', '0', '1'}
		};

		DFS_NumberOfIsland a = new DFS_NumberOfIsland();
		int result = a.solve(grid);
		System.out.println(result);
	}

}

