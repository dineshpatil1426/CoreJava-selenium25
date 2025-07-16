package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		 
			
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Dinesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("patil");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("26");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("july");	
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1992");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("TestbyQA@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("test@789");
		
		

	

	}

}
