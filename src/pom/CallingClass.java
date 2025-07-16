package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingClass {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		PageObjectbyClass p= new PageObjectbyClass();
		
		driver.findElement(p.uid).sendKeys("Dinesh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(p.pwd).sendKeys("Dinesh@654");
		
		driver.close();
		

	}

}
