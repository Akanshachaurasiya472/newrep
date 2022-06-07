package recursion;

public class Recursion {
	static int factorial(int n ) {
		// factorial(n)=n*factorial(n-1)
		if(n==0||n==1) {
			return 1;
		}else {
			return n* factorial(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println( factorial(5));

	}

}
