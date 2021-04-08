package codingTestPractice;

import java.util.Arrays;

public class Programmers_Lv2_12945 {
	// F(N) = F(N - 1) + F(N - 2)
	public static int solution(int n) {
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = fibo[0] + fibo[1];
        
		for(int i = 3; i <= n; i++) { // 3
        	fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1234567;
        }
		
		
        return fibo[n];
    }
	public static void main(String[] args) {
		int n = 5;
		int result = solution(n);
		System.out.println(result);
	}
}
