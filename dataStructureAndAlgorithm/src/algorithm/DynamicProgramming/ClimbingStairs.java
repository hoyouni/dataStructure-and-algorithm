package algorithm.DynamicProgramming;


public class ClimbingStairs {
	public static int solution(int target) {
		int[] dp = new int[target + 1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[target];
	}
	
	public static void main(String[] args) {
		int target = 3;
		int result = solution(target);
		System.out.println(result);
	}
}
