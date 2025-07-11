package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		// Css-Selector
		WebElement Flogo = driver.findElement(By.cssSelector("img[alt='Facebook']"));
		WebElement txtEmail = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement txtpass = driver.findElement(By.cssSelector("*[name='pass']"));
		WebElement btnlogin = driver.findElement(By.cssSelector("*[id^='u_0_5']"));
		WebElement linkForgot = driver.findElement(By.cssSelector("a[id^='u_0_6']"));
		WebElement btnSingUp = driver.findElement(By.cssSelector("a[data-testid$='form-button']"));
		WebElement facebookLite = driver.findElement(By.cssSelector("[title*='Lite']"));
		
		

		// Facebook logo
		if (Flogo.isDisplayed() && Flogo.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Email address logo
		if (txtEmail.isDisplayed() && txtEmail.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Password
		if (txtpass.isDisplayed() && txtpass.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		if (btnlogin.isDisplayed() && btnlogin.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		if (linkForgot.isDisplayed() && linkForgot.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		if (btnSingUp.isDisplayed() && btnSingUp.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		if (facebookLite.isDisplayed() && facebookLite.isEnabled()) {
			System.out.println("Pass");
			System.out.println(facebookLite.getText());
		} else {
			System.out.println("Fail");
		}
		

		driver.close();

	}

}
