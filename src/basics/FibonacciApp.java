package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		//fibonacci number is defined by the sum of the two previous fibonacci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) = 1
		System.out.println(fib(2));
	}
	
	public static int fib(int n) {
		if (n == 0 ) {
			return 0;
		}
		else if (n == 1 ) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}

}
