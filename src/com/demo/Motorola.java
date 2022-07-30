package com.demo;

public interface Motorola {

	public void display();
	public void ramSize();
	public void processor();
	public void battery();
	public void camera();
	
	public static void ok() {
		System.out.println("i am static method from Motorola");
	}
}
