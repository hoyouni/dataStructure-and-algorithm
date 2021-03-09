package algorithm.DynamicProgramming;

public class UniquePaths_mySol {
	public static int solution(int m, int n) {
		int[][] grid = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i == 0 || j == 0) {
					grid[i][0] = 1;
					grid[0][j] = 1;
				} else {
					grid[i][j] = grid[i][j - 1] + grid[i - 1][j]; 
				}
				
			}
		}

		return grid[grid.length - 1][grid[0].length - 1];
	}

	public static void main(String[] args) {
		int m = 7, n = 3;
		int result = solution(m, n);
		System.out.println(result);
	}
}
