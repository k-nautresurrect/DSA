/*
	* maintain count and number of stars in star pattern

	for an int pattern n = 5

	* * * * *
	* * * *
	* * *
	* *
	*
*/

public class Pattern3 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		// number of stars
		int nst = n;

		// rows
		for (int row = 1; row <= n; row++) {

			// work
			for (int cst = 1; cst <= nst; cst++) {
				out.print("* ");
			}

			//prepration
			nst--;
			out.println();
		}
	}
}