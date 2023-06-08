package multiThreading;

public class DeadLockEg extends Thread {

	public static void main(String args[]) throws InterruptedException {
		DeadLockEg obj = new DeadLockEg();
		System.out.println(" hello all");
		Thread.currentThread().join();
		System.out.println(" hello all");
		
	}
}
