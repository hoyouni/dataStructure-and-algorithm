package algorithmBooks;

import java.util.Scanner;

public class SumWhileAndFor {
	static int solFirst(int n, int sum, int cnt) {
		while(cnt <= n) {
			sum = sum + cnt;
			cnt++;
		}
		return sum;
	}
	
	static int solSecond(int n , int sum, int cnt) {
		for(int i = cnt; i <= n; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int cnt = 1;
		
		int firstResult = solFirst(n, sum, cnt);
		int secondResult = solSecond(n, sum, cnt);
		
		System.out.println("firstResult : " + firstResult + "\n" + "secondResult : " + secondResult);
		
	}
	
	
}
