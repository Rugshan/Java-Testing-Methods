package firsttestngpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
//    public String baseUrl = "http://demo.guru99.com/test/newtours/";
//    String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
//    public WebDriver driver ; 
//     
//  @Test
//  public void verifyHomepageTitle() {
//       
//      System.out.println("launching firefox browser"); 
//      System.setProperty("webdriver.gecko.driver", driverPath);
//      driver = new FirefoxDriver();
//      driver.get(baseUrl);
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
//      driver.close();
//  }
	
	
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
