package codingTestPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://programmers.co.kr/learn/courses/30/lessons/42587?language=java
// 프로그래머스 _ Lv2 _ 프린터
public class Programmers_Lv2_42587 {
	public static int solution(int[] priorities, int location) {
        Queue<String> q1 = new LinkedList<String>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        for(int i = 0; i < priorities.length; i++) {
        	q1.add(Integer.toString(i));
        	q2.add(priorities[i]);
        }
        
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        while(!q2.isEmpty()) {
        	String str = q1.poll(); // 0 1 2 3
        	int num = q2.poll(); // 2 1 3 2
        	int maxNum = q2.size() != 0 ? Collections.max(q2) : num;
        	
        	if(maxNum > num) {
        		q1.offer(str);
        		q2.offer(num);
        	} else {
        		list.add(str);
        		list2.add(num);
        	}
        }
        
        System.out.println("str : " + list);
        System.out.println("num : " + list2);
        
        for(int i = 0; i < list.size(); i++) {
        	if(location == Integer.parseInt(list.get(i)))
        		return i + 1;
        }
        
        return -1;
    }

	public static void main(String[] args) {
		int[] priorities = {1, 1, 1, 1, 1, 1};
		int location = 2;
		int result = solution(priorities, location);
		System.out.println(result);

	}
}
