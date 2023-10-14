package oct14th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinApp {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed ...");
	}
	@Test(priority = 1)
	public void loginTest()
	{
		String s1="LiveTech";
		String s2="Live";
		Assert.assertTrue(s1.equals(s2));
		System.out.println("Login Successful...");
		
	}

	@Test(priority = 0)
	public void registrationTest()
	{
		
		System.out.println("Registration Successful...");
		
	}
	
	@Test(priority = 2)
	public void forgotPasswordTest()
	{
		
		System.out.println("Forgot Password Successful...");
		
	}
	
	@Test(priority = 3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Forgot Password Successful...");
		
	}
}
