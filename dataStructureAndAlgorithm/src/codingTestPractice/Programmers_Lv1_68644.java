package codingTestPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programmers_Lv1_68644 {
	public static int[] solution(int[] numbers) {
        
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				int num = numbers[i] + numbers[j];
				set.add(num);
			}
		}
		
		int[] result = new int[set.size()];
		int cnt = 0;
		Iterator<Integer> ir = set.iterator();
		while(ir.hasNext()) {
			result[cnt] = ir.next();
			cnt++;
		}
		
		Arrays.sort(result);
		
        return result;
    }
	
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7};
		int[] result = solution(numbers);
		System.out.println(Arrays.toString(result));
	}
}




























