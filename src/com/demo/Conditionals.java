package com.demo;

public class Conditionals {

	public static void main(String[] args) {
		
		 int e = 2%5;
		 float f = 2/5f;
		 System.out.println(e +"  " + f);
		
		int q = 109;
		
		int rem = q %10;
		int div = q /10;
		
		System.out.println(rem +" "+div);
		
		
		
		
		int age = 25;
		// 1.simple if

		// synatx
		/*
		 * ; if (age > 18) { // conditon always return true or faalsee booleaan vlaue;
		 * System.out.println("eligible for voting");
		 * 
		 * }
		 */

		// 2.if else

		/*
		 * if (age > 18) { System.out.println("eligible for voting"); } else {
		 * System.out.println("not eligible for voting"); }
		 */

		// 3.nested if

		/*
		 * if(condition) { if(condition) {
		 * 
		 * } //we can add else block if required } //we can adddd eslse here
		 */

		if (age > 18) {
			System.out.println("eligible for voting");
			if (age > 65) {
				System.out.println("eligible  for pensio");
			} else {

			}

		} else {
			System.out.println();
		}

		// else if

		if (age > 30 && age>20) {
			System.out.println("age is greater than 30");
		} else if (age > 29) {
			System.out.println("age is greater than  50");
		} else if (age < 49) {
			System.out.println("age is less than 49");
		} else {
			System.out.println("age is less  than 20");
		}
	}

	
	
}
