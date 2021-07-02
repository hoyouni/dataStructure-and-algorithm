package codingTestPractice;

import java.util.ArrayList;
import java.util.List;

public class Programmers_Lv1_17682 {
	public static int solution(String dartResult) {
        String[] strArr = dartResult.split("");
        
        List<String> list = new ArrayList<String>();
        for(String str : strArr) 
        	list.add(str);
        //System.out.println(list);
		
        for(int i = 0; i <list.size(); i++) {
        	if(list.get(i).equals("1") && list.get(i + 1).equals("0")) {
        		list.set(i, "10");
        		list.remove(i + 1);
        	}
        }
        
        for(int i = 2; i < list.size(); i+=3) {
        	if(!(list.get(i).equals("#") || list.get(i).equals("*"))) {
        		list.add(i, "!");
        	} else
        		continue;
        }
        
        if(!(list.get(list.size() - 1).equals("#") || list.get(list.size() - 1).equals("*")))
        	list.add(list.size(), "!");
       // System.out.println(list);
        
        int cnt1 = 1;
        int cnt2 = 1;
        int cnt3 = 1;
        
        for(int i = 0; i < list.size(); i++) {
        	if(i == 0) {
        		cnt1 = Integer.parseInt(list.get(i));
        		continue;
        	} else if(i == 3) {
        		cnt2 = Integer.parseInt(list.get(i));
        		continue;
        	} else if(i == 6) {
        		cnt3 = Integer.parseInt(list.get(i));
        		continue;
        	}
        	
        	if(i == 1) {
        		if(list.get(i).equals("S")) {
        			cnt1 = cnt1 * 1;
        			continue;
        		} else if(list.get(i).equals("D")) {
        			cnt1 = cnt1 * cnt1;
        			continue;
        		} else if(list.get(i).equals("T")) {
        			cnt1 = cnt1 * cnt1 * cnt1;
        			continue;
        		}
        	} else if(i == 4) {
        		if(list.get(i).equals("S")) {
        			cnt2 = cnt2 * 1;
        			continue;
        		} else if(list.get(i).equals("D")) {
        			cnt2 = cnt2 * cnt2;
        			continue;
        		} else if(list.get(i).equals("T")) {
        			cnt2 = cnt2 * cnt2 * cnt2;
        			continue;
        		}
        	} else if(i == 7) {
        		if(list.get(i).equals("S")) {
        			cnt3 = cnt3 * 1;
        			continue;
        		} else if(list.get(i).equals("D")) {
        			cnt3 = cnt3 * cnt3;
        			continue;
        		} else if(list.get(i).equals("T")) {
        			cnt3 = cnt3 * cnt3 * cnt3;
        			continue;
        		}
        	}
        	
        	if(i == 2) {
        		if(list.get(i).equals("!")) {
        			cnt1 = cnt1 * 1;
        			continue;
        		} else if(list.get(i).equals("*")) {
        			cnt1 = cnt1 * 2;
        			continue;
        		} else if(list.get(i).equals("#")) {
        			cnt1 = cnt1 * -1;
        			continue;
        		}
        	} else if(i == 5) {
        		if(list.get(i).equals("!")) {
        			cnt2 = cnt2 * 1;
        			continue;
        		} else if(list.get(i).equals("*")) {
        			cnt1 = cnt1 * 2;
        			cnt2 = cnt2 * 2;
        			continue;
        		} else if(list.get(i).equals("#")) {
        			cnt2 = cnt2 * -1;
        			continue;
        		}
        	} else if(i == 8) {
        		if(list.get(i).equals("!")) {
        			cnt3 = cnt3 * 1;
        			continue;
        		} else if(list.get(i).equals("*")) {
        			cnt3 = cnt3 * 2;
        			cnt2 = cnt2 * 2;
        			continue;
        		} else if(list.get(i).equals("#")) {
        			cnt3 = cnt3 * -1;
        			continue;
        		}
        	}
        	
        }
        
        System.out.println("cnt1 : " + cnt1 + " cnt2 : " + cnt2 + " cnt3 : " + cnt3);
        
		return cnt1 + cnt2 + cnt3;
    }
	
	public static void main(String[] args) {
		String dartResult = "10S10S10S";
		int result = solution(dartResult);
		System.out.println(result);
	}
}





















