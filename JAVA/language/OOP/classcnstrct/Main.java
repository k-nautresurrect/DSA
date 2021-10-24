package classcnstrct;

public class Main {
	public static void main(String[] args) {
		// empployee constructor.
		var emp1 = new Employee(50_000, 80);
		// what if emp1 doesn,t work in a month so
		// calWage can be 0 or create calWage()
		// prefer not to overload.
		int empwage = emp1.calWage(30);
		System.out.println(empwage);
		System.out.println(emp1.getSalary());

		var emp2 = new Employee(30_000, 90);
		System.out.println(emp2.calWage());

		var emp3 = new Employee(20_000);
		System.out.println(emp3.calWage());

		System.out.println(Employee.numberOfEmployee);
	}
}