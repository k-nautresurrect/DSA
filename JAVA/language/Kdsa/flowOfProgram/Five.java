import java.util.*;

public class Five {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);
		char n = '0';
		// System.out.println((int)n);
		int sum = 0;
		// n.toLowerCase();
		while (true) {
			n = arg.next().charAt(0);
			if (Character.toLowerCase(n) == 'x') { break; }
			else { sum += Character.getNumericValue(n); }
		}
		System.out.println(sum);
	}
}