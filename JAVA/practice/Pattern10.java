/*
	for n = 5

            1
          1 1 1
        1 1 1 1 1
	  1 1 1 1 1 1 1
	1 1 1 1 1 1 1 1 1

*/

public class Pattern10 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int value = 1;
		int nvl = 1;
		int nsp = n - 1;

		// rows
		for (int row = 1; row <= n; row++) {

			//work for spaces
			for (int csp = 1; csp <= nsp; csp++) {
				out.print("  ");
			}

			//work for value
			for (int cvl = 1; cvl <= nvl; cvl++) {
				out.print(value + " ");
			}

			//prep
			nsp--;
			nvl = (2 * row) + 1;
			out.println();
		}
	}
}