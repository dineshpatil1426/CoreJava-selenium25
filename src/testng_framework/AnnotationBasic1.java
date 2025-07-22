package testng_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationBasic1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void testc1() {
		System.out.println("This is TestCase1");
	}
	@Test
	public void testc2() {
		System.out.println("This is TestCase2");
	}
	@Test
	public void testc3() {
		System.out.println("This is TestCase2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	

}
