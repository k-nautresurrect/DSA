/*
	print the pattern for n with n no.of star

	*
	*
	*
	*

	n = 4
*/
import java.util.Scanner;
public class Pattern0 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int row = 1; row <= n; row++) {
			//work
			System.out.print("*");
			//preparation
			System.out.println();
		}
	}
}