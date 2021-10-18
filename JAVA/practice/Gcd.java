
public class Gcd extends IO {
	public static void main(String[] args) {
		int a = input.nextInt();
		int b = input.nextInt();
		/*
			-  1 -> greatest common divisor

			4,12

			2. smallest no
			1. itreate to no which divide both
			3. print
		*/
		int res = 1;
		if (a < b) {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 && b % i == 0) {
					res = i;
				}
			}
		} else {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 && b % i == 0) {
					res = i;
				}
			}
		}
		output.println(res);

		// O(min(a,b))
		// O(max(a,b))

		// int i = Math.min(a, b);
		/*
			12 => (1,12), (2,6), (3,4), (4,3)

			i; n/i;

			4 , 12

			a = pq + r;
			rem !=0;
			num1 % num2  => rem
			num1 = num2, num2 = rem,
		*/
		// int rem = 1;
		// while (rem != 0) {
		// 	rem = a % b;
		// 	a = b;
		// 	b = rem;
		// 	output.println(b);
		// }
		// output.println(a);
		output.println(gcdr(a, b));

	}

	static int gcdr(int a, int b) {
		if (a == 0)
			return b;
		return gcdr(b % a, a);
	}
}