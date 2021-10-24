package classencp;

public class Employee {
	private int basesalary;  // Fields
	private String name;
	private int hourlyrate;
	private int hourlywage;

	public void setName(String name) {
		// obj.setName("nishant")
		this.name = name;
	}

	public String getName() {
		// new variable name <- private(name)
		return name;
	}

}


/*
	class
	obj (instance) <-> main
	class
	obj2(instance) <-> main
*/