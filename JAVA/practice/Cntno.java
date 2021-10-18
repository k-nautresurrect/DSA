import java.util.*;
import java.io.*;

class IO {
	public static PrintStream output = new PrintStream(System.out);
	public static Scanner input = new Scanner(System.in);
}

public class Cntno extends IO {
	public static void main(String[] args) {
		int n = input.nextInt();
		// while 1.initialization
		// 2.stoppage condition
		// 3. updation
		output.println(countrec(n));
		output.println(Math.floor(Math.log10(n)) + 1 );
		int cnt = 0;
		while (n != 0) {
			cnt++;
			n /= 10;
		}
		output.println(cnt);
	}

	static int countrec(int n) {
		if (n == 0)
			return 0;
		return (1 + countrec(n /= 10));
	}


	/*
		n = 0  -> 0
		n = 2  -> 1
		n = 5  -> 2
		n = 6  -> 3
		n = 4  -> 4
	*/
}

