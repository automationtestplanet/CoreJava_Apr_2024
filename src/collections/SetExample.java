package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set set1 = new HashSet();

		set1.add(true);
		set1.add(100);
		set1.add('A');
		set1.add(100000L);
		set1.add(100.5F);
		set1.add(100.546E35D);
		set1.add("Hello");
		set1.add(new ListExample());
		set1.add(100);

		System.out.println(set1);

		for (Object eachObj : set1)
			System.out.println(eachObj);

		Set linkedHashSet1 = new LinkedHashSet();

		linkedHashSet1.add(true);
		linkedHashSet1.add(100);
		linkedHashSet1.add('A');
		linkedHashSet1.add(100000L);
		linkedHashSet1.add(100.5F);
		linkedHashSet1.add(100.546E35D);
		linkedHashSet1.add("Hello");
		linkedHashSet1.add(new ListExample());
		linkedHashSet1.add(100);
		
		System.out.println(linkedHashSet1);
		
		
		Set treeSet = new TreeSet();
		
		treeSet.add(100);
		treeSet.add(500);
		treeSet.add(300);
		treeSet.add(200);
		treeSet.add(400);
		
		System.out.println(treeSet);
		
		Set treeSet2 = new TreeSet();
		
		treeSet2.add('C');
		treeSet2.add('A');
		treeSet2.add('D');
		treeSet2.add('B');
		treeSet2.add('E');		
		
		System.out.println(treeSet2);
		
		Set treeSet3 = new TreeSet();
		
		treeSet3.add("Carrot");
		treeSet3.add("Banana");
		treeSet3.add("Apple");
		treeSet3.add("Mango");
		treeSet3.add("Grape");
		treeSet3.add("Pineapple");
		
		System.out.println(treeSet3);
		
		
		
	}

}
