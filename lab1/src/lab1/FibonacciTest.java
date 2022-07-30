package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testAFibonacci_iterative() {
		assertEquals(1, Fibonacci.fibonacci_iterative(0)); // Iterative 0
	}
	@Test
	public void testBFibonacci_iterative() {
		assertEquals(1, Fibonacci.fibonacci_iterative(1)); // Iterative 1
	}
	@Test
	public void testCFibonacci_iterative() {
		assertEquals(89, Fibonacci.fibonacci_iterative(10)); // Iterative n
	}
	@Test
	public void testDFibonacci_iterative() {
		assertTrue(Fibonacci.fibonacci_iterative(0) == Fibonacci.fibonacci_iterative(1)); // Compare first two values, iterative 0 and iterative 1.
	}

}
