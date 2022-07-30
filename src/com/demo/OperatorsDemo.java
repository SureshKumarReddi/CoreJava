package com.demo;

public class OperatorsDemo {

	public static void main(String[] args) {
		 
		int a =30;
		int b = 10;
		
		
		
		
		if(a>b) {
			System.out.println(a +"is graeter than b");
		}
		else {
			System.out.println(b +" is grater than a");
		}
		
		//ternary operator
		
		//synatx     (condition) ?   stsmt1 : stmst2
		
		
		//if condition is true => stmt1 exceuted  ... if false => stmt2 is executed
		
		int result = (a>b) ?  100 :    -1;
		
		System.out.println(result);
		
		//mostly used for replacement for if - else conditional statement.
		
		
		
		
		
		
		
		
		/*
		 * int c = a + b; //addition int d = a - b; //substraction int e = a * b;
		 * //multiplication int f = a / b; // division -- which result quotitent as
		 * output 10)30(3 // 30 // ---- // 0 int g = a % b; //modulus opertpr takes
		 * remainder as output
		 * 
		 * System.out.println(c + " " +d + " "+ e + " " +f );
		 * 
		 * System.out.println("a + b = " + c); //formatting format System.out.println(c
		 * + " = a + b"); //any data type append/concat => string as result
		 * 
		 * System.out.println(c); System.out.println(d); System.out.println(e);
		 * System.out.println(f); System.out.println(g);
		 * 
		 * System.out.println();
		 */
	}

}
