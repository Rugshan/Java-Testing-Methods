package lab1;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculationTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test
	public void testFindMax() {
		assertEquals(64, Calculation.findMax(new int[] {64,43,13,22}));
		assertEquals(-2, Calculation.findMax(new int[] {-12,-3,-4,-2}));
	}
	
	@Test
	public void testCube() {
		assertEquals(8, Calculation.cube(2));
		assertEquals(27, Calculation.cube(3));
	}

}
