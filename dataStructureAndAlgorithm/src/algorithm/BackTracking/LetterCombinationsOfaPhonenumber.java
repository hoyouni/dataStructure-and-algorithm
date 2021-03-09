package algorithm.BackTracking;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfaPhonenumber {
	public List<String> solve(String digits) {
		String[] digitletter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		List<String> result = new ArrayList<String>();

		// 1. error check
		if(digits.length() == 0) {
			return result;
		}

		// 2.
		result.add("");
		for(int i = 0; i < digits.length(); i++) {
			result = combine(result, digitletter[digits.charAt(i) - '0']);
		}

		return result;
	}

	public List<String> combine(List<String> firstList, String digit) {
		List<String> result = new ArrayList<String>();

		for(int i = 0; i < digit.length(); i++) {
			for(String firstStr : firstList) {
				result.add(firstStr + digit.charAt(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		LetterCombinationsOfaPhonenumber a = new LetterCombinationsOfaPhonenumber();
		System.out.println(a.solve("23"));
	}
}