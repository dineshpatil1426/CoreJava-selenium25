package seleniumautomation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("/Users/macmini/Documents/ScreenshotImage/Flogo.png"));
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com/reg/");
		Files.copy(f, new File("/Users/macmini/Documents/ScreenshotImage/" + driver.getTitle() + ".png"));
		Thread.sleep(2000);

		driver.navigate().back();

		WebElement Flogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File f1 = Flogo.getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("/Users/macmini/Documents/ScreenshotImage/fCurrentlogo.png"));
		Thread.sleep(2000);
		driver.close();

	}

}
