package codingTestPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Programmers_Lv2_12973 {
	public static int solution(String s) {
		String[] str = s.split("");
		List<String> list = new ArrayList<String>();
		for(String s2 : str) 
			list.add(s2);

		int len = list.size();
		System.out.println("len : " + len);
		
		for(int i = 1; i <= len; i++) {
			System.out.println("i : " + i);
			
			if(len - i > 1) {
			if(!list.get(len - i).equals(list.get(len - (i + 1))))
					continue;
				else {
					list.remove(len - i);
					list.remove(len - (i + 1));
				}
			} else 
				break;
			System.out.println("list : " + list);
			
		}

		System.out.println(list);
		return len == list.size() ? 0 : 1;
	}

	public static void main(String[] args) {
		String s = "aabaab";
		System.out.println(solution(s));
	}
}



















