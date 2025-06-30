package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSingupWithElements {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> textboxCount = driver.findElements(By.tagName("input"));
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		List<WebElement> selectcount = driver.findElements(By.tagName("select"));
		

		System.out.println(textboxCount.size());
		System.out.println(linkCount.size());
		System.out.println(selectcount.size());

		for (WebElement text : textboxCount) {
			if(text.isDisplayed()==true && text.isEnabled()) {
				text.sendKeys("Dinesh");
				
			}

		}
		
		for (WebElement day : selectcount) {

			System.out.println(day.getText());

		}

		/*
		 * for(WebElement textbox:textboxCount) { String textname=
		 * textbox.getAttribute("name"); System.out.println(textname); }
		 */

		driver.close();
	}

}
