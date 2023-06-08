package multiThreading;

class Calculator{

	synchronized void printNumber() {
		for(int ctr = 1; ctr <= 5; ctr++)
			System.out.println(Thread.currentThread().getName()+" "+ctr);
	}
}


class SampleThread extends Thread{
	Calculator calculator = new Calculator();

	public void run() {
		calculator.printNumber();
	}
}
public class SynchronisedThread{

	public static void main(String args[]) {
		SampleThread threadRef = new SampleThread();
		
		Thread thread1 = new Thread(threadRef);
		Thread thread2 = new Thread(threadRef);
		
		thread1.start();
		thread2.start();

	}
}
