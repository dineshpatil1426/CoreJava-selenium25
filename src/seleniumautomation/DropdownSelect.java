package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-ajax-test.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement category = driver.findElement(By.id("combo1"));
		WebElement Language = driver.findElement(By.id("combo2"));
		
		Select obj1= new Select(category);
		obj1.selectByVisibleText("Server");
		Thread.sleep(5000);
		 Select obj2= new Select(Language); 
		 obj2.selectByVisibleText("Java");
		 
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
