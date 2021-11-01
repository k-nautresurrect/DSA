import java.util.*;

public class Nine {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n = arg.nextInt();
		int avg = 0, sum = 0, i = 1;
		while (i <= n) {
			sum += i;
			avg = sum / n;
			i++;
		}
		// System.out.println(sum);
		System.out.println(avg);
	}
}