package inheritance;

public class Faculty extends Student{

	public String facutyName;
	public String subject;

	public Faculty(String facutyName, String subject) {
		this.facutyName = facutyName;
		this.subject = subject;
	}
	
	public Faculty() {
		
	}
	
	void displayFacultyDetails() {
		displayCollegeDetails();
		System.out.println(facutyName);
		System.out.println(subject);
	}

}
