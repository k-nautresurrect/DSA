/*
	* Keep track of cursor and how it prints

	for any int n = 5

	        *
	      * *
	    * * *
	  * * * *
	* * * * *
*/

public class Pattern4 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		// number of spaces
		int nsp = n - 1;
		int nst = 1;

		// rows
		for (int rows = 1; rows <= n; rows++) {

			// work

			// for spaces
			for (int csp = 1; csp <= nsp * 2; csp++) {
				out.print(" ");
			}

			// for stars
			for (int cst = 1; cst <= nst; cst++) {
				out.print("* ");
			}

			//prepration
			nsp--;
			nst++;
			out.println();
		}
	}
}