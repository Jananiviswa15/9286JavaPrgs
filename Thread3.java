package multiThreading;

public class Thread3 extends Thread {

	public void run() {
		for(int ctr = 0; ctr < 5 ; ctr++) {
			try {
				//System.out.println(Thread.currentThread().getState());
				System.out.println(Thread.currentThread().getName()+ " " +ctr);
				Thread.sleep(10000);
			}
			catch(InterruptedException exc) {
				System.out.println(exc);
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}
	public static void main(String args[]) {
		Thread3 myThread = new Thread3();
		Thread3 myThread1 = new Thread3();
		Thread3 myThread2 = new Thread3();
		myThread.start();
		try {
			Thread.currentThread().sleep(10000);
			myThread1.start();
			Thread.currentThread().sleep(50000);
			myThread2.start();
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		//		myThread.setPriority(MIN_PRIORITY);


		//		myThread.setPriority(MAX_PRIORITY);
	}
}
