package datatype;

import io.IO;
import java.text.DecimalFormat;
/**
 * Write a description of class Main here.
 *
 * @author (k-nautresurrect)
 * @version (0.0.1)
 */
public class Main extends IO
{
    public static void main(String[] args) {

		// integral default (0)
		byte b = in.nextByte();
		short sh = in.nextShort();
		int i = in.nextInt();
		long lg = in.nextInt();


		//using wrapper classes (deprecated)
		/*Byte by = new Byte(in.nextByte());*/
		/*var byt = new Byte(in.nextByte());*/ // java 10


		// Floating
		float f = in.nextFloat();
		double db = in.nextDouble();

		// Char
		char ch = in.next().charAt(0); // only takes the first element of the string

		// Boolean
		Boolean bool = true;


		// output
		out.println(b + " " + Byte.MAX_VALUE);
		out.println(sh + " " + Short.MAX_VALUE);
		out.println(i + " " + Integer.MAX_VALUE);
		out.println(lg + " " + Long.MAX_VALUE);
		DecimalFormat df = new DecimalFormat("#.00");
		out.println(df.format(f) + " " + Float.MAX_VALUE); // how to add trailing zeros after decimal
		out.println(db + " " + Double.MAX_VALUE);
		out.println(ch + " " + Character.MAX_RADIX);
		/*out.println(by.MAX_VALUE);*/
    }
}
