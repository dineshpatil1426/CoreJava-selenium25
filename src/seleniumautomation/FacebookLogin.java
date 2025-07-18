package seleniumautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test989@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
        Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("testbyteam989@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("testbyteam@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		
		
	
		
		//driver.close();

	}

}
