package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=57");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement sortby = driver.findElement(By.id("input-sort"));
		// WebElement show = driver.findElement(By.id("input-limit"));

		Select obj1 = new Select(sortby);
		obj1.selectByIndex(3);
		Thread.sleep(5000);
		driver.findElement(By.id("input-limit")).sendKeys("50");

		/*
		 * Select obj2= new Select(show); obj2.selectByIndex(2); Thread.sleep(2000);
		 */
		Thread.sleep(2000);

		driver.close();

	}

}
