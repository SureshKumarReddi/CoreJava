package MultiThreading;

public class NoSynchronizationDemo {

	public static void main(String[] args) {
		
		System.out.println("main thread started ");
		Printer p = new Printer();
		NonSynchronization t1 = new NonSynchronization(p,"A.java");
		NonSynchronization t2 = new NonSynchronization(p,"B.java");
		NonSynchronization t3 = new NonSynchronization(p,"C.java");
 
	}

}


class NonSynchronization implements Runnable{
	
	private Thread t;
	private String filename;
	private Printer printer;

	NonSynchronization(Printer printer,String filename){
		this.printer = printer;
		t = new Thread(this,"Child Thread");
		this.filename= filename;
		t.start();
	}
	@Override
	public void run() {
		 printer.print(filename);
	}
	
}


class Printer{
	
	public synchronized void print(String file) {
		
		System.out.println("Printing the File Name " +file);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Printing got completed " +file);
	}
}