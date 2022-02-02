package intro;

import io.IO;

/**
 * Write a description of class Main here.
 *
 * @author (k-nautresurrect)
 * @version (0.0.1)
 */
public class Main extends IO
{
    public static void main(String[] args) {
		System.out.println("Hello World!");
		out.print("this is from io");

		int n =  in.nextInt();
		out.println(in.nextInt()); // this will return the integer.
		out.println(in.hasNext()); // just check wether input is there in inputStream
		out.println(in.hasNextInt()); // takes input and then check on it.

    }
}
