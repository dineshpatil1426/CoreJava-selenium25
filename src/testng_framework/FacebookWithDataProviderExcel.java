package testng_framework;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class FacebookWithDataProviderExcel {

	WebDriver driver;

	@BeforeMethod
	public void lunchApp() {

		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String loginTitle = driver.getTitle();
		System.out.println(loginTitle);
	}

	@DataProvider(name = "Login-Exceldata")
	public Object[][] loginExceldat() throws Exception {

		Object[][] obj = getExcelData("/Users/macmini/Downloads/Login_page.xls", "Login");
		return obj;
	}

	@Test(dataProvider = "Login-Exceldata", dataProviderClass = FacebookWithDataProviderExcel.class)
	public void loginTestcase(String uid, String pass) {

		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@AfterMethod
	public void closeApp() {
		System.out.println("Close App");
		driver.close();
	}

	public String[][] getExcelData(String fileName, String sheetName) throws Exception {

		String[][] data = null;

		try {

			FileInputStream fil = new FileInputStream(fileName);
			Workbook wk = Workbook.getWorkbook(fil);
			Sheet s = wk.getSheet(sheetName);

			int columns = s.getColumns();
			int row = s.getRows();

			data = new String[row][columns];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < columns; j++) {

					data[i][j] = s.getCell(j, i).getContents();

				}
			}

		} catch (Exception e) {

			System.out.println("The exception is: " + e.getMessage());
		}
		return data;

	}

}
