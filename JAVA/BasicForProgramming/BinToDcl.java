import java.util.*;
import java.io.*;

public class BinToDcl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int no = 0, p = 1;
		int temp = n;

		while (temp > 0) {
			int dgt = temp % 10;
			no += dgt * p;
			p *= 2;
			temp /= 10;
		}

		System.out.println(no);
		dcltobin(n);
	}

	static void dcltobin(int n) {

		while (n > 0) {
			System.out.print(n % 2);
			n = n / 2;
		}
		System.out.println();
	}
}