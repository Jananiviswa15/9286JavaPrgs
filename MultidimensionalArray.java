
public class MultidimensionalArray {

	//r and c --> r is comp
	/*
	 * dt[][] arrName;
	 * dt [][]arrName;
	 * dt arrName[][];
	 */
	
	static void toSeeMultiDimDetails(float arr[][]) {
		System.out.println(arr); //[[I
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		System.out.println(arr[2][0]);
		System.out.println(arr.getClass().getName());
		System.out.println(arr.getClass().getSuperclass().getName());
		System.out.println(arr.length); //r no
		System.out.println(arr[2].length); // c no of oth row
		
	}
	public static void main(String args[]) {
		
		
	int arr[][]; //arr dec
	arr = new int[3][4]; //def val 0
	arr[1][1] = 90;
	
	float floatArray[][] = { {34,56,78},
							 {123,78,9},
							{1}
							};
	toSeeMultiDimDetails(floatArray);
	
	//jagged --> with uneven col / diff col
	
	int array[][] = new int[4][];
	
	array[0] = new int[5];
	array[1] = new int[2];
	array[2] = new int[3];
	array[3] = new int[6];
	
	array[0][1] = 90;
	}
}