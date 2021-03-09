package algorithm.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BaseballGame {
	public static int solution(String[] input) {
		int sum = 0;
		
		if(input == null || input.length == 0) 
			return sum;
		
		Queue<String> q = new LinkedList<String>(); 
		Stack<String> s = new Stack<String>(); 
		for(String str : input) {
			q.offer(str);
		}
		
		int plus = 0;
		while(!q.isEmpty()) {
			String str = q.poll();
			switch (str) {
			case "C":
				sum = sum - Integer.parseInt(s.peek());
				s.pop();
				break;
			case "D":
				plus = Integer.parseInt(s.peek()) * 2;
				sum = sum + (Integer.parseInt(s.peek()) * 2);
				s.pop();
				break;
			case "+":
				sum = sum + Integer.parseInt(s.peek()) + plus;
				plus = plus + Integer.parseInt(s.peek());
				break;
			default:
				sum = sum + Integer.parseInt(str);
				s.push(str);
				break;
			} // switch
		} // while
		
		return sum;
	}

	public static void main(String[] args) {
		String[] input = {"5", "-2","4", "C", "D", "9", "+", "+"};
		int result = solution(input);
		System.out.println(result);
	}
}

