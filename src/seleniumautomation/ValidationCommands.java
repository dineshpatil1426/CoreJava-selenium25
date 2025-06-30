package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {
	 WebDriver driver;
	
	ValidationCommands(WebDriver driver){
		this.driver=driver;
	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		boolean fNameDisplay = driver.findElement(By.id("firstName")).isDisplayed();

		if (fNameDisplay) {
			System.out.println("first Name is display");
		} else {
			System.out.println("first Name is not display");
		}

		boolean lnameEnable = driver.findElement(By.id("lastName")).isEnabled();

		if (lnameEnable) {
			System.out.println("last Name is Enable");
		} else {
			System.out.println("last Name is not Enable");
		}

		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@value='Male']")).click();
		 */

		boolean maleRadio = driver.findElement(By.id("gender-radio-1")).isSelected();

		if (maleRadio) {
			System.out.println("Male Radio Button is Selected");
		} else {
			System.out.println("Male Radio Button is not Selected");

		}

		String currentPageTitle = driver.getTitle();

		if (currentPageTitle != null) {
			System.out.println("Current Page Title is : " + currentPageTitle);
		} else {
			System.out.println("current Page title is Empty");
		}

		String currentPageUrl = driver.getCurrentUrl();

		if (currentPageUrl != null) {
			System.out.println("Current Page URL is : " + currentPageUrl);
		} else {
			System.out.println("current Page url is Empty");
		}

		String mobileMaxLenght = driver.findElement(By.id("userNumber")).getAttribute("maxlength");
		System.out.println("Mobile Maxlenght is : " + mobileMaxLenght);

		Dimension birthdateSize = driver.findElement(By.id("dateOfBirthInput")).getSize();
		System.out.println("Birthday size is :" + birthdateSize);

		String buttonTagname = driver.findElement(By.id("submit")).getTagName();
		System.out.println("Tag Name is : " + buttonTagname);

		String buttonName = driver.findElement(By.id("submit")).getText();
		System.out.println("button name is :" + buttonName);
		
		ValidationCommands obj= new ValidationCommands(driver);
		obj.getFirstName();

		driver.close();

	}
	
	public void getFirstName() throws Exception {
		
		
		System.out.println("---------------First Name---------------" ); 
		
		boolean fNameDisplay = driver.findElement(By.id("firstName")).isDisplayed();

		if (fNameDisplay) {
			System.out.println("first Name is display");
		} else {
			System.out.println("first Name is not display");
		}
		boolean fNameEnabled = driver.findElement(By.id("firstName")).isEnabled();
		
		if (fNameEnabled) {
			System.out.println("first Name is Enabled");
		} else {
			System.out.println("first Name is not Enabled");
		}
		
		String firstnamePlaceHolder =  driver.findElement(By.id("firstName")).getAttribute("placeholder");
		
		System.out.println("FirstName Placeholder Name is  : " + firstnamePlaceHolder);
		
		Dimension firstnameSize= driver.findElement(By.id("firstName")).getSize();
		System.out.println("First Name Size is : "+firstnameSize);
		
		String firstTagName= driver.findElement(By.id("firstName")).getTagName();
		System.out.println("First Name  TagName is : "+ firstTagName);
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("Dinesh");
		Thread.sleep(1000);
	    String firstGetText= driver.findElement(By.id("firstName")).getAttribute("value"); 		
		System.out.println("First Name Field is: "+ firstGetText );
	    
	}
	

}
