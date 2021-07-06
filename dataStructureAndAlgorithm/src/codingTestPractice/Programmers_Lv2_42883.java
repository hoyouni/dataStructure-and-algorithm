package codingTestPractice;

public class Programmers_Lv2_42883 {
	public static String solution(String number, int k) {
        StringBuilder a = new StringBuilder(number);
        System.out.println("a : " + a.toString());
        
        int i = 0;
        int j = 0;
        int idx;
        int l;

        for (i = 0; i < k; i++) {
            l=a.length(); // 10
            idx = l - 1; // 9
            for (j = 0; j < l - 1; j++) {
                if (a.charAt(j) < a.charAt(j + 1)) {
                    idx = j;
                    System.out.println("a.charAt(j) : " + a.charAt(j) + ", a.charAt(j+1) : " + a.charAt(j+1) + ", idx : " + j);
                    break;
                }
            }
            
            a.deleteCharAt(idx);
        }

        return a.toString();
    }

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String result = solution(number, k);
		System.out.println(result);
	}
}
