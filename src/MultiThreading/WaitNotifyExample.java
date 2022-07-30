package MultiThreading;

public class WaitNotifyExample {

	public static void main(String[] args) {

		Threas o = new Threas();
		o.start();

		synchronized (o) {
			try {
				 o.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Threas extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
		System.out.println("Total is " + total);
	}
}