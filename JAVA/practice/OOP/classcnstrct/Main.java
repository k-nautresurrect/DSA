package classcnstrct;

/*
	- this
	- class
	- object kaise bnta
	- constrct
	- constrct (parameter)
	- overloading
	- polymorphism //method overloading -> //constrctr overloading

*/

/*
	+------+
	| car  | -> thing <- class
	+------+
	| ster | -> instance <-- making a object of car.
	| eng  |
	+------+
	| t()  |
	| s()  |
	+------+

	java.lang.Object <- bydefault. toString();
	csv ->
*/

public class Main {
	public static void main(String[] args) {
		// Human nishant = new Human();
		// things at right -> of that type obj is created
		var nishant = new Human();
		var ashwani = new Human();
		nishant.traits();
		nishant.printTraits();
		// nishant.traits("nasedi, javastudy");
		// nishant.printTraits();
		System.out.println(nishant.toString());
		System.out.println(nishant.hashCode());
		System.out.println(ashwani.toString());
		// var i = new Integer();
	}
}