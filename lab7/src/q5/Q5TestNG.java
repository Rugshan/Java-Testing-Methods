package q5;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;

// Priority Method
//public class Q5TestNG {
//	
//	 String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
//	 public static WebDriver driver ;
//	 
//	 @Test(priority=1)
//	 public void openBrowser() {
//		 System.setProperty("webdriver.gecko.driver", driverPath);
//	     driver = new FirefoxDriver();
//	 }
//	 
//	 @Test(priority=2)
//	 public void launchGoogle() {
//		 String baseUrl = "https://www.google.com";
//		 driver.get(baseUrl);
//	 }
//	 
//	 @Test(priority=3)
//	 public void performSeachAndClick1stLink() {
//		 
//		 WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
//		 searchBar.clear();
//		 searchBar.sendKeys("Facebook");
//		 searchBar.sendKeys(Keys.ENTER);
//		 
//		 try {
//			Thread.sleep(150);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 }
//	 
//	 @Test(priority=4)
//	 public void FaceBookPageTitleVerification() {
//		Assert.assertTrue(driver.getTitle().contains("Facebook - Google Search"));
//	 }
//	 
//	 @Test(priority=5)
//	 public void driverexit() {
//		 driver.close();
//	 }
//	 
//}

// Annotation Method
public class Q5TestNG {
	
	 String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
	 public static WebDriver driver ;
	 
	 @BeforeClass
	 public void openBrowser() {
		 System.setProperty("webdriver.gecko.driver", driverPath);
	     driver = new FirefoxDriver();
	 }
	 
	 @Test
	 public void launchGoogle() {
		 String baseUrl = "https://www.google.com";
		 driver.get(baseUrl);
	 }
	 
	 @Test(dependsOnMethods= {"launchGoogle"})
	 public void performSearchAndClick1stLink() {
		 
		 WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		 searchBar.clear();
		 searchBar.sendKeys("Facebook");
		 searchBar.sendKeys(Keys.ENTER);
		 
		 try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 @Test(dependsOnMethods= {"performSearchAndClick1stLink"})
	 public void FaceBookPageTitleVerification() {
		Assert.assertTrue(driver.getTitle().contains("Facebook - Google Search"));
	 }
	 
	 @AfterClass
	 public void driverexit() {
		 driver.close();
	 }
	 
	 
}
