package q2;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Q2TestNG {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      
      driver.get(baseUrl);
      
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      System.out.println("Retrieved Title: " + actualTitle);
      
      Assert.assertEquals(actualTitle, expectedTitle);
      
      driver.close();
  }
}
