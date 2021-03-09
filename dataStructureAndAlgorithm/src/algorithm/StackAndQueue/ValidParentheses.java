package algorithm.StackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String exp) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('(', 1);
		map.put(')', 1);
		map.put('[', 2);
		map.put(']', 2);
		map.put('{', 3);
		map.put('}', 3);
		
		
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
				s.push(exp.charAt(i));
				
			} else {
				char s_str = s.peek();
				char str = exp.charAt(i);
				if(map.get(s_str) == map.get(str)) {
					s.pop();
				}
			}
		}
		
		if(s.size() > 0)
			return false;
		else
			return true;
		
	}
	
	public static void main(String[] args) {
		String exp = "(]";
		System.out.println(isValid(exp));
	}
}
