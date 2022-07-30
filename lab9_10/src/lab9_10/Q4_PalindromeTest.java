package lab9_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q4_PalindromeTest {

	
	// The two tests seen below represent the two tests paths of T2 = {[1,2], [1,3,4,6,3,4,5,6,3,7]} which satisfy TR(EC) and TR(EPC). This also satisfies TR(NC)
	
	@Test(expected = NullPointerException.class)
	public void EdgePathCoveragePath1() {
		Q4_Palindrome.isPalindrome(null);
	}
	
	@Test
	public void EdgePathCoveragePath2() {
		assertFalse(Q4_Palindrome.isPalindrome("abca"));
	}
	
	
	// The test seen below represents the second path of T3 = {[1, 2], [1, 3, 7]} which satisfy Prime Path Coverage (PPC). First path was tested above.
	
	
	@Test
	public void PrimePathCoveragePath2() {
		assertTrue(Q4_Palindrome.isPalindrome("a"));
	}

}
