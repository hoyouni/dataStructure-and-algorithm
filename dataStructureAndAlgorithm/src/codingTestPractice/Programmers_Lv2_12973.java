package codingTestPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Programmers_Lv2_12973 {
	public static int solution(String s) {
		String[] arr = s.split("");
		Stack<String> st = new Stack<String>();
		for(int i = arr.length - 1; i >= 0; i--) {
			st.push(arr[i]);
		}
		System.out.println(st);
		
		int cnt = 0;
		int idx = st.size() - 1;
		while(idx > 1) {
			for(int i = idx; i >= 0; i--) {
				if(st.size() == 0 || idx <= 1) {
					break;
				}
				if(st.get(i).equals(st.get(i - 1))) {
					st.remove(i);
					st.remove(i-1);
					cnt++;
				}
				idx = st.size() - 1;
				System.out.println("st : " + st);
				System.out.println("idx : " + idx);
				System.out.println("cnt : " + cnt);
			}
			if(cnt == 0)
				break;
		}
		
		
		return cnt;
	}

	public static void main(String[] args) {
//		String s = "baabaa";
		String s = "cdcd";
		System.out.println(solution(s));
	}
}



















