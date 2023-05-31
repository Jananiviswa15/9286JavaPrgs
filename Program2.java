package ExceptionHandling;

import java.util.Scanner;
public class Program2 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hi all");
		int num = 2;
		if(num % 2 == 0)
			System.out.println("even");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		try {
			
			//abnormal code
			int result = num1 / num2;
			
			String name = "hg";
			System.out.println(name.length());
			
			System.out.println(" hi all");
			
			int arr[] = {89,90,8};
			System.out.println(arr[9]);
			System.out.println(" hi all i will never execute");
		}
		
//		catch(ArithmeticException exc) {
//		//	System.out.println(exc.getMessage());
//			//exc.printStackTrace();
//			System.out.println(" hi all");
//		}
		catch(NullPointerException exc) {
			System.out.println(exc);
		}
//		catch(RuntimeException runTExc) {
//			System.out.println(" i will catch all the except other arith and null");
//		}
//		catch(Exception exc) {
//			System.out.println(" both checked and unchecked");
//		}
		finally {
			/*1. exc is there it is handled
			 * 2. exc is there it is not handled
			 *3. there is no exce*/
			System.exit(0);
			System.out.println(" it ll always work");
		}
	}
}
