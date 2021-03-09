package algorithm.StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress_mySol {
	public static int solution(String[] input) {
		long start = System.currentTimeMillis();
		
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < input.length; i++) {
			String first = input[i];
			int target = first.indexOf("@");
			first = first.substring(0, target);
			
			if(first.contains(".") || first.contains("+")) {
				first = first.replace(".", "");
				int plusIndex = first.indexOf("+");
				if(plusIndex != -1) {
				first = first.substring(0, plusIndex);
				}
			}
			first = first + input[i].substring(target, input[i].length());
			
			set.add(first);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end - start));
		
		return set.size();
	}
	
	public static void main(String[] args) {
		String[] input = {
				"test.email+james@coding.com",
				"test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com"
				};
		int output = solution(input);
		System.out.println(output);
	}
}








