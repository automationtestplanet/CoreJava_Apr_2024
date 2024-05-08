package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map map1 = new HashMap();

		map1.put("First Name", "J");
		map1.put("Last Name", "RAM");
		map1.put("Full Name", "J RAM");
		map1.put("Qualification", "B.Tech");
		map1.put("Age", "23");

		System.out.println(map1.get("First Name"));
		System.out.println(map1.get("Full Name"));
		map1.put("Company", null);
		map1.put(null, "Gandhi Nagar");

		System.out.println(map1);
		
		map1.put("Company", "Infosys");
		
		System.out.println(map1);

		System.out.println(map1.containsKey("First Name"));
		System.out.println(map1.containsKey("first name"));

		System.out.println(map1.containsValue("23"));

		System.out.println(map1.keySet());

		System.out.println(map1.values());

		Map linkedHashMap1 = new LinkedHashMap();

		linkedHashMap1.put("First Name", "J");
		linkedHashMap1.put("Last Name", "RAM");
		linkedHashMap1.put("Full Name", "J RAM");
		linkedHashMap1.put("Qualification", "B.Tech");
		linkedHashMap1.put("Age", "23");
		
		System.out.println(linkedHashMap1);
		
		Map treeMap1 = new TreeMap();

		treeMap1.put("First Name", "J");
		treeMap1.put("Last Name", "RAM");
		treeMap1.put("Full Name", "J RAM");
		treeMap1.put("Qualification", "B.Tech");
		treeMap1.put("Age", "23");
		
		System.out.println(treeMap1);
		
		Map hashTable = new Hashtable();
		hashTable.put("First Name", "J");
		hashTable.put("Last Name", "RAM");
		hashTable.put("Full Name", "J RAM");
		hashTable.put("Qualification", "B.Tech");
		hashTable.put("Age", "23");
//		hashTable.put("Company", null);  // not allowed
//		hashTable.put(null, "Gandhi Nagar"); // not allowed
		
		System.out.println(hashTable);
		

	}

}
