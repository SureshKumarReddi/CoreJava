package com.javapassbyvalue;

public class PassByreference {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 20;
		
		System.out.println("before  swapping " +i1 + " " +i2);
		
		swap(i1,i2);
		
		System.out.println("After swapping " +i1 + " " +i2);
	}

	private static void swap(Integer i1, Integer i2) {
		Integer temp = i1;
		 i1 = i2;
		 i2 = temp;
	}

}
