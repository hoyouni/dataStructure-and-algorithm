package codingTestPractice;

public class Programmers_Lv1_76501 {
	public static int solution(int[] absolutes, boolean[] signs) {
		int[] result = new int[absolutes.length];
		int sum = 0;
		for(int i = 0; i < signs.length; i++) {
			if(signs[i] == true)
				result[i] = absolutes[i];
			else
				result[i] = absolutes[i] - (absolutes[i] * 2);
			sum = sum + result[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		int result = solution(absolutes, signs);
		System.out.println(result);
	}
}
