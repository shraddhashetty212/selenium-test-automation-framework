package com.pkg1;

public class Truck extends VehicleCommon{

	public static void main(String[] args) {
		
		Truck tk = new Truck();
		tk.start();
		tk.stop();

	}
	
	public void loadCapacity()
	{
		System.out.println("Load Capacity");
	}

}
