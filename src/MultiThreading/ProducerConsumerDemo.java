package MultiThreading;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Shop shop = new Shop();
		Producer p = new Producer(shop);
		Consumer c = new Consumer(shop);
	}

}

class Producer implements Runnable {

	private Shop shop;
	private Thread t;

	Producer(Shop shop) {
		this.t = new Thread(this, "Producer thread");
		this.shop = shop;
		t.start();
	}
//producer thread produces for every two seconds
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			shop.produced(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	private Shop shop;
	private Thread t;

	Consumer(Shop shop) {
		this.t = new Thread(this, "Producer thread");
		this.shop = shop;
		t.start();
	}
//consumer thread consumes for every 1 second
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			shop.consumed(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

//class demonstrates problem of Producer Consumer problem

/*
 * class Shop {
 * 
 * public synchronized void produced(int number) {
 * System.out.println(" Produced " +number); }
 * 
 * public synchronized void consumed(int number) {
 * System.out.println(" Consumed " +number);
 * 
 * } }
 */
 


//class demonstrates sloution for the Producer Consumer problem

class Shop {

	private int no;
	private boolean flag = false;

	public synchronized void produced(int number) {
		if(flag==true)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(" Produced " + number);
		flag=true;
		notify();
	}

	public synchronized void consumed(int number) {
		if(flag==false)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(" Consumed " + number);
		flag=false;
		notify();
		
	}
}
 

