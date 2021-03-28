package codingTestPractice;

// https://programmers.co.kr/learn/courses/30/lessons/70128?language=java
public class Programmers_Lv1_70128 {
	public static int solution(int[] a, int[] b) {
        
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			int num = a[i] * b[i];
			sum = sum + num;
		}
		
        return sum;
    }
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		int result = solution(a, b);
		System.out.println(result);
	}
}
