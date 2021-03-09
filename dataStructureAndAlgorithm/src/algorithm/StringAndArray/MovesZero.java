package algorithm.StringAndArray;

import java.util.Arrays;

public class MovesZero {
	public static int[] solution(int[] input) {
		int[] array = new int[input.length];
		int index = 0;
		for(int i = 0; i < input.length; i++) {
			if(input[i] == 0)
				continue;
			else {
				array[index] = input[i];
				index++;
			}
		}
		
		while(index < input.length) {
			array[index++] = 0;
		}
		
		return array;
	}

	public static void main(String[] args) {
		int[] input = {0,3,2,0,8,5};
		int[] result = solution(input);
		System.out.println(Arrays.toString(result));
	}
}
