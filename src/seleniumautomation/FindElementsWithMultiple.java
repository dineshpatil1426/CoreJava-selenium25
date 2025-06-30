package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsWithMultiple {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		List<WebElement> imageCount = driver.findElements(By.tagName("img"));

		System.out.println("Number of linkCount : " + linkCount.size());
		System.out.println("Number of image Count : " + imageCount.size());

		for (WebElement link : linkCount) {
			String linkname = link.getText();
			if (!linkname.isEmpty()) {
				if (linkname.startsWith("M")) {
					System.out.println(linkname);
				}
			}
		}
		
		if(linkCount.size() >imageCount.size()) {
			System.out.println("link count Greater than images count ");
		}else {
			System.out.println("images count Greater than link count ");
		}
		
		System.out.println("*****************************");
		
		for(WebElement link:linkCount) {
			String linkName=link.getText();
			if(!linkName.isEmpty()) {
				if(linkName.startsWith("C")) {
				String 	linkUrl=link.getAttribute("href");
					System.out.println("Link Name: "+ linkName +"==>" +linkUrl);
				}
			}
		}
		
		if(linkCount.size() >=0) {
			 WebElement lastlink =linkCount.get(2);
			 lastlink.click();
			 System.out.println("dsfdfdf");
		}
		
		driver.close();
	}

}
