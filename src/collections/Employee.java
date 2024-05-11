package collections;

public class Employee implements Comparable<Employee>{
	
	String empName;
	long salary;
	int empCode;
	
	public Employee(String empName, long salary,int empCode) {
		this.empName = empName;
		this.salary = salary;
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public long getSalary() {
		return salary;
	}

	public int getEmpCode() {
		return empCode;
	}

	@Override
	public int compareTo(Employee emp1) {
		if(emp1.getSalary() < this.getSalary())
			return 0;
		else
			return -1;
	}

}
