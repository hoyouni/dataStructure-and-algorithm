package algorithmBooks;

// 하노이의 탑 : 재귀
/*
 * 시작기둥에서 목표기둥으로 가야하는데
 * 가장 큰 원판을 목표기둥으로 옮기기 위해
 * 그룹(나머지 원판)을 중간기둥에 배치 해야
 * 가장 최소의 횟수로 옮길 수 있음
 */
public class Hanoi {
	public static void move(int n, int x, int y) {
		if(n > 1)
			/*   
			 * 기둥에 원판이 한 개 보다 많으면
			 * 첫 번째 기둥에서 중간 기둥으로 옮겨야함
			 * 6 은 기둥 번호(1, 2, 3) 합
			 */ 
			move(n - 1, x, 6 - x - y); 
		
		System.out.println( 
				"원판["+ n +"]을 "
				+ x + " 기둥에서 " 
				+ y + " 기둥으로 옮김."
				);
		
		if(n > 1)
			move(n - 1, 6 - x - y, y);
	}
	
	public static void main(String[] args) {
		// 원판 갯수
		int n = 4;
		
		// 첫 번째 기둥에서 세 번째 기둥으로 옮김
		move(n, 1, 3);
	}
}






























