package algorithm.StringAndArray;

import java.util.Arrays;

public class PlusOne {
	public static int[] solution(int[] input) {
		long start = System.nanoTime();
		
		for(int i = input.length - 1; i >= 0; i--) {
			if(input[i] != 9) {
				input[i] += 1;
				break;
			} else {
				input[i] = 0;
			}
		}
		
		if(input[0] == 0) {
			int[] result = new int[input.length + 1];
			result[0] = 1;
			
			long end = System.nanoTime();
			System.out.println(end - start + " dd");
			
			
			return result;
		}
		
		long end = System.nanoTime();
		System.out.println(end - start + " dd");
		
		return input;
	}
	
	public static void main(String[] args) {
		//int[] input = {1,2,3};
		int[] input = {9,9,9};
		int[] output = solution(input);
		System.out.println(Arrays.toString(output));
		
	}
}

