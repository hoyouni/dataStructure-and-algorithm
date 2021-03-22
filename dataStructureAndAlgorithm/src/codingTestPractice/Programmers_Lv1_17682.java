package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_Lv1_17682 {
	public static int solution(String dartResult) {
		ArrayList<String> list = new ArrayList<String>();
		
		int cnt = 0;
		for(int i = 0; i < dartResult.length(); i+=2) {
			if(dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#') {
				System.out.println(dartResult.substring(i - 2, i + 1));
			} else {
			System.out.println(dartResult.substring(i, i + 2));
			}
		}
		
		
		System.out.println(list);
		return -1;
    }
	
	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		int result = solution(dartResult);
		System.out.println(result);
	}
}














