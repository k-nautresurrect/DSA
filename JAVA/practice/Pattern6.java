/*
	for any int n = 5, the pattern is.

	*
	* *
	* * *
	* * * *
	* * * * *
	* * * *
	* * *
	* *
	*
*/

public class Pattern6 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int nst = 1;
		int nrow = 2 * n - 1;

		// rows
		for (int rows = 1; rows <= nrow; rows++) {

			// work
			if (rows <= nrow / 2) {
				for (int cst = 1; cst <= nst; cst++) {
					out.print("* ");
				}
				// prep
				nst++;

			} else {
				for (int cst = nst; cst >= 1; cst--) {
					out.print("* ");
				}
				//prep
				nst--;
			}

			//prep
			out.println();
		}
	}
}