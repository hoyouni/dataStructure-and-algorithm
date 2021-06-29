package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_Lv2_17686 {
	public static String[] solution(String[] files) {
        List<List<String>> list = new ArrayList<List<String>>();
        
        List<String> list2 = null;
        for(int i = 0; i < files.length; i++) {
        	list2 = new ArrayList<String>();
        	files[i] = files[i].toUpperCase();
        	String str = "";
        	String str2 = "";
        	for(int j = 0; j < files[i].length(); j++) {
        		char ch = files[i].charAt(j);
        		if(48 <= ch && ch <= 57) {
        			str2 += ch;
        		} else {
        			if(j > 0 && 48 <= files[i].charAt(j - 1) && files[i].charAt(j - 1) <= 57) 
        				break;
        			else 
        				str += ch;
        		}
        	}
        	list2.add(str2);
        	list2.add(str);
        	str = "";
        	list.add(list2);
        }
		
        System.out.println(list);
        
        
        return null;
    }

	public static void main(String[] args) {
		String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		String[] result = solution(files);
		System.out.println(Arrays.toString(result));
	}
}
