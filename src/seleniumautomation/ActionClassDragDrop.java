package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragDrop {

	public static WebDriver driver;

	public static void StaticDragAndDrop() throws Exception {

		WebElement interactionsMenu = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		WebElement childMenu = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		WebElement staticChildMenu = driver.findElement(By.xpath("//a[text()='Static ']"));

		Actions ac = new Actions(driver);
		ac.moveToElement(interactionsMenu).perform();
		Thread.sleep(1000);
		ac.moveToElement(childMenu).perform();
		Thread.sleep(1000);
		staticChildMenu.click();
		Thread.sleep(3000);

		// Static Drag & drop
		WebElement logo1 = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement logo2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement logo3 = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement droparea = driver.findElement(By.xpath("//div[@id='droparea']"));

		ac.dragAndDrop(logo1, droparea).perform();
		Thread.sleep(2000);
		ac.dragAndDrop(logo2, droparea).perform();
		Thread.sleep(2000);
		ac.dragAndDrop(logo3, droparea).perform();
		Thread.sleep(5000);

	}

	public static void dynamicDragAndDrop() throws Exception {

		WebElement interactionsMenu = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		WebElement childMenu = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		WebElement DynamicChildMenu = driver.findElement(By.xpath("//a[text()='Dynamic ']"));

		Actions ac = new Actions(driver);
		ac.moveToElement(interactionsMenu).perform();
		Thread.sleep(1000);
		ac.moveToElement(childMenu).perform();
		Thread.sleep(1000);
		DynamicChildMenu.click();

		// Dynamic Drag & drop
		WebElement logo1 = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement logo2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement logo3 = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement droparea = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Thread.sleep(3000);
		ac.clickAndHold(logo1).moveToElement(droparea).release().perform();
		Thread.sleep(2000);
		ac.clickAndHold(logo2).moveToElement(droparea).release().perform();
		Thread.sleep(2000);
		ac.clickAndHold(logo3).moveToElement(droparea).release().perform();
		
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Modals.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		StaticDragAndDrop();
		dynamicDragAndDrop();

		driver.close();

	}

}
