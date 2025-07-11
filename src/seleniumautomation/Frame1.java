package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement frame1 = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		

		List<WebElement> listpack = driver.switchTo().frame(frame1).findElements(By.tagName("a"));
		System.out.println(listpack.size());

		for (WebElement ref : listpack) {
			String listName = ref.getText();
			if (listName.contains("lang")) {
				System.out.println(ref.getText());
			}
		}
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		List<WebElement> listClass = driver.switchTo().frame(frame2).findElements(By.tagName("a"));
		System.out.println(listClass.size());

		driver.close();

	}

}
