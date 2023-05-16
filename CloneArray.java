
public class CloneArray {

	public static void main(String args[]) {
		int arr[] = {90,78,67,78,90};
		
		int copiedArr[] = new int[arr.length];
		copiedArr[0] = arr[0];
		copiedArr[1] = arr[1];
		copiedArr[2] = arr[2];
		copiedArr[3] = arr[3];
		copiedArr[4] = arr[4];
		
		System.out.println(copiedArr[4]);
		
		
		int arrayByClone[] = copiedArr.clone();
		System.out.println(arrayByClone[4]);
		
		//== on PDT chks val
		//== NPDT chks fr adrs
		
		System.out.println(arrayByClone[0] == copiedArr[0]); //tr
		System.out.println(arrayByClone);
		System.out.println(copiedArr);
		System.out.println(arrayByClone == copiedArr); //false
		
		int array[][] = {{34,56,78},
				 {123,78,9},
				{1}};
		
		int multiDimCloneArr[][] = array.clone();
		System.out.println(multiDimCloneArr[2][0]);
		
		System.out.println(multiDimCloneArr == array);
		System.out.println(multiDimCloneArr[0] == array[0]);
		
		array[0][0] = 100;
		System.out.println(multiDimCloneArr[0][0]);
	}
}
