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
		/*
			25 - (1,25), (5,5), !(25,1).
				  ^  ^
				  x  y
			if x and  is a factor of num
			x * y = num  ---> 1 25

			x is a itrator = init 2
			if x is smaller than y  -> itreator y-1 { x ==> y-1 } x++
			x * x =< num ---> 1 * 1 < 25, 5 * 5 = 25  ----> (situation)
			x^2 <= num
			x <= √num

			--> the factor which can result in other situation than this is already taken
			--> it is mandatory that x is smaller than y

			1 -> prime or compiste
			1 is neither prime nor composite
		*/
		/*
			output -> boolean ,true,false
			chck if there is any other no than i which will divide n


			1. n -> input
			2. loop from 2 to x^2 <= n, updating x++
			3. if terminated completly then prime.
			4. else not prime.
		*/
		/*		int i; // y -> n
				for (i = 2; i * i <= n; i++) {
					output.println("i is " + i);
					output.println("i^2 is " + i * i);
					if (n % i == 0) {
						break;
					}
				}
				if (i * i > n) {
					output.println(true);
				} else {
					output.println(false);
				}*/

		/*
			2,3 -> consecutive

			2* 3* 4* 5 6** 7 8* 9* 10*
			11 12** 13 14* 15* 16* 17
			18** 19 20* 21* ..... √n.

			multiple of 2 occur only ones in between multiple of 3
			initial condition will be at 5
			difference between remaining no. is either 1 , 3.
			updation 6.
			n%i ==0 , n%(i+2) == 0

		*/

		int i;
		if (n % 2 == 0) { output.println(false); }
		else if (n % 3 == 0) { output.print(false); }
		else {
			for (i = 5; i * i <= n; i = i + 6) {
				output.println("i " + i);
				output.println("i+2 " + (i + 2));
				if (n % i == 0 || n % (i + 2) == 0) {
					break;
				}
			}
			if (i * i > n) { output.println(true); }
			else { output.println(false); }
		}

	}
}