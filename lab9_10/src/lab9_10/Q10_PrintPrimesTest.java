package lab9_10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Q10_PrintPrimesTest {
	
	public static int test_num = 1;

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
	
	@Test
	public void testSkipWhileBody1() {
		Q10_PrintPrimes.printPrimes(0);
	}
	
	@Test
	public void testSkipWhileBody2() {
		Q10_PrintPrimes.printPrimes(1);
	}
	
	@Test
	public void testEdgePathCoverage() {
		Q10_PrintPrimes.printPrimes(3);
	}

}
