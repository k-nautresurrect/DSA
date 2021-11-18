import java.util.*; // after this we can use anything in util package
import java.io.*;

/*
	In java the Scope is mainly defined by the
	instance variable, class variable and the variable
	whose value is passed through
	however
	in java package is very similar to namespace
	and it is just accessed by . operator
*/

public class VarNScope {
	int a = 10;
	static int b = 80;
	final int c = 50;

	public static void main(String[] args) {
		int a = 12;

		// System.out.println(a + b);
		/*
			non-static variable a cannot be referenced
			from a static context
		*/

		System.out.println(a + b);  //static can be accessed by static members only
		// System.out.println(c);   // same with final members

		// sumab(); // same error as above because of static

		Scanner in = new Scanner(System.in); // scanner is a class in util package.

		/*
			if not imported on the first line the access to scanner will be
			done with the help of . operator as :
		*/

		java.util.Scanner arg = new java.util.Scanner(System.in);
	}

	int sumab() {
		return a + b + c;  // here as it is not static it can access both b and a
	}

}