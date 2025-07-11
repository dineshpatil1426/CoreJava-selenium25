package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragDrop1 {

	public static WebDriver driver;

	public static void simpleDragAndDrop() throws Exception {

		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions ac = new Actions(driver);
		ac.dragAndDrop(draggable, droppable).perform();
		Thread.sleep(3000);

		if (droppable.getText().equals("Dropped!")) {

			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void acceptDragAndDrop() throws Exception {

		WebElement acceptTab = driver.findElement(By.xpath("//*[text()='Accept']"));
		acceptTab.click();
		Thread.sleep(1000);

		WebElement draggable = driver.findElement(By.xpath("//*[@id='acceptable']"));
		
		WebElement droppable = driver.findElement(By.xpath("(//*[@id='droppable'])[2]"));

		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(draggable, droppable).perform();
		Thread.sleep(2000);

		if (droppable.getText().equals("Dropped!")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Accept']")).click();
		Thread.sleep(2000);
		WebElement notAcceptable = driver.findElement(By.xpath("//*[@id='notAcceptable']"));
		WebElement droppable1 = driver.findElement(By.xpath("(//*[@id='droppable'])[2]"));
		ac.dragAndDrop(notAcceptable,droppable1).perform();

		if (droppable1.getText().equals("Dropped!")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//simpleDragAndDrop();
		acceptDragAndDrop();

		driver.close();

	}

}
