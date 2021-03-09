package algorithm.StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne_mySol {
	public static int[] solution(int[] input) {
		long start = System.nanoTime();
		
		List<Integer> list = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < input.length; i++) {
			sb.append(Integer.toString(input[i]));
		}
		
		int num = Integer.parseInt(sb.toString());
		num = num + 1;
		
		String str = Integer.toString(num);
		for(int i = 0; i < str.length(); i++) {
			list.add(Integer.parseInt(str.substring(i, i + 1)));
		}
		
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		
		long end = System.nanoTime();
		System.out.println(end - start + " dd");
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = {9,9,9};
		int[] output = solution(input);
		System.out.println(Arrays.toString(output));
	}
}
