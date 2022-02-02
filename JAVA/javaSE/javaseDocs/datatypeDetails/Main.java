package datatypeDetails;


/**
 * Write a description of class Main here.
 *
 * @author (k-nautresurrect)
 * @version (0.0.1)
 */
import io.IO;
import java.text.DecimalFormat; // useful in seting precision

public class Main extends IO {
	public static void main(String[] args) {
		String ln = "\n";

		// integer is stored in binary
		int a = 5;
		int unsA = -5; // 2's complement with signed bit.

		out.println(Integer.toBinaryString(a) + ln + Integer.toBinaryString(unsA));

		// float is stored as mantissa and acsissa in hexCode
		float fl = 98.786f; // due to strictly typed.
		int flInt = Float.floatToIntBits(fl);

		out.println(Float.toHexString(fl));
		out.println(Integer.toBinaryString(flInt));
		out.println(Float.intBitsToFloat(flInt));

		// Double is also stored as the same as float
		double db = 87.6758;
		long dbInt = Double.doubleToLongBits(db);
		DecimalFormat fr = new DecimalFormat(".000000");
		/**
		 *  working of DecimalFormat.
		 *
		 *
		 * */

		out.println(Double.toHexString(db));
		out.println(Long.toBinaryString(dbInt));
		out.println(Double.longBitsToDouble(dbInt));
		out.println(fr.format(db));

		// for charecter

		char ch = 'a';

		out.println((int)ch);

	}
}