package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
// 체육복

public class Programmers_Lv1_42862_2 {
	public static int solution(int n, int[] lost, int[] reserve) {
        
		// 총 학생 
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
        	list2.add(i);
        }
        // System.out.println("총 학생 : " + list2);

        // System.out.println("옷을 잃어버린 학생 : " + Arrays.toString(lost));
        // System.out.println("여벌 옷이 있는 학생 : " + Arrays.toString(reserve));
		
		// 여벌 옷이 있는 학생이 빌려줄 수 있는 학생 번호 
		ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < reserve.length; i++) {
        	int leftNum = reserve[i] - 1;
        	int rightNum = reserve[i] + 1;
        	int curNum = reserve[i];
        	if(leftNum > 0 && !list.contains(leftNum))
        		list.add(leftNum);
        	
        	list.add(curNum);
        	
        	if(rightNum <= n && !list.contains(rightNum))
        		list.add(rightNum);
        }
        // System.out.println("여벌 옷이 있는 학생이 빌려줄 수 있는 학생 번호 list : " + list);
        
        // 총 학생 중 옷을 잃어버리지 않은 학생
        for(int i = 0; i < lost.length; i++) {
        	if(list2.contains(lost[i])) {
        		list2.remove(list2.indexOf(lost[i]));
        	}
        }
        // System.out.println("총 학생 중 옷을 잃어버리지 않은 학생 list2 : " + list2);
        
        int cnt = 0;
        int result = list2.size();
        while(cnt < reserve.length) {
        	for(int i = 0; i < list.size(); i++) {
        		if(cnt >= reserve.length)
        			break;
        		int first = list.get(i);
        		if(!list2.contains(first)) {
        			result++;
        			cnt++;
        		}
        	}
        	
        	cnt++;
        }
        // System.out.println(result);
		return result;
    }
	
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		int result = solution(n, lost, reserve);
		 System.out.println(result);
	}
}














