package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		
		//wrapping primitive data type integer into integer object using Integer class
		Integer int1 = new Integer(i); //wrapping or auto-boxing
		System.out.println(int1);
		
		int j = int1;  //unwrapping or auto-unboxing
		System.out.println(j);

	}

}
