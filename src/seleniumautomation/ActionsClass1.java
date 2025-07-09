package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement btnDoubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement btnRightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));

		// Double Click Actions
		Actions ac = new Actions(driver);
		ac.doubleClick(btnDoubleclick).perform();
		Thread.sleep(2000);

		// Right Click Actions
		ac.contextClick(btnRightclick).perform();
		Thread.sleep(2000);

		ac.click(clickme).perform();
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
