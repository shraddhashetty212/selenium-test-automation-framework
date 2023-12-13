package com.superPackage;

public class Parent {
	
	public Parent()
	{
		System.out.println("Parent constructor");
	}
	
	public Parent(int i)
	{
		System.out.println("Parameterized constructor");
	}
	
	String empName = "Tom";
	int empNum = 45345;
	
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNum);
	}

}
