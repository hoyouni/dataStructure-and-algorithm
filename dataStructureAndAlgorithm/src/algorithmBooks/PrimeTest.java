package algorithmBooks;

public class PrimeTest {
	static void firstTest() {
		int count = 0;
		
		for(int i = 2; i <= 1000; i++) {
			int n;
			for(n = 2; n < i; n++) {
				count++;
				if(i % n == 0)
					break;
			}
			if(i == n)
				System.out.println(n);
		}
		
		System.out.println("나눗셈 횟수 : " + count);
	}
	
	static void secondTest() {
		int count = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2; // prime[0] = 2, ptr = 1
		
		for(int i = 3; i <= 1000; i+=2) {
			int n;
			for(n = 1; n < ptr; n++) {
				count++;
				if(i % prime[n] == 0)
					break;
			}
			if(n == ptr)
				prime[ptr++] = i;
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈 횟수 : " + count);
	}
	
	public static void main(String[] args) {
		//firstTest();
		secondTest();
	}
}




























