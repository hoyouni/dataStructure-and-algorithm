package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

// https://programmers.co.kr/learn/courses/30/lessons/42889
// Programmers_Lv1_실패율
public class Programmers_Lv1_42889 {
	public static int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        //System.out.println(Arrays.toString(stages));
        int cnt = 0;
        int startNum = stages.length;
        
        ArrayList<Double> list = new ArrayList<Double>();
        
        for(int i = 1; i <= N; i++) { // 스테이지 
        	double failed = 0;
        	for(int j = cnt; j < stages.length; j++) { // 도전자 
        		if(stages[j] <= i) {
        			failed++;
        			cnt++;
        		}
        	}
        	
          	failed = failed / (double) startNum;
          	if(startNum == 0) {
          		list.add(0.0);
          	} else {
          	list.add(failed);
          	}
          	startNum = stages.length - cnt;
          	
        }
        
        //System.out.println(list);
        
        TreeMap<Integer, Double> map = new TreeMap<Integer, Double>();
        for(int i = 0; i < list.size(); i++) {
        	map.put(i + 1, list.get(i));
        }
        
        int[] result = new int[map.size()];
        int idx = 0;
        
        List<Integer> keySetList = new ArrayList<>(map.keySet());
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		for(Integer key : keySetList) {
			result[idx++] = key;
		}
        
		return result;
    }
	
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,4,2,4,3,3};
		int[] result = solution(N, stages);
		System.out.println(Arrays.toString(result));
	}
}


























