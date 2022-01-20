package Main;

public class Instructor extends User {
	private double salary;

	public Instructor(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
