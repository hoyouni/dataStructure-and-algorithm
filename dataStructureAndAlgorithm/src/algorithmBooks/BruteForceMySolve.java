package algorithmBooks;

public class BruteForceMySolve {
	static int bfMatch(String str, String pat) {
		int idx = 0;
		for(int i = 0; i < str.length(); i++) {
			int cnt = 0;
			while(cnt < pat.length()) {
				if(str.charAt(idx++) == pat.charAt(cnt)) {
					cnt++;
				} else {
					break;
				}
			}
			if(cnt == 3) {
				idx = i;
				return idx;
			} else {
				idx = i + 1;
			}
		}
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



















