package codingTestPractice;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/72410?language=java
public class Programmers_Lv1_72410 {
	public static String solution(String new_id) {
        String id = new_id.toLowerCase();
        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김 
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로 
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거 
        
        System.out.println(id);
        
        if(id.length() == 0) 
        	id += 'a';
        
        if(id.length() >= 16) {
        	for(int i = 15; i < id.length(); i++) {
        	id = id.replace(id.charAt(i), ' ');
        	}
        	id = id.trim();
        }
        
        
        if(id.length() <= 2) {
        	while(id.length() <= 2) 
        		id += id.charAt(id.length() - 1);
        }
        
        if(id.charAt(id.length() - 1) == '.') {
        	id = id.replace(id.charAt(id.length() - 1), ' ');
        	id = id.trim();
        }
        
        return id;
    }
	
	public static void main(String[] args) {
		String new_id = ".a.abcdefghijklm.p.";
		String result = solution(new_id);
		System.out.println(result);
	}
}
