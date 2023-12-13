package com.superPackage;

public class Child extends Parent{
	
	public Child()
	{
		//super();
		super(3);
	}
	
	String empName = "Abby";
	int empNum = 65778;

	public static void main(String[] args) {
		

		Child c = new Child();
		c.getData();  // this will print Abby and 65778 in the console.

	}
	
	public void getData()
	{
		/*
		System.out.println(empName);
		System.out.println(empNum);
		*/
		
		//to get the data from the parent class to be printed here then just add super.parentclassmethod.
		//here it is super.getData() and it will print Tom and 45345 when c.getData() is called.
		super.getData();
		//we can also write using system.out.println(super.empName) which will give as Tom
	}

}
