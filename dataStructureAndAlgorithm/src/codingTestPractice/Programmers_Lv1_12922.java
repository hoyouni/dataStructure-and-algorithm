package codingTestPractice;

public class Programmers_Lv1_12922 {
	public String solution(int n) {
		StringBuffer text = new StringBuffer();
		text.append("수박");

		for(int i = 1; i <= n / 2; i++) {
			text = text.append("수박");
		}

		return text.substring(0, n);

	}

	public static void main(String[] args) {
		Programmers_Lv1_12922 p = new Programmers_Lv1_12922();
		int n = 1;
		String result = p.solution(n);
		System.out.println(result);
	}
}
