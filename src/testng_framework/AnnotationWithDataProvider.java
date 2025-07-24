package testng_framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationWithDataProvider {

	@DataProvider(name = "Name-DataProvider")
	public Object[][] dataProvider(){
		
	 return new Object[][]  {{"data-one"},{"data-two"},{"data-three"}};
	}
	
	
	
	@Test(dataProvider = "Name-DataProvider")
	public void testName(String name) throws Exception {
		
		System.out.println("data is :"+name);	
	}
	
	

}
