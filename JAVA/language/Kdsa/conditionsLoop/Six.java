import java.util.*;

public class Six {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n = arg.nextInt();
		int max = Integer.MIN_VALUE;
		while (n != 0) {
			if (n > max) { max = n; }
			n = arg.nextInt();
		}
		System.out.println(max);
	}
}