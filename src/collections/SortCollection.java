package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(40);
		list1.add(10);
		list1.add(50);
		list1.add(30);
		list1.add(20);
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ramesh", 70000, 1002));
		empList.add(new Employee("Suresh", 90000, 1001));
		empList.add(new Employee("Naresh", 80000, 1003));
		
		
		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpName()));
		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + " "+ eachEmp.getSalary()));
		
//		Comparator<Employee> comp = new Comparator<>() {
//			@Override
//			public int compare(Employee emp1, Employee emp2) {
//				if(emp1.getSalary() > emp2.getSalary())
//					return 0;
//				else
//					return -1;
//			}
//		};
		
//		Comparator<Employee> comp = (emp1, emp2)-> {
//				if(emp1.getSalary() > emp2.getSalary())
//					return 0;
//				else
//					return -1;
//			};
//		
//		
//		Collections.sort(empList,comp);
		
		Collections.sort(empList);
		
		System.out.println("--------------------------------------");
		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + " "+ eachEmp.getSalary()));
		
		

	}

}
