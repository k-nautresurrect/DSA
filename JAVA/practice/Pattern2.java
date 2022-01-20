/*
	- keep track of thhe times the loop is running

	for any int n

	*
	* *
	* * *
	* * * *
	* * * * *

*/

public class Pattern2 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();

		// numbers of stars
		int nst = 1;

		for (int row = 1; row <= n; row++) {
			//work

			// count of stars
			/*
				int cst = 1;
				while (cst <= nst) {
					out.print("* ");
					cst++;
				}
			*/
			for (int cst = 1; cst <= nst; cst++) {
				out.print("* ");
			}

			// prepration
			nst++;
			out.println();
		}
	}
}