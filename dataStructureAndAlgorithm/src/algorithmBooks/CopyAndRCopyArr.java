package algorithmBooks;

import java.util.Arrays;

public class CopyAndRCopyArr {
	static void copy(int[] a, int[] b) {
		a = b.clone();
	}
	
	static void rcopy(int[] b, int[] c) {
		int cnt = 0;
		for(int i = b.length - 1; i >= 0; i--) {
			c[cnt] = b[i];
			cnt++;
		}
	}
	
	public static void main(String[] args) {
		int[] b = {1, 2, 3, 4, 5, 6};
		int[] a = new int[b.length];
		int[] c = new int[b.length];
		copy(a, b);
		System.out.println("a : " + Arrays.toString(a) + " b : " + Arrays.toString(b));
		rcopy(b, c);
		System.out.println("a : " + Arrays.toString(a) + " c : " + Arrays.toString(c));
	}
}
