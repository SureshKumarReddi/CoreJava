package com.javapassbyvalue;

public class PassByreference1 {

	public static void main(String[] args) {

		Demo obj = new Demo();
		System.out.println("Before swap " + obj.i1 + " " + obj.i2);
		System.out.println("Object address " +obj.hashCode());
		swap(obj);
		System.out.println("After swap " + obj.i1 + " " + obj.i2);
	}

	private static void swap(Demo obj) {
	 
		System.out.println("Object address " +obj.hashCode());
		int temp = obj.i1;
		obj.i1 = obj.i2;
		obj.i2 = temp;

	}

}

class Demo {
	int i1 = 10;
	int i2 = 20;

}

//this is custom class means if we are changing the reference variable then 
//the original object changes

//if we add below it will not reflect the orignal object.