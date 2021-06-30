package algorithmBooks;

import java.util.Arrays;

// 이진검색 O(log n)
public class BinSearch {
	public static int binarySearch(int[] a, int firstIdx, int lastIdx, int key) {
		
		int middleIdx = (firstIdx + lastIdx) / 2;
		
		while(firstIdx < lastIdx) {
			if(a[middleIdx] < key) {
				firstIdx = middleIdx + 1;
			}
			if(a[middleIdx] > key) {
				lastIdx = middleIdx - 1;
			}
			middleIdx = (firstIdx + lastIdx) / 2;
			
			if(a[middleIdx] == key)
				return middleIdx;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
		int key = 9;
		int result = binarySearch(a, 0, a.length - 1, key);
		System.out.println(result);
	}
}




























