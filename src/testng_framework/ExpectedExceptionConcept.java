package testng_framework;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name;
	
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0; //AE
		ExpectedExceptionConcept obj=null;
		obj.name="Tom"; //NPE
	}

}
