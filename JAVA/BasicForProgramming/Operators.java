import java.util.*;
import java.io.*;

public class Operators {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out);

		int a = in.nextInt(), b = in.nextInt();
		/*
			Operators
				- Airthmetic
				- logical
				- bitwise *
				- relational
				- Assignment
				- others
		*/

		// Airthematic
		out.println(a + b);
		out.println(a - b);
		out.println(a * b);
		out.println(a / b);
		out.println(a % b);

		// increment Decrement
		out.println(a++);  // print then increment
		out.println(a--);
		out.println(--a);  // decrease then print
		out.println(++a);

		// Relational
		out.println(a < b);
		out.println(a > b);
		out.println(a == b);
		out.println(a != b);

		// Logical
		/*out.println(a && b);*/  // in java there is no truthy and falsy list
		/*out.println((boolean)a && (boolean)b);*/ // but only true and false identity
		// int cannot be converted to boolean
		out.println(true && true);
		out.println(true && false);
		out.println(false || false);
		out.println(!true);

		// Assignment
		out.println(a = b);  // assigned then printed
		out.println(a += b);
		out.println(a -= 1);
		out.println(a *= b);
		out.println(a /= b);
		out.println(a %= b);
	}
}