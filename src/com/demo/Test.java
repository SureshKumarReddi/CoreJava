package com.demo;

public class Test {

	public static void main(String[] args) {

		 
		//integers 
		
		/*
		 * byte a =10; short b =20; int c =30; long d =40;
		 */
		
		
		//1 byte
		
		byte b =12;  //255 maximum range
		 int c = b;
		 
		 int a = 2147483647 +100;
	 System.out.println(a);
		
		 
		 short h = 12;
		 
		 
		 float f1 = 1216671126127.45142562636263672276326732f;
		 float f2 = 15125615625612.45142562636263672276326732f;
		 
		 int f3 = (int) ((int)f1 + f2);
		 System.out.println(f3);
		 
		 
		 //doubl12334.55566787874781245256
		 double f4 = 1216671126127.45142562636263672276326732;
		 double f5 = 15125615625612.45142562636263672276326732;
		 
		 float f6 = (float) ((float)f4 + f5);
		 System.out.println(f6);
		 
		 
		 //1.widening /implict --- smaller dat types can be easily stored into bigger data type
		 
		 
		 byte bb = 100;
		 int n = bb;
		 short ss = 101;
		 int nn = ss;
		 
		 
		 //narrowing /explict type cnbversion
		 
		 int nnn=150;
		 byte bbb = (byte)nnn;
		 System.out.println(bbb);
		 
		    
	}
 
}
