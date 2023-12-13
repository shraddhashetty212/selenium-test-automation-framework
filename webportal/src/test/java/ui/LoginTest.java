package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends CommonDataSetup{
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to application");
	}
	
	@AfterTest
	public void logoutFromApplication()
	{
		System.out.println("Logout from application");
	}

	@Test(priority=1, description="This is a login test", groups="regression")
	public void aTest1()
	{
		System.out.println("test1");

	}
	
	@Test(priority=2, description="This is a logout test")
	public void aTest2()
	{
		System.out.println("test2");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("Connected to DB");
	}
	
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("Disconnected from DB");
	}

}
