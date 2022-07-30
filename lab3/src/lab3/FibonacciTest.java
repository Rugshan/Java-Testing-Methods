package lab3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class FibonacciTest {

	private int fib_index;
	private int expected;
	
	// Constructor
	public FibonacciTest(int fib_index, int expected) {
		this.fib_index = fib_index;
		this.expected = expected;	
	}
	
	// Parameters
	@Parameterized.Parameters(name = "{index}: compute({0}) = {1}")
	public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{0,0},
			{1,1},
			{2,1},
			{3,2},
			{4,3},
			{5,5},
			{6,8},
			{7,13},
			{8,21},
			{9,34}
		}); // Form: {input, expected}
	}

	// Actual Test
	@Test
	public void testCompute() throws Exception{
		int actual = Fibonacci.compute(fib_index);
		assertEquals(expected, actual);
	}

}
