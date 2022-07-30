package MultiThreading;

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		
		ThreadInterrupt t1 = new ThreadInterrupt();
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();

	}

}


class ThreadInterrupt extends Thread{

	@Override
	public void run() {
		 
		for(;;) {
			System.out.println("Thread is running ");
			if(Thread.interrupted()) {
				System.out.println("Thread interrupted ");
				break;
			}
		}
	}
	
	
}