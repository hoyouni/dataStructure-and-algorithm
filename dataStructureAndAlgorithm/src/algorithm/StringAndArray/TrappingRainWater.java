package algorithm.StringAndArray;

import java.util.Arrays;

public class TrappingRainWater {
	public static int solution(int[] height) {
		int[] left = new int[height.length];
		int[] right = new int[height.length];
		
		int max = height[0];
		int max2 = height[height.length - 1];
		for(int i = 0; i < height.length; i++) {
			if(height[i] > max) {
				max = height[i];
				left[i] = max;
			}
			left[i] = max;
		}
		
		for(int i = height.length - 1; i >= 0; i--) {
			if(height[i] > max2) {
				max2 = height[i];
				right[i] = max2;
			}
			right[i] = max2;
		}
		
		int[] result = new int[height.length];
		int sum = 0;
		for(int i = 0; i < result.length; i++) {
			result[i] = Math.min(left[i], right[i]);
			result[i] = result[i] - height[i];
			sum += result[i];
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int result = solution(height);
		System.out.println(result);
	}
}