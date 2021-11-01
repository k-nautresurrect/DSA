import java.util.*;

public class Four {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);
		int a = arg.nextInt();
		int b = arg.nextInt();

		int min = Math.min(a, b);
		int hcf = 0;
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
		System.out.println((a * b) / hcf);

		int reminder = 1;
		int mul = a * b;
		while (reminder != 0) {
			reminder = a % b;
			a = b;
			b = reminder;
		}
		System.out.println(a);
		System.out.println(mul / a);
	}

	//byrecursion
}