package com.demo;

public class G4Plus implements Motorola{

	@Override
	public void display() {
		 System.out.println("G4 Plus Display");
	}

	@Override
	public void ramSize() {
		System.out.println("3 gb ram");
	}

	@Override
	public void processor() {
		System.out.println("i5 processor");
	}

	@Override
	public void battery() {
		System.out.println("3000 mah battery");
	}

	@Override
	public void camera() {
		System.out.println("16 Mega Pixel  Camera");
	}

	public static void ok() {
		System.out.println("i am static method from G4 Plus");
	}
}
