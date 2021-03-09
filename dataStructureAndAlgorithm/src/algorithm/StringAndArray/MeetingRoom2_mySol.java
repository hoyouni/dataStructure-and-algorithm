package algorithm.StringAndArray;

import java.util.Arrays;

class Interval3 {
	int start;
	int end;
	Interval3() {
		start = 0;
		end = 0;
	}
	Interval3(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom2_mySol {
	public static int solution(Interval3[] intervals) {
		Arrays.sort(intervals, (a,b) -> a.start - b.start);
		
		int min = 1;
		
		for(int i = 1; i < intervals.length; i++) {
			if(intervals[i - 1].end > intervals[i].start) {
				min++;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Interval3 in1 = new Interval3(0, 30);
		Interval3 in2 = new Interval3(5, 10);
		Interval3 in3 = new Interval3(15, 20);
		
		Interval3[] intervals = {in1, in2, in3};
		
		int result = solution(intervals);
		System.out.println(result);
		
	}
}

