package MultiThreading;

public class ChildThreadsDemo {

	public static void main(String[] args) {
		System.out.println(" Main Thread Started");
		 MyThread t1 = new MyThread("First Thread");
		 MyThread t2 = new MyThread("Second Thread");
		 MyThread t3 = new MyThread("Third Thread");
		 MyThread t4 = new MyThread("Fourth Thread");
		 MyThread t5 = new MyThread("Five Thread");
		  
		 System.out.println(" Main Thread suspending ");
		 try {
			Thread.sleep(4000);
			System.out.println("Main Thread Resumed");
		} catch (InterruptedException e) {
			System.out.println("Error " + e); 
			e.printStackTrace();
		}
		 
		System.out.println("Main Thread Terminates");
	}

}

class MyThread implements Runnable{
	
	Thread t;
	String name;
	
	MyThread(String name){
		this.t=new Thread(this,name);
		this.name = name;
		System.out.println("Thread created " +name);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Thread Started " +name);
		 for(int i=0;i<5;i++) {
			 System.out.println("Running Thread is and gng to sleep for while   " +  Thread.currentThread().getName());
			 try {
				Thread.sleep(5000);
				System.out.println("Thread Resumes " +Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 
		 System.out.println("Thread Terminates " +name);
	}
	
	
}