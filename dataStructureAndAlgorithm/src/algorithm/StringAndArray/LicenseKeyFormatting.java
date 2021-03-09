package algorithm.StringAndArray;

public class LicenseKeyFormatting {
	public static String solution(String str, int k) {
		String newStr = str.replace("-", "");
		newStr = newStr.toUpperCase();
		
		int leng = newStr.length();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < newStr.length(); i++) {
			sb.append(newStr.charAt(i));
		}
		
		for(int i = k; i < leng; i = i + k) {
			sb.insert(leng - i, '-');
		}
		
		newStr = sb.toString();
		
		return newStr;
	}
	
	public static void main(String[] args) {
		 String str = "8-5g-3-J";
		//String str = "8F3Z-2e-9-w";
		int k = 4;
		String result = solution(str, k);
		System.out.println(result);
	}
}