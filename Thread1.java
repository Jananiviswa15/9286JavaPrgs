package multiThreading;

//java.lang
public class Thread1 extends Thread{

	public void run() {
		System.out.println(" i have started..");
	}
	public static void main(String args[]) {
		
	Thread threadEg = new Thread("myOwnName");	 //thread - 0  //1st type
		Thread1 myThread = new Thread1();   //thread - 1  //2nd type
		Thread1 myThread1 = new Thread1(); // //thread - 2
		//myThread.run(); //no separate call stack ll b created
		myThread.start();  //seaparate call stack
		//myThread.start();
		myThread1.start();  //seaparate call stack
		System.out.println(myThread.getName());
		System.out.println(threadEg.getName());
		myThread1.setName("new name");
		System.out.println(myThread1.getName());
		//start method internally run method ll be called
		
		//wheneve you are creating a thread its compulsory for you to override run
		System.out.println(myThread.getPriority());  //5
		myThread.setPriority(9); //1 to 10
		//neg --> throw exc
	}
}
