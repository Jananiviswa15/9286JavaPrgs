

//store more than 1 val --> arr
//array name is an object
//parent --> Object class
public class ArrayEg {
	//1d and multidim
	/*
	 * dt[] arrName;
	 * dt []arrName;
	 * dt arrName[];
	 */


	static void toSeeArrayInDetail(char arr[]) {
		System.out.println(arr[0]);  //
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
		System.out.println(arr); //for char it ll join the arr val
		System.out.println("sajjhff"+arr);
		System.out.println(arr.getClass().getName());
		System.out.println(arr.getClass().getSuperclass().getName());
	}

	public static void main(String anything[]) {
		int arr[] = new int[5];
		arr[4] = 100000;
		//FourthPrg operatorObject = new FourthPrg();
		byte byteArray[] = new byte[10];  //8bits 80bits, cont mem
		char charArray[] = new char[5];	 // , , , , 
		long longArray[] = new long[90]; //0,0,0,0,0,0...
		short shortArray[] = new short[10];
		boolean booleanArray[] = new boolean[3];  //false, false, false

		float floatArray[] = new float[5];
		double doubleArray[] = new double[5];

		charArray[0] = 'j';  // j,a ,n , a,n 
		charArray[1] = 'a';
		charArray[2] = 'n';
		charArray[4] = 'n';
		charArray[3] = 'a';

		toSeeArrayInDetail(charArray);



		int array[];

		int size = 9;
		array = new int[size];


		short divyaMarks[] = {90,120,190,200,80,10};   //6 * 1 shirt elmnt size
		System.out.println(divyaMarks[0]);
		System.out.println(divyaMarks);

	}	
}
