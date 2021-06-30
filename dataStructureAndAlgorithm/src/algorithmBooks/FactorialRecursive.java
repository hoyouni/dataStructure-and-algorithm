package algorithmBooks;

// 팩토리얼 : 재귀 
public class FactorialRecursive {
	static int factorial(int n) {
		if(n < 1)
			return 1;
		
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		int n = 3;
		int result = factorial(n);
		System.out.println(result);
	}
}

































