package algorithmBooks;

import java.util.Scanner;

// 보초법
// 선형검색 O(n)
public class SeqSearchSen {
	public static int seqSearchSen(int[] x, int num, int ky) {
		x[num] = ky;
		
		int i = 0;
		while(true) {
			if(x[i] == ky)
				break;
			i++;
		}
		
		return i == num ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) 
			System.out.println("검색값 없음"); 
		else
			System.out.println("검색한 값은 " + idx + " 에 있음"); 
		
	}
}

















