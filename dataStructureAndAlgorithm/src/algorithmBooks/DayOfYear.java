package algorithmBooks;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int cnt = 1;
		
		while(cnt < m) {
			d += mdays[isLeap(y)][cnt - 1];
			cnt++;
		}
		
		/*
		int days = d;
		for(int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];
		}
		
		return days;
		*/
		
		return d;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int test = isLeap(y);
		int sum = 0;
		for(int i = 0; i < mdays[0].length; i++) {
			sum += mdays[test][i];
		}
		
		return sum - dayOfYear(y, m, d);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수");
		
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d 일째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("그 해 %d 일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? : ");
			retry = sc.nextInt();
			
		} while(retry == 1);
	}
}
















