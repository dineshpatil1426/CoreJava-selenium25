package testng_framework;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/3;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePage() {
		System.out.println("home Test");
		int i=9/0;
	}
	@Test(dependsOnMethods = "homePage")	
	public void cartTest() {
		System.out.println("cart test");
	}
	

}
