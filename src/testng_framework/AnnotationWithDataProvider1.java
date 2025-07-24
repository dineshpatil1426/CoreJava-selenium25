package testng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationWithDataProvider1 {
	
	
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
		System.out.println("New App lunch");
		
	}
	
	@DataProvider(name = "Name-Provider")
	public Object[][] dataProvider(){
		
		Object[][] obj= new Object[3][2];
		
		obj[0][0]="dinesh"; obj[0][1]="dinesh@123";
		obj[1][0]="Hardik"; obj[1][1]="Hardik@123";
		obj[2][0]="Meet"; 	obj[2][1]="Meet@123";
		
		return obj;
	}
	
	@Test(dataProvider = "Name-Provider")
	public void loginFace(String uid,String pass) {
		
		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	
	
	
	@AfterMethod
	public void closeApp() {
		System.out.println("Close App");
		driver.close();
	}
	
	

}
