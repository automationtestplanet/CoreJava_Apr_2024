package inheritance;

public class OfficeStatff extends Faculty {

	public String officeStaffName;

	public OfficeStatff(String officeStaffname) {
		this.officeStaffName = officeStaffname;
	}

	public OfficeStatff() {

	}

	void displayOffieStaffDetails() {
		displayCollegeDetails();
		System.out.println(officeStaffName);
	}
	
	public static void main(String[] args) {
		OfficeStatff officeStaff1 = new OfficeStatff("OfficeStaff1");		
		officeStaff1.displayOffieStaffDetails();		
		officeStaff1.displayFacultyDetails();		
		officeStaff1.displayStudentDetails();		
		officeStaff1.displayCollegeDetails();
		
//		officeStaff1.displayAdminDetails();
	}

}
