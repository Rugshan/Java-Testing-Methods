package lab6;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.TestName;

public class TriclassTest {

	// Test Counter
	public static int test_num = 1;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Testing started");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Testing is finished");
	}
	
	@Rule public TestName name = new TestName(); 
	
	@Before
	public void beforeTest() {
		System.out.println("Test Number " + test_num + " started \t\t(" + name.getMethodName() + ")");
	}
	
	@After
	public void afterTest() {
		System.out.println("Test Number " + test_num + " is finished \t(" + name.getMethodName() + ")");
		test_num++;
	}
	
	// Note:
	// - The tests mainly uses boundary value analysis.
	// - Equivalence class partitioning was used to fix side lengths to the value
	//   6 instead of 5 because some boundary tests were not possible to do without
	//   violating the inequality theorem (10, 5, 5) would be a boundary case but is
	//   an invalid triangle due to the inequality theorem.
	
	
	@Test
	public void testValidBoundaryX() {
		assertEquals("isosceles", Triclass.classify(1, 6, 6));
		assertEquals("isosceles", Triclass.classify(10, 6, 6));
	}
	
	@Test
	public void testValidBoundaryY() {
		assertEquals("isosceles", Triclass.classify(6, 1, 6));
		assertEquals("isosceles", Triclass.classify(6, 10, 6));
	}
	
	@Test
	public void testValidBoundaryZ() {
		assertEquals("isosceles", Triclass.classify(6, 6, 1));
		assertEquals("isosceles", Triclass.classify(6, 6, 10));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals("equilateral", Triclass.classify(1, 1, 1));
		assertEquals("equilateral", Triclass.classify(10, 10, 10));
	}
	
	@Test
	public void testScalene() {
		assertEquals("scalene", Triclass.classify(5, 10, 6));
	}
	
	@Test
	public void testInvalidLeftBoundary() {
		assertEquals("not a triangle", Triclass.classify(0, 6, 6));
		assertEquals("not a triangle", Triclass.classify(6, 0, 6));
		assertEquals("not a triangle", Triclass.classify(6, 6, 0));
	}
	
	@Test
	public void testInvalidRightBoundary() {
		assertEquals("not a triangle", Triclass.classify(11, 6, 6));
		assertEquals("not a triangle", Triclass.classify(6, 11, 6));
		assertEquals("not a triangle", Triclass.classify(6, 6, 11));
	}
	
	@Test
	public void testInvalidSumOfLengths() {
		assertEquals("not a triangle", Triclass.classify(10, 5, 5));
		assertEquals("not a triangle", Triclass.classify(5, 10, 5));
		assertEquals("not a triangle", Triclass.classify(5, 5, 10));
	}

}
