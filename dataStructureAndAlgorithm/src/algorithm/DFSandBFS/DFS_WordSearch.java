package algorithm.DFSandBFS;

public class DFS_WordSearch {
	
	int[][] dirs = {{-1, 0},{1, 0},{0, -1},{0, 1}};
	int m, n;
	
	public boolean solve(char[][] grid, String word) {
		// 1. null 체크
		if(grid == null || grid.length == 0 || grid[0].length == 0) {
			return false;
		}
		
		m = grid.length;
		n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(dfs(grid, visited, i, j, 0, word)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	// m = 3, n = 4
	public boolean dfs(char[][] grid, boolean[][] visited, int x, int y, int start, String word) {
		if(start != 0 && start == word.length())
			return true;
		
		if(x < 0 || x >= m || y < 0 || y >= n)
			return false;
		
		if(visited[x][y])
			return false;
		
		if(grid[x][y] != word.charAt(start))
			return false;
		
		visited[x][y] = true;
		for(int[] dir : dirs) {
			int dx = x + dir[0];
			int dy = y + dir[1];
			if(dfs(grid, visited, dx, dy, start + 1, word)) {
				return true;
			}
		}
		visited[x][y] = false;
		return false;
	}
	
	public static void main(String[] args) {
		char[][] grid = {
				{'A', 'B', 'C', 'E'},	
				{'S', 'F', 'C', 'S'},	
				{'A', 'D', 'E', 'E'}
		};
		String word = "ABCCED";
		
		DFS_WordSearch a = new DFS_WordSearch();
		System.out.println(a.solve(grid, word));
	}
}


