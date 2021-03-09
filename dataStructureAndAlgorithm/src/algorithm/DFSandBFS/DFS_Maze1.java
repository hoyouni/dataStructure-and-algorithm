package algorithm.DFSandBFS;

public class DFS_Maze1 {
	int[][] dirs = {{-1, 0},{1, 0},{0, -1},{0, 1}};
	int m, n;
	
	public boolean hasPath(int[][] maze, int[] start, int[] dest) {
		if(maze == null || maze.length == 0)
			return false;
		
		m = maze.length;
		n = maze[0].length;
		boolean[][] visited = new boolean[m][n];
		
		return dfs(maze, start, dest, visited);
		
	}
	
	public boolean dfs(int[][] maze, int[] start, int[] dest, boolean[][] visited) {
		// 에러 체크 
		if(start[0] < 0 || start[0] >= m || start[1] < 0 || start[1] >= n || visited[start[0]][start[1]])
			return false;
		
		// 첫 방문 
		visited[start[0]][start[1]] = true;
		
		// 시작점과 끝 점이 동일하면 true
		if(start[0] == dest[0] && start[1] == dest[1])
			return true;
		
		// 2.
		for(int[] dir : dirs) {
			int x = start[0];
			int y = start[1];
			
			while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0) {
				x = x + dir[0];
				y = y + dir[1];
			}
			
			x = x - dir[0];
			y = y - dir[1];
			
			if(dfs(maze, new int[] {x, y}, dest, visited)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[][] maze = {
				{0, 0, 1, 0, 0},	
				{0, 0, 0, 0, 0},	
				{0, 0, 0, 1, 0},	
				{1, 1, 0, 1, 1},	
				{0, 0, 0, 0, 0}	
		};
		
		int[] start = {0, 4};
		int[] dest = {4, 4};
		
		DFS_Maze1 a = new DFS_Maze1();
		System.out.println(a.hasPath(maze, start, dest));
	}
}



