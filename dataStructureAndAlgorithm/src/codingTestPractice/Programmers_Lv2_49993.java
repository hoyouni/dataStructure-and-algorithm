package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Programmers_Lv2_49993 {
	public static int solution(String skill, String[] skill_trees) {
		String[] skills = skill.split("");
		Stack<String> st = new Stack<String>();
		for(String str : skills) {
			st.push(str);
		}

		List<String> list = Arrays.asList(skill_trees);
		
		List<String> list2 = new ArrayList<String>();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			String first = list.get(i);

			int cnt = 0;
			for(int k = 0; k < st.size(); k++) {
				if(!first.contains(st.get(k))) {
					cnt++;
				}
			}
			if(cnt == st.size())
				continue;


			int cnt2 = 0;
			for(int j = 0; j < first.length(); j++) {
				String second = first.substring(j, j + 1);

				if(skill.contains(second)) {
					if(st.indexOf(second) > cnt2) {
						list2.add(first);
						cnt2++;
						
						break;
					} else {
						cnt2++;
						continue;
					}
				}
				
			}
			
		}
		
		return list.size() - list2.size();
	}

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int result = solution(skill, skill_trees);
		System.out.println(result);
	}
}
