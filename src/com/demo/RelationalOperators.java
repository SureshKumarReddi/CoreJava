package com.demo;

public class RelationalOperators {

	public static void main(String[] args) {

		// logical operators -- find highest number

		int a = 10, b = 15, c = 30;

		if (a > b && a > c) {
			System.out.println(a + " is greater than b and c");
		} else if (b > a && b > c) {
			System.out.println(b + " is greater than a and c");
		} else if (c > a && c > b) {
			System.out.println(c + " is greater than a and b");

		}

		/*
		 * if(a>b) { //a is bigger number if(a>c) { //a is System.out.println(a +
		 * " is greater than b and c"); } }else if(b>a) { if(b>c) { System.out.println(b
		 * + " is greater than a and c"); } }else if(c>a) { if(c>b) {
		 * System.out.println(c + " is greater than a and b"); } }
		 * 
		 * 
		 */

		// comparision operators <,>,<=,>=,!=

		/*
		 * float f1 = 10.50f; float f2 = 20.50f;
		 * 
		 * //used in if,for,while conditions
		 * 
		 * if(f1+f2 >= 21) { System.out.println("result is greater than equalto 21");
		 * }else System.out.println("result is not greater than equalto 21");
		 */

	}

}
