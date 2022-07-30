package lab3;

import org.junit.BeforeClass;
import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class AdderTest {

	@BeforeClass
	public static void printMaxMin() {
		// Source for Math.addExact() test: https://itsallbinary.com/algorithms-detect-int-addition-sum-overflow-or-underflow/
		System.out.println(String.format("Max: %d, Min: %d\n", Integer.MAX_VALUE, Integer.MIN_VALUE));
	}
	
	@DataPoints
	public static int[] val() {
		return new int[] {1, 2, 307, 400567};
	}
	
	@DataPoints
	public static int[] newval() {
		return new int[] {0, -1, -10, -1234, 1, 10, 6789};
	}
	
	@DataPoints
	public static int[] anotherval() {
		return new int[] {0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};
	}
	
	@Theory
	public void testSumABGreaterThanA(int a, int b) throws Exception{
		System.out.println(String.format("Testing with %d and %d", a, b));
		assumeTrue(a > 0);
		assumeTrue(b > 0);
		int result = Adder.addPair(a, b);
		assumeFalse(((a ^ result) & (b ^ result)) < 0); // Math.addExact() definition.
		System.out.println(String.format("Sum: %d \n", result));
		assertTrue(result > a);
	}
	
	@Theory
	public void testSumABGreaterThanB(int a, int b) throws Exception{
		System.out.println(String.format("Testing with %d and %d", a, b));
		assumeTrue(a > 0);
		assumeTrue(b > 0);
		int result = Adder.addPair(a, b);
		assumeFalse(((a ^ result) & (b ^ result)) < 0);
		System.out.println(String.format("Sum: %d \n", result)); // Math.addExact() definition.
		assertTrue(result > b);
	}
	
	@Theory
	public void testSumABEqualsSumBA(int a, int b) throws Exception{
		System.out.println(String.format("Testing with %d and %d", a, b));
		int result1 = Adder.addPair(a, b);
		int result2 = Adder.addPair(b, a);
		System.out.println(String.format("Sum a+b: %d, Sum b+a: %d \n", result1, result2));
		assertTrue(result1 == result2);
	}
	
}
