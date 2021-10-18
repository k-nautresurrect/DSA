/*
	Java is object oriented but not full object oriented
	in java there are several things that are inherited
	from cpp namely primary data types and several conventions
	this lead java to be partially object oriented.
	scala is still used by many and is fully OO.

	here we trhy to do things in full oop way but it is not
	best practice
*/
import java.util.*;
import java.io.*;


public class PartialOOP extends IO {
	public static void main(String[] args) {
		output.println("Namaste World");
		Integer a = new Integer(10);
		Integer b = 10;
		output.println(Integer.MAX_VALUE);
		output.println(Integer.MIN_VALUE);
		output.println(Integer.SIZE);

		Operation op = new Operation();
		output.println(op.conversion(b) + 1);
	}
}


class IO {
	public static PrintStream output = new PrintStream(System.out);
	public static Scanner input = new Scanner(System.in);
}


class object extends IO {
	PartialOOP obj = new PartialOOP();
}

//operation on Integer class int
class Operation {
	public String conversion(Integer a) {
		return Integer.toString(a);
	}
}