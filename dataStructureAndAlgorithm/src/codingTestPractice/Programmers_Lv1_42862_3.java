package codingTestPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
// 체육복

public class Programmers_Lv1_42862_3 {
	public static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++) {
        	map.put(Integer.toString(i + 1), 1);
        }
        
        for(int i = 0; i < lost.length; i++) {
        	if(map.containsKey(Integer.toString(lost[i]))) {
        		int num = map.get(Integer.toString(lost[i]));
        		map.put(Integer.toString(lost[i]), --num);
        	}
        }

        
        for(int i = 0; i < reserve.length; i++) {
        	if(map.containsKey(Integer.toString(reserve[i]))) {
        		int num = map.get(Integer.toString(reserve[i]));
        		map.put(Integer.toString(reserve[i]), ++num);
        	}
        }
        
        System.out.println("map : " + map);
        
        
        for(int i = 0; i < map.size(); i++) {
        	int num = map.get(Integer.toString(i + 1));
        	if(num == 2) {
        		if(map.containsKey(Integer.toString(i)) && map.get(Integer.toString(i)) == 0) {
        			map.put(Integer.toString(i), 1);
        			map.put(Integer.toString(i + 1), --num);
        			continue;
        		}
        		if(map.containsKey(Integer.toString(i + 2)) && map.get(Integer.toString(i + 2)) == 0) {
        			map.put(Integer.toString(i + 2), 1);
        			map.put(Integer.toString(i + 1), --num);
        			continue;
        		}
        	} else {
        		continue;
        	}
        }
        
        System.out.println("map2 : " + map);
        
        int result = 0;
        for(int i = 0; i < map.size(); i++) {
        	if(map.get(Integer.toString(i + 1)) >= 1) 
        		result++;
        }
        
        
        return result;
    }
	
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {5, 4, 2};
		int[] reserve = {2, 3};
		int result = solution(n, lost, reserve);
		 System.out.println(result);
	}
}














