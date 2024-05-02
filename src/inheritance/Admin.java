package inheritance;


public class Admin extends Faculty {

	public String adminName;
	
	public Admin(String adminName) {
		this.adminName = adminName;
	}
	
	public Admin() {
		
	}
	
	void displayAdminDetails() {
		displayCollegeDetails();
		System.out.println(adminName);
	}
	
	public static void main(String[] args) {
		Admin admin1 = new Admin("Admin1");		
		admin1.displayAdminDetails();		
		admin1.displayFacultyDetails();		
		admin1.displayStudentDetails();		
		admin1.displayCollegeDetails();
		
//		admin1.displayOfficeStaffDetails();
	}
}
