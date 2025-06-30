package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FadPracatic {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://dinesh-patil-tester.myshopify.com/?_ab=0&_bt=eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaEpJaVprYVc1bGMyZ3RjR0YwYVd3dGRHVnpkR1Z5TG0xNWMyaHZjR2xtZVM1amIyMEdPZ1pGVkE9PSIsImV4cCI6IjIwMjUtMDYtMjZUMDU6MjY6MjYuNDk2WiIsInB1ciI6InBlcm1hbmVudF9wYXNzd29yZF9ieXBhc3MifX0%3D--cbbc9ceea24d6ef68091bc6ec09f076284f24e1d&_fd=0&_sc=1&key=9f14b2694fb2b8063d2476d8e5b81ea93ac8cf5dd1deb4f55b7b39cd89887b33&preview_theme_id=142228848805");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		List<WebElement> textboxcount = driver.findElements(By.tagName("input"));
		List<WebElement> buttoncount = driver.findElements(By.tagName("button"));
		
		System.out.println(textboxcount.size());
		System.out.println(buttoncount.size());


		for (WebElement input : textboxcount) {
			 String textboxname=input.getAttribute("name");
			System.out.println(textboxname);
			if (input.isDisplayed() == true && input.isEnabled() == true) {
				if(input.getAttribute("name").contains("password")) {
				input.sendKeys("city");
				}
			}
		}

		for (WebElement button : buttoncount) {

			if (button.isDisplayed() == true && button.isEnabled() == true) {
				if (button.getAttribute("type").contains("submit")) {
					button.click();
				}
			}
		}

		
		// driver.close();

	}

}
