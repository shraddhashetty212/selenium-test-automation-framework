package ui;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class GroupDemoTest2 extends CommonDataSetup{
	
	@Test(groups="regression")
	public void aTest1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups="regression")
	public void aTest2()
	{
		System.out.println("Test2");
	}
	
	@Test(groups= {"regression", "bvt"})
	public void aTest3()
	{
		System.out.println("Test3");
	}
	
	@Test(groups="bvt")
	public void aTest4()
	{
		System.out.println("Test4");
	}

}
