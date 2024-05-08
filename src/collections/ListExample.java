package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(true);
		list.add(100);
		list.add('A');
		list.add(100000L);
		list.add(100.5F);
		list.add(100.546E35D);
		list.add("Hello");
		list.add(new ListExample());
		list.add(100);

		System.out.println(list.get(0));
		System.out.println(list.get(1));

		System.out.println(list);

		int int1 = (int) list.get(1);

//		int int2 = (int)list.get(6);

		System.out.println(list.contains(100));

		list.add(2, 1);

		System.out.println(list);

		List list2 = list;

		System.out.println(list.equals(list2));

		System.out.println(list.size());

		for (Object eachObj : list) {
			System.out.println(eachObj);
		}

		System.out.println(list.isEmpty());

		System.out.println(list.indexOf(100));

		List subList = list.subList(3, 6);

		System.out.println(subList);

		List linkedList = new LinkedList();

		linkedList.add(true);
		linkedList.add(100);
		linkedList.add('A');
		linkedList.add(100000L);
		linkedList.add(100.5F);
		linkedList.add(100.546E35D);
		linkedList.add("Hello");
		linkedList.add(new ListExample());
		linkedList.add(100);
	}

}
