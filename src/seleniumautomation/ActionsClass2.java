package seleniumautomation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Used For MAC OS 	
		Actions ac= new Actions(driver);
		ac.keyDown(Keys.COMMAND).sendKeys("r").keyUp(Keys.COMMAND).perform();
		Thread.sleep(2000);
		
		driver.close();

	}

}
