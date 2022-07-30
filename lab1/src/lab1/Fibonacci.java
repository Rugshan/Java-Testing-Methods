package lab1;

public class Fibonacci {

	public static int fibonacci_iterative(int n) {
		
		// Handle index 0 or 1
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		// Find n-th Fibonacci number iteratively.
		
		int fib_n = 1;
		int fib_last = 1;
		int fib_second_last = 1;
		
		// Starts at index 2 because 0 and 1 were handled earlier.
		for(int i = 2; i <= n; i++) { 
			fib_n = fib_last + fib_second_last;
			fib_second_last = fib_last;
			fib_last = fib_n;
		}
		
		return fib_n;
		
	}
	
}
