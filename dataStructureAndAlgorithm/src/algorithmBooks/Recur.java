package algorithmBooks;

public class Recur {
	static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n); 
			recur(n - 2);
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		recur(n);
	}
}

































