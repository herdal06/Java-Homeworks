package Main;

public class Student extends User {
	private String schoolNumber;

	public Student(int id, String firstName, String lastName, String schoolNumber) {
		super(id, firstName, lastName);
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
}
