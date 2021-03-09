package algorithm.DFSandBFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Maze1 {
	// 상하좌우 
	int[][] dirs = {{-1, 0},{1, 0},{0, -1},{0, 1}};
	
	// 행, 열 길이 
	int m, n;
	
	public boolean hasPath(int[][] maze, int[] start, int[] dest) {
		m = maze.length; // 5
		n = maze[0].length; // 5
		
		// 시작지점과 끝지점이 같다면 true 
		if(start[0] == dest[0] && start[1] == dest[1])
			return true;
		
		// 방문 체크 
		boolean[][] visited = new boolean[m][n];
		visited[start[0]][start[1]] = true;
		
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {start[0], start[1]});
		
		while(!queue.isEmpty()) {
			int[] p = queue.poll();
			for(int[] dir : dirs) {
				// 상하좌우로 움직일 좌표
				int x = p[0] + dir[0];
				int y = p[1] + dir[1];
				
				// 조건에 부합하면 while 안에 들어옴 
				while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0) {
					x = x + dir[0];
					y = y + dir[1];
				}
				
				x = x - dir[0];
				y = y - dir[1];
				
				if(visited[x][y])
					continue;
				
				visited[x][y] = true;
				//System.out.println("---------");
				//print(visited);
				if(x == dest[0] && y == dest[1])
					return true;
				
				queue.offer(new int[] {x, y});
			}
		}
		return false;
	}
	
	public void print(boolean[][] visited) {
		if(visited == null || visited.length == 0) {
			return;
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
		
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
		BFS_Maze1 a = new BFS_Maze1();
		System.out.println(a.hasPath(maze, start, dest));
	}
}











