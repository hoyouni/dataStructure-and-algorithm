package algorithmBooks;

// 최대공약수 : 재귀 -> 유클리드 호제법
public class EuclidGCD {
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		int x = 22;
		int y = 8;
		System.out.println(gcd(x, y));
	}
}
