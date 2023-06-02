package CollectionEg;

import java.util.ArrayDeque;

public class ArrayDequeueEg {

	public static void main(String args[]) {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.add("hi");
		queue.add("hi1");
		queue.add("hi");
		queue.add("hi1");
		queue.offer("hello"); 
		
		queue.addFirst("evev");
		queue.addLast("hello");
		queue.offerFirst("bye");
		queue.offerLast("ice");
		
		//queue.remove(); //removes frst elem
//queue.remove("hi1");
//queue.removeFirst();
//queue.removeLast();
		
		queue.removeIf(name -> name.contains("hi"));
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollLast());
		System.out.println(queue.poll());

		System.out.println(queue);
	}
}
