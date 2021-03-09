package algorithm.StringAndArray;

import java.util.Arrays;

public class MergeInterval_mySol {
	public static int[][] solution(int[][] input) {
		int[][] result = new int[input.length][input[0].length];
		
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		
		int cnt = 0;
		int len = 0;
		for(int i = 1; i < input.length; i++) {
			if(input[i - 1][cnt + 1] > input[i][cnt]) {
				result[i - 1][cnt] = input[i - 1][cnt];
				result[i - 1][cnt + 1] = input[i][cnt + 1];
				len++;
			} else {
				result[i - 1][cnt] = input[i][cnt];
				result[i - 1][cnt + 1] = input[i][cnt + 1];
				len++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] input = {{1, 3},{2, 6},{8, 10},{15, 18}};
		int[][] result = solution(input);
		System.out.println(Arrays.deepToString(result));
	}
}
