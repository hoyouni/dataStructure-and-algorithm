package algorithm.StringAndArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray_mySol {
	public int solution1(int[] nums, int k) {
		Arrays.sort(nums);
		int result = 0;
		result = nums[nums.length - k];
		return result;
	}
	
	public int solution2(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> a - b);
		
		for(int val : nums) {
			pq.offer(val);
			System.out.println(pq);
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		return pq.peek();
	}
	
	/*
	Comparator<Integer> Comp = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.intValue() - o2.intValue();
		}
	};
	*/
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 5, 6, 4};
		int k = 2;
		KthLargestElementInAnArray_mySol s = new KthLargestElementInAnArray_mySol();
		//int result = s.solution1(nums, k);
		int result2 = s.solution2(nums, k);
		//System.out.println(result);
		System.out.println(result2);
	}
}
