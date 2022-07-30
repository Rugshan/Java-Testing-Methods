package lab9_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_AverageTest {

	// Following tests are for TR(PPC) = {[1,2]}
	
	@Test(expected = IllegalArgumentException.class)
	public void PPCPath1Null() {
		int[] v = null; 
		Q5_Average.average(v);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void PPCPath1Zero() {
		int[] v = new int[0]; 
		Q5_Average.average(v);
	}
	
}
