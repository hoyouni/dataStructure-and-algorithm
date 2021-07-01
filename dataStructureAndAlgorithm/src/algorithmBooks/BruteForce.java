package algorithmBooks;

public class BruteForce {
	public static int bfMatch(String str, String pat) {
		int txtIdx = 0;
		int patIdx = 0;
		
		while(txtIdx != str.length() && patIdx != pat.length()) {
			if(str.charAt(txtIdx) == pat.charAt(patIdx)) {
				txtIdx++;
				patIdx++;
			} else {
				txtIdx = txtIdx - patIdx + 1;
				patIdx = 0;
			}
		}
		
		if(patIdx == pat.length())
			return txtIdx - patIdx;
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		String str = "ABC이지스DEF";
		String pat = "이지스";
		int idx = bfMatch(str, pat);
		
		if(idx == -1) {
			System.out.println("텍스트에 패턴 없음");
		} else {
			int len = 0;
			for(int i = 0; i < idx; i++) {
				len += str.substring(i, i + 1).getBytes().length;
			}
			System.out.println((idx + 1) + " 번 째 문자부터 일치");
		}
	}
}
