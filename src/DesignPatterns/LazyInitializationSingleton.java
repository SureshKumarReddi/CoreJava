package DesignPatterns;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton obj = null;
	
	private LazyInitializationSingleton() {
		//System.out.println(" This is private constructor ");
	}
	
	public static LazyInitializationSingleton getInstance() {
		if(obj == null) {
			 obj = new LazyInitializationSingleton();
		}
		return obj;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
