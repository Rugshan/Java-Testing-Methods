package lab1;

import java.util.Arrays;
import junit.framework.TestCase;

public class ArrayShiftTest extends TestCase{

	private ArrayShift as;
	private int[] inArray = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2};
	
	public final void setUp() {
		as = new ArrayShift();
	}
	
	public final void testShiftOne() {
		int[] outArray = as.shiftOne(inArray);
		
		// Assert Statements
		assertEquals(inArray.length, outArray.length); // Check if lengths are the same.
		assertEquals(-1, outArray[0]); // Check if first element is -1. (Can combine with below test)
		assertTrue(Arrays.equals(new int[] {-1, 4, 6, 0, 3, 4, 5, 4, 4, 6}, outArray)); // Check if the shift occurred.
		
	}

}
