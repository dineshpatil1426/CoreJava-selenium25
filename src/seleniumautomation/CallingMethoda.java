package seleniumautomation;

import org.openqa.selenium.WebDriver;

public class CallingMethoda extends BaseClass {

	public CallingMethoda(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws Exception {
		
		
		BaseClass base= new BaseClass(driver);
		String url="https://www.facebook.com/";
		base.lunchApp(url);
		base.checkElementIsdisplay("//input[@id='email']");
		base.checkElementIsEnable("//input[@id='email']");
		base.checkElementIsdisplay("//input[@id='pass']");
		base.checkElementIsEnable("//input[@id='pass']");
		base.checkElementIsEnable("//button[@name='login']");
		base.closeApp();

	}

}
