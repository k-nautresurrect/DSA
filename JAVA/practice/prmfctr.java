public class prmfctr extends IO {
	public static void main(String[] args) {
		/*
			input n
			prime factor of n

			12 -> 6 -> 3 -> 1
			2 2 3

			1. loop from 2 to num.
			2. chck itrator if(prime or not)
			3. print i, n/i reduce till n is divisible by i

		*/
		int n = input.nextInt();
		for (int i = 2; i < n; i++) {
			if (isprime(i)) {
				int x = i;
				while (n % x == 0) {
					output.println(i);
					x = x * i;
				}
			}
		}

	}

	static boolean isprime(int n) {
		int i;
		for (i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}