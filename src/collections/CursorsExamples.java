package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CursorsExamples {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(true);
		list.add(100);
		list.add("");
		list.add(100000L);
		list.add(100.5F);
		list.add("");
		list.add("Hello");
		list.add("");
		list.add(100);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}		

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

		Iterator setItr = set1.iterator();

		while (setItr.hasNext()) {
			System.out.println(setItr.next());
		}
		

		ListIterator listItr = list.listIterator();
		
		if(listItr.hasNext()) {
			System.out.println(listItr.next()); 
		}
		
		if(listItr.hasPrevious()) {
			System.out.println(listItr.previous()); 
		}
		
		
		Enumeration em =  Collections.enumeration(set1);
		
		while (em.hasMoreElements()) {
			System.out.println(setItr.hasNext());
		}
	}

}
