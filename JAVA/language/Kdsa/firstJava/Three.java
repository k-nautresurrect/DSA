import java.util.*;

public class Three {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int p = arg.nextInt();
		int r = arg.nextInt();
		int t = arg.nextInt();

		System.out.println((p * r * t) / 100);
	}
}