package algorithm.DFSandBFS;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public String solution(String s) {
		int[] dp = new int[500];
		for(int i = 0; i < s.length(); i++) {
			dp[s.charAt(i)]++;
		}
		
		List<Character> list = new ArrayList<Character>();
		int max = 0;
		for(int i = 0; i < dp.length; i++) {
			if(dp[i] != 0 && max < dp[i]) {
				max = dp[i];
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			if(max == dp[i]) {
				list.add((char)i);
			}
		}
		
		return list.get(0).toString();
	}
	
	public static void main(String[] args) {
		String s = "hello";
		
		Test a = new Test();
		System.out.println(a.solution(s));
	}
}
