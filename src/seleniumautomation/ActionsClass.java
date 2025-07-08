package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement jobMenu = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(jobMenu).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='IT jobs']")).click();
		Thread.sleep(1000);
		
		ac.sendKeys(Keys.CONTROL+"n").perform();
		
		Thread.sleep(2000);

		driver.close();

	}

}
