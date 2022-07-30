package lab2;

import static org.junit.Assert.*;

import org.junit.*;

public class TriangleTest {
	
	Triangle t1, t2, t3;
	Triangle tn1, tn2, tn3;
	Triangle tnsq;

	@Before
	public void initTriangles() {
		// Initialization Function
		t1 = new Triangle(3,4,5);
		t2 = new Triangle(5,4,3);
		t3 = new Triangle(8,5,5);
		tn1 = new Triangle(-3,-4,-5);
		tn2 = new Triangle(-5,-4,-3);
		tn3 = new Triangle(-8,-5,-5);
		tnsq = new Triangle(3, 4, 100);
	}
	
	@Test
	public void testCalculateArea1() {
		assertEquals(6, t1.calculateArea(), 0); 	// t1 Positive
		assertEquals(6, tn1.calculateArea(), 0); 	// tn1 Negative
	}
	
	@Test
	public void testCalculateArea2() {
		assertEquals(6, t2.calculateArea(), 0);  	// t2 Positive
		assertEquals(6, tn2.calculateArea(), 0);	// tn2 Negative
	}
	
	@Test
	public void testCalculateArea3() {
		assertEquals(12, t3.calculateArea(), 0);  	// t3 Positive
		assertEquals(12, tn3.calculateArea(), 0);	// tn3 Negative
	}

	@Test
	public void testT1SameT2() {
		assertEquals(t1.calculateArea(), t2.calculateArea(), 0); 	// t1 t2 same
		assertEquals(tn1.calculateArea(), tn2.calculateArea(), 0); 	// tn1 tn2 same
	}
	
	@Test
	public void testForNegativeSquareRoot() {
		assertFalse(Double.isFinite(tnsq.calculateArea())); 	// Result should not be finite (NaN)
	}
	
}
