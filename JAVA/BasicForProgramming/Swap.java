import java.util.*;

public class Swap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt(), n2 = in.nextInt();

		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println(n1 + " " + n2);
		swap(n1, n2);
		System.out.println(n1 + " " + n2);

	}

	static void swap(int n1, int n2) {  // we cannot pass by refrence in java
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println(n1 + " " + n2);
	}
}