package com.demo;

public class LogicalOperators {

	public static void main(String[] args) {

		int[] arr = new int[5]; // objects created for classes... array

		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 12;
		arr[3] = 4;
		arr[4] = 90;
		
		//whileloop
		//initialization
		
		/*
		 * int i=0;
		 * 
		 * while(i<arr.length) {
		 * 
		 * System.out.println(arr[i]);
		 * 
		 * //increment/decrement i++; }
		 */
		
		int a=1;
		do {
			System.out.println(a);
			a++;
		} while (a<10);
		
		
		
		
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 * System.out.println("********"); for (int i = arr.length - 1; i >= 0; i--) {
		 * System.out.println(arr[i]); } System.out.println();
		 */
		
		
		
		
		
		
		
		
		
		/*
		 * int a = 10; int d = 10;
		 * 
		 * 
		 * 
		 * System.out.println(++a +"  " + d++);
		 * 
		 * System.out.println(d);
		 * 
		 * System.out.println(--a + " " + d--); System.out.println(d);
		 */

		// = ==> means assignent operator
		// == ==> means equal to operator.

		// ~a = -(a+1)
		/*
		 * int a = 0; int b = 11110000;
		 */
		/*
		 * System.out.println(a&b); System.out.println(a|b); System.out.println(a^b);
		 */
		// System.out.println(~a);
		/*
		 * System.out.println(b >>> 2);
		 * 
		 * float[] arr = { 1.0f, 9.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f };
		 * 
		 * System.out.println(arr[5]);
		 * 
		 * for(float v :arr) { System.out.println(v); }
		 */

		// for(datatypeof array/collectiontype variablename: arrayname/collectionname)

	}

}
