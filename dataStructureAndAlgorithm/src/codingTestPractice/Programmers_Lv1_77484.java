package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_Lv1_77484 {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] rank = {6, 5, 4, 3, 2, 0};
		
		List<Integer> list = new ArrayList<Integer>();
		
		int cnt = 0;
		for(int i = 0; i < lottos.length; i++) {
			int num = lottos[i];
			if(num == 0)
				cnt++;
			for(int j = 0; j < win_nums.length; j++) {
				if(num == win_nums[j] || num == 0) {
					list.add(num);
					break;
				}
			}
		}
		
		int[] result = new int[2];
		
		int minRank = list.size() - cnt;
		int maxRank = list.size();
		
		
		for(int i = 0; i < rank.length; i++) {
			if(rank[i] == minRank || rank[i] == maxRank) {
				if(rank[i] == minRank) {
					result[1] = i + 1;
				} 
				if(rank[i] == maxRank) {
					result[0] = i + 1;
				}
				continue;
			}
			
		}
		
		Arrays.sort(result);
		
		return result;
	}

	public static void main(String[] args) {
		int[] lottos = {1, 1, 1, 1, 1, 1};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		int[] result = solution(lottos, win_nums);
		System.out.println(Arrays.toString(result));
	}
}
