package algorithmBooks;

import java.util.Scanner;

class PhysData {
	// 시력 분포(0.0 ~ 0.1 단위로 21개)
	static final int VMAX = 21;
	
	String name; 
	int height;
	double vision;
	
	public PhysData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	public static double aveHeight(PhysData[] dat) {
		double sum = 0;
		for(int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	public static void distVision(PhysData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
		}
	}
	
}

public class PhysicalExamination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhysData[] x = {
				new PhysData("박현규", 162, 0.3),
				new PhysData("함진아", 173, 0.7),
				new PhysData("최윤미", 175, 2.0),
				new PhysData("홍연의", 171, 1.5),
				new PhysData("이수진", 168, 0.4),
				new PhysData("김영준", 174, 1.2),
				new PhysData("박요규", 169, 0.8),
		};
		
		int[] vdist = new int[PhysData.VMAX];
		
		System.out.println("신체검사 리스트");
		System.out.println("이름     키    시력");
		System.out.println("-------------------");
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n",
					x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n평균 키 : %5.1fcm\n", PhysData.aveHeight(x));
		
		PhysData.distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i = 0; i < PhysData.VMAX; i++) {
			int num = vdist[i];
			String str = "";
			for(int j = 0; j < num; j++) {
				str += "*";
			}
			System.out.printf("%3.1f~ : %s\n", i / 10.0, str);
		}
		
	}
}

































