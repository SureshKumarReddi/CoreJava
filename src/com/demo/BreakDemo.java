package com.demo;

public class BreakDemo {

	public static void main(String[] args) {

		//initialisation
		int num =123; //1 + 2 +3 
 
		 
		 int temp = 0;
		 int rem;
		
		 while(num>0) {   //checking for +ve numbres
		 
		rem = num % 10 ;  
		temp = temp + rem;
		num = num/10;    
		
		 }
		System.out.println(num);
		
		
		
		
		
		
		/*
		 * String str = "something";
		 * 
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * if (str.charAt(i) == 't' || str.charAt(i) == 'g') { continue; }
		 * 
		 * System.out.print(str.charAt(i) + "  ");
		 * 
		 * }
		 */

		/*
		 * if(i==30) { System.out.println("30th time executed exited from for loop "
		 * +i); break; } else if(i==25) {
		 * System.out.println("25th time executed exited from for loop " +i); break; }
		 * System.out.println("i value " +i);
		 */
	}

}
