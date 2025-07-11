package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement tabledata = driver.findElement(By.xpath("//*[@class='MuiTable-root css-1owb465']"));

		List<WebElement> tr = tabledata.findElements(By.tagName("tr"));
		List<WebElement> th = tabledata.findElements(By.tagName("th"));
		List<WebElement> td = tabledata.findElements(By.tagName("td"));

		System.out.println(tr.size());
		System.out.println(th.size());
		System.out.println(td.size());

		for (WebElement clname : th) {
			System.out.println(clname.getText());
		}

		List<WebElement> row6Data = tabledata.findElements(By.xpath("//*[@class='MuiTable-root css-1owb465']//tr[6]"));

		System.out.println(row6Data.size());

		for (WebElement row6list : row6Data) {
			System.out.print(row6list.getText());
		}

		System.out.println();
		System.out.println("*********************Subject Topper NewTab********************");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Static Table - Subject Topper']")).click();

		WebElement subTable = driver.findElement(By.xpath("//*[@class='MuiTable-root css-1owb465']"));

		List<WebElement> subtr = subTable.findElements(By.tagName("tr"));
		List<WebElement> subth = subTable.findElements(By.tagName("th"));
		List<WebElement> subtd = subTable.findElements(By.tagName("td"));

		System.out.println(subtr.size());
		System.out.println(subth.size());
		System.out.println(subtd.size());

		for (WebElement columth : subth) {
			System.out.println(columth.getText());
		}

		List<WebElement> listsubject = subTable.findElements(By.xpath("//*[@class='MuiTable-root css-1owb465']//td[2]"));
		System.out.println("**************list of subject Name******************");
		for(WebElement list:listsubject) {
			System.out.println(list.getText());
		}

		driver.close();

	}

}
