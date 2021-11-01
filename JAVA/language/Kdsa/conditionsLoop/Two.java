// 0 1 1 2 3 5

import java.util.*;

public class Two {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n = arg.nextInt();
		int a = 0, b = 1, fib = 0;

		while (n > 0) {
			System.out.println(fib);
			fib = a + b;
			b = a;
			a = fib;
			n--;
		}
	}
}