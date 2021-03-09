package algorithm.StringAndArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Interval4 {
	int start;
	int end;
	Interval4() {
		start = 0;
		end = 0;
	}
	Interval4(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom2 {
	static Comparator<Interval4> Comp = new Comparator<Interval4>() {
		@Override
		public int compare(Interval4 o1, Interval4 o2) {
			return o1.start - o2.start;
		}
	};

	static Comparator<Interval4> Comp2 = new Comparator<Interval4>() {
		@Override
		public int compare(Interval4 o1, Interval4 o2) {
			return o1.end - o2.end;
		}
	};

	public static int solution(Interval4[] intervals) {
		if(intervals == null || intervals.length == 0)
			return 0;

		Arrays.sort(intervals, Comp);

		PriorityQueue<Interval4> heap = new PriorityQueue<>(intervals.length, Comp2);

		heap.offer(intervals[0]);

		for(int i = 1; i < intervals.length; i++) {
			Interval4 interval = heap.poll();
			if(intervals[i].start < interval.end) {
				heap.offer(intervals[i]);
			}
			heap.offer(interval);
		}

		Iterator<Interval4> ir = heap.iterator();
		while(ir.hasNext()) {
			Interval4 in = ir.next();
			System.out.println(in.start + " " + in.end);
		}

		return heap.size();
	}




	public static void main(String[] args) {
		Interval4 in1 = new Interval4(5, 10);
		Interval4 in2 = new Interval4(15, 20);
		Interval4 in3 = new Interval4(0, 30);

		Interval4[] intervals = {in1, in2, in3};

		int result = solution(intervals);
		System.out.println(result);

	}
}
