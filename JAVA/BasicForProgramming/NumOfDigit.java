import java.util.*;
import java.io.*;

public class NumOfDigit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int temp = n, count = 0;

		while (temp != 0) {
			count ++;
			temp /= 10;
		}
		System.out.println(count);

		System.out.println(countn(n));
		System.out.println(countopt(n));
	}

	static int countn(int n) {
		if (n / 10 == 0) {
			return 1;
		}
		return 1 + countn(n / 10);
	}

	static int countopt(int n) {
		return (int)Math.log10(n) + 1;
	}
}