import java.util.*;

public class Five {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n, sum = 0;
		n = arg.nextInt();
		while (n != 0) {
			sum += n;
			n = arg.nextInt();
		}
		System.out.println(sum);
	}
}