package ecncapclass;

public class Employee {
	// public int basesalary;
	private int basesalary;

	private int hourlyrate;
	// public int hourlyrate;

	public int calculateWage(int extrahours) {
		return basesalary + (hourlyrate * extrahours);
	}

	public void setHourlyRate(int hourwage) {
		if (hourwage <= 0) {
			throw new IllegalArgumentException("these rate cannot be 0 or less.");
		}
		this.hourlyrate = hourwage;
	}

	public int getHourlyWage() {
		return hourlyrate;
	}

	public void setSalary(int salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Salary cannot be 0 or less.");
		}
		this.basesalary = salary;
	}

	public int getSalary() {
		return basesalary;
	}
}