import java.util.*;
import java.io.*;


class IO {
	public static PrintStream output = new PrintStream(System.out);
	public static Scanner input = new Scanner(System.in);
}

public class Trlfac extends IO {
	public static void main(String[] args) {
		int n = input.nextInt();
		int fac = 1;
		output.println(trlfac(n));

		/*
			1. n! = n*n-1*n-2*...*1
			2. multiply till 1.
		*/
		for ( ; n != 1; ) {
			fac *= n;
			n--;
		}
		/*
			1. last dgt
			3. last dgt = 0
			2. last dgt == 0 ,cnt++

			1. if dgt mod 10 -> 0 cnt++, else -> break
		*/
		int cnt = 0;
		while (fac != 0) {
			int dgt = fac % 10;
			if (dgt == 0) { cnt++;  }
			else { break; }
			fac /= 10;
		}
		output.println(cnt);
	}

	static int trlfac(int n) {
		/*
			1. 4 = 4 * 3 * 2 * 1
			2. 10 = 10 x 9 x 8 x 7 x 6 x 5 x 4!
			3. if there is any multiple of 5 then 0++.
			4. 5 -> 10  ==> 10/5 = 2.
		*/
		int cnt = 0;
		for (int i = 5; i <= n; i *= 5) {
			cnt += n / i;
		}
		return cnt;
	}
}