package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Programmers_Lv1_42862 {
	public static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(i + 1);
		}
		System.out.println("전체학생 list : " + list);

		List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
        	list1.add(i + 1);
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        for(int num : lost)
        	list2.add(num);
        System.out.println("잃어버린 학생 list2 : " + list2);
        
        list1.removeAll(list2);
        System.out.println("잃어버리지 않은 학생 list1 : " + list1);
        
        Stack<Integer> list3 = new Stack<Integer>();
        for(int num : reserve)
        	list3.push(num);
        System.out.println("여분을 가져온 학생 list3 : " + list3);
        
        Collections.sort(list2);
        Collections.sort(list3);
        
        Set<Integer> list4 = new HashSet<Integer>();
        int x = 1;
        
        for(int i = 0; i < list3.size(); i++) {
        	list4.add(list3.get(i));
        	if(list3.get(i) + x > 0 && list3.get(i) + x <= n) list4.add(list3.get(i) + x);
        	if(list3.get(i) - x > 0 && list3.get(i) - x <= n) list4.add(list3.get(i) - x);
        }
        
        List<Integer> list5 = new ArrayList<Integer>(list4);
        Collections.sort(list5);
        System.out.println("여분을 가져온 학생이 빌려줄 수 있는 경우 list5 : " + list5);
        
        int cnt = 0;
        while(!list3.isEmpty()) {
        	if(cnt == list5.size())
        		break;
        	list3.pop();
        	
        	if(list2.get(cnt) == list5.get(cnt))
        		cnt++;
        }
        System.out.println("cnt : " + cnt);
        
		return list1.size() + cnt;
    }
	
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {3};
		int result = solution(n, lost, reserve);
		System.out.println(result);
	}
}














