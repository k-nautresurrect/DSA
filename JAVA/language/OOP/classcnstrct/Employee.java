package classcnstrct;

public class Employee {
	private int basesalary;
	private int hourlyrate;
	private int hourlywage;
	// static members will be same throughout the class
	public static int numberOfEmployee;

	public Employee(int basesalary, int hourlyrate) {
		setSalary(basesalary);
		setHourlyRate(hourlyrate);
		numberOfEmployee++;
	}

	public Employee(int basesalary) {
		setSalary(basesalary);
		numberOfEmployee++;
	}

	public static void getNoOfEmployee() {
		System.out.println(numberOfEmployee);
		new Employee(10_000).calWage();
	}

	private void setSalary(int salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Salary is 0 or less.");
		}
		this.basesalary = salary;
	}

	private void setHourlyRate(int hrrate) {
		if (hrrate <= 0) {
			throw new IllegalArgumentException("Rate is 0 or negative");
		}
		this.hourlyrate = hrrate;
	}

	public int getSalary() {
		return basesalary;
	}

	public int calWage(int extrahours) {
		return basesalary + ( hourlyrate * extrahours );
	}

	public int calWage() {
		return calWage(0);
	}
}