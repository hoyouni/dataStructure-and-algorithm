package codingTestPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Programmers_Lv2_17683 {
	public static int dateDiff(String first, String second) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
		Date d1 = f.parse(first);
		Date d2 = f.parse(second);
		long diff = d2.getTime() - d1.getTime();
		int minute = (int)(diff / 60000);
		return minute; 
	}

	public static String solution(String m, String[] musicinfos) throws ParseException {
		String[] first = null;
		List<String> list = new ArrayList<String>();
		List<Integer> minuteList = new ArrayList<Integer>();
		for(int i = 0; i < musicinfos.length; i++) {
			first = musicinfos[i].split(",");
			System.out.println("first : " + Arrays.toString(first));

			int minute = dateDiff(first[0], first[1]);
			minuteList.add(minute);
			System.out.println("minute : " + minute);

			String[] str = first[3].split("");
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j < minute; j++) {
				if(j > str.length - 1) {
					System.out.println("jjjj : " + j);
					if(!('A' <= str[str.length - (j / 2 % 10)].charAt(0) && str[str.length - (j / 2 % 10) - 1].charAt(0) <= 'Z')) {
						sb.append(str[str.length - (j / 2 % 10)] + str[str.length - (j / 2 % 10) + 1]);
						j++;
						System.out.println("Sb : " + sb);
					} else {
						sb.append(str[str.length - (j / 2 % 10)]);
						System.out.println("Sbs : " + sb);
					}
					
					//sb.append(str[j -str.length]);
				} else {
					if(!('A' <= str[j].charAt(0) && str[j].charAt(0) <= 'Z')) {
						sb.append(str[j] + str[j + 1]);
						//System.out.println("zzz : " + sb);
					} else {
						if(j < str.length - 1) {
						sb.append(str[j]);
						//System.out.println("ZZZ : " + sb);
						
						}
					}
				}
			}
			System.out.println("sb : " + sb);
			if(sb.toString().contains(m)) {
				list.add(first[2]);
			}

		}

		System.out.println("list : " + list);
		System.out.println("minuteList : " + minuteList);

		if(list.size() == 0) {
			return "(None)";
		} 
		else if(list.size() == 1) {
			return list.get(0);
		} 
		else {
			int min = minuteList.get(0) + 1;
			int cnt = 0;
			for(int i = 0; i < minuteList.size(); i++) {
				if(min > minuteList.get(i)) {
					min = minuteList.get(i);
				}
				if(min == minuteList.get(i)) {
					cnt++;
				}
			}

			if(cnt == 0) {
				int idx = list.indexOf(min);
				return list.get(idx);
			} else {
				return list.get(0);
			}
		}

	}
	public static void main(String[] args) throws ParseException {
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		String result = solution(m, musicinfos);
		System.out.println(result);
	}
}
