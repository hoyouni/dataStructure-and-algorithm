package algorithm.StringAndArray;
import java.util.Arrays;

public class TwoSum_mySol {
	public static int[] solution(int[] input, int target) {
		int[] result = new int[2];
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		
		int index = 0;
		for(int i = 0; i < input.length; i++) {
			if(input[i] > target)
				index = i;
		}
		
		for(int i = 0; i < index; i++) {
			int setZero = target - input[i];
			for(int j = i + 1; j < index; j++) {
				int setZero2 = 0;
				setZero2 = setZero - input[j];
				if(setZero2 == 0) {
					result[0] = i + 1;
					result[1] = j + 1;
					break;
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] input = {2, 8, 10, 21};
		int target = 10;
		int[] result = solution(input, target);
		System.out.println(Arrays.toString(result));
	}
}