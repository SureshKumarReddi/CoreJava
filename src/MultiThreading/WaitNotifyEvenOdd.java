package MultiThreading;

public class WaitNotifyEvenOdd {

	public static void main(String[] args) {
		 
		Rum obj = new Rum();
		Thread t1 = new Thread(obj,"t1");
		t1.start();
		Thread t2 = new Thread(obj,"t2");
		t2.start();
	}

}


class Rum implements Runnable{

	@Override
	public void run() {
		 
		 synchronized(this) {
			 for(int i=1;i<=10;i++) {
				 if(i%2!=0 && Thread.currentThread().getName().equals("t1")) {
					 notifyAll();
					 System.out.println("Odd Number Thread" +i);
					 try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }else if(i%2==0 && Thread.currentThread().getName().equals("t2")){
					 notifyAll();
					 
					 System.out.println("Even Number Thread"  +i);
					 try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
			 }
		 }
		
	}
	
}