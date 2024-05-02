package inheritance;

public class College {

	public static final String COLLEGE_NAME = "MLR College";
	public static String collegeLocation = "Hyderabad";
	public static String university = "Osmania University";
	private static String collegCode = "1001"; 

	void displayCollegeDetails() {
		System.out.println(COLLEGE_NAME);
		System.out.println(collegeLocation);
		System.out.println(university);
	}
}
