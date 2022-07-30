package q3;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Q3TestNG {
	
    public String baseUrl = "http://www.facebook.com";
    String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void getEmailTag() {
       
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      
      // Get Element
      String tagNameEmail = driver.findElement(By.id("email")).getTagName();
      System.out.println("Email Tag Name: " + tagNameEmail);
      
      driver.close();
  }
}
