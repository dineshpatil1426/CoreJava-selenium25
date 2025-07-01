package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


// All dropdown selection options with ReletiveXpathPractice

public class ReletiveXpathPractice {
	
	public static  WebDriver driver;
	 
	 ReletiveXpathPractice(WebDriver driver){
		 ReletiveXpathPractice.driver=driver;
	 }

	public static void main(String[] args) throws Exception {

		ReletiveXpathPractice obj1= new ReletiveXpathPractice(driver);
		obj1.lunchApp();
		obj1.singleSelectDropdown();
		obj1.multiSelectDropdown();
		obj1.dropdownWithoutSelectTag();
		obj1.closeApp();

	}
	
	public  void lunchApp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
	
	public  void singleSelectDropdown() throws Exception {
		
		WebElement drpCountry = driver.findElement(By.xpath("(//select[@class='dropdown'])[1]"));
		WebElement drpMovives = driver.findElement(By.xpath("(//select[@class='dropdown'])[2]"));
		WebElement drpFruits = driver.findElement(By.xpath("(//select[@class='dropdown'])[3]"));

		Select selCountry = new Select(drpCountry);
		selCountry.selectByVisibleText("Australia");
		if (selCountry.isMultiple()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);

		Select selMovies = new Select(drpMovives);
		selMovies.selectByValue("Miriam Wagner");
		if (selMovies.isMultiple()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);

		Select selFruits = new Select(drpFruits);
		selFruits.selectByIndex(3);
		if (selFruits.isMultiple()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
	}
	
	
	public  void multiSelectDropdown() throws Exception {
		
		driver.findElement(By.xpath("//button[span[text()='Multi Select Dropdown']]")).click();

		WebElement drpSkill = driver.findElement(By.xpath("(//select[@class='multi'])[1]"));

		Select multiSelectSkill = new Select(drpSkill);

		if (multiSelectSkill.isMultiple()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		List<WebElement> skillList = multiSelectSkill.getAllSelectedOptions();

		if (!skillList.isEmpty()) {
			for (WebElement op : skillList) {
				System.out.print(op.getText());
				System.out.print(",");
			}
		}
		Thread.sleep(2000);
		WebElement drpWatchTV = driver.findElement(By.xpath("(//select[@class='multi'])[2]"));

		Select multiSelectWatchTV = new Select(drpWatchTV);

		if (multiSelectWatchTV.isMultiple()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		List<WebElement> watchTVList = multiSelectWatchTV.getAllSelectedOptions();

		if (watchTVList.isEmpty()) {
			multiSelectWatchTV.selectByVisibleText("Friday");
			multiSelectWatchTV.selectByValue("Tuesday");
			multiSelectWatchTV.selectByIndex(6);

		}
		
		//Selected list display 
		List<WebElement> watchTVList1 = multiSelectWatchTV.getAllSelectedOptions();
		for (WebElement op : watchTVList1) {
			System.out.print(op.getText());
			System.out.print(",");

		}
		System.out.println();
	}
	

	public  void dropdownWithoutSelectTag() throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[span[text()='Dropdown without ']]")).click();
		Thread.sleep(2000);
		WebElement drptravel = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]"));
		
		if(drptravel.isDisplayed()&& drptravel.isEnabled()) {
			drptravel.click();
		}
		Thread.sleep(1000);
		WebElement ulElement = driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> listItem = ulElement.findElements(By.tagName("li"));

		for (WebElement op : listItem) {
			if (op.getText().equals("Australia")) {
				op.click();
				break;
			}
		}

		Thread.sleep(2000);

		WebElement drpCompInfo = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]"));

		if (drpCompInfo.isDisplayed() && drpCompInfo.isEnabled()) {
			System.out.println("Pass");
			drpCompInfo.click();
		} else {
			System.out.println("Fail");
		}

		Thread.sleep(2000);
		WebElement infoUlElement = driver.findElement(By.xpath("//ul[@role='listbox']"));

		List<WebElement> infoList = infoUlElement.findElements(By.tagName("li"));

		for (WebElement op : infoList) {

			switch (op.getText()) {

			case "Contact Us":
			case "About":
			case "Policy":
				op.click();
			}
		}
		Thread.sleep(3000);
	} 
	
	public  void closeApp() {
		driver.close();
	}
}
