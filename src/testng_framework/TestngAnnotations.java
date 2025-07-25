package testng_framework;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	
	// global pre conditions
		// pre conditions
		// test cases: test steps --> actual vs expected result
		// post steps
		// post global steps

		// before -- test(A) -- after
		
		/*
		BS - connectWithDB
		BT - createUser
		BC - launchBrowser
		
			BM - loginToApp
			search test
			AM - logout
		
			BM - loginToApp
			title test
			AM - logout
		
			BM - loginToApp
			URL test
			AM - logout
		
		AC - closeBrowser
		AT - deleteUser
		AS - disconnectDB
		*/
		
		//AAA pattern: Arrange - Act -- Assert
		
		//1
		@BeforeSuite
		public void connectWithDB() {
			System.out.println("BS - connectWithDB");
		}

		//2
		@BeforeTest
		public void createUser() {
			System.out.println("BT - createUser");
		}

		//3
		@BeforeClass
		public void launchBrowser() {
			System.out.println("BC - launchBrowser");
		}

		//4 //7 //10
		@BeforeMethod
		public void loginToApp() {
			System.out.println("BM - loginToApp");
		}

		//8
		@Test
		public void titleTest() {
			System.out.println("title test");
			Assert.assertEquals(true, false);
		}

		//11
		@Test
		public void urlTest() {
			System.out.println("URL test");
			Assert.assertEquals(true, false);
		}

		//5
		@Test
		public void searchTest() {
			System.out.println("search test");
			Assert.assertEquals(true, true);
		}

		//6 //9 //12
		@AfterMethod
		public void logout() {
			System.out.println("AM - logout");
		}

		//13
		@AfterClass
		public void closeBrowser() {
			System.out.println("AC - closeBrowser");
		}

		//14
		@AfterTest
		public void deleteUser() {
			System.out.println("AT - deleteUser");
		}

		//15
		@AfterSuite
		public void disconnectDB() {
			System.out.println("AS - disconnectDB");
		}

}
