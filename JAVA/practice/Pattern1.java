/*
	for an int n = 5

	* * * * *
	* * * * *
	* * * * *
	* * * * *
	* * * * *
*/

public class Pattern1 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();

		for (int row = 1; row <= n; row++) {

			//work
			for (int col = 1; col <= n; col++) {
				out.print("* ");
			}

			//prepration
			out.println();
		}
	}
}