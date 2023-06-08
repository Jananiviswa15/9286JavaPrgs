package multiThreading;

public class Thread2 implements Runnable{

	public void run() {
		System.out.println("hi all");
	}
	public static void main(String args[]) {
	
		Thread2 obj = new Thread2();  //java object
		Thread myThread = new Thread(obj);  //thread - 0  //3rd type
		//obj.start();
		
		Thread2 obj1 = new Thread2();  //java object
		Thread myThread1 = new Thread(obj1, "hi");  //thread - 0  //4th type
		myThread.start();
	}
	
}
