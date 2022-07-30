package com.javapassbyvalue;

public class PassByReference2 {

	public static void main(String[] args) {
		 
		String s1 = "hello";
		String s2 = "world";
		
		System.out.println("before swapping " +s1 + "  " +s2);
		swap(s1,s2);
		System.out.println("After swapping " +s1 + "  " +s2);
	}

	private static void swap(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println(s1);
		System.out.println(s2);
	}

}

//Here we are using Immutable classes as data types(String,Integer,etc)
//then if we change the value in copied object then it will not reflect in the original object
//because of immutability