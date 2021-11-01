package classcnstrct;

public class Human {
	// Fields.
	// constrctr
	// methords public
	// methords - private
	// getter, setter.

	private int legs = 2;
	private int hands = 2;
	private String traits = "";

	public Human(String traits) {
		this.traits = traits;
		System.out.println(this.traits);
	}

	public Human() {
		System.out.println("Traits not found");
	}

	/*
		obj <- field <-trigger
		this -> jo instance humne create kiya h
		        uska field triger krdo
	*/

	public void traits() {
		this.traits(" 0");
	}
	public void traits(String traits) {
		this.traits = traits;
	}

	public void printTraits() {
		System.out.println(this.traits);
	}

}
