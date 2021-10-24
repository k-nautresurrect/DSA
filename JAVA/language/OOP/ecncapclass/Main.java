package ecncapclass;

public class Main {
	public static void main(String[] args) {
		// print the wages

		var emp1 = new Employee();
		// what if salary is -1...

		// setSalary and check it internally
		emp1.setSalary(20_000);

		//how do we get salary
		int salary = emp1.getSalary();
		System.out.println(salary);

		// emp1.basesalary = 50_000;
		// emp1.hourlyrate = 20;

		emp1.setHourlyRate(80);
		System.out.println(emp1.getHourlyWage());
		int wage = emp1.calculateWage(80);
		System.out.println(wage);

	}
}