import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		if (n % 2 == 0) { System.out.println("is Even"); }
		else { System.out.println("is Odd"); }

		isevenodd(n);
	}

	static void isevenodd(int n) {
		if ((n & 1) == 1) { System.out.println("is odd"); }
		else { System.out.println("is even"); }
	}
}