package com.superPackage;

public class ThisKeyword {
	
	int x = 10;
	int y = 20;
	String s = "Shetty";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword tk = new ThisKeyword();
		tk.getData();

	}
	
	public void getData()
	{
		//int a = 50;
		//int b = 40;
		
		int x = 50;
		int y = 40;
		System.out.println(this.x + this.y); //"this" keyword is referring to the instance variable declared inside the class
		System.out.println(x+y);
		this.getData1(); // or we can directly call the method using getData1()
		getData1(); // implicitly java adds "this" keyword whenever you call a method within any method.
	}
	
	public void getData1()
	{	
		int x = 100;
		int y = 200;
		System.out.println(this.x + this.y); //"this" keyword is referring to the instance variable declared inside the class
		System.out.println(x+y);
	}

}
