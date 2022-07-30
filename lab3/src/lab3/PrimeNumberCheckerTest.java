package lab3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static org.junit.Assert.*;


@RunWith(value = Parameterized.class)
public class PrimeNumberCheckerTest {

	private int n;
	private boolean expected;
	
	// Constructor
	public PrimeNumberCheckerTest(int n, boolean expected) {
		this.n = n;
		this.expected = expected;	
	}
	
	// Parameters
	@Parameterized.Parameters(name = "{index}: isPrime({0}) = {1}")
	public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true}
		}); // Form: {input, expected}
	}

	// Actual Test
	@Test
	public void testIsPrime() throws Exception{
		boolean actual = PrimeNumberChecker.isPrime(n);
		assertEquals(expected, actual);
	}

}
