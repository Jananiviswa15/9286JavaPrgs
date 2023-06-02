package CollectionEg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HAshSetEG {

	public static void main(String args[]) {
		//		Set<String> myHashSet = new HashSet<String>();

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("hi");
		hashSet.add("hello");
		hashSet.add("hello");
		hashSet.add("hello123");

		ArrayList<String> arrList = new ArrayList();

		arrList.add("janani");
		arrList.add("janani");
		arrList.add("kavitha");
		arrList.add("jostna");
		arrList.add("anusha");
		hashSet.addAll(arrList);
		//add all set
	//	System.out.println(hashSet);
		//itr (no desc itr), enchanced for loop
		//size , empty , clear , contains
	//	System.out.println(hashSet.remove("janani"));
		
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("hi");
		linkedSet.add("hello");
		linkedSet.add("hello");
		linkedSet.add("hello123");
		
		LinkedHashSet<String> linkedSet1 = new LinkedHashSet<String>();
		linkedSet1.add("hi");
		linkedSet1.add("hello");
		linkedSet1.add("hello");
		linkedSet1.add("hello123");
		linkedSet1.add("good");
		//linkedSet.addAll(linkedSet1); union
		
		//linkedSet.retainAll(linkedSet1); inter
		linkedSet1.removeAll(linkedSet);//  diff
		System.out.println(linkedSet1);
		
		
		
	}
}
