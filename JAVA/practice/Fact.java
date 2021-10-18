import java.util.*;
import java.io.*;


class IO {
	public static PrintStream output = new PrintStream(System.out);
	public static Scanner input = new Scanner(System.in);
}


public class Fact extends IO {
	public static void main(String[] args) {
		int n = input.nextInt();
		int fac = 1;
		/*
			1. n! = n*n-1*n-2*...*1
			2. multiply till 1.
		*/
		output.println(facr(n));

		for ( ; n != 1; ) {
			fac *= n;
			n--;
		}
		output.println(fac);
	}

	static int facr(int n) {
		if (n == 0)
			return 1;
		int r = facr(n - 1) * n;
		output.println(r);
		return r;
	}
}