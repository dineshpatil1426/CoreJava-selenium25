package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronationsSelenium {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// implicitlyWait Wait - is Always applied for Global - is available for all  WebElements
		// Dynamic Nature 
		// it can be Changed anywhere and at anytime in your code

		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		WebElement txtMobile = driver.findElement(By.name("reg_email__"));
		WebElement txtPassword = driver.findElement(By.name("reg_passwd__"));
		
	
		sendKeys(driver, txtFirstName, 10, "Dinesh");
		sendKeys(driver, txtLastName, 5, "Patil");
		sendKeys(driver, txtMobile, 5, "9033329316");
		sendKeys(driver, txtPassword, 5, "test@123");
		
		WebElement gotoLogin =driver.findElement(By.linkText("Already have an account?"));
		clickOn(driver, gotoLogin, 5);
	

		driver.close();

	}

	//Explicit Wait 
	//1.No explicit wait keyword or method
	//2.available webDriverWait With some ExpectedConditions
	//3.Specific to element
	//4. dynamic Nature
	//5. we should be never Used implicit Wait and explicit together :
	 // Selenium webdriver will  wait for the element  first because IMPLICIT WAIT  and EXPLICIT WAIT will be Applied.
	 //hence, Total sync wait will be increased for each  elements
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

	}
	
	public static void clickOn(WebDriver driver,WebElement element,int timeOut) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

}
