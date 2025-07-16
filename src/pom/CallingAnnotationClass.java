package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CallingAnnotationClass {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		PageObjectAnnotation p=PageFactory.initElements(driver, PageObjectAnnotation.class);
		
		p.uid.isDisplayed();
		p.uid.isEnabled();
		p.uid.sendKeys("dinesh456@gmail.com");
		Thread.sleep(1000);
		p.pwd.isDisplayed();
		p.pwd.isEnabled();
		p.pwd.sendKeys("dinesh@1426");
		Thread.sleep(1000);
		p.btnlogin.isDisplayed();
		p.forgotLink.isDisplayed();
		driver.close();
		
		
	
	}

}
