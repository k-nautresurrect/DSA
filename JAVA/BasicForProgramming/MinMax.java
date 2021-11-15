import java.util.*;

public class MinMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2 = in.nextInt();

		if (n1 > n2) { System.out.println(n1); }
		else { System.out.println(n2); }

		// taking input as a list

		int a = in.nextInt();
		int max = a;   // if bounds are not known.
		int stop = Integer.MAX_VALUE;
		while (a < stop) {
			if (max >= a) { max = a; }
			a = in.nextInt();
		} // the main diffrence between java and c++ is
		/*
			java will throw exception rather than automatically
			terminate program, as when overflowed in c++
			the previous value is pointed but in java it is not possible*
		*/
		System.out.println(max);
	}
}