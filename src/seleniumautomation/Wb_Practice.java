package seleniumautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




//WebElement practic
public class Wb_Practice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","/Users/macmini/Documents/Selenium jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement txtFirstName=driver.findElement(By.id("firstName"));
		WebElement txtLastName=driver.findElement(By.id("lastName"));
		WebElement txtEmail=driver.findElement(By.id("userEmail"));
		WebElement rdmale=driver.findElement(By.id("gender-radio-1"));                    //("//input[@value='Male']"));
		WebElement txtMobile=driver.findElement(By.id("userNumber"));
		
		
		if(txtFirstName.isDisplayed()==true && txtFirstName.isEnabled()==true) {
			txtFirstName.sendKeys("Dinesh");
		}else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		if(txtLastName.isDisplayed()==true && txtLastName.isEnabled()==true) {
			txtLastName.sendKeys("patil");
		}else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		if(txtEmail.isDisplayed()==true && txtEmail.isEnabled()==true) {
			txtEmail.sendKeys("patildinesh@gmail.com");
		}else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		
		//rdmale.click();
		
		if(rdmale.isSelected()) {
				System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		if(txtMobile.isDisplayed()==true && txtMobile.isEnabled()==true) {
			txtMobile.sendKeys("9033329315");
		}else {
			System.out.println("Fail");
		}
		
		Thread.sleep(1000);
			
		driver.close();

	}

}
