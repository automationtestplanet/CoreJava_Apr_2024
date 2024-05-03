package inheritance;

public class Student extends College{
	
	public String sName;
	public long rollNo;
	public String qualification;
	
	public Student(String sName, long rollNo, String qualification) {
		this.sName = sName;
		this.rollNo = rollNo;
		this.qualification = qualification;
	}
	
	public Student() {
		
	}

	
	void displayStudentDetails() {
		displayCollegeDetails();
		System.out.println(sName);
		System.out.println(rollNo);
		System.out.println(qualification);
	}

}
