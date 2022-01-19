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
		for (int i = 1; i <= n + 1; i++) {
			for (int j = n; j >= upn - i; j--) {
				out.print(j + " ");
			}

			if (i == upn) {
				for (int ex = 1; ex <= n; ex++) {
					out.print(ex + " ");
				}
			}

			if (i != upn) {
				for (int sp = 2 * (upn - i ) - 1; sp >= 1; sp--) {
					out.print("  ");
				}
				for (int st = upn - i; st <= n; st++) {
					out.print(st + " ");
				}
			}

			out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int st = n; st >= i; st--) {
				out.print(st + " ");
			}

			for (int sp = (2 * i) - 1; sp >= 1; sp--) {
				out.print("  ");
			}
			for (int str = i; str <= n; str++) {
				out.print(str + " ");
			}
			out.println();
		}
	}
}