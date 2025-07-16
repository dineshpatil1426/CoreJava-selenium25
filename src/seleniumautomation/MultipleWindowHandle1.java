package seleniumautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Meta Pay']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Meta Store']")).click();

		Set<String> wc1 = driver.getWindowHandles();
		System.out.println(wc1.size());

		for (String Wlist : wc1) {

			driver.switchTo().window(Wlist);
			String title = driver.getTitle();
			System.out.println("Title is :  "+title);
			Thread.sleep(2000);
			if(title.contains("book")){
			driver.close();
			}
		}
		
		

	}

}
