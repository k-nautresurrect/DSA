import java.util.*;

public class Seven {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n = arg.nextInt();
		int fac = 1;

		// recursion

		while (n != 0) {
			fac *= n;
			n--;
		}
		System.out.println(fac);
	}
}