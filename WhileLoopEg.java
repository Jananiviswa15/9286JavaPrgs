package ConditionalPrg;

public class WhileLoopEg {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int sum = 0;
		int ctr = 0;	 //opt
		while(ctr < arr.length ) {
			sum += arr[ctr]; //100
			ctr++;

		}
		
		System.out.println(sum);
		System.out.println((float)sum / arr.length);

//		for(int ctr1 = 0; ctr1 < arr.length; ctr1++) { //3
//			sum += arr[ctr1]; //100
//		}
//		System.out.println(sum);
//		System.out.println((float)sum / arr.length);
	}

}
