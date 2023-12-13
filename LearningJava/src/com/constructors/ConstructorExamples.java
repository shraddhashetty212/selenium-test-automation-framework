package com.constructors;

public class ConstructorExamples {

	// no argument constructor
	public ConstructorExamples() {
		// no return type
		// same name as the class name
		System.out.println("No Argument Constructor");
	}

	// parameterized constructor
	public ConstructorExamples(int i) {
		// no return type
		// same name as the class name
		System.out.println("Integer Constructor");
	}
	
	public ConstructorExamples(int i, int y) {
		System.out.println("2 Integers Constructor");
	}
	
	public ConstructorExamples(String s) {
		System.out.println("String Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ConstructorExamples ce = new ConstructorExamples();
		//ConstructorExamples ce = new ConstructorExamples(5);
		//ConstructorExamples ce = new ConstructorExamples(5, 10);
		ConstructorExamples ce = new ConstructorExamples("Shetty");

	}

}
