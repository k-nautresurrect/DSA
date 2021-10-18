import java.util.*;
import java.io.*;


class IO {
	public static PrintStream output = new PrintStream(System.out);
	public static Scanner input = new Scanner(System.in);
}

public class Palndrme extends IO {
	public static void main(String[] args) {
		int n = input.nextInt();
		/*
			1. dgt of no
			2. 123 != 321 => 3*10^2 + 2*10^1 + 1*10^0 rev*10
			3. 3 -> 3no.
			4. comparison
		*/
		int rev = 0, tmp = n;
		while (tmp != 0) {
			int dgt = tmp % 10;
			rev = rev * 10 + dgt;
			output.println(rev);
			tmp /= 10;
		}
		if (rev == n) {
			output.println("palindrome");
		} else {output.println(0);}
	}
}