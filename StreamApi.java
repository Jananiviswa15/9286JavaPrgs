import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//stream api, colletion , io api , concurrency api
//lot of data , collection of objects
public class StreamApi {
	//parallelstream --> multi thread
	public static void main(String ars[]) {
		List<Integer> myFavNum = Arrays.asList(12,8,23,45,12,3,4,2,90);
		//System.out.println(myFavNum.stream().count());
		//myFavNum.stream().forEach(val -> System.out.print(val+" "));
		//	List sortedList = (ArrayList<Integer>) myFavNum.stream().sorted().collect(Collectors.toList());
		//	Set mySortedSet = (Set) myFavNum.stream().sorted().collect(Collectors.toSet());
		//		int count = (int) myFavNum.stream().sorted().count();
		//		System.out.println(count);
		//		List newList = myFavNum.stream().map(val -> val + 5).collect(Collectors.toList());
		//		System.out.println(newList);

		//		List newList = myFavNum.stream().map(val -> val + 5).sorted().collect(Collectors.toList());
		//		System.out.println(newList);

		//		List newList = myFavNum.stream().filter(val -> val % 2 == 0).sorted().collect(Collectors.toList());
		//		System.out.println(newList);

//		String nameArr[] = {"hi", "hi", "hello", "all", "hatch"};
//List<String> nameList = Arrays.asList(nameArr);
//		int count = (int) nameList.stream().filter(name -> name.startsWith("h")).count();
//		List newList = nameList.stream().filter(name -> name.startsWith("h")).sorted().collect(Collectors.toList());	
//		System.out.println(newList + "    " +count);
		

//Set nameSet = nameList.stream().filter(name -> name.startsWith("h")).sorted().collect(Collectors.toSet());
//System.out.println(nameSet);
		
		//total --> 12
		int sum = myFavNum.stream().filter(val -> val % 2 == 0).reduce(0,( total,  val) -> total+val);
			System.out.println(sum);
//			
//			List newList =	myFavNum.stream().filter(val -> val < 30).collect(Collectors.toList());
//			System.out.println(newList);
	}
}