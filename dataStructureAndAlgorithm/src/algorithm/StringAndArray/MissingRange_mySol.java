package algorithm.StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRange_mySol {
	public static List<String> solution(int[] nums, int lower, int upper) {
		int[] result = new int[100];
		for(int i = 0; i < nums.length; i++) {
			result[nums[i]]++;
		}
		System.out.println(Arrays.toString(result));
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < result.length; i++) {
			if(result[i] == 0)
				list.add(i);
		}
		System.out.println(list);
		List<Integer> list3 = new ArrayList<Integer>();
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i - 1) + 1 != list.get(i)) {
				list3.add(list.get(i - 1));
				list3.add(list.get(i));
			}
		}
		System.out.println(list3);
		return null;
	}
	public static void main(String[] args) {
		int[] nums = {2, 3, 5, 50, 75};
		int lower = 0, upper = 99;
		List<String> result = solution(nums, lower, upper);
		System.out.println(result);
	}
}
