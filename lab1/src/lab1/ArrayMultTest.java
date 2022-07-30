package lab1;

import java.util.Arrays;
import junit.framework.TestCase;

public class ArrayMultTest extends TestCase{

	private ArrayMult am;
	private int[] arrayA = new int[] {1, 2, 4, 7};
	private int[] arrayB = new int[] {3, 5, 6, 2, 18, 21, 0, 19};
	private int[] arrayC = new int[] {8, 2, 3, 5};
	
	public final void setUp() {
		am = new ArrayMult();
	}
	
	public final void testMult() {
		
		int[] outArray;
		
		// --------------------------------------------------------------------------------------------------------------
		
		// Test array1 length < array2 length
		outArray = am.mult(arrayA, arrayB);
		
		assertEquals(arrayB.length, outArray.length); // outArray length same as longArray length.
		assertTrue(Arrays.equals(new int[] {3, 10, 24, 14, 18, 21, 0, 19}, outArray)); // Check outArray matches expected array.
		
		// --------------------------------------------------------------------------------------------------------------
		
		// Test array2 length > array1 length
		outArray = am.mult(arrayB, arrayA);
		
		assertEquals(arrayB.length, outArray.length); // outArray length same as longArray length.
		assertTrue(Arrays.equals(new int[] {3, 10, 24, 14, 18, 21, 0, 19}, outArray)); // Check outArray matches expected array.
		
		// --------------------------------------------------------------------------------------------------------------
		
		// Test array1 length == array2 length
		outArray = am.mult(arrayA, arrayC);
		
		assertEquals(arrayA.length, outArray.length); // outArray length same as longArray length.
		assertTrue(Arrays.equals(new int[] {8, 4, 12, 35}, outArray)); // Check outArray matches expected array.
		
	}

}
