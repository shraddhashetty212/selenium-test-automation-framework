package com.finalKeyword1;

public class Child extends Parent{
	
	public int i = 10; //instance variable
	public final int j = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		System.out.println(c.i);
		c.i = 20;
		System.out.println(c.i);
		
		//now we cannot do c.j = 40 bcz its final

	}
	
	/* Error - Cannot override the final method from Parent
	public void setData()
	{
		System.out.println(i);
	}
	*/

}
