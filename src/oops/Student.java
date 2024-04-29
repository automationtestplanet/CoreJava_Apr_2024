package oops;

public class Student {

	String sName;	
	long rollNo;	
	static String qualfication;	
	static String collegeName;
	
	void displayStudentDetails() {
		System.out.println("Student Name: "+ sName);
		System.out.println("Student Roll No: "+ rollNo);
		System.out.println("Student Qualifiation: "+ qualfication);
		System.out.println("Student College Name: "+ collegeName);
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.sName = "Ram";
		student1.rollNo = 1001;
		student1.qualfication = "10th Class";
		student1.collegeName = "Chaitanya";
		
		
		Student student2 = new Student();
		student2.sName = "Krish";
		student2.rollNo = 1002;
		student2.qualfication = "10th Class";
		student2.collegeName = "Chaitanya";
		
		
		
		Student student3 = new Student();
		student3.sName = "Raj";
		student3.rollNo = 1003;
		student3.qualfication = "10th Class";
		student3.collegeName = "Chaitanya";
		
		System.out.println("------------------Student1---------------------");
		student1.displayStudentDetails();
		
		System.out.println("------------------Student2---------------------");
		student2.displayStudentDetails();
		
		System.out.println("------------------Student3---------------------");
		student3.displayStudentDetails();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		student1.collegeName = "Narayana";
		student1.sName = "Ramana";
		
		
		System.out.println("------------------Student1---------------------");
		student1.displayStudentDetails();
		
		System.out.println("------------------Student2---------------------");
		student2.displayStudentDetails();
		
		System.out.println("------------------Student3---------------------");
		student3.displayStudentDetails();
		
	}

}
