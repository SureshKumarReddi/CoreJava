package com.demo;

public class G60 implements Motorola {

	@Override
	public void display() {
	 System.out.println("Inter class Implementation ");
	}

	@Override
	public void ramSize() {
		System.out.println("6gb ram");
	}

	@Override
	public void processor() {
		System.out.println("I7 processor");
	}

	@Override
	public void battery() {
		System.out.println("6000 mah ");
	}

	@Override
	public void camera() {
		System.out.println("108  mg pixelcamera");
	}

	public static void ok() {
		System.out.println("i am static method from G60");
	} 
	
	public static int x=10;

}
