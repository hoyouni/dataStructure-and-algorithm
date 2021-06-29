package codingTestPractice;

import java.util.Arrays;

public class Programmers_Lv2_12951 {
	public static String solution(String s) {
		String[] splitText = s.split(" ");
		System.out.println(Arrays.toString(splitText));
		for(int i = 0; i < splitText.length; i++) {
			StringBuffer sb = new StringBuffer();
			int idx = 0;
			String[] splitText2 = splitText[i].split("");
			if(0 <= splitText2[idx].charAt(0) && splitText2[idx].charAt(0) <= 9) {
				idx++;
				if(97 <= splitText2[idx].charAt(0) && splitText2[idx].charAt(0) <= 122) {
					char s2 = (char)(splitText2[idx].charAt(0) - 32);
					splitText2[idx] = String.valueOf(s2);
				}
				
				for(int k = 0; k < splitText2.length; k++) {
					sb.append(splitText2[k]);
				}
				
				splitText[i] = sb.toString();
				
				continue;
			}
			
			if(97 <= splitText2[idx].charAt(0) && splitText2[idx].charAt(0) <= 122) {
				splitText2[idx] = splitText2[idx].toUpperCase();
				for(int j = 1; j < splitText2.length; j++) {
					splitText2[j] = splitText2[j].toLowerCase();
				}
				
				for(int k = 0; k < splitText2.length; k++) {
					sb.append(splitText2[k]);
				}
				
				splitText[i] = sb.toString();
				
				continue;
			}
			
			if(65 <= splitText2[idx].charAt(0) && splitText2[idx].charAt(0) <= 90) {
				for(int j = 1; j < splitText2.length; j++) {
					splitText2[j] = splitText2[j].toLowerCase();
				}
				
				for(int k = 0; k < splitText2.length; k++) {
					sb.append(splitText2[k]);
				}
				
				splitText[i] = sb.toString();
				
				continue;
			}
			
			
		
		}
		
		//System.out.println(Arrays.toString(splitText));
		String result = "";
		for(String str : splitText) { 
			result += str;
			result += " ";
		}
		
		
		
		return result.trim();
	}

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String result = solution(s);
		System.out.println(result);
	}
}










