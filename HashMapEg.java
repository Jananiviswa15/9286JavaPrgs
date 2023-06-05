package CollectionEg;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapEg {

	public static void main(String args[]) {
		HashMap<Integer, String> hashmap = new HashMap();
		hashmap.put(1, "dinesh");
		hashmap.put(1, "dinesh");
		hashmap.put(190, "supriya");
		hashmap.put(9, "kavitha");
		hashmap.put(19, "adithya");
		
		HashMap<Integer, String> hashmap1 = new HashMap();
		hashmap1.put(1, "savitha");
		hashmap1.put(11, "dinesh");
		hashmap1.put(170, "supriya");
	hashmap.putIfAbsent(34, "kjklh");
//		hashmap.putAll(hashmap1);
		
		System.out.println(hashmap);
		System.out.println(hashmap.entrySet());
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.values());
		System.out.println(hashmap.containsKey(34));
		System.out.println(hashmap.containsValue("hi"));
		System.out.println(hashmap.get(78));
	hashmap.remove(12);
		hashmap.remove(12, "oldvale");
		hashmap.replace(34, "new value");
		hashmap.replaceAll((key,value) -> value.toUpperCase());
		System.out.println(hashmap.size());//empty, clear
		//for each
		
		LinkedHashMap< Integer, String> linkedMapEg = new LinkedHashMap<Integer, String>();
		linkedMapEg.put(12, "kia");
		linkedMapEg.put(90, "maruti");
	}
}
