package q1;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Q1TestNG {

	@Test()
	public void c_method() {
		System.out.println("C");
	}
	
	@Test()
	public void b_method() {
		System.out.println("B");
	}
	
	@Test(priority = 0)
	public void e_method() {
		System.out.println("E");
	}
	
	@Test(priority = 6)
	public void d_method() {
		System.out.println("D");
	}
	
	@Test(priority = 6)
	public void a_method() {
		System.out.println("A");
	}
	
}
