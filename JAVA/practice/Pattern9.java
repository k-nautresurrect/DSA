/*
	for n = 5

	*               *  14  7
	* *           * *  10  5
	* * *       * * *  6   3
	* * * *   * * * *  2   1
	* * * * * * * * *

*/

public class Pattern9 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int nst = 2;
		int nsp = (2 * n - 1) - 2;

		//rows
		for (int row = 1; row <= n; row++) {

			//work for star
			for (int cst = 1; cst <= nst / 2; cst++) {
				out.print("* ");
			}
			// work for spaces
			for (int csp = 1; csp <= nsp; csp++) {
				out.print("  ");
			}
			//work for star
			if (row == n) {
				for (int cst = 1; cst <= nst / 2 - 1; cst++) {
					out.print("* ");
				}
			} else {
				for (int cst = 1; cst <= nst / 2 ; cst++) {
					out.print("* ");
				}
			}

			//prep
			if (row != n ) {
				nst += 2;
				nsp = (2 * (n - row) - 1) - 2;
			}
			out.println();
		}
	}
}