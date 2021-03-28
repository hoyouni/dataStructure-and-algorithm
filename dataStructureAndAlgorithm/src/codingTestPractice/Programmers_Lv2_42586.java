package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Programmers_Lv2_42586 {
	public static int[] solution(int[] progresses, int[] speeds) {
		Stack<Integer> proCnt = new Stack<Integer>();

		for(int i = progresses.length - 1; i >= 0; i--) {
			int idx = speeds[i];
			int cnt = 0;
			while(progresses[i] < 100) {
				progresses[i] = progresses[i] + idx;
				cnt++;
			}
			proCnt.push(cnt);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		while(!proCnt.isEmpty()) {
			while(proCnt.peek() != 0) {
				for(int i = 0; i < proCnt.size(); i++) {
					if(proCnt.get(i) <= 0)
						continue;
					proCnt.set(i, proCnt.get(i) - 1);
				}
			}
			//System.out.println(proCnt);
			
			int index = 0;
			for(int i = proCnt.size() - 1; i >= 0; i--) {
				if(i - 1 >= 0 && proCnt.get(i) > proCnt.get(i - 1)) {
					break;
				}
				if(proCnt.get(i) == 0) {
					proCnt.pop();
					index++;
				}
			}
			list.add(index);
		}

		//System.out.println(list);
		int[] result = new int[list.size()];
		int idx = 0;
		for(int i : list) {
			result[idx] = i;
			idx++;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] result = solution(progresses, speeds);
		System.out.println(Arrays.toString(result));

	}
}
