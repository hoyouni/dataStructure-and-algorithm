package algorithm.StringAndArray;

public class LicenseKeyFormatting_mySol {
	public static String solution(String str, int k) {
		String result = "";
		
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		
		for(int i = str.length(); i > 0; i--) {
			if(cnt == k) {
				sb.append("-");
				cnt = 0;
			}
			if(!str.substring(i - 1, i).equals("-")) {
				sb.append(str.substring(i - 1, i).toUpperCase());
				cnt++;
			}
		} // for
		
		result = sb.reverse().toString();
		
		return result;
	}
	
	public static void main(String[] args) {
		String str = "2-4A0r7-4k";
		int k = 3;
		String result = solution(str, k);
		System.out.println(result);
	}
}
