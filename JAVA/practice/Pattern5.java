/*
	for an int 5

	* * * * *
	  * * * *
	    * * *
	      * *
	        *
	the pattern should be like up
*/

public class Pattern5 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		// for spaces
		int nsp = 0;
		int nst = n;

		//rows
		for (int row = 1; row <= n; row++) {

			// work

			// for space
			for (int csp = 1; csp <= nsp; csp++) {
				out.print("  ");
			}
			// for star
			for (int cst = 1; cst <= nst; cst++) {
				out.print("* ");
			}

			//prepration
			nsp++;
			nst--;
			out.println();

		}
	}
}