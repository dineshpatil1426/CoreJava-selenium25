package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 extends BaseClass {

	public Assignment3(WebDriver driver) {
		super(driver);
	}

	public void selectCountryDropdown(String loc, String option) throws Exception {

		Thread.sleep(2000);
		WebElement drpselect = driver.findElement(By.xpath(loc));
		Select selectCountry = new Select(drpselect);
		selectCountry.selectByVisibleText(option);

		if (selectCountry.isMultiple()) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
	}

	public void tabOpenMultiSelectDropdown(String loc) throws Exception {

		driver.findElement(By.xpath(loc)).click();
		Thread.sleep(2000);
	}

	public void checkDrpSkillMultipleSelection(String loc) throws Exception {

		WebElement drpSkill = driver.findElement(By.xpath(loc));
		Select selectSkill = new Select(drpSkill);

		if (selectSkill.isMultiple()) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(1000);
		
		System.out.println();

		List<WebElement> skillOption = selectSkill.getAllSelectedOptions();
		
		for(WebElement e:skillOption) {
			System.out.print(e.getText());
			System.out.print(",");
			
		}
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws Exception {

		String url = "https://web-locators-static-site-qa.vercel.app/Dropdown";
		BaseClass base = new BaseClass(driver);
		Assignment3 ass3 = new Assignment3(driver);
		base.lunchApp(url);
		base.checkElementIsdisplay("//select[@class='dropdown']");
		base.checkElementIsEnable("//select[@class='dropdown']");
		ass3.selectCountryDropdown("//select[@class='dropdown']", "Australia");
		ass3.tabOpenMultiSelectDropdown("//button[span[text()='Multi Select Dropdown']]");
		ass3.checkDrpSkillMultipleSelection("//select[@class='multi']");
		base.closeApp();

	}

}
