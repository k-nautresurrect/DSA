import java.util.*;

public class Twelve {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n = arg.nextInt();
		int p = arg.nextInt();
		int num = n;
		while (p > 1) {
			n = n * num;
			p--;
		}
		System.out.println(n);

		// power using recursion.
	}
}