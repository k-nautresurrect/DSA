/*
	*				->0
    *  *			->2
    *    *			->4
    *      *
    *        *
    *          *
    *            *
    *              *
    * * * * * * * * *
*/

public class Pattern13 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int nst = 1;
		int nsp = 0;

		for (int row = 1; row <= n; row++) {

			if (row == 1) {
				out.print("*");
			} else {
				for (int cst = 1; cst <= nst; cst++) {
					out.print("* ");
				}
			}
			if (row < n) {
				for (int csp = 1; csp <= nsp; csp++) {
					out.print(" ");
				}
			}
			if (row == n) {
				for (int i = 0; i < (n - 2); i++) {
					out.print("* ");
				}
			}
			if (row > 1) {
				for (int cst = 1; cst <= nst; cst++) {
					out.print("*");
				}
			}

			if (row != n - 1) {
				nsp = 2 * (row) - 1;
			}

			out.println();
		}
	}
}