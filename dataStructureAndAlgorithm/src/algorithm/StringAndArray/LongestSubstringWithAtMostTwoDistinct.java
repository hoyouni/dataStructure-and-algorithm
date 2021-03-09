package algorithm.StringAndArray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostTwoDistinct {
	public static int solution(String input) {
		
		// 1
		int start = 0, end = 0, length = 0, counter = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		// 2
		while(end < input.length()) {
			System.out.println("start : " + start + ", end : " + end);
			char endChar = input.charAt(end);
			System.out.println("endChar : " + endChar);
			
			map.put(endChar, map.getOrDefault(endChar, 0) + 1);
			
			if(map.get(endChar) == 1) {
				counter++;
			}
			end++;
			
			// 3
			while(counter > 2) {
				char startChar = input.charAt(start);
				map.put(startChar, map.get(startChar) - 1);
				
				if(map.get(startChar) == 0) {
					counter--;
				}
				start++;
			}
			
			length = Math.max(length, end - start);
			
		}
		
		return length;
	}
	
	public static void main(String[] args) {
		String input = "ccaabbb";
		int result = solution(input);
		System.out.println(result);
	}
}
