/*
	              1
	            1 2 1
               1 3 3 1
              1 4 6 4 1
*/

public class PascalTriangle extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int cnstval = 1;
		int val = 1;
		int prev = 1;
		int nvl = 1;

		for (int row = 1; row <= n; row++) {

			out.print("1 ");
			for (int cst = 1; cst <= nvl - 1; cst++) {
				out.print("* ");
			}
			out.print("1");

			nvl++;
			out.println();
		}
	}
}