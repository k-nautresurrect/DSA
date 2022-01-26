/*

	for n = 5

	 	         1
	          2  3  4
	       5  6  7  8  9
	   10 11 12 13 14 15 16
	17 18 19 20 21 22 23 24 25
*/

public class Pattern12 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int value = 1;
		int nsp = n - 1;
		int nvl = 1;

		for (int row = 1; row <= n; row++) {
			for (int csp = 1; csp <= nsp; csp++) {
				if (row <= n - 1) {
					out.print("   ");
				} else {
					out.print("  ");
				}
			}
			for (int cvl = 1; cvl <= nvl; cvl++) {
				if (value < 10) {
					out.print(value + "  ");

				} else {
					out.print(value + " ");
				}

				value++;
			}
			nsp--;
			nvl = 2 * row + 1;
			out.println();
		}
	}
}