package algorithmBooks;

import java.util.Arrays;

public class TestSwap {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int num : a)
			sum += num;
		return sum;
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {22, 57, 11, 32, 91, 68, 70};
		for(int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
		}
		int sum = sumOf(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("sum : " + sum);
	}
}
























