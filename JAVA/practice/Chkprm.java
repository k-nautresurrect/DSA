public class Chkprm extends IO {
	public static void main(String[] args) {
		/*
			divided by 1 and self

			n = 13
			1 <...> 13

			boolean

			1. loop from 2 to n - 1
			2. if any no divide n -> break
			3. prime.
		*/

		int n = input.nextInt();
		// int i;
		// for (i = 2; i < n; i++) {
		// 	if (n % i == 0) {
		// 		break;
		// 	}
		// }
		// // i = 13
		// if (i >= n) { output.println(true); }
		// else { output.println(false); }

		//O(n)

		/*
			intializtion -
			maintainence - invariant (check ) -> result
			termination  - how does loop exit -> result, second invarient.
		*/

		/*
			2,3 - only prime number which appear consecutively
			6*n+1 or 6*n-1 = no.

			17 = 6 * 3 -1
			29 = 6 * 5 -1
			O(1)
		*/
		/*		if (n == 2 || n == 3)
					output.println(true);
				else if ((n - 1) % 6 == 0 || (n + 1) % 6 == 0) {
					output.println(true);
				} else {
					output.println(false);
				}*/
		// O(sqrt(n))
	}
}