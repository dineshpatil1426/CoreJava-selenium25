package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdownSelectElements {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		
		
		List<WebElement> countryList = driver.findElements(By.cssSelector("select#Form_getForm_Country > option"));

		System.out.println(countryList.size());

		for (WebElement e : countryList) {
				String countryName = e.getText();
				System.out.println(countryName);
				if (countryName.contains("Turkey")) {
					e.click();
					break;
				}

			}
	
		Thread.sleep(5000);

		driver.close();
	}

}
