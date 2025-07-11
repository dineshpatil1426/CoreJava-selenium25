package seleniumautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Modals.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement switchtoMenu = driver.findElement(By.xpath("//*[text()='SwitchTo']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(switchtoMenu).perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		Thread.sleep(1000);

		//Alert with ok 
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(1000);

		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(a.getText());
		a.dismiss();
		Thread.sleep(1000);

		
		//Alert With ok & Cancel
		driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		a.accept();
		WebElement msg = driver.findElement(By.xpath("//*[@id='demo']"));
		System.out.println(msg.getText());
	
		//Alert with textbox
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
		Thread.sleep(2000);
		a.sendKeys("Automation Testing user152");
		a.accept();
		WebElement msg1 = driver.findElement(By.xpath("//*[@id='demo1']"));
		System.out.println(msg1.getText());
		
		
		Thread.sleep(2000);

		driver.close();

	}

}
