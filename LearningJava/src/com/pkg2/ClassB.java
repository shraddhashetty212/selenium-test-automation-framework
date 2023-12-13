package com.pkg2;

import com.pkg1.ClassA;
import com.pkg1.ClassAA;
//or we can write as import com.pkg1.*
//this means it will import all the classes of the particular package

public class ClassB extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ClassA ca = new ClassA();
		ca.publicMethod();
		
		ClassAA caa = new ClassAA();
		caa.methodAA();
		
		//to access the protected method we can use inheritance concept
		//we can add classb extends classa and create an object of classb to access the protected method
		ClassB cb = new ClassB();
		cb.protectedMethod();

	}

}


//to access the protected method we can use inheritance concept
//we can add classb extends classa and create an object of classb to access the protected method
