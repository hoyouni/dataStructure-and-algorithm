package algorithm.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if(nums == null || nums.length == 0)
			return result;
		
		dfs(result, list, nums, 0);
		
		return result;
	}
	
	public void dfs(List<List<Integer>> lists, List<Integer> cur, int[] nums, int start) {
		// 1. 담을 그릇
		List<Integer> list = new ArrayList<Integer>(cur);
		lists.add(list);
		
		// 2. for문
		for(int i = start; i < nums.length; i++) {
			cur.add(nums[i]);
			dfs(lists, cur, nums, i + 1);
			cur.remove(cur.size() - 1);
		}
		
	}
	
	public static void main(String[] args) {
		Subsets a = new Subsets();
		int[] nums = {1, 2, 3};
		System.out.println(a.subsets(nums));
	}
}

