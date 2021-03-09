package algorithm.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis_dfs(int n) {
		List<String> result = new ArrayList<String>();
		dfs(result, "", n, n);
		
		return result;
	}
	
	int count = 0;
	
	public void dfs(List<String> result, String str, int left, int right) {
		count++;
		
		// 1. 제약조건
		if(left < 0 || left > right) { 
			return;
		}
		
		// 2. 
		if(left == 0 && right == 0) {
			result.add(str);
			return;
		}

		dfs(result, str + '(', left - 1, right);
		dfs(result, str + ')', left, right - 1);
	}

	public static void main(String[] args) {
		GenerateParentheses a = new GenerateParentheses();
		System.out.println(a.generateParenthesis_dfs(3));
	}
}
