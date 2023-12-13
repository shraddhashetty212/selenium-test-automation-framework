package com.pkg1;

public class Cat extends Animal{

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.makeNoise();

	}
	
	public void makeNoise()
	{
		System.out.println("Cat meows");
	}

}
