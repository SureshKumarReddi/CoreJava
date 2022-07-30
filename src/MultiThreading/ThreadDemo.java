package MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Mythreads obj1 = new Mythreads();
		obj1.start();
		obj1.setName("First Thread");
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Mythreads obj2 = new Mythreads();
		obj2.start();
		obj2.setName("Second Thread");

	}

}


class Mythreads extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Current Thread  " +Thread.currentThread().getName() + "  " + i + "  times ");
		}
	}
	
	
}