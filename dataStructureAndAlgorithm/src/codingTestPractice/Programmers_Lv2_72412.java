package codingTestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_Lv2_72412 {
	public static int[] solution(String[] info, String[] query) {
		List<String> queryList = new ArrayList<String>();
		
		for(int i = 0; i < query.length; i++) {
			String[] removeAndQuery = query[i].split("and ");
			String str = "";
			for(int j = 0; j < removeAndQuery.length; j++) {
				str += removeAndQuery[j];
				
			}
			queryList.add(str);
		}
//		System.out.println("queryList : " + queryList + "\n");
		int[] result = new int[info.length];
		
		for(int i = 0; i < queryList.size(); i++) {
			String[] queryList2 = queryList.get(i).split(" ");
			System.out.println("queryList2 : " + Arrays.toString(queryList2));
			
			
			List<Integer> cntList = new ArrayList<Integer>();
			for(int j = 0; j < info.length; j++) {
				String[] infoList = info[j].split(" ");
				System.out.println("infoList : " + Arrays.toString(infoList));
				int cnt = 0;
				if((queryList2[0].equals(infoList[0]) || queryList2[0].equals("-")
					&& (queryList2[1].equals(infoList[1]) || queryList2[1].equals("-")
					&& (queryList2[2].equals(infoList[2]) || queryList2[2].equals("-")
					&& (queryList2[3].equals(infoList[3]) || queryList2[3].equals("-")
					))))) {
					
					cnt++;
					
					if(Integer.parseInt(queryList2[4]) > Integer.parseInt(infoList[4])) {
						cnt--;
					}
				}
				
				cntList.add(cnt);
				
			}
			System.out.println(cntList);
			int idx = 0;
			for(int k = 0; k < cntList.size(); k++) {
				if(cntList.get(i) == 1)
					idx++;
			}
			result[i] = idx;
		}

		System.out.println(Arrays.toString(result));
		return null;
	}

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150"
				,"python frontend senior chicken 210"
				,"python frontend senior chicken 150"
				,"cpp backend senior pizza 260"
				,"java backend junior chicken 80"
				,"python backend senior chicken 50"
		};
		String[] query = {"java and backend and junior and pizza 100"
				,"python and frontend and senior and chicken 200"
				,"cpp and - and senior and pizza 250"
				,"- and backend and senior and - 150"
				,"- and - and - and chicken 100"
				,"- and - and - and - 150"
		};
		int[] result =  solution(info, query);
		System.out.println(result);
	}
}


















