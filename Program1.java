package ExceptionHandling;
/*1.try{
 * }
 * catch(){
 * }
 * try{
 * }
 * finally{
 * }
 * try{
 * }
 * catch(){
 * }
 * finally{
 * }
 */
public class Program1 {

	//jvm --> default exception handler
	//at run t , it ll handle it
	//detailed message, line no, name of the exeption, message of exc
	public static void main(String args[]) {
		
		System.out.println(" i am before exc");
	int result = 90 / 0;
		System.out.println(" hi i am here");
		
		String name = null;
		System.out.println(name.length());
		
		
		int arr[] = {89,90,8};
		System.out.println(arr[9]);
		
	}
}
