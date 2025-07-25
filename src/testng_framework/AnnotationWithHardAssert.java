package testng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationWithHardAssert {

	WebDriver driver;
	
	@BeforeMethod
	public void lunchApp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
	    driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Lunch App");
		
		
	}
	  
	
	
	@Test
	public void testc1() {
	
		boolean email=driver.findElement(By.id("email")).isDisplayed();
		boolean pass=driver.findElement(By.id("pass")).isDisplayed();
		
		Assert.assertEquals(email, true);
		Assert.assertEquals(pass, true);
		
		System.out.println(email);
		System.out.println(pass);
		
		
		
	}
	
	
	@Test
	public void testc2() {
		
		boolean email=driver.findElement(By.id("email")).isEnabled();
		boolean pass=driver.findElement(By.id("pass")).isEnabled();
		
		Assert.assertEquals(email, true);
		Assert.assertEquals(pass, true);
		
		System.out.println(email);
		System.out.println(pass);
		
	}

	@Test
	public void testc3() {
		
		driver.findElement(By.id("email")).sendKeys("dinesh12@gamil.com");;
		driver.findElement(By.id("pass")).sendKeys("dinesh@123");
	}
	

	@AfterMethod
	public void closeApp() {
		System.out.println("Close App");
		driver.close();
	}

}
