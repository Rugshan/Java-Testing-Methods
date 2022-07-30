package q6;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class Q6TestNG {
	
  @Test
  public void executeSessionOne() {
	  
	  // Driver
	  String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  WebDriver driver = new FirefoxDriver();
	 
	  // Go to web-site.
	  String baseUrl = "http://demo.guru99.com/V4/";
	  driver.get(baseUrl);
	  
	  // UserID Input Element
	  WebElement userIDInput = driver.findElement(By.name("uid"));
	  userIDInput.clear();
	  userIDInput.sendKeys("Driver 1");
	  
	  // Close Driver
//	  driver.close();
	 
  }
  
  @Test
  public void executeSessionTwoo() {
	  
	  // Driver
	  String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  WebDriver driver = new FirefoxDriver();
	 
	  // Go to web-site.
	  String baseUrl = "http://demo.guru99.com/V4/";
	  driver.get(baseUrl);
	  
	  // UserID Input Element
	  WebElement userIDInput = driver.findElement(By.name("uid"));
	  userIDInput.clear();
	  userIDInput.sendKeys("Driver 2");

	  // Close Driver
//	  driver.close();
	  
  }
  
  @Test
  public void executeSessionThree() {
	  
	  // Driver
	  String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  WebDriver driver = new FirefoxDriver();
	 
	  // Go to web-site.
	  String baseUrl = "http://demo.guru99.com/V4/";
	  driver.get(baseUrl);
	  
	  // UserID Input Element
	  WebElement userIDInput = driver.findElement(By.name("uid"));
	  userIDInput.clear();
	  userIDInput.sendKeys("Driver 3");
	  
	  // Close Driver
//	  driver.close();
	  
  }
  
}
