/*
	for any number n make a pattern as:


    5                   5   <- 18 9 2*n - 1
    5 4               4 5   <- 14 7
    5 4 3           3 4 5   <- 10 5
    5 4 3 2       2 3 4 5   <- 6  3
    5 4 3 2 1   1 2 3 4 5   <- 2  1
    5 4 3 2 1 0 1 2 3 4 5
    5 4 3 2 1   1 2 3 4 5   <- 2  1
    5 4 3 2       2 3 4 5   <- 6  2
    5 4 3           3 4 5   <- 10 3
    5 4               4 5   <- 14 4
    5                   5   <- 18 5

	constraints n should be positive number.
*/

public class Day1Ques2 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();

		int upn = n + 1;
		//1st print star for 1st quater(rows)
		for (int i = 1; i <= n + 1; i++) {

			// columns for 1st quater
			for (int j = n; j >= upn - i; j--) {
				out.print("* ");
			}

			// loop for extra numbers in between
			if (i == upn) {
				for (int ex = 1; ex <= n; ex++) {
					out.print("* ");
				}
			}

			// column loop for spaces between (cols) and 2nd quator
			if (i != upn) {
				for (int sp = 2 * (upn - i ) - 1; sp >= 1; sp--) {
					out.print("  ");
				}
				for (int st = upn - i; st <= n; st++) {
					out.print("* ");
				}
			}

			out.println();
		}

		// 2nd half rows
		for (int i = 1; i <= n; i++) {

			// column
			for (int st = i; st <= n; st++) {
				out.print("* ");
			}

			// spaces between quators
			// 1 2 3 4 5
			// 1 3 5 7 9
			for (int sp = (2 * i) - 1; sp >= 1; sp--) {
				out.print("  ");
			}

			// loop for 4th quator
			for (int str = i; str <= n; str++) {
				out.print("* ");
			}

			out.println();
		}
	}
}