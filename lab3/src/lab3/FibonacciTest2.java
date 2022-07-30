package lab3;

import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Theories.class)
public class FibonacciTest2 {

	@DataPoints
	public static int[][] val() {
		return new int[][] {{0,0},{1,1},{2,1},{3,2},{4,3},{5,5},{6,8},{7,13},{8,21},{9,34}};
	}
	
	@Theory
	public void testCompute(int[] val) throws Exception{
		
		int result = Fibonacci.compute(val[0]);
		System.out.println(String.format("Testing with %d", val[0]));
		System.out.println(String.format("Actual: %d \n", result));
		assertEquals(val[1], result);
	}

}
