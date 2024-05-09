package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollections {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
//		list1.add("30");
		list1.add(40);
		
		System.out.println(list1);		
//		int i = (int)list1.get(2); // Class Cast exception		
//		System.out.println(i);
		
		Set<String> set1 = new HashSet<>();
		set1.add("Apple");
		set1.add("Banana");
//		set1.add(10);
		
		
		Map<String, Object> map1 = new HashMap<>();
		
//		map1.put(10, 10); // ot allowed
		
		map1.put("FirstName", "R");
		map1.put("LastName", "Ram");
		map1.put("Age", 23);
		map1.put("Phone Number", 9876543210L);

	}

}

