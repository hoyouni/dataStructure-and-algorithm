package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_Lv2_42883 {
	public static String solution(String number, int k) {
		String[] numList = number.split("");
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < numList.length; i++) {
			list.add(numList[i]);
		}
		System.out.println(list);

		


		return null;
	}

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String result = solution(number, k);
		System.out.println(result);
	}
}
