package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEg1 {
public static void main(String args[]) {
	
	TreeSet<String> treeSetEg = new TreeSet<String>();
	TreeSet<String> treeSetEg1 = new TreeSet<String>();
	treeSetEg.add("hi");
	treeSetEg.add("hi");
	treeSetEg.add("hi1");
	treeSetEg.add("hi1");
	treeSetEg.add("hi2");
	treeSetEg.add("appple");
//	TreeSet obj = new TreeSet<E>();
	
//	System.out.println(treeSetEg);
	System.out.println(treeSetEg.contains("appple"));
	System.out.println(treeSetEg.first());
	System.out.println(treeSetEg.last());
	
	System.out.println(treeSetEg.higher("hi"));
	System.out.println(treeSetEg.lower("hi1"));
	
	System.out.println(treeSetEg.pollFirst());
	System.out.println(treeSetEg.pollFirst());
	System.out.println(treeSetEg);
	
	System.out.println(treeSetEg.remove("hi1"));
	treeSetEg.add("hi");
	treeSetEg.add("ajay");
	treeSetEg.add("akshatha");
	treeSetEg.add("welcome");
	//treeSetEg.add(null);
	System.out.println(treeSetEg.descendingSet());
	
//	System.out.println(treeSetEg.size());
//	System.out.println(treeSetEg.isEmpty());
//	treeSetEg.clear();
	
	//12 13 45 67
	
	treeSetEg1.add("hi");
	treeSetEg1.add("hi");
	treeSetEg1.add("hi1");
	treeSetEg1.add("jack fruit");
	treeSetEg.addAll(treeSetEg1);
	System.out.println(treeSetEg);
	
	//for enchaced, iterator
	
	System.out.println(treeSetEg.headSet("hi2"));
	System.out.println(treeSetEg.subSet("akshatha", "hi2"));
	System.out.println(treeSetEg.tailSet("hi1"));
	
	
}
}
