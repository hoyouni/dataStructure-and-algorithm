package codingTestPractice;


public class Programmers_Lv2_42860 {
	public static int solution(String name) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < name.length(); i++)
			sb.append("A");

		String str = sb.toString();
		//System.out.println(str);

		//
		char[] first = str.toCharArray();
		char[] second = name.toCharArray();
		char[] third = str.toCharArray();


		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cp = 0;
		
		for(int i = 0; i < first.length; i++) {
			
			if(first[i] == second[i] || third[i] == second[i]) {
				cp++;
				continue;
			}
			
			while(true) {
				if(first[i] == second[i]) {
					break;
				}
				first[i]++;
				cnt1++;
			}
			
			third[i] = (char) (third[i] + 26);

			while(true) {
				if(third[i] == second[i]) {
					break;
				}
				third[i]--;
				cnt2++;

			}
			
			System.out.println("cnt1 : " + cnt1);
			System.out.println("cnt2 : " + cnt2);
			System.out.println("-------------------");
			System.out.println("first[i] : " + first[i] + " , " + "second[i] : " + second[i]);
			
			cnt += cnt1 >= cnt2 ? cnt2 : cnt1;
			cnt1 = 0;
			cnt2 = 0;
			cnt++;
			
		}
		

		return cnt == 0 ? 1 : cnt - 1;
	}

	public static void main(String[] args) {
		String name = "ABAAAAAAAAABB";
		int result = solution(name);
		System.out.println(result);
	}
}



























