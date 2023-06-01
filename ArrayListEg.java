package CollectionEg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	public static void main(String args[]) {
		ArrayList<String> arrList = new ArrayList();
		arrList.add("janani");
		arrList.add("janani");
		arrList.add("kavitha");
		arrList.add("jostna");
		arrList.add("anusha");
		
		
		arrList.add(1, "kalpes");
		System.out.println(arrList);
		
		ArrayList<String> arrList1 = new ArrayList();
		arrList1.add("hi");
		arrList1.add("hi");
		arrList.addAll(arrList1);
		System.out.println(arrList);
		arrList.addAll(3,arrList1);
		
		System.out.println(arrList.isEmpty());
		System.out.println(arrList.size());
		arrList.remove(0);
		arrList.remove("hi");
		//arrList.clear();
	//	arrList.removeAll(arrList1);
		
		System.out.println(arrList);
		System.out.println(arrList.contains("janani"));
		System.out.println(arrList.get(2));
		arrList.set(1, "swathi");
		System.out.println();
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(12);  //12 12 12 
		intList.add(12);
		intList.add(12);
		
		
		Iterator<Integer> itr = intList.iterator();
		for(; itr.hasNext();) {
			System.out.print(itr.next());
		}
	/*
	 * short arr[] = {45,56,34,34};
	 * for(int ctr = 0; ctr < arr.leng; ctr++)
	 * sysout arr[ctr]
	 * for(short val : arr)
	 * sysout val
	 */
	 
		//for each 
		for(Integer value : intList)
			System.out.print(value +" ");
		
	}
}
