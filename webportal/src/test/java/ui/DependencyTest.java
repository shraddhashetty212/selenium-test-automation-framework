package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class DependencyTest{
	
	@Test
	public void userRegistration()
	{
		System.out.println("User registered successfully");
		//when we fail this user registration method, the userSearch method will not execute and go to
		//dependencyTest3 and Test4 because we have mentioned that userSearch method depends on userRegistration method
		//To fail this we will use Assert.assertTrue method.
		//this is Hard Dependency because if 1st method fails then it will not come to dependent method
		Assert.assertTrue(false);
		
		//Now to execute the userSearch method even though the userRegistration method fails then we can use
		//Soft Dependency.
		//to use the soft dependency we have to add "alwaysRun=true" in the userSearch method so that
		//even when userRegistration method is failing it will execute the userSearch method and not skip
		//this method due to it being dependent on userRegistration.
	}
	
	@Test(dependsOnMethods="userRegistration", alwaysRun=true)
	public void userSearch()
	{
		System.out.println("User is searched in the DB and found the result");
	}
	
	@Test
	public void dependencyTest3()
	{
		System.out.println("This is test3");
	}
	
	@Test
	public void dependencyTest4()
	{
		System.out.println("This is test4");
	}

}

//Link - https://javadoc.io/doc/org.testng/testng/latest/org/testng/Reporter.html
//We can listener as well to get the report
//Link - https://javadoc.io/doc/org.testng/testng/latest/org/testng/ITestListener.html
