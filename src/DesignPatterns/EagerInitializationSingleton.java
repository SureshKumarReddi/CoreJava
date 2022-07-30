package DesignPatterns;

public class EagerInitializationSingleton {


    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
 
    private EagerInitializationSingleton()
    {
        // private constructor
    }
 
    public static EagerInitializationSingleton getInstance()
    {
        return instance;
    }
    
    public static void main(String[] args) {
    	EagerInitializationSingleton instance2 = EagerInitializationSingleton.getInstance();
	}
}
