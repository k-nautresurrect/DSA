import java.util.*;

public class Three {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int n = arg.nextInt();
		int sm = 0, mul = 1, dgt = 0;


		for (int i = n; i != 0; i = i / 10) {
			sm += i % 10;
			mul *= i % 10;
		}

		System.out.println(mul - sm);

	}
}