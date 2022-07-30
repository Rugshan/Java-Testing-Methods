package q7;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.testng.annotations.Test;

public class Q7TestNG {
	
	// Driver Variables
	public String baseUrl = "https://github.com/login";
	String driverPath = "D:\\Programs\\TestNG\\BrowserDrivers\\GeckoDriver\\geckodriver.exe";
	public WebDriver driver ; 
	
	// Login Variables
	String username;
	String password;
  
	@BeforeClass
	public void getWebPageAndLoginDetails() {
		
		// Get web-page.
		System.setProperty("webdriver.gecko.driver", driverPath);
	    driver = new FirefoxDriver();
	    driver.get(baseUrl);
		
		// Get login details.
		File login_details = new File("D:\\Ryerson\\4. Fourth Year\\Winter 2022\\COE891 - Software Testing and QA\\Labs\\Confidential\\lab7_login.txt");
		
		try {
			
			Scanner scanner = new Scanner(login_details);
			username = scanner.nextLine();
			password = scanner.nextLine();	
			scanner.close();
		
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLogInGitHub() {
		
		// User-name
		WebElement login_field = driver.findElement(By.id("login_field"));
		login_field.clear();
		login_field.sendKeys(username);
		
		
		// Password
		WebElement password_field = driver.findElement(By.id("password"));
		password_field.clear();
		password_field.sendKeys(password);
		
		// Sign in button.
		WebElement sign_in_button = driver.findElement(By.name("commit"));
		sign_in_button.click();
		
		// Sleep
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Test Successful Login
		String afterSignInURL = driver.getCurrentUrl();
		Assert.assertEquals(afterSignInURL, "https://github.com/");
		
		if(afterSignInURL.equals("https://github.com/")) {
			System.out.println("Successfully signed in.");
		}
		else {
			System.out.println("Error, did not sign in.");
		}
		
	}
	
	@AfterClass
	public void closeDriver() {
		
		// Close driver.
		driver.close();
	}
}
