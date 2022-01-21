/*
	* try to put prep in if else not work

	for an int n = 7

	* * *   * * *
	* *       * *
	*           *

	*           *   -> 5
	* *       * *	-> 3
	* * *   * * *   -> 1

*/

public class Pattern7 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int nst = n / 2;
		int nsp = 1;

		// rows
		for (int row = 1; row <= n; row++) {

			//work
			for (int cst = 1; cst <= nst; cst++) {
				out.print("* ");
			}
			for (int csp = 1; csp <= nsp; csp++) {
				out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				out.print("* ");
			}

			//prep
			if (row <= n / 2) {
				nst--;
				nsp = 2 * row + 1;
			} else {
				nst++;
				nsp = 2 * (n - row - 1) + 1;
			}
			out.println();

		}
	}
}