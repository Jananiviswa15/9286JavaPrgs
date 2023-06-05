package CollectionEg;

import java.util.Map.Entry;
import java.util.TreeMap;

//k, v
//key --> cant be null, it cant be dup
//val -> can be dupli
public class Map {
	
	public static void main(String args[]) {
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(12, "janani");
		map1.put(12, "janani31"); //dup key
		map1.put(13, "janani");
		map1.put(19, "srilatha");
		map1.put(20, "bargavi");
		
//		System.out.println(map1);
//		
		TreeMap<Integer, String> map12 = new TreeMap<Integer, String>();
		map12.put(1, "janani");
		map12.put(2, "ravi"); //dup key
		map12.put(3, "dev");
		map12.put(1, "priya");
		map12.put(2, "supriya");
		
//		System.out.println(map12);
//		
//		map1.putAll(map12);
//		System.out.println(map1);
		
//		System.out.println(map12.size());
//		map1.clear();
//		System.out.println(map12.isEmpty());
//		System.out.println(map12.keySet());
//		System.out.println(map12.values());
		
//		System.out.println(map12.containsKey(12));
//		System.out.println(map12.containsValue("supriya"));
//		
//		System.out.println(map12.get(12));
//		System.out.println(map12.firstEntry()); //k,v
//		System.out.println(map12.lastEntry()); //k,v
//		System.out.println(map12.firstKey());
//		System.out.println(map12.lastKey());
//		//System.out.println(map12.pollFirstEntry()); remove and return
//		System.out.println(map12.pollLastEntry());
//		System.out.println(map12);
//		System.out.println(map12.lowerKey(6));
//		System.out.println(map12.higherKey(1));
//		System.out.println(map12.higherEntry(1));
//		System.out.println(map12.lowerEntry(5));
		
		map12.replace(1, "jskhdjhsd");
		map12.replace(3, "dev", "new val");
	//	map12.replaceAll(value -> value.toUpperCase());
		
		
	System.out.println(map1.entrySet());
//			
//		
//		for(Entry<Integer, String> map : map1.entrySet())
//			System.out.print(map.getKey() + map.getValue());
//		
//		System.out.println(map1.remove(12)); //key , val
//		System.out.println(map1.remove(12, "janani"));
//		
		System.out.println(map1.headMap(19));
		System.out.println(map1.tailMap(19));
		System.out.println(map1.subMap(13, 19));
		System.out.println(map1.descendingKeySet());
		System.out.println(map1.descendingMap());
		
		
	}

}
