package lab3;

import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Theories.class)
public class PrimeNumberCheckerTest2 {

	@DataPoints
	public static Object[][] data(){
		return (new Object[][]{{2,true}, {6,false}, {19,true}, {22,false}, {23,true}});
	}
	
	@Theory
	public void testIsPrime(Object[] data) throws Exception{
		
		boolean result = PrimeNumberChecker.isPrime((int) data[0]);
		System.out.println(String.format("Testing with %d",  data[0]));
		System.out.println(String.format("Actual: %b \n", result));
		assertEquals(data[1], result);
	}

}