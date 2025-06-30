package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver=driver;
	}

	public void lunchApp(String url) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	public void checkElementIsdisplay(String loc) {

		Boolean isElementDisplay = driver.findElement(By.xpath(loc)).isDisplayed();

		if (isElementDisplay) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public void checkElementIsEnable(String loc) {

		Boolean isElementEnable = driver.findElement(By.xpath(loc)).isEnabled();

		if (isElementEnable) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	

	public void closeApp() {

		driver.close();
	}

}
