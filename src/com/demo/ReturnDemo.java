package com.demo;

public class ReturnDemo {
	
	 Test obj = new Test();
	
	public static void main(String[] args) {
		// Modifiers keywords return type methodName(args)
		
		 
		 
	 display(5,6);
		
		
	 
	}

	public static Employee display(int v1,int v2) {
		
		Employee obj = new Employee();
		obj.display();
		
		return obj;
	}

	

 
	
	public  Test displayInt() {
		 
		
		//obj.main(null);
		
		return obj;
	}

	
	
	public static String displayString() {
	 int s =10;
		
		return Integer.toString(s);
	}

	public static boolean displayboolean() {
		boolean b = true;

		return b;
	}
}
