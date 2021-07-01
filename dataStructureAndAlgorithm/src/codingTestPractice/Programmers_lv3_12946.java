package codingTestPractice;

import java.util.Arrays;
import java.util.List;

public class Programmers_lv3_12946 {
	static int[][] list = new int[10000][2];
	static int cnt = 0;
	
	public static void hanoi(int n, int x, int y) {
		
		if(n > 1) {
			hanoi(n - 1, x, 6 - x - y);
		}
		
		list[cnt][0] = x;
		list[cnt][1] = y;
		cnt++;
		
		if(n > 1) {
			hanoi(n - 1, 6 - x - y, y);
		}
	}
	
	public static int[][] solution(int n) {
		hanoi(n, 1, 3);
        int cnt = 0;
        while(true) {
        	if(list[cnt][0] != 0)
        		cnt++;
        	else
        		break;
        }
        int[][] goods = new int[cnt][2];
        for(int i = 0; i < goods.length; i++) {
        	goods[i][0] = list[i][0];
        	goods[i][1] = list[i][1];
        }
        return goods;
    }
	
	public static void main(String[] args) {
		int n = 3;
		int[][] result = solution(n);
		System.out.println(Arrays.deepToString(result));
	}
}











