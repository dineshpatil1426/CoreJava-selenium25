package testng_framework;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class AnnotationGroups {
	
	    @BeforeGroups(groups = {"login"})
	    public void setupLogin() {
	        System.out.println("Setting up login environment...");
	        // Code to initialize login-related resources
	    }

	    @Test(groups = {"login"})
	    public void testLoginSuccess() {
	        System.out.println("Testing successful login...");
	        // Test logic for successful login
	    }

	    @Test(groups = {"login"})
	    public void testLoginFailure() {
	        System.out.println("Testing failed login...");
	        // Test logic for failed login
	    }

	    @Test(groups = {"registration"})
	    public void testRegistration() {
	        System.out.println("Testing registration...");
	        // Test logic for registration
	    }
	
}


