package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement dataTable = driver.findElement(By.xpath("//table[@class='dataTable']"));

		List<WebElement> tr = dataTable.findElements(By.tagName("tr"));
		List<WebElement> th = dataTable.findElements(By.tagName("th"));
		List<WebElement> td = dataTable.findElements(By.tagName("td"));
		List<WebElement> columlist = dataTable.findElements(By.xpath("//table[@class='dataTable']//td[1]"));

		System.out.println(tr.size());
		System.out.println(th.size());
		System.out.println(td.size());

		for (WebElement list1 : columlist) {
			System.out.println(list1.getText());
		}

		System.out.println("************************************");
		WebElement particularName = driver.findElement(By.xpath("//table[@class='dataTable']//tr[7]//td[5]"));
		
		System.out.println(particularName.getText());

		driver.close();

	}

}
