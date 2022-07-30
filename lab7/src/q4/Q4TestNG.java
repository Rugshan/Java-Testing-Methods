package q4;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import org.testng.annotations.Test;

public class Q4TestNG {
	
	  public String baseUrl = "https://lambdatest.github.io/sample-todo-app/";
	  String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
	  public WebDriver driver ; 
	     
	  @BeforeClass
	  public void beforeClass() {    
	      System.setProperty("webdriver.gecko.driver", driverPath);
	      driver = new FirefoxDriver();
	      driver.get(baseUrl);
	  }
	  
	  @AfterClass
	  public void afterClass() { 
	      driver.close();
	  }
	  
	  @Test
	  public void checkSecondItem() {    
		  
	      // Second Item
	      WebElement secondItem = driver.findElement(By.name("li2"));
	      secondItem.click();
	      
	      // Span
	      WebElement secondItemSpan = driver.findElement(By.xpath("/html/body/div/div/div/ul/li[2]/span"));
	      String secondItemSpanClass = secondItemSpan.getAttribute("class");
	      Assert.assertEquals(secondItemSpanClass, "done-true");
	  
	  }
	  
	  @Test
	  public void checkFourthItem() {
	      
		  // Fourth Item
	      WebElement fourthItem = driver.findElement(By.name("li4"));
	      fourthItem.click();
 
	      // Span
	      WebElement fourthItemSpan = driver.findElement(By.xpath("/html/body/div/div/div/ul/li[4]/span"));
	      String fourthItemSpanClass = fourthItemSpan.getAttribute("class");
	      Assert.assertEquals(fourthItemSpanClass, "done-true");
	      
	  }
	  
	  @Test
	  public void verifyAddItem() {
		  
	      // Blank Field
		  WebElement blankField = driver.findElement(By.id("sampletodotext"));
		  blankField.clear();
		  blankField.sendKeys("Rugshan");
		  blankField.sendKeys(Keys.RETURN);
	      
		  // New list element
		  WebElement addedItemSpan = driver.findElement(By.xpath("//*[contains(text(), 'Rugshan')]"));
	      Assert.assertEquals(addedItemSpan.getText(), "Rugshan");
	  }
	  
}
