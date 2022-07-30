package lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RETest {

	@Test
	public void testCheckPhoneNumber1() {
		assertTrue(RE.checkPhoneNumber("(123)123 - 1234")); 	// First valid input.
	}
	@Test
	public void testCheckPhoneNumber2() {
		assertTrue(RE.checkPhoneNumber("(123) 123 - 1234")); 	// Second valid input.
	}
	@Test
	public void testCheckPhoneNumber3() {
		assertTrue(RE.checkPhoneNumber("(123)123-1234")); 	// No white spaces.
	}
	@Test
	public void testCheckPhoneNumber4() {
		assertTrue(RE.checkPhoneNumber("  (123)    123  -     1234    ")); 	// Multiple white spaces anywhere around numbers.
	}
	@Test
	public void testCheckPhoneNumber5() {
		assertFalse(RE.checkPhoneNumber("123 123 - 1234")); 	// Invalid input (no parentheses).
	}
	@Test
	public void testCheckPhoneNumber6() {
		assertFalse(RE.checkPhoneNumber("(123) 123 1234")); 	// Invalid input (no hyphen).
	}
	@Test
	public void testCheckPhoneNumber7() {
		assertFalse(RE.checkPhoneNumber("(1 2 3) 1 2 3 - 1 2 3 4")); 	// Invalid input (spaces between adjacent numbers).
	}

}
