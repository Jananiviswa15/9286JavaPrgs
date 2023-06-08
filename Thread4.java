package multiThreading;

public class Thread4  extends Thread{

	public void run() {
		for(int ctr = 0; ctr < 5 ; ctr++) {
			System.out.println(Thread.currentThread().getName()+" "+ctr);
		}
		
	}
	public static void main(String args[])throws Exception {
		Thread4 myThread1 = new Thread4();
		myThread1.setPriority(MAX_PRIORITY);
		myThread1.setName("t1");
		Thread4 myThread2 = new Thread4();
		myThread2.setPriority(3);
		myThread2.setName("t2");
		Thread4 myThread3 = new Thread4();
		myThread3.setName("t3");
		myThread2.start();
		myThread2.join();
		System.out.println(myThread2.isAlive()+" "+myThread2.getState());
		myThread3.start();
		System.out.println(myThread3.isAlive());
		myThread3.join();
		System.out.println(myThread3.isAlive());
		myThread1.start();
	}
}
