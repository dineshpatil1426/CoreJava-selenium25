package testng_framework;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount = 10)
	public void createUser() {
		System.out.println("create user");
	}

	
}
