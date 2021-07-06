package codingTestPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers_Lv2_42583 {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int timeSet = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int num : truck_weights) {
        	q.offer(num);
        }
        System.out.println("q : " + q);
        
        
        while(!q.isEmpty()) {
        	List<Integer> list = new ArrayList<Integer>();
        	int sum = 0;
        	for(int i = 0; i < bridge_length; i++) {
        		if(q.size() <= 1) {
        			
        			break;
        		}
        		int num = q.peek();
        		sum += num;
        		if(sum <= weight) {
        			q.poll();
        			list.add(num);
        			//timeSet++;
        		} else {
        			//timeSet++;
        			break;
        		}
        		
        	}
        	
        	timeSet++;
        	
        	System.out.println("list : " + list);
        	int len = list.size();
    		
    		while(len <= bridge_length) {
    			System.out.println("len : " + len);
    			System.out.println("timeSet : " + timeSet);
    			timeSet++;
    			len++;
    		}
        	
        	
        }
        
		System.out.println(timeSet);
		
		return -1;
		
    }
	
	public static void main(String[] args) {
		//int bridge_length = 2;
		int bridge_length = 100;
		//int weight = 10;
		int weight = 100;
		//int[] truck_weights = {7, 4, 5, 6};
		//int[] truck_weights = {10};
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		int result = solution(bridge_length, weight, truck_weights);
		System.out.println(result); // 8
	}
}























