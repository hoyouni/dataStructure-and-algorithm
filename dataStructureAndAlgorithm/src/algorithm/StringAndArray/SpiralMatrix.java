package algorithm.StringAndArray;


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static List<Integer> solution(int[][] input) {
		List<Integer> result = new ArrayList<Integer>();
		if(input == null || input.length == 0) {
			return result;
		}

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = input.length - 1;
		int colEnd = input[0].length - 1;

		//
		while(rowStart <= rowEnd && colStart <= colEnd) {
			//right
			for(int i = 0; i <= colEnd; i++) {
				result.add(input[rowStart][i]);
			}
			rowStart++;

			//down
			for(int i = rowStart; i <= rowEnd; i++) {
				result.add(input[i][colEnd]);
			}
			colEnd--;

			//left
			if(rowStart <= rowEnd)
				for(int i = colEnd; i >= colStart; i--) {
					result.add(input[rowEnd][i]);
				}
			rowEnd--;

			//up
			if(colStart <= colEnd)
				for(int i = rowEnd; i >= rowStart; i--) {
					result.add(input[rowEnd][colStart]);
				}
			colStart++;


		}

		return result;
	}

	public static void main(String[] args) {
		int[][] input = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		List<Integer> result = solution(input);
		System.out.println(result);

	}
}
