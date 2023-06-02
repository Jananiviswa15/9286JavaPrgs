package CollectionEg;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String args[]) {
		
//		Set<Integer> treeSet = new TreeSet();
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("hi");
		treeSet.add("hi");
		treeSet.add("hi1");
		treeSet.add("hi2");
		treeSet.add("hi all");
		
		TreeSet<String> treeSet1 = new TreeSet<String>();
		treeSet1.add("apple");
		treeSet1.add("apple");
		treeSet1.add("hi");
		treeSet1.add("water melon");
		
		treeSet.addAll(treeSet1);
		
		
	//	System.out.println(treeSet);
		//iterator   Iterator itr = list/set.iterator();
		//for each
//		System.out.println(treeSet.size());
//		System.out.println(treeSet.isEmpty());
//		treeSet.clear();
//		System.out.println(treeSet.contains("apple"));
//		System.out.println(treeSet.first());
//		System.out.println(treeSet.last());
		
//		System.out.println(treeSet.pollFirst());
//		System.out.println(treeSet.pollLast());
//		System.out.println(treeSet.higher("hi"));
//		System.out.println(treeSet.lower("hi1"));
		
//		System.out.println(treeSet1.remove("apple"));
//		System.out.println(treeSet1);
//		Iterator itr = treeSet1.descendingIterator();
//		for(; itr.hasNext();)
//			System.out.println(itr.next());
//	
		
		System.out.print(treeSet);
		System.out.println(treeSet.subSet("hi", "hi2"));
		System.out.println(treeSet.tailSet("hi1"));
		System.out.println(treeSet.headSet("hi1"));
	}
}
