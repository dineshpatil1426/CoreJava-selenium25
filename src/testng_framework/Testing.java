package testng_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
	
	@Test
	public void addMethod() {
		System.out.println("test method");
		int a = 20;
		int b = 20;
		int sum = a+b;
		Assert.assertEquals(sum, 30, "===both are not equal===");
	}
	
	
	@Test
	public void divMethod() {
		System.out.println("div method");
		int a = 10;
		int b = 30;
		int div = b/a;
		Assert.assertEquals(div, 2, "===div is giving some error===");
	}

}
