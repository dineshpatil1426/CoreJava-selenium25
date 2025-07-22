package testng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeOptionUse {
	
	WebDriver driver;
	
	@BeforeMethod
	public void lunchApp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		
		ChromeOptions opt=new ChromeOptions();
		String[] arguments= {"--start-maximized",
			    "--disable-extensions",
			    "--disable-notifications",
			    "--incognito",
			    "--disable-gpu",
			    "--ignore-certificate-errors",
			    "user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/91.0.4472.124 Safari/537.36"};
		opt.addArguments(arguments);
	    driver= new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		System.out.println("Lunch App");
	}
	
	@Test
	public void testc1() {
	
		boolean email=driver.findElement(By.id("email")).isDisplayed();
		boolean pass=driver.findElement(By.id("pass")).isDisplayed();
		
		if(email && pass) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}
	@Test
	public void testc2() {
		
		boolean email=driver.findElement(By.id("email")).isEnabled();
		boolean pass=driver.findElement(By.id("pass")).isEnabled();
		
		if(email && pass) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
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
