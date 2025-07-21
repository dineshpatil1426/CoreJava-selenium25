package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSelect1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=57");
		driver.manage().window().maximize();

		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement sortby = driver.findElement(By.id("input-sort"));
		Select obj1 = new Select(sortby);
		obj1.selectByIndex(3);
		WebElement show = driver.findElement(By.id("input-limit"));
		Select obj2 = new Select(show);
		obj2.selectByIndex(2);
		
		// Explicit 
		/*
		WebElement sortby = driver.findElement(By.id("input-sort"));
		SelectbyIndex(driver, sortby, 10, 3);
		WebElement show = driver.findElement(By.id("input-limit"));
		SelectbyIndex(driver, show, 10, 2);
		 */
		driver.close();

	}

	//Explicit method Used
	public static void SelectbyIndex(WebDriver driver, WebElement element, int timeout, int value) {

		WebDriverWait wait=	new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		Select obj1 = new Select(element);
		obj1.selectByIndex(value);
	}

}
