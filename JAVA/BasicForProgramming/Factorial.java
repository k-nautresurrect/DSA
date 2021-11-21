import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int fac = 1, i = 1;
		while (i <= n) {
			fac *= i;
			i++;
		}
		System.out.println(fac);
		System.out.println(fact(n));
	}

	static int fact(int n) {
		if (n == 1) { return 1; }
		return fact(n - 1) * n;
	}
}