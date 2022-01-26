/*
	for n = 5

		    1
	      2 2 2
	    3 3 3 3 3
	  4 4 4 4 4 4 4
	5 5 5 5 5 5 5 5 5

*/

public class Pattern11 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int value = 1;
		int nsp = n - 1;
		int nvl = 1;

		for (int row = 1; row <= n; row++) {
			for (int csp = 1; csp <= nsp; csp++) {
				out.print("  ");
			}
			for (int cvl = 1; cvl <= nvl; cvl++) {
				out.print(value + " ");
			}

			nsp--;
			value++;
			nvl = 2 * row + 1;
			out.println();
		}
	}
}