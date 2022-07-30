package DesignPatterns;
//breaking of singleton using Cloning and avoiding example..
public class SingletonBreaking1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		SingletonDemo instance = SingletonDemo.getInstance();
		SingletonDemo clone =  (SingletonDemo)instance.clone();
		
		System.out.println("original object hashcode "  +instance.hashCode());
		System.out.println("cloned objecct hashcode " +clone.hashCode());
	}

}

class SingletonDemo implements Cloneable{
	private static final SingletonDemo instance = new SingletonDemo();

	private SingletonDemo() {
	}

	public static SingletonDemo getInstance() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//if we use super.clone() it will return new object which will voilate singleton principle
		
		//return super.clone();
		
		throw new CloneNotSupportedException();
		//whenever we are creating the new object throw the CloneNotSupported Exception which will
		//throw the exception while violating the singleton Principle.
	}
	
	
}