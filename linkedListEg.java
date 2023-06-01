package CollectionEg;

import java.util.Collections;
import java.util.LinkedList;

public class linkedListEg {

	public static void main(String args[]) {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("dskjff");
		llist.add("supriya");
		llist.add("supriya");
		llist.add(1,"dinesh");
		
		
		LinkedList<String> llist1 = new LinkedList<String>();
		llist1.add("dskjff");
		llist1.add("supriya");
		llist1.add(1,"dinesh");
		
//		llist.addAll(llist1);
//		llist.addAll(2,llist1);
//		System.out.println(llist);
//		llist.remove();  //first elem 
//		//llist.removeFirst();
//		llist.remove(1);
//		llist.remove("supriya");
//		llist.removeFirstOccurrence("supriya");
//		llist.removeLastOccurrence("supriya");
//		llist.removeLast();
//	System.out.println(llist);
//		System.out.println(llist.size());
//		System.out.println(llist.isEmpty());
//		llist.clear();
		
		System.out.println(llist.contains("ganesh"));
		System.out.println(llist.set(1, "update existing val"));
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		System.out.println(llist.get(0));
		
		Collections.sort(llist);
		llist.addFirst("i am first");
		llist.addLast("i am last");
		
	}
}
