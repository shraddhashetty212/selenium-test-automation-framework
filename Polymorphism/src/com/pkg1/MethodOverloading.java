package com.pkg1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.login(34567, "pass");
		mo.login("user", "pwd");
		mo.login(1234, "password", 778);

	}
	
	public void login(String s, String p)
	{
		System.out.println("Login successfull using username and password");
	}
	
	public void login(int s, String p)
	{
		System.out.println("Login successfull using phonenumber and password");
	}
	
	public void login(int s, String p, int t)
	{
		System.out.println("Login successfull using phonenumber, password and token/pin");
	}
	

}

/* 
 * Real time example where we will use this MethodOverloading is with click() method
 * There is click() and click(WebElement target) method which works the same way as above example.
 */
