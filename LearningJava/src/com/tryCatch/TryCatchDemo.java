package com.tryCatch;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int i = 10;
			System.out.println("Before division");
			System.out.println(i/0);
			//System.out.println(i/2);   --> this will not cause exception and statement in finally block will get executed even when there is no exception
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
			t.printStackTrace();
		}
		finally
		{
			System.out.println("Always gets executed whether exception occurs or not");
		}
		
		System.out.println("After division");

	}

}

/*
 * https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Throwable.html
 */

