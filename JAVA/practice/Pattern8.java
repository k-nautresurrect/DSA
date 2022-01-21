/*
	for any int n = 7

	      *
	    * * *
	  * * * * *
	* * * * * * *
	  * * * * *
	    * * *
	      *

*/

public class Pattern8 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int nst = 1;
		int nsp = n / 2;

		//row
		for (int row = 1; row <= n; row++) {

			//work
			for (int csp = 1; csp <= nsp; csp++) {
				out.print("  ");
			}
			for (int csp = 1; csp <= nst; csp++) {
				out.print("* ");
			}

			//prep
			if (row <= (n / 2)) {
				nst = 2 * row + 1;
				nsp--;
			} else {
				nst = 2 * (n - row - 1) + 1;
				nsp++;
			}
			out.println();
		}

	}
}