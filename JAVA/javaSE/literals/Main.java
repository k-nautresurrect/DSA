/**
 * 	-> Literals are the constant value in the program
 * 	-> Literals also have the Data Type
 *  -> the datatype in literals are
 *
 * normal DT |  Literal
 * 		byte | 	  int
 * 		short|	  int
 * 		int  |    int
 * 		Long |    l or L
 * 	  Double |    d or D
 *     float | 	  f or F
 *     char  |    ''
 * 	 Boolean |    true/false
 * */
package literals;

import io.IO;

public class Main extends IO {
	public static void main(String[] args) {

		// normal data types
		byte b = 10; // valid
		short sh = 17; // valid
		int i = 86;  // valid
		long ln = 125; // valid till in range of int

		// long lng = 999999999999; // not valid without specifying the literal
		long lng = 999_999_999_999l; // now it is valid

		// simillarly
		// float f = 92.56; // by default it is double so invalid
		float f = 92.36f; //valid
		double db = 89.9908; // can be suffix by d or not as bydefault this literal is double.


		/**
		 * java can store literals in 4 formats
		 * -> Decimal
		 * -> Binary
		 * -> Octal
		 * -> Hexadecimal
		 *
		 * */

		int i1 = 10; // decimal
		int i2 = 0b01010; // binary
		int i3 = 012; // octal
		int i4 = 0xA; // hexa decimal x or X

		String endl = "\n";

		out.println(i1 + endl + i2 + endl + i3 + endl + i4);
	}
}