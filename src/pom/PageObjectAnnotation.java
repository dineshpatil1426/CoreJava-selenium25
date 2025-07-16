package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectAnnotation {

	
	@FindBy(id = "email") WebElement uid;
	@FindBy(id = "pass") WebElement pwd;
	@FindBy(name ="login") WebElement btnlogin;
	@FindBy(xpath = "//*[text()='Forgotten password?']")WebElement forgotLink;
	

}
