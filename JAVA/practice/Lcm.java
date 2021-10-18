public class Lcm extends IO {
	public static void main(String[] args) {
		int a = input.nextInt();
		int b = input.nextInt();

		/*
			max -> mulltiple

			12,15  ->
			60

			1. max(a,b)
			2. itreate till max
			3. the no which divide both
			4. output

			1 sec  -> O(10^8) operation

			1e8 , 1e9 ,1e6.
		*/
		output.println((a * b) / gcd(a, b));

		int max = Math.max(a, b);
		while (true) {
			if (max % a == 0 && max % b == 0) {
				break;
			}
			max++;
		}
		output.println(max);
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}