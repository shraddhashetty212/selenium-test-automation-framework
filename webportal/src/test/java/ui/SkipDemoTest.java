package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	
	
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skipping this test as it is not complete");
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this test - 2nd way of skipping tests");
	}
	
	Boolean datasetup = true; //change this to false and check how it will be skipped
	
	@Test
	public void skipTest3()
	{
		System.out.println("Skipping this test based on condition");
		if (datasetup==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do not execute");
			throw new SkipException("Do not execute further steps");
		}
	}

}
